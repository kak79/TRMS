package com.project.TRMS.models;

import javax.persistence.*;
import java.util.Objects;
@Entity
public class GradingFormat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "format_id")
    private int formatId;
    @Column(name = "format_name")
    private String name;
    private String example;

    public GradingFormat() {
    }


    public int getFormatId() {
        return formatId;
    }

    public void setFormatId(int formatId) {
        this.formatId = formatId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExample() {
        return example;
    }

    public void setExample(String example) {
        this.example = example;
    }

    @Override
    public int hashCode() {
        return Objects.hash(example, formatId, name);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        GradingFormat other = (GradingFormat) obj;
        return Objects.equals(example, other.example) && formatId == other.formatId && Objects.equals(name, other.name);
    }

    @Override
    public String toString() {
        return "GradingFormat [formatId=" + formatId + ", name=" + name + ", example=" + example + "]";
    }

}
