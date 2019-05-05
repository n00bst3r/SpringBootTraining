package de.rajic.springboot.training.domain;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@Entity
public class Link {

    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String url;

}
