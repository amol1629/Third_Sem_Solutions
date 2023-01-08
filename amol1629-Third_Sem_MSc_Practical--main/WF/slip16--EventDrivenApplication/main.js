// 16)	Create a js file named main.js for event-driven application. There should be a main loop that listens for events, and then triggers a callback function when one of those events is detected.
var events = require('events');
var eventEmitter = new events.EventEmitter();

//Create an event handler:
var myEventHandler = function () {
    console.log("Inside the callback function");
  console.log('I hear a event!');
}


//Assign the event handler to an event:
eventEmitter.on('fire', myEventHandler);


function main() {
//Fire the 'scream' event:
    setInterval(()=>{
        console.log("Firing an event ")
        eventEmitter.emit('fire')
    } , 2000)
}

main()