package musicosapp

class Presentacion {

    String lugar
    Date fecha

    static hasOne = Banda

    static constraints = {
        lugar blank:false
        fecha blank:true

    }
}
