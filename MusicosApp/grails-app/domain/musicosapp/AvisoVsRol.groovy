package musicosapp

class AvisoVsRol {

    Integer añosDeExperiencia

    static hasOne = [rol: Rol, aviso: Aviso]

    static constraints = {
    }
}
