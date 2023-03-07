let string = 'Fábio Henrique';

console.log(invertString(string));



function invertString(string){
    let newString = '';

    for (let i = string.length -1; i >= 0 ; i--) {
        newString =  newString + string[i];
    }

    return newString;
}

