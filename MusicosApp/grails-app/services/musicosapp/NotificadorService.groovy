package musicosapp

import grails.gorm.transactions.Transactional
import musicosapp.*

@Transactional
class NotificadorService {

    void enviarNotificacion(Usuario usuario, String titulo, String descripcion) {
        /*
        Envia notificaciones a un usuario
         */

    }

    void enviarMail(String titulo, String cuerpo, String casilla){
        /*
        Envia mails a una casilla de correo
         */
    }
}
