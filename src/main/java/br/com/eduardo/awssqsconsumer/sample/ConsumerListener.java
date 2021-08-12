package br.com.eduardo.awssqsconsumer.sample;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;


@Component
public class ConsumerListener {

   @JmsListener(destination = "${consumer.sqs.message.queue.name}")
    public void messageConsumer(@Payload String message) {

        System.out.println("Mensagem: " + message);
    }
}
