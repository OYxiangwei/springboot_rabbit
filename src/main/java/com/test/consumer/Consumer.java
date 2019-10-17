package com.test.consumer;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {
    @RabbitListener(queues = "queue1")
    public void receiveQueue1(String msg){
        System.out.println("消费者queue1 接收到消息:"+ msg);
    }
    @RabbitListener(queues = "queue2")
    public void receiveQueue2(String msg){
        System.out.println("消费者queue2 接收到消息:"+ msg);
    }
}
