<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <meta charset="utf-8">
    <title>List of Stack and Statuses</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
  </head>
  <body>
    <br>
    <div id="wrapper">
      <div id="header">
        <h2 class=display-4 style="margin-left: 170px;">Freshmarketer Stack Management</h2>
      </div>

    </div>
    <br><br>
    <div class="container">
      <div id="content">

        <table class=table table-bordered table-striped>
          <thead class="thead-dark">
            <tr>
              <th>S.No</th>
              <th>Stack Name</th>
              <th>Status</th>
              <th>Release Stack</th>
              <th>Actions</th>
            </tr>
          </thead>
          <c:forEach var="tempStack" items="${stackList}" >
            <c:url var="releaseLink" value="/stack/releaseStack" >
              <c:param name="stackId" value="${tempStack.id}" />
            </c:url>
            <c:url var="viewStackLink" value="/stack/viewStackDetails" >
              <c:param name="stackId" value="${tempStack.id}" />
            </c:url>
            <c:url var="editStackLink" value="/stack/editStackDetails" >
              <c:param name="stackId" value="${tempStack.id}" />
            </c:url>
            <tr>
              <td>${tempStack.id}</td>
              <td>${tempStack.stackName}</td>
              <td>
                <c:if test = "${tempStack.status == 'Available'}">
                  <button type="button" class="btn btn-outline-success">${tempStack.status}</button>
                </c:if>
                <c:if test = "${tempStack.status == 'Engaged'}">
                  <button type="button" class="btn btn-outline-danger">${tempStack.status}</button>
                </c:if>
              </td>
              <td> <a href="${releaseLink}">Release</a> </td>
              <td> <a href="${viewStackLink}">View</a> | <a href="${editStackLink}">Update</a> </td>
            </tr>
          </c:forEach>

        </table>

      </div>

    </div>

  </body>
</html>
