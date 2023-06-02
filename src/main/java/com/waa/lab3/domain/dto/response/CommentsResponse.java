package com.waa.lab3.domain.dto.response;

import com.waa.lab3.domain.Comment;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Data
public class CommentsResponse {
    private List<Comment> comments = new ArrayList<>();
}
