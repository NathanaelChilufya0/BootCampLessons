let student = {
    studentName: 'Norah',
    address: 'Lusaka',
    program: 'Computer Studies',
    subjects:[
        'Com Skills',
        'Programming'
    ]
}
let guardian = {
    guardianName: 'Tuliya Mwanza',
    phoneNumber: '099-999-9999',
    student: student
}
/*
console.log(student)
console.log(student.program)
console.log(guardian)
console.log(guardian.guardianName)
*/

let list = []
list.push(43)
list.push('Nancy')
list.push({petName: 'Chansa', petType:'dog'})
list.push(student)
list.push(guardian)

console.log(list)
/*
Task, due tomorrrow
create a simple JS object that stores names of 4 football teams 
for each football team you need country, coach, ranking, trophies
the program must display all the teams and the total worth of all 4 teams
within the team object also add a list of players
*/