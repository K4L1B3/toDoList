// fetch({
//     url: "http://localhost:8080/parking-spot",
// })

export async function main() {
  //   const response = fetch("http://localhost:8080/parking-spot");

  const response = await fetch("https://jsonplaceholder.typicode.com/todos/1");

  const data = await response.json();

  console.log("Data", data);

  // retorna header
  // ler o header
  // verificar se o header ta em Json

  //   response.then(
  //     (response) => {
  //       //
  //     },
  //     (error) => {
  //       //
  //     }
  //   );

  console.log("Resposta", response);
}
