import { useEffect } from "react";
import { Home } from "../src/pages/home/Home";
import { main } from "./lib/requests";

function App() {

  return (
    <div className="bodyContainer">
      <Home />
    </div>
  );
}

export default App;
