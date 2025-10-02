package au.com.woolworths.android.onesite.models.authentication;

import com.google.gson.annotations.SerializedName;

/* loaded from: classes3.dex */
public class RefreshResult {

    @SerializedName("access_token")
    public String access_token;

    @SerializedName("expires_in")
    public String expires_in;

    @SerializedName("refresh_token")
    public String refresh_token;

    @SerializedName("shopperid")
    public String shopperid;
}
