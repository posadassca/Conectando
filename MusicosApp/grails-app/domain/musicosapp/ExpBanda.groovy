package musicosapp

class ExpBanda {

    boolean actualidad
    Date desde
    Date hasta

    static hasOne = [musico: Musico, banda: Banda]
    static hasMany = [roles: Rol]
    static constraints = {
        desde blank:true
        hasta blank:true
    }
}
