package info.androidhive.materialdesign;

/**
 * Created by Alessandro on 09/05/16.
 */
public class RowData
{
    private int imageId;
    private String title;
    private String subtitle;
    private String oldprice;
    private String newprice;

    public int getImageId()
    {
        return imageId;
    }

    public void setImageId(int imageId)
    {
        this.imageId = imageId;
    }

    public String getSubtitle()
    {
        return subtitle;
    }

    public void setSubtitle(String subtitle)
    {
        this.subtitle = subtitle;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getOldprice()
    {
        return oldprice;
    }

    public void setOldprice(String oldprice)
    {
        this.oldprice = oldprice;
    }

    public String getNewprice()
    {
        return newprice;
    }

    public void setNewprice(String oldprice)
    {
        this.newprice = newprice;
    }
}