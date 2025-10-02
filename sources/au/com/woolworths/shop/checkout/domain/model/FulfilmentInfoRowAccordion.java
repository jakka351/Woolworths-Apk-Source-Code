package au.com.woolworths.shop.checkout.domain.model;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.sdui.common.corerow.model.CoreRowModel;
import au.com.woolworths.shop.aem.components.model.paragraph.ParagraphTextItemData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/FulfilmentInfoRowAccordion;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class FulfilmentInfoRowAccordion {

    /* renamed from: a, reason: collision with root package name */
    public final CoreRowModel f10604a;
    public final boolean b;
    public final boolean c;
    public final Object d;
    public final AnalyticsData e;
    public final AnalyticsData f;

    public FulfilmentInfoRowAccordion(CoreRowModel coreRowModel, boolean z, boolean z2, ParagraphTextItemData paragraphTextItemData, AnalyticsData analyticsData, AnalyticsData analyticsData2) {
        this.f10604a = coreRowModel;
        this.b = z;
        this.c = z2;
        this.d = paragraphTextItemData;
        this.e = analyticsData;
        this.f = analyticsData2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FulfilmentInfoRowAccordion)) {
            return false;
        }
        FulfilmentInfoRowAccordion fulfilmentInfoRowAccordion = (FulfilmentInfoRowAccordion) obj;
        return Intrinsics.c(this.f10604a, fulfilmentInfoRowAccordion.f10604a) && this.b == fulfilmentInfoRowAccordion.b && this.c == fulfilmentInfoRowAccordion.c && Intrinsics.c(this.d, fulfilmentInfoRowAccordion.d) && Intrinsics.c(this.e, fulfilmentInfoRowAccordion.e) && Intrinsics.c(this.f, fulfilmentInfoRowAccordion.f);
    }

    public final int hashCode() {
        int iE = b.e(b.e(this.f10604a.hashCode() * 31, 31, this.b), 31, this.c);
        Object obj = this.d;
        int iHashCode = (iE + (obj == null ? 0 : obj.hashCode())) * 31;
        AnalyticsData analyticsData = this.e;
        int iHashCode2 = (iHashCode + (analyticsData == null ? 0 : analyticsData.hashCode())) * 31;
        AnalyticsData analyticsData2 = this.f;
        return iHashCode2 + (analyticsData2 != null ? analyticsData2.hashCode() : 0);
    }

    public final String toString() {
        return "FulfilmentInfoRowAccordion(rowUI=" + this.f10604a + ", isExpanded=" + this.b + ", hasTopSeparator=" + this.c + ", expandedContent=" + this.d + ", openActionAnalytics=" + this.e + ", closeActionAnalytics=" + this.f + ")";
    }
}
