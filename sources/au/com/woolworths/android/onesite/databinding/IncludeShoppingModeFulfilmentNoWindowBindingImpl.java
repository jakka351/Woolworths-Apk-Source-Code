package au.com.woolworths.android.onesite.databinding;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.generated.callback.OnClickListener;
import au.com.woolworths.android.onesite.modules.main.MainViewModel;
import au.com.woolworths.base.shopapp.databinding.EpoxyItemButtonBinding;
import au.com.woolworths.base.shopapp.modules.button.ButtonClickHandler;
import au.com.woolworths.feature.shop.homepage.data.FulfilmentWindowContainer;
import com.airbnb.lottie.LottieAnimationView;
import com.woolworths.R;

/* loaded from: classes3.dex */
public class IncludeShoppingModeFulfilmentNoWindowBindingImpl extends IncludeShoppingModeFulfilmentNoWindowBinding implements OnClickListener.Listener {
    public static final ViewDataBinding.IncludedLayouts I;
    public final OnClickListener F;
    public final OnClickListener G;
    public long H;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(5);
        I = includedLayouts;
        includedLayouts.a(0, new int[]{2, 3, 4}, new int[]{R.layout.epoxy_item_button, R.layout.include_shopping_mode_dn_banner, R.layout.epoxy_item_button}, new String[]{"epoxy_item_button", "include_shopping_mode_dn_banner", "epoxy_item_button"});
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public IncludeShoppingModeFulfilmentNoWindowBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 5, I, null);
        super(dataBindingComponent, view, (LottieAnimationView) objArrT[1], (IncludeShoppingModeDnBannerBinding) objArrT[3], (EpoxyItemButtonBinding) objArrT[4], (EpoxyItemButtonBinding) objArrT[2]);
        this.H = -1L;
        this.y.setTag(null);
        IncludeShoppingModeDnBannerBinding includeShoppingModeDnBannerBinding = this.z;
        if (includeShoppingModeDnBannerBinding != null) {
            includeShoppingModeDnBannerBinding.n = this;
        }
        ((ConstraintLayout) objArrT[0]).setTag(null);
        EpoxyItemButtonBinding epoxyItemButtonBinding = this.A;
        if (epoxyItemButtonBinding != null) {
            epoxyItemButtonBinding.n = this;
        }
        EpoxyItemButtonBinding epoxyItemButtonBinding2 = this.B;
        if (epoxyItemButtonBinding2 != null) {
            epoxyItemButtonBinding2.n = this;
        }
        E(view);
        this.F = new OnClickListener(this, 1);
        this.G = new OnClickListener(this, 2);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (35 == i) {
            this.D = (ButtonClickHandler) obj;
            synchronized (this) {
                this.H |= 8;
            }
            h(35);
            y();
            return true;
        }
        if (53 == i) {
            this.C = (FulfilmentWindowContainer) obj;
            synchronized (this) {
                this.H |= 16;
            }
            h(53);
            y();
            return true;
        }
        if (54 != i) {
            return false;
        }
        this.E = (MainViewModel) obj;
        synchronized (this) {
            this.H |= 32;
        }
        h(54);
        y();
        return true;
    }

    @Override // au.com.woolworths.android.onesite.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        if (i == 1) {
            MainViewModel mainViewModel = this.E;
            FulfilmentWindowContainer fulfilmentWindowContainer = this.C;
            if (mainViewModel != null) {
                mainViewModel.x6(fulfilmentWindowContainer);
                return;
            }
            return;
        }
        if (i != 2) {
            return;
        }
        MainViewModel mainViewModel2 = this.E;
        FulfilmentWindowContainer fulfilmentWindowContainer2 = this.C;
        if (mainViewModel2 != null) {
            mainViewModel2.x6(fulfilmentWindowContainer2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0082  */
    /* JADX WARN: Type inference failed for: r13v5, types: [au.com.woolworths.feature.shop.homepage.data.HomepageFulfilmentOrientation] */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j() throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 297
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.android.onesite.databinding.IncludeShoppingModeFulfilmentNoWindowBindingImpl.j():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                if (this.H != 0) {
                    return true;
                }
                return this.B.p() || this.z.p() || this.A.p();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.H = 64L;
        }
        this.B.r();
        this.z.r();
        this.A.r();
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        if (i == 0) {
            if (i2 != 0) {
                return false;
            }
            synchronized (this) {
                this.H |= 1;
            }
            return true;
        }
        if (i == 1) {
            if (i2 != 0) {
                return false;
            }
            synchronized (this) {
                this.H |= 2;
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
            this.H |= 4;
        }
        return true;
    }
}
