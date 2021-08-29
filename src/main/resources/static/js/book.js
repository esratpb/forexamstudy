$(document).ready(function(){
	$('[data-toggle="tooltip"]').tooltip();
//	var actions = $("table td:last-child").html();
	$(function getAllBooks() {
        $.ajax({
            url: 'http://localhost:8080/api/book',
            type: 'GET',
            contentType: 'application/json',
            dataType: "json"
        }).done(function (data) {
        $.each(data,function(index,value){


                var row = '<tr>' +
                    '<td>'+value.id+'</td>' +
                    '<td>'+value.bookName+'</td>'+
                    '<td>'+value.author.authorName+'</td>'+
                '</tr>';
            	$("table").append(row);

        })
        })
        });
	// Append table with add row form on add new button click
    $(".add-new").click(function(){

    });
//	// Add row on add button click
//	$(document).on("click", ".add", function(){
//		var empty = false;
//		var input = $(this).parents("tr").find('input[type="text"]');
//        input.each(function(){
//			if(!$(this).val()){
//				$(this).addClass("error");
//				empty = true;
//			} else{
//                $(this).removeClass("error");
//            }
//		});
//		$(this).parents("tr").find(".error").first().focus();
//		if(!empty){
//			input.each(function(){
//				$(this).parent("td").html($(this).val());
//			});
//			$(this).parents("tr").find(".add, .edit").toggle();
//			$(".add-new").removeAttr("disabled");
//		}
//    });

});


