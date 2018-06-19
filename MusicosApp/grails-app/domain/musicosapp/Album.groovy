package musicosapp

class Album {

    String nombre
    Integer año
    //byte[] foto

    static hasMany = [temas: TemaAlbum]
    static hasOne = Banda
    static constraints = {
    }
}
