package com.hotel.service.Impl;

import com.hotel.dao.RoomTypeDao;
import com.hotel.dao.impl.RoomTypeImpl;
import com.hotel.pojo.Roomtype;
import com.hotel.service.RoomTypeService;

import java.util.List;

public class RoomTypeServiceImple implements RoomTypeService {

    RoomTypeDao roomTypeDao = new RoomTypeImpl();

    @Override
    public List<Roomtype> list() {
        return roomTypeDao.list();
    }
}
