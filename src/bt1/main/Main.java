package main;

import builder.*;

public class Main {
  public static void main(String[] args) {
    HoaDonHeader hoaDonHeader = new HoaDonHeader("HD00001", "Võ Hữu Huy", "12/05/2020");
    ChiTiet chiTiet1 = new ChiTiet("Máy quạt", 23, 150000, 0.3);
    ChiTiet chiTiet2 = new ChiTiet("Máy giặt", 1, 5000000, 0.2);
    HoaDon hoaDon = new HoaDon.Builder()
      .addHoaDonHeader(hoaDonHeader)
      .addChiTiet(chiTiet1)
      .addChiTiet(chiTiet2)
      .build();
    System.out.println(hoaDon.toString());
  }
}