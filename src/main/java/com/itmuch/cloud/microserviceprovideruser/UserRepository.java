package com.itmuch.cloud.microserviceprovideruser;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author guanth
 * @version 1.0
 * @date 2019/1/2714:59
 * @desc
 * @update update by @author on @date
 */
@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
