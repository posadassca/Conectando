package musicosapp

import grails.util.Environment

class BootStrap {

    def init = { servletContext ->

        //Musicos de prueba
        def billiejoe = new Musico(
                nombre: 'Billie Joe',
                apellido: 'Armstrong',
                telefono: '1549392837',
                mail: 'billiejoe@greenday.com',
                localidad: 'California'
        ).save()
        def mikedirnt = new Musico(
                nombre: 'Mike',
                apellido: 'Dirnt',
                telefono: '1545442131',
                mail: 'mikedirnt@greenday.com',
                localidad: 'California'
        ).save()
        def trecool = new Musico(
                nombre: 'Tre',
                apellido: 'Cool',
                telefono: '1511200248',
                mail: 'trecool@greenday.com',
                localidad: 'California'
        ).save()
        def deryckwhibley = new Musico(
                nombre: 'Deryck',
                apellido: 'Whibley',
                telefono: '1500221177',
                mail: 'deryckwhibley@sum41.com',
                localidad: 'Ontario'
        ).save()
        def conemccaslin = new Musico(
                nombre: 'Cone',
                apellido: 'McCaslin',
                telefono: '1148872552',
                mail: 'conemccaslin@sum41.com',
                localidad: 'Toronto, Ontario'
        ).save()
        def steveo = new Musico(
                nombre: 'Steve',
                apellido: 'O',
                telefono: '02320444112',
                mail: 'steveo@sum41.com',
                localidad: 'Toronto, Ontario'
        ).save()
        def sven= new Musico(
                nombre: 'Sven',
                apellido: 'Whibley',
                telefono: '112222552',
                mail: 'sven@sum41.com',
                localidad: 'Ontario'
        ).save()
        def tomdelounge= new Musico(
                nombre: 'Tom',
                apellido: 'Delounge',
                telefono: '0214578-89',
                mail: 'tomdelounge@blink182.com',
                localidad: 'San Diego, Cafilornia'
        ).save()
        def markhopus= new Musico(
                nombre: 'Mark',
                apellido: 'Hopus',
                telefono: '0002255',
                mail: 'markhopus@blink182.com',
                localidad: 'San Diego, Cafilornia'
        ).save()
        def travisbarker= new Musico(
                nombre: 'Travis',
                apellido: 'Barker',
                telefono: '1530456985-89',
                mail: 'travisbarker@blink182.com',
                localidad: 'San Diego, Cafilornia'
        ).save()

        //Bandas de prueba
        def greenday= new Banda(
                nombre: 'Green Day'
        )
        def sum41= new Banda(
                nombre: 'Sum41'
        )
        def blink182= new Banda(
                nombre: 'Blink 182'
        )

        greenday.addToMusicos(billiejoe)
        greenday.addToMusicos(mikedirnt)
        greenday.addToMusicos(trecool)
        greenday.save()


    }
    def destroy = {
    }
}
