package au.com.woolworths.shop.buyagain.domain;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.pagingutils.NumericPageData;
import au.com.woolworths.product.models.ProductCard;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@StabilityInferred
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/buyagain/domain/BuyAgainProductListPageData;", "Lau/com/woolworths/pagingutils/NumericPageData;", "Lau/com/woolworths/product/models/ProductCard;", "shop-buy-again_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class BuyAgainProductListPageData implements NumericPageData<ProductCard> {

    /* renamed from: a, reason: collision with root package name */
    public final BuyAgainHeader f10258a;
    public final BuyAgainFooter b;
    public final List c;
    public final int d;

    public BuyAgainProductListPageData(BuyAgainHeader buyAgainHeader, BuyAgainFooter buyAgainFooter, List list, int i, int i2) {
        list = (i2 & 4) != 0 ? EmptyList.d : list;
        this.f10258a = buyAgainHeader;
        this.b = buyAgainFooter;
        this.c = list;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BuyAgainProductListPageData)) {
            return false;
        }
        BuyAgainProductListPageData buyAgainProductListPageData = (BuyAgainProductListPageData) obj;
        return this.f10258a.equals(buyAgainProductListPageData.f10258a) && this.b.equals(buyAgainProductListPageData.b) && this.c.equals(buyAgainProductListPageData.c) && this.d == buyAgainProductListPageData.d;
    }

    @Override // au.com.woolworths.pagingutils.PageData
    /* renamed from: getItems, reason: from getter */
    public final List getC() {
        return this.c;
    }

    @Override // au.com.woolworths.pagingutils.PageData
    public final Object getNextPageKey() {
        return null;
    }

    @Override // au.com.woolworths.pagingutils.PageData
    /* renamed from: getTotalCount, reason: from getter */
    public final int getD() {
        return this.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + b.d((this.b.hashCode() + (this.f10258a.hashCode() * 31)) * 31, 961, this.c);
    }

    public final String toString() {
        return "BuyAgainProductListPageData(buyAgainHeader=" + this.f10258a + ", buyAgainFooter=" + this.b + ", items=" + this.c + ", nextPageKey=null, totalCount=" + this.d + ")";
    }
}
