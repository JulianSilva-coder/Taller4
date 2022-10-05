package controller;

import connection.Connection_Cloud;
import connection.Connection_Local;

public class AplMain {
    public static void main (String [] args){
        //Controller controller = new Controller();
/**
        Connection_Local local = new Connection_Local();
        local.establecerConexion();
*/
        Connection_Cloud cloud = new Connection_Cloud();
        cloud.establecerConexion();
    }
}
