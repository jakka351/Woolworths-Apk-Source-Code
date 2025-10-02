package au.com.woolworths.android.onesite.modules.checkout.ui;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.activity.contextaware.OnContextAvailableListener;
import androidx.lifecycle.ViewModelProvider;
import au.com.woolworths.android.onesite.modules.BaseShopAppActivity;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.managers.ActivityComponentManager;
import dagger.hilt.android.internal.managers.SavedStateHandleHolder;
import dagger.hilt.internal.GeneratedComponentManager;
import dagger.hilt.internal.GeneratedComponentManagerHolder;

/* loaded from: classes3.dex */
public abstract class Hilt_CheckoutActivity extends BaseShopAppActivity implements GeneratedComponentManagerHolder {
    public SavedStateHandleHolder x;
    public volatile ActivityComponentManager y;
    public final Object z = new Object();
    public boolean A = false;

    public Hilt_CheckoutActivity() {
        addOnContextAvailableListener(new OnContextAvailableListener() { // from class: au.com.woolworths.android.onesite.modules.checkout.ui.Hilt_CheckoutActivity.1
            @Override // androidx.activity.contextaware.OnContextAvailableListener
            public final void a(ComponentActivity componentActivity) {
                Hilt_CheckoutActivity hilt_CheckoutActivity = Hilt_CheckoutActivity.this;
                if (hilt_CheckoutActivity.A) {
                    return;
                }
                hilt_CheckoutActivity.A = true;
                ((CheckoutActivity_GeneratedInjector) hilt_CheckoutActivity.t3()).P((CheckoutActivity) hilt_CheckoutActivity);
            }
        });
    }

    public final ActivityComponentManager Q4() {
        if (this.y == null) {
            synchronized (this.z) {
                try {
                    if (this.y == null) {
                        this.y = new ActivityComponentManager(this);
                    }
                } finally {
                }
            }
        }
        return this.y;
    }

    @Override // androidx.activity.ComponentActivity, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return DefaultViewModelFactories.a(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // au.com.woolworths.android.onesite.modules.BaseShopAppActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) throws NoSuchMethodException, SecurityException {
        super.onCreate(bundle);
        if (getApplication() instanceof GeneratedComponentManager) {
            SavedStateHandleHolder savedStateHandleHolderB = Q4().b();
            this.x = savedStateHandleHolderB;
            if (savedStateHandleHolderB.a()) {
                this.x.f23774a = getDefaultViewModelCreationExtras();
            }
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        SavedStateHandleHolder savedStateHandleHolder = this.x;
        if (savedStateHandleHolder != null) {
            savedStateHandleHolder.f23774a = null;
        }
    }

    @Override // dagger.hilt.internal.GeneratedComponentManager
    public final Object t3() {
        return Q4().t3();
    }
}
