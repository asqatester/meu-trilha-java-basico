package main.java.map.Ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class AgendaEventos {
  private Map<LocalDate, Evento> eventosMap;

  public AgendaEventos() {
    this.eventosMap = new HashMap<>();
  }

  public void adicionarEvento(LocalDate data, String nomeEvento, String descricaoAtracao) {
    eventosMap.put(data, new Evento(nomeEvento, descricaoAtracao));
  }

  public void exibirAgenda() {
    Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
    for (Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()) {
      LocalDate dataEvento = entry.getKey();
      Evento evento = entry.getValue();
      System.out.println("Data: " + dataEvento + ", Evento: " + evento.getNome() + ", Atração: " + evento.getAtracao());
    }
  }

  public void obterProximoEvento() {
	  //entendendo pq não cabe uso dos dois métodos a seguir:
	  //Set<LocalDate> dateSet = eventosMap.keySet();//keySet retorna um Set com todas as chaves
	  //Collection<Evento> values = eventosMap.values();//values retorna uma Coleção com todos os valores
	  //mas veja que esses métodos não "se conhecem", não conseguem estabelecer correspondência chave-valor
	  
	  //outro exemplo inviável para o que desejamos obter, no caso o próximo evento
	 //o método abaixo até retorna um evento, mas não sabemos ainda qual é o próximo evento
	  //eventosMap.get(não sei qual chave passar, pois não sei quando é o próximo evento)
	  
	  
    LocalDate dataAtual = LocalDate.now();//então primeiro preciso da data atual...
    LocalDate proximaData = null;
    Evento proximoEvento = null;
    for (Map.Entry<LocalDate, Evento> entry : eventosMap.entrySet()) {//entrySet sim que retorna chave-valor!
      LocalDate dataEvento = entry.getKey();
      if (dataEvento.isEqual(dataAtual) || dataEvento.isAfter(dataAtual)) {//se dataEvento é hj ou após hj
        proximaData = dataEvento;
        proximoEvento = entry.getValue();
        break;
      }
    }
    if (proximoEvento != null) {
      System.out.println("O próximo evento: " + proximoEvento.getNome() + " acontecerá na data " + proximaData);
    } else {
      System.out.println("Não há eventos futuros na agenda.");
    }
  }

  public static void main(String[] args) {
    AgendaEventos agendaEventos = new AgendaEventos();

    // Adiciona eventos à agenda
    agendaEventos.adicionarEvento(LocalDate.of(2022, Month.JULY, 15), "Conferência de Tecnologia", "Palestrante renomado");
    agendaEventos.adicionarEvento(LocalDate.of(2022, 7, 9), "Workshop de Programação", "Aula prática de desenvolvimento");
    agendaEventos.adicionarEvento(LocalDate.of(2000, 1, 10), "Lançamento de Software", "Demonstração da nova versão");
    agendaEventos.adicionarEvento(LocalDate.of(2023, Month.AUGUST, 28), "Hackathon de Inovação", "Competição de soluções criativas");
    agendaEventos.adicionarEvento(LocalDate.of(2024, 9, 20), "Seminário de Inteligência Artificial", "Discussão sobre IA avançada");
    agendaEventos.adicionarEvento(LocalDate.of(2024, Month.JANUARY, 15), "Fórum de Segurança Digital", "Tendências e melhores práticas em segurança");
    agendaEventos.adicionarEvento(LocalDate.of(2023, Month.MAY, 22), "Encontro de Desenvolvedores", "Novidades e técnicas em desenvolvimento de software");
    agendaEventos.adicionarEvento(LocalDate.of(2022, 11, 5), "Conferência de Marketing Digital", "Estratégias de marketing para o próximo ano");
    agendaEventos.adicionarEvento(LocalDate.of(2023, Month.FEBRUARY, 10), "Webinar de Blockchain", "Aplicações e futuro da tecnologia blockchain");
    agendaEventos.adicionarEvento(LocalDate.of(2024, Month.JULY, 29), "Feira de Tecnologia", "Exposição das últimas inovações tecnológicas");
    agendaEventos.adicionarEvento(LocalDate.of(2023, 10, 12), "Summit de Inteligência Artificial", "Desenvolvimentos recentes em IA");
    agendaEventos.adicionarEvento(LocalDate.of(2024, Month.MARCH, 8), "Workshop de Machine Learning", "Treinamento em técnicas avançadas de aprendizado de máquina");
    agendaEventos.adicionarEvento(LocalDate.of(2022, Month.AUGUST, 18), "Hackathon de Desenvolvimento Sustentável", "Criação de soluções para desafios ambientais");
    agendaEventos.adicionarEvento(LocalDate.of(2023, 4, 25), "Seminário de Big Data", "Estratégias e ferramentas para análise de grandes volumes de dados");
    agendaEventos.adicionarEvento(LocalDate.of(2024, Month.JUNE, 14), "Conferência de Robótica", "Inovações e aplicações em robótica moderna");

    
    
    
    
    // Exibe a agenda completa de eventos
    agendaEventos.exibirAgenda();

    // Obtém e exibe o próximo evento na agenda
    agendaEventos.obterProximoEvento();
  }
}