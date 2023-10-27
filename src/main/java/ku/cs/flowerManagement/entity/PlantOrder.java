package ku.cs.flowerManagement.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.UUID;

@Data
@Entity
@Table(name = "PlantOrder")
public class PlantOrder {

    @Id
    @GeneratedValue
    private UUID id;

    private int PID; //รหัสของแปลงปลูก
    private int FID; //รหัสดอกไม้
    private String FName; //ชื่อดอกไม้
    private int quantity; //จำนวนที่ปลูก
    private int total; //จำนวนปัจจุบัน

}
