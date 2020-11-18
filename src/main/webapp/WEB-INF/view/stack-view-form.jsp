<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <meta charset="utf-8">
    <title>The current Stack Details</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
  </head>
  <body>
    <br>
    <div class="container">
      <div id="header">
        <h2 class=display-5 style="margin-left: 10px;">The <span>${stackName}</span> details are as follows</h2>
      </div>
      <br>
        <hr>
      <table table table-bordered table-striped>
        <tbody>
          <tr>
            <td><label><b>Stack is Used By: </b>${stackDetails.userName}</label></td>
          </tr>
          <tr>
            <td><label><b>The stack purpose is: </b>${stackDetails.purpose}</label></td>
          </tr>
          <tr>
            <td><label><b>The stack Frontend Branch is: </b>${stackDetails.feBranch}</label></td>
          </tr>
          <tr>
            <td><label><b>The stack backend Branch is: </b>${stackDetails.bebranch}</label></td>
          </tr>
        </tbody>
      </table>
      <br><hr>
        <a href="${pageContext.request.contextPath}/stack/list" class="btn btn-primary">Back to Home Page</a>

    </div>

  </body>
</html>
