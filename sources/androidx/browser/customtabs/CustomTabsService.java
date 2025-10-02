package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.customtabs.ICustomTabsCallback;
import android.support.customtabs.ICustomTabsService;
import android.support.customtabs.IEngagementSignalsCallback;
import androidx.annotation.RestrictTo;
import androidx.browser.customtabs.CustomTabsService;
import androidx.collection.SimpleArrayMap;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public abstract class CustomTabsService extends Service {
    public final SimpleArrayMap d = new SimpleArrayMap(0);
    public final ICustomTabsService.Stub e = new AnonymousClass1();

    /* renamed from: androidx.browser.customtabs.CustomTabsService$1, reason: invalid class name */
    public class AnonymousClass1 extends ICustomTabsService.Stub {
        public AnonymousClass1() {
            attachInterface(this, ICustomTabsService.U2);
        }

        public static PendingIntent i1(Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("android.support.customtabs.extra.SESSION_ID");
            bundle.remove("android.support.customtabs.extra.SESSION_ID");
            return pendingIntent;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public final boolean D(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) {
            new CustomTabsSessionToken(iCustomTabsCallback, i1(bundle));
            return CustomTabsService.this.g();
        }

        @Override // android.support.customtabs.ICustomTabsService
        public final boolean L(long j) {
            return CustomTabsService.this.i();
        }

        @Override // android.support.customtabs.ICustomTabsService
        public final int P(ICustomTabsCallback iCustomTabsCallback, String str, Bundle bundle) {
            new CustomTabsSessionToken(iCustomTabsCallback, i1(bundle));
            return CustomTabsService.this.d();
        }

        @Override // android.support.customtabs.ICustomTabsService
        public final boolean S(ICustomTabsCallback iCustomTabsCallback) {
            return j1(iCustomTabsCallback, null);
        }

        @Override // android.support.customtabs.ICustomTabsService
        public final boolean U(ICustomTabsCallback iCustomTabsCallback, Uri uri, Bundle bundle, ArrayList arrayList) {
            new CustomTabsSessionToken(iCustomTabsCallback, i1(bundle));
            return CustomTabsService.this.b();
        }

        @Override // android.support.customtabs.ICustomTabsService
        public final boolean Z0(ICustomTabsCallback iCustomTabsCallback, Uri uri) {
            new CustomTabsSessionToken(iCustomTabsCallback, null);
            new Bundle();
            return CustomTabsService.this.f();
        }

        @Override // android.support.customtabs.ICustomTabsService
        public final void f1(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) {
            new CustomTabsSessionToken(iCustomTabsCallback, i1(bundle));
        }

        @Override // android.support.customtabs.ICustomTabsService
        public final boolean g0(int i, Uri uri, Bundle bundle, ICustomTabsCallback iCustomTabsCallback) {
            new CustomTabsSessionToken(iCustomTabsCallback, i1(bundle));
            return CustomTabsService.this.h();
        }

        public final boolean j1(ICustomTabsCallback iCustomTabsCallback, PendingIntent pendingIntent) {
            final CustomTabsSessionToken customTabsSessionToken = new CustomTabsSessionToken(iCustomTabsCallback, pendingIntent);
            try {
                IBinder.DeathRecipient deathRecipient = new IBinder.DeathRecipient() { // from class: androidx.browser.customtabs.a
                    @Override // android.os.IBinder.DeathRecipient
                    public final void binderDied() {
                        CustomTabsService.AnonymousClass1 anonymousClass1 = this.f212a;
                        CustomTabsSessionToken customTabsSessionToken2 = customTabsSessionToken;
                        CustomTabsService customTabsService = CustomTabsService.this;
                        customTabsService.getClass();
                        try {
                            synchronized (customTabsService.d) {
                                try {
                                    ICustomTabsCallback iCustomTabsCallback2 = customTabsSessionToken2.f211a;
                                    IBinder iBinderAsBinder = iCustomTabsCallback2 == null ? null : iCustomTabsCallback2.asBinder();
                                    if (iBinderAsBinder == null) {
                                        return;
                                    }
                                    iBinderAsBinder.unlinkToDeath((IBinder.DeathRecipient) customTabsService.d.get(iBinderAsBinder), 0);
                                    customTabsService.d.remove(iBinderAsBinder);
                                } finally {
                                }
                            }
                        } catch (NoSuchElementException unused) {
                        }
                    }
                };
                synchronized (CustomTabsService.this.d) {
                    iCustomTabsCallback.asBinder().linkToDeath(deathRecipient, 0);
                    CustomTabsService.this.d.put(iCustomTabsCallback.asBinder(), deathRecipient);
                }
                return CustomTabsService.this.c();
            } catch (RemoteException unused) {
                return false;
            }
        }

        @Override // android.support.customtabs.ICustomTabsService
        public final boolean k(int i, Uri uri, Bundle bundle, ICustomTabsCallback iCustomTabsCallback) {
            new CustomTabsSessionToken(iCustomTabsCallback, i1(bundle));
            return CustomTabsService.this.e();
        }

        @Override // android.support.customtabs.ICustomTabsService
        public final Bundle l(Bundle bundle, String str) {
            return CustomTabsService.this.a();
        }

        @Override // android.support.customtabs.ICustomTabsService
        public final void n(ICustomTabsCallback iCustomTabsCallback, IBinder iBinder, Bundle bundle) {
            IEngagementSignalsCallback.Stub.h1(iBinder);
            new CustomTabsSessionToken(iCustomTabsCallback, i1(bundle));
        }

        @Override // android.support.customtabs.ICustomTabsService
        public final boolean t0(ICustomTabsCallback iCustomTabsCallback, Uri uri, Bundle bundle) {
            new CustomTabsSessionToken(iCustomTabsCallback, i1(bundle));
            if (bundle != null) {
                if (Build.VERSION.SDK_INT >= 33) {
                }
            }
            return CustomTabsService.this.f();
        }

        @Override // android.support.customtabs.ICustomTabsService
        public final boolean u0(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) {
            return j1(iCustomTabsCallback, i1(bundle));
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface FilePurpose {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Relation {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Result {
    }

    public abstract Bundle a();

    public abstract boolean b();

    public abstract boolean c();

    public abstract int d();

    public abstract boolean e();

    public abstract boolean f();

    public abstract boolean g();

    public abstract boolean h();

    public abstract boolean i();

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.e;
    }
}
