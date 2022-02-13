<html>
    <head>
        <title>Code</title>
    </head>
    <body>
        <div>
         <#list snippets as code>
            <span id="load_date" class ="date">${code.date}</span>
            <br>
            <pre id="code_snippet" style="border: 2px solid gray;
                                          width: 600px;
                                          height: 300px;
                                          word-wrap: break-word;
                                          word-break: break-word;
                                          overflow: scroll">${code.content}</pre>
          </#list>
        </div>

    </body>
</html>