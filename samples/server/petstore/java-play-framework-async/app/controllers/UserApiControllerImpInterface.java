package controllers;

import apimodels.User;
import java.util.List;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.CompletableFuture;

import javax.validation.constraints.*;

@SuppressWarnings("RedundantThrows")
public interface UserApiControllerImpInterface {
    void createUser(User body) throws Exception;

    void createUsersWithArrayInput(List<User> body) throws Exception;

    void createUsersWithListInput(List<User> body) throws Exception;

    void deleteUser(String username) throws Exception;

    CompletionStage<User> getUserByName(String username) throws Exception;

    CompletionStage<String> loginUser( @NotNull String username,  @NotNull String password) throws Exception;

    void logoutUser() throws Exception;

    void updateUser(String username, User body) throws Exception;

}
