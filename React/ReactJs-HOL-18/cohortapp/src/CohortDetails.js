import React from "react";

function CohortDetails({ cohort }) {

    return (

        <div className="box">

            <h3>{cohort.code}</h3>

            <h4>{cohort.technology}</h4>

            <p>{cohort.startDate}</p>

            <p>{cohort.currentStatus}</p>

            <p>{cohort.coach}</p>

        </div>

    );

}

export default CohortDetails;