function call(){

			var input = prompt("enter the no of boxes ");
			for (var i = 0; i <= input; i++) {

				inputBox();
				var brek = document.createElement("BR");
				brek.id = "break";
				document.body.appendChild(brek);
				var brek1 = document.createElement("BR");
				brek1.id = "break1";
				document.body.appendChild(brek1);

			}

		}

		function inputBox(){

			var newInputBox = document.createElement("INPUT");
			newInputBox.setAttribute("type","text");
			newInputBox.setAttribute("placeholder","Enter Data");
			document.body.appendChild(newInputBox);

		}