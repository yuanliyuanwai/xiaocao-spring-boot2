package in.xiaocao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.xiaocao.model.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {
}