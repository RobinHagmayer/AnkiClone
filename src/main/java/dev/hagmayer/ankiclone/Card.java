package dev.hagmayer.ankiclone;

import java.time.LocalDate;
import java.util.Objects;

public class Card {
    private final String front;
    private final String back;
    private LocalDate lastReviewed;
    private int reviewInterval;
    private int knowledgeLevel;
    private int timesReviewed;

    public Card(String front, String back) {
        this.front = front;
        this.back = back;
        this.lastReviewed = LocalDate.now();
        this.reviewInterval = 0;
        this.knowledgeLevel = 0;
        this.timesReviewed = 0;
    }

    public String getFront() {
        return front;
    }

    public String getBack() {
        return back;
    }

    public LocalDate getLastReviewed() {
        return lastReviewed;
    }

    public void setLastReviewed(LocalDate lastReviewed) {
        this.lastReviewed = lastReviewed;
    }

    public int getReviewInterval() {
        return reviewInterval;
    }

    public void setReviewInterval(int reviewInterval) {
        this.reviewInterval = reviewInterval;
    }

    public int getKnowledgeLevel() {
        return knowledgeLevel;
    }

    public void setKnowledgeLevel(int knowledgeLevel) {
        this.knowledgeLevel = knowledgeLevel;
    }

    public int getTimesReviewed() {
        return timesReviewed;
    }

    public void setTimesReviewed(int timesReviewed) {
        this.timesReviewed = timesReviewed;
    }

    @Override
    public String toString() {
        return "Card{" +
                "front='" + front + '\'' +
                ", back='" + back + '\'' +
                ", lastReviewed=" + lastReviewed +
                ", reviewInterval=" + reviewInterval +
                ", knowledgeLevel=" + knowledgeLevel +
                ", timesReviewed=" + timesReviewed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return reviewInterval == card.reviewInterval &&
                knowledgeLevel == card.knowledgeLevel &&
                timesReviewed == card.timesReviewed &&
                Objects.equals(front, card.front) &&
                Objects.equals(back, card.back) &&
                Objects.equals(lastReviewed, card.lastReviewed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(front, back, lastReviewed, reviewInterval, knowledgeLevel, timesReviewed);
    }
}
