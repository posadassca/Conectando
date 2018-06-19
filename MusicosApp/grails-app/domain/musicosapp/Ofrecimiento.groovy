package musicosapp

class Ofrecimiento {
    String titulo
    String detalle
    String onda

    static hasOne = [musico: Musico, genero: Genero]
    static belongsTo = Musico

    static constraints = {
    }
}
