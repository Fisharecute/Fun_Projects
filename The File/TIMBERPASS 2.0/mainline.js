//This file holds all the functions that are put into immediate effect when a button is clicked


//Come back tomorrow and implement the api without being retarted <3333333333333333333333


//idiot


var FN = undefined //first name
var LN = undefined //last name
var SI = undefined //student id
var CR = undefined //current room
var RH = undefined //room headed
var TT = undefined //time taken
var timeDeparted = undefined; //Time Departed

var divv = undefined //necessary global for 2nd wipe
var divvers = undefined //necessary global for 3rd wipe
var diavolo = undefined //necessary global for 4th wipe
var dichotomy = undefined //necessary global for 5th wipe (Please be the last one)

var gitdiv = document.getElementById("frontDiv"); //makes life easier

var hr = 0; //works with stopwatch
var min = 0; //stopwatch
var sec = 0; //stopwatch
var stoptime = true; //stopwatch

var overTen = false; //says when student is gone for more than 10 minutes

var submitAttempted = false; //when the submit button has been used

var notTea = true; //when teacher view is not in effect

//SUBMITTED

function submitted() {
  console.log("-Submit Button Pressed-")
  let gitbeddiv = document.getElementById("embeddedDivOne");
  FN = document.getElementById("inputFName").value;
  LN = document.getElementById("inputLName").value;
  SI = document.getElementById("inputID").value;
  CR = document.getElementById("inputCRoom").value;
  RH = document.getElementById("locationSelection").value;
  if (FN.length != 0 && LN.length != 0 && SI.length != 0 && CR.length != 0 && RH.length != 0) {
    document.getElementById("submitbutton").style.bottom = "5020px";
    gitbeddiv.remove();
    rebuild();
  }
  if (submitAttempted == false) {
    let lastUn = document.createElement("P");
    lastUn.innerHTML = "Please fill out all input sections!";
    lastUn.classList.add("blackText");
    lastUn.style.color = "darkred";
    lastUn.style.textDecoration = "italic";
    lastUn.style.fontWeight = "bold";
    gitbeddiv.appendChild(lastUn);
    submitAttempted += true;
  }
}

//REBUILD

function rebuild() {
  let today = new Date();
  let leftHours = today.getHours();
  let leftMinutes = today.getMinutes();
  if (leftHours < 10 || leftHours == 0) {
    leftHours = '0' + leftHours;
  }
  if (leftMinutes < 10 || leftMinutes == 0) {
    leftMinutes = '0' + leftMinutes;
  }
  timeDeparted = leftHours + ":" + leftMinutes
  switchIteration = 2
  switchout(.068, 100, "vw", true);
  setTimeout(rebuildSecondPart, 300);
  setTimeout(rebuildThirdPart, 500);
}

function rebuildSecondPart() {
    let timee = document.createElement("P");
    let title = document.createElement("H1");
    divv = document.createElement("DIV");
    timee.id = "stopwatch" 
    title.id = "rightTitle";
    title.innerHTML = "Time Spent";
    divv.id = "embeddedDivTwo";
    document.getElementById("frontDiv").appendChild(divv);
    divv.appendChild(title);
    divv.appendChild(timee);
}

function rebuildThirdPart() {
  document.getElementById("retbutton").style.left = "60px"
  switchIteration = 10
  switchout(0.920, 300, "vw", true);
  startTimer();
}

//REREBUILD

function rerebuild() {
  console.log("-Return Button Pressed-")
  switchIteration = 2
  switchout(.068, 100, "vw", true);
  setTimeout(rerebuildSecondPart, 300);
  setTimeout(rerebuildThirdPart, 500);
}

function rerebuildSecondPart() {
    document.getElementById("stopwatch").innerHTML = hr + ":" + min + ":" + sec;
    stopTimer();
    TT = document.getElementById("stopwatch").innerHTML;
    resetTimer();
    document.getElementById("retbutton").style.left = "6005px"
    divv.remove();
    divvers = document.createElement("DIV");
    divvers.id = "embeddedDivThree";
    let title = document.createElement("H1");
    title.id = "rightTitle";
    title.innerHTML = "Thank You For Filling Out The LISPASS.";
    document.getElementById("teachbutton").style.bottom = "20px";
    document.getElementById("refillbutton").style.bottom = "20px";
    document.getElementById("refillbutton").style.left = "260px";
    document.getElementById("frontDiv").appendChild(divvers);
    divvers.appendChild(title);
}

