package builder;

public class HoaDonHeader {
  private String maHoaDon, tenKhachHang, ngayBan;
  public HoaDonHeader (String maHoaDon, String tenKhachHang, String ngayBan) {
    setMaHoaDon(maHoaDon);
    setTenKhachHang(tenKhachHang);
    setNgayBan(ngayBan);
  }
  public void setMaHoaDon (String maHoaDon) { this.maHoaDon = maHoaDon; }
  public void setTenKhachHang (String tenKhachHang) { this.tenKhachHang = tenKhachHang; }
  public void setNgayBan (String ngayBan) { this.ngayBan = ngayBan; }
  public String getMaHoaDon () { return this.maHoaDon; }
  public String getTenKhachHang () { return this.tenKhachHang; }
  public String getNgayBan () { return this.ngayBan; }
  @Override
  public String toString () {
    return "Mã hóa đơn: " + getMaHoaDon() + "\n" +
      "Tên khách hàng: " + getTenKhachHang() + "\n" +
      "Ngày bán: " + getNgayBan();
  }
}