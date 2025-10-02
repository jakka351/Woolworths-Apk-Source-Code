package au.com.woolworths.feature.shop.homepage.presentation.carousel;

import android.view.View;
import android.view.ViewGroup;
import au.com.woolworths.android.onesite.data.HorizontalListData;
import au.com.woolworths.base.shopapp.epoxy.HorizontalListActionClickListener;
import au.com.woolworths.base.shopapp.epoxy.HorizontalListActionState;
import au.com.woolworths.product.models.ProductCardConfig;
import au.com.woolworths.product.tile.ProductClickListener;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.GeneratedModel;
import java.util.List;

/* loaded from: classes3.dex */
public class ProductCarouselViewModel_ extends EpoxyModel<ProductCarouselView> implements GeneratedModel<ProductCarouselView>, ProductCarouselViewModelBuilder {
    public HorizontalListData n;
    public ProductCardConfig o;
    public HorizontalListActionState p;
    public List q;
    public HorizontalListActionClickListener r;
    public ProductClickListener s;

    @Override // com.airbnb.epoxy.EpoxyModel
    public final void A(Object obj) {
        ProductCarouselView productCarouselView = (ProductCarouselView) obj;
        productCarouselView.setHorizontalListActionClickListener(null);
        productCarouselView.setProductCardClickListener(null);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public final void h(ProductCarouselView productCarouselView) {
        productCarouselView.setProductCardConfig(this.o);
        productCarouselView.setRewardsThemeAction(false);
        productCarouselView.setHorizontalListActionClickListener(this.r);
        productCarouselView.setData(this.n);
        productCarouselView.setHorizontalListActionState(this.p);
        productCarouselView.setProductCardClickListener(this.s);
        productCarouselView.setWatchlistedProductIds(this.q);
    }

    public final void D(String str) {
        super.p(str);
    }

    @Override // com.airbnb.epoxy.GeneratedModel
    public final void a(int i, Object obj) {
        B(i, "The model was changed during the bind call.");
    }

    @Override // com.airbnb.epoxy.GeneratedModel
    public final void b(int i, Object obj) {
        B(i, "The model was changed between being added to the controller and being bound.");
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final void c(EpoxyController epoxyController) {
        epoxyController.addInternal(this);
        d(epoxyController);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProductCarouselViewModel_) || !super.equals(obj)) {
            return false;
        }
        ProductCarouselViewModel_ productCarouselViewModel_ = (ProductCarouselViewModel_) obj;
        HorizontalListData horizontalListData = this.n;
        if (horizontalListData == null ? productCarouselViewModel_.n != null : !horizontalListData.equals(productCarouselViewModel_.n)) {
            return false;
        }
        ProductCardConfig productCardConfig = this.o;
        if (productCardConfig == null ? productCarouselViewModel_.o != null : !productCardConfig.equals(productCarouselViewModel_.o)) {
            return false;
        }
        HorizontalListActionState horizontalListActionState = this.p;
        if (horizontalListActionState == null ? productCarouselViewModel_.p != null : !horizontalListActionState.equals(productCarouselViewModel_.p)) {
            return false;
        }
        List list = this.q;
        if (list == null ? productCarouselViewModel_.q != null : !list.equals(productCarouselViewModel_.q)) {
            return false;
        }
        if ((this.r == null) != (productCarouselViewModel_.r == null)) {
            return false;
        }
        return (this.s == null) == (productCarouselViewModel_.s == null);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final void g(EpoxyModel epoxyModel, Object obj) {
        ProductCarouselView productCarouselView = (ProductCarouselView) obj;
        if (!(epoxyModel instanceof ProductCarouselViewModel_)) {
            h(productCarouselView);
            return;
        }
        ProductCarouselViewModel_ productCarouselViewModel_ = (ProductCarouselViewModel_) epoxyModel;
        ProductCardConfig productCardConfig = this.o;
        if (productCardConfig == null ? productCarouselViewModel_.o != null : !productCardConfig.equals(productCarouselViewModel_.o)) {
            productCarouselView.setProductCardConfig(this.o);
        }
        HorizontalListActionClickListener horizontalListActionClickListener = this.r;
        if ((horizontalListActionClickListener == null) != (productCarouselViewModel_.r == null)) {
            productCarouselView.setHorizontalListActionClickListener(horizontalListActionClickListener);
        }
        HorizontalListData horizontalListData = this.n;
        if (horizontalListData == null ? productCarouselViewModel_.n != null : !horizontalListData.equals(productCarouselViewModel_.n)) {
            productCarouselView.setData(this.n);
        }
        HorizontalListActionState horizontalListActionState = this.p;
        if (horizontalListActionState == null ? productCarouselViewModel_.p != null : !horizontalListActionState.equals(productCarouselViewModel_.p)) {
            productCarouselView.setHorizontalListActionState(this.p);
        }
        ProductClickListener productClickListener = this.s;
        if ((productClickListener == null) != (productCarouselViewModel_.s == null)) {
            productCarouselView.setProductCardClickListener(productClickListener);
        }
        List list = this.q;
        List list2 = productCarouselViewModel_.q;
        if (list != null) {
            if (list.equals(list2)) {
                return;
            }
        } else if (list2 == null) {
            return;
        }
        productCarouselView.setWatchlistedProductIds(this.q);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final int hashCode() {
        int iHashCode = super.hashCode() * 28629151;
        HorizontalListData horizontalListData = this.n;
        int iHashCode2 = (iHashCode + (horizontalListData != null ? horizontalListData.hashCode() : 0)) * 31;
        ProductCardConfig productCardConfig = this.o;
        int iHashCode3 = (iHashCode2 + (productCardConfig != null ? productCardConfig.hashCode() : 0)) * 31;
        HorizontalListActionState horizontalListActionState = this.p;
        int iHashCode4 = (iHashCode3 + (horizontalListActionState != null ? horizontalListActionState.hashCode() : 0)) * 961;
        List list = this.q;
        return ((((iHashCode4 + (list != null ? list.hashCode() : 0)) * 31) + (this.r != null ? 1 : 0)) * 31) + (this.s != null ? 1 : 0);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final View j(ViewGroup viewGroup) {
        ProductCarouselView productCarouselView = new ProductCarouselView(viewGroup.getContext());
        productCarouselView.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        return productCarouselView;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: k */
    public final int getN() {
        throw new UnsupportedOperationException("Layout resources are unsupported for views created programmatically.");
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final int m(int i, int i2, int i3) {
        return i;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final int n() {
        return 0;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final EpoxyModel o(long j) {
        super.o(j);
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final String toString() {
        return "ProductCarouselViewModel_{data_HorizontalListData=" + this.n + ", productCardConfig_ProductCardConfig=" + this.o + ", horizontalListActionState_HorizontalListActionState=" + this.p + ", rewardsThemeAction_Boolean=false, watchlistedProductIds_List=" + this.q + ", horizontalListActionClickListener_HorizontalListActionClickListener=" + this.r + ", productCardClickListener_ProductClickListener=" + this.s + "}" + super.toString();
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void w(float f, float f2, int i, int i2, Object obj) {
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void x(int i, Object obj) {
    }
}
