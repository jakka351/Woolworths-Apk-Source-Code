package au.com.woolworths.feature.product.list.legacy.data;

import android.support.v4.media.session.a;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.pagingutils.NumericPageData;
import au.com.woolworths.product.models.ProductCard;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/data/ProductListBySuggestedListApiData;", "Lau/com/woolworths/pagingutils/NumericPageData;", "Lau/com/woolworths/product/models/ProductCard;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ProductListBySuggestedListApiData implements NumericPageData<ProductCard> {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f5363a;
    public final Integer b;
    public final ArrayList c;

    public ProductListBySuggestedListApiData(Integer num, Integer num2, ArrayList arrayList) {
        this.f5363a = num;
        this.b = num2;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductListBySuggestedListApiData)) {
            return false;
        }
        ProductListBySuggestedListApiData productListBySuggestedListApiData = (ProductListBySuggestedListApiData) obj;
        return Intrinsics.c(this.f5363a, productListBySuggestedListApiData.f5363a) && Intrinsics.c(this.b, productListBySuggestedListApiData.b) && this.c.equals(productListBySuggestedListApiData.c);
    }

    @Override // au.com.woolworths.pagingutils.PageData
    /* renamed from: getItems */
    public final List getC() {
        return this.c;
    }

    @Override // au.com.woolworths.pagingutils.PageData
    public final Object getNextPageKey() {
        return this.b;
    }

    @Override // au.com.woolworths.pagingutils.PageData
    /* renamed from: getTotalCount */
    public final int getD() {
        Integer num = this.f5363a;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public final int hashCode() {
        Integer num = this.f5363a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        return this.c.hashCode() + ((iHashCode + (num2 != null ? num2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return a.q(")", d.v("ProductListBySuggestedListApiData(totalNumberOfProducts=", this.f5363a, ", nextPageKey=", this.b, ", items="), this.c);
    }
}
