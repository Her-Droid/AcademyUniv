package com.dicoding.academies.utils

import com.dicoding.academies.data.CourseEntity
import com.dicoding.academies.data.UserModel
import java.util.ArrayList

object UserDummy {
    fun generateDummyUser(): ArrayList<UserModel> {

        val user = ArrayList<UserModel>()

        user.add(
                UserModel(
                        "1",
                        "Russi hersiano",
                        "russihersiano38@gmail.com",
                        "082293581836",
                        "2020",
                        "Mobile Developer",
                        "Mobile Developer",
                        "Niaga IT",
                        "https://scontent.fkno3-1.fna.fbcdn.net/v/t1.0-9/30440742_1839755372993693_5357627868153118720_n.jpg?_nc_cat=103&ccb=2&_nc_sid=8bfeb9&_nc_ohc=yXqSiZRzItQAX8T1WlH&_nc_ht=scontent.fkno3-1.fna&oh=0f4904f15a00b4dfe923ddbacf6001e1&oe=5FC1E9C5"
                )
        )

        user.add(
                UserModel(
                        "2",
                        "Roby Aurio Ureka",
                        "robiureka@gmail.com",
                        "+62 822 1397 3884",
                        "2019",
                        "UI & UX Enthusiast",
                        "Head Of Design Division",
                        "LPM NERACA POLMED",
                        "https://scontent.fkno3-1.fna.fbcdn.net/v/t1.0-9/123146211_215445953308615_7931161014360890451_n.jpg?_nc_cat=103&ccb=2&_nc_sid=730e14&_nc_ohc=26XIGSU6V_8AX_TDarB&_nc_ht=scontent.fkno3-1.fna&oh=b93ea0556e49b427a0785abae643ea04&oe=5FC5A52B"
                )
        )
        return user
    }

}