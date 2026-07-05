import "../StyleSheets/mystyle.css"
const percenttodecimal=(decimal)=>{
  return (decimal.toFixed(2)+'%');
}
const calcsore=(total,goal)=>{
  return percenttodecimal(total/goal)

}
const CalculateScore=({Name,School,total,goal})=>{
  return(
    <div className="formatStyle">
      <h1><font color="Brown"> Student details:</font></h1>
      <div className="Name">
        <b><span>Name :</span></b>
        <span>{Name}</span>
      </div>
        <div className="School">
        <b><span>School :</span></b>
        <span>{School}</span>
      </div>
        <div className="total">
        <b><span>Total :</span></b>
        <span>{total}</span>
      </div>
        <div className="score">
        <b><span>Score :</span></b>
        <span>{calcsore(total,goal)}</span>
      </div>
    </div>
  );
}

export default CalculateScore;