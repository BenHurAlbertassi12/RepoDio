import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';

function primeiroJSX() {
  return (
    <div className='test'>
      BenHur Albertassi - Introdução ao ReactJS
      {/* <h1> </h1> */}
    </div>
  )
}

const App = () => {
  return (
    <div className='App'>
      {primeiroJSX()}
    </div>
  )
}


const rootElement = document.getElementById('root')
ReactDOM.render(<App />, rootElement)
