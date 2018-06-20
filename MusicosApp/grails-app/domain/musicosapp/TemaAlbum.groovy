package musicosapp

class TemaAlbum {

    String nombre
    String duracion

    static hasOne = Album

    static constraints = {
        nombre blank:false
        duracion blank:true

    }
}
