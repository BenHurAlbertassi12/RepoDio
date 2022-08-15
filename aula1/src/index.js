import React from 'react';
import ReactDOM from 'react-dom';
import Button from './Button'
import './index.css';

const soma = (a, b) => a + b

const primeiroJSX = () => {
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
      <Button onClick={() => soma(10, 20)} name='BenHur Albertassi' />
    </div>
  )
}
console.log(App);


const rootElement = document.getElementById('root')
ReactDOM.render(<App />, rootElement)
