import React, { Component } from 'react';
import ReactDOM from 'react-dom';
import Button from './Button'
import './index.css';


class App extends Component {
    constructor(props) {
        super(props)

        this.state = {
            clock: 1000,
            copo: 'agua'
        }
    }

    componentDidMount() {
        this.setState({
            copo: 'suco'
        })
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
