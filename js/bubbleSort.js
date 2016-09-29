// jshint node: true, esversion: 6
'use strict';

let comparisonCounter = 0;

function swap(a, b, array) {
  let temp = array[a];
  array[a] = array[b];
  array[b] = temp;
}

function sort(array) {
  let swapped = true;
  for (let i = array.length; i > 1; i--) {
    swapped = false;
    for (let j = 0; j < i-1; j++) {
      comparisonCounter++;
      if (array[j] > array[j+1]) {
        swap(j, j+1, array);
        swapped = true;
      }
    }
    if (!swapped) {
      return array;
    }
  }
  return array;
}

let arr = [8, 6, 3, 4, 2];
console.log(sort(arr));
console.log(`Comparisons: ${comparisonCounter}`);
