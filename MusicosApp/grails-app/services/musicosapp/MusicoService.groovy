package musicosapp

import grails.gorm.transactions.Transactional


@Transactional
class MusicoService {

    NotificadorService notificador

    def contactarMusico(Ofrecimiento ofrecimiento, Musico musico){
        /*
        Envia notificacion al musico de que alguien quiere contactarlo por un ofrecimiento.
         */
        //como importo el notificador?????

    }

    def contactarMusico() {
        /*
        Contacta al músico directamten
         */
    }
}
