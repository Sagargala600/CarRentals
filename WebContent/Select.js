
function changecar() {
    var selectHTML = "";

    var A = ["X1", "X3", "X5", "7 series"];
    var B = ["A3", "A4", "A6", "A8L"];
    var C = ["XJ", "XJL", "F-Type", "F-Pace", "Force"];

    if (document.getElementById("cars").value == "A") {
        var select = document.getElementById('category').options.length;

        for (var i = 0; i < select; i++) {
            document.getElementById('category').options.remove(i);
        }

        for (var i = 0; i < A.length; i++) {
            var newSelect = document.createElement('option');
            selectHTML = "<option value='" + A[i] + "'>" + A[i] + "</option>";
            newSelect.innerHTML = selectHTML;
            document.getElementById('category').add(newSelect);
        }
    }

    else if (document.getElementById("cars").value == "B") {
        var select = document.getElementById('category').options.length;

        for (var i = 0; i < select; i++) {
            document.getElementById('category').options.remove(i);
        }

        for (var i = 0; i < B.length; i++) {
            var newSelect = document.createElement('option');
            selectHTML = "<option value='" + B[i] + "'>" + B[i] + "</option>";
            newSelect.innerHTML = selectHTML;
            document.getElementById('category').add(newSelect);
        }
    }

    else if (document.getElementById("cars").value == "C") {
        var select = document.getElementById('category').options.length;

        for (var i = 0; i < select; i++) {
            document.getElementById('category').options.remove(i);
        }

        for (var i = 0; i < C.length; i++) { 
            var newSelect = document.createElement('option');
            selectHTML = "<option value='" + C[i] + "'>" + C[i] + "</option>";
            newSelect.innerHTML = selectHTML;
            document.getElementById('category').add(newSelect);
        }
    }
}

function calculatetotal(){
	 car1 = document.getElementById('cars').value;
	 days = document.getElementById('days').value;
	if(car1=="A"){
		document.form.total.value = 80*days;
	}
}