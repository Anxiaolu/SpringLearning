package cn.edu.sdut.softlab.training.repository;

import cn.edu.sdut.softlab.training.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by sjj on 2015/10/24 0024.
 */
@Repository // 添加注解
public interface UserRepository extends JpaRepository<UserEntity, Integer> {

  /**
   * 根据参数更新用户信息.
   *
   * @param firstName firstName
   * @param lastName lastName
   * @param password password
   * @param id user id
   */
  @Modifying // 说明该方法是修改操作
  @Transactional // 说明该方法是事务性操作
  @Query("update UserEntity us set us.firstName=:qFirstName, "
          + "us.lastName=:qLastName, us.password=:qPassword where us.id=:qId")
  void updateUser(
          @Param("qFirstName") String firstName,
          @Param("qLastName") String lastName,
          @Param("qPassword") String password,
          @Param("qId") Integer id);
}
