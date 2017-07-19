<!DOCTYPE html>
<html lang="zh-cn">
<head>
    <meta charset="utf-8"/>
    <title>书籍首页</title>
    <link rel="shortcut icon" href="${basePath}/static/favicon.ico"/>
</head>
<body id="body">
<#list books as book>
<a onclick="aClick('${book.name}', this)" style="cursor:pointer"> 名称：${book.name}，信息：${book.info} </a></br>
</#list>
<script src="${basePath}/static/js/common/jquery/jquery1.8.3.min.js"></script>
<script>
    function aClick(name, a) {
        $.ajax({
            url: "${basePath}/books/" + name,
            type: "get",
            dataType: "json",
            success: function (result) {
                if (result.success && result.code == 200) {
                    var book = result.data;
                    a.innerHTML = book.name + "，" + book.author + "，" + book.publisher;
                }
            }
        });
    }
</script>
</body>