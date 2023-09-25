package InstanciandoDataHora;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;


//import EnumeracoesComposicoes.java.Order;

//Aula 110
public class Program {

	public static void main(String[] args) throws ParseException {
		//Instanciando data-hora
		/*
		//Pegando a data do sistema e instancia o objeto no tipo LocalDate
		LocalDate d01 = LocalDate.now();
		System.out.println("LocalDate: " + d01);
		
		//Representa uma data e hora
		LocalDateTime d02 = LocalDateTime.now();
		System.out.println("LocalDateTime: " + d02);
		
		//Obtem o instante atual do relógio do sistema.
		Instant d03 = Instant.now();
		System.out.println("Instant: " + d03);
		
		//usado para obter uma instância de LocalDate de uma string "2018-10-23"
		LocalDate d04 = LocalDate.parse("2022-07-20");
		System.out.println("LocalDate Parse: " + d04);
		
		//usado para obter uma instância de LocalDate de uma string "2018-10-23T17:19:33" 
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		System.out.println("LocalDateTime Parse: " + d05);
		
		//usado para obter uma instância de LocalDate de uma string "2018-10-23"
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		System.out.println("Instant Parse: " + d06);
		
		//ajuda a obter uma instancia de Instant a partir de um valor de String passado como parâmetro
		Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00");
		System.out.println("Instant Parse: " + d07);
		
		//Formatador para impressão e análise de objetos de data e hora
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate d08 = LocalDate.parse("20/07/2022", fmt1);
		System.out.println("LocalDate: " + d08);
		
		//Formatador para impressão e análise de objetos de data e hora 
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", fmt2);
		//ou assim
		//LocalDate.parse("20/07/2022", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
		System.out.println("LocalDateTime: " + d09);
		
		//of-> da clsse LocalDate em java é usado para
		//criar uma instância de LocalDate a partir do ano, mês e dia do mês de entrada
		LocalDate d10 = LocalDate.of(2022, 7, 30);
		
		//o método LocalDateTime.of -> obtém uma instância de LocalDateTime 
		//de ano, mês, dia, hora, minuto, segundo e nanossegundo.
		LocalDateTime d11 = LocalDateTime.of(2022, 7, 20, 1, 30);
		System.out.println("LocalDate: " + d10);
		System.out.println("LocalDateTime: " + d11);
		*/
		
		/*
		//111.Convertendo data-hora para texto
		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
		DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;
		
		System.out.println("d04 = " + d04.format(fmt1));
		System.out.println("d04 = " + fmt1.format(d04));
		System.out.println("d04 = " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		System.out.println("d05 = " + d05.format(fmt1));
		System.out.println("d05 = " + d05.format(fmt2));
		System.out.println("d05 = " + d05.format(fmt4));
		
		System.out.println("d06 = " + fmt3.format(d06));
		System.out.println("d06 = " + fmt5.format(d06));
		System.out.println("d06 = " + d06.toString());
		*/
		
		/*
		//Operações importantes com data-hora
		//Convertendo data-hora global para local
		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		
		/*
		for(String s : ZoneId.getAvailableZoneIds()) {
			System.out.println(s);
		}
		
		
		LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
		LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
		LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
		LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));
		
		System.out.println("r1 = " + r1);
		System.out.println("r2 = " + r2);
		System.out.println("r3 = " + r3);
		System.out.println("r4 = " + r4);
		
		//Obter dados de uma data-hora local
		System.out.println("d04 dia = " + d04.getDayOfMonth());
		System.out.println("d04 mês = " + d04.getMonthValue());
		System.out.println("d04 ano = " + d04.getYear());
		System.out.println("d05 hora = " + d05.getHour());
		System.out.println("d05 minute = " + d05.getMinute());
		*/
		
		/*
		//Calculos com data-hora
		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		
		LocalDate pastWeekLocalDate = d04.minusDays(7);
		LocalDate nextWeekLocalDate = d04.plusDays(7);
		
		System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);
		System.out.println("nextWeekLocalDate = " + nextWeekLocalDate);
		
		LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
		LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);
		

		System.out.println("pastWeekLocalDate = " + pastWeekLocalDateTime);
		System.out.println("nextWeekLocalDate = " + nextWeekLocalDateTime);
	
		Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
		Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);
		 
		 System.out.println("pastWeekLocalDate = " + pastWeekInstant);
		 System.out.println("nextWeekLocalDate = " + nextWeekInstant);
		  
		 Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atTime(0,0));
		 Duration t2 = Duration.between(pastWeekLocalDateTime, d05);
		 Duration t3 = Duration.between(pastWeekInstant, d06);
		 Duration t4 = Duration.between(d06, pastWeekInstant);
		 
		 System.out.println("t1 dias = " + t1.toDays());
		 System.out.println("t2 dias = " + t2.toDays());
		 System.out.println("t3 dias = " + t3.toDays());
		 System.out.println("t4 dias = " + t4.toDays());
		 */
		 
		/*
		 //Trabalhando com datas - date
		 SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		 SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		 SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		 sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		 
		 Date x1 = new Date();
		 Date x2 = new Date(System.currentTimeMillis());
		 Date x3 = new Date(0L);
		 Date x4 = new Date(1000L * 60L * 60L * 5L
				 );
		 Date y1 = sdf1.parse("25/06/2018");
		 Date y2 = sdf2.parse("25/06/2018 15:42:07");
		 Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		 
		 System.out.println("y1: " + sdf2.format(y1));
		 System.out.println("y2: " + sdf2.format(y2));
		 System.out.println("y3: " + sdf2.format(y3));
		 System.out.println("\nx1: " + sdf2.format(x1));
		 System.out.println("x2: " + sdf2.format(x2));
		 System.out.println("x3: " + sdf2.format(x3));
		 System.out.println("x4: " + sdf2.format(x4));
		 
		 System.out.println("-------------------------------");
		 
		 System.out.println("y1: " + sdf3.format(y1));
		 System.out.println("y2: " + sdf3.format(y2));
		 System.out.println("y3: " + sdf3.format(y3));
		 System.out.println("\nx1: " + sdf3.format(x1));
		 System.out.println("x2: " + sdf3.format(x2));
		 System.out.println("x3: " + sdf3.format(x3));
		 System.out.println("x4: " + sdf3.format(x4));
		 */
		
		
		 //	OBTENDO UMA UNDIDADE DE TEMPO
		 SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		 
		 Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z)"));
		 
		 System.out.println(sdf.format(d));
		 
		 Calendar cal = Calendar.getInstance();
		 cal.setTime(d);
		 int minutes = cal.get(Calendar.MINUTE);
		 int month = 1 + cal.get(Calendar.MONTH);
		 d = cal.getTime();
		 
		 System.out.println("MINUTES: " + minutes);
		 System.out.println("MONTH: " + month);
		 
		
		
		
		 
		 
		 
		 
	}
}




































