deals = [
    {"deal_id" : 0 , "vendor_name" : "Microsoft", "project_name" : "Apollo Project", "project_cost" : 1000},
    {"deal_id" : 1, "vendor_name" : "Intel", "project_name" : "Hermes Project", "project_cost" : 10000},
    {"deal_id" : 2 , "vendor_name" : "Apple", "project_name" : "Zeus Project", "project_cost" : 100000}
]


var financeTable = document.querySelector('.financeTable')
var tr = document.createElement("tr");

var i = 0;
while(i < deals.length){
    console.log(i);
    var tr = document.createElement("tr");

    var td_id = document.createElement("td");
    td_id.id = "finance" + deals[i].deal_id;
    td_id.className = "projectId";

    var td_name = document.createElement("td");
    td_name.id = "finance" + deals[i].vendor_id;
    td_name.className = "projectCompany";

    var td_project = document.createElement("td");
    td_project.id = "finance" + deals[i].vendor_id;
    td_project.className = "project";

    var td_projectCost = document.createElement("td");
    td_projectCost.id = "finance" + deals[i].vendor_id;
    td_projectCost.className = "projectCost";

    td_id.textContent  = deals[i].deal_id;
    td_name.textContent  = deals[i].vendor_name;
    td_project.textContent  = deals[i].project_name;
    td_projectCost.textContent  = deals[i].project_cost;


    tr.appendChild(td_id);
    tr.appendChild(td_name);
    tr.appendChild(td_project);
    tr.appendChild(td_projectCost);

    financeTable.appendChild(tr);

    i++;
}
i = 0;

function validateFinanceAdd(){
    console.log("Add");

    var uFinanceId= document.querySelector('.aFinanceId');
    var uFinanceCompany= document.querySelector('.aFinanceCompany');
    var uFinanceProject= document.querySelector('.aFinanceProject');
    var uFinanceProjectCost= document.querySelector('.aFinanceProjectCost');

    console.log("Vendor Info", uFinanceId.value, uFinanceCompany.value, uFinanceProject.value);
    alert("Update Vendor Information");

    var tr = document.createElement("tr");

    var td_id = document.createElement("td");
    var td_name = document.createElement("td");
    var td_project = document.createElement("td");
    var td_projectCost = document.createElement("td");

    td_id.textContent  = uFinanceId.value;
    td_name.textContent  = uFinanceCompany.value;
    td_project.textContent  = uFinanceProject.value;
    td_projectCost.textContent  = uFinanceProjectCost.value;

    tr.appendChild(td_id);
    tr.appendChild(td_name);
    tr.appendChild(td_project);
    tr.appendChild(td_projectCost);

    financeTable.appendChild(tr);
}

function validateFinanceUpdate(){

    var uFinanceId= document.querySelector('.uFinanceId');
    var uFinanceCompany= document.querySelector('.uFinanceCompany');
    var uFinanceProject= document.querySelector('.uFinanceProject');
    var uFinanceProjectCost= document.querySelector('.uFinanceProjectCost');

    var uId = parseInt(uFinanceId.value);
    while(i < deals.length){
        
        if(uId == deals[i].deal_id){
            var findId = document.querySelector('#finance'+deals[i].deal_id);
            var row = findId.parentElement;
            console.log(row);

            row.querySelector('.projectCompany').textContent = uFinanceCompany.value
            row.querySelector('.project').textContent = uFinanceProject.value
            row.querySelector('.projectCost').textContent = uFinanceProjectCost.value


        }

        i++;
    }
    i=0;
}

function validateFinanceDelete(){
    console.log("delete");
    var dFinanceId= document.querySelector('.dFinanceId');
    var uId = parseInt(dFinanceId.value);
    i=0;
    while(i < deals.length){
        if(uId == deals[i].deal_id){
            var findId = document.querySelector('#finance'+deals[i].deal_id);
            var row = findId.parentElement;

            financeTable.removeChild(row);
        }
        i++;
    }
}