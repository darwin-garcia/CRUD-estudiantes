<%-- 
  Document   : listar
  Created on : 28-may-2019, 8:57:18
  Author     : ErickG
--%>

<%@page import="java.util.Iterator"%>
<%@page import="co.edu.sena.registroestudiante.persistencia.vo.EstudianteVO"%>
<%@page import="java.util.List"%>
<%@page import="co.edu.sena.registroestudiante.persistencia.dao.EstudianteDAO"%>
<%@page contentType="text/html" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="es-CO">
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>Lista de Estudiantes</title>
  </head>
  <body>
    <section>
      <div>
        <h1>Lista de Estudiantes</h1>
        <table border="0">
          <thead>
            <tr>
              <th>ID</th>
              <th>Documento</th>
              <th>Nombres</th>
              <th>Apellidos</th>
              <th>Acciones</th>
            </tr>
          </thead>
          <%
            EstudianteDAO dao = new EstudianteDAO();
            List<EstudianteVO> list = dao.listar();
            Iterator<EstudianteVO> itera = list.iterator();
            EstudianteVO est = null;
            while (itera.hasNext()) {
              est = itera.next();
          %>
          <tbody>
            <tr>
              <td><%= est.getId()%></td>
              <td><%= est.getDocumento()%></td>
              <td><%= est.getNombres()%></td>
              <td><%= est.getApellidos()%></td>
              <td>
                <a>Editar </a>
                <a>Borrar</a>
              </td>
            </tr>
            <%}%>
          </tbody>
        </table>
      </div>
    </section>
  </body>
</html>
