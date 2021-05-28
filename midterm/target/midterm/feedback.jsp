
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Feedback</title>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
	<style>
		form{
			width: 50%;
			margin: auto;
			margin-top: 10%;
			padding: 2%;
			box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1),0 8px 16px rgba(0, 0, 0, 0.1);
			background-color: white;
			border-radius: 10px;
		}
		body{
			background-color: #eee;
		}
	</style>
</head>
<body>
	<form action="http://localhost:8080/midterm/thankyou.jsp">
		<div class="mb-3">
		  <label for="exampleInputEmail1" class="form-label"> Feedback</label>
		  <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
		</div>
		<select class="form-select" aria-label="Default select example">
			<option selected value="Web hosting">Web hosting</option>
			<option value="Domain transfer">Domain transfer</option>
			<option value="Domain selling">Domain selling</option>
			<option value="SSL">SLL</option>
			<option value="VSP">VPS</option>
		  </select>
		  <button type="submit" class="btn btn-secondary mt-2"> Submit</button>
	  </form>
</body>
</html>
