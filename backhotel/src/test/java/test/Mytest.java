package test;

import com.alibaba.fastjson.JSONObject;
import com.hotel.pojo.Roomtype;
import com.hotel.service.Impl.RoomTypeServiceImple;
import com.hotel.service.RoomTypeService;

import java.util.List;

public class Mytest {

    public static void main(String[] args) {
        RoomTypeService roomTypeService=new RoomTypeServiceImple();
        //System.out.println(roomTypeService.list());
        List<Roomtype> list = roomTypeService.list();
        String str = JSONObject.toJSONString(list);
        System.out.println(str);
    }
}
