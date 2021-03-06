package com.firstgroup.project.DAOs;


import com.firstgroup.project.hotels.Hotel;
import com.firstgroup.project.hotels.Room;

import java.util.List;

public interface RoomDAOInterface {
    Room save(Room obj);
    boolean delete(Room obj);
    Room update(Room obj);
    List<Room> findRoomsByHotel(Hotel hotel);
}
