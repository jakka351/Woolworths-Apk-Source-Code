package au.com.woolworths.feature.product.list.legacy.data;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.shop.aem.components.model.link.LinkData;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/data/ProductListZeroResults;", "", "ProductListFullScreenError", "ZeroResultData", "Lau/com/woolworths/feature/product/list/legacy/data/ProductListZeroResults$ProductListFullScreenError;", "Lau/com/woolworths/feature/product/list/legacy/data/ProductListZeroResults$ZeroResultData;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface ProductListZeroResults {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/data/ProductListZeroResults$ProductListFullScreenError;", "Lau/com/woolworths/feature/product/list/legacy/data/ProductListZeroResults;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ProductListFullScreenError implements ProductListZeroResults {

        /* renamed from: a, reason: collision with root package name */
        public final String f5367a;
        public final String b;
        public final String c;
        public final LinkData d;
        public final AnalyticsData e;
        public final AnalyticsData f;

        public ProductListFullScreenError(String str, String str2, String str3, LinkData linkData, AnalyticsData analyticsData, AnalyticsData analyticsData2) {
            this.f5367a = str;
            this.b = str2;
            this.c = str3;
            this.d = linkData;
            this.e = analyticsData;
            this.f = analyticsData2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProductListFullScreenError)) {
                return false;
            }
            ProductListFullScreenError productListFullScreenError = (ProductListFullScreenError) obj;
            return Intrinsics.c(this.f5367a, productListFullScreenError.f5367a) && Intrinsics.c(this.b, productListFullScreenError.b) && Intrinsics.c(this.c, productListFullScreenError.c) && Intrinsics.c(this.d, productListFullScreenError.d) && Intrinsics.c(this.e, productListFullScreenError.e) && Intrinsics.c(this.f, productListFullScreenError.f);
        }

        public final int hashCode() {
            String str = this.f5367a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.c;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            LinkData linkData = this.d;
            int iHashCode4 = (iHashCode3 + (linkData == null ? 0 : linkData.hashCode())) * 31;
            AnalyticsData analyticsData = this.e;
            int iHashCode5 = (iHashCode4 + (analyticsData == null ? 0 : analyticsData.hashCode())) * 31;
            AnalyticsData analyticsData2 = this.f;
            return iHashCode5 + (analyticsData2 != null ? analyticsData2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = a.v("ProductListFullScreenError(image=", this.f5367a, ", title=", this.b, ", description=");
            sbV.append(this.c);
            sbV.append(", cta=");
            sbV.append(this.d);
            sbV.append(", analytics=");
            sbV.append(this.e);
            sbV.append(", impressionAnalytics=");
            sbV.append(this.f);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/data/ProductListZeroResults$ZeroResultData;", "Lau/com/woolworths/feature/product/list/legacy/data/ProductListZeroResults;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ZeroResultData implements ProductListZeroResults {

        /* renamed from: a, reason: collision with root package name */
        public final String f5368a;
        public final String b;
        public final String c;
        public final List d;

        public ZeroResultData(String str, String str2, String str3, List list) {
            this.f5368a = str;
            this.b = str2;
            this.c = str3;
            this.d = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List] */
        public static ZeroResultData a(ZeroResultData zeroResultData, String str, String str2, ArrayList arrayList, int i) {
            if ((i & 1) != 0) {
                str = zeroResultData.f5368a;
            }
            if ((i & 2) != 0) {
                str2 = zeroResultData.b;
            }
            String str3 = zeroResultData.c;
            ArrayList arrayList2 = arrayList;
            if ((i & 8) != 0) {
                arrayList2 = zeroResultData.d;
            }
            zeroResultData.getClass();
            return new ZeroResultData(str, str2, str3, arrayList2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ZeroResultData)) {
                return false;
            }
            ZeroResultData zeroResultData = (ZeroResultData) obj;
            return Intrinsics.c(this.f5368a, zeroResultData.f5368a) && Intrinsics.c(this.b, zeroResultData.b) && Intrinsics.c(this.c, zeroResultData.c) && Intrinsics.c(this.d, zeroResultData.d);
        }

        public final int hashCode() {
            String str = this.f5368a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.c;
            return this.d.hashCode() + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sbV = a.v("ZeroResultData(title=", this.f5368a, ", searchTerm=", this.b, ", message=");
            sbV.append(this.c);
            sbV.append(", items=");
            sbV.append(this.d);
            sbV.append(")");
            return sbV.toString();
        }
    }
}
