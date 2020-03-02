package com.example.wajih.consumer;

import com.example.wajih.json.Student;

public interface IConsumer {

    void consumeMessage(Student message);
}
