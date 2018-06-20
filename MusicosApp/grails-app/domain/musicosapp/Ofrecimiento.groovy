package musicosapp

class Ofrecimiento {
    String titulo
    String detalle
    String onda

    static hasOne = [musico: Musico, genero: Genero]
    static hasMany = [instrumento: Instrumento]

    static belongsTo = Musico


    static constraints = {
        titulo blank:false
        detalle blank:false
        onda blank:true
    }
}
