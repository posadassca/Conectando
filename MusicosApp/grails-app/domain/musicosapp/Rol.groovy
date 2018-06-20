package musicosapp

class Rol {

    String nombre

    static hasOne = [intrumento: Instrumento]
    static hasMany = [avisosVsRoles: AvisoVsRol, expBandas: ExpBanda]

    static constraints = {
        nombre blank:false
    }
}
