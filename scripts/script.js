window.onload = async ()=>{
    await getVehicles()
}
function viewCharges(){
    let x = `
    <ol>
        <li>Expired Fitness - ZMW 100</li>
        <li>Expired Issurance - ZMW 230</li>
    </ol>
    `;
    document.getElementById('charges').innerHTML=x;
}

function clearData(){
    let y=``;
    document.getElementById('charges').innerHTML=y;
}

async function getVehicles(){
    let response=await fetch("http://localhost:8080/vehicles")
    let vehicleList = await response.json()
    console.log(vehicleList)
    displayVeh(vehicleList)
}

function displayVeh(data){
    let table = ` <table class="mytable">
        <thead>
            <tr>
                <th>Model</th>
                <th>Name</th>
                <th>Price</th>
            </tr>
        </thead>
        <tbody>`
    data.map(v=>{
        table+=`<tr>
                <td>${v.modelNumber}</td>
                <td>${v.name}</td>
                <td>${v.price}</td>
            </tr>`
    })
    table+=`</tbody>
    </table>`
    document.getElementById("list").innerHTML=table
}