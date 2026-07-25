export function BookDetails(props) {

    const bookDetails = (
        <ul>
            {
                props.books.map((book) => (
                    <div key={book.id}>
                        <h3>{book.bname}</h3>
                        <h4>{book.price}</h4>
                    </div>
                ))
            }
        </ul>
    );

    return (
        <div>
            <h1>Book Details</h1>
            {bookDetails}
        </div>
    );
}