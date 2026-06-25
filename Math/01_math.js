
// 1. Reverse a number
let n = 522;
let reverse = 0;
while (n > 0) {
    let lastDigit = n % 10;
    reverse = reverse * 10 + lastDigit;
    n = Math.floor(n / 10);//use floor to remove the decimal part and get the integer value
    //this important because we want to update n to the remaining digits after removing the last digit
}
//console.log(reverse);

//pallindrome number
let num = 121;
let originalNum = num;//we store the original number before reversing it, so we can compare it later
let reversedNum = 0;
while (num > 0) {
    let lastdigit = num%10;
    reversedNum = reversedNum * 10 + lastdigit;
    num = Math.floor(num/10);
}
if (originalNum === reversedNum) {
    //console.log(originalNum + " is a palindrome number.");
}   else {
    //console.log(originalNum + " is not a palindrome number.");
}

//Armstrong number 
// An Armstrong number is a number that is equal to the sum of its own digits each raised to the power of the number of digits. For example, 153 is an Armstrong number because 1^3 + 5^3 + 3^3 = 153.


let number = 153;
let originalNumber = number;
let sum = 0;

while (number > 0){//we use a while loop to process each digit of the number until we have processed all digits{
    let digit = number % 10;//we get the last digit of the number using modulus operator
    sum += Math.pow(digit, 3);//we calculate the cube of the digit and add it to the sum

    number = Math.floor(number / 10);//we update number to the remaining digits after removing the last digit, so we can continue the process until we have processed all digits
}

if (originalNumber === sum) {
    //console.log(originalNumber + " is an Armstrong number.");
} else {
    //console.log(originalNumber + " is not an Armstrong number.");
}

//print all divisors of a number
let num1 = 12;
let divisors = [];
for (let i = 1; i <= num1; i++) {
    if (num1 % i === 0) {
        divisors.push(i);
    }   
}
//console.log("Divisors of " + num1 + ": " + divisors.join(", "));
//console.log(divisors);//time complexity is O(n) because we are iterating through all numbers from 1 to num1 to check if they are divisors.
//mathmetical observations can be used to optimize this process, for example we only need to check up to the square root of num1, because if num1 is divisible by any number greater than its square root, it must have a corresponding divisor that is less than the square root. This can reduce the time complexity to O(sqrt(n)).

 