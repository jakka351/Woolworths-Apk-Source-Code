package au.com.woolworths.feature.product.list.legacy.databinding;

import android.view.View;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.ProductCardConfig;
import au.com.woolworths.product.tile.ProductClickListener;
import au.com.woolworths.product.ui.ProductCardButtonsState;
import com.google.android.material.card.MaterialCardView;
import com.woolworths.R;

/* loaded from: classes3.dex */
public class EpoxyItemProductCardTileConsolidatedLegacyBindingImpl extends EpoxyItemProductCardTileConsolidatedLegacyBinding {
    public static final ViewDataBinding.IncludedLayouts F;
    public final EpoxyItemProductCardTileGridLegacyBinding D;
    public long E;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(2);
        F = includedLayouts;
        includedLayouts.a(0, new int[]{1}, new int[]{R.layout.epoxy_item_product_card_tile_grid_legacy}, new String[]{"epoxy_item_product_card_tile_grid_legacy"});
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EpoxyItemProductCardTileConsolidatedLegacyBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        super(dataBindingComponent, view, 0);
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 2, F, null);
        this.E = -1L;
        EpoxyItemProductCardTileGridLegacyBinding epoxyItemProductCardTileGridLegacyBinding = (EpoxyItemProductCardTileGridLegacyBinding) objArrT[1];
        this.D = epoxyItemProductCardTileGridLegacyBinding;
        if (epoxyItemProductCardTileGridLegacyBinding != null) {
            epoxyItemProductCardTileGridLegacyBinding.n = this;
        }
        ((MaterialCardView) objArrT[0]).setTag(null);
        E(view);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (206 == i) {
            this.B = (ProductCardConfig) obj;
            synchronized (this) {
                this.E |= 1;
            }
            h(206);
            y();
            return true;
        }
        if (46 == i) {
            this.y = (String) obj;
            synchronized (this) {
                this.E |= 2;
            }
            h(46);
            y();
            return true;
        }
        if (157 == i) {
            this.z = (ProductClickListener) obj;
            synchronized (this) {
                this.E |= 4;
            }
            h(157);
            y();
            return true;
        }
        if (53 == i) {
            this.A = (ProductCard) obj;
            synchronized (this) {
                this.E |= 8;
            }
            h(53);
            y();
            return true;
        }
        if (205 != i) {
            return false;
        }
        this.C = (ProductCardButtonsState) obj;
        synchronized (this) {
            this.E |= 16;
        }
        h(205);
        y();
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        synchronized (this) {
            j = this.E;
            this.E = 0L;
        }
        ProductCardConfig productCardConfig = this.B;
        String str = this.y;
        ProductClickListener productClickListener = this.z;
        ProductCard productCard = this.A;
        ProductCardButtonsState productCardButtonsState = this.C;
        long j2 = 33 & j;
        long j3 = 34 & j;
        long j4 = 36 & j;
        long j5 = 40 & j;
        long j6 = j & 48;
        if (j3 != 0) {
            this.D.L(str);
        }
        if (j4 != 0) {
            this.D.N(productClickListener);
        }
        if (j5 != 0) {
            this.D.M(productCard);
        }
        if (j2 != 0) {
            this.D.P(productCardConfig);
        }
        if (j6 != 0) {
            this.D.O(productCardButtonsState);
        }
        this.D.k();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                if (this.E != 0) {
                    return true;
                }
                return this.D.p();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.E = 32L;
        }
        this.D.r();
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
