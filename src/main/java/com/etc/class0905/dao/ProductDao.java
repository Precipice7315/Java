package com.etc.class0905.dao;

import com.etc.class0905.entity.MyProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ProductDao extends JpaRepository<MyProduct, Long>,
        JpaSpecificationExecutor<MyProduct> {
}
