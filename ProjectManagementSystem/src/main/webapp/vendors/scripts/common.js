// employeeform
// empDeprtmt
// empStatus
// empfname
// empMName
// empLname
// empGender
// empDOB
// empNationality
// empemail
// empMobile
// empAltMobile
// empAddress
// empVillage
// empState
// empCountry
// empUsename
// empPassword
// empConPassword

// -- mandatory field is been inserted or Not (Null or black)
// -- each and every field seperate

// saveEmployee()--function call

function saveEmployee(){
    //definition and statement
    //alert("welcome");

    var empformID = document.getElementById("employeeform");



    var empDeprtmt = document.getElementById("empDeprtmt");
    var empStatus = document.getElementById("empStatus");
    var empfname = document.getElementById("empfname");
    //var empMName = document.getElementById("empMName");
    var empLname = document.getElementById("empLname");
     
    var empDOB = document.getElementById("empDOB");
    //var empNationality = document.getElementById("empNationality");
    var empemail = document.getElementById("empemail");
    var empMobile = document.getElementById("empMobile");
    //var empAltMobile = document.getElementById("empAltMobile");
    var empAddress = document.getElementById("empAddress");
    var empVillage = document.getElementById("empVillage");
    var empState = document.getElementById("empState");
    var empCountry = document.getElementById("empCountry");
    var empUsename = document.getElementById("empUsename");
    var empPassword = document.getElementById("empPassword");
    var empConPassword = document.getElementById("empConPassword");


   //check null or blank Input/select/textarea
   if(NullOrBlank(empDeprtmt,"Please enter Department")){return false;}
   if(NullOrBlank(empStatus,"Please enter Status")){return false;}
   if(NullOrBlank(empfname,"Please enter First Name")){return false;}
   if(letteronly(empfname)){return false;}
   if(NullOrBlank(empLname,"Please enter Last Name")){return false;}
   if(letteronly(empLname)){return false;}
   if(!validChkRadio('empGender','Select any one Gender')){return false;}
   
   if(NullOrBlank(empDOB,"Please enter DOB")){return false;}
   if(BirthDate(empDOB,"Date of Birth less then 18")){return false;}
   if(NullOrBlank(empemail,"Please enter Email Id")){return false;}
   if(NullOrBlank(empMobile,"Please enter Mobile")){return false;}
   if(pnumber(empMobile)){return false;}
   if(NullOrBlank(empAddress,"Please enter Address")){return false;}
   if(NullOrBlank(empVillage,"Please enter Village")){return false;}
   if(NullOrBlank(empState,"Please enter State")){return false;}
   if(NullOrBlank(empCountry,"Please enter Country")){return false;}
   if(NullOrBlank(empUsename,"Please enter Username")){return false;}
   if(NullOrBlank(empPassword,"Please enter Password")){return false;}
   if(matchpass(empPassword,empConPassword)){return false;}


   alert("Form successfully saved!!!!");


   empformID.action="add-employee.html";
   empformID.submit();

}

function saveProject()
{

var formId= document.getElementById("Project_form");
var Project_Name =document.getElementById("Project_Name");
var Client_name =document.getElementById("Client_name");
var Project_Type =document.getElementById("Project_Type");
var Project_Manager =document.getElementById("Project_Manager");
var Frontend_Technology =document.getElementById("Frontend_Technology");
var Backend_Technology =document.getElementById("Backend_Technology");
var Project_Details =document.getElementById("Project_Details");

if(NullOrBlank(Project_Name,"Please enter Project_Name")){return false;}
if(NullOrBlank(Client_name,"Please enter Client_name")){return false;}
if(NullOrBlank(Project_Type,"Please enter Project_Type")){return false;}
if(NullOrBlank(Project_Manager,"Please enter Project_Manager")){return false;}
if(NullOrBlank(Frontend_Technology,"Please enter Frontend_Technology")){return false;}
if(NullOrBlank(Backend_Technology,"Please enter Backend_Technology")){return false;}
if(NullOrBlank(Project_Details,"Please enter Project_Details")){return false;}



alert("Form successfully saved!!!!");


formId.action="add-project.html";
formId.submit();


}

