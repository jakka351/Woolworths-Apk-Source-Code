package au.com.woolworths.android.onesite.app.notification;

import com.google.firebase.messaging.FirebaseMessagingService;
import dagger.hilt.android.internal.managers.ServiceComponentManager;
import dagger.hilt.internal.GeneratedComponentManagerHolder;

/* loaded from: classes3.dex */
public abstract class Hilt_WOWFirebaseMessagingService extends FirebaseMessagingService implements GeneratedComponentManagerHolder {
    public volatile ServiceComponentManager e;
    public final Object f = new Object();
    public boolean g = false;

    @Override // android.app.Service
    public final void onCreate() {
        if (!this.g) {
            this.g = true;
            ((WOWFirebaseMessagingService_GeneratedInjector) t3()).b((WOWFirebaseMessagingService) this);
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
