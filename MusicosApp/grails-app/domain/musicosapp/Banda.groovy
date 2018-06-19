package musicosapp

class Banda {
    String nombre

    static hasMany = [musicos: Musico, avisos: Aviso, generos: Genero, albumes: Album, prentaciones: Presentacion, expBandas: ExpBanda]
    static belongsTo = Musico

    static constraints = {
    }
}
