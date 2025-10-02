package au.com.woolworths.shop.deliveryunlimited.signup.databinding;

import android.graphics.drawable.ColorDrawable;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.MutableLiveData;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.android.onesite.utils.ScrimUtil;
import au.com.woolworths.shop.deliveryunlimited.signup.analytics.ConfirmationActions;
import au.com.woolworths.shop.deliveryunlimited.signup.confirmation.ConfirmationContract;
import au.com.woolworths.shop.deliveryunlimited.signup.confirmation.ConfirmationViewModel;
import au.com.woolworths.shop.deliveryunlimited.signup.generated.callback.OnClickListener;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.woolworths.R;

/* loaded from: classes4.dex */
public class ActivityDeliveryUnlimitedSignUpSubscriptionConfirmationBindingImpl extends ActivityDeliveryUnlimitedSignUpSubscriptionConfirmationBinding implements OnClickListener.Listener {
    public static final SparseIntArray H;
    public final ContentLoadingProgressBar E;
    public final OnClickListener F;
    public long G;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        H = sparseIntArray;
        sparseIntArray.put(R.id.app_bar, 6);
        sparseIntArray.put(R.id.toolbar, 7);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ActivityDeliveryUnlimitedSignUpSubscriptionConfirmationBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 8, null, H);
        super(dataBindingComponent, view, (EpoxyRecyclerView) objArrT[1], (FrameLayout) objArrT[4], (View) objArrT[3], (Button) objArrT[5], (Toolbar) objArrT[7]);
        this.G = -1L;
        this.y.setTag(null);
        this.z.setTag(null);
        ((ConstraintLayout) objArrT[0]).setTag(null);
        ContentLoadingProgressBar contentLoadingProgressBar = (ContentLoadingProgressBar) objArrT[2];
        this.E = contentLoadingProgressBar;
        contentLoadingProgressBar.setTag(null);
        this.A.setTag(null);
        this.B.setTag(null);
        E(view);
        this.F = new OnClickListener(this);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (273 != i) {
            return false;
        }
        L((ConfirmationViewModel) obj);
        return true;
    }

    @Override // au.com.woolworths.shop.deliveryunlimited.signup.databinding.ActivityDeliveryUnlimitedSignUpSubscriptionConfirmationBinding
    public final void L(ConfirmationViewModel confirmationViewModel) throws Throwable {
        this.D = confirmationViewModel;
        synchronized (this) {
            this.G |= 2;
        }
        h(273);
        y();
    }

    @Override // au.com.woolworths.shop.deliveryunlimited.signup.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        ConfirmationViewModel confirmationViewModel = this.D;
        if (confirmationViewModel != null) {
            confirmationViewModel.f.c(ConfirmationActions.e);
            confirmationViewModel.h.f(ConfirmationContract.Actions.LaunchHomePage.f10851a);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        boolean z;
        synchronized (this) {
            j = this.G;
            this.G = 0L;
        }
        ConfirmationViewModel confirmationViewModel = this.D;
        long j2 = 7 & j;
        if (j2 != 0) {
            MutableLiveData mutableLiveData = confirmationViewModel != null ? confirmationViewModel.g : null;
            I(0, mutableLiveData);
            ConfirmationContract.ViewState viewState = mutableLiveData != null ? (ConfirmationContract.ViewState) mutableLiveData.e() : null;
            z = viewState != null ? viewState.f10852a : false;
            boolean z2 = z;
            z = !z;
            z = z2;
        } else {
            z = false;
        }
        if (j2 != 0) {
            BindingAdaptersKt.o(this.y, z);
            BindingAdaptersKt.o(this.z, z);
            BindingAdaptersKt.o(this.E, z);
            BindingAdaptersKt.o(this.A, z);
        }
        if ((j & 4) != 0) {
            View view = this.A;
            ScrimUtil.a(view, 80, new ColorDrawable(ViewDataBinding.n(R.color.color_scrim_shadow, view)));
            this.B.setOnClickListener(this.F);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.G != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.G = 4L;
        }
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
            this.G |= 1;
        }
        return true;
    }
}
