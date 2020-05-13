package builder;

import java.util.ArrayList;

public class HoaDon {
  private HoaDonHeader hoaDonHeader;
  private ArrayList<ChiTiet> CTHD = new ArrayList<ChiTiet>();
  protected HoaDon(Builder builder) {
    setHoaDonHeader(builder.hoaDonHeader);
    setCTHD(builder.CTHD);
  }
  public void setHoaDonHeader (HoaDonHeader hoaDonHeader) {
    this.hoaDonHeader = hoaDonHeader;
  }
  public void setCTHD (ArrayList<ChiTiet> CTHD) {
    this.CTHD = CTHD;
  }
  @Override
  public String toString () {
    String chiTietHoaDonString = "";
    for (int i = 0; i < this.CTHD.size(); i++) {
      chiTietHoaDonString += "STT: " + (i + 1) + "\n" + this.CTHD.get(i).toString();
    }
    return hoaDonHeader.toString() + "\n" +
      "----- Chi tiết hóa đơn -----\n" + chiTietHoaDonString;
  }
  public static class Builder {
    public HoaDonHeader hoaDonHeader;
    private ArrayList<ChiTiet> CTHD = new ArrayList<ChiTiet>();
    public Builder () {}
    public Builder addHoaDonHeader (HoaDonHeader hoaDonHeader) {
      this.hoaDonHeader = hoaDonHeader;
      return this;
    }
    public Builder addChiTiet (ChiTiet chiTiet) {
      this.CTHD.add(chiTiet);
      return this;
    }
    public HoaDon build () {
      return new HoaDon(this);
    }
  }
}