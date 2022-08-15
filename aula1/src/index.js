import React, { Component } from 'react';
import ReactDOM from 'react-dom';
// import Button from './Button'
import './index.css';

// const soma = (a, b) => a + b

class App extends Component {
  constructor(props) {
    super(props)

    this.state = {
      clock: 1000,
      copo: 'agua'
    }
  }

  componentDidMount() {
    window.setTimeout(() => {
      this.setState({
        copo: 'suco'
      })
    }, 3000)
  }

  alterarCopo = () => {
    this.setState({
      copo: 'refrigerante'
    })
  }

  render() {
    return (
      <div>
        <h1>{this.state.clock}</h1>
        <button onClick={() => this.alterarCopo()}>{this.state.copo}</button>
      </div>
    )
  }
}

const rootElement = document.getElementById('root')
ReactDOM.render(<App />, rootElement)
