import React, { Component } from 'react'

class CountPeople extends Component
{
  constructor(){
    super();
    this.state={
      entrycount:0,
      exitcount:0,
      c:0
    };
  };
  updateEntry(){
    this.setState((prevstate,props)=>{
      return{entrycount:prevstate.entrycount+1}
    });
  }
  updateExit(){
    this.setState((prevstate,props)=>{
      return{exitcount:prevstate.exitcount+1}
    });
  }
  render() {
    return(
      <div >
      <button onClick={this.updateEntry.bind(this)}>Login</button>
      <label>{this.state.entrycount} People Entered</label>
      
      <button onClick={this.updateExit.bind(this)}>Exit</button>
      <label>{this.state.exitcount} People Left</label>
      </div>
    );
  }
}

export default CountPeople
