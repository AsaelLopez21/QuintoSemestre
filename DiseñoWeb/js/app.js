// console.log('hola')

// //!Tipos de datos

// var nombre = 'Asael'
// var apellidos = 'Lopez'

// var nombre;

// let nombre2;
// //let nombre2;//* no puedes declarar dos variables let con el mismo nombre


// console.log(nombre+apellidos)

// let data = true

// if(data){
//     let h = 'algo'
// }
// console.log('ola');

// //?Variables constantes
// const nomb = 45
// const zte = true

// if(zte){
//     console.log('zte');
// }else if(zte===0){
//     console.log('miau');
// }
// /*
//     //*x==2
//     verifica
//     el tipo de dato
//     y el valor del dato

//     //* == se usa cuando sabes que los tipos de datos son iguales

//     //* === cuando el tipo de dato y el valor es igual
// */

// const k = 89
// const l = 89.01
// const j = [9,8,7,6,5,4]


// if(k===l){
//     console.log('Tipo de dato y valor iguales');
// }else{
//     console.log('diferentes');
// }

// let cont=0

// while(cont<6){
//     console.log(j[cont]);
//     cont++
// }
// console.log('_____________________________');

// for(let co=0;co<j.length;co++){
//     console.log(j[co]);
// }
// j.push(26)

// console.log('_____________________________');

// for(let co=0;co<j.length;co++){
//     console.log(j[co]);
// }

// console.log("5"*5);

// const opcion = 'online'
// switch (opcion) {
//     case 'online':
//         console.log('enlinea');    
//     break;

//     default:
//         console.log('fueralinea');
//     break;
// }

// const a = [7,3,6,3,56,6,4,33,77]

// //*Para cada elemento de a
// a.forEach((item)=>{  //?Item representa una variable donde se almacenan los valores de a
//     console.log('Items: ',item);
// })

// const bb = [1,1,2,12,11,1,2,3,4]
// //*Otra forma de hacerlo
// bb.forEach((item)=> console.log('Items: ',item))

//!Funciones

//?Primera forma
// function name(params,numero=4) { //*No se indica el tipo de dato
//     console.log(params);        //*Puedo llamar la funcion sin darle todos los parametro
//     console.log(numero);        //*Puedo darle parametro por defecto a la funcion
// }

// name('HOLA'.toLowerCase(),12) //*UpperCase convertir a mayuscula
//                               //*LowerCase convertiri a minuscula

// //?Segunda forma (Anonima)

// const bb = [1,1,2,12,11,1,2,3,4]

// const nombre = function(itemm){
//     console.log(('Item',itemm));
// }                              
// bb.forEach(nombre)

// //?Funciones flecha

// const functionArrow = (p1)=>{
//     console.log('p1:',p1);
// }
// console.log("____________________________");
// bb.forEach(functionArrow)

//!Objetos
// const variable = {
//     nombre: 'Apellidos',
//     apellidos:'Nombre',
//     edad:'14',
//     rols: ['admin','user','student'],
//     dir:{
//         calle: 'fre',
//         cp:'71599'
//     },
//     getEdad: function(){
//         console.log('Obteniendo edad');
//         return this.edad
//     }
// };           //*Las llaves indican que la variable va a ser un objeto
// console.log(typeof(variable)); //*Saber que tipo de dato es
// console.log(variable.getEdad());

//!Desestructurar objeto
// const {nombre,apellidos,edad,dir } = variable
// console.log(nombre,apellidos,edad,dir);

// //?Desestructurar una lista
// const numeros=[43,23,8,45,23,5]

// const [,,,,,ultimo] = numeros //*Cada coma es una posicion de la lista
// console.log(ultimo);

// const [a,b,c,d,e,f] = numeros
// console.log(a,b,c,d,e,f);

//?Respaldo de un objeto
// const resp = {
//     nombre: DataTransfer.nombre
// }
// console.log(variable);

// resp.nombre = 'Otro nombre'

// const resp ={...data}

// console.log('hola mundo');

//!Promesas
//?Reciben funcion
//*resolve es el nombre de variable si se cumplio promesa, reject si no se cumplio
// const promesa = new Promise((resolve,reject)=>{
    
//     setTimeout(()=>{
//         console.log('Resuelta');
//         //resolve('Notificando resolucion de promesa adentro del setTimeout')
//         reject('Error bien grandote')
//     },3000)

//     //resolve('Notificando resolucion de promesa')
// }) 

// promesa
//     .then((respuesta)=>{
//         console.log(respuesta);
//     })
//     .catch((error)=>{
//         console.log(error);
//     })
//     .finally(()=>{
//         console.log('finally'); //*Siempre se ejecuta el finally
//     })

// const mipromesa = new Promise((resolve,reject)=>{
//     fetch('https://dragonball-api.com/api/characters')
//     .then((resp)=>{
//         const data = resp.json()
//         resolve(data)
//         return data;
//     })
//     .catch((error)=>{
//         reject(error)
//     })
// }) 

// mipromesa
//     .then((respuesta)=>{
//         console.log('then');
//         console.log(respuesta);
//     })
//     .catch((error)=>{
//         console.log(error);
//     })
//     .finally(()=>{
//         console.log('finally'); //*Siempre se ejecuta el finally
//     })

// const getData=(p)=>{
    
//     console.log('Get data wait :)');
// }

// function eventoClick(){
//     console.log("Evento click");
// }

//?DOM: Document Model Object
const referenciaAlert = document.getElementById('alerta1') //!Hace referencia a donde se esta usando este archivo JS
referenciaAlert.addEventListener('mousemove',()=>{
    console.log('Mouse sobre la alerta');
})

