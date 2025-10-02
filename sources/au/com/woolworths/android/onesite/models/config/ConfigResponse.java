package au.com.woolworths.android.onesite.models.config;

import com.google.gson.annotations.SerializedName;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public class ConfigResponse {
    public static final int FORCE_UPDATE = 1;
    public static final int NO_ACTION_REQUIRED = 3;
    public static final int OS_NOT_SUPPORTED = 0;
    public static final int UPDATE_AVAILABLE = 2;

    @SerializedName("appLatestVersion")
    private String mAppLatestVersion;

    @SerializedName("status")
    private String mStatus;

    @SerializedName("statusCode")
    private String mStatusCode = "3";

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface ConfigStatus {
    }

    public String getAppLatestVersion() {
        return this.mAppLatestVersion;
    }

    public int getConfigStatus() {
        if (this.mStatusCode.equals("0")) {
            return 0;
        }
        if (this.mStatusCode.equals("1")) {
            return 1;
        }
        return this.mStatusCode.equals("2") ? 2 : 3;
    }

    public String getStatus() {
        return this.mStatus;
    }

    public String getStatusCode() {
        return this.mStatusCode;
    }

    public void setAppLatestVersion(String str) {
        this.mAppLatestVersion = str;
    }

    public void setStatus(String str) {
        this.mStatus = str;
    }

    public void setStatusCode(String str) {
        this.mStatusCode = str;
    }
}
