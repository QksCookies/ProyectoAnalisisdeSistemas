package co.edu.upb.proyectoanalisisdesistemas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		
		GestionEmpleados gestionEmpleados = new GestionEmpleados();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Empleado empleado1 = new Empleado("Juan Perez", "Cra 10 #23-45", "1234567", "juan.perez@example.com", "Gerente", new Date(), "12345678", 10);
        Empleado empleado2 = new Empleado("Maria Gomez", "Cra 20 #34-56", "9876543", "maria.gomez@example.com", "Asistente", new Date(), "87654321", 21);
        Empleado empleado3 = new Empleado("Pedro Rodriguez", "Cra 30 #45-67", "2345678", "pedro.rodriguez@example.com", "Tecnico", new Date(), "56781234", 32);
		gestionEmpleados.agregarEmpleado(empleado1);
		gestionEmpleados.agregarEmpleado(empleado2);
		gestionEmpleados.agregarEmpleado(empleado3);
        
		GestionClientes gestionClientes = new GestionClientes();
		Cliente cliente1 = new Cliente("001", "123456789", "Juan Perez", "1234", "394782118", "juanperez@gmail.com");
        Cliente cliente2 = new Cliente("002", "987654321", "Maria Rodriguez", "5678", "3026736228", "mariarodriguez@gmail.com");
        Cliente cliente3= new Cliente("003", "109283786", "Omalys King", "9137", "3012785632", "omalysking@hotmail.com");
        gestionClientes.agregarCliente(cliente1);
        gestionClientes.agregarCliente(cliente2);
        gestionClientes.agregarCliente(cliente3);
        
        GestionProveedores gestionProveedores= new GestionProveedores();       
        List<Producto> productos1 = new ArrayList<>();
        productos1.add(new Producto("Bolso Animal", "Bolso de piel, perfecto para lucir con diferentes prendas.",300.000,540));
        productos1.add(new Producto("Cartera Cuero","Cartera de cuero, perfecta para combinarla con diferentes estilos de ropa.",280.000,600));
        productos1.add(new Producto("CorreaAnimal Print","",80.000,780));
        Proveedor proveedor1= new Proveedor("1090", "PaquitaMilk", "paca12", "Calle 15 #24-34", "3017628933", "paquitamilk@hotmail.com",productos1);
        gestionProveedores.agregarProveedor(proveedor1);
        
        List<Producto> productos2= new ArrayList<>();
        productos2.add(new Producto("Sal Marina","",11.000,560));
        productos2.add(new Producto("Azucar Caña","",10.000,760));
        productos2.add(new Producto("Galletas Chocolate","",14.500,820));
        Proveedor proveedor2= new Proveedor("1080", "DistribuidoraCosta", "345634","Calle 17 #10-22", "3002548821", "distribuidoracosta@gmail.com", productos2);
        gestionProveedores.agregarProveedor(proveedor2);
        
        List<Producto> productos3= new ArrayList<>();
        productos3.add(new Producto("Abrigo Lanax","",105.000,890));
        productos3.add(new Producto("Traje de Baño","",76.000,540));
        productos3.add(new Producto("Botas Cuero","",200.000,700));
        Proveedor proveedor3= new Proveedor("1070", "Lanax", "lanax2023","Calle 64 #33-13", "3225437890", "lanax@gmail.com",productos3);
        gestionProveedores.agregarProveedor(proveedor3);
        
        Carrito carrito = new Carrito();
        Inventario inventario= new Inventario();
        
        Producto leche= new Producto("Leche Alqueria","Aporta una gran cantidad de vitaminas y prebióticos ideales para el cuidado de tu familia.",7.550,500);
        inventario.agregarProductoAlimentos(leche);
        Producto mantequilla= new Producto("Mantequilla Rama","Deliciosa para untar en el pan o para cocinar. Envase de 500 gramos.",5.390,500);
        inventario.agregarProductoAlimentos(mantequilla);
        Producto yuca= new Producto("Yuca Costeña","Alimento típico de la costa colombiana y es perfecta para acompañar cualquier comida. Presentación de 300 gramos.",12.350,300);
        inventario.agregarProductoAlimentos(yuca);
        Producto mango= new Producto("Mango Costeño","Fruta deliciosa y jugosa que se puede comer como postre o para refrescarse en un día caluroso. Presentación de 1 kg.",6.140,1000);
        inventario.agregarProductoAlimentos(mango);
        Producto pescado= new Producto("Mojarra","Pescado ideal para preparar en la parrilla o frito. Presentación de 1 kg.",10.200,1000);
        inventario.agregarProductoAlimentos(pescado);
        Producto mariscos= new Producto("Camarones","Se puede utilizar en diferentes platos, como ensaladas, arroces o cócteles. Presentación de 1 kg.",15.500,1000);
        inventario.agregarProductoAlimentos(mariscos);
        Producto guineoVerde= new Producto("Guineo Verde","Fruta rica en potasio y fibra, ideal para preparar platos salados. Presentación de 1 kg.",1.590,1000);
        inventario.agregarProductoAlimentos(guineoVerde);
        Producto arroz= new Producto("Arroz Diana","Marca reconocida por su calidad. Presentación de 250 gramos.",3.000,250);
        inventario.agregarProductoAlimentos(arroz);
        Producto harina= new Producto("Harina Robinson","Harina de trigo para preparar diferentes tipos de panes, tortas o galletas. Presentación de 350 gramos.",2.590,350);
        inventario.agregarProductoAlimentos(harina);
        Producto cafe= new Producto("Cafe Juan Valdez","Marca reconocida por su sabor y aroma. Presentación de 255 gramos.",4.790,255);
        inventario.agregarProductoAlimentos(cafe);
        Producto quesoCosteño= new Producto("Queso Costeño","Queso típico de la región caribeña de Colombia, ideal para preparar platos como arepas, empanadas o simplemente para untar en el pan. Presentación de 250 gramos.",10.000,250);
        inventario.agregarProductoAlimentos(quesoCosteño);
        
		Producto televisor= new Producto("Televisor LG","Modelo de alta calidad y tecnología, ideal para disfrutar de películas, series o deportes en la comodidad del hogar. Presentación de 200 pulgadas.",2000.000,200);
		inventario.agregarProductoElectrodomesticos(televisor);	
		Producto refrigeradora= new Producto("Refrigeradora Samsung","Refrigeradora de alta calidad fabricada por la marca Samsung. Capacidad de 220 litros.",2500.000,220);
		inventario.agregarProductoElectrodomesticos(refrigeradora);		
		Producto horno= new Producto("Horno Oster","Horno de la marca Oster con capacidad de 290 litros y cuenta con múltiples funciones de cocción, como hornear, asar, tostar y gratinar.",1650.000,290);
		inventario.agregarProductoElectrodomesticos(horno);
		Producto cafeteras= new Producto("Cafetera Oster","Perfecta para preparar café en casa de manera fácil y rápida. Cuenta con una capacidad de 400 ml y una potencia de 800 W.",342.000,400);
		inventario.agregarProductoElectrodomesticos(cafeteras);
		Producto licuadora= new Producto("Licuadora Oster","Perfecta para preparar batidos y smoothies. Cuenta con una potencia de 340 W y una capacidad de 1.25 litros.",43.000,340);
		inventario.agregarProductoElectrodomesticos(licuadora);
		Producto aspiradoras= new Producto("Aspiradora Electroluz","Ideal para mantener la casa limpia y libre de polvo y suciedad. Tiene una potencia de 2200 W y una capacidad de 2 litros.",285.000,220);
		inventario.agregarProductoElectrodomesticos(aspiradoras);
		Producto estufas= new Producto("Estufa Romero","Perfecta para cocinar deliciosos platillos. Presenta cuatro quemadores y un horno. Además, su diseño moderno y elegante la hace perfecta para cualquier cocina.",780.000,300);
		inventario.agregarProductoElectrodomesticos(estufas);
		Producto nevera= new Producto("Nevera Samsung","Perfecta para familias grandes y cuenta con características avanzadas como una pantalla táctil y una excelente eficiencia energética. Capacidad de 490 litros.",3160.000,490);
		inventario.agregarProductoElectrodomesticos(nevera);
		Producto lavadoras= new Producto("Lavadora LG","Perfecta para lavar la ropa en casa. Cuenta con una capacidad de 400 litros y una gran cantidad de funciones y programas de lavado.",1500.000,400);
		inventario.agregarProductoElectrodomesticos(lavadoras);
		Producto planchas= new Producto("Planchas Remintong","Perfectas para dejar la ropa impecable. Cuentan con múltiples características, como una base de cerámica y una función de vapor.",260.000,570);
		inventario.agregarProductoElectrodomesticos(planchas);
		
		Producto detergente= new Producto("Detergente Ariel"," Perfecto para lavar la ropa en casa. Muy eficaz para eliminar manchas y suciedad.",23.000,300);
		inventario.agregarProductoLimpieza(detergente);
		Producto jabon= new Producto("Jabon Johnson","Perfecto para el cuidado personal y cuenta con una fragancia suave y agradable.",2.000,500);
		inventario.agregarProductoLimpieza(jabon);
		Producto esponja= new Producto("Esponja","Perfecta para limpiar la casa y eliminar la suciedad. Es muy duradera y resistente.",1.600,600);
		inventario.agregarProductoLimpieza(esponja);
		Producto desinfectante= new Producto("Blancox","Perfecto para mantener la casa libre de gérmenes y bacterias.",18.500,340);
		inventario.agregarProductoLimpieza(desinfectante);
		Producto desodorante= new Producto("Rexona","Producto de cuidado personal que ayuda a controlar el olor corporal durante todo el día. Su fórmula está diseñada para ser suave con la piel y proporcionar una fragancia fresca y agradable.",9.000,450);
		inventario.agregarProductoLimpieza(desodorante);
		Producto toallas= new Producto("Toallas","Toallas de alta calidad, suaves y absorbentes, ideales para su uso en el hogar o en la industria hotelera.",12.000,320);
		inventario.agregarProductoLimpieza(toallas);
		Producto pastadental= new Producto("Colgate","Pasta de dientes de uso diario que ayuda a proteger los dientes contra las caries y el sarro. Su fórmula contiene flúor para fortalecer los dientes y dejar una sensación de limpieza y frescura en la boca.",3.500,500);
		inventario.agregarProductoLimpieza(pastadental);
		Producto guantes= new Producto("Guantes Latex","Guantes de látex resistentes y cómodos que ofrecen protección contra el contacto con sustancias peligrosas, tales como productos químicos y ácidos.",6.300,720);
		inventario.agregarProductoLimpieza(guantes);
		Producto trapeador= new Producto("Trapeador Clarita","Trapeador de alta calidad, fabricado con materiales duraderos y resistentes. Su diseño está pensado para hacer más fácil la tarea de limpieza en el hogar o en la industria.",13.500,320);
		inventario.agregarProductoLimpieza(trapeador);
		Producto escoba= new Producto("Escoba Clarita","Escoba resistente y duradera que ofrece una limpieza eficiente en cualquier superficie. Su diseño ergonómico la hace cómoda de usar y su construcción en materiales de alta calidad garantiza su durabilidad.",13.300,220);
		inventario.agregarProductoLimpieza(escoba);
		
		Producto atornillador= new Producto("Atornillador Universal","Herramienta eléctrica para atornillar y desatornillar con facilidad. Su diseño ergonómico lo hace cómodo de usar y su motor potente garantiza la eficiencia en el trabajo.",10.000,400);
		inventario.agregarProductoFerreteria(atornillador);
		Producto martillo= new Producto("Martillo MaderaMax","Martillo de acero resistente con mango de madera de nogal para ofrecer una larga durabilidad y un agarre comodo.",34.000,430);
		inventario.agregarProductoFerreteria(martillo);
		Producto alicate= new Producto("Alicate Universal","Tienen la boca cuadrada, ligeramente estriada en su interior y con los brazos algo encorvados que sirven para doblar alambre, sujetar pequeñas piezas, etc.",23.500,230);
		inventario.agregarProductoFerreteria(alicate);
		Producto llave= new Producto("Llave Inglesa","Herramienta manual utilizada para apretar y aflojar tuercas y tornillos con cabeza hexagonal. Diseñada para ajustarse a diferentes tamaños de cabeza hexagonal.",11.000,320);
		inventario.agregarProductoFerreteria(llave);
		Producto serrucho= new Producto("Serrucho Costeño","Herramienta de corte manual que se utiliza para cortar madera. Tiene una hoja larga y delgada con dientes afilados que cortan la madera con facilidad.",25.500,450);
		inventario.agregarProductoFerreteria(serrucho);
		Producto broca= new Producto("Broca Max","Herramienta rotativa que se utiliza para hacer agujeros en diferentes materiales como madera, metal o plástico. Esta broca tiene un diseño especial que permite perforar materiales duros con facilidad.",54.000,320);
		inventario.agregarProductoFerreteria(broca);
		Producto tornillo= new Producto("Tornillo","Tornillo funcional de 10 mm",8.500,280);
		inventario.agregarProductoFerreteria(tornillo);
		Producto demoledores= new Producto("Demoledores Broken10","Herramienta eléctrica utilizada para romper y demoler diferentes materiales como concreto, ladrillo y piedra. Esta herramienta es ideal para trabajos de construcción y demolición.",43.000,620);
		inventario.agregarProductoFerreteria(demoledores);
		Producto bombillo= new Producto("Bombillo Fulligth","Bombilla LED de alta eficiencia energética que se utiliza como fuente de luz en hogares y oficinas. Tiene una larga vida útil y un bajo consumo de energía.",7.300,290);
		inventario.agregarProductoFerreteria(bombillo);
		Producto taladro= new Producto("Taladro Xmax","Herramienta eléctrica rotativa que se utiliza para hacer agujeros en diferentes materiales como madera, metal o plástico. Este taladro tiene una alta potencia y está diseñado para trabajos exigentes.",66.000,645);
		inventario.agregarProductoFerreteria(taladro);
		
		Producto escritorio= new Producto("Escritorio Plus","Escritorio es de tamaño estándar y está hecho de materiales de alta calidad para garantizar su durabilidad y resistencia.",240.000,320);
		inventario.agregarProductoHogar(escritorio);
		Producto silla= new Producto("Silla Plus","Silla de plástico resistente y cómoda, ideal para cualquier ocasión, desde reuniones familiares hasta eventos empresariales.",70.500,132);
		inventario.agregarProductoHogar(silla);
		Producto comedor= new Producto("Comedor Plus","Conjunto de mesa y sillas de madera resistente, ideal para comidas en familia y cenas elegantes.",340.000,528);
		inventario.agregarProductoHogar(comedor);
		Producto armario= new Producto("Armario Plus"," Armario de almacenamiento espacioso y resistente, perfecto para guardar ropa y objetos personales.",700.000,863);
		inventario.agregarProductoHogar(armario);
		Producto sofas= new Producto("Sofas Plus","Juego de sofás cómodos y elegantes, ideales para salas de estar y espacios de entretenimiento en el hogar.",300.000,290);
		inventario.agregarProductoHogar(sofas);
		Producto repisas= new Producto("Repisas Plus","Repisas de madera resistentes y decorativas, ideales para mostrar libros, fotos y otros objetos personales.",205.000,650);
		inventario.agregarProductoHogar(repisas);
		Producto organizadores= new Producto("Organizadores Plus","Juego de organizadores de plástico resistentes y duraderos, ideales para guardar y organizar artículos de limpieza y otros productos del hogar.",170.000,450);		
		inventario.agregarProductoHogar(organizadores);
		Producto muebles= new Producto("Muebles Plus","Conjunto de muebles resistentes y elegantes, que incluye sofás, sillas, mesas y otros elementos decorativos para el hogar.",900.000,234);
		inventario.agregarProductoHogar(muebles);
		Producto alfombras= new Producto("Alfombras Plus","Alfombras suaves y cómodas, ideales para añadir un toque de estilo y calidez a cualquier habitación.",200.000,600);
		inventario.agregarProductoHogar(alfombras);
		Producto pinturas= new Producto("Pinturas Plus","Pinturas de alta calidad en una amplia gama de colores y acabados, ideales para proyectos de decoración y renovación del hogar.",30.000,1000);
		inventario.agregarProductoHogar(pinturas);
		
		Producto carros= new Producto("Hot Wheels","Un juguete de carreras en miniatura con un diseño único y detallado, perfecto para los amantes de los coches.",7.300,830);
		inventario.agregarProductoJugueteria(carros);
		Producto pelota= new Producto("Pelota Molten","Una pelota de alta calidad diseñada para deportes como el baloncesto o el voleibol, con un acabado suave y resistente.",56.000,920);
		inventario.agregarProductoJugueteria(pelota);
		Producto patines= new Producto("Patines Rollerblade","Unos patines en línea de alta gama diseñados para patinadores experimentados, con características como ruedas de alto rendimiento y un sistema de cierre seguro.",270.000,1000);
		inventario.agregarProductoJugueteria(patines);
		Producto muñecas= new Producto("Barbie","Una muñeca icónica que ha sido un juguete favorito durante décadas, con una amplia variedad de atuendos y accesorios para elegir.",78.000,780);
		inventario.agregarProductoJugueteria(muñecas);
		Producto peluches= new Producto("Peluche Jellycat","Un suave y adorable peluche con una amplia variedad de animales y personajes para elegir, perfecto para los más pequeños.",25.000,400);
		inventario.agregarProductoJugueteria(peluches);
		Producto uno= new Producto("Uno Mattel","Un juego de cartas clásico y divertido que ha sido un éxito entre amigos y familiares durante décadas.",5.000,1500);
		inventario.agregarProductoJugueteria(uno);
		Producto ajedrez= new Producto("Ajedrez The House of Staunton","Un juego de ajedrez de alta calidad con un diseño elegante y sofisticado, perfecto para los amantes del ajedrez.",75.000,600);
		inventario.agregarProductoJugueteria(ajedrez);
		Producto rompecabezas= new Producto("Rompecabezas BuffaloGames","Un rompecabezas desafiante y gratificante con una amplia variedad de imágenes y niveles de dificultad.",105.000,540);
		inventario.agregarProductoJugueteria(rompecabezas);
		Producto domino= new Producto("Domino Cardinal","Un juego clásico de dominó que es fácil de aprender y jugar para todas las edades.",18.000,340);
		inventario.agregarProductoJugueteria(domino);
		Producto bloques= new Producto("Bloques ConstrucciónX","Un conjunto de bloques de construcción duraderos y versátiles que permiten a los niños construir una amplia variedad de estructuras y formas.",13.500,660);
		inventario.agregarProductoJugueteria(bloques);
		
		Producto celular= new Producto("Xiaomi RedmiNote","Un teléfono inteligente de alta calidad y gran rendimiento de la marca Xiaomi.",980.000,700);
		inventario.agregarProductoTecnologia(celular);
		Producto ipad= new Producto("Ipad Apple","Una tableta de la marca Apple con gran capacidad de almacenamiento y excelente calidad de pantalla.",2560.000,450);
		inventario.agregarProductoTecnologia(ipad);
		Producto portatil= new Producto("Portatil ASUS","Un computador portátil de la marca ASUS, de alta gama y gran rendimiento.",4900.000,890);
		inventario.agregarProductoTecnologia(portatil);
		Producto consola= new Producto("Nintendo Switch","Una consola de videojuegos portátil y versátil, de la marca Nintendo.",5200.000,780);
		inventario.agregarProductoTecnologia(consola);
		Producto audifonos= new Producto("Audifonos Sennheiser","Unos audífonos de alta calidad de la marca Sennheiser, con gran sonido y comodidad.",35.000,760);
		inventario.agregarProductoTecnologia(audifonos);
		Producto proyectores= new Producto("Proyecto Optoma","Un proyector de alta definición de la marca Optoma, ideal para presentaciones o ver películas en casa.",455.000,450);
		inventario.agregarProductoTecnologia(proyectores);
		Producto impresoras= new Producto("Impresora Lexmark","Una impresora de alta calidad de la marca Lexmark, ideal para uso doméstico o en pequeñas empresas.",650.000,660);
		inventario.agregarProductoTecnologia(impresoras);
		Producto cargadores= new Producto("Cargador Anker","Un cargador portátil de la marca Anker, ideal para cargar dispositivos móviles en cualquier lugar.",200.000,540);
		inventario.agregarProductoTecnologia(cargadores);
		Producto mouse= new Producto("Mouse Logitech","Un ratón de la marca Logitech, de alta precisión y comodidad.",78.000,300);
		inventario.agregarProductoTecnologia(mouse);
		Producto computadorEscritorio= new Producto("Computador de Escritorio Dell","Un computador de escritorio de alta calidad de la marca Dell, con gran capacidad de procesamiento y almacenamiento.",3000.000,500);
		inventario.agregarProductoTecnologia(computadorEscritorio);
		
		Producto pijamas= new Producto("Pijamas Totto","Unas pijamas de la marca Totto, cómodas y suaves al tacto.",45.000,320);
		inventario.agregarProductoRopaYAccesorios(pijamas);
		Producto camisa= new Producto("Camisa Adiddas","Una camisa deportiva de la marca Adidas, ideal para hacer ejercicio o para uso diario.",200.000,330);
		inventario.agregarProductoRopaYAccesorios(camisa);
		Producto pantalon= new Producto("Pantalon ClassicJeans","Un pantalón clásico de la marca Jeans, ideal para uso diario o para ocasiones formales.",109.000,440);
		inventario.agregarProductoRopaYAccesorios(pantalon);
		Producto chaqueta= new Producto("Chaqueta Yoyo","Una chaqueta de la marca Yoyo, elegante y de alta calidad.",200.000,660);
		inventario.agregarProductoRopaYAccesorios(chaqueta);
		Producto collar= new Producto("Collar Yanbal","Un collar elegante de la marca Yanbal, ideal para ocasiones especiales.",180.000,770);
		inventario.agregarProductoRopaYAccesorios(collar);
		Producto arete= new Producto("Aretes Yanbal","Unos aretes elegantes de la marca Yanbal, ideales para ocasiones especiales.",155.000,800);
		inventario.agregarProductoRopaYAccesorios(arete);
		Producto zapatos= new Producto("Zapatos Sketchers","Unos zapatos cómodos y de alta calidad de la marca Sketchers, ideales para hacer deporte o para uso diario.",340.000,900);
		inventario.agregarProductoRopaYAccesorios(zapatos);
		Producto gafas= new Producto("Gafas Gucci","Unas gafas de sol elegantes y de alta calidad de la marca Gucci.",500.000,660);
		inventario.agregarProductoRopaYAccesorios(gafas);
		Producto calcetin= new Producto("Calcetines Norma","Unos calcetines de alta calidad de la marca Norma, cómodos y suaves al tacto.",10.000,550);
		inventario.agregarProductoRopaYAccesorios(calcetin);
		Producto sandalias= new Producto("Sandalias Puma","Unas sandalias deportivas y cómodas de la marca Puma, ideales para hacer deporte o para uso diario.",90.000,550);
		inventario.agregarProductoRopaYAccesorios(sandalias);
		
		Producto revistas= new Producto("Revista El Mes","Una revista mensual con temas de actualidad, noticias y entretenimiento.",12.500,600);
		inventario.agregarProductoLibrosYPapeleria(revistas);
		Producto boligrafo= new Producto("Boligrafo PaperMate","Un bolígrafo de alta calidad de la marca Paper Mate, con tinta duradera y suave al escribir.",3.000,700);
		inventario.agregarProductoLibrosYPapeleria(boligrafo);
		Producto cuaderno= new Producto("Cuaderno Staple","Un cuaderno de alta calidad de la marca Staples, ideal para tomar apuntes o escribir.",16.000,800);
		inventario.agregarProductoLibrosYPapeleria(cuaderno);
		Producto marcadores= new Producto("Sharpie","Unos marcadores de alta calidad de la marca Sharpie, ideales para escribir o dibujar con precisión.",7.800,900);
		inventario.agregarProductoLibrosYPapeleria(marcadores);
		Producto blocks= new Producto("Blocks Postit","Unos blocks de notas adhesivas de la marca Post-it, ideales para tomar notas y recordatorios.",8.000,500);
		inventario.agregarProductoLibrosYPapeleria(blocks);
		Producto pintura= new Producto("Pinturas Liquitex","Unas pinturas de alta calidad de la marca Liquitex, ideales para crear arte y dibujos.",2.300,560);
		inventario.agregarProductoLibrosYPapeleria(pintura);
		Producto comics= new Producto("Marvel Comics","Una colección de cómics de la famosa editorial Marvel, que incluye historias de superhéroes como Spider-Man, Iron Man, Capitán América y muchos más.",12.000,760);
		inventario.agregarProductoLibrosYPapeleria(comics);
		Producto carpetas= new Producto("Carpetas Avery","Un conjunto de carpetas de alta calidad para archivar documentos y organizar el espacio de trabajo.",3.400,870);
		inventario.agregarProductoLibrosYPapeleria(carpetas);
		Producto regla= new Producto("Reglas Staedtler","Reglas de medición de precisión hechas por la marca Staedtler, ideales para uso en dibujo técnico o diseño gráfico.",2.000,340);
		inventario.agregarProductoLibrosYPapeleria(regla);
		Producto colores= new Producto("Colores Prismacolor","Juego de lápices de colores Prismacolor de alta calidad, ideales para ilustración y dibujo artístico.",56.000,660);
		inventario.agregarProductoLibrosYPapeleria(colores);
		
		Producto antipulgas= new Producto("Antipulgas Frontline","Un tratamiento para la eliminación de pulgas y garrapatas en perros y gatos.",70.000,240);
		inventario.agregarProductoMascotas(antipulgas);
		Producto arenas= new Producto("Arenas TidyCats","Arena para gatos de la marca Tidy Cats, con excelente capacidad de absorción de olores y fácil de limpiar.",80.000,450);
		inventario.agregarProductoMascotas(arenas);
		Producto collares= new Producto("Collares Adams","Collares para perros hechos por la marca Adams, disponibles en varios tamaños y estilos.",36.000,560);
		inventario.agregarProductoMascotas(collares);
		Producto correas= new Producto("Correas Mendota","Correas para perros fabricadas por la marca Mendota, hechas de materiales duraderos y resistentes.",35.000,570);
		inventario.agregarProductoMascotas(correas);
		Producto shampoo= new Producto("Shampoo Adams","Shampoo para perros hecho por la marca Adams, con fórmulas especiales para diferentes tipos de pelaje y necesidades.",40.000,670);
		inventario.agregarProductoMascotas(shampoo);
		Producto juguete= new Producto("Juguetes KONG","Juguetes para perros hechos de goma resistente, diseñados para estimular la masticación y el juego.",23.000,780);
		inventario.agregarProductoMascotas(juguete);
		Producto comidaperros= new Producto("Comida de Perros Purina","Comida para perros de la marca Purina, con diferentes variedades y fórmulas para cubrir las necesidades nutricionales de los perros.",54.000,900);
		inventario.agregarProductoMascotas(comidaperros);
		Producto comidagatos= new Producto("Comida de Gatos BlueBuffalo","Comida para gatos de la marca Blue Buffalo, con ingredientes de alta calidad y sin aditivos artificiales.",58.000,980);
		inventario.agregarProductoMascotas(comidagatos);
		Producto bebederos= new Producto("Bebederos PetSafe","Bebederos automáticos para mascotas de la marca PetSafe, con diferentes capacidades y tamaños para cubrir las necesidades de cada animal.",31.000,430);
		inventario.agregarProductoMascotas(bebederos);
		Producto camas= new Producto("Camas BarksBar","Camas para perros de la marca BarksBar, con diseños cómodos y duraderos para ofrecer una buena noche de sueño a las mascotas.",61.000,500);
		inventario.agregarProductoMascotas(camas);
		
		Producto vitaminas= new Producto("Centrum Women","un suplemento vitamínico diseñado específicamente para mujeres que ayuda a satisfacer las necesidades nutricionales diarias.",70.000,1000);
		inventario.agregarProductoSaludYMedicamentos(vitaminas);
		Producto paracetamol= new Producto("Paracetamol","Un analgésico y antipirético comúnmente utilizado para aliviar el dolor y reducir la fiebre.",15.000,1400);
		inventario.agregarProductoSaludYMedicamentos(paracetamol);
		Producto dolex= new Producto("Dolex Forte","Un medicamento analgésico que contiene acetaminofén y cafeína, utilizado para aliviar el dolor moderado a intenso.",12.000,990);
		inventario.agregarProductoSaludYMedicamentos(dolex);
		Producto atorvastatina= new Producto("Atorvastatina","Un medicamento que se utiliza para reducir el colesterol y prevenir enfermedades cardiovasculares.",17.000,890);
		inventario.agregarProductoSaludYMedicamentos(atorvastatina);
		Producto desloratadina= new Producto("Desloratadina","Un antihistamínico utilizado para aliviar los síntomas de alergias, como estornudos, picazón en los ojos y la nariz, y erupciones cutáneas.",20.000,980);
		inventario.agregarProductoSaludYMedicamentos(desloratadina);
		Producto bicarbonato= new Producto("Bicarbonato Sodio","Un polvo blanco soluble en agua que se utiliza en muchas aplicaciones, como la limpieza, el horneado y como antiácido para tratar la acidez estomacal.",7.000,780);
		inventario.agregarProductoSaludYMedicamentos(bicarbonato);
		Producto clotrimazol= new Producto("Clotrimazol","Un medicamento antifúngico utilizado para tratar infecciones fúngicas en la piel, como la tiña inguinal y la candidiasis.",35.000,100);
		inventario.agregarProductoSaludYMedicamentos(clotrimazol);
		Producto oceira= new Producto("Oceira","un medicamento utilizado para tratar la hipertensión arterial y la insuficiencia cardíaca.",34.000,450);
		inventario.agregarProductoSaludYMedicamentos(oceira);
		Producto salbutamol= new Producto("Salbutamol","Un broncodilatador utilizado para tratar el asma y otras enfermedades respiratorias.",44.000,780);
		inventario.agregarProductoSaludYMedicamentos(salbutamol);
		Producto ramipril= new Producto("Ramipril","Un medicamento utilizado para tratar la hipertensión arterial y prevenir enfermedades cardiovasculares.",11.000,600);
		inventario.agregarProductoSaludYMedicamentos(ramipril);
		
		int general=0;
		int opcionCliente=0;
		int opcionC1=0;
		int opcionMenu=0;
		int opcionProveedor=0;
		int opcionP1=0;
		int opcionE=0;
		int edad= 0 ;
                int datos=0;
                
		do{
				Scanner scanner= new Scanner(System.in);
				System.out.println("BIENVENIDO A COSTAKING");
				System.out.println("!Bienvenido a nuestra tienda en linea! "
						+ "Aqui encontraras todo lo que necesitas para tu hogar y mas. Ofrecemos una amplia variedad de productos"
						+ " para satisfacer tus necesidades, desde electrodomesticos hasta juguetes para los más pequeños."
						+ " ¿Necesitas productos de limpieza e higiene? ¡Los tenemos! "
						+ "¿Buscas herramientas para realizar reparaciones en casa? "
						+ "Tenemos todo lo necesario en nuestra seccion de ferreteria"
						+ ". Ademas, tambien ofrecemos productos de decoracion para darle un toque especial a tu hogar. "
						+ "¡Explora nuestro catalogo y encuentra todo lo que necesitas en un solo lugar!");
				System.out.println("¿Qué tipo de usuario eres?");
				System.out.println("1.Cliente");
				System.out.println("2.Proveedor");
				System.out.println("3.Empleado");
				System.out.println("4.Informacion");
				System.out.println("5.Salir");
				System.out.println("Ingrese su opción:");
				general=scanner.nextInt();
                                System.out.println("Porfavor proporcione su edad : ");
                                edad=scanner.nextInt();
                                
				
				
                                switch(general){
				case 1: //Cliente
					System.out.println("Has seleccionado la opción de cliente:");
					System.out.println("¿Ya tienes cuenta o deseas registrarte?");
					System.out.println("Queremos informarte que, según la ley colombiana, los menores de 15 años no pueden realizar compras en línea. Nos tomamos muy en serio el cumplimiento de las regulaciones locales y queremos asegurarnos de que nuestros clientes estén al tanto de esta restricción. Si tienes menos de 15 años, por favor, no intentes hacer compras en nuestra tienda virtual. Si tienes alguna pregunta o inquietud, por favor contáctanos y estaremos encantados de ayudarte. Gracias por tu comprensión.");
					System.out.println("1.Iniciar sesión");
					System.out.println("2.Registrase");
					System.out.println("Ingrese su opción:");
					opcionCliente=scanner.nextInt();
					
					switch(opcionCliente){
						case 1: //Iniciar sesion cliente
							System.out.println("Ingrese el código:");
							String codigo= scanner.next();
							System.out.println("Ingrese la cedula:");
							String cedula = scanner.next();

							Cliente cliente = gestionClientes.buscarCliente(codigo,cedula);
							if (cliente== null) {
								System.out.println("No se ha registrado alguien con ese código y cédula.");
							}else{
								System.out.println("Ingrese su contraseña: ");
					            String contrasena = scanner.next();
					            if(cliente.getContrasena().equals(contrasena)) {
					               System.out.println("¡Bienvenido " + cliente.getNombre()+"!");
					               
					               do {
						               System.out.println("¿Qué deseas hacer?");
						               System.out.println("1.Mostrar información de mi perfil");
						               System.out.println("2.Mostrar menu");
						               System.out.println("3.Anterior");
						               System.out.println("Ingrese su opción:");
						               opcionC1=scanner.nextInt();
						               
						               switch(opcionC1){
							               case 1: //Información del perfil del cliente
							            	   System.out.println("---------Perfil---------");
							            	   System.out.println("Código: "+ cliente.getCodigo());
							            	   System.out.println("Cedula: "+ cliente.getCedula());
							            	   System.out.println("Nombre: "+ cliente.getNombre());
							            	   System.out.println("Contraseña: "+ cliente.getContrasena());
							            	   System.out.println("Telefono: "+ cliente.getTelefono());
							            	   System.out.println("Correo Electrónico: "+ cliente.getCorreoElectronico());
							            	   break; //Romper información del perfil cliente
							            	   
							               case 2: //Mostrar menu
							            	   	System.out.println("Bienvenido al Supermercado");
												System.out.println("Selecciona una categoria:");
												System.out.println("1.Alimentos");
												System.out.println("2.Electrodomesticos");
												System.out.println("3.Limpieza e higiene");
												System.out.println("4.Ferreteria");
												System.out.println("5.Decoracion y Hogar");
												System.out.println("6.Jugueteria");
												System.out.println("7.Tecnología");
												System.out.println("8.Ropa y Accesorios");
												System.out.println("9.Libros y Papelería");
												System.out.println("10.Mascotas");
												System.out.println("11.Salud y Medicamentos");
												System.out.println("12.Salir");
												System.out.println("Ingrese su opción:");
												opcionMenu=scanner.nextInt();
												
												switch(opcionMenu) {
													case 1: //Alimentos
														System.out.println("Seleccionaste 'Alimentos'.");
														System.out.println("Productos disponibles:");
														ArrayList<Producto> alimentos = inventario.getAlimentos();
														for (Producto producto : alimentos) {
														    System.out.println(producto.getNombre() + " - Descripción: " + producto.getDescripcion() + " - Precio: $" + producto.getPrecio() + " - Cantidad disponible: " + producto.getCantidadDisponible());
														}
														System.out.println("Ingresa el nombre del producto que deseas comprar:");
														scanner.nextLine();
														String nombreProductoAlimentos = scanner.nextLine().trim();
														int indexProducto = -1;
														
														for (int i = 0; i < alimentos.size(); i++) {
															 
														    if (alimentos.get(i).getNombre().equalsIgnoreCase(nombreProductoAlimentos)) {
														        indexProducto = i;
														        
														        break;
														    }
														}
														if (indexProducto == -1) {
														    System.out.println("Producto no encontrado.");
														    break;
														}
														Producto productoAlimentos = alimentos.get(indexProducto);
														System.out.println("Ingresa la cantidad que deseas comprar:");
														int cantidadAlimentos = scanner.nextInt();
														scanner.nextLine();
														if (cantidadAlimentos > productoAlimentos.getCantidadDisponible()) {
														    System.out.println("Lo siento, no hay suficiente cantidad disponible.");
														    break;
														}
														double totalAlimentos = productoAlimentos.getPrecio() * cantidadAlimentos;
														System.out.println("El total de tu compra es $" + totalAlimentos);
														productoAlimentos.setCantidadDisponible(productoAlimentos.getCantidadDisponible() - cantidadAlimentos);
														carrito.agregarProducto(new Producto(productoAlimentos.getNombre(), productoAlimentos.getDescripcion(), productoAlimentos.getPrecio(), cantidadAlimentos));
														System.out.println("Producto agregado al carrito.");
														System.out.println("¿Deseas seguir comprando o ir al carrito? (comprar/carrito)");
														String respuesta3 = scanner.next().trim();
														if (respuesta3.equalsIgnoreCase("comprar")) {
														    continue;
														} else if (respuesta3.equalsIgnoreCase("carrito")) {
														    carrito.mostrarContenido();
														    System.out.println("¿Deseas confirmar tu compra? (si/no)");
														    String respuesta4 = scanner.next().trim();
														    if (respuesta4.equalsIgnoreCase("si")) {
														        double totalCompra = carrito.calcularTotal();
														        double impuesto= 0.19;
														        System.out.println("El total de tu compra es $" + totalCompra);
														        System.out.println("Impuestos aplicados 19% "+ totalCompra*impuesto);
														        System.out.println("Gracias por tu compra. ¡Hasta la próxima!");
														        System.out.println("------------------------------------");
														        System.out.println("Factura Supermercado COSTAKING");
														        System.out.println("Cliente: " + cliente.getNombre());
														        System.out.println("Cédula: " + cliente.getCedula());
														        System.out.println("Código: " + cliente.getCodigo());
														        System.out.println("------------------------------------");
														        System.out.println("Impuestos: " + totalCompra*impuesto);
														        System.out.println("------------------------------------");
														        System.out.println("Total: " + totalCompra);
														        inventario.actualizarInventario(carrito);
														        carrito.vaciarCarrito();
														        boolean salir = true;
														    } else if (respuesta4.equalsIgnoreCase("no")) {
														        carrito.vaciarCarrito();
														        System.out.println("Carrito vaciado. Volviendo al menú principal...");
														        continue;
														    } else {
														        System.out.println("Opción inválida. Volviendo al menú principal...");
														        continue;
														    }
														} else {
														    System.out.println("Opción inválida. Volviendo al menú principal...");
														    continue;
														}
													break;
													
													case 2: //Electrodomesticos
														System.out.println("Seleccionaste 'Electrodomesticos'.");
														System.out.println("Productos disponibles:");
														ArrayList<Producto> electrodomesticos = inventario.getElectrodomesticos();
														for (Producto producto : electrodomesticos) {
														    System.out.println(producto.getNombre() + " - Descripción: " + producto.getDescripcion() + " - Precio: $" + producto.getPrecio() + " - Cantidad disponible: " + producto.getCantidadDisponible());
														}
														System.out.println("Ingresa el nombre del producto que deseas comprar:");
														scanner.nextLine();
														String nombreProductoElectrodomesticos = scanner.nextLine().trim();
														int indexProducto1 = -1;
														for (int i = 0; i < electrodomesticos.size(); i++) {
														    if (electrodomesticos.get(i).getNombre().equalsIgnoreCase(nombreProductoElectrodomesticos)) {
														        indexProducto1 = i;
														        break;
														    }
														}
														if (indexProducto1 == -1) {
														    System.out.println("Producto no encontrado.");
														    break;
														}
														Producto productoElectrodomesticos = electrodomesticos.get(indexProducto1);
														System.out.println("Ingresa la cantidad que deseas comprar:");
														int cantidadElectrodomesticos = scanner.nextInt();
														scanner.nextLine();
														if (cantidadElectrodomesticos > productoElectrodomesticos.getCantidadDisponible()) {
														    System.out.println("Lo siento, no hay suficiente cantidad disponible.");
														    break;
														}
														double totalElectrodomesticos = productoElectrodomesticos.getPrecio() * cantidadElectrodomesticos;
														System.out.println("El total de tu compra es $" + totalElectrodomesticos);
														productoElectrodomesticos.setCantidadDisponible(productoElectrodomesticos.getCantidadDisponible() - cantidadElectrodomesticos);
														carrito.agregarProducto(new Producto(productoElectrodomesticos.getNombre(), productoElectrodomesticos.getDescripcion(), productoElectrodomesticos.getPrecio(), cantidadElectrodomesticos));
														System.out.println("Producto agregado al carrito.");
														System.out.println("¿Deseas seguir comprando o ir al carrito? (comprar/carrito)");
														String respuesta31 = scanner.next().trim();
														if (respuesta31.equalsIgnoreCase("comprar")) {
														    continue;
														} else if (respuesta31.equalsIgnoreCase("carrito")) {
														    carrito.mostrarContenido();
														    System.out.println("¿Deseas confirmar tu compra? (si/no)");
														    String respuesta4 = scanner.next().trim();
														    if (respuesta4.equalsIgnoreCase("si")) {
														        double totalCompra = carrito.calcularTotal();
														        double impuesto= 0.19;
														        System.out.println("El total de tu compra es $" + totalCompra);
														        System.out.println("Impuestos aplicados 19% "+ totalCompra*impuesto);
														        System.out.println("Gracias por tu compra. ¡Hasta la próxima!");
														        System.out.println("------------------------------------");
														        System.out.println("Factura Supermercado COSTAKING");
														        System.out.println("Cliente: " + cliente.getNombre());
														        System.out.println("Cédula: " + cliente.getCedula());
														        System.out.println("Código: " + cliente.getCodigo());
														        System.out.println("------------------------------------");
														        System.out.println("Impuestos: " + totalCompra*impuesto);
														        System.out.println("------------------------------------");
														        System.out.println("Total: " + totalCompra);
														        inventario.actualizarInventario(carrito);
														        carrito.vaciarCarrito();
														        boolean salir = true;
														    } else if (respuesta4.equalsIgnoreCase("no")) {
														        carrito.vaciarCarrito();
														        System.out.println("Carrito vaciado. Volviendo al menú principal...");
														        continue;
														    } else {
														        System.out.println("Opción inválida. Volviendo al menú principal...");
														        continue;
														    }
														} else {
														    System.out.println("Opción inválida. Volviendo al menú principal...");
														    continue;
														}
													break;	
													
													case 3: //Limpieza e higiene
														System.out.println("Seleccionaste 'LimpiezaEHigiene'.");
														System.out.println("Productos disponibles:");
														ArrayList<Producto> limpiezaEHigiene = inventario.getLimpiezaEHigiene();
														for (Producto producto : limpiezaEHigiene) {
														    System.out.println(producto.getNombre() + " - Descripción: " + producto.getDescripcion() + " - Precio: $" + producto.getPrecio() + " - Cantidad disponible: " + producto.getCantidadDisponible());
														}
														System.out.println("Ingresa el nombre del producto que deseas comprar:");
														scanner.nextLine();
														String nombreProductoLimpiezaEHigiene = scanner.nextLine().trim();
														int indexProducto11 = -1;
														for (int i = 0; i < limpiezaEHigiene.size(); i++) {
														    if (limpiezaEHigiene.get(i).getNombre().equalsIgnoreCase(nombreProductoLimpiezaEHigiene)) {
														        indexProducto11 = i;
														        break;
														    }
														}
														if (indexProducto11 == -1) {
														    System.out.println("Producto no encontrado.");
														    break;
														}
														Producto productoLimpiezaEHigiene = limpiezaEHigiene.get(indexProducto11);
														System.out.println("Ingresa la cantidad que deseas comprar:");
														int cantidadLimpiezaEHigiene = scanner.nextInt();
														scanner.nextLine();
														if (cantidadLimpiezaEHigiene > productoLimpiezaEHigiene.getCantidadDisponible()) {
														    System.out.println("Lo siento, no hay suficiente cantidad disponible.");
														    break;
														}
														double totalLimpiezaEHigiene = productoLimpiezaEHigiene.getPrecio() * cantidadLimpiezaEHigiene;
														System.out.println("El total de tu compra es $" + totalLimpiezaEHigiene);
														productoLimpiezaEHigiene.setCantidadDisponible(productoLimpiezaEHigiene.getCantidadDisponible() - cantidadLimpiezaEHigiene);
														carrito.agregarProducto(new Producto(productoLimpiezaEHigiene.getNombre(), productoLimpiezaEHigiene.getDescripcion(), productoLimpiezaEHigiene.getPrecio(), cantidadLimpiezaEHigiene));
														System.out.println("Producto agregado al carrito.");
														System.out.println("¿Deseas seguir comprando o ir al carrito? (comprar/carrito)");
														String respuesta311 = scanner.next().trim();
														if (respuesta311.equalsIgnoreCase("comprar")) {
														    continue;
														} else if (respuesta311.equalsIgnoreCase("carrito")) {
														    carrito.mostrarContenido();
														    System.out.println("¿Deseas confirmar tu compra? (si/no)");
														    String respuesta4 = scanner.next().trim();
														    if (respuesta4.equalsIgnoreCase("si")) {
														        double totalCompra = carrito.calcularTotal();
														        double impuesto= 0.19;
														        System.out.println("El total de tu compra es $" + totalCompra);
														        System.out.println("Impuestos aplicados 19% "+ totalCompra*impuesto);
														        System.out.println("Gracias por tu compra. ¡Hasta la próxima!");
														        System.out.println("------------------------------------");
														        System.out.println("Factura Supermercado COSTAKING");
														        System.out.println("Cliente: " + cliente.getNombre());
														        System.out.println("Cédula: " + cliente.getCedula());
														        System.out.println("Código: " + cliente.getCodigo());
														        System.out.println("------------------------------------");
														        System.out.println("Impuestos: " + totalCompra*impuesto);
														        System.out.println("------------------------------------");
														        System.out.println("Total: " + totalCompra);
														        inventario.actualizarInventario(carrito);
														        carrito.vaciarCarrito();
														        boolean salir = true;
														    } else if (respuesta4.equalsIgnoreCase("no")) {
														        carrito.vaciarCarrito();
														        System.out.println("Carrito vaciado. Volviendo al menú principal...");
														        continue;
														    } else {
														        System.out.println("Opción inválida. Volviendo al menú principal...");
														        continue;
														    }
														} else {
														    System.out.println("Opción inválida. Volviendo al menú principal...");
														    continue;
														}
													break;	
													
													case 4: //Ferreteria
														System.out.println("Seleccionaste 'Ferreteria'.");
														System.out.println("Productos disponibles:");
														ArrayList<Producto> ferreteria = inventario.getFerreteria();
														for (Producto producto : ferreteria) {
														    System.out.println(producto.getNombre() + " - Descripción: " + producto.getDescripcion() + " - Precio: $" + producto.getPrecio() + " - Cantidad disponible: " + producto.getCantidadDisponible());
														}
														System.out.println("Ingresa el nombre del producto que deseas comprar:");
														scanner.nextLine();
														String nombreProductoFerreteria = scanner.nextLine().trim();
														int indexProducto111 = -1;
														for (int i = 0; i < ferreteria.size(); i++) {
														    if (ferreteria.get(i).getNombre().equalsIgnoreCase(nombreProductoFerreteria)) {
														        indexProducto111 = i;
														        break;
														    }
														}
														if (indexProducto111 == -1) {
														    System.out.println("Producto no encontrado.");
														    break;
														}
														Producto productoFerreteria = ferreteria.get(indexProducto111);
														System.out.println("Ingresa la cantidad que deseas comprar:");
														int cantidadFerreteria = scanner.nextInt();
														scanner.nextLine();
														if (cantidadFerreteria > productoFerreteria.getCantidadDisponible()) {
														    System.out.println("Lo siento, no hay suficiente cantidad disponible.");
														    break;
														}
														double totalFerreteria = productoFerreteria.getPrecio() * cantidadFerreteria;
														System.out.println("El total de tu compra es $" + totalFerreteria);
														productoFerreteria.setCantidadDisponible(productoFerreteria.getCantidadDisponible() - cantidadFerreteria);
														carrito.agregarProducto(new Producto(productoFerreteria.getNombre(), productoFerreteria.getDescripcion(), productoFerreteria.getPrecio(), cantidadFerreteria));
														System.out.println("Producto agregado al carrito.");
														System.out.println("¿Deseas seguir comprando o ir al carrito? (comprar/carrito)");
														String respuesta3111 = scanner.next().trim();
														if (respuesta3111.equalsIgnoreCase("comprar")) {
														    continue;
														} else if (respuesta3111.equalsIgnoreCase("carrito")) {
														    carrito.mostrarContenido();
														    System.out.println("¿Deseas confirmar tu compra? (si/no)");
														    String respuesta4 = scanner.next().trim();
														    if (respuesta4.equalsIgnoreCase("si")) {
														        double totalCompra = carrito.calcularTotal();
														        double impuesto= 0.19;
														        System.out.println("El total de tu compra es $" + totalCompra);
														        System.out.println("Impuestos aplicados 19% "+ totalCompra*impuesto);
														        System.out.println("Gracias por tu compra. ¡Hasta la próxima!");
														        System.out.println("------------------------------------");
														        System.out.println("Factura Supermercado COSTAKING");
														        System.out.println("Cliente: " + cliente.getNombre());
														        System.out.println("Cédula: " + cliente.getCedula());
														        System.out.println("Código: " + cliente.getCodigo());
														        System.out.println("------------------------------------");
														        System.out.println("Impuestos: " + totalCompra*impuesto);
														        System.out.println("------------------------------------");
														        System.out.println("Total: " + totalCompra);
														        inventario.actualizarInventario(carrito);
														        carrito.vaciarCarrito();
														        boolean salir = true;
														    } else if (respuesta4.equalsIgnoreCase("no")) {
														        carrito.vaciarCarrito();
														        System.out.println("Carrito vaciado. Volviendo al menú principal...");
														        continue;
														    } else {
														        System.out.println("Opción inválida. Volviendo al menú principal...");
														        continue;
														    }
														} else {
														    System.out.println("Opción inválida. Volviendo al menú principal...");
														    continue;
														}
													break;	
													
													case 5: //Decoracion y hogar
														System.out.println("Seleccionaste 'DecoracionYHogar'.");
														System.out.println("Productos disponibles:");
														ArrayList<Producto> decoracionYHogar = inventario.getDecoracionYHogar();
														for (Producto producto : decoracionYHogar) {
														    System.out.println(producto.getNombre() + " - Descripción: " + producto.getDescripcion() + " - Precio: $" + producto.getPrecio() + " - Cantidad disponible: " + producto.getCantidadDisponible());
														}
														System.out.println("Ingresa el nombre del producto que deseas comprar:");
														scanner.nextLine();
														String nombreProductoDecoracionYHogar = scanner.nextLine().trim();
														int indexProducto1111 = -1;
														for (int i = 0; i < decoracionYHogar.size(); i++) {
														    if (decoracionYHogar.get(i).getNombre().equalsIgnoreCase(nombreProductoDecoracionYHogar)) {
														        indexProducto1111 = i;
														        break;
														    }
														}
														if (indexProducto1111 == -1) {
														    System.out.println("Producto no encontrado.");
														    break;
														}
														Producto productoDecoracionYHogar = decoracionYHogar.get(indexProducto1111);
														System.out.println("Ingresa la cantidad que deseas comprar:");
														int cantidadDecoracionYHogar = scanner.nextInt();
														scanner.nextLine();
														if (cantidadDecoracionYHogar > productoDecoracionYHogar.getCantidadDisponible()) {
														    System.out.println("Lo siento, no hay suficiente cantidad disponible.");
														    break;
														}
														double totalDecoracionYHogar = productoDecoracionYHogar.getPrecio() * cantidadDecoracionYHogar;
														System.out.println("El total de tu compra es $" + totalDecoracionYHogar);
														productoDecoracionYHogar.setCantidadDisponible(productoDecoracionYHogar.getCantidadDisponible() - cantidadDecoracionYHogar);
														carrito.agregarProducto(new Producto(productoDecoracionYHogar.getNombre(), productoDecoracionYHogar.getDescripcion(), productoDecoracionYHogar.getPrecio(), cantidadDecoracionYHogar));
														System.out.println("Producto agregado al carrito.");
														System.out.println("¿Deseas seguir comprando o ir al carrito? (comprar/carrito)");
														String respuesta31111 = scanner.next().trim();
														if (respuesta31111.equalsIgnoreCase("comprar")) {
														    continue;
														} else if (respuesta31111.equalsIgnoreCase("carrito")) {
														    carrito.mostrarContenido();
														    System.out.println("¿Deseas confirmar tu compra? (si/no)");
														    String respuesta4 = scanner.next().trim();
														    if (respuesta4.equalsIgnoreCase("si")) {
														        double totalCompra = carrito.calcularTotal();
														        double impuesto= 0.19;
														        System.out.println("El total de tu compra es $" + totalCompra);
														        System.out.println("Impuestos aplicados 19% "+ totalCompra*impuesto);
														        System.out.println("Gracias por tu compra. ¡Hasta la próxima!");
														        System.out.println("------------------------------------");
														        System.out.println("Factura Supermercado COSTAKING");
														        System.out.println("Cliente: " + cliente.getNombre());
														        System.out.println("Cédula: " + cliente.getCedula());
														        System.out.println("Código: " + cliente.getCodigo());
														        System.out.println("------------------------------------");
														        System.out.println("Impuestos: " + totalCompra*impuesto);
														        System.out.println("------------------------------------");
														        System.out.println("Total: " + totalCompra);
														        inventario.actualizarInventario(carrito);
														        carrito.vaciarCarrito();
														        boolean salir = true;
														    } else if (respuesta4.equalsIgnoreCase("no")) {
														        carrito.vaciarCarrito();
														        System.out.println("Carrito vaciado. Volviendo al menú principal...");
														        continue;
														    } else {
														        System.out.println("Opción inválida. Volviendo al menú principal...");
														        continue;
														    }
														} else {
														    System.out.println("Opción inválida. Volviendo al menú principal...");
														    continue;
														}
													break;
													
													case 6: //Jugueteria
														System.out.println("Seleccionaste 'Jugueteria'.");
														System.out.println("Productos disponibles:");
														ArrayList<Producto> jugueteria = inventario.getJugueteria();
														for (Producto producto : jugueteria) {
														    System.out.println(producto.getNombre() + " - Descripción: " + producto.getDescripcion() + " - Precio: $" + producto.getPrecio() + " - Cantidad disponible: " + producto.getCantidadDisponible());
														}
														System.out.println("Ingresa el nombre del producto que deseas comprar:");
														scanner.nextLine();
														String nombreProductoJugueteria = scanner.nextLine().trim();
														int indexProducto11111 = -1;
														for (int i = 0; i < jugueteria.size(); i++) {
														    if (jugueteria.get(i).getNombre().equalsIgnoreCase(nombreProductoJugueteria)) {
														        indexProducto11111 = i;
														        break;
														    }
														}
														if (indexProducto11111 == -1) {
														    System.out.println("Producto no encontrado.");
														    break;
														}
														Producto productoJugueteria = jugueteria.get(indexProducto11111);
														System.out.println("Ingresa la cantidad que deseas comprar:");
														int cantidadJugueteria = scanner.nextInt();
														scanner.nextLine();
														if (cantidadJugueteria > productoJugueteria.getCantidadDisponible()) {
														    System.out.println("Lo siento, no hay suficiente cantidad disponible.");
														    break;
														}
														double totalJugueteria = productoJugueteria.getPrecio() * cantidadJugueteria;
														System.out.println("El total de tu compra es $" + totalJugueteria);
														productoJugueteria.setCantidadDisponible(productoJugueteria.getCantidadDisponible() - cantidadJugueteria);
														carrito.agregarProducto(new Producto(productoJugueteria.getNombre(), productoJugueteria.getDescripcion(), productoJugueteria.getPrecio(), cantidadJugueteria));
														System.out.println("Producto agregado al carrito.");
														System.out.println("¿Deseas seguir comprando o ir al carrito? (comprar/carrito)");
														String respuesta311111 = scanner.next().trim();
														if (respuesta311111.equalsIgnoreCase("comprar")) {
														    continue;
														} else if (respuesta311111.equalsIgnoreCase("carrito")) {
														    carrito.mostrarContenido();
														    System.out.println("¿Deseas confirmar tu compra? (si/no)");
														    String respuesta4 = scanner.next().trim();
														    if (respuesta4.equalsIgnoreCase("si")) {
														        double totalCompra = carrito.calcularTotal();
														        double impuesto= 0.19;
														        System.out.println("El total de tu compra es $" + totalCompra);
														        System.out.println("Impuestos aplicados 19% "+ totalCompra*impuesto);
														        System.out.println("Gracias por tu compra. ¡Hasta la próxima!");
														        System.out.println("------------------------------------");
														        System.out.println("Factura Supermercado COSTAKING");
														        System.out.println("Cliente: " + cliente.getNombre());
														        System.out.println("Cédula: " + cliente.getCedula());
														        System.out.println("Código: " + cliente.getCodigo());
														        System.out.println("------------------------------------");
														        System.out.println("Impuestos: " + totalCompra*impuesto);
														        System.out.println("------------------------------------");
														        System.out.println("Total: " + totalCompra);
														        inventario.actualizarInventario(carrito);
														        carrito.vaciarCarrito();
														        boolean salir = true;
														    } else if (respuesta4.equalsIgnoreCase("no")) {
														        carrito.vaciarCarrito();
														        System.out.println("Carrito vaciado. Volviendo al menú principal...");
														        continue;
														    } else {
														        System.out.println("Opción inválida. Volviendo al menú principal...");
														        continue;
														    }
														} else {
														    System.out.println("Opción inválida. Volviendo al menú principal...");
														    continue;
														}
													break;
													
													case 7: //Tecnologia
														System.out.println("Seleccionaste 'Tecnologia'.");
														System.out.println("Productos disponibles:");
														ArrayList<Producto> tecnologia = inventario.getTecnologia();
														for (Producto producto : tecnologia) {
														    System.out.println(producto.getNombre() + " - Descripción: " + producto.getDescripcion() + " - Precio: $" + producto.getPrecio() + " - Cantidad disponible: " + producto.getCantidadDisponible());
														}
														System.out.println("Ingresa el nombre del producto que deseas comprar:");
														scanner.nextLine();
														String nombreProductoTecnologia = scanner.nextLine().trim();
														int indexProducto111111 = -1;
														for (int i = 0; i < tecnologia.size(); i++) {
														    if (tecnologia.get(i).getNombre().equalsIgnoreCase(nombreProductoTecnologia)) {
														        indexProducto111111 = i;
														        break;
														    }
														}
														if (indexProducto111111 == -1) {
														    System.out.println("Producto no encontrado.");
														    break;
														}
														Producto productoTecnologia = tecnologia.get(indexProducto111111);
														System.out.println("Ingresa la cantidad que deseas comprar:");
														int cantidadTecnologia = scanner.nextInt();
														scanner.nextLine();
														if (cantidadTecnologia > productoTecnologia.getCantidadDisponible()) {
														    System.out.println("Lo siento, no hay suficiente cantidad disponible.");
														    break;
														}
														double totalTecnologia = productoTecnologia.getPrecio() * cantidadTecnologia;
														System.out.println("El total de tu compra es $" + totalTecnologia);
														productoTecnologia.setCantidadDisponible(productoTecnologia.getCantidadDisponible() - cantidadTecnologia);
														carrito.agregarProducto(new Producto(productoTecnologia.getNombre(), productoTecnologia.getDescripcion(), productoTecnologia.getPrecio(), cantidadTecnologia));
														System.out.println("Producto agregado al carrito.");
														System.out.println("¿Deseas seguir comprando o ir al carrito? (comprar/carrito)");
														String respuesta3111111 = scanner.next().trim();
														if (respuesta3111111.equalsIgnoreCase("comprar")) {
														    continue;
														} else if (respuesta3111111.equalsIgnoreCase("carrito")) {
														    carrito.mostrarContenido();
														    System.out.println("¿Deseas confirmar tu compra? (si/no)");
														    String respuesta4 = scanner.next().trim();
														    if (respuesta4.equalsIgnoreCase("si")) {
														        double totalCompra = carrito.calcularTotal();
														        double impuesto= 0.19;
														        System.out.println("El total de tu compra es $" + totalCompra);
														        System.out.println("Impuestos aplicados 19% "+ totalCompra*impuesto);
														        System.out.println("Gracias por tu compra. ¡Hasta la próxima!");
														        System.out.println("------------------------------------");
														        System.out.println("Factura Supermercado COSTAKING");
														        System.out.println("Cliente: " + cliente.getNombre());
														        System.out.println("Cédula: " + cliente.getCedula());
														        System.out.println("Código: " + cliente.getCodigo());
														        System.out.println("------------------------------------");
														        System.out.println("Impuestos: " + totalCompra*impuesto);
														        System.out.println("------------------------------------");
														        System.out.println("Total: " + totalCompra);
														        inventario.actualizarInventario(carrito);
														        carrito.vaciarCarrito();
														        boolean salir = true;
														    } else if (respuesta4.equalsIgnoreCase("no")) {
														        carrito.vaciarCarrito();
														        System.out.println("Carrito vaciado. Volviendo al menú principal...");
														        continue;
														    } else {
														        System.out.println("Opción inválida. Volviendo al menú principal...");
														        continue;
														    }
														} else {
														    System.out.println("Opción inválida. Volviendo al menú principal...");
														    continue;
														}
													break;	
													
													case 8: //Ropa y accesorios
														System.out.println("Seleccionaste 'RopaYAccesorios'.");
														System.out.println("Productos disponibles:");
														ArrayList<Producto> ropaYAccesorios = inventario.getRopaYAccesorios();
														for (Producto producto : ropaYAccesorios) {
														    System.out.println(producto.getNombre() + " - Descripción: " + producto.getDescripcion() + " - Precio: $" + producto.getPrecio() + " - Cantidad disponible: " + producto.getCantidadDisponible());
														}
														System.out.println("Ingresa el nombre del producto que deseas comprar:");
														scanner.nextLine();
														String nombreProductoRopaYAccesorios = scanner.nextLine().trim();
														int indexProducto1111111 = -1;
														for (int i = 0; i < ropaYAccesorios.size(); i++) {
														    if (ropaYAccesorios.get(i).getNombre().equalsIgnoreCase(nombreProductoRopaYAccesorios)) {
														        indexProducto1111111 = i;
														        break;
														    }
														}
														if (indexProducto1111111 == -1) {
														    System.out.println("Producto no encontrado.");
														    break;
														}
														Producto productoRopaYAccesorios = ropaYAccesorios.get(indexProducto1111111);
														System.out.println("Ingresa la cantidad que deseas comprar:");
														int cantidadRopaYAccesorios = scanner.nextInt();
														scanner.nextLine();
														if (cantidadRopaYAccesorios > productoRopaYAccesorios.getCantidadDisponible()) {
														    System.out.println("Lo siento, no hay suficiente cantidad disponible.");
														    break;
														}
														double totalRopaYAccesorios = productoRopaYAccesorios.getPrecio() * cantidadRopaYAccesorios;
														System.out.println("El total de tu compra es $" + totalRopaYAccesorios);
														productoRopaYAccesorios.setCantidadDisponible(productoRopaYAccesorios.getCantidadDisponible() - cantidadRopaYAccesorios);
														carrito.agregarProducto(new Producto(productoRopaYAccesorios.getNombre(), productoRopaYAccesorios.getDescripcion(), productoRopaYAccesorios.getPrecio(), cantidadRopaYAccesorios));
														System.out.println("Producto agregado al carrito.");
														System.out.println("¿Deseas seguir comprando o ir al carrito? (comprar/carrito)");
														String respuesta31111111 = scanner.next().trim();
														if (respuesta31111111.equalsIgnoreCase("comprar")) {
														    continue;
														} else if (respuesta31111111.equalsIgnoreCase("carrito")) {
														    carrito.mostrarContenido();
														    System.out.println("¿Deseas confirmar tu compra? (si/no)");
														    String respuesta4 = scanner.next().trim();
														    if (respuesta4.equalsIgnoreCase("si")) {
														        double totalCompra = carrito.calcularTotal();
														        double impuesto= 0.19;
														        System.out.println("El total de tu compra es $" + totalCompra);
														        System.out.println("Impuestos aplicados 19% "+ totalCompra*impuesto);
														        System.out.println("Gracias por tu compra. ¡Hasta la próxima!");
														        System.out.println("------------------------------------");
														        System.out.println("Factura Supermercado COSTAKING");
														        System.out.println("Cliente: " + cliente.getNombre());
														        System.out.println("Cédula: " + cliente.getCedula());
														        System.out.println("Código: " + cliente.getCodigo());
														        System.out.println("------------------------------------");
														        System.out.println("Impuestos: " + totalCompra*impuesto);
														        System.out.println("------------------------------------");
														        System.out.println("Total: " + totalCompra);
														        inventario.actualizarInventario(carrito);
														        carrito.vaciarCarrito();
														        boolean salir = true;
														    } else if (respuesta4.equalsIgnoreCase("no")) {
														        carrito.vaciarCarrito();
														        System.out.println("Carrito vaciado. Volviendo al menú principal...");
														        continue;
														    } else {
														        System.out.println("Opción inválida. Volviendo al menú principal...");
														        continue;
														    }
														} else {
														    System.out.println("Opción inválida. Volviendo al menú principal...");
														    continue;
														}
													break;
													
													case 9: //Libros y papeleria
														System.out.println("Seleccionaste 'LibrosYPapeleria'.");
														System.out.println("Productos disponibles:");
														ArrayList<Producto> librosYPapeleria = inventario.getLibrosYPapeleria();
														for (Producto producto : librosYPapeleria) {
														    System.out.println(producto.getNombre() + " - Descripción: " + producto.getDescripcion() + " - Precio: $" + producto.getPrecio() + " - Cantidad disponible: " + producto.getCantidadDisponible());
														}
														System.out.println("Ingresa el nombre del producto que deseas comprar:");
														scanner.nextLine();
														String nombreProductoLibrosYPapeleria = scanner.nextLine().trim();
														int indexProducto11111111 = -1;
														for (int i = 0; i < librosYPapeleria.size(); i++) {
														    if (librosYPapeleria.get(i).getNombre().equalsIgnoreCase(nombreProductoLibrosYPapeleria)) {
														        indexProducto11111111 = i;
														        break;
														    }
														}
														if (indexProducto11111111 == -1) {
														    System.out.println("Producto no encontrado.");
														    break;
														}
														Producto productoLibrosYPapeleria = librosYPapeleria.get(indexProducto11111111);
														System.out.println("Ingresa la cantidad que deseas comprar:");
														int cantidadLibrosYPapeleria = scanner.nextInt();
														scanner.nextLine();
														if (cantidadLibrosYPapeleria > productoLibrosYPapeleria.getCantidadDisponible()) {
														    System.out.println("Lo siento, no hay suficiente cantidad disponible.");
														    break;
														}
														double totalLibrosYPapeleria = productoLibrosYPapeleria.getPrecio() * cantidadLibrosYPapeleria;
														System.out.println("El total de tu compra es $" + totalLibrosYPapeleria);
														productoLibrosYPapeleria.setCantidadDisponible(productoLibrosYPapeleria.getCantidadDisponible() - cantidadLibrosYPapeleria);
														carrito.agregarProducto(new Producto(productoLibrosYPapeleria.getNombre(), productoLibrosYPapeleria.getDescripcion(), productoLibrosYPapeleria.getPrecio(), cantidadLibrosYPapeleria));
														System.out.println("Producto agregado al carrito.");
														System.out.println("¿Deseas seguir comprando o ir al carrito? (comprar/carrito)");
														String respuesta311111111 = scanner.next().trim();
														if (respuesta311111111.equalsIgnoreCase("comprar")) {
														    continue;
														} else if (respuesta311111111.equalsIgnoreCase("carrito")) {
														    carrito.mostrarContenido();
														    System.out.println("¿Deseas confirmar tu compra? (si/no)");
														    String respuesta4 = scanner.next().trim();
														    if (respuesta4.equalsIgnoreCase("si")) {
														        double totalCompra = carrito.calcularTotal();
														        double impuesto= 0.19;
														        System.out.println("El total de tu compra es $" + totalCompra);
														        System.out.println("Impuestos aplicados 19% "+ totalCompra*impuesto);
														        System.out.println("Gracias por tu compra. ¡Hasta la próxima!");
														        System.out.println("------------------------------------");
														        System.out.println("Factura Supermercado COSTAKING");
														        System.out.println("Cliente: " + cliente.getNombre());
														        System.out.println("Cédula: " + cliente.getCedula());
														        System.out.println("Código: " + cliente.getCodigo());
														        System.out.println("------------------------------------");
														        System.out.println("Impuestos: " + totalCompra*impuesto);
														        System.out.println("------------------------------------");
														        System.out.println("Total: " + totalCompra);
														        inventario.actualizarInventario(carrito);
														        carrito.vaciarCarrito();
														        boolean salir = true;
														    } else if (respuesta4.equalsIgnoreCase("no")) {
														        carrito.vaciarCarrito();
														        System.out.println("Carrito vaciado. Volviendo al menú principal...");
														        continue;
														    } else {
														        System.out.println("Opción inválida. Volviendo al menú principal...");
														        continue;
														    }
														} else {
														    System.out.println("Opción inválida. Volviendo al menú principal...");
														    continue;
														}
													break;
													
													case 10: //Mascotas
														System.out.println("Seleccionaste 'Mascotas'.");
														System.out.println("Productos disponibles:");
														ArrayList<Producto> mascotas = inventario.getMascotas();
														for (Producto producto : mascotas) {
														    System.out.println(producto.getNombre() + " - Descripción: " + producto.getDescripcion() + " - Precio: $" + producto.getPrecio() + " - Cantidad disponible: " + producto.getCantidadDisponible());
														}
														System.out.println("Ingresa el nombre del producto que deseas comprar:");
														scanner.nextLine();
														String nombreProductoMascotas = scanner.nextLine().trim();
														int indexProducto111111111 = -1;
														for (int i = 0; i < mascotas.size(); i++) {
														    if (mascotas.get(i).getNombre().equalsIgnoreCase(nombreProductoMascotas)) {
														        indexProducto111111111 = i;
														        break;
														    }
														}
														if (indexProducto111111111 == -1) {
														    System.out.println("Producto no encontrado.");
														    break;
														}
														Producto productoMascotas = mascotas.get(indexProducto111111111);
														System.out.println("Ingresa la cantidad que deseas comprar:");
														int cantidadMascotas = scanner.nextInt();
														scanner.nextLine();
														if (cantidadMascotas > productoMascotas.getCantidadDisponible()) {
														    System.out.println("Lo siento, no hay suficiente cantidad disponible.");
														    break;
														}
														double totalMascotas = productoMascotas.getPrecio() * cantidadMascotas;
														System.out.println("El total de tu compra es $" + totalMascotas);
														productoMascotas.setCantidadDisponible(productoMascotas.getCantidadDisponible() - cantidadMascotas);
														carrito.agregarProducto(new Producto(productoMascotas.getNombre(), productoMascotas.getDescripcion(), productoMascotas.getPrecio(), cantidadMascotas));
														System.out.println("Producto agregado al carrito.");
														System.out.println("¿Deseas seguir comprando o ir al carrito? (comprar/carrito)");
														String respuesta3111111111 = scanner.next().trim();
														if (respuesta3111111111.equalsIgnoreCase("comprar")) {
														    continue;
														} else if (respuesta3111111111.equalsIgnoreCase("carrito")) {
														    carrito.mostrarContenido();
														    System.out.println("¿Deseas confirmar tu compra? (si/no)");
														    String respuesta4 = scanner.next().trim();
														    if (respuesta4.equalsIgnoreCase("si")) {
														        double totalCompra = carrito.calcularTotal();
														        double impuesto= 0.19;
														        System.out.println("El total de tu compra es $" + totalCompra);
														        System.out.println("Impuestos aplicados 19% "+ totalCompra*impuesto);
														        System.out.println("Gracias por tu compra. ¡Hasta la próxima!");
														        System.out.println("------------------------------------");
														        System.out.println("Factura Supermercado COSTAKING");
														        System.out.println("Cliente: " + cliente.getNombre());
														        System.out.println("Cédula: " + cliente.getCedula());
														        System.out.println("Código: " + cliente.getCodigo());
														        System.out.println("------------------------------------");
														        System.out.println("Impuestos: " + totalCompra*impuesto);
														        System.out.println("------------------------------------");
														        System.out.println("Total: " + totalCompra);
														        inventario.actualizarInventario(carrito);
														        carrito.vaciarCarrito();
														        boolean salir = true;
														    } else if (respuesta4.equalsIgnoreCase("no")) {
														        carrito.vaciarCarrito();
														        System.out.println("Carrito vaciado. Volviendo al menú principal...");
														        continue;
														    } else {
														        System.out.println("Opción inválida. Volviendo al menú principal...");
														        continue;
														    }
														} else {
														    System.out.println("Opción inválida. Volviendo al menú principal...");
														    continue;
														}
													break;
													
													case 11: //Salud y medicamentos
														System.out.println("Seleccionaste 'SaludYMedicamentos'.");
														System.out.println("Productos disponibles:");
														ArrayList<Producto> saludYMedicamentos = inventario.getSaludYMedicamentos();
														for (Producto producto : saludYMedicamentos) {
														    System.out.println(producto.getNombre() + " - Descripción: " + producto.getDescripcion() + " - Precio: $" + producto.getPrecio() + " - Cantidad disponible: " + producto.getCantidadDisponible());
														}
														System.out.println("Ingresa el nombre del producto que deseas comprar:");
														scanner.nextLine();
														String nombreSaludYMedicamentos = scanner.nextLine().trim();
														int indexProducto1111111111 = -1;
														for (int i = 0; i < saludYMedicamentos.size(); i++) {
														    if (saludYMedicamentos.get(i).getNombre().equalsIgnoreCase(nombreSaludYMedicamentos)) {
														        indexProducto1111111111 = i;
														        break;
														    }
														}
														if (indexProducto1111111111 == -1) {
														    System.out.println("Producto no encontrado.");
														    break;
														}
														Producto productoSaludYMedicamentos = saludYMedicamentos.get(indexProducto1111111111);
														System.out.println("Ingresa la cantidad que deseas comprar:");
														int cantidadSaludYMedicamentos = scanner.nextInt();
														scanner.nextLine();
														if (cantidadSaludYMedicamentos > productoSaludYMedicamentos.getCantidadDisponible()) {
														    System.out.println("Lo siento, no hay suficiente cantidad disponible.");
														    break;
														}
														double totalSaludYMedicamentos = productoSaludYMedicamentos.getPrecio() * cantidadSaludYMedicamentos;
														System.out.println("El total de tu compra es $" + totalSaludYMedicamentos);
														productoSaludYMedicamentos.setCantidadDisponible(productoSaludYMedicamentos.getCantidadDisponible() - cantidadSaludYMedicamentos);
														carrito.agregarProducto(new Producto(productoSaludYMedicamentos.getNombre(), productoSaludYMedicamentos.getDescripcion(), productoSaludYMedicamentos.getPrecio(), cantidadSaludYMedicamentos));
														System.out.println("Producto agregado al carrito.");
														System.out.println("¿Deseas seguir comprando o ir al carrito? (comprar/carrito)");
														String respuesta31111111111 = scanner.next().trim();
														if (respuesta31111111111.equalsIgnoreCase("comprar")) {
														    continue;
														} else if (respuesta31111111111.equalsIgnoreCase("carrito")) {
														    carrito.mostrarContenido();
														    System.out.println("¿Deseas confirmar tu compra? (si/no)");
														    String respuesta4 = scanner.next().trim();
														    if (respuesta4.equalsIgnoreCase("si")) {
														        double totalCompra = carrito.calcularTotal();
														        double impuesto= 0.19;
														        System.out.println("El total de tu compra es $" + totalCompra);
														        System.out.println("Impuestos aplicados 19% "+ totalCompra*impuesto);
														        System.out.println("Gracias por tu compra. ¡Hasta la próxima!");
														        System.out.println("------------------------------------");
														        System.out.println("Factura Supermercado COSTAKING");
														        System.out.println("Cliente: " + cliente.getNombre());
														        System.out.println("Cédula: " + cliente.getCedula());
														        System.out.println("Código: " + cliente.getCodigo());
														        System.out.println("------------------------------------");
														        System.out.println("Impuestos: " + totalCompra*impuesto);
														        System.out.println("------------------------------------");
														        System.out.println("Total: " + totalCompra);
														        inventario.actualizarInventario(carrito);
														        carrito.vaciarCarrito();
														        boolean salir = true;
														    } else if (respuesta4.equalsIgnoreCase("no")) {
														        carrito.vaciarCarrito();
														        System.out.println("Carrito vaciado. Volviendo al menú principal...");
														        continue;
														    } else {
														        System.out.println("Opción inválida. Volviendo al menú principal...");
														        continue;
														    }
														} else {
														    System.out.println("Opción inválida. Volviendo al menú principal...");
														    continue;
														}
													break;

							             
						               	}
							               case 3: //Anterior
							            	   break; //Romper Mostrar menu
							            
							               default: //Opcion invalida
							            	   break; //Romper opcion invalida
					               }
					               
					            }while(opcionC1!=3);
					               //scanner.close();
					            }else{
					               System.out.println("Contraseña incorrecta.");
					            }
							}
							break; //Romper iniciar seccion cliente.
						
						case 2: //Registrarse cliente
							System.out.println("Ingrese los datos del cliente:");
		                    System.out.print("Código: ");
		                    String codigo1 = scanner.next();
		                    System.out.print("Cédula: ");
		                    String cedula1 = scanner.next();
		                    System.out.print("Nombre: ");
		                    scanner.nextLine();
		                    String nombre = scanner.nextLine();
		                    System.out.print("Contraseña: ");
		                    String contrasena = scanner.next();
		                    System.out.print("Teléfono: ");
		                    String telefono = scanner.next();
		                    System.out.print("Correo electrónico: ");
		                    String correoElectronico = scanner.next();
		                    
		                    Cliente cliente11 = new Cliente(codigo1, cedula1, nombre, contrasena, telefono, correoElectronico);
		                    gestionClientes.agregarCliente(cliente11);
		                    System.out.println("Cliente registrado exitosamente.");
							break; //Romper registrarse cliente
						
						case 3: 
							break;
						
						default: //Opcion invalida
							break; //Romper opcion invalida
					}
					
					break; //Romper cliente
				
					
				case 2: //Proveedor
					System.out.println("Has seleccionado la opción de proveedor:");
					System.out.println("¿Ya tienes cuenta o deseas registrarte?");
					System.out.println("1.Iniciar sesión");
					System.out.println("2.Registrase");
					System.out.println("Ingrese su opción:");
					opcionProveedor=scanner.nextInt();
					
					switch(opcionProveedor){
						case 1: //Iniciar sesion proveedor
							System.out.println("Ingrese el código:");
							String codigo= scanner.next();
							System.out.println("Ingrese el nombre:");
							scanner.nextLine();
							String nombre1= scanner.nextLine();
							
							Proveedor proveedor= gestionProveedores.buscarProveedor(codigo, nombre1);
							if (proveedor== null) {
								System.out.println("No se ha registrado algún proveedor con ese código y nombre.");
							}else{
								System.out.println("Ingrese su contraseña: ");
					            String contrasena = scanner.next();
					        if(proveedor.getContraseña().equals(contrasena)) {
					        	System.out.println("¡Bienvenido " + proveedor.getNombre1()+"!");
					        	
					        	do {
					        		 System.out.println("¿Qué deseas hacer?");
					        		 System.out.println("1.Mostrar información de mi perfil");
					        		 System.out.println("2.Agregar productos");
					        		 System.out.println("3.Anterior");
					        		 System.out.println("Ingrese su opción:");
					        		 opcionP1=scanner.nextInt();
					        		 
					        		 switch(opcionP1){
						        		 case 1: //Información del perfil del proveedor
							            	   System.out.println("---------Perfil---------");
							            	   System.out.println("Código: "+ proveedor.getCodigo());
							            	   System.out.println("Nombre: "+ proveedor.getNombre1());
							            	   System.out.println("Contraseña: "+ proveedor.getContraseña());
							            	   System.out.println("Dirección: "+ proveedor.getDireccion1());
							            	   System.out.println("Telefono: "+ proveedor.getTelefono());
							            	   System.out.println("Correo Electrónico: "+ proveedor.getCorreoElectronico());
							            	   break; //Romper información del perfil proveedor
							            	   
						        		 case 2: //Agregar productos
						        			 	System.out.println("Ingrese el código del proveedor:");
						        			 	String codigo1 = scanner.next();
						        			 	Proveedor proveedor11 = gestionProveedores.buscarProveedor(codigo1, nombre1);
						        			 	if (proveedor11 != null) {
						                         System.out.println("Ingrese el nombre del nuevo producto:");
						                         scanner.nextLine();
						                         String nombre = scanner.nextLine();
						                         System.out.println("Ingrese la descripción del nuevo producto:");
						                         scanner.nextLine();
						                         String descripcion= scanner.nextLine();
						                         System.out.println("Ingrese el precio del nuevo producto:");
						                         double precio= scanner.nextDouble();
						                         System.out.println("Ingrese la cantidad de inventario del nuevo producto:");
						                         int cantidadDisponible= scanner.nextInt();
						                         scanner.nextLine(); // Limpiar el buffer del scanner

						                         //cantidadDisponible = 0;
												 Producto nuevoProducto = new Producto(nombre, descripcion, precio, cantidadDisponible);
						                         proveedor11.getGestionProductos().agregarProducto(nuevoProducto);
						                         System.out.println("Producto agregado con éxito.");
						                     } else {
						                         System.out.println("No se encontró un proveedor con ese código.");
						                     }
						        			 break; //Romper agregar productos
						        			 
						        		 case 3: //salir
						        			 break; //Romper salir
						        			 
						        	     default: //Opción invalida
						        	    	 break; //Romper opción invalida
						        			 
					        		 }
					        	}while(opcionP1!=3);
					        }
							}
						case 2: //Registro Proveedor
							System.out.println("Ingrese los datos del proveedor:");
		                    System.out.print("Código: ");
		                    String codigo1 = scanner.next();
		                    System.out.print("Nombre: ");
		                    scanner.nextLine();
		                    String nombre11 = scanner.nextLine();
		                    System.out.print("Contraseña: ");
		                    String contraseña = scanner.next();
		                    System.out.print("Dirección: ");
		                    scanner.nextLine();
		                    String direccion1 = scanner.nextLine();
		                    System.out.print("Teléfono: ");
		                    String telefono = scanner.next();
		                    System.out.print("Correo electrónico: ");
		                    String correoElectronico = scanner.next();
		                    
		                    Proveedor proveedor32 = new Proveedor(codigo1, nombre11, contraseña, direccion1, telefono, correoElectronico);
		                    gestionProveedores.agregarProveedor(proveedor32);
		                    System.out.println("Proveedor registrado exitosamente.");
		                    break; //Romper registro proveedor	        
							
						default: //Opcion invalida
							break; //Opcion invalida
					}
					
					break; //Romper proveedor
					
				case 3: //Empleado 
					do {
			            System.out.println("¿Qué deseas hacer?");
			            System.out.println("1.Registrar Empleado");
			            System.out.println("2.Salir");
			            System.out.print("Ingrese una opción: ");
			            opcionE = scanner.nextInt();

			            switch (opcionE) {
			                case 1: //Registrarse empleado
			                	System.out.println("Ingrese los datos del empleado:");
			                    System.out.print("Nombre: ");
			                    scanner.nextLine();
			                    String nombre1 = scanner.nextLine();
			                    System.out.print("Código: ");
			                    int codigo1 = scanner.nextInt();
			                    System.out.print("Dirección: ");
			                    scanner.nextLine();
			                    String direccion = scanner.nextLine();
			                    System.out.print("Teléfono: ");
			                    scanner.nextLine();
			                    String telefono = scanner.nextLine();
			                    System.out.print("Correo electrónico: ");
			                    String correoElectronico = scanner.next();
			                    System.out.print("Cargo: ");
			                    scanner.nextLine();
			                    String cargo = scanner.nextLine();
			                    System.out.print("Fecha de contratación (dd/mm/aaaa): ");
			                    String fechaContratacionStr = scanner.next();
							Date fechaContratacion = null;
							try {
								fechaContratacion = new SimpleDateFormat("dd/MM/yyyy").parse(fechaContratacionStr);
							} catch (ParseException e) {
								e.printStackTrace();
							}
			                    System.out.print("Cédula: ");
			                    String cedula = scanner.next();

			                    // Obtener el último código utilizado
			                    int ultimoCodigo = 0;
			                    if (!gestionEmpleados.getEmpleados().isEmpty()) {
			                        Empleado ultimoEmpleado = gestionEmpleados.getEmpleados().get(gestionEmpleados.getEmpleados().size() - 1);
			                        ultimoCodigo = ultimoEmpleado.getCodigo();
			                    }

			                    // Asignar un nuevo código secuencial
			                    int nuevoCodigo = ultimoCodigo + 1;

			                    // Crear el nuevo empleado con el código asignado
			                    Empleado empleado = new Empleado(nombre1, direccion, telefono, correoElectronico, cargo, fechaContratacion, cedula, nuevoCodigo);
			                    gestionEmpleados.agregarEmpleado(empleado);
			                    System.out.println("Empleado registrado exitosamente.");
			                    break;
			                    
			                case 2: //Salir
			                    break; //Romper salir
			                    
			                default: //opcion invalida
			                    System.out.println("Opción inválida.");
			                    break; //Romper opcion invalida
			            }
			        } while (opcionE != 2);
					
					break; //Romper empleado
					
				case 4: int numero;
				System.out.println("digite un numero");
				System.out.println("1-Leer la politica de la empresa");
				System.out.println("2-Leer sobre los creadores del software");
				System.out.println("3-Informacion sobre Atencion al cliente");
				numero=scanner.nextInt();
              switch (numero) {
			
              case 1: System.out.println("Al utilizar nuestro sitio web y tienda en linea, aceptas nuestros terminos y condiciones. Puedes comprar nuestros productos a traves de nuestro sitio web y aceptamos pagos mediante los metodos especificados en el sitio. Nos esforzamos por enviar tus productos dentro de 2-3 dias habiles y ofrecemos envio gratuito dentro de Colombia en compras superiores a $50.000 COP. Los tiempos de entrega pueden variar dependiendo de la ubicacion. Aceptamos devoluciones de articulos nuevos y sin usar dentro de los 30 dias posteriores a la compra. Consulta nuestra pagina de devoluciones para mas informacion. Protegemos tu privacidad y datos personales. Consulta nuestra politica de privacidad para mas informacion. Nos reservamos el derecho de modificar esta politica en cualquier momento sin previo aviso.");
            	  
            	  break;
              case 2:System.out.println("Queremos que sepas que detras de esta plataforma hay un equipo de profesionales comprometidos con brindarte la mejor experiencia de compra en linea. Los creadores de nuestra tienda virtual son Juliana Chavez, Jean Pena, Angie Villarreal, Juan Munoz y Fernando Vega. Ademas, contamos con la colaboracion del profesor Alvaro Hernandez, quien nos ha brindado su experiencia y conocimiento en el desarrollo de esta plataforma. Esperamos que te sientas seguro y confiado al hacer tus compras con nosotros. ¡Gracias por elegirnos!");
            	  
            	  break;
              case 3: System.out.println(" Queremos asegurarnos de brindarte la mejor atencion al cliente posible en nuestra tienda virtual. Por eso, hemos creado una cuenta de Instagram dedicada exclusivamente a la atencion al cliente. Si necesitas ayuda con tu compra, devolucion, o simplemente tienes una pregunta, no dudes en contactarnos a traves de @costaking_tiendavirtual. Tambien puedes comunicarte con nosotros a traves de nuestro numero de telefono +573157419040 o enviarnos un correo electronico a costaking@gmail.com. Estamos aqui para ayudarte en lo que necesites. ¡Gracias por elegir nuestra tienda virtual!");
            	  
            	  break;
              
              
          	  default: //Opcion invalida
          		  
				break; //Romper opcion invalida
			
              }
			    
					
					
					
					break; //Romper salir
					
				default: //Opcion invalida
					break; //Romper opcion invalida
				}
		}while(general!=5);
		System.out.println("Gracias por utilizar nuestro servicio! Esperamos haber superado tus expectativas y haberte brindado una experiencia de compra inolvidable. ¡Te esperamos pronto de vuelta!");
	}
}

