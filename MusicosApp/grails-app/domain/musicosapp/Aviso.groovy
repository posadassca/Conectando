package musicosapp


class Aviso {
    Date fechaLimite
    String titulo
    String descripcion

    static hasOne = [banda: Banda]
    static belongsTo = Banda


    static constraints = {
    }
}
