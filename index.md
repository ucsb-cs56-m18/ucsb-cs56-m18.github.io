---
title: CS56, Summer 2018, pconrad
---

# {{site.course}}, {{site.quarter}}


<div id="info" data-role="collapsible" data-collapsed="false">
<h2>Course Information</h2>
<ul>
{% for item in site.info %}
<li><a href="{{item.url}}"  data-ajax="false">{{item.title }}</a></li>
{% endfor %}
</ul>
</div>

<style>
table.bios * td {
 padding: 0.2em;
}
p.staff-bio { max-width: 70em; /* http://maxdesign.com.au/articles/ideal-line-length-in-ems/ */
              padding: 0.5em;
	    }
</style>

<div data-role="collapsible" data-collapsed="true">
<h2 id="bios">Course Staff Bios:</h2>
<table class="bios">
<tr><th>Name</th><th>Role</th><th>Bio</th></tr>
{% for b in site.bios %}
<tr><td><a href="{{b.url}}"  data-ajax="false">{{b.name }}</a></td><td>{{b.role}}</td><td><p class="staff-bio">{{b.bio}}</p></td></tr>
{% endfor %}
</table>
</div>

<div data-role="collapsible" data-collapsed="false">
<h2 id="labs">Labs:</h2>
{% include lab_table.html %}
</div>


<div data-role="collapsible" data-collapsed="false">
<h2 id="homework">Homework:</h2>
{% include hwk_table.html %}
</div>

<div data-role="collapsible" data-collapsed="false">
<h2 id="exams">Exams</h2>
{%include exam_table.html %}
</div>

<div data-role="collapsible" data-collapsed="false">
<h2 id="teams">Lectures</h2>

See also: [LECTURE* repos](https://github.com/ucsb-cs56-m18?utf8=%E2%9C%93&q=LECTURE&type=&language=) from <https://github.com/ucsb-cs56-m18>
  
{%include lectures_table.html %}
</div>

