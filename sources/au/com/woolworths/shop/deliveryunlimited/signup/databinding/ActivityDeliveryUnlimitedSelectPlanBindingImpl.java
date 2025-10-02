package au.com.woolworths.shop.deliveryunlimited.signup.databinding;

import android.graphics.drawable.ColorDrawable;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.lifecycle.LifecycleOwner;
import au.com.woolworths.android.onesite.utils.ScrimUtil;
import au.com.woolworths.base.shopapp.modules.button.ButtonApiData;
import au.com.woolworths.shop.deliveryunlimited.signup.data.DeliveryUnlimitedSignUpFooter;
import au.com.woolworths.shop.deliveryunlimited.signup.data.DeliveryUnlimitedSignUpPlans;
import au.com.woolworths.shop.deliveryunlimited.signup.selectplan.SelectPlanViewModel;
import com.woolworths.R;

/* loaded from: classes4.dex */
public class ActivityDeliveryUnlimitedSelectPlanBindingImpl extends ActivityDeliveryUnlimitedSelectPlanBinding {
    public static final ViewDataBinding.IncludedLayouts I;
    public static final SparseIntArray J;
    public long H;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(8);
        I = includedLayouts;
        includedLayouts.a(2, new int[]{4}, new int[]{R.layout.epoxy_item_button}, new String[]{"epoxy_item_button"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        J = sparseIntArray;
        sparseIntArray.put(R.id.app_bar, 5);
        sparseIntArray.put(R.id.toolbar, 6);
        sparseIntArray.put(R.id.content, 7);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void D(LifecycleOwner lifecycleOwner) {
        super.D(lifecycleOwner);
        this.D.D(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (194 == i) {
            M((DeliveryUnlimitedSignUpPlans) obj);
            return true;
        }
        if (273 == i) {
            N((SelectPlanViewModel) obj);
            return true;
        }
        if (23 != i) {
            return false;
        }
        L((ButtonApiData) obj);
        return true;
    }

    @Override // au.com.woolworths.shop.deliveryunlimited.signup.databinding.ActivityDeliveryUnlimitedSelectPlanBinding
    public final void L(ButtonApiData buttonApiData) throws Throwable {
        this.G = buttonApiData;
        synchronized (this) {
            this.H |= 8;
        }
        h(23);
        y();
    }

    @Override // au.com.woolworths.shop.deliveryunlimited.signup.databinding.ActivityDeliveryUnlimitedSelectPlanBinding
    public final void M(DeliveryUnlimitedSignUpPlans deliveryUnlimitedSignUpPlans) throws Throwable {
        this.F = deliveryUnlimitedSignUpPlans;
        synchronized (this) {
            this.H |= 2;
        }
        h(194);
        y();
    }

    @Override // au.com.woolworths.shop.deliveryunlimited.signup.databinding.ActivityDeliveryUnlimitedSelectPlanBinding
    public final void N(SelectPlanViewModel selectPlanViewModel) throws Throwable {
        this.E = selectPlanViewModel;
        synchronized (this) {
            this.H |= 4;
        }
        h(273);
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        synchronized (this) {
            j = this.H;
            this.H = 0L;
        }
        DeliveryUnlimitedSignUpPlans deliveryUnlimitedSignUpPlans = this.F;
        SelectPlanViewModel selectPlanViewModel = this.E;
        ButtonApiData buttonApiData = this.G;
        long j2 = 18 & j;
        String disclaimer = null;
        if (j2 != 0) {
            DeliveryUnlimitedSignUpFooter footer = deliveryUnlimitedSignUpPlans != null ? deliveryUnlimitedSignUpPlans.getFooter() : null;
            if (footer != null) {
                disclaimer = footer.getDisclaimer();
            }
        }
        long j3 = 20 & j;
        long j4 = 24 & j;
        if (j2 != 0) {
            TextViewBindingAdapter.b(this.z, disclaimer);
        }
        if ((j & 16) != 0) {
            View view = this.B;
            ScrimUtil.a(view, 80, new ColorDrawable(ViewDataBinding.n(R.color.color_scrim_shadow, view)));
        }
        if (j4 != 0) {
            this.D.L(buttonApiData);
        }
        if (j3 != 0) {
            this.D.M(selectPlanViewModel);
        }
        this.D.k();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                if (this.H != 0) {
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
            this.H = 16L;
        }
        this.D.r();
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        if (i != 0) {
            return false;
        }
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.H |= 1;
        }
        return true;
    }
}