function saveAssignment()
{
    var Assignment_form= document.getElementById("Assignment_form");
    var Project_Manager =document.getElementById("Project_Manager");
    var Project_Name =document.getElementById("Project_cod");
    var Assignment_date=document.getElementById("Assignment_Date");


    if(NullOrBlank(Project_Manager,"Please Select Project_Manager")){return false;}
    if(NullOrBlank(Project_Name,"Please Select Project Code")){return false;}
    if(NullOrBlank(Assignment_date,"Please Select Assignment Date")){return false;}
    if(NotPastDate(Assignment_date,"Assignment Date Should Not Be a Past Date")){return false;}


    alert("Form successfully saved!!!!");


    Assignment_form.action="add-Assignment.html";
    Assignment_form.submit();

}
function saveTicket()
{
    var Ticket_form =document.getElementById("Ticket_form");
    var Ticket_title=document.getElementById("Ticket_title");
    var Ticket_hours=document.getElementById("Ticket_hours");
    var Project_code=document.getElementById("Project_code");
    var Emp_code=document.getElementById("Emp_code");
    var Ticket_type=document.getElementById("Ticket_type");
    var Ticket_status=document.getElementById("Ticket_status");
    var Start_Date=document.getElementById("Start_Date");
    var Due_Date=document.getElementById("Due_Date");
    var Details=document.getElementById("Details");

    if(NullOrBlank(Ticket_title,"Please Enter Ticket Title")){return false;}
    if(NullOrBlank(Ticket_hours,"Please Enter Ticket Hours")){return false;}
    if(NullOrBlank(Project_code,"Please Enter Ticket Title")){return false;}
    if(NullOrBlank(Emp_code,"Please Enter Employee Code")){return false;}
    if(NullOrBlank(Ticket_type,"Please Enter Ticket Type")){return false;}
    if(NullOrBlank(Ticket_status,"Please Enter Ticket Status")){return false;}
    if(NullOrBlank(Start_Date,"Please Enter Start date")){return false;}
    if(NotPastDate(Start_Date,"Start Date Should Not Be a Past Date")){return false;}
    if(NotFucherDate(Start_Date,"Start Date Should Not Be a Future Date")){return false;}
    if(NullOrBlank(Due_Date,"Please Enter Due Date")){return false;}
    if(NotPastDate(Due_Date,"Due Date Should Not Be a Past Date")){return false;}
    if(NullOrBlank(Details,"Please Enter Ticket Details")){return false;}
    
    

    alert("Form successfully saved!!!!");


    Ticket_form.action="Add-Ticket.html";
    Ticket_form.submit();
}

function saveTimesheet()
{
    var Timesheet_form=document.getElementById("Timesheet_form");
    var emp_code=document.getElementById("emp_code");
    var project_code=document.getElementById("project_code");
    var work_Title=document.getElementById("work_Title");
    var Details=document.getElementById("Details");
    var Working_Hours=document.getElementById("Working_Hours");
    var date=document.getElementById("date");


    if(NullOrBlank(emp_code,"Please Select Employee Code")){return false;}
    if(NullOrBlank(project_code,"Please Select project Code")){return false;}
    if(NullOrBlank(work_Title,"Please Enter Work Title")){return false;}
    if(NullOrBlank(Details,"Please Enter Timesheet Details")){return false;}
    if(NullOrBlank(Working_Hours,"Please Enter Working Hours")){return false;}
    if(NullOrBlank(date,"Please Select Date")){return false};
    if(NotPastDate(date,"Date Should Not Be a Past Date")){return false;}


    alert("Form successfully saved!!!!");

    Timesheet_form.action="Add-Timesheed.html"
    Timesheet_form.submit();
}

function saveLeave()
{
    var Leave_Form=document.getElementById("Leave_Form");
    var Emp_code=document.getElementById("Emp_code");
    var Reason=document.getElementById("Reason");
    var Details=document.getElementById("Details");
    var From_Date=document.getElementById("From_Date");
    var To_Date=document.getElementById("To_Date");
    var Status=document.getElementById("Status");

    if(NullOrBlank(Emp_code,"Please Select Employee Code")){return false;}
    if(NullOrBlank(Reason,"Please Enter Reason  ")){return false;}
    if(NullOrBlank(Details,"Please Enter Details")){return false;}
    if(NullOrBlank(From_Date,"Please Select From_Date")){return false;}
    if(NotPastDate(From_Date,"From Date Should Not Be a Past Date")){return false;}
    if(NullOrBlank(To_Date,"Please Select To_Date")){return false;}
    if(NotPastDate(To_Date,"To Date Should Not Be a Past Date")){return false;}
    if(NotCronttDate(To_Date,"To Date Should Not Be a Current Date")){return false;}
    if(NullOrBlank(Status,"Please Select Status")){return false;}


    alert("Form successfully saved!!!!");

    Leave_Form.action="Add-Leave.html"
    Leave_Form.submit();

}
//Dat of Birth validation Dat of Birth less then 18
function BirthDate(elmid,alert_message)
{
    var today = new Date();
    var birthDate = new Date(elmid.value);
    var age = today.getFullYear() - birthDate.getFullYear();
    if (age<18) 
    {
        alert(alert_message);
        elmid.focus();
        elmid.style.border="1px solid red";
        return true;
    }
    else
    {
        elmid.style.border="";
        return false;
    } 
}

