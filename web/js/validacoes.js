/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


function validarFormulario(nomeFormulario){
    var formulario = document.getElementById(nomeFormulario);
    
    for (i=0; i<formulario.length; i++) { 
        switch(formulario[i].name){
            case 'nome':
            case 'descricao':
                if(formulario[i].value.trim().length === 0){
                    alert( "Preencha o campo " + formulario[i].name +  " corretamente!" );
                    campo.focus();
                    return false;
                }
                break;
            case 'email':
                break;
        }
    }
    
    
}