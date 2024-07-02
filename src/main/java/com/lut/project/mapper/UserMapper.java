package com.lut.project.mapper;

import com.lut.project.entity.User;
import com.lut.project.entity.UserQueryParams;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

@Mapper
public interface UserMapper {
    void update(User user);
    List<User> selectAllStudent();

    List<User> selectAllTeacher();
    List<User> selectAllUser();

    void removeBatchByIds(List<Integer> ids);
    List<User> selectByPage(@Param("params")UserQueryParams params, RowBounds rowBounds);
    int countByPage(UserQueryParams params);

    List<User> selectByNewPage(int offset, int num, String userName, String userPhone,String role);

    int selectCount(String role);

    void insert(User user);

    void removeById(Integer id);


}
