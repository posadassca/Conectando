package musicosapp

class ExperienciaBanda {

    Date desde
    Date hasta
    Boolean actualidad

    static hasOne = [musico: Musico]
    static belongsTo = Musico

    static constraints = {
        desde blank: false
    }
}
