<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <meta charset="utf-8">
    <title>Form to Add Stack Details</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
  </head>
  <body>
    <br>
    <div class="container">
      <div id="header">
        <h2 class=display-5 style="margin-left: 2px;">Freshmarketer Stack Management</h2>
      </div>
      <hr>
      <div id="container">
        <br>
        <h3 class=display-5 style="margin-left: 2px;">Form to Update <span>${stack.stackName}</span> Details</h3>
        <hr>
        <form:form class="" action="saveStack" method="post" modelAttribute="stackDetails">
          <form:hidden path="id" />
          <table table table-bordered table-striped>
            <tbody>
              <tr>
                <td style="height:20px;"><label>Stack is Used By:</label></td>
                <td style="height:20px;"><form:input size="50" path="userName" /></td>
              </tr>
              <tr>
                <td style="height:20px;"><label>Purpose:</label></td>
                <td style="height:20px;"><form:input size="50" path="purpose" /></td>
              </tr>
              <tr>
                <td style="height:20px;"><label>FE Branch Name:</label></td>
                <td style="height:20px;"><form:input size="50" path="feBranch" /></td>
              </tr>
              <tr>
                <td style="height:20px;"><label>BE Branch Name:</label></td>
                <td style="height:20px;"><form:input size="50" path="bebranch" /></td>
              </tr>
              <tr>
                <td style="height:20px;"><label></label></td>
                <td style="height:20px;"><button type="submit" value="Save" class="btn btn-info">Save</button></td>
              </tr>
            </tbody>
          </table>
        </form:form>
        <hr>

        </div>

          <a href="${pageContext.request.contextPath}/stack/list" class="btn btn-primary">Back to Home Page</a>

      </div>
    </div>
  </body>
</html>
