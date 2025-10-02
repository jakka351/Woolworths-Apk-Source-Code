package au.com.woolworths.shop.aem.components.model;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.graphql.MappedName;
import com.google.gson.annotations.SerializedName;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lau/com/woolworths/shop/aem/components/model/CatalogueCard;", "Lau/com/woolworths/shop/aem/components/model/GenericPageFeedItem;", "", "id", "title", NotificationMessage.NOTIF_KEY_SUB_TITLE, "imageLeft", "Lau/com/woolworths/shop/aem/components/model/CatalogueCardType;", "type", "Lau/com/woolworths/analytics/model/AnalyticsData;", "clickAnalytics", "impressionAnalytics", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lau/com/woolworths/shop/aem/components/model/CatalogueCardType;Lau/com/woolworths/analytics/model/AnalyticsData;Lau/com/woolworths/analytics/model/AnalyticsData;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "shop-aem-components_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CatalogueCard implements GenericPageFeedItem {

    /* renamed from: a, reason: collision with root package name */
    public final String f10140a;
    public final String b;
    public final String c;
    public final CatalogueCardType d;
    public final AnalyticsData e;
    public final AnalyticsData f;

    @SerializedName("catalogueCardId")
    @MappedName
    @Nullable
    private final String id;

    public CatalogueCard(@Nullable String str, @NotNull String title, @NotNull String subtitle, @Nullable String str2, @Nullable CatalogueCardType catalogueCardType, @Nullable AnalyticsData analyticsData, @Nullable AnalyticsData analyticsData2) {
        Intrinsics.h(title, "title");
        Intrinsics.h(subtitle, "subtitle");
        this.id = str;
        this.f10140a = title;
        this.b = subtitle;
        this.c = str2;
        this.d = catalogueCardType;
        this.e = analyticsData;
        this.f = analyticsData2;
    }

    /* renamed from: a, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogueCard)) {
            return false;
        }
        CatalogueCard catalogueCard = (CatalogueCard) obj;
        return Intrinsics.c(this.id, catalogueCard.id) && Intrinsics.c(this.f10140a, catalogueCard.f10140a) && Intrinsics.c(this.b, catalogueCard.b) && Intrinsics.c(this.c, catalogueCard.c) && this.d == catalogueCard.d && Intrinsics.c(this.e, catalogueCard.e) && Intrinsics.c(this.f, catalogueCard.f);
    }

    public final int hashCode() {
        String str = this.id;
        int iC = b.c(b.c((str == null ? 0 : str.hashCode()) * 31, 31, this.f10140a), 31, this.b);
        String str2 = this.c;
        int iHashCode = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
        CatalogueCardType catalogueCardType = this.d;
        int iHashCode2 = (iHashCode + (catalogueCardType == null ? 0 : catalogueCardType.hashCode())) * 31;
        AnalyticsData analyticsData = this.e;
        int iHashCode3 = (iHashCode2 + (analyticsData == null ? 0 : analyticsData.hashCode())) * 31;
        AnalyticsData analyticsData2 = this.f;
        return iHashCode3 + (analyticsData2 != null ? analyticsData2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbV = a.v("CatalogueCard(id=", this.id, ", title=", this.f10140a, ", subtitle=");
        androidx.constraintlayout.core.state.a.B(sbV, this.b, ", imageLeft=", this.c, ", type=");
        sbV.append(this.d);
        sbV.append(", clickAnalytics=");
        sbV.append(this.e);
        sbV.append(", impressionAnalytics=");
        return au.com.woolworths.android.onesite.a.n(sbV, this.f, ")");
    }

    public /* synthetic */ CatalogueCard(String str, String str2, String str3, String str4, CatalogueCardType catalogueCardType, AnalyticsData analyticsData, AnalyticsData analyticsData2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, catalogueCardType, (i & 32) != 0 ? null : analyticsData, (i & 64) != 0 ? null : analyticsData2);
    }
}
