function createClassList(){
    let name = 'Nathanael';
    let age = 19;
    program = 'Computer Studies';
    let paid = 2000;
    console.log("program is " + program);
}

function getStudentList(classId, yos, programId){
    var task ='Go to class';
    var theClass = classId;
    var level = yos;
    let programOfStudy = programId;    
    console.log("second function");
}

function calculateGrade(mark){
    if (mark>75){
        return 'A'
    }
    else{
        if(mark>65){
            return 'B'
        }
        else{
            if(mark>50){
                return 'C'
            }
        }
    }
    return 'F'
}

createClassList();
getStudentList(21,2,3);
//console.log(theClass);
//console.log(level);

//arrow functions to look learned 
const calculateGrades = (mark) =>{
    if (mark>75){
        return 'A'
    }
    else{
        if(mark>65){
            return 'B'
        }
        else{
            if(mark>50){
                return 'C'
            }
        }
    }
    return 'F'
}