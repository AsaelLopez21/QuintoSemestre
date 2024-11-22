const options = {
  method: 'GET',
  headers: {
    accept: 'application/json',
    Authorization: 'Bearer eyJhbGciOiJIUzI1NiJ9.eyJhdWQiOiI5MGE4MDA0OWVlYWU4NmUwNGNlZDFhOWNjOWMyZDZhMyIsIm5iZiI6MTczMDY5MTMwNS43MTc2MjM3LCJzdWIiOiI2NzI4MWMxNWMwOTAxMDk1ODBmOWYwMTkiLCJzY29wZXMiOlsiYXBpX3JlYWQiXSwidmVyc2lvbiI6MX0.eFAGBLGJ-8VgP6h8z4Qp_N2WoOVW1qOZ03AAr3Yft_Y'
  }
};

fetch('https://api.themoviedb.org/3/movie/popular?language=en-US&page=1', options)
  .then(res => res.json())
  .then(data => {
    console.log(data); // Muestra toda la respuesta en la consola
    const movies = data.results; // Accede a la lista de películas

    // Iterar sobre las películas y mostrar las imágenes
    movies.forEach(movie => {
      const imgUrl = `https://image.tmdb.org/t/p/w500${movie.poster_path}`; // Construye la URL de la imagen
      const imgElement = document.createElement('img'); // Crea un elemento de imagen
      imgElement.src = imgUrl; // Asigna la URL a la etiqueta img
      imgElement.alt = movie.title; // Asigna un texto alternativo
      document.body.appendChild(imgElement); // Añade la imagen al cuerpo del documento
    });
  })
  .catch(err => console.error(err));