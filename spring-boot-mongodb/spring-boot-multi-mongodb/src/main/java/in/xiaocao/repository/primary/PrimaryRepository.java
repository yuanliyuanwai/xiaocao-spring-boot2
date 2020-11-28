package in.xiaocao.repository.primary;

import org.springframework.data.mongodb.repository.MongoRepository;

import in.xiaocao.model.User;

public interface PrimaryRepository extends MongoRepository<User, String> {
}
