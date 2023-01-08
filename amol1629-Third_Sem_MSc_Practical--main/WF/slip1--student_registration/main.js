let fname = document.getElementById("firstname")
let lname = document.getElementById("lastname")

let age = document.getElementById("age")
let btn = document.getElementById("btn")

btn.addEventListener("click", (event) => {
	event.preventDefault()
	let firstname = fname.value
	let lastname = fname.value
	let ageval = parseInt(age.value)

	let pattern = new RegExp("[0-9]")
	if (firstname == "" || pattern.test(firstname)) {
		alert("Enter the first name and let it not contain any numbers")
		return
	}
	if (lastname == "" || pattern.test(lastname)) {
		alert("Enter the last name and let it not contain any numbers")
		return
	}

	if (ageval < 18 || ageval > 50) {
		alert("age should be between 18 and 50")
		return
	}

	alert("All test validated")
})
