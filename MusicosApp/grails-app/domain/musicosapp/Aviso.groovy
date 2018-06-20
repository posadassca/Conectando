package musicosapp


class Aviso {
    Date fechaLimite
    String titulo
    String descripcion

    static hasMany = [avisoVsRol: AvisoVsRol]
    static hasOne = [banda: Banda]
    static belongsTo = Banda


    static constraints = {
        titulo blank:false
        descripcion blank:false
        fechaLimite blank:true
    }
}
