export const getMovie = () =>{
    console.log('Regresa pelicula');
    return 'getAllMovies'
}


const urlbase = 'https://api.themoviedb.org/3/movie/550?api_key=90a80049eeae86e04ced1a9cc9c2d6a3' 


const getAllmovie = async()=>{
    const data = await fetch(urlbase);
    const resp= await data.json()
    const {resul} = resp 
}



export{
    getAllmovie
}
