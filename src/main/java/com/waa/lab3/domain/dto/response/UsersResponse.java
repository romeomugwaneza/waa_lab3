package com.waa.lab3.domain.dto.response;

import com.waa.lab3.domain.User;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Data
public class UsersResponse {
    private List<User> users = new ArrayList<>();
}
