//This file handles filling out the teacher view information

var createdIDNum = 10
var createdID = undefined

function buildTeachDiv() {
    let trThingy = document.createElement("TR");
    createdID = "createdIdentifier" + createdIDNum.toString();
    createdIDNum += 1;
    trThingy.id = createdID;
    document.getElementById("studentTable").appendChild(trThingy);
    let newFName = document.createElement("TD");
    newFName.classList.add("FNameDisplay");
    newFName.innerHTML = FN;
    if (overTen == true) {
        newFName.style.backgroundColor = "#EBB4B4";
    }
    document.getElementById(createdID).appendChild(newFName);
    let newLName = document.createElement("TD");
    newLName.classList.add("LNameDisplay");
    newLName.innerHTML = LN;
    if (overTen == true) {
        newLName.style.backgroundColor = "#EBB4B4";
    }
    document.getElementById(createdID).appendChild(newLName);
    let newID = document.createElement("TD");
    newID.classList.add("IDDisplay");
    newID.innerHTML = SI;
    if (overTen == true) {
        newID.style.backgroundColor = "#EBB4B4";
    }
    document.getElementById(createdID).appendChild(newID);
    let newCurrentRoom = document.createElement("TD");
    newCurrentRoom.classList.add("SRoomDisplay");
    newCurrentRoom.innerHTML = CR;
    if (overTen == true) {
        newCurrentRoom.style.backgroundColor = "#EBB4B4";
    }
    document.getElementById(createdID).appendChild(newCurrentRoom);
    let newHeadedRoom = document.createElement("TD");
    newHeadedRoom.classList.add("destinationDisplay");
    newHeadedRoom.innerHTML = RH;
    if (overTen == true) {
        newHeadedRoom.style.backgroundColor = "#EBB4B4";
    }
    document.getElementById(createdID).appendChild(newHeadedRoom);
    let newTimeDeparted = document.createElement("TD");
    newTimeDeparted.classList.add("timeLeftDisplay");
    newTimeDeparted.innerHTML = timeDeparted
    if (overTen == true) {
        newTimeDeparted.style.backgroundColor = "#EBB4B4";
    }
    document.getElementById(createdID).appendChild(newTimeDeparted);
    let timeSpent = document.createElement("TD");
    timeSpent.classList.add("timeSpentDisplay");
    timeSpent.innerHTML = TT;
    if (overTen == true) {
        timeSpent.style.backgroundColor = "#EBB4B4";
    }
    document.getElementById(createdID).appendChild(timeSpent);
    if (notTea == false) {
    let reffi = document.getElementById("refillbutton");
    reffi.style.left = "20px";
    reffi.style.bottom = "20px";
    document.body.appendChild(reffi);
    }
}