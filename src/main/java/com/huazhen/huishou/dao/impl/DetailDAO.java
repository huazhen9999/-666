package com.huazhen.huishou.dao.impl;

import com.huazhen.huishou.dao.IDetailDAO;
import com.huazhen.huishou.dto.TbDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Repository
@Transactional
public class DetailDAO implements IDetailDAO {
    @Autowired
    private SessionFactory sessionFactory;
    public List<TbDetail> findAlldetail() {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("from TbDetail ");
        List list = query.list();
        return list;
    }
}
