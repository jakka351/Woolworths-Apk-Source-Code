package au.com.woolworths.product.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeBrandLabelBinding;
import au.com.woolworths.product.generated.callback.OnClickListener;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.tile.ProductClickListener;
import au.com.woolworths.product.tile.ProductPriceView;
import com.google.android.material.card.MaterialCardView;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.llqqqql;
import com.woolworths.R;

/* loaded from: classes4.dex */
public class EpoxyItemProductCardTileBindingImpl extends EpoxyItemProductCardTileBinding implements OnClickListener.Listener {
    public static final ViewDataBinding.IncludedLayouts h0;
    public static final SparseIntArray i0;
    public final MaterialCardView Z;
    public final OnClickListener a0;
    public final OnClickListener b0;
    public final OnClickListener c0;
    public final OnClickListener d0;
    public final OnClickListener e0;
    public final OnClickListener f0;
    public long g0;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(24);
        h0 = includedLayouts;
        includedLayouts.a(1, new int[]{19, 20, 21}, new int[]{R.layout.include_brand_label, R.layout.include_product_multibuy_label, R.layout.layout_member_price_label}, new String[]{"include_brand_label", "include_product_multibuy_label", "layout_member_price_label"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        i0 = sparseIntArray;
        sparseIntArray.put(R.id.guideline_start, 22);
        sparseIntArray.put(R.id.guideline_end, 23);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public EpoxyItemProductCardTileBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 24, h0, i0);
        Button button = (Button) objArrT[14];
        ImageView imageView = (ImageView) objArrT[3];
        Barrier barrier = (Barrier) objArrT[13];
        Button button2 = (Button) objArrT[16];
        super(dataBindingComponent, view, button, imageView, barrier, button2, (Button) objArrT[18], (Button) objArrT[17], (TextView) objArrT[11], (Group) objArrT[6], (ImageView) objArrT[2], (IncludeBrandLabelBinding) objArrT[19], (LayoutMemberPriceLabelBinding) objArrT[21], (IncludeProductMultibuyLabelBinding) objArrT[20], (TextView) objArrT[5], (ProductPriceView) objArrT[7], (TextView) objArrT[12], (TextView) objArrT[8], (TextView) objArrT[9], (TextView) objArrT[10], (Button) objArrT[15], (ImageView) objArrT[4]);
        this.g0 = -1L;
        this.y.setTag(null);
        this.z.setTag(null);
        this.A.setTag(null);
        this.B.setTag(null);
        this.C.setTag(null);
        this.D.setTag(null);
        this.E.setTag(null);
        MaterialCardView materialCardView = (MaterialCardView) objArrT[0];
        this.Z = materialCardView;
        materialCardView.setTag(null);
        ((ConstraintLayout) objArrT[1]).setTag(null);
        this.F.setTag(null);
        this.G.setTag(null);
        IncludeBrandLabelBinding includeBrandLabelBinding = this.H;
        if (includeBrandLabelBinding != null) {
            includeBrandLabelBinding.n = this;
        }
        LayoutMemberPriceLabelBinding layoutMemberPriceLabelBinding = this.I;
        if (layoutMemberPriceLabelBinding != null) {
            layoutMemberPriceLabelBinding.n = this;
        }
        IncludeProductMultibuyLabelBinding includeProductMultibuyLabelBinding = this.J;
        if (includeProductMultibuyLabelBinding != null) {
            includeProductMultibuyLabelBinding.n = this;
        }
        this.K.setTag(null);
        this.L.setTag(null);
        this.M.setTag(null);
        this.N.setTag(null);
        this.O.setTag(null);
        this.P.setTag(null);
        this.Q.setTag(null);
        this.R.setTag(null);
        E(view);
        this.a0 = new OnClickListener(this, 2);
        this.b0 = new OnClickListener(this, 1);
        this.c0 = new OnClickListener(this, 6);
        this.d0 = new OnClickListener(this, 5);
        this.e0 = new OnClickListener(this, 4);
        this.f0 = new OnClickListener(this, 3);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (157 == i) {
            this.T = (ProductClickListener) obj;
            synchronized (this) {
                this.g0 |= 8;
            }
            h(157);
            y();
            return true;
        }
        if (144 == i) {
            this.X = (Boolean) obj;
            synchronized (this) {
                this.g0 |= 16;
            }
            h(144);
            y();
            return true;
        }
        if (46 == i) {
            this.S = (String) obj;
            synchronized (this) {
                this.g0 |= 32;
            }
            h(46);
            y();
            return true;
        }
        if (132 == i) {
            this.Y = ((Boolean) obj).booleanValue();
            synchronized (this) {
                this.g0 |= 64;
            }
            h(132);
            y();
            return true;
        }
        if (236 == i) {
            this.V = (Boolean) obj;
            synchronized (this) {
                this.g0 |= 128;
            }
            h(236);
            y();
            return true;
        }
        if (53 == i) {
            this.U = (ProductCard) obj;
            synchronized (this) {
                this.g0 |= 256;
            }
            h(53);
            y();
            return true;
        }
        if (28 != i) {
            return false;
        }
        this.W = (Boolean) obj;
        synchronized (this) {
            this.g0 |= 512;
        }
        h(28);
        y();
        return true;
    }

    @Override // au.com.woolworths.product.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        switch (i) {
            case 1:
                String str = this.S;
                ProductClickListener productClickListener = this.T;
                ProductCard productCard = this.U;
                if (productClickListener != null) {
                    productClickListener.J1(productCard, str);
                    break;
                }
                break;
            case 2:
                String str2 = this.S;
                ProductClickListener productClickListener2 = this.T;
                ProductCard productCard2 = this.U;
                if (productClickListener2 != null) {
                    productClickListener2.g6(productCard2, str2);
                    break;
                }
                break;
            case 3:
                String str3 = this.S;
                ProductClickListener productClickListener3 = this.T;
                ProductCard productCard3 = this.U;
                if (productClickListener3 != null) {
                    productClickListener3.T4(productCard3, str3);
                    break;
                }
                break;
            case 4:
                String str4 = this.S;
                ProductClickListener productClickListener4 = this.T;
                ProductCard productCard4 = this.U;
                if (productClickListener4 != null) {
                    productClickListener4.D4(productCard4, str4);
                    break;
                }
                break;
            case 5:
                String str5 = this.S;
                ProductClickListener productClickListener5 = this.T;
                ProductCard productCard5 = this.U;
                if (productClickListener5 != null) {
                    productClickListener5.L0(productCard5, str5);
                    break;
                }
                break;
            case 6:
                String str6 = this.S;
                ProductClickListener productClickListener6 = this.T;
                ProductCard productCard6 = this.U;
                if (productClickListener6 != null) {
                    productClickListener6.L0(productCard6, str6);
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007f  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j() throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 1063
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.product.databinding.EpoxyItemProductCardTileBindingImpl.j():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                if (this.g0 != 0) {
                    return true;
                }
                return this.H.p() || this.J.p() || this.I.p();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.g0 = llqqqql.c00630063c0063c0063;
        }
        this.H.r();
        this.J.r();
        this.I.r();
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        if (i == 0) {
            if (i2 != 0) {
                return false;
            }
            synchronized (this) {
                this.g0 |= 1;
            }
            return true;
        }
        if (i == 1) {
            if (i2 != 0) {
                return false;
            }
            synchronized (this) {
                this.g0 |= 2;
            }
            return true;
        }
        if (i != 2) {
            return false;
        }
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.g0 |= 4;
        }
        return true;
    }
}
