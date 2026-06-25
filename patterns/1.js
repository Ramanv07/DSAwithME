// ****
// ****
// ****
// ****


// for (let i = 0; i < 4; i++) {
//     let row =""
//     for (let j = 0; j < 4; j++) {
//     row += "*";
//     }   
//     console.log(row);
    
// }


// for (let i = 0; i < 4; i++) {
//     console.log("*".repeat(4));
// }



// for (let i = 0; i < 5; i++) {
//     let row =""
//     for (let j = 5; j > i; j--) {
//     row += "*";
//     }
//     console.log(row);
// }

// for (let i = 1; i < 6; i++) {
//     let row =i +"";
//     for (let j = 1; j < i; j++) {
//     row += i;
//     }
//     console.log(row);   }

// for (let i = 1; i < 6; i++) {
//     let row =""; 
//     for (let j = 6; j > i; j--) {
//     row += j;
//     }
//     console.log(row);   }

// for (let i = 1; i < 6; i++) {
//     let row ="";
//     for (let j=0; j<i; j++){
//         row += i;

//     }
//     console.log(row);}

// for(let i = 1; i<=5; i++){
//     let row = "";
//     for (let j=1; j<=5-i+1; j++){
//         row +=j+"";
//     }   
//     console.log(row);
// }

//    *   
//   ***  
//  ***** 
// *******
// *********  
// for(let i = 0; i<5; i++){
//     let row = "";
//     for (let j=0; j<5-i-1; j++){
//         row += " ";
//     }
//     for (let k=0; k<2*i+1; k++){
//         row += "*";
//     }
//     for (let l=0; l<5-i-1; l++){
//         row += " ";
//     }
//     console.log(row);
// }




// +++++++++++++++++++++++++++++++++++
// *********
//  ******* 
//   *****  
//    ***   
//     * 

// for (let i = 0; i<5; i++){
//     let row = "";
//     for (let j=0; j<i; j++){
//         row += " ";
//     }
//     for (let k=0; k<2*5-(2*i+1); k++){
//         row += "*";
//     }
//     for (let l=0; l<i; l++){
//         row += " ";
//     }
//     console.log(row);
// }

//     *    
//    ***   
//   *****  
//  ******* 
// *********
// *********
//  ******* 
//   *****  
//    ***   
//     *  

//  for(let i = 0; i<5; i++){
//     let row = "";
//     for (let j=0; j<5-i-1; j++){
//         row += " ";
//     }
//     for (let k=0; k<2*i+1; k++){
//         row += "*";
//     }
//     for (let l=0; l<5-i-1; l++){
//         row += " ";
        
//     }console.log(row);
// }
//     for(let i = 0; i<5; i++){
//     let row = "";
//     for (let j=0; j<i; j++){
//         row += " ";
//     }
//     for (let k=0; k<2*5-(2*i+1); k++){
//         row += "*";
//     }
//     for (let l=0; l<i; l++){
//         row += " ";
//     }
//     console.log(row);
// }


// let n = 5; // number of rows
// for (let i = 1; i <= n; i++) {
//     let row = "";
//     for (let j = 1; j <= i; j++) {
//         if ((i + j) % 2 === 0) {
//             row += "1";
//         } else {
//             row += "0";
//         }
//     }
//     console.log(row);
// }


let n = 522;
let reverse = 0;
while (n > 0) {
    let lastDigit = n % 10;
    reverse = reverse * 10 + lastDigit;
    n = Math.floor(n / 10);
}
console.log(reverse);