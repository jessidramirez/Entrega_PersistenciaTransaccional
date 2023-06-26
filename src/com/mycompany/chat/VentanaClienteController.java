package com.mycompany.chat;

import Entidades.Cargos;
import Entidades.Ciudades;
import Entidades.Departamentos;
import Entidades.Empleados;
import Entidades.Localizaciones;
import Entidades.Paises;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

public class VentanaClienteController extends Application implements Initializable {

    private Stage stage;
    
    public static void main(String[] args) {
        launch(args);
        
    }
    
    @FXML
    private Tab CARGOS;
    @FXML
    private Tab CIUDADES;
    @FXML
    private Tab DEPARTAMENTOS;
    @FXML
    private Tab EMPLEADOS;
    @FXML
    private Tab LOCACIZACIONES;
    @FXML
    private Tab PAISES;
    @FXML
    private TableView<Cargos> TABLACARGOS;
    @FXML
    private TableView<Localizaciones> TABLALOCALIZACIONES;
    @FXML
    private TableView<Paises> TABLAPAISES;
    @FXML
    private TableView<Ciudades> TABLACIUDADES;
    @FXML
    private TableView<Departamentos> TABLADEPARTAMENTOS;
    @FXML
    private TableView<Empleados> TABLAEMPLEADOS;
    @FXML
    private TextField cargo_id_textfield;
    @FXML
    private TextField cargo_nombre_textfield;
    @FXML
    private TableColumn<Cargos, Integer> id_cargos;
    @FXML
    private TableColumn<Cargos, String> nombre_cargo;
    @FXML
    private TableColumn<Cargos, String> min_cargo;
    @FXML
    private TableColumn<Cargos, String> max_cargo;
    @FXML
    private TableColumn<Ciudades, Integer> id_ciudad;
    @FXML
    private TableColumn<Ciudades, String> nombre_ciudad;
    @FXML
    private TableColumn<Ciudades, Integer> id_pais_ciudad;
    @FXML
    private TableColumn<Departamentos, Integer> id_dept;
    @FXML
    private TableColumn<Departamentos, String> nombre_dept;
    @FXML
    private TableColumn<Departamentos, Integer> id_localizacion_dept;
    @FXML
    private TextField ciudad_id_textfield;
    @FXML
    private TextField ciudad_nombre_textfield;
    @FXML
    private TextField ciudad_pais_id;
    @FXML
    private TextField dept_id_textfield;
    @FXML
    private TextField dept_nombre_textfield;
    @FXML
    private TableColumn<Empleados, Integer> id_empleado;
    @FXML
    private TableColumn<Empleados, String> nombre_empleado;
    @FXML
    private TableColumn<Empleados, String> apellido_empleado;
    @FXML
    private TableColumn<Empleados, String> email_empleado;
    @FXML
    private TableColumn<Empleados, String> fecha_empleado;
    @FXML
    private TableColumn<Empleados, String> sueldo_empleado;
    @FXML
    private TableColumn<Empleados, Integer> cargo_empleado;
    @FXML
    private TableColumn<Empleados, Integer> dept_empleado;
    @FXML
    private TableColumn<Empleados, String> comision_empleado;
    @FXML
    private TableColumn<Localizaciones, Integer> id_localizacion;
    @FXML
    private TableColumn<Localizaciones, String> nombre_localizacion;
    @FXML
    private TableColumn<Localizaciones, Integer> id_ciudad_localizacion;
    @FXML
    private TableColumn<Paises, Integer> id_pais;
    @FXML
    private TableColumn<Paises, String> nombre_pais;
    @FXML
    private TextField empleado_id_textfield;
    @FXML
    private TextField empleado_nombre_textfield;
    @FXML
    private TextField empleado_fecha_textfield;
    @FXML
    private TextField empleado_email_textfield;
    @FXML
    private TextField empleado_sueldo_textfield;
    @FXML
    private TextField empleado_cargo_textfield;
    @FXML
    private TextField empleado_apellido_textfield;
    @FXML
    private TextField empleado_comision_textfield;
    @FXML
    private TextField empleado_dept_textfield;
    @FXML
    private TextField localizacion_id_textfield;
    @FXML
    private TextField localizacion_nombre_textfield;
    @FXML
    private TextField localizacion_ciudad_textfield;
    @FXML
    private TextField pais_id_textfield;
    @FXML
    private TextField pais_nombre_textfield;
    @FXML
    private Button Boton_cargo_insert;
    @FXML
    private Button Boton_cargo_delete;
    @FXML
    private Button Boton_cargo_update;
    @FXML
    private Button Boton_ciudad_insert;
    @FXML
    private Button Boton_ciudad_delete;
    @FXML
    private Button Boton_ciudad_update;
    @FXML
    private Button Boton_dept_insert;
    @FXML
    private Button Boton_dept_delete;
    @FXML
    private Button Boton_dept_update;
    @FXML
    private Button Boton_emp_insert;
    @FXML
    private Button Boton_emp_delete;
    @FXML
    private Button Boton_emp_update;
    @FXML
    private Button Boton_localiz_insert;
    @FXML
    private Button Boton_localiz_delete;
    @FXML
    private Button Boton_localiz_update;
    
