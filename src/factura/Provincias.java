/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factura;

/**
 *
 * @author alumno
 */
public class Provincias {
    private Pais pais;
    private String nombre;
    private String code_area;

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCode_area() {
        return code_area;
    }

    public void setCode_area(String code_area) {
        this.code_area = code_area;
    }

}
