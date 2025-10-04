package com.jpmc.midascore.component;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.jpmc.midascore.foundation.Transaction;

@Service
public class TransactionListener{
    @KafkaListener(topics = "${general.kafka-topic}", groupId = "midas-core")
    public void listen(Transaction transaction){
        System.out.println("Received Transaction:" + transaction);
    }



}