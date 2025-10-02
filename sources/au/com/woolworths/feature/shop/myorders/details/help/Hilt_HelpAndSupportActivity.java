package au.com.woolworths.feature.shop.myorders.details.help;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.activity.contextaware.OnContextAvailableListener;
import androidx.lifecycle.ViewModelProvider;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.managers.ActivityComponentManager;
import dagger.hilt.android.internal.managers.SavedStateHandleHolder;
import dagger.hilt.internal.GeneratedComponentManager;
import dagger.hilt.internal.GeneratedComponentManagerHolder;

/* loaded from: classes3.dex */
public abstract class Hilt_HelpAndSupportActivity extends ComponentActivity implements GeneratedComponentManagerHolder {
    public SavedStateHandleHolder s;
    public volatile ActivityComponentManager t;
    public final Object u = new Object();
    public boolean v = false;

    public Hilt_HelpAndSupportActivity() {
        addOnContextAvailableListener(new OnContextAvailableListener() { // from class: au.com.woolworths.feature.shop.myorders.details.help.Hilt_HelpAndSupportActivity.1
            @Override // androidx.activity.contextaware.OnContextAvailableListener
            public final void a(ComponentActivity componentActivity) {
                Hilt_HelpAndSupportActivity hilt_HelpAndSupportActivity = Hilt_HelpAndSupportActivity.this;
                if (hilt_HelpAndSupportActivity.v) {
                    return;
                }
                hilt_HelpAndSupportActivity.v = true;
                HelpAndSupportActivity_GeneratedInjector helpAndSupportActivity_GeneratedInjector = (HelpAndSupportActivity_GeneratedInjector) hilt_HelpAndSupportActivity.t3();
                helpAndSupportActivity_GeneratedInjector.getClass();
            }
        });
    }

    public final ActivityComponentManager M4() {
        if (this.t == null) {
            synchronized (this.u) {
                try {
                    if (this.t == null) {
                        this.t = new ActivityComponentManager(this);
                    }
                } finally {
                }
            }
        }
        return this.t;
    }

    @Override // androidx.activity.ComponentActivity, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return DefaultViewModelFactories.a(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getApplication() instanceof GeneratedComponentManager) {
            SavedStateHandleHolder savedStateHandleHolderB = M4().b();
            this.s = savedStateHandleHolderB;
            if (savedStateHandleHolderB.a()) {
                this.s.f23774a = getDefaultViewModelCreationExtras();
            }
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        SavedStateHandleHolder savedStateHandleHolder = this.s;
        if (savedStateHandleHolder != null) {
            savedStateHandleHolder.f23774a = null;
        }
    }

    @Override // dagger.hilt.internal.GeneratedComponentManager
    public final Object t3() {
        return M4().t3();
    }
}
