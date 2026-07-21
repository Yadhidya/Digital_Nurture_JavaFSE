import { Component } from "react";

 export class Cart extends Component{
  render(){
    return(
      <table border="1">
        <th><td>itemName</td><td>Price</td></th>
    {this.props.item.map((item)=>{
      return(
        <tr>
        <td>{item.itemname}</td>
        <td>{item.price}</td>
        </tr>
      )
    })}
    </table>
    )
  }
}