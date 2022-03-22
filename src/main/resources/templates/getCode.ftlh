<html>
    <head>
        <title>Code</title>
        <link rel="stylesheet"
            target="_blank" href="//cdn.jsdelivr.net/gh/highlightjs/cdn-release@10.2.1/build/styles/default.min.css">
        <script src="//cdn.jsdelivr.net/gh/highlightjs/cdn-release@10.2.1/build/highlight.min.js"></script>
        <script>hljs.initHighlightingOnLoad();</script>
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
                                          overflow: scroll"><code>${code.content}</code></pre>
          </#list>
        </div>

    </body>
</html>