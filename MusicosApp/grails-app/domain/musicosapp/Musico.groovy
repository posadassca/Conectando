package musicosapp

class Musico {

    String nombre
    String apellido
    String localidad
    String mail
    String telefono
    String onda

    static hasMany = [experiencias: ExperienciaBanda]

    static constraints = {
        nombre blank: false
        apellido blank: false
        localidad blank: false
        mail blank: false, email: true
    }
}
