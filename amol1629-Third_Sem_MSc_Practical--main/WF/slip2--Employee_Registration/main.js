let dob = document.getElementById("dob")
let joiningdate = document.getElementById("joiningdate")
let salary = document.getElementById("salary")

let btn = document.getElementById("btn")

btn.addEventListener("click", (event) => {
	event.preventDefault()

	const s = salary.value
	let d = dob.value
	let jd = joiningdate.value

	if (new Date(d) > new Date(jd)) {
		alert("you cannot join before being born")
		return
	}

	if (s < 0) {
		alert("salary cannot be negative")
		return
	}
})
