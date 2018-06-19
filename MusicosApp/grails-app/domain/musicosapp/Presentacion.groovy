package musicosapp

class Presentacion {

    String lugar
    Date fecha
    Banda banda

    static belongsTo = Banda

    static constraints = {
    }
}
