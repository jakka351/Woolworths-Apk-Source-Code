package au.com.woolworths.android.onesite.modules.inlinemessage;

import androidx.camera.core.impl.b;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerTypeApiData;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lau/com/woolworths/android/onesite/modules/inlinemessage/InlineMessageApiData;", "", "Lau/com/woolworths/android/onesite/modules/insetbanner/InsetBannerTypeApiData;", "displayType", "", "message", "Lau/com/woolworths/analytics/model/AnalyticsData;", "analytics", "<init>", "(Lau/com/woolworths/android/onesite/modules/insetbanner/InsetBannerTypeApiData;Ljava/lang/String;Lau/com/woolworths/analytics/model/AnalyticsData;)V", "Lau/com/woolworths/android/onesite/modules/insetbanner/InsetBannerTypeApiData;", "b", "()Lau/com/woolworths/android/onesite/modules/insetbanner/InsetBannerTypeApiData;", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "Lau/com/woolworths/analytics/model/AnalyticsData;", "a", "()Lau/com/woolworths/analytics/model/AnalyticsData;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class InlineMessageApiData {

    @SerializedName("analytics")
    @Nullable
    private final AnalyticsData analytics;

    @SerializedName("displayType")
    @NotNull
    private final InsetBannerTypeApiData displayType;

    @SerializedName("message")
    @NotNull
    private final String message;

    public InlineMessageApiData(@NotNull InsetBannerTypeApiData displayType, @NotNull String message, @Nullable AnalyticsData analyticsData) {
        Intrinsics.h(displayType, "displayType");
        Intrinsics.h(message, "message");
        this.displayType = displayType;
        this.message = message;
        this.analytics = analyticsData;
    }

    /* renamed from: a, reason: from getter */
    public final AnalyticsData getAnalytics() {
        return this.analytics;
    }

    /* renamed from: b, reason: from getter */
    public final InsetBannerTypeApiData getDisplayType() {
        return this.displayType;
    }

    /* renamed from: c, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InlineMessageApiData)) {
            return false;
        }
        InlineMessageApiData inlineMessageApiData = (InlineMessageApiData) obj;
        return this.displayType == inlineMessageApiData.displayType && Intrinsics.c(this.message, inlineMessageApiData.message) && Intrinsics.c(this.analytics, inlineMessageApiData.analytics);
    }

    public final int hashCode() {
        int iC = b.c(this.displayType.hashCode() * 31, 31, this.message);
        AnalyticsData analyticsData = this.analytics;
        return iC + (analyticsData == null ? 0 : analyticsData.hashCode());
    }

    public final String toString() {
        InsetBannerTypeApiData insetBannerTypeApiData = this.displayType;
        String str = this.message;
        AnalyticsData analyticsData = this.analytics;
        StringBuilder sb = new StringBuilder("InlineMessageApiData(displayType=");
        sb.append(insetBannerTypeApiData);
        sb.append(", message=");
        sb.append(str);
        sb.append(", analytics=");
        return a.n(sb, analyticsData, ")");
    }
}
