$(document).ready(function(){
    $.ajax({
        url: "http://localhost:8080/myapp/api/book",
        type: "GET",
        success: function(booklist){
            $.each(booklist, function(index,book){
                $("#books").append($("<option></option>").attr("value",book.bookId).text(book.title));
            })
        },
        error: function (jqXHR){
            alert("Something went wrong!");
        }
    })
});

$(document).ready(function(){
    $("#bookform").submit(function(event){
        event.preventDefault();
        var formdata={
            title:$("#title").val(),
            author:$("#author").val(),
            isbn:$("#isbn").val()
        }
        $.ajax({
            type: "POST",
            contentType: "application/json",
            url:"http://localhost:8080/myapp/api/book",
            data: JSON.stringify(formdata),
            success: function(book){
                $("#books").append($("<option></option>").attr("value",book.bookId).text(book.title));
            },
            error:function (jqXHR){
                alert("Something went wrong!");
            }
        })
    })

});
