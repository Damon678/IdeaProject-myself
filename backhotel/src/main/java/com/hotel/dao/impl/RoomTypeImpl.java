package com.hotel.dao.impl;

import com.hotel.dao.RoomTypeDao;
import com.hotel.pojo.Roomtype;
import com.hotel.util.jdbcUtil;

import java.util.List;

public class RoomTypeImpl implements RoomTypeDao {

    @Override
    public List<Roomtype> list() {
        return jdbcUtil.executeQuery("select id,name,size,note from roomtype",Roomtype.class);
    }
}
