// function testScope() {
//   if (true) {
//     // var x = 10;
//     // let y = 20;
//     const z = 30;
//   }
// //   console.log(x);
// //   console.log(y);
//   console.log(z);
// }
// testScope();

let fruits = ["apple", "banana", "mango"];

// 1. Add "orange" to the end.

// 2. Remove the first element.

// 3. Loop through the array and print each fruit in uppercase.

fruits[3] = "orange";

console.log(fruits);

fruits.shift();
console.log(fruits);

const upper = fruits.map(fruit => fruit.toUpperCase());
console.log(upper);