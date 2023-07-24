function solution(people, limit) {
    people = people.sort((a,b) => b - a);
    let count = 0;
     for(let i = 0; i < people.length; i++) {
       if(people[i] + people[people.length - 1] > limit) {
           count++;
        } else {
            people.pop();
            count++;
        }
    } 
    return count;
}