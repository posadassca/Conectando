package musicosapp

class Genero {

    String nombre

    static hasMany = [musicos: Musico, ofrecimientos: Ofrecimiento, bandas: Banda]
    static belongsTo = [Musico, Banda]

    static constraints = {
    }
}
