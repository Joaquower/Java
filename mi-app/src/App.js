import './App.css';

function App() {
  return (
    <div className="App">
      <Prueba/>
    </div>
  );
}

const Prueba = () => {
  const elements = [];
  for (let i = 1; i <= 10; i++) {
    elements.push(<h1 key={i}>Hola chica {i}</h1>);
  }
  return <div>{elements}</div>;
}
export default App;
