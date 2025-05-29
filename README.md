Backend - Mínimo 2: Gestión de Denuncias (Dummy)


 Implementación realizada

1.POST /issue
La denuncia se recibe como JSON, se imprime por consola y se guarda en una lista en memoria (dummyIssues).
Ejemplo:
{
  "date": "2024-05-29",
  "title": "Abuso",
  "message": "Jugador insultando",
  "sender": "admin"
}

2.GET /issue
-Devuelve todas las denuncias registradas, incluyendo las que ha enviado la app durante la ejecución.
-La respuesta es un array JSON de objetos Issue.
