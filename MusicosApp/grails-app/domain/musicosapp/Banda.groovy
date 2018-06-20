package musicosapp

class Banda {
    String nombre

    static hasMany = [generos: Genero, musicos: Musico, avisos: Aviso, albumes: Album, prentaciones: Presentacion, expBandas: ExpBanda]
    static belongsTo = Musico

    static constraints = {
        nombre blank: false
    }
}
