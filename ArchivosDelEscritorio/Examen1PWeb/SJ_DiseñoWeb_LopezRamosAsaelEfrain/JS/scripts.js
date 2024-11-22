//!Opciones para obtener la API de peliculas 
const options = {
    method: 'GET',
    headers: {
        accept: 'application/json',
        Authorization: 'Bearer eyJhbGciOiJIUzI1NiJ9.eyJhdWQiOiI5MGE4MDA0OWVlYWU4NmUwNGNlZDFhOWNjOWMyZDZhMyIsIm5iZiI6MTczMDY5MTMwNS43MTc2MjM3LCJzdWIiOiI2NzI4MWMxNWMwOTAxMDk1ODBmOWYwMTkiLCJzY29wZXMiOlsiYXBpX3JlYWQiXSwidmVyc2lvbiI6MX0.eFAGBLGJ-8VgP6h8z4Qp_N2WoOVW1qOZ03AAr3Yft_Y'
    }
};

//!Promesa para obtener la api
const mipromesa = new Promise((resolve, reject) => {
    fetch('https://api.themoviedb.org/3/movie/popular?language=en-US&page=1', options)
    //?Mensaje de error
        .then((resp) => {
            if (!resp.ok) {
                //?Si hay algun problema mostrar error
                throw new Error('Error API');
            }
            //?Informacion en formato json
            return resp.json();
        })
        //?Resolver la promesa
        .then((data) => {
            resolve(data); 
        })
        //?Tener el error
        .catch((error) => {
            reject(error); 
        });
});

mipromesa
    .then((respuesta) => {
        //?Usar template
        const peliculas = respuesta.results; 
        const listaPeliculas = document.getElementById('listaPeliculas'); 
        const refTemplate = document.getElementById('peliculas-template'); 

        const elFragmento = document.createDocumentFragment(); //* Crear un fragmento

        //?Recorrer las peliculas para obtener la informacion de los autores 
        peliculas.forEach(peli => {
            //?Api con la informacion de los autores
            fetch(`https://api.themoviedb.org/3/movie/${peli.id}/credits?language=en-US`, options)
            .then((response)=>response.json())
            .then((nombres)=>{
                //?Obtener solo los 3 primeros autores 
                const actores = nombres.cast.slice(0,3).map(actor =>actor.name).join(", ")

                //!Clonar todo lo que representa a el template en html
                const copia = refTemplate.content.cloneNode(true); 

                //!Obtener la imagen
                copia.querySelector('img').src = `https://image.tmdb.org/t/p/w500${peli.poster_path}`; 

                //!Obtener titulo
                copia.querySelector('.card-title').textContent = peli.title; 

                //!Obtener la descripcion
                copia.querySelector('.card-text').textContent = peli.overview;

                //!Obtener los actores
                copia.querySelector('.actores').textContent = `Actores: ${actores}` 

                //!Obtener la fecha con Date, convertir a tiempo local
                const fechaLanzamienot = new Date(peli.release_date).toLocaleDateString("es-ES")
                copia.querySelector('.fecha').textContent = `Fecha lanzamiento: ${fechaLanzamienot}`

                //!Agregando copia al fragmento
                elFragmento.appendChild(copia); 

            })
            //?Manejar algun tipo de error
            .catch((error) => {
                console.log('Error:', error);
            })
        });
        //?Esperar a que se resuelva para hacer copia
        setTimeout(() => {
            listaPeliculas.appendChild(elFragmento); 
        }, 1500); 

    })
    //?Manejar algun tipo de error
    .catch((error) => {
        console.log('Error:', error); 
    })
    //?Mensaje en consola al final
    .finally(() => {
        console.log('Hecho'); 
    });
