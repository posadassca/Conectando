package musicosapp

class ExpInstrumento {
    String  descripcion
    Integer años

    static hasOne = [musico: Musico, intrumento: Instrumento]
    static constraints = {
    }
}
