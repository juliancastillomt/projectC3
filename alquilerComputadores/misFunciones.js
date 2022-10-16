function traerInformacion(){
    $.ajax({
        url: "https://gd433c4abade858-project1.adb.us-phoenix-1.oraclecloudapps.com/ords/admin/computer/computer",
        type: "GET",
        datatype: "json",
        success:function(response){
            console.log(response);
            generarTComputador(response.items);
        }
    });
}

function generarTComputador(items){
    let miTabla ="<table>";
    miTabla += "<th>ID</th><th>Brand</th><th>Model</th><th>Category ID</th><th>Name</th>"
    for(i = 0 ; i < items.length; i++){
        miTabla += "<tr>"
        miTabla += "<td>" + items[i].id + "</td>"
        miTabla += "<td>" + items[i].brand + "</td>"
        miTabla += "<td>" + items[i].model + "</td>"
        miTabla += "<td>" + items[i].category_id + "</td>"
        miTabla += "<td>" + items[i].name + "</td>"
        miTabla += "<td><button>Eliminar</button></td>"
        miTabla += "<td><button>Actualizar</button></td>"
        miTabla += "</tr>"
    }
    miTabla +="</table>";
    $("#resultado").append(miTabla);
    console.log(miTabla);
}

function guardarComputador(){

}

function actualizarComputador(){

}

function eliminarComputador(){

}