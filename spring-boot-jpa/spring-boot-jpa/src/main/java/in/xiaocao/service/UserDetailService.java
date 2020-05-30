package in.xiaocao.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import in.xiaocao.model.UserDetail;
import in.xiaocao.param.UserDetailParam;

public interface UserDetailService {
    public Page<UserDetail> findByCondition(UserDetailParam detailParam, Pageable pageable);
}
