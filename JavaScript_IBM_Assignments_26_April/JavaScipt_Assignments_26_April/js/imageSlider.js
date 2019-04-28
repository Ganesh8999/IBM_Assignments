
		function displayImage() {


			if(document.getElementById('image').style.height == "0px"){


				document.getElementById('image').style.height= "700px";
				document.getElementById('image').style.width = "100%";
				document.getElementById('image').style.transition ="1s all ease";
				//document.getElementById('mainContainer').style.backgroundColor= "aqua";
			}
			else{

				document.getElementById('image').style.height= "0px";
				document.getElementById('image').style.transition =" 1s all ease";
				//document.getElementById('mainContainer').style.backgroundColor= "aqua";
			}


		}
