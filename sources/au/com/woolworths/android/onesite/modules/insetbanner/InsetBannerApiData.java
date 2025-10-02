package au.com.woolworths.android.onesite.modules.insetbanner;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.impl.b;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.graphql.MappedName;
import com.google.gson.annotations.SerializedName;
import com.salesforce.marketingcloud.UrlHandler;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Parcelize
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u000bHÆ\u0003JM\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0006\u0010\u001f\u001a\u00020 J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0003J\t\u0010%\u001a\u00020 HÖ\u0001J\t\u0010&\u001a\u00020\u0005HÖ\u0001J\u0016\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020 R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006,"}, d2 = {"Lau/com/woolworths/android/onesite/modules/insetbanner/InsetBannerApiData;", "Landroid/os/Parcelable;", "displayType", "Lau/com/woolworths/android/onesite/modules/insetbanner/InsetBannerTypeApiData;", "message", "", "titleString", UrlHandler.ACTION, "Lau/com/woolworths/android/onesite/modules/insetbanner/InsetBannerActionApiData;", "iconUrl", "analytics", "Lau/com/woolworths/analytics/model/AnalyticsData;", "<init>", "(Lau/com/woolworths/android/onesite/modules/insetbanner/InsetBannerTypeApiData;Ljava/lang/String;Ljava/lang/String;Lau/com/woolworths/android/onesite/modules/insetbanner/InsetBannerActionApiData;Ljava/lang/String;Lau/com/woolworths/analytics/model/AnalyticsData;)V", "getDisplayType", "()Lau/com/woolworths/android/onesite/modules/insetbanner/InsetBannerTypeApiData;", "getMessage", "()Ljava/lang/String;", "getTitleString", "getAction", "()Lau/com/woolworths/android/onesite/modules/insetbanner/InsetBannerActionApiData;", "getIconUrl", "getAnalytics", "()Lau/com/woolworths/analytics/model/AnalyticsData;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class InsetBannerApiData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<InsetBannerApiData> CREATOR = new Creator();

    @SerializedName(UrlHandler.ACTION)
    @Nullable
    private final InsetBannerActionApiData action;

    @SerializedName("analytics")
    @Nullable
    private final AnalyticsData analytics;

    @SerializedName("displayType")
    @NotNull
    private final InsetBannerTypeApiData displayType;

    @SerializedName("iconUrl")
    @Nullable
    private final String iconUrl;

    @SerializedName("message")
    @NotNull
    private final String message;

    @SerializedName("bannerTitle")
    @MappedName
    @Nullable
    private final String titleString;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Creator implements Parcelable.Creator<InsetBannerApiData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InsetBannerApiData createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new InsetBannerApiData(InsetBannerTypeApiData.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : InsetBannerActionApiData.CREATOR.createFromParcel(parcel), parcel.readString(), (AnalyticsData) parcel.readParcelable(InsetBannerApiData.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InsetBannerApiData[] newArray(int i) {
            return new InsetBannerApiData[i];
        }
    }

    public InsetBannerApiData(@NotNull InsetBannerTypeApiData displayType, @NotNull String message, @Nullable String str, @Nullable InsetBannerActionApiData insetBannerActionApiData, @Nullable String str2, @Nullable AnalyticsData analyticsData) {
        Intrinsics.h(displayType, "displayType");
        Intrinsics.h(message, "message");
        this.displayType = displayType;
        this.message = message;
        this.titleString = str;
        this.action = insetBannerActionApiData;
        this.iconUrl = str2;
        this.analytics = analyticsData;
    }

    public static /* synthetic */ InsetBannerApiData copy$default(InsetBannerApiData insetBannerApiData, InsetBannerTypeApiData insetBannerTypeApiData, String str, String str2, InsetBannerActionApiData insetBannerActionApiData, String str3, AnalyticsData analyticsData, int i, Object obj) {
        if ((i & 1) != 0) {
            insetBannerTypeApiData = insetBannerApiData.displayType;
        }
        if ((i & 2) != 0) {
            str = insetBannerApiData.message;
        }
        if ((i & 4) != 0) {
            str2 = insetBannerApiData.titleString;
        }
        if ((i & 8) != 0) {
            insetBannerActionApiData = insetBannerApiData.action;
        }
        if ((i & 16) != 0) {
            str3 = insetBannerApiData.iconUrl;
        }
        if ((i & 32) != 0) {
            analyticsData = insetBannerApiData.analytics;
        }
        String str4 = str3;
        AnalyticsData analyticsData2 = analyticsData;
        return insetBannerApiData.copy(insetBannerTypeApiData, str, str2, insetBannerActionApiData, str4, analyticsData2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final InsetBannerTypeApiData getDisplayType() {
        return this.displayType;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getTitleString() {
        return this.titleString;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final InsetBannerActionApiData getAction() {
        return this.action;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final AnalyticsData getAnalytics() {
        return this.analytics;
    }

    @NotNull
    public final InsetBannerApiData copy(@NotNull InsetBannerTypeApiData displayType, @NotNull String message, @Nullable String titleString, @Nullable InsetBannerActionApiData action, @Nullable String iconUrl, @Nullable AnalyticsData analytics) {
        Intrinsics.h(displayType, "displayType");
        Intrinsics.h(message, "message");
        return new InsetBannerApiData(displayType, message, titleString, action, iconUrl, analytics);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InsetBannerApiData)) {
            return false;
        }
        InsetBannerApiData insetBannerApiData = (InsetBannerApiData) other;
        return this.displayType == insetBannerApiData.displayType && Intrinsics.c(this.message, insetBannerApiData.message) && Intrinsics.c(this.titleString, insetBannerApiData.titleString) && Intrinsics.c(this.action, insetBannerApiData.action) && Intrinsics.c(this.iconUrl, insetBannerApiData.iconUrl) && Intrinsics.c(this.analytics, insetBannerApiData.analytics);
    }

    @Nullable
    public final InsetBannerActionApiData getAction() {
        return this.action;
    }

    @Nullable
    public final AnalyticsData getAnalytics() {
        return this.analytics;
    }

    @NotNull
    public final InsetBannerTypeApiData getDisplayType() {
        return this.displayType;
    }

    @Nullable
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    @Nullable
    public final String getTitleString() {
        return this.titleString;
    }

    public int hashCode() {
        int iC = b.c(this.displayType.hashCode() * 31, 31, this.message);
        String str = this.titleString;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        InsetBannerActionApiData insetBannerActionApiData = this.action;
        int iHashCode2 = (iHashCode + (insetBannerActionApiData == null ? 0 : insetBannerActionApiData.hashCode())) * 31;
        String str2 = this.iconUrl;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        AnalyticsData analyticsData = this.analytics;
        return iHashCode3 + (analyticsData != null ? analyticsData.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "InsetBannerApiData(displayType=" + this.displayType + ", message=" + this.message + ", titleString=" + this.titleString + ", action=" + this.action + ", iconUrl=" + this.iconUrl + ", analytics=" + this.analytics + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.displayType.name());
        dest.writeString(this.message);
        dest.writeString(this.titleString);
        InsetBannerActionApiData insetBannerActionApiData = this.action;
        if (insetBannerActionApiData == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            insetBannerActionApiData.writeToParcel(dest, flags);
        }
        dest.writeString(this.iconUrl);
        dest.writeParcelable(this.analytics, flags);
    }

    public /* synthetic */ InsetBannerApiData(InsetBannerTypeApiData insetBannerTypeApiData, String str, String str2, InsetBannerActionApiData insetBannerActionApiData, String str3, AnalyticsData analyticsData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(insetBannerTypeApiData, str, str2, insetBannerActionApiData, str3, (i & 32) != 0 ? null : analyticsData);
    }
}
