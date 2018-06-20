package musicosapp

class Musico {
    String nombre
    String apellido
    String telefono
    String mail
    String localidad

    static hasMany = [bandas: Banda, intrumentos: Instrumento, generos: Genero,ofrecimientos: Ofrecimiento, expInstrumentos: ExpInstrumento, expBandas: ExpBanda]
    static belongsTo = Banda
    static constraints = {
        nombre blank:false
        apellido blank:false
        telefono blank:true
        mail blank:false
        localidad blank:true
    }
}
