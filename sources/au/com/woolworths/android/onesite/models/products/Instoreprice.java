package au.com.woolworths.android.onesite.models.products;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* loaded from: classes3.dex */
public class Instoreprice implements Serializable {
    static final long serialVersionUID = -6047928889949371858L;

    @SerializedName("pricegst")
    private float pricegst;

    public float getPriceGst() {
        return this.pricegst;
    }

    public void setPriceGst(Float f) {
        this.pricegst = f.floatValue();
    }
}
