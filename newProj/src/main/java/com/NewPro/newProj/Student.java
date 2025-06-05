package com.NewPro.newProj;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@Builder
public class Student {

    private int Id;
    private String name;
    private String las_name;
    private int score;
    private LocalDateTime birthday;

    public void setId(int Id) {
        this.Id = Id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLas_name(String las_name) {
        this.las_name = las_name;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setBirthday(LocalDateTime birthday) {
        this.birthday = birthday;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Student)) return false;
        final Student other = (Student) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.getId() != other.getId()) return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        final Object this$las_name = this.getLas_name();
        final Object other$las_name = other.getLas_name();
        if (this$las_name == null ? other$las_name != null : !this$las_name.equals(other$las_name)) return false;
        if (this.getScore() != other.getScore()) return false;
        final Object this$birthday = this.getBirthday();
        final Object other$birthday = other.getBirthday();
        if (this$birthday == null ? other$birthday != null : !this$birthday.equals(other$birthday)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Student;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + this.getId();
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        final Object $las_name = this.getLas_name();
        result = result * PRIME + ($las_name == null ? 43 : $las_name.hashCode());
        result = result * PRIME + this.getScore();
        final Object $birthday = this.getBirthday();
        result = result * PRIME + ($birthday == null ? 43 : $birthday.hashCode());
        return result;
    }

    public String toString() {
        return "Student(Id=" + this.getId() + ", name=" + this.getName() + ", las_name=" + this.getLas_name() + ", score=" + this.getScore() + ", birthday=" + this.getBirthday() + ")";
    }
}
