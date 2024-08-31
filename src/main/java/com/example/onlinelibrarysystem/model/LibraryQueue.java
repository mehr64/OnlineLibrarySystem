package com.example.onlinelibrarysystem.model;

import java.util.LinkedList;
import java.util.Queue;

public class LibraryQueue {
    private Queue<User> userQueue;

    public LibraryQueue() {
        this.userQueue = new LinkedList<>();
    }


    public void addUserToQueue(User user) {
        userQueue.add(user);
        System.out.println("User " + user.getName() + " added to the queue.");
    }

    public User getNextUser() {
        return userQueue.poll();
    }


    public boolean isQueueEmpty() {
        return userQueue.isEmpty();
    }
}

