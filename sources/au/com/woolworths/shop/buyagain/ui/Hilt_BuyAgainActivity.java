package au.com.woolworths.shop.buyagain.ui;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.activity.contextaware.OnContextAvailableListener;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.managers.ActivityComponentManager;
import dagger.hilt.android.internal.managers.SavedStateHandleHolder;
import dagger.hilt.internal.GeneratedComponentManager;
import dagger.hilt.internal.GeneratedComponentManagerHolder;

/* loaded from: classes4.dex */
abstract class Hilt_BuyAgainActivity extends AppCompatActivity implements GeneratedComponentManagerHolder {
    public SavedStateHandleHolder t;
    public volatile ActivityComponentManager u;
    public final Object v = new Object();
    public boolean w = false;

    public Hilt_BuyAgainActivity() {
        final BuyAgainActivity buyAgainActivity = (BuyAgainActivity) this;
        addOnContextAvailableListener(new OnContextAvailableListener() { // from class: au.com.woolworths.shop.buyagain.ui.Hilt_BuyAgainActivity.1
            @Override // androidx.activity.contextaware.OnContextAvailableListener
            public final void a(ComponentActivity componentActivity) {
                BuyAgainActivity buyAgainActivity2 = buyAgainActivity;
                if (buyAgainActivity2.w) {
                    return;
                }
                buyAgainActivity2.w = true;
                ((BuyAgainActivity_GeneratedInjector) buyAgainActivity2.t3()).l0(buyAgainActivity2);
            }
        });
    }

    public final ActivityComponentManager N4() {
        if (this.u == null) {
            synchronized (this.v) {
                try {
                    if (this.u == null) {
                        this.u = new ActivityComponentManager(this);
                    }
                } finally {
                }
            }
        }
        return this.u;
    }

    @Override // androidx.activity.ComponentActivity, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return DefaultViewModelFactories.a(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getApplication() instanceof GeneratedComponentManager) {
            SavedStateHandleHolder savedStateHandleHolderB = N4().b();
            this.t = savedStateHandleHolderB;
            if (savedStateHandleHolderB.a()) {
                this.t.f23774a = getDefaultViewModelCreationExtras();
            }
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        SavedStateHandleHolder savedStateHandleHolder = this.t;
        if (savedStateHandleHolder != null) {
            savedStateHandleHolder.f23774a = null;
        }
    }

    @Override // dagger.hilt.internal.GeneratedComponentManager
    public final Object t3() {
        return N4().t3();
    }
}
