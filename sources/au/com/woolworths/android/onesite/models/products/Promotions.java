package au.com.woolworths.android.onesite.models.products;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class Promotions implements Serializable {

    @SerializedName("cupprice")
    private float cupprice;

    @SerializedName("cupsize")
    private int cupsize;

    @SerializedName("cupuom")
    private String cupuom;

    @SerializedName("enddate")
    private long enddate;

    @SerializedName("footer")
    private Footer footer;

    @SerializedName("isEDR")
    private boolean isEDR;

    @SerializedName("price")
    private float price;

    @SerializedName("startdate")
    private long startdate;

    public static class Color implements Serializable {

        @SerializedName("b")
        private double b;

        @SerializedName("g")
        private double g;

        @SerializedName("r")
        private double r;

        @SerializedName("type")
        private String type;

        public double getBlueValue() {
            return this.b;
        }

        public int getColor() {
            double d = this.r;
            return ((((int) (d * 255.0d)) << 16) & 16711680) | (-16777216) | ((((int) (this.g * 255.0d)) << 8) & 65280) | (((int) (this.b * 255.0d)) & 255);
        }

        public double getGreenValue() {
            return this.g;
        }

        public double getRedValue() {
            return this.r;
        }

        public String getType() {
            return this.type;
        }

        public void setType(String str) {
            this.type = str;
        }
    }

    public static class Footer implements Serializable {

        @SerializedName("backgroundColor")
        private Color backgroundColor;

        @SerializedName("borderColor")
        private Color borderColor;

        @SerializedName("fontColor")
        private Color fontColor;

        @SerializedName("price")
        private String price;

        @SerializedName("rightBadgeURL")
        private String rightBadgeURL;

        @SerializedName("template")
        private String template;

        @SerializedName("textCenter")
        private String textCenter;

        @SerializedName("textLeft")
        private List<String> textLeft = new ArrayList();

        @SerializedName("textRight")
        private List<String> textRight = new ArrayList();

        public Color getBackgroundColor() {
            return this.backgroundColor;
        }

        public Color getBorderColor() {
            return this.borderColor;
        }

        public Color getFontColor() {
            return this.fontColor;
        }

        public String getPrice() {
            return this.price;
        }

        public String getRightBadgeURL() {
            return this.rightBadgeURL;
        }

        public String getTemplate() {
            return this.template;
        }

        public String getTextCenter() {
            return this.textCenter;
        }

        public List<String> getTextLeft() {
            return this.textLeft;
        }

        public List<String> getTextRight() {
            return this.textRight;
        }

        public void setBackgroundColor(Color color) {
            this.backgroundColor = color;
        }

        public void setBorderColor(Color color) {
            this.borderColor = color;
        }

        public void setFontColor(Color color) {
            this.fontColor = color;
        }

        public void setPrice(String str) {
            this.price = str;
        }

        public void setRightBadgeURL(String str) {
            this.rightBadgeURL = str;
        }

        public void setTemplate(String str) {
            this.template = str;
        }

        public void setTextCenter(String str) {
            this.textCenter = str;
        }

        public void setTextLeft(List<String> list) {
            this.textLeft = list;
        }

        public void setTextRight(List<String> list) {
            this.textRight = list;
        }
    }

    public String getCupMeasurementUnit() {
        return this.cupuom;
    }

    public double getCupPrice() {
        return this.cupprice;
    }

    public int getCupSize() {
        return this.cupsize;
    }

    public long getEndDate() {
        return this.enddate;
    }

    public Footer getFooter() {
        return this.footer;
    }

    public boolean getIsEDR() {
        return this.isEDR;
    }

    public float getPrice() {
        return this.price;
    }

    public long getStartDate() {
        return this.startdate;
    }

    public void setCupMeasurementUnit(String str) {
        this.cupuom = str;
    }

    public void setCupPrice(float f) {
        this.cupprice = f;
    }

    public void setCupSize(int i) {
        this.cupsize = i;
    }

    public void setEndDate(long j) {
        this.enddate = j;
    }

    public void setFooter(Footer footer) {
        this.footer = footer;
    }

    public void setIsEDR(boolean z) {
        this.isEDR = z;
    }

    public void setPrice(float f) {
        this.price = f;
    }

    public void setStartDate(long j) {
        this.startdate = j;
    }
}
