package musicosapp

class Banda {
    String nombre
    String genero

    static hasMany = [musicos: Musico, avisos: Aviso]
    static belongsTo = Musico

    static constraints = {
    }
}
