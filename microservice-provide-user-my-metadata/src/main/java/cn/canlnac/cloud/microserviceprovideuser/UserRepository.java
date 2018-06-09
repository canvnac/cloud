package cn.canlnac.cloud.microserviceprovideuser;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by can on 2018/5/28 16:21.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
