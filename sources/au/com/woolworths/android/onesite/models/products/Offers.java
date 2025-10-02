package au.com.woolworths.android.onesite.models.products;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import org.bouncycastle.i18n.TextBundle;

/* loaded from: classes3.dex */
public class Offers implements Serializable {

    @SerializedName("enddate")
    private Double enddate;

    @SerializedName("startdate")
    private Double startdate;

    @SerializedName(TextBundle.TEXT_ENTRY)
    private String text;

    @SerializedName("threshold")
    private int threshold;

    public Double getEndDate() {
        return this.enddate;
    }

    public Double getStartDate() {
        return this.startdate;
    }

    public String getText() {
        return this.text;
    }

    public int getThreshold() {
        return this.threshold;
    }

    public void setEndDate(Double d) {
        this.enddate = d;
    }

    public void setStartDate(Double d) {
        this.startdate = d;
    }

    public void setText(String str) {
        this.text = str;
    }

    public void setThreshold(int i) {
        this.threshold = i;
    }
}