    @FXML
    private TextField cargo_sueldoMax_textfield;
    @FXML
    private TextField cargo_sueldoMin_textfield;
    @FXML
    private TextField dept_localiz_id_textfield;
    @FXML
    private Button Boton_pais_insert;
    @FXML
    private Button Boton_pais_delete;
    @FXML
    private Button Boton_pais_update;
    @FXML
    private TableView<Empleados> TABLAEMPLEADOS1;
    @FXML
    private TableColumn<Empleados, Integer> id_empleado1;
    @FXML
    private TableColumn<Empleados, String> nombre_empleado1;
    @FXML
    private TableColumn<Empleados, String> apellido_empleado1;
    @FXML
    private TableColumn<Empleados, String> email_empleado1;
    @FXML
    private TableColumn<Empleados, String> fecha_empleado1;
    @FXML
    private TableColumn<Empleados, String> sueldo_empleado1;
    @FXML
    private TableColumn<Empleados, String> comision_empleado1;
    @FXML
    private TableColumn<Empleados, String> cargo_empleado1;
    @FXML
    private TableColumn<Empleados, String> dept_empleado1;

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("VentanaCliente.fxml"));
        Scene scene = new Scene(root);
        this.stage=stage;
        stage.setTitle("Recursos Humanos");
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        cargo_id_textfield.setDisable(false);
        ciudad_id_textfield.setDisable(false);
        dept_id_textfield.setDisable(false);
        empleado_id_textfield.setDisable(false);
        localizacion_id_textfield.setDisable(false);
        pais_id_textfield.setVisible(false);
        TablaCargos();
        TablaCiudades();
        TablaDepartamentos();
        TablaEmpleados();
        TablaLocalizaciones();
        TablaPaises();
        TablaHistorico();
    }

    @FXML
    private void Insertar(ActionEvent event) {
        String QuerySql="";
        if(event.getSource()==Boton_emp_insert){
            String EMPL_ID = empleado_id_textfield.getText();
            String EMPL_NOMBRE = empleado_nombre_textfield.getText();
            String EMPL_APELLIDO = empleado_apellido_textfield.getText();
            String EMPL_EMAIL= empleado_email_textfield.getText();
            String EMPL_FECHA_NAC = empleado_fecha_textfield.getText();
            String EMPL_SUELDO = empleado_sueldo_textfield.getText();
            String EMPL_COMISION = empleado_comision_textfield.getText();
            String EMPL_CARGO_ID = empleado_cargo_textfield.getText();
            String EMPL_DPTO_ID = empleado_dept_textfield.getText();
            String EMPL_ESTADO = "1";
            
            QuerySql="INSERT INTO POLI001.EMPLEADOS ( EMPL_NOMBRE, EMPL_APELLIDO, EMPL_EMAIL, EMPL_FECHA_NAC, EMPL_SUELDO, EMPL_COMISION, EMPL_CARGO_ID, EMPL_DPTO_ID, EMPL_ESTADO)"
                + "VALUES ('"+EMPL_NOMBRE+"', '"+EMPL_APELLIDO+"', '"+EMPL_EMAIL+"', '"+EMPL_FECHA_NAC+"', '"+EMPL_SUELDO+"', '"+EMPL_COMISION+"',"+EMPL_CARGO_ID+","+EMPL_DPTO_ID+",'"+EMPL_ESTADO+"')";
        }
        
        if(event.getSource()==Boton_cargo_insert){
            String CARGO_NOMBRE = cargo_nombre_textfield.getText();
            String CARGO_SUELDO_MINIMO = cargo_sueldoMin_textfield.getText();
            String CARGO_SUELDO_MAXIMO= cargo_sueldoMax_textfield.getText();
            
            QuerySql="INSERT INTO POLI001.CARGOS ( CARGO_NOMBRE, CARGO_SUELDO_MINIMO, CARGO_SUELDO_MAXIMO)"
                + "VALUES ('"+CARGO_NOMBRE+"', '"+CARGO_SUELDO_MINIMO+"', '"+CARGO_SUELDO_MAXIMO+"')";
        }
        
        if(event.getSource()==Boton_ciudad_insert){
            String CIUD_NOMBRE = ciudad_nombre_textfield.getText();
            String PAISES_PAIS_ID = ciudad_pais_id.getText();
            
            QuerySql="INSERT INTO POLI001.CIUDADES ( CIUD_NOMBRE, PAISES_PAIS_ID)"
                + "VALUES ('"+CIUD_NOMBRE+"', '"+PAISES_PAIS_ID+"')";
        }
        
        if(event.getSource()==Boton_dept_insert){
            String DPTO_NOMBRE = dept_nombre_textfield.getText();
            String DPTO_LOCALIZ_ID = dept_localiz_id_textfield.getText();
            
            QuerySql="INSERT INTO POLI001.DEPARTAMENTOS( DPTO_NOMBRE, DPTO_LOCALIZ_ID)"
                + "VALUES ('"+DPTO_NOMBRE+"', '"+DPTO_LOCALIZ_ID+"')";
        }
        
        if(event.getSource()==Boton_localiz_insert){
            String LOCALIZ_NOMBRE = localizacion_nombre_textfield.getText();
            String CIUDADES_CIUD_ID = localizacion_ciudad_textfield.getText();
            
            QuerySql="INSERT INTO POLI001.LOCALIZACIONES( LOCALIZ_NOMBRE, CIUDADES_CIUD_ID)"
                + "VALUES ('"+LOCALIZ_NOMBRE+"', '"+CIUDADES_CIUD_ID+"')";
        }
        
        if(event.getSource()==Boton_pais_insert){
            String PAIS_NOMBRE = pais_nombre_textfield.getText();
            
            QuerySql="INSERT INTO POLI001.PAISES( PAIS_NOMBRE )"
                + "VALUES ('"+PAIS_NOMBRE+"')";
        }
        
        ejecutarSQL(QuerySql);
    }

    @FXML
    private void Eliminar(ActionEvent event) {
        String QuerySql="";
        if(event.getSource()==Boton_cargo_delete){
            Cargos cargo =TABLACARGOS.getSelectionModel().getSelectedItem();
            QuerySql="DELETE FROM CARGOS WHERE CARGO_ID="+cargo.getCARGO_ID();
        }
        if(event.getSource()==Boton_ciudad_delete){
            Ciudades ciudad =TABLACIUDADES.getSelectionModel().getSelectedItem();
            QuerySql="DELETE FROM CIUDADES WHERE CIUD_ID="+ciudad.getCIUD_ID();
        }
        
        if(event.getSource()==Boton_dept_delete){
            Departamentos dept =TABLADEPARTAMENTOS.getSelectionModel().getSelectedItem();
            QuerySql="DELETE FROM DEPARTAMENTOS WHERE DPTO_ID="+dept.getDPTO_ID();
        }
        
        if(event.getSource()==Boton_emp_delete){
            Empleados emp =TABLAEMPLEADOS.getSelectionModel().getSelectedItem();
            QuerySql="UPDATE POLI001.EMPLEADOS SET EMPL_ESTADO='0'WHERE EMPL_ID ="+emp.getEMPL_ID();
        }
        
        if(event.getSource()==Boton_localiz_delete){
            Localizaciones localiz =TABLALOCALIZACIONES.getSelectionModel().getSelectedItem();
            QuerySql="DELETE FROM LOCALIZACIONES WHERE LOCALIZACIONES_ID="+localiz.getLOCALIZACIONES_ID();
        }
        
        if(event.getSource()==Boton_pais_delete){
            Paises pais =TABLAPAISES.getSelectionModel().getSelectedItem();
            QuerySql="DELETE FROM PAISES WHERE PAIS_ID="+pais.getPAIS_ID();
        }
        
        ejecutarSQL(QuerySql);
        
    }

    @FXML
    private void actualizar(ActionEvent event) {
        String QuerySql="";
        if(event.getSource()==Boton_emp_update){
            String EMPL_ID = empleado_id_textfield.getText();
            String EMPL_NOMBRE = empleado_nombre_textfield.getText();
            String EMPL_APELLIDO = empleado_apellido_textfield.getText();
            String EMPL_EMAIL= empleado_email_textfield.getText();
            String EMPL_FECHA_NAC = empleado_fecha_textfield.getText();
            String EMPL_SUELDO = empleado_sueldo_textfield.getText();
            String EMPL_COMISION = empleado_comision_textfield.getText();
            String EMPL_CARGO_ID = empleado_cargo_textfield.getText();
            String EMPL_DPTO_ID = empleado_dept_textfield.getText();
            
           

            QuerySql="UPDATE POLI001.EMPLEADOS SET EMPL_NOMBRE='"+EMPL_NOMBRE+"', EMPL_APELLIDO='"+EMPL_APELLIDO+
                    "', EMPL_EMAIL='"+EMPL_EMAIL+"', EMPL_FECHA_NAC='"+EMPL_FECHA_NAC+"', EMPL_SUELDO='"+EMPL_SUELDO+
                    "', EMPL_COMISION='"+EMPL_COMISION+"', EMPL_CARGO_ID="+EMPL_CARGO_ID+", EMPL_DPTO_ID="+EMPL_DPTO_ID+" WHERE EMPL_ID ="+EMPL_ID;
        }
        
        if(event.getSource()==Boton_cargo_update){
            String CARGO_ID = cargo_id_textfield.getText();
            String CARGO_NOMBRE = cargo_nombre_textfield.getText();
            String CARGO_SUELDO_MINIMO = cargo_sueldoMin_textfield.getText();
            String CARGO_SUELDO_MAXIMO= cargo_sueldoMax_textfield.getText();
            
            QuerySql="UPDATE POLI001.CARGOS SET CARGO_NOMBRE='"+CARGO_NOMBRE+"', CARGO_SUELDO_MINIMO='"+CARGO_SUELDO_MINIMO+
                    "', CARGO_SUELDO_MAXIMO='"+CARGO_SUELDO_MAXIMO+"' WHERE CARGO_ID ="+CARGO_ID;
        }
        
        if(event.getSource()==Boton_ciudad_update){
            String CIUD_ID= ciudad_id_textfield.getText();
            String CIUD_NOMBRE = ciudad_nombre_textfield.getText();
            String PAISES_PAIS_ID = ciudad_pais_id.getText();
            
            QuerySql="UPDATE POLI001.CIUDADES SET CIUD_NOMBRE='"+CIUD_NOMBRE+"', PAISES_PAIS_ID="+PAISES_PAIS_ID+" WHERE CIUD_ID ="+CIUD_ID;
        }
        
        if(event.getSource()==Boton_dept_update){
            String DPTO_ID = dept_id_textfield.getText();
            String DPTO_NOMBRE = dept_nombre_textfield.getText();
            String DPTO_LOCALIZ_ID = dept_localiz_id_textfield.getText();
            
            QuerySql="UPDATE POLI001.DEPARTAMENTOS SET DPTO_NOMBRE='"+DPTO_NOMBRE+"', DPTO_LOCALIZ_ID="+DPTO_LOCALIZ_ID+" WHERE DPTO_ID ="+DPTO_ID;
        }
        
        if(event.getSource()==Boton_localiz_update){
            String LOCALIZ_ID = localizacion_id_textfield.getText();
            String LOCALIZ_NOMBRE = localizacion_nombre_textfield.getText();
            String CIUDADES_CIUD_ID = localizacion_ciudad_textfield.getText();
            
            QuerySql="UPDATE POLI001.LOCALIZACIONES SET LOCALIZ_NOMBRE='"+LOCALIZ_NOMBRE+"', CIUDADES_CIUD_ID="+CIUDADES_CIUD_ID+" WHERE LOCALIZACIONES_ID ="+LOCALIZ_ID;
        }
        
        if(event.getSource()==Boton_pais_update){
            String PAIS_ID = pais_id_textfield.getText();
            String PAIS_NOMBRE = pais_nombre_textfield.getText();
            
            QuerySql="UPDATE POLI001.PAISES SET PAIS_NOMBRE='"+PAIS_NOMBRE+"' WHERE PAIS_ID ="+PAIS_ID;
        }
        ejecutarSQL(QuerySql);
        
    }
    
    public void TablaCargos(){
        try {
            ConexionOracle c = new ConexionOracle();
            Connection conexion = c.conectar();
            Statement query = conexion.createStatement();
            ResultSet res = query.executeQuery("SELECT * FROM CARGOS");
            ObservableList ol =FXCollections.observableArrayList();
            id_cargos.setCellValueFactory(new PropertyValueFactory<Cargos,Integer>("CARGO_ID"));
            nombre_cargo.setCellValueFactory(new PropertyValueFactory<Cargos,String>("CARGO_NOMBRE"));
            min_cargo.setCellValueFactory(new PropertyValueFactory<Cargos,String>("CARGO_SUELDO_MINIMO"));
            max_cargo.setCellValueFactory(new PropertyValueFactory<Cargos,String>("CARGO_SUELDO_MAXIMO"));
            while(res.next()){
                ol.add(new Cargos(res.getInt("CARGO_ID"),res.getString("CARGO_NOMBRE"), res.getString("CARGO_SUELDO_MINIMO"), res.getString("CARGO_SUELDO_MAXIMO")));
            }
            System.out.println(ol);
            TABLACARGOS.setItems(ol);
        } catch (SQLException ex) {
            Logger.getLogger(VentanaClienteController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    public void TablaCiudades(){
        ConexionOracle c = new ConexionOracle();
        try {
            Connection conexion = c.conectar();
            Statement query = conexion.createStatement();
            ResultSet res = query.executeQuery("SELECT * FROM CIUDADES");
            ObservableList ol =FXCollections.observableArrayList();
            id_ciudad.setCellValueFactory(new PropertyValueFactory<Ciudades,Integer>("CIUD_ID"));
            nombre_ciudad.setCellValueFactory(new PropertyValueFactory<Ciudades,String>("CIUD_NOMBRE"));
            id_pais_ciudad.setCellValueFactory(new PropertyValueFactory<Ciudades,Integer>("PAISES_PAIS_ID"));
            while(res.next()){
                ol.add(new Ciudades(res.getInt("CIUD_ID"),res.getString("CIUD_NOMBRE"),res.getInt("PAISES_PAIS_ID")));
            }
            System.out.println(ol);
            TABLACIUDADES.setItems(ol);
        } catch (SQLException ex) {
            Logger.getLogger(VentanaClienteController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void TablaDepartamentos(){
        ConexionOracle c = new ConexionOracle();
        try {
            Connection conexion = c.conectar();
            Statement query = conexion.createStatement();
            ResultSet res = query.executeQuery("SELECT * FROM DEPARTAMENTOS");
            ObservableList ol =FXCollections.observableArrayList();
            id_dept.setCellValueFactory(new PropertyValueFactory<Departamentos,Integer>("DPTO_ID"));
            nombre_dept.setCellValueFactory(new PropertyValueFactory<Departamentos,String>("DPTO_NOMBRE"));
            id_localizacion_dept.setCellValueFactory(new PropertyValueFactory<Departamentos,Integer>("DPTO_LOCALIZ_ID"));
            while(res.next()){
                ol.add(new Departamentos(res.getInt("DPTO_ID"),res.getString("DPTO_NOMBRE"),res.getInt("DPTO_LOCALIZ_ID")));
            }
            System.out.println(ol);
            TABLADEPARTAMENTOS.setItems(ol);
        } catch (SQLException ex) {
            Logger.getLogger(VentanaClienteController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }   
    public void TablaEmpleados(){
        ConexionOracle c = new ConexionOracle();
        
        id_empleado.setCellValueFactory(new PropertyValueFactory<Empleados,Integer>("EMPL_ID"));
        nombre_empleado.setCellValueFactory(new PropertyValueFactory<Empleados,String>("EMPL_NOMBRE"));
        apellido_empleado.setCellValueFactory(new PropertyValueFactory<Empleados,String>("EMPL_APELLIDO"));
        email_empleado.setCellValueFactory(new PropertyValueFactory<Empleados,String>("EMPL_EMAIL"));
        fecha_empleado.setCellValueFactory(new PropertyValueFactory<Empleados,String>("EMPL_FECHA_NAC"));
        sueldo_empleado.setCellValueFactory(new PropertyValueFactory<Empleados,String>("EMPL_SUELDO"));
        comision_empleado.setCellValueFactory(new PropertyValueFactory<Empleados,String>("EMPL_COMISION"));
        cargo_empleado.setCellValueFactory(new PropertyValueFactory<Empleados,Integer>("EMPL_CARGO_ID"));
        dept_empleado.setCellValueFactory(new PropertyValueFactory<Empleados,Integer>("EMPL_DPTO_ID"));
        
        try {
            Connection conexion = c.conectar();
            Statement query = conexion.createStatement();
            ResultSet res = query.executeQuery("SELECT * FROM EMPLEADOS WHERE EMPL_ESTADO ='1'");
            ObservableList ol =FXCollections.observableArrayList();
            while(res.next()){
                ol.add(new Empleados(
                    res.getInt("EMPL_ID"),
                    res.getString("EMPL_NOMBRE"),
                    res.getString("EMPL_APELLIDO"),
                    res.getString("EMPL_EMAIL"),
                    res.getString("EMPL_FECHA_NAC"),
                    res.getString("EMPL_SUELDO"),
                    res.getString("EMPL_COMISION"),
                    res.getInt("EMPL_CARGO_ID"),
                    res.getInt("EMPL_DPTO_ID")));
            }
            TABLAEMPLEADOS.setItems(ol);
            System.out.println("LLegue");
        } catch (SQLException ex) {
            Logger.getLogger(VentanaClienteController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void TablaHistorico(){
        ConexionOracle c = new ConexionOracle();
        
        id_empleado1.setCellValueFactory(new PropertyValueFactory<Empleados,Integer>("EMPL_ID"));
        nombre_empleado1.setCellValueFactory(new PropertyValueFactory<Empleados,String>("EMPL_NOMBRE"));
        apellido_empleado1.setCellValueFactory(new PropertyValueFactory<Empleados,String>("EMPL_APELLIDO"));
        email_empleado1.setCellValueFactory(new PropertyValueFactory<Empleados,String>("EMPL_EMAIL"));
        fecha_empleado1.setCellValueFactory(new PropertyValueFactory<Empleados,String>("EMPL_FECHA_NAC"));
        sueldo_empleado1.setCellValueFactory(new PropertyValueFactory<Empleados,String>("EMPL_SUELDO"));
        comision_empleado1.setCellValueFactory(new PropertyValueFactory<Empleados,String>("EMPL_COMISION"));
        
        try {
            Connection conexion = c.conectar();
            Statement query = conexion.createStatement();
            ResultSet resHistorico = query.executeQuery("SELECT * FROM EMPLEADOS WHERE EMPL_ESTADO ='0'");
            ObservableList ol1 =FXCollections.observableArrayList();

            while(resHistorico.next()){
                ol1.add(new Empleados(
                    resHistorico.getInt("EMPL_ID"),
                    resHistorico.getString("EMPL_NOMBRE"),
                    resHistorico.getString("EMPL_APELLIDO"),
                    resHistorico.getString("EMPL_EMAIL"),
                    resHistorico.getString("EMPL_FECHA_NAC"),
                    resHistorico.getString("EMPL_SUELDO"),
                    resHistorico.getString("EMPL_COMISION"),
                    resHistorico.getInt("EMPL_CARGO_ID"),
                    resHistorico.getInt("EMPL_DPTO_ID")));
            }
            TABLAEMPLEADOS1.setItems(ol1);
            System.out.println("LLegue");
        } catch (SQLException ex) {
            Logger.getLogger(VentanaClienteController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
    public void TablaLocalizaciones(){
        ConexionOracle c = new ConexionOracle();
        try {
            Connection conexion = c.conectar();
            Statement query = conexion.createStatement();
            ResultSet res = query.executeQuery("SELECT * FROM LOCALIZACIONES");
            ObservableList ol =FXCollections.observableArrayList();
            id_localizacion.setCellValueFactory(new PropertyValueFactory<Localizaciones,Integer>("LOCALIZACIONES_ID"));
            nombre_localizacion.setCellValueFactory(new PropertyValueFactory<Localizaciones,String>("LOCALIZ_NOMBRE"));
            id_ciudad_localizacion.setCellValueFactory(new PropertyValueFactory<Localizaciones,Integer>("CIUDADES_CIUD_ID"));
            while(res.next()){
                ol.add(new Localizaciones(res.getInt("LOCALIZACIONES_ID"),res.getString("LOCALIZ_NOMBRE"),res.getInt("CIUDADES_CIUD_ID")));
            }
            System.out.println(ol);
            TABLALOCALIZACIONES.setItems(ol);
        } catch (SQLException ex) {
            Logger.getLogger(VentanaClienteController.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 
    public void TablaPaises(){
        ConexionOracle c = new ConexionOracle();
        try {
            Connection conexion = c.conectar();
            Statement query = conexion.createStatement();
            ResultSet res = query.executeQuery("SELECT * FROM PAISES");
            ObservableList ol =FXCollections.observableArrayList();
            id_pais.setCellValueFactory(new PropertyValueFactory<Paises,Integer>("PAIS_ID"));
            nombre_pais.setCellValueFactory(new PropertyValueFactory<Paises,String>("PAIS_NOMBRE"));
            while(res.next()){
                ol.add(new Paises(res.getInt("PAIS_ID"),res.getString("PAIS_NOMBRE")));
            }
            System.out.println(ol);
            TABLAPAISES.setItems(ol);
        } catch (SQLException ex) {
            Logger.getLogger(VentanaClienteController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    

    @FXML
    private void SeleccionCargo(MouseEvent event) {
        Cargos cargo =TABLACARGOS.getSelectionModel().getSelectedItem();
        cargo_id_textfield.setText(cargo.getCARGO_ID()+"");
        cargo_nombre_textfield.setText(cargo.getCARGO_NOMBRE());
        cargo_sueldoMin_textfield.setText(cargo.getCARGO_SUELDO_MINIMO());
        cargo_sueldoMax_textfield.setText(cargo.getCARGO_SUELDO_MAXIMO());
    }

    @FXML
    private void SeleccionCiudades(MouseEvent event) {
        Ciudades ciudad =TABLACIUDADES.getSelectionModel().getSelectedItem();
        ciudad_id_textfield.setText(ciudad.getCIUD_ID()+"");
        ciudad_nombre_textfield.setText(ciudad.getCIUD_NOMBRE());
        ciudad_pais_id.setText(ciudad.getPAISES_PAIS_ID()+"");
    }

    @FXML
    private void actualizarDept(MouseEvent event) {
        Departamentos depto =TABLADEPARTAMENTOS.getSelectionModel().getSelectedItem();
        dept_id_textfield.setText(depto.getDPTO_ID()+"");
        dept_nombre_textfield.setText(depto.getDPTO_NOMBRE());
        dept_localiz_id_textfield.setText(depto.getDPTO_LOCALIZ_ID()+"");
        
    }

    @FXML
    private void SeleccionEmpleados(MouseEvent event) {
       Empleados empleado =TABLAEMPLEADOS.getSelectionModel().getSelectedItem();
        empleado_id_textfield.setText(empleado.getEMPL_ID()+"");
        empleado_nombre_textfield.setText(empleado.getEMPL_NOMBRE());
        empleado_apellido_textfield.setText(empleado.getEMPL_APELLIDO());
        empleado_fecha_textfield.setText(empleado.getEMPL_FECHA_NAC());
        empleado_email_textfield.setText(empleado.getEMPL_EMAIL());
        empleado_sueldo_textfield.setText(empleado.getEMPL_SUELDO());
        empleado_cargo_textfield.setText(empleado.getEMPL_CARGO_ID()+"");
        empleado_comision_textfield.setText(empleado.getEMPL_COMISION());
        empleado_dept_textfield.setText(empleado.getEMPL_DPTO_ID()+"");

    }

    @FXML
    private void actualizarLocaliz(MouseEvent event) {
        Localizaciones localizacion =TABLALOCALIZACIONES.getSelectionModel().getSelectedItem();
        localizacion_id_textfield.setText(localizacion.getLOCALIZACIONES_ID()+"");
        localizacion_nombre_textfield.setText(localizacion.getLOCALIZ_NOMBRE());
        localizacion_ciudad_textfield.setText(localizacion.getCIUDADES_CIUD_ID()+"");
    }

    @FXML
    private void actualizarPais(MouseEvent event) {
        Paises pais =TABLAPAISES.getSelectionModel().getSelectedItem();
        pais_id_textfield.setText(pais.getPAIS_ID()+"");
        pais_nombre_textfield.setText(pais.getPAIS_NOMBRE());
    }
    
    private void ejecutarSQL(String sql){
        String a ="";
        ConexionOracle c = new ConexionOracle();
        try {
            Connection conexion = c.conectar();
            Statement query = conexion.createStatement();
            ResultSet res = query.executeQuery(sql);
            
            TablaCargos();
            TablaCiudades();
            TablaDepartamentos();
            TablaEmpleados();
            TablaLocalizaciones();
            TablaPaises();
            TablaHistorico();
            
            a="Se ejecuto correctamente esta acción";
        } catch (SQLException ex) {
            a=ex.getMessage();
            Logger.getLogger(VentanaClienteController.class.getName()).log(Level.SEVERE, null, ex);
        }
        Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setHeaderText(null);
            alert.setTitle("Info");
            alert.setContentText(a);
            alert.showAndWait();
    }
}
