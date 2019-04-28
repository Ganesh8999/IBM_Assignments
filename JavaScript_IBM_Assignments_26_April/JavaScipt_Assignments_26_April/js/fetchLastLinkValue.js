


		function fetchLastLinkValue(){
			var a = document.getElementsByTagName("a");

		var value = document.getElementById("links").innerHTML = a[a.length - 1].getAttribute("href");

		alert("Last link href value is   "+ value);
		}
