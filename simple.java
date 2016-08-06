<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
  <meta http-equiv="Content-Style-Type" content="text/css">
  <title></title>
  <meta name="Generator" content="Cocoa HTML Writer">
  <meta name="CocoaVersion" content="1348.17">
  <style type="text/css">
    p.p1 {margin: 0.0px 0.0px 0.0px 0.0px; line-height: 16.0px; font: 13.0px Menlo; color: #313131; -webkit-text-stroke: #313131; background-color: #eeeeee}
    p.p2 {margin: 0.0px 0.0px 0.0px 0.0px; line-height: 16.0px; font: 13.0px Menlo; color: #313131; -webkit-text-stroke: #313131; background-color: #eeeeee; min-height: 15.0px}
    p.p3 {margin: 0.0px 0.0px 0.0px 0.0px; line-height: 16.0px; font: 13.0px Menlo; color: #7f0055; -webkit-text-stroke: #7f0055; background-color: #eeeeee}
    p.p4 {margin: 0.0px 0.0px 0.0px 0.0px; line-height: 16.0px; font: 13.0px Menlo; color: #008800; -webkit-text-stroke: #008800; background-color: #eeeeee}
    p.p5 {margin: 0.0px 0.0px 0.0px 0.0px; line-height: 16.0px; font: 13.0px Menlo; color: #666600; -webkit-text-stroke: #666600; background-color: #eeeeee}
    span.s1 {font-kerning: none; color: #000088; -webkit-text-stroke: 0px #000088}
    span.s2 {font-kerning: none}
    span.s3 {font-kerning: none; color: #666600; -webkit-text-stroke: 0px #666600}
    span.s4 {font-kerning: none; color: #313131; -webkit-text-stroke: 0px #313131}
    span.s5 {font-kerning: none; color: #7f0055; -webkit-text-stroke: 0px #7f0055}
    span.s6 {font-kerning: none; color: #006666; -webkit-text-stroke: 0px #006666}
    span.s7 {font-kerning: none; color: #008800; -webkit-text-stroke: 0px #008800}
  </style>
</head>
<body>
<p class="p1"><span class="s1">import</span><span class="s2"> java</span><span class="s3">.</span><span class="s2">util</span><span class="s3">.*;</span></p>
<p class="p1"><span class="s1">import</span><span class="s2"> java</span><span class="s3">.</span><span class="s2">io</span><span class="s3">.*;</span></p>
<p class="p2"><span class="s2"></span><br></p>
<p class="p3"><span class="s1">public</span><span class="s4"> </span><span class="s1">class</span><span class="s4"> </span><span class="s2">ArrayToCollection</span><span class="s3">{</span></p>
<p class="p1"><span class="s2"><span class="Apple-converted-space">   </span></span><span class="s1">public</span><span class="s2"> </span><span class="s1">static</span><span class="s2"> </span><span class="s1">void</span><span class="s2"> main</span><span class="s3">(</span><span class="s5">String</span><span class="s2"> args</span><span class="s3">[])</span><span class="s2"><span class="Apple-converted-space"> </span></span></p>
<p class="p3"><span class="s4"><span class="Apple-converted-space">   </span></span><span class="s1">throws</span><span class="s4"> </span><span class="s2">IOException</span><span class="s3">{</span></p>
<p class="p3"><span class="s4"><span class="Apple-converted-space">      </span></span><span class="s2">BufferedReader</span><span class="s4"> </span><span class="s1">in</span><span class="s4"> </span><span class="s3">=</span><span class="s4"> </span><span class="s1">new</span><span class="s4"> </span><span class="s2">BufferedReader</span></p>
<p class="p3"><span class="s4"><span class="Apple-converted-space">      </span></span><span class="s3">(</span><span class="s1">new</span><span class="s4"> </span><span class="s2">InputStreamReader</span><span class="s3">(</span><span class="s2">System</span><span class="s3">.</span><span class="s1">in</span><span class="s3">));</span></p>
<p class="p4"><span class="s4"><span class="Apple-converted-space">      </span></span><span class="s5">System</span><span class="s3">.</span><span class="s1">out</span><span class="s3">.</span><span class="s4">println</span><span class="s3">(</span><span class="s2">"How many elements<span class="Apple-converted-space"> </span></span></p>
<p class="p4"><span class="s2"><span class="Apple-converted-space">      </span>you want to add to the array: "</span><span class="s3">);</span></p>
<p class="p1"><span class="s2"><span class="Apple-converted-space">      </span></span><span class="s1">int</span><span class="s2"> n </span><span class="s3">=</span><span class="s2"> </span><span class="s5">Integer</span><span class="s3">.</span><span class="s2">parseInt</span><span class="s3">(</span><span class="s1">in</span><span class="s3">.</span><span class="s2">readLine</span><span class="s3">());</span></p>
<p class="p1"><span class="s2"><span class="Apple-converted-space">      </span></span><span class="s5">String</span><span class="s3">[]</span><span class="s2"> name </span><span class="s3">=</span><span class="s2"> </span><span class="s1">new</span><span class="s2"> </span><span class="s5">String</span><span class="s3">[</span><span class="s2">n</span><span class="s3">];</span></p>
<p class="p1"><span class="s2"><span class="Apple-converted-space">      </span></span><span class="s1">for</span><span class="s3">(</span><span class="s1">int</span><span class="s2"> i </span><span class="s3">=</span><span class="s2"> </span><span class="s6">0</span><span class="s3">;</span><span class="s2"> i </span><span class="s3">&lt;</span><span class="s2"> n</span><span class="s3">;</span><span class="s2"> i</span><span class="s3">++){</span></p>
<p class="p1"><span class="s2"><span class="Apple-converted-space">         </span>name</span><span class="s3">[</span><span class="s2">i</span><span class="s3">]</span><span class="s2"> </span><span class="s3">=</span><span class="s2"> </span><span class="s1">in</span><span class="s3">.</span><span class="s2">readLine</span><span class="s3">();</span></p>
<p class="p1"><span class="s2"><span class="Apple-converted-space">      </span></span><span class="s3">}</span></p>
<p class="p1"><span class="s2"><span class="Apple-converted-space">      </span></span><span class="s5">List</span><span class="s2"> list </span><span class="s3">=</span><span class="s2"> </span><span class="s5">Arrays</span><span class="s3">.</span><span class="s2">asList</span><span class="s3">(</span><span class="s2">name</span><span class="s3">);</span><span class="s2"><span class="Apple-converted-space"> </span></span></p>
<p class="p1"><span class="s2"><span class="Apple-converted-space">      </span></span><span class="s5">System</span><span class="s3">.</span><span class="s1">out</span><span class="s3">.</span><span class="s2">println</span><span class="s3">();</span></p>
<p class="p1"><span class="s2"><span class="Apple-converted-space">      </span></span><span class="s1">for</span><span class="s3">(</span><span class="s5">String</span><span class="s2"> li</span><span class="s3">:</span><span class="s2"> list</span><span class="s3">){</span></p>
<p class="p1"><span class="s2"><span class="Apple-converted-space">         </span></span><span class="s5">String</span><span class="s2"> str </span><span class="s3">=</span><span class="s2"> li</span><span class="s3">;</span></p>
<p class="p1"><span class="s2"><span class="Apple-converted-space">         </span></span><span class="s5">System</span><span class="s3">.</span><span class="s1">out</span><span class="s3">.</span><span class="s1">print</span><span class="s3">(</span><span class="s2">str </span><span class="s3">+</span><span class="s2"> </span><span class="s7">" "</span><span class="s3">);</span></p>
<p class="p1"><span class="s2"><span class="Apple-converted-space">      </span></span><span class="s3">}</span></p>
<p class="p1"><span class="s2"><span class="Apple-converted-space">   </span></span><span class="s3">}</span></p>
<p class="p5"><span class="s2">}</span></p>
</body>
</html>
