package model;

import java.util.Comparator;
import java.util.PriorityQueue;

public class LibraryPriorityQueue {
    private PriorityQueue<User> priorityUserQueue;

    public LibraryPriorityQueue() {
        this.priorityUserQueue = new PriorityQueue<>(Comparator.comparing(User::getPriority));
    }


    public void addUserToPriorityQueue(User user) {
        priorityUserQueue.add(user);
        System.out.println("User " + user.getName() + " with priority " + user.getPriority() + " added to the priority queue.");
    }


    public User getNextPriorityUser() {
        return priorityUserQueue.poll();
    }


    public boolean isPriorityQueueEmpty() {
        return priorityUserQueue.isEmpty();
    }
}
