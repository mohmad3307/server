package com.server.app.APIs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.server.app.barber.barber;
import com.server.app.repository.barberRepository;


@RestController
@RequestMapping("/api/users")
public class addBarberDetails {

    @Autowired
    private barberRepository barberRepository;

    @PutMapping("/updatebirthdate/{email}/{username}")
    public ResponseEntity<String> updateBirthdateByEmailOrUsername(@PathVariable  String email, @PathVariable  String username, @RequestBody String openTime) {
        barber barber = barberRepository.findByEmailOrUsername(email, username);

        if (barber != null) {
            // تحقق من وجود تاريخ الميلاد وقم بتحديثه إذا لزم الأمر
            if (openTime != null) {
                System.out.println(openTime);
                String currentOpenTime = barber.getOpenTime();
                barber.setOpenTime(openTime);
                barberRepository.save(barber);

                if (currentOpenTime != null) {
                    return ResponseEntity.ok("تم تحديث تاريخ الميلاد بنجاح، وكان هناك قيمة سابقة.");
                } else {
                    return ResponseEntity.ok("تم تحديث تاريخ الميلاد بنجاح، وهو الآن قيمة جديدة.");
                }
            } else {
                return ResponseEntity.badRequest().body("تاريخ الميلاد لا يمكن أن يكون فارغًا.");
            }
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}

