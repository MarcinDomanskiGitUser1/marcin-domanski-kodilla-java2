package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int userID;
    private final String userName;
    private final char sex;
    private final LocalDate birthDate;
    private final int amountPosts;

    public ForumUser(final int userID, final String userName, final char sex, final int birthDay, final int birthMonth, final int birthYear, final int amountPosts) {
        this.userID = userID;
        this.userName = userName;
        this.sex = sex;
        this.birthDate = LocalDate.of(birthYear, birthMonth, birthDay);
        this.amountPosts = amountPosts;
    }

    public int getUserID() {
        return userID;
    }
    public String getUserName() {
        return userName;
    }
    public char getSex() {
        return sex;
    }
    public LocalDate getBirthDate() {
        return birthDate;
    }
    public int getAmountPosts() {
        return amountPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userID=" + userID +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", birthDate=" + birthDate +
                ", amountPosts=" + amountPosts +
                '}';
    }
}
