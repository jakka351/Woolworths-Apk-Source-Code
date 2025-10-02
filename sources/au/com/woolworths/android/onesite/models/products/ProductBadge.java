package au.com.woolworths.android.onesite.models.products;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* loaded from: classes3.dex */
public class ProductBadge implements Serializable {

    @SerializedName("type")
    private String mBadgeType;

    @SerializedName("url")
    private String mBadgeUrl;

    public String getBadgeType() {
        return this.mBadgeType;
    }

    public String getBadgeUrl() {
        return this.mBadgeUrl;
    }

    public void setBadgeUrl(String str) {
        this.mBadgeUrl = str;
    }
}
