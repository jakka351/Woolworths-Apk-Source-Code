package au.com.woolworths.feature.shop.contentpage.data;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.android.onesite.data.HorizontalListDataInterface;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerApiData;
import com.google.gson.annotations.SerializedName;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001B\u008d\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\u0016\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001b\u0010\u0018R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u001e\u0010\u0018R\"\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\n\u0010\u001f\u001a\u0004\b \u0010!R(\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010\u001f\u0012\u0004\b#\u0010\u001d\u001a\u0004\b\"\u0010!R\"\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010\u0016\u0012\u0004\b%\u0010\u001d\u001a\u0004\b$\u0010\u0018R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010&\u001a\u0004\b'\u0010(R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010)\u001a\u0004\b*\u0010+R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010)\u001a\u0004\b,\u0010+R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010-\u001a\u0004\b.\u0010/¨\u00060"}, d2 = {"Lau/com/woolworths/feature/shop/contentpage/data/HorizontalListData;", "Lau/com/woolworths/android/onesite/data/HorizontalListDataInterface;", "", "title", NotificationMessage.NOTIF_KEY_SUB_TITLE, "actionTitle", "actionPath", "deepLink", "", "", "items", "actionMetadata", "specialsGroupId", "Lau/com/woolworths/android/onesite/modules/insetbanner/InsetBannerApiData;", "insetBanner", "Lau/com/woolworths/analytics/model/AnalyticsData;", "horizontalListImpressionAnalytics", "horizontalListAnalytics", "Lau/com/woolworths/feature/shop/contentpage/data/HorizontalListTrailingLinkData;", "horizontalListTrailingLink", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lau/com/woolworths/android/onesite/modules/insetbanner/InsetBannerApiData;Lau/com/woolworths/analytics/model/AnalyticsData;Lau/com/woolworths/analytics/model/AnalyticsData;Lau/com/woolworths/feature/shop/contentpage/data/HorizontalListTrailingLinkData;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getActionTitle", "getActionPath", "getActionPath$annotations", "()V", "getDeepLink", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "getActionMetadata", "getActionMetadata$annotations", "getSpecialsGroupId", "getSpecialsGroupId$annotations", "Lau/com/woolworths/android/onesite/modules/insetbanner/InsetBannerApiData;", "getInsetBanner", "()Lau/com/woolworths/android/onesite/modules/insetbanner/InsetBannerApiData;", "Lau/com/woolworths/analytics/model/AnalyticsData;", "c", "()Lau/com/woolworths/analytics/model/AnalyticsData;", "b", "Lau/com/woolworths/feature/shop/contentpage/data/HorizontalListTrailingLinkData;", "d", "()Lau/com/woolworths/feature/shop/contentpage/data/HorizontalListTrailingLinkData;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class HorizontalListData implements HorizontalListDataInterface {

    @SerializedName("actionMetadata")
    @Nullable
    private final List<Object> actionMetadata;

    @SerializedName("actionPath")
    @Nullable
    private final String actionPath;

    @SerializedName("actionTitle")
    @Nullable
    private final String actionTitle;
    public Integer d;

    @SerializedName("deepLink")
    @Nullable
    private final String deepLink;

    @SerializedName("horizontalListAnalytics")
    @Nullable
    private final AnalyticsData horizontalListAnalytics;

    @SerializedName("horizontalListImpressionAnalytics")
    @Nullable
    private final AnalyticsData horizontalListImpressionAnalytics;

    @SerializedName("HorizontalListTrailingLink")
    @Nullable
    private final HorizontalListTrailingLinkData horizontalListTrailingLink;

    @SerializedName("insetBanner")
    @Nullable
    private final InsetBannerApiData insetBanner;

    @SerializedName("items")
    @NotNull
    private final List<Object> items;

    @SerializedName("specialsGroup")
    @Nullable
    private final String specialsGroupId;

    @SerializedName(NotificationMessage.NOTIF_KEY_SUB_TITLE)
    @Nullable
    private final String subtitle;

    @SerializedName("title")
    @Nullable
    private final String title;

    public HorizontalListData(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @NotNull List<? extends Object> items, @Nullable List<? extends Object> list, @Nullable String str6, @Nullable InsetBannerApiData insetBannerApiData, @Nullable AnalyticsData analyticsData, @Nullable AnalyticsData analyticsData2, @Nullable HorizontalListTrailingLinkData horizontalListTrailingLinkData) {
        Intrinsics.h(items, "items");
        this.title = str;
        this.subtitle = str2;
        this.actionTitle = str3;
        this.actionPath = str4;
        this.deepLink = str5;
        this.items = items;
        this.actionMetadata = list;
        this.specialsGroupId = str6;
        this.insetBanner = insetBannerApiData;
        this.horizontalListImpressionAnalytics = analyticsData;
        this.horizontalListAnalytics = analyticsData2;
        this.horizontalListTrailingLink = horizontalListTrailingLinkData;
    }

    public static HorizontalListData a(HorizontalListData horizontalListData, ArrayList arrayList) {
        return new HorizontalListData(horizontalListData.title, horizontalListData.subtitle, horizontalListData.actionTitle, horizontalListData.actionPath, horizontalListData.deepLink, arrayList, horizontalListData.actionMetadata, horizontalListData.specialsGroupId, horizontalListData.insetBanner, horizontalListData.horizontalListImpressionAnalytics, horizontalListData.horizontalListAnalytics, horizontalListData.horizontalListTrailingLink);
    }

    /* renamed from: b, reason: from getter */
    public final AnalyticsData getHorizontalListAnalytics() {
        return this.horizontalListAnalytics;
    }

    /* renamed from: c, reason: from getter */
    public final AnalyticsData getHorizontalListImpressionAnalytics() {
        return this.horizontalListImpressionAnalytics;
    }

    /* renamed from: d, reason: from getter */
    public final HorizontalListTrailingLinkData getHorizontalListTrailingLink() {
        return this.horizontalListTrailingLink;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HorizontalListData)) {
            return false;
        }
        HorizontalListData horizontalListData = (HorizontalListData) obj;
        return Intrinsics.c(this.title, horizontalListData.title) && Intrinsics.c(this.subtitle, horizontalListData.subtitle) && Intrinsics.c(this.actionTitle, horizontalListData.actionTitle) && Intrinsics.c(this.actionPath, horizontalListData.actionPath) && Intrinsics.c(this.deepLink, horizontalListData.deepLink) && Intrinsics.c(this.items, horizontalListData.items) && Intrinsics.c(this.actionMetadata, horizontalListData.actionMetadata) && Intrinsics.c(this.specialsGroupId, horizontalListData.specialsGroupId) && Intrinsics.c(this.insetBanner, horizontalListData.insetBanner) && Intrinsics.c(this.horizontalListImpressionAnalytics, horizontalListData.horizontalListImpressionAnalytics) && Intrinsics.c(this.horizontalListAnalytics, horizontalListData.horizontalListAnalytics) && Intrinsics.c(this.horizontalListTrailingLink, horizontalListData.horizontalListTrailingLink);
    }

    @Override // au.com.woolworths.android.onesite.data.HorizontalListDataInterface
    public final String getActionTitle() {
        return this.actionTitle;
    }

    @Override // au.com.woolworths.android.onesite.data.HorizontalListDataInterface
    public final String getDeepLink() {
        return this.deepLink;
    }

    @Override // au.com.woolworths.android.onesite.data.HorizontalListDataInterface
    /* renamed from: getItems, reason: from getter */
    public final List getD() {
        return this.items;
    }

    @Override // au.com.woolworths.android.onesite.data.HorizontalListDataInterface
    public final String getSubtitle() {
        return this.subtitle;
    }

    @Override // au.com.woolworths.android.onesite.data.HorizontalListDataInterface
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.subtitle;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.actionTitle;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.actionPath;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.deepLink;
        int iD = b.d((iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.items);
        List<Object> list = this.actionMetadata;
        int iHashCode5 = (iD + (list == null ? 0 : list.hashCode())) * 31;
        String str6 = this.specialsGroupId;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        InsetBannerApiData insetBannerApiData = this.insetBanner;
        int iHashCode7 = (iHashCode6 + (insetBannerApiData == null ? 0 : insetBannerApiData.hashCode())) * 31;
        AnalyticsData analyticsData = this.horizontalListImpressionAnalytics;
        int iHashCode8 = (iHashCode7 + (analyticsData == null ? 0 : analyticsData.hashCode())) * 31;
        AnalyticsData analyticsData2 = this.horizontalListAnalytics;
        int iHashCode9 = (iHashCode8 + (analyticsData2 == null ? 0 : analyticsData2.hashCode())) * 31;
        HorizontalListTrailingLinkData horizontalListTrailingLinkData = this.horizontalListTrailingLink;
        return iHashCode9 + (horizontalListTrailingLinkData != null ? horizontalListTrailingLinkData.hashCode() : 0);
    }

    public final String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        String str3 = this.actionTitle;
        String str4 = this.actionPath;
        String str5 = this.deepLink;
        List<Object> list = this.items;
        List<Object> list2 = this.actionMetadata;
        String str6 = this.specialsGroupId;
        InsetBannerApiData insetBannerApiData = this.insetBanner;
        AnalyticsData analyticsData = this.horizontalListImpressionAnalytics;
        AnalyticsData analyticsData2 = this.horizontalListAnalytics;
        HorizontalListTrailingLinkData horizontalListTrailingLinkData = this.horizontalListTrailingLink;
        StringBuilder sbV = a.v("HorizontalListData(title=", str, ", subtitle=", str2, ", actionTitle=");
        androidx.constraintlayout.core.state.a.B(sbV, str3, ", actionPath=", str4, ", deepLink=");
        au.com.woolworths.android.onesite.a.B(sbV, str5, ", items=", list, ", actionMetadata=");
        sbV.append(list2);
        sbV.append(", specialsGroupId=");
        sbV.append(str6);
        sbV.append(", insetBanner=");
        sbV.append(insetBannerApiData);
        sbV.append(", horizontalListImpressionAnalytics=");
        sbV.append(analyticsData);
        sbV.append(", horizontalListAnalytics=");
        sbV.append(analyticsData2);
        sbV.append(", horizontalListTrailingLink=");
        sbV.append(horizontalListTrailingLinkData);
        sbV.append(")");
        return sbV.toString();
    }

    public /* synthetic */ HorizontalListData(String str, String str2, String str3, String str4, String str5, List list, List list2, String str6, InsetBannerApiData insetBannerApiData, AnalyticsData analyticsData, AnalyticsData analyticsData2, HorizontalListTrailingLinkData horizontalListTrailingLinkData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, (i & 16) != 0 ? null : str5, list, list2, str6, insetBannerApiData, analyticsData, analyticsData2, horizontalListTrailingLinkData);
    }
}
