package musicosapp

class Musico {
    String nombre
    String apellido
    String generoFavorito
    String instrumento

    static hasMany = [bandas: Banda]

    static constraints = {
    }
}
