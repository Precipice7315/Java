package com.etc.class0905.dao;

import com.etc.class0905.entity.Tuser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface TuserDao extends JpaRepository<Tuser,Long>,
        JpaSpecificationExecutor<Tuser> {
    public Tuser findByNameAndPassword(String email,String pwd);
}
