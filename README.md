# Netflix - Enunciado.
<p>
    Netflix ha contactado con la Universidad de Castilla La Mancha porque los estudiantes de
    Ingeniería Informática en la Facultad de Ciencias Sociales de Talavera de Reina han resaltado en
    la asignatura de Fundamentos de Programación II. Esta compañía nos ha pedido que diseñemos
    una aplicación para gestionar la información. Dicha aplicación se desarrollará en Java empleando
    los principios de la programación orientada a objetos. Los requisitos que han pedido son:
    <div>
        1. Esta aplicación, como ya sabemos, tiene vídeos (contenido) en distintos formatos: series
        y películas. Todo el contenido tiene un título y un año de estreno. El título del contenido
        será único y servirá para identificarlo para campañas de marketing. De todos los
        contenidos interesará conocer su duración (en minutos), una pequeña descripción y
        saber si está en tendencias. En el caso de las series, se necesita conocer el número de
        temporadas y número de capítulos. En el caso de las películas, se necesita saber la
        productora y el país de origen.
    </div>
    <div>
        2. Todo el contenido se puede promocionar. No obstante, dependiendo del contenido y
        de cómo se promocionará, costará más o menos.
        <pre>            
            a. En el caso de las películas:
                i. Si se quiere hacer una campaña a través de las redes sociales tendrá un coste de 2.000€.
                ii. Si se quiere poner un cartel en la Puerta del Sol, el coste ascenderá a los 40.000€.
                iii. Si la película está en tendencias, el coste se incrementará un 7%.
            b. En el caso de las series:
                i. Si se quiere hacer una campaña a través de las redes sociales tendrá un coste de 300€ por 
                    el número de temporadas que tenga la serie.
                ii. Si se quiere poner un cartel en la Puerta del Sol, el coste ascenderá a los 700€ por 
                    el número total de capítulos que tenga.
                iii. Si la serie está en tendencias, el coste se incrementará un 6%.            
        </pre>        
    </div>
    <div>
        3. A final de año se tira el dinero por la ventana y se hacen campañas de marketing masivas
        para las películas, donde se promocionarán todas las películas a través de las redes
        sociales. Para ello, se contrata a una empresa de marketing, de la cual interesa conocer
        el nombre de la empresa de marketing, teléfono y precio de campaña de marketing por
        película.
    </div>
    <div>
        4. Ya que poner carteles gigantes de Netflix en lugares emblemáticos de España favorece
        tanto a la ciudad donde se ponga el cartel como a la propia Netflix, se han llegado a
        acuerdos con el ayuntamiento de Madrid para obtener subvenciones. En cualquier caso,
        interesa conocer el nombre de la persona de contacto, su teléfono y la cantidad de
        subvención que concede el ayuntamiento por cartel de película.
            <pre>
                a. Si la película se encuentra en tendencias, la subvención asciende a los 1000€
                    por película promocionada. De lo contrario, serían 750€.
                b. Si la serie se encuentra en tendencias, la subvención asciende a los 750€ por
                    serie promocionada. De lo contrario, serían 650€.        
            </pre>
    </div>
    <div>
        5. Se desea que el sistema permita realizar las siguientes consultas:
        <pre>
            a. Mostrar toda la información del contenido de la plataforma (se proporcionará
                al alumno un fichero con la información del contenido).
            b. Se podrá realizar una promoción de una película o una serie.
            c. Mostrar todas las promociones realizadas.
            d. Mostrar coste de todas las promociones realizadas.
            e. Calcular coste de promoción de una película o serie en concreto.
            f. Calcular el coste de una campaña masiva de marketing.
            g. Calcular la subvención que se obtiene a partir de las películas o series.
        </pre>
    </div>
    <div>
        6. Toda la interacción con el sistema deberá realizarse a través de un menú de opciones.
        La información inicial de las películas y series que ya se encuentran en la plataforma de Netflix
        se proporciona en el fichero “Netflix.txt” que se proporcionará a través de Campus Virtual.
        También se proporcionarán los ficheros “posibles_estrenos_peliculas.txt” y “posibles_estrenos_series.txt” 
        para calcular las distintas estimaciones.
        El programa no distinguirá entre mayúsculas y minúsculas. Se deberán capturar, al menos, las siguientes excepciones:
        <pre>
            • Que los ficheros “Netflix.txt”, “posibles_estrenos_peliculas.txt” y “posibles_estrenos_series.txt” no existan.
            • Si la selección de la opción del menú no está dentro del intervalo de opciones válidas.
                En tal caso, se deberá poder solicitar la opción de nuevo sin abandonar el programa.
            • Si, esperando un dato de tipo numérico, se recibe un dato no numérico.
            • Si cuando se quiere promocionar una serie, el coste de la promoción asciende de los 12.000€. 
        </pre>
    <div>
</p>