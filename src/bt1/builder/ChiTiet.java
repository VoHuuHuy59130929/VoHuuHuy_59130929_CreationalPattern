package builder;

public class ChiTiet {
  private String sanPham;
  private int soLuong;
  private double donGia, chiecKhau;
  public ChiTiet (String sanPham, int soLuong, double donGia, double chiecKhau) {
    setSanPham(sanPham);
    setSoLuong(soLuong);
    setDonGia(donGia);
    setChiecKhau(chiecKhau);
  }
  public void setSanPham (String sanPham) { this.sanPham = sanPham; }
  public void setSoLuong (int soLuong) { this.soLuong = soLuong; }
  public void setDonGia (double donGia) { this.donGia = donGia; }
  public void setChiecKhau (double chiecKhau) { this.chiecKhau = chiecKhau; }
  public String getSanPham () { return this.sanPham; }
  public int getSoLuong () { return this.soLuong; }
  public double getDonGia () { return this.donGia; }
  public double getChiecKhau () { return this.chiecKhau; }
  @Override
  public String toString () {
    return "Tên sản phẩm: " + getSanPham() + "\n" +
      "Số lượng: " + getSoLuong() + "\n" +
      "Đơn giá: " + getDonGia() + "\n" +
      "Đơn giá: " + getChiecKhau() + "\n";
  }
}