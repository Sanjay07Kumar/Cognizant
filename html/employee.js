function employee(id,name,department,salary) {
    this.id = id;
    this.name = name;
    this.department = department;
    this.salary = salary;
}

const employeeDB = {};

function createEmployee(id,name,department,salary) {
    const emp = new employee(id,name,department,salary);
    employeeDB[id] = emp;
    console.log(`Employee "${name}" created successfully`);
}

function getAllEmployee() {
    const employees = Object.values(employeeDB);
    console.log("Employee Details \n");
    employees.forEach( (emp) => {
        console.log(`Name:${emp.name} , Department:${emp.department} , Salary:${emp.salary}`);
    })
}

function getEmployeeById(id) {
    if(employeeDB[id]) {
        return Object.entries(employeeDB[id]);
    }
    return `Employee with id ${id} not found`;
}

function updateEmployee(id,updateDetails) {
    if(employeeDB[id]) {
        return Object.assign(employeeDB[id],updateDetails);
    }
    console.log(`Employee with id ${id} not found`);
}

function freezeEmployee(id) {
    if(employeeDB[id] ) {
        Object.freeze(employeeDB[id]); 
        console.log(`Employee with id ${id} is now frozen. No updates allowed.`);
    } else {
        console.log(`Employee with id ${id} not found`);
    }
}

function sealEmployee(id) {
    if(employeeDB[id] ) {
        Object.seal(employeeDB[id]);
        console.log(`Employee with id ${id} is now sealed. No new properties can be added.`);
    } else {
        console.log(`Employee with id ${id} not found`);
    }
}



createEmployee(1,"Sanjay","IT",50000);
createEmployee(2,"Kumar","HR",45000);
createEmployee(3,"Nikhil","Finance",55000);
createEmployee(4,"Rooban","IT",60000);
createEmployee(5,"Praveen","HR",48000);



console.log("\n");
getAllEmployee();



console.log("\nGet Employee by ID: 3");
console.log(getEmployeeById(3));



updateEmployee(3,{department:"IT"});
console.log("\nUpdated Employee with ID: 3");
console.log(getEmployeeById(3));



console.log("\nFreezing Employee Data");
freezeEmployee(2);
employeeDB[2].salary=60000;
console.log("\nAfter Attempting to Update Frozen Employee with ID: 2");
console.log(getEmployeeById(2));



console.log("\nSealing Employee Data");
sealEmployee(4);
employeeDB[4].department="Finance";
employeeDB[4].bonus=5000;
console.log("\nAfter Attempting to Update Sealed Employee with ID: 4");
console.log(getEmployeeById(4));