function rerebuildThirdPart() {
  switchIteration = 10
  switchout(0.920, 300, "vw", true);
}

//TOGGLETEACHER

function toggleTeacher() {
  notTea = false
  console.log("-Teacher View Button Pressed-")
  switchIteration = 2
  switchout(.068, 100, "vw", true);
  setTimeout(toggleTeacherSecondPart, 300)
  setTimeout(toggleTeacherThirdPart, 500);
}

function toggleTeacherSecondPart() {
  divvers.remove();
  TVBClicked();
}

function toggleTeacherThirdPart() {
  switchIteration = 10
  switchout(.980, 300, "vh", false);
}

//REFILL

function refill() {
  document.getElementById("LISTitle").innerHTML = "Lehman Intermediate Digital Pass"
  document.getElementById("gitTitle").innerHTML = "LISPASS"
  console.log("-Refill Button Pressed-")
  switchIteration = 2
  if (notTea == true) {
  switchout(.068, 100, "vw", true);
  buildTeachDiv();
  }
  if (notTea == false) {
    switchout(.068, 100, "vh", false);
  }
  setTimeout(refillSecondPart, 300);
  setTimeout(refillThirdPart, 500);
}

function refillSecondPart() {
  //Remove Stuff
  let reffii = document.getElementById("refillbutton");
  document.getElementById("frontDiv").appendChild(reffii);
  divv.remove();
  divvers.remove();
  document.getElementById("refillbutton").style.bottom = "5020px";
  document.getElementById("teachbutton").style.bottom = "5020px";
  document.getElementById("submitbutton").style.bottom = "5020px";
  document.getElementById("refillbutton").style.left = "20px";

  //Title
  let title = document.createElement("H1");
  title.id = "rightTitle";
  title.innerHTML = "Student Register";

  //Stupid Break and Space Section
  let grug = document.createElement("Br");
  let grugg = document.createElement("Br");
  let gruggg = document.createElement("Br");
  let grugggg = document.createElement("Br");
  let gruggggg = document.createElement("Br");
  let grugggggg = document.createElement("Br");
  let gruggggggg = document.createElement("Br");
  let grugggggggg = document.createElement("Br");
  let gruggggggggg = document.createElement("Br");
  let grugggggggggg = document.createElement("Br");
  let gruggggggggggg = document.createElement("Br");
  let grugggggggggggg = document.createElement("Br");
  let gruggggggggggggg = document.createElement("Br");
  let grugggggggggggggg = document.createElement("Br");
  let gruggggggggggggggg = document.createElement("Br");
  let bruh = document.createElement("p");
  bruh.style.display = "inline";
  bruh.innerHTML = " "
  let bruhh = document.createElement("p");
  bruhh.style.display = "inline";
  bruhh.innerHTML = " "
  let bruhhh = document.createElement("p");
  bruhhh.style.display = "inline";
  bruhhh.innerHTML = " "
  let bruhhhh = document.createElement("p");
  bruhhhh.style.display = "inline";
  bruhhhh.innerHTML = " "
  let bruhhhhh = document.createElement("p");
  bruhhhhh.style.display = "inline";
  bruhhhhh.innerHTML = " "

  //FirstName
  let timee = document.createElement("P");
  timee.classList.add("blackText");
  timee.style.display = "inline";
  timee.style.textDecoration = "underline";
  timee.innerHTML = "First Name:"

  //FirstNameInput
  let timeeInput = document.createElement("input");
  timeeInput.classList.add("inputSection");
  timeeInput.id = "inputFName";

  //LastName
  let timeee = document.createElement("P");
  timeee.classList.add("blackText");
  timeee.style.display = "inline";
  timeee.style.textDecoration = "underline";
  timeee.innerHTML = "Last Name:";

  //LastNameInput
  let timeeeInput = document.createElement("input");
  timeeeInput.classList.add("inputSection");
  timeeeInput.id = "inputLName";

  //StudentID
  let timeeee = document.createElement("P");
  timeeee.classList.add("blackText");
  timeeee.style.display = "inline";
  timeeee.style.textDecoration = "underline";
  timeeee.innerHTML = "Student ID:";

  //StudentIDInput
  let timeeeeInput = document.createElement("input");
  timeeeeInput.classList.add("inputSection");
  timeeeeInput.id = "inputID";

  //CurrentRoom
  let timeeeee = document.createElement("P");
  timeeeee.classList.add("blackText");
  timeeeee.style.display = "inline";
  timeeeee.style.textDecoration = "underline";
  timeeeee.innerHTML = "Current Room:";

  //CurrentRoomInput
  let timeeeeeInput = document.createElement("input");
  timeeeeeInput.classList.add("inputSection");
  timeeeeeInput.id = "inputCRoom";

  //HeadedRoom
  let timeeeeee = document.createElement("P");
  timeeeeee.classList.add("blackText");
  timeeeeee.style.display = "inline";
  timeeeeee.style.textDecoration = "underline";
  timeeeeee.innerHTML = "Location Headed:";

  //HeadedRoomInput
  let headroom = document.createElement("select");
  headroom.id = "locationSelection";
  let headoptionone = document.createElement("option");
  headoptionone.innerHTML = "Bathroom";
  let headoptiontwo = document.createElement("option");
  headoptiontwo.innerHTML = "Main Office";
  let headoptionthree = document.createElement("option");
  headoptionthree.innerHTML = "Nurse";
  let headoptionfour = document.createElement("option");
  headoptionfour.innerHTML = "Guidance";
  let headoptionfive = document.createElement("option");
  headoptionfive.innerHTML = "Library";
  let headoptionsix = document.createElement("option");
  headoptionsix.innerHTML = "Lockers";

  //Submit Button
  let submitbattonne = document.createElement("button");
  submitbattonne.id = "submitbutton";
  submitbattonne.style.cursor = "pointer";
  submitbattonne.addEventListener('click', submitted);
  submitbattonne.innerHTML = "Submit";

  //AppendChildren
  dichotomy = document.createElement("DIV");
  dichotomy.id = "embeddedDivOne";
  document.getElementById("frontDiv").appendChild(dichotomy);
  dichotomy.appendChild(title);
  dichotomy.appendChild(grug);
  dichotomy.appendChild(grugg);
  dichotomy.appendChild(gruggg);
  dichotomy.appendChild(grugggg);
  dichotomy.appendChild(gruggggg);
  dichotomy.appendChild(grugggggg);
  dichotomy.appendChild(gruggggggg);
  dichotomy.appendChild(timee);
  dichotomy.appendChild(bruh);
  dichotomy.appendChild(timeeInput);
  dichotomy.appendChild(grugggggggg);
  dichotomy.appendChild(gruggggggggg);
  dichotomy.appendChild(timeee);
  dichotomy.appendChild(bruhh);
  dichotomy.appendChild(timeeeInput);
  dichotomy.appendChild(grugggggggggg);
  dichotomy.appendChild(gruggggggggggg);
  dichotomy.appendChild(timeeee);
  dichotomy.appendChild(bruhhh);
  dichotomy.appendChild(timeeeeInput);
  dichotomy.appendChild(grugggggggggggg);
  dichotomy.appendChild(gruggggggggggggg);
  dichotomy.appendChild(timeeeee);
  dichotomy.appendChild(bruhhhh);
  dichotomy.appendChild(timeeeeeInput);
  dichotomy.appendChild(grugggggggggggggg);
  dichotomy.appendChild(gruggggggggggggggg);
  dichotomy.appendChild(timeeeeee);
  dichotomy.appendChild(bruhhhhh);
  dichotomy.appendChild(headroom);
  headroom.appendChild(headoptionone);
  headroom.appendChild(headoptiontwo);
  headroom.appendChild(headoptionthree);
  headroom.appendChild(headoptionfour);
  headroom.appendChild(headoptionfive);
  headroom.appendChild(headoptionsix);
  dichotomy.appendChild(submitbattonne);

  //Resetting Variables
FN = undefined;
LN = undefined;
SI = undefined;
CR = undefined;
RH = undefined;
TT = undefined;
timeDeparted = undefined
divv = undefined;
divvers = undefined;
diavolo = undefined;
dichotomy = undefined;
hr = 0;
min = 0;
sec = 0;
stoptime = true;
overTen = false;
submitAttempted = false;
notTea = true;
}

function refillThirdPart() {
  switchIteration = 10;
  switchout(0.920, 300, "vw", true);
}

//Call the teaview.js functions below

function TVBClicked() {
  document.getElementById("gitTitle").innerHTML = "LISPASS - Teacher View"
  document.getElementById("LISTitle").innerHTML = "Teacher View - Lehman Intermediate Digital Pass"
  buildTeachDiv();
}