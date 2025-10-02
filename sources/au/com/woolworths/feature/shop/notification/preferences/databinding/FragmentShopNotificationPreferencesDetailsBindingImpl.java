package au.com.woolworths.feature.shop.notification.preferences.databinding;

import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.feature.shop.notification.preferences.details.ShopNotificationPreferencesDetailsContract;
import au.com.woolworths.feature.shop.notification.preferences.details.ShopNotificationPreferencesDetailsViewModel;
import com.woolworths.R;

/* loaded from: classes3.dex */
public class FragmentShopNotificationPreferencesDetailsBindingImpl extends FragmentShopNotificationPreferencesDetailsBinding {
    public static final ViewDataBinding.IncludedLayouts F;
    public long E;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(4);
        F = includedLayouts;
        includedLayouts.a(0, new int[]{3}, new int[]{R.layout.include_generic_error_state}, new String[]{"include_generic_error_state"});
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void D(LifecycleOwner lifecycleOwner) {
        super.D(lifecycleOwner);
        this.z.D(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (273 != i) {
            return false;
        }
        L((ShopNotificationPreferencesDetailsViewModel) obj);
        return true;
    }

    @Override // au.com.woolworths.feature.shop.notification.preferences.databinding.FragmentShopNotificationPreferencesDetailsBinding
    public final void L(ShopNotificationPreferencesDetailsViewModel shopNotificationPreferencesDetailsViewModel) throws Throwable {
        this.C = shopNotificationPreferencesDetailsViewModel;
        synchronized (this) {
            this.E |= 4;
        }
        h(273);
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        int i;
        boolean z;
        synchronized (this) {
            j = this.E;
            this.E = 0L;
        }
        ShopNotificationPreferencesDetailsViewModel shopNotificationPreferencesDetailsViewModel = this.C;
        long j2 = j & 13;
        ShopNotificationPreferencesDetailsContract.NotificationsDetailsFullPageErrorState notificationsDetailsFullPageErrorState = null;
        if (j2 != 0) {
            MutableLiveData mutableLiveData = shopNotificationPreferencesDetailsViewModel != null ? shopNotificationPreferencesDetailsViewModel.j : null;
            I(0, mutableLiveData);
            ShopNotificationPreferencesDetailsContract.ViewState viewState = mutableLiveData != null ? (ShopNotificationPreferencesDetailsContract.ViewState) mutableLiveData.e() : null;
            if (viewState != null) {
                notificationsDetailsFullPageErrorState = viewState.e;
                z = viewState.c;
            } else {
                z = false;
            }
            boolean z2 = notificationsDetailsFullPageErrorState == null;
            boolean z3 = notificationsDetailsFullPageErrorState != null;
            if (j2 != 0) {
                j |= z2 ? 32L : 16L;
            }
            if ((j & 13) != 0) {
                j |= z3 ? 128L : 64L;
            }
            int i2 = z2 ? 8 : 0;
            i = z3 ? 8 : 0;
            i = i2;
        } else {
            i = 0;
            z = false;
        }
        if ((13 & j) != 0) {
            this.z.h.setVisibility(i);
            this.z.M(notificationsDetailsFullPageErrorState);
            BindingAdaptersKt.o(this.A, z);
            this.B.setVisibility(i);
        }
        if ((j & 12) != 0) {
            this.z.L(shopNotificationPreferencesDetailsViewModel);
        }
        this.z.k();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                if (this.E != 0) {
                    return true;
                }
                return this.z.p();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.E = 8L;
        }
        this.z.r();
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        if (i == 0) {
            if (i2 != 0) {
                return false;
            }
            synchronized (this) {
                this.E |= 1;
            }
            return true;
        }
        if (i != 1) {
            return false;
        }
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.E |= 2;
        }
        return true;
    }
}
