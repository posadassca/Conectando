package musicosapp

class Musico {
    String nombre
    String apellido

    static hasMany = [bandas: Banda, intrumentos: Instrumento, generos: Genero,ofrecimientos: Ofrecimiento, expInstrumentos: ExpInstrumento, expBandas: ExpBanda]
    static belongsTo = Banda
    static constraints = {
    }
}
