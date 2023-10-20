package Functions;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


public class helpers {
    //Aqui van las funciones para validacion de datos
    
    //Validar el nombre de usuario
    public String User_name(String name){
        if(name.charAt(0) == '@'){
            return name;
        }
        return null;
    }
    
}
