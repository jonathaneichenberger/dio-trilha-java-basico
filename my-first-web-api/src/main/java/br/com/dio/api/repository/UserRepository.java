package br.com.dio.api.repository;

import br.com.dio.api.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {

    public void save(User user) {
        if(user.getId() == null) {
            System.out.println("SAVE - Recebendo o usuário na camada repository");
        }else {
            System.out.println("UPDATE -  Recebendo o usuário na camada repository");
        }
        System.out.println(user);
    }

    public void deleteById(Integer id) {
        System.out.println(String.format("DELETE/id - Recebendo o id: %d para excluir um usuário", id));
        System.out.println(id);
    }

    public List<User> findAll() {
        System.out.println("LIST - Listando os usuários do sistema");
        List<User> users = new ArrayList<>();
        users.add(new User("jonathan", "123456"));
        users.add(new User("djohnni", "10203040"));
        return users;
    }

    public User findById(Integer id) {
        System.out.println(String.format("FIND/id - Recebendo o id: %d para localizar um usuário ", id));
        return new User("jonathan", "123456");
    }

    public User findByName(String username) {
        System.out.println(String.format("FIND/username - Recebendo o username: %s para localizar um usuário", username));
        return new User("jonathan", "123456");
    }
}
