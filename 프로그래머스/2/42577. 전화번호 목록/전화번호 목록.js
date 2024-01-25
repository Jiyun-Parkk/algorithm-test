function solution(phone_book) {
   let result = true;
   phone_book = phone_book.sort();
   for(let i = 0; i < phone_book.length; i++) {
       if(i < phone_book.length - 1) {
           if(phone_book[i + 1].indexOf(phone_book[i]) === 0) {
               result = false;
               break;
           }
       }
   }
   return result;
}