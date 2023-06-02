package com.waa.lab3.domain.dto;
import com.waa.lab3.domain.Post;
import java.util.List;
public record UserDTO(long id, String name, List<Post> posts){}
