import "./App.css";
import { BookDetails } from "./Components/BookDetails";
import { BlogDetails } from "./Components/BlogDetails";
import { CourseDetails } from "./Components/CourseDetails";

function App() {

    const books = [
        { id: 101, bname: "Master React", price: 670 },
        { id: 102, bname: "Deep Dive into Angular 11", price: 800 },
        { id: 103, bname: "Mongo Essentials", price: 450 }
    ];

    const blogs = [
        {
            id: 1,
            title: "React Learning",
            author: "Stephen Biz",
            description: "Welcome to learning React!"
        },
        {
            id: 2,
            title: "Installation",
            author: "Schwedenier",
            description: "You can install React from npm."
        }
    ];

    const courses = [
        { id: 1, name: "Angular", date: "4/5/2021" },
        { id: 2, name: "React", date: "6/3/2021" }
    ];

    // Conditional Rendering (Element Variable)
    let content;

    let showBooks = true;

    if (showBooks) {
        content = <BookDetails books={books} />;
    } else {
        content = <h2>No Books Available</h2>;
    }

    return (

        <div className="container">

            <div className="column">

                <CourseDetails courses={courses} />

            </div>

            <div className="column">

                {content}

            </div>

            <div className="column">

                {
                    true
                        ? <BlogDetails blogs={blogs} />
                        : <h2>No Blogs</h2>
                }

            </div>

        </div>

    );
}

export default App;