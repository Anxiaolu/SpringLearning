/*$("#search").bind('focus', function (event) {
    alert();
    var search_name = this.val();
    setTimeout(function () {
        $.post('getmovie', {title: search_name}, function (data) {
            $.each(data, function () {
                var tr = $("<tr/>");
                var td = $("<td/>");
                td.html(this).appendTo(tr);
                td.html(this).appendTo(tr);
                td.hover(function () {
                    $(this).css({background: '#cdcdcd'});
                });
                td.mouseleave(function (event) {
                    $(this).css({background: '#ffffff'});
                });
                td.click(function (event) {
                    $('#search').val($(this).text());
                    cleardata();
                });
                $('#search_content').append(tr);
            });
        }, 'json');
    }, 500);
});

$('#btn').bind('click',function(event){
})

function cleardata() {
    $('#search_content').remove();
}   */