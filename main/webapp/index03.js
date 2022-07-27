let data;
function wck(){
	if(window.XMLHttpRequest){
		return new XMLHttpRequest();
	}
}
function members(){
	if(data.readyState == XMLHttpRequest.DONE && data.status==200){
		
	}
	else if(data.status==404){
		error();
	}
}
data = wck();
data.onreadystatechange = members;
data.open("GET","./index3.json",true);
data.send();

function member_list(jdata){
	var j = JSON.parse(jdata);
	console.log(j);
	var total = j["members"].length;
	var f;
	var tbody =document.getElementById("mblist");
	var tr, td;
	
	for(f in j["members"]){
		tr =document.createElement("tr");	
		td= document.createElement("td");
		td.innerText =total;
		tr.append(td);
		
		//getAttribute: 속성 값을 가져올 때 (style, onclick, class...)
		var ff;
		for(ff in j.members[f]){
			if(ff=="id"){	
				tr.setAttribute("onclick","java_get('"+j.members[f][ff]+"')");
			}
			td= document.createElement("td");
			if(ff == "area"){
				ff="phone";
			}
			else if(ff=="phone"){
				ff="area";
			}
			text = document.createTextNode(j.members[f][ff]);
			td.append(text);
			tr.append(td);
			//console.log(j.members[f][ff]);
		}
		tr.append(td);
		tbody.append(tr);
		total--;
	}
	
}

function error(){
	alert("해당 파일을 로드 할 수 없습니다");
	return false;
}

function java_get(mid){
	location.href='./index3.html?mid='+mid;
}

