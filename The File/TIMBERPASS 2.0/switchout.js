//This file handles the switchout functions

var pleaseRemoveThis = -10;
var pleaseRemoveThisViewWidth;
var settingTimeout;
var switchIteration = 0;

function switchout(moveamntt, timeset, vwOrVh, gitWhich) {
    setToTimeout();
    settingTimeout = setInterval(incRightMove, 1, moveamntt, vwOrVh, gitWhich);
    setTimeout(setToTimeout, timeset);
    setTimeout(stupidFunction, timeset, vwOrVh, gitWhich);
}

function stupidFunction(vwOrVh, gitWhich) {
  if (switchIteration <= 4) {
    if (!gitWhich) {
      switchout(-0.9765, 100, vwOrVh, gitWhich);
      switchIteration += 1;
    }
    if (gitWhich) {
      switchout(-0.910, 100, vwOrVh, gitWhich);
      switchIteration += 1;
    }
  }
  if (switchIteration >= 9) {
    switchout(-.028, 100, vwOrVh, gitWhich);
    switchIteration -= 1;
  } else {
      console.log("(PleaseRunThis5TimesImBeggingYou)");
    }
}

function setToTimeout() {
    clearInterval(settingTimeout);
}

function incRightMove(moveamnt, vwOrVh, gitWhich) {
  pleaseRemoveThis += moveamnt
  numtovw(vwOrVh);
  if (gitWhich) {
  document.getElementById("frontDiv").style.right = pleaseRemoveThisViewWidth;
  }
  if (!gitWhich) {
    document.getElementById("teachDiv").style.bottom = pleaseRemoveThisViewWidth;
    }
}

function numtovw(vwOrVh) {
  pleaseRemoveThisViewWidth = pleaseRemoveThis + vwOrVh;
}
