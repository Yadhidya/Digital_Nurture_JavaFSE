import { Cart } from "./Cart";
import React from "react";

export class OnlineShopping extends React.Component{
  render(){
    const CartInfo=[{itemname:"Laptop",price:80000},
      {itemname:"Tv",price:80000},
      {itemname:"Washing Machine",price:80000},
      {itemname:"Mobile",price:80000},
      {itemname:"Fridge",price:80000}
    ];
    return(
      <div>
        <h2>Items Ordered</h2>
        <Cart item={CartInfo}/>
      </div>
    )
  }
}