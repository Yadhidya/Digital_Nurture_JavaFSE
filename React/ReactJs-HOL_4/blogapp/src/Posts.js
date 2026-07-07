import { Component } from "react";
import Post from "./Post";

class Posts extends Component {
    constructor(props) {
        super(props);
        console.log("Construcor");
        this.state = {
            posts: []
        };
    }

    async loadPosts() {
        try {
            const response = await fetch(
                "https://jsonplaceholder.typicode.com/posts"
            );

            const data = await response.json();

            const posts = data.map(
                (item) => new Post(item.id, item.title, item.body)
            );

            this.setState({
                posts: posts
            });
        } catch (error) {
            throw error;
        }
    }

    componentDidMount() {
      console.log("Mounted");
        this.loadPosts();
    }

    componentDidCatch(error, info) {
        alert(error.message);
        console.log(error, info);
    }

    render() {
        return (
            <div>
                <h1>Posts</h1>

                {this.state.posts.map((post) => (
                    <div key={post.id}>
                        <h2>{post.title}</h2>
                        <p>{post.body}</p>
                        <hr />
                    </div>
                ))}
            </div>
        );
    }
}

export default Posts;