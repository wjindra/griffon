<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8"/>
    <title><%if (content.title) {%>${content.title}<% } else { %>Griffon<% }%></title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <meta name="keywords" content="">
    <meta name="generator" content="JBake">

    <!-- Le styles -->
    <link href="<%if (content.rootpath) {%>${content.rootpath}<% } else { %><% }%>css/font-awesome.min.css" rel="stylesheet">
    <link href="<%if (content.rootpath) {%>${content.rootpath}<% } else { %><% }%>css/devicons.min.css" rel="stylesheet">
    <link href="<%if (content.rootpath) {%>${content.rootpath}<% } else { %><% }%>css/bootstrap.min.css" rel="stylesheet">
    <link href="<%if (content.rootpath) {%>${content.rootpath}<% } else { %><% }%>css/asciidoctor.css" rel="stylesheet">
    <link href="<%if (content.rootpath) {%>${content.rootpath}<% } else { %><% }%>css/base.css" rel="stylesheet">
    <link href="<%if (content.rootpath) {%>${content.rootpath}<% } else { %><% }%>css/prettify.css" rel="stylesheet">

    <!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
    <!--[if lt IE 9]>
      <script src="<%if (content.rootpath) {%>${content.rootpath}<% } else { %><% }%>js/html5shiv.min.js"></script>
    <![endif]-->

    <!-- Fav and touch icons -->
    <link rel="shortcut icon" href="<%if (content.rootpath) {%>${content.rootpath}<% } else { %><% }%>favicon.ico">
  </head>
  <body onload="prettyPrint()">
    <div id="wrap">
   
