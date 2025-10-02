package au.com.woolworths.feature.shop.myorders.details.location;

import androidx.lifecycle.LifecycleService;
import dagger.hilt.android.internal.managers.ServiceComponentManager;
import dagger.hilt.internal.GeneratedComponentManagerHolder;

/* loaded from: classes3.dex */
public abstract class Hilt_PickupOrderLocationTrackingService extends LifecycleService implements GeneratedComponentManagerHolder {
    public volatile ServiceComponentManager e;
    public final Object f = new Object();
    public boolean g = false;

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public final void onCreate() {
        if (!this.g) {
            this.g = true;
            ((PickupOrderLocationTrackingService_GeneratedInjector) t3()).a((PickupOrderLocationTrackingService) this);
        }
        super.onCreate();
    }

    @Override // dagger.hilt.internal.GeneratedComponentManager
    public final Object t3() {
        if (this.e == null) {
            synchronized (this.f) {
                try {
                    if (this.e == null) {
                        this.e = new ServiceComponentManager(this);
                    }
                } finally {
                }
            }
        }
        return this.e.t3();
    }
}
