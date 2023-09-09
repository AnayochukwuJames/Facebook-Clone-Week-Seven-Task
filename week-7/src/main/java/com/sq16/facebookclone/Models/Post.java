package com.sq16.facebookclone.Models;

import com.sq16.facebookclone.DTOs.PostDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Post extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String contentBody;
    @ManyToOne
    private Users user;

    public Post(PostDTO postDTO){
        this.contentBody = postDTO.getContentBody();
        this.user = postDTO.getUser();
    }
}
