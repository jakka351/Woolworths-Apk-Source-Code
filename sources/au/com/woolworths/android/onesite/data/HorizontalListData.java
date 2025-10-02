package au.com.woolworths.android.onesite.data;

import YU.a;
import androidx.camera.core.impl.b;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerApiData;
import com.google.gson.annotations.SerializedName;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u007f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\u0010\u0010\u0011J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tHÆ\u0003J\u0011\u0010)\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u0011\u0010,\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J\u0093\u0001\u0010-\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0001J\u0013\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u00010\nHÖ\u0003J\t\u00101\u001a\u000202HÖ\u0001J\t\u00103\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0013R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u001e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t8\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR$\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u001bR\u001e\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u001f\u0010\u0013R\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u001e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001b¨\u00064"}, d2 = {"Lau/com/woolworths/android/onesite/data/HorizontalListData;", "Lau/com/woolworths/android/onesite/data/HorizontalListDataInterface;", "title", "", NotificationMessage.NOTIF_KEY_SUB_TITLE, "actionTitle", "actionPath", "deepLink", "items", "", "", "actionMetadata", "specialsGroupId", "insetBanner", "Lau/com/woolworths/android/onesite/modules/insetbanner/InsetBannerApiData;", "badges", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lau/com/woolworths/android/onesite/modules/insetbanner/InsetBannerApiData;Ljava/util/List;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getActionTitle", "getActionPath$annotations", "()V", "getActionPath", "getDeepLink", "getItems", "()Ljava/util/List;", "getActionMetadata$annotations", "getActionMetadata", "getSpecialsGroupId$annotations", "getSpecialsGroupId", "getInsetBanner", "()Lau/com/woolworths/android/onesite/modules/insetbanner/InsetBannerApiData;", "getBadges", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "hashCode", "", "toString", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
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

    @SerializedName("badges")
    @Nullable
    private final List<Object> badges;

    @SerializedName("deepLink")
    @Nullable
    private final String deepLink;

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

    public HorizontalListData(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @NotNull List<? extends Object> items, @Nullable List<? extends Object> list, @Nullable String str6, @Nullable InsetBannerApiData insetBannerApiData, @Nullable List<? extends Object> list2) {
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
        this.badges = list2;
    }

    public static /* synthetic */ HorizontalListData copy$default(HorizontalListData horizontalListData, String str, String str2, String str3, String str4, String str5, List list, List list2, String str6, InsetBannerApiData insetBannerApiData, List list3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = horizontalListData.title;
        }
        if ((i & 2) != 0) {
            str2 = horizontalListData.subtitle;
        }
        if ((i & 4) != 0) {
            str3 = horizontalListData.actionTitle;
        }
        if ((i & 8) != 0) {
            str4 = horizontalListData.actionPath;
        }
        if ((i & 16) != 0) {
            str5 = horizontalListData.deepLink;
        }
        if ((i & 32) != 0) {
            list = horizontalListData.items;
        }
        if ((i & 64) != 0) {
            list2 = horizontalListData.actionMetadata;
        }
        if ((i & 128) != 0) {
            str6 = horizontalListData.specialsGroupId;
        }
        if ((i & 256) != 0) {
            insetBannerApiData = horizontalListData.insetBanner;
        }
        if ((i & 512) != 0) {
            list3 = horizontalListData.badges;
        }
        InsetBannerApiData insetBannerApiData2 = insetBannerApiData;
        List list4 = list3;
        List list5 = list2;
        String str7 = str6;
        String str8 = str5;
        List list6 = list;
        return horizontalListData.copy(str, str2, str3, str4, str8, list6, list5, str7, insetBannerApiData2, list4);
    }

    @Deprecated
    public static /* synthetic */ void getActionMetadata$annotations() {
    }

    @Deprecated
    public static /* synthetic */ void getActionPath$annotations() {
    }

    @Deprecated
    public static /* synthetic */ void getSpecialsGroupId$annotations() {
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final List<Object> component10() {
        return this.badges;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getActionTitle() {
        return this.actionTitle;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getActionPath() {
        return this.actionPath;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getDeepLink() {
        return this.deepLink;
    }

    @NotNull
    public final List<Object> component6() {
        return this.items;
    }

    @Nullable
    public final List<Object> component7() {
        return this.actionMetadata;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final String getSpecialsGroupId() {
        return this.specialsGroupId;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final InsetBannerApiData getInsetBanner() {
        return this.insetBanner;
    }

    @NotNull
    public final HorizontalListData copy(@Nullable String title, @Nullable String subtitle, @Nullable String actionTitle, @Nullable String actionPath, @Nullable String deepLink, @NotNull List<? extends Object> items, @Nullable List<? extends Object> actionMetadata, @Nullable String specialsGroupId, @Nullable InsetBannerApiData insetBanner, @Nullable List<? extends Object> badges) {
        Intrinsics.h(items, "items");
        return new HorizontalListData(title, subtitle, actionTitle, actionPath, deepLink, items, actionMetadata, specialsGroupId, insetBanner, badges);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HorizontalListData)) {
            return false;
        }
        HorizontalListData horizontalListData = (HorizontalListData) other;
        return Intrinsics.c(this.title, horizontalListData.title) && Intrinsics.c(this.subtitle, horizontalListData.subtitle) && Intrinsics.c(this.actionTitle, horizontalListData.actionTitle) && Intrinsics.c(this.actionPath, horizontalListData.actionPath) && Intrinsics.c(this.deepLink, horizontalListData.deepLink) && Intrinsics.c(this.items, horizontalListData.items) && Intrinsics.c(this.actionMetadata, horizontalListData.actionMetadata) && Intrinsics.c(this.specialsGroupId, horizontalListData.specialsGroupId) && Intrinsics.c(this.insetBanner, horizontalListData.insetBanner) && Intrinsics.c(this.badges, horizontalListData.badges);
    }

    @Nullable
    public final List<Object> getActionMetadata() {
        return this.actionMetadata;
    }

    @Nullable
    public final String getActionPath() {
        return this.actionPath;
    }

    @Override // au.com.woolworths.android.onesite.data.HorizontalListDataInterface
    @Nullable
    public String getActionTitle() {
        return this.actionTitle;
    }

    @Nullable
    public final List<Object> getBadges() {
        return this.badges;
    }

    @Override // au.com.woolworths.android.onesite.data.HorizontalListDataInterface
    @Nullable
    public String getDeepLink() {
        return this.deepLink;
    }

    @Nullable
    public final InsetBannerApiData getInsetBanner() {
        return this.insetBanner;
    }

    @Override // au.com.woolworths.android.onesite.data.HorizontalListDataInterface
    @NotNull
    public List<Object> getItems() {
        return this.items;
    }

    @Nullable
    public final String getSpecialsGroupId() {
        return this.specialsGroupId;
    }

    @Override // au.com.woolworths.android.onesite.data.HorizontalListDataInterface
    @Nullable
    public String getSubtitle() {
        return this.subtitle;
    }

    @Override // au.com.woolworths.android.onesite.data.HorizontalListDataInterface
    @Nullable
    public String getTitle() {
        return this.title;
    }

    public int hashCode() {
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
        List<Object> list2 = this.badges;
        return iHashCode7 + (list2 != null ? list2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        String str3 = this.actionTitle;
        String str4 = this.actionPath;
        String str5 = this.deepLink;
        List<Object> list = this.items;
        List<Object> list2 = this.actionMetadata;
        String str6 = this.specialsGroupId;
        InsetBannerApiData insetBannerApiData = this.insetBanner;
        List<Object> list3 = this.badges;
        StringBuilder sbV = a.v("HorizontalListData(title=", str, ", subtitle=", str2, ", actionTitle=");
        androidx.constraintlayout.core.state.a.B(sbV, str3, ", actionPath=", str4, ", deepLink=");
        au.com.woolworths.android.onesite.a.B(sbV, str5, ", items=", list, ", actionMetadata=");
        sbV.append(list2);
        sbV.append(", specialsGroupId=");
        sbV.append(str6);
        sbV.append(", insetBanner=");
        sbV.append(insetBannerApiData);
        sbV.append(", badges=");
        sbV.append(list3);
        sbV.append(")");
        return sbV.toString();
    }

    public /* synthetic */ HorizontalListData(String str, String str2, String str3, String str4, String str5, List list, List list2, String str6, InsetBannerApiData insetBannerApiData, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, (i & 16) != 0 ? null : str5, list, list2, str6, insetBannerApiData, list3);
    }
}
