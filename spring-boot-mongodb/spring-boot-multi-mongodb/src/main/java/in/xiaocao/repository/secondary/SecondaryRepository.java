package in.xiaocao.repository.secondary;

import org.springframework.data.mongodb.repository.MongoRepository;

import in.xiaocao.model.User;

public interface SecondaryRepository extends MongoRepository<User, String> {
}
