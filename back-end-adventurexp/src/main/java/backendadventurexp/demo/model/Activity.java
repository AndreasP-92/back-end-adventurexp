package backendadventurexp.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Activity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;
    public String name;
    public String starts;
    public String ends;
    public String age;
    public String size;
    public String description;
    public String pic;

    public Activity() {
    }

    public Activity(String name, String starts, String ends, String age, String size, String description, String pic) {
        this.name = name;
        this.starts = starts;
        this.ends = ends;
        this.age = age;
        this.size = size;
        this.description = description;
        this.pic = pic;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStarts() {
        return starts;
    }

    public void setStarts(String starts) {
        this.starts = starts;
    }

    public String getEnds() {
        return ends;
    }

    public void setEnds(String ends) {
        this.ends = ends;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    @Override
    public String toString() {
        return "Activity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", starts='" + starts + '\'' +
                ", ends='" + ends + '\'' +
                ", age='" + age + '\'' +
                ", size='" + size + '\'' +
                ", description='" + description + '\'' +
                ", pic='" + pic + '\'' +
                '}';
    }
}