package musicosapp

import javax.swing.ImageIcon

class Banda {
    String nombre
    String onda
    //esto lo encontré en stackoverflow, es para cargar una imagen como atributo (consultar)
    byte[] image;

    //Relaciones
    static hasMany = [experiencias: ExperienciaBanda]
    //static belongsTo = ExperienciaBanda

    static constraints = {
        image name:"Logo", nullable: true, blank: true, maxSize: 1024 * 1024 * 20; //20MB

    }

}
