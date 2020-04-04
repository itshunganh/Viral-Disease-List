<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<!DOCTYPE html>
<html>
<head>
    <title>VIRAL DISEASES</title>
    <style>
        body {
            background-color: #121212;
        }
        table, h1 {
            font-family: "Trebuchet MS", sans-serif;
            border-collapse: collapse;
            width: 100%;
        }

        h1 {
            color: #ffbf00;
            text-align: center;
        }

        th {
            color: #ffbf00;
            border: 1px solid #dddddd;
            text-align: center;
            padding: 4px;
        }

        td {
            color: #f5f5f5;
            border: 1px solid #dddddd;
            text-align: left;
            padding: 8px;
        }

        tr:nth-child(even) {
            background-color: #212121;
        }
    </style>
</head>
<body>

<h1>VIRAL DISEASES</h1>

<table>
    <tr>
        <b>
        <th>NAME</th>
        <th>DESCRIPTION</th>
        <th>SYMPTOMS</th>
        <th>DURATION</th>
        <th>MORTALITY RATE</th>
        <th>IMAGE</th>
        </b>
    </tr>
    <c:forEach var = "row" items = "${viruslist}">
        <tr>
            <td style="color: #717fff">${row.virusName}</td>
            <td>${row.virusDesc}</td>
            <td>${row.symptoms}</td>
            <td>${row.duration}</td>
            <td>${row.mortRate}</td>
            <td><img src="${row.virusImg}" height="200" width="400"></img></td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
