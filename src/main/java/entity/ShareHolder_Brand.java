package entity;

public class ShareHolder_Brand{
    private int shareId;
    private int brandId;

    public ShareHolder_Brand(int shareId, int brandId) {
        this.shareId = shareId;
        this.brandId = brandId;
    }

    public int getShareId() {
        return shareId;
    }

    public void setShareId(int shareId) {
        this.shareId = shareId;
    }

    public int getBrandId() {
        return brandId;
    }

    public void setBrandId(int brandId) {
        this.brandId = brandId;
    }
}