function NotPastDate(elmid,alert_message)
{
    var today = new Date();
    var AssinDate = new Date(elmid.value);
    var Y = AssinDate.getFullYear() - today.getFullYear();
    var M = AssinDate.getMonth()- today.getMonth();
    var D = AssinDate.getDate()- today.getDate();
    if (Y<=0 && M<=0 && D<0) 
    {
        alert(alert_message);
        elmid.focus();
        elmid.style.border="1px solid red";
        return true;
    }
    else
    {
        elmid.style.border="";
        return false;
    } 
}

function NotCronttDate(elmid,alert_message)
{
    var today = new Date();
    var AssinDate = new Date(elmid.value);
    var Y = AssinDate.getFullYear() - today.getFullYear();
    var M = AssinDate.getMonth()- today.getMonth();
    var D = AssinDate.getDate()- today.getDate();
    if (Y<=0 && M<=0 && D<=0) 
    {
        alert(alert_message);
        elmid.focus();
        elmid.style.border="1px solid red";
        return true;
    }
    else
    {
        elmid.style.border="";
        return false;
    } 
}

function NotFucherDate(elmid,alert_message)
{
    var today = new Date();
    var AssinDate = new Date(elmid.value);
    var Y = AssinDate.getFullYear() - today.getFullYear();
    var M = AssinDate.getMonth()- today.getMonth();
    var D = AssinDate.getDate()- today.getDate();
    if (Y<=0 && M<=0 && D>0) 
    {
        alert(alert_message);
        elmid.focus();
        elmid.style.border="1px solid red";
        return true;
    }
    else
    {
        elmid.style.border="";
        return false;
    } 
}


//Null or a blank checking
function NullOrBlank(elmid,alert_message){

    if(elmid.value == "" || elmid.value == null || elmid.value.length == 0){
        alert(alert_message);
        elmid.focus();
        elmid.style.border="1px solid red";
        return true;
    }else{
        elmid.style.border="";
        return false;
    } 
}
// letter only A-Z,a-z
function letteronly(elmid) {
    var letterformat = /^[A-Za-z]+$/;
    if (elmid.value.match(letterformat)) {
        elmid.style.border = "";
        return false;
    } else {
        alert("Invalid - Only Letter allowed!!");
        elmid.value = "";
        elmid.focus();
        elmid.style.border = "1px solid red";
        return true;
    }
}
//Mobile Number
function pnumber(elmid) {
    var numberformat = /^\d{10}$/;
    if (elmid.value.match(numberformat)) {
        elmid.style.border = "";
        return false;
    } else {
        alert("Enter the proper phone number");
        elmid.value = "";
        elmid.focus();
        elmid.style.border = "1px solid red";
        return true;
    }
}


function removeBorder(elmid){
    elmid.style.border="";
}

function validChkRadio(elmidName,message){//validRadio('empGender','Check any one gender!') ====empGender[i].length=2 [0,1]
    var elmid = document.getElementsByName(elmidName);//document.getElementsByName("agree")
    var j=0;


    for(var i=0 ; i < elmid.length ; i++){
        if(elmid[i].checked){//true elmid[0]=M & elmid[1]=F
            j= 1;
        }
    }

//i=0 ; 0 < 2[0<2,1<2=true(twice iterate)     ,2<2]


    if( j > 0){//anyone value will be checked 

        return true;

    }else{
        alert(message);
    }

}







function passcheck(elmid) {
    var passformat = /^(?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[^a-zA-Z0-9])(?!.*\s).{5,6}$/;
    if (elmid.value.match(passformat)) {
        elmid.style.border = "";
        return true;
    } else {
        alert("Enter the proper password!!");
        elmid.focus();
        elmid.value = "";
        elmid.style.border = "1px solid red";
        return false;
    }
}


function matchpass(Password,ConPassword) {
    var password = Password.value;
    var confirmpass = ConPassword.value;
    if (password == confirmpass) 
    {
        return false ;
    } else {
        alert("Password missmatch");
        ConPassword.focus();
        ConPassword.value = "";
        ConPassword.style.border = "1px solid red"
        return true;
    }

}


function emailcheck(elmid) {
    var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
    if (elmid.value.match(mailformat)) {
        elmid.style.border = "";
        return true;
    } else {
        alert("Enter the proper email ID!!!");
        elmid.value = "";
        elmid.focus();
        elmid.style.border = "1px solid red";
        return false;
    }
}