$(function() {
    // add a click handler to the button
    $("#btnAddName").click(function(event) {
        // make an ajax get request to get the message
        jsRoutes.controllers.NameController.getName().ajax({
            success: function(data) {
                console.log(data)
                $(".well").append($("<h1>").text(data.value))
            }
        })
    })
})
