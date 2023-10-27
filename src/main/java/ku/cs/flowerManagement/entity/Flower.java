package ku.cs.flowerManagement.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Data
@Entity
@Table(name = "Flower")
public class Flower {

    private UUID id;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int FID; //รหัสของดอกไม้
    private String FName; //ชื่อดอกไม้
    private String how_to_plant; //วิธีการปลูก
    private String how_to_take_care; //วิธีการดูแล
    private int time; //ระยะเวลาในการเติบโต (วัน)
    private int how_to_harvest; //รูปแบบการเก็บดอกไม้ (เก็บครั้งเดียว=1, เก็บหลายครั้ง=ใส่จำนวนที่สามารถเก็บเกี่ยวได้)
    private double price; //ราคาของดอกไม้
    private String pic; //รูปภาพของดอกไม้
    private int quantity; //จำนวนดอกไม้

    @OneToMany(mappedBy = "flower")
    private List<OrderFlower> orders = new ArrayList<>();

    @Override
    public String toString() {
        return "Flower{" +
                "FID=" + FID +
                ", FName='" + FName + '\'' +
                ", how_to_plant='" + how_to_plant + '\'' +
                // Add other fields here
                '}';
    }
}
