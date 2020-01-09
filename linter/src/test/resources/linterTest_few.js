'use strict';

console.log("linter shouldn't catch this line");
console.log("linter should catch this line")


if (1 > 2) {
    console.log("how");
} else {
    console.log("linter should catch only this line from lines 7-11")
}

linter should catch this line