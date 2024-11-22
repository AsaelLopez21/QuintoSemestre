// // const template_ref = document.getElementById('template')
// // console.log(template_ref);

// //!Referencias
// const sidenav = document.getElementById('side')
// const reftemplate = document.getElementById('plantilla') //?Referencia al documento
// //?Crear un fragmento
// const miFragmento = document.createDocumentFragment()

// const lista = ['Home','Images','Menu','Docs']

// lista.forEach( ( menu ) =>{
//     const copia = reftemplate.content.cloneNode(true); //!Clonar todo lo que representa a el template en html
//     copia.getElementById('tituloDoc').textContent = `Titulo ${menu}`;
//     copia.getElementById('unoEl').textContent = menu

//     //?Agregando copia al fragmento
//     miFragmento.appendChild(copia)
//     //?No se esta pintando en la pagina web
// })

// sidenav.appendChild(miFragmento)

// const addListeneere = () =>{
//     const menu1 = document.getElementById('home4')
//     menu1.addEventListener('click',()=>{
//         console.log('Evento click');
//     })
// }

// copia.selectorquery


// const r = document.querySelector('#template-div').textContent
// console.log(r);

//!_________________________________________________________________________________

//?Exportacion por default
//*Export default getMovie
//*import{el_nombre_que_quieras}


//?Exportacion por nombre
//?Aqui es por nombre
import {getMovie} from './fetch.js'  //!Importar un archivo de fetch


//?importar la funcion que esta en el otro archivo
console.log('importando funcion externa');

//*Usando la funcion importada
console.log(getMovie());

//!Otra dorma de importar


// import{
//     getAllmovie
// }

