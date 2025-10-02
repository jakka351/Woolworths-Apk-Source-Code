package androidx.os.internal;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import au.com.woolworths.analytics.supers.login.LoginAnalytics;
import au.com.woolworths.feature.shop.login.LoginViewModel;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements LifecycleEventObserver {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ a(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void T(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        switch (this.d) {
            case 0:
                SavedStateRegistryImpl savedStateRegistryImpl = (SavedStateRegistryImpl) this.e;
                if (event != Lifecycle.Event.ON_START) {
                    if (event == Lifecycle.Event.ON_STOP) {
                        savedStateRegistryImpl.h = false;
                        break;
                    }
                } else {
                    savedStateRegistryImpl.h = true;
                    break;
                }
                break;
            default:
                LoginViewModel loginViewModel = (LoginViewModel) this.e;
                if (event == Lifecycle.Event.ON_START) {
                    loginViewModel.i.f(LoginAnalytics.LoginWebview.d);
                    break;
                }
                break;
        }
    }
}
