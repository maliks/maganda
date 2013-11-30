<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>TestDojo</title>

<link rel="StyleSheet" type="text/css"
	href="js/dijit/themes/tundra/tundra.css">

<script type="text/javascript">
	var djConfig = {
		baseScriptUri : "js/",
		parseOnLoad : true
	};
</script>

<script type="text/javascript" src="js/dojo/dojo.js"></script>

<script>
	
	dojo.require("dojo.parser");
	dojo.require("dijit.form.TextBox");
	
	dojo.require("dijit.form.Form");
    dojo.require("dijit.form.Button");
    dojo.require("dijit.form.ValidationTextBox");
    dojo.require("dijit.form.DateTextBox");
    
</script>

</head>
    <body class="tundra">
        <div dojoType="dijit.form.Form" id="myForm" jsId="myForm" encType="multipart/form-data" action="" method="">
            <script type="dojo/method" event="onReset">
                return confirm('Press OK to reset widget values');
            </script>
            <script type="dojo/method" event="onSubmit">
                if (this.validate()) {
                    return confirm('Form is valid, press OK to submit');
                } else {
                    alert('Form contains invalid data.  Please correct first');
                    return false;
                }
                return true;
            </script>
            
			<table style="border: 1px solid #9f9f9f;" cellspacing="10">
				<tr>
					<td>Name:</td>
					<td><input type="text" id="name" name="name" required="true" dojoType="dijit.form.ValidationTextBox" /></td>
				</tr>
				<tr>
					<td>Date of birth:</td>
					<td><input type="text" id="dob" name="dob" dojoType="dijit.form.DateTextBox" /></td>
				</tr>
			</table>
			
            <button dojoType="dijit.form.Button" type=button onClick="console.log(myForm.getValues())">
                Get Values from form!
            </button>
            <button dojoType="dijit.form.Button" type="submit" name="submitButton"
            value="Submit">
                Submit
            </button>
            <button dojoType="dijit.form.Button" type="reset">
                Reset
            </button>
        </div>
    </body>
</html>