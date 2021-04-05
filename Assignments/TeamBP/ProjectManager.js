var vendor_details = [
    {"vendor_id" : 0 , "vendor_name" : "Microsoft", "contact": "jeff@microsoft.com"},
    {"vendor_id" : 1, "vendor_name" : "Intel", "contact": "jeff@intel.com"},
    {"vendor_id" : 2 , "vendor_name" : "Apple", "contact": "jeff@apple.com"}
]

// Object.keys(myArray).length
  

{/* 
        <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="green" class="bi bi-check" viewBox="0 0 16 16">
              <path d="M10.97 4.97a.75.75 0 0 1 1.07 1.05l-3.99 4.99a.75.75 0 0 1-1.08.02L4.324 8.384a.75.75 0 1 1 1.06-1.06l2.094 2.093 3.473-4.425a.267.267 0 0 1 .02-.022z"></path>
            </svg>
        */}
console.log(vendor_details.length, vendor_details[1].vendor_name);


var vendorTable = document.querySelector('.vendorTable')
var tr = document.createElement("tr");

var i = 0;
while(i < vendor_details.length){
    console.log(i);
    var tr = document.createElement("tr");

    var td_id = document.createElement("td");
    var td_name = document.createElement("td");
    var td_contact = document.createElement("td");

    td_id.textContent  = vendor_details[i].vendor_id;
    td_name.textContent  = vendor_details[i].vendor_name;
    td_contact.textContent  = vendor_details[i].contact;

    tr.appendChild(td_id);
    tr.appendChild(td_name);
    tr.appendChild(td_contact);
    vendorTable.appendChild(tr);

    i++;
}
i = 0;

function validateVendorAdd(){
    console.log("delete");
}

function validateVendorUpdate(){

    var uVendorId= document.querySelector('.uVendorId');
    var uVendorCompany= document.querySelector('.uVendorCompany');
    var uVendorEmail= document.querySelector('.uVendorEmail');

    console.log("Vendor Info" + uVendorId.value,uVendorCompany.value, uVendorEmail.value);
    alert("Update Vendor Information");
}

function validateVendorDelete(){
    console.log("delete");
}