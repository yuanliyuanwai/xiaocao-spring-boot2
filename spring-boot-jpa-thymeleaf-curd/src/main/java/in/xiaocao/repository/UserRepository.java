package in.xiaocao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.xiaocao.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

    User findById(long id);

    void deleteById(Long id);
}