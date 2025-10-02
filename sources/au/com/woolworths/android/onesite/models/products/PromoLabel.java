package au.com.woolworths.android.onesite.models.products;

import androidx.annotation.Nullable;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* loaded from: classes3.dex */
public class PromoLabel implements Serializable {

    @SerializedName(AnnotatedPrivateKey.LABEL)
    private String mLabelText;

    @Nullable
    @SerializedName("type")
    private String mPromoType;

    public String getLabelText() {
        return this.mLabelText;
    }

    public String getPromoType() {
        return this.mPromoType;
    }

    public void setLabelText(String str) {
        this.mLabelText = str;
    }

    public void setPromoType(@Nullable String str) {
        this.mPromoType = str;
    }
}
