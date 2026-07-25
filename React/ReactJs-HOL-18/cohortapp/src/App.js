import "./App.css";
import CohortDetails from "./CohortDetails";
import { CohortData } from "./Cohort";

function App() {

    return (

        <div>

            {

                CohortData.map((cohort) => (

                    <CohortDetails
                        key={cohort.id}
                        cohort={cohort}
                    />

                ))

            }

        </div>

    );

}

export default App;