const students=[];

function addStudents(name,mark) {
    name=name.trim().toUpperCase();
    mark= Number(mark);
    mark = mark ?? 0;
    students.push({name,mark});
}

function getGrades() {
    return students.map( (student) => {
        let grade='F';
        if(student.mark >= 90) grade='A';
        else if(student.mark >= 75) grade ='B';
        else if(student.mark >= 50) grade ='C';
        else if(student.mark >= 35) grade ='D';
        return {...student,grade};
    })
}

//topScores
function getTopScores() {
    return students.filter( (student) => student.mark >=75);
}

//findStudent
function findStudent(name) {
    return students.find( (student) => student.name===name);
}

//check Failures
function checkFailures() {
    return students.some( (student) => student.mark<35);
}

//display data
function displayAll() {
    console.log("Students Data \n");
    let graded=getGrades();
    graded.forEach( (student) => {
        console.log(`${student.name} | ${student.mark} | ${student.grade}`);
    })
    
}
addStudents("Sanjay",79);
addStudents("Kumarr",79);
addStudents("Nikhil",89);
addStudents("Rooban",94);
addStudents("Praven",79);
addStudents("Maniii",94);
addStudents("Pragaa",84);
addStudents("Rithes",90);

displayAll();
console.log("\nTop Scores");
console.log(getTopScores());
console.log("\nFind Student Kumarr");
console.log(findStudent("KUMARR"));
console.log("\nAny Failures ? ");
console.log(checkFailures() ? "Yes There are Failures" : "NO Failures");