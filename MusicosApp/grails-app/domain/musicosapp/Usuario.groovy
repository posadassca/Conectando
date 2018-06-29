package musicosapp

class Usuario {
    String user
    String pass

    Musico musico

    static constraints = {
        user blank:false, unique:true
        pass blank:false, password:true
        musico nullable:true
    }
}
