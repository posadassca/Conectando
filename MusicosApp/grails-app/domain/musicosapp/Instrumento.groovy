package musicosapp

class Instrumento {
    String nombre

    static hasMany = [musicos: Musico, expInstrumentos: ExpInstrumento, roles:Rol]
    static belongsTo = Musico

    static constraints = {
        nombre blank:false

    }
}
