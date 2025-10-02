package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.customtabs.ICustomTabsCallback;
import android.support.customtabs.ICustomTabsService;
import android.support.customtabs.IEngagementSignalsCallback;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class CustomTabsSession {

    /* renamed from: a, reason: collision with root package name */
    public final Object f210a = new Object();
    public final ICustomTabsService b;
    public final ICustomTabsCallback c;
    public final ComponentName d;
    public final PendingIntent e;

    /* renamed from: androidx.browser.customtabs.CustomTabsSession$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    class AnonymousClass1 extends IEngagementSignalsCallback.Stub {
        @Override // android.support.customtabs.IEngagementSignalsCallback
        public final void E() {
            throw null;
        }

        @Override // android.support.customtabs.IEngagementSignalsCallback
        public final void H0() {
            throw null;
        }

        @Override // android.support.customtabs.IEngagementSignalsCallback
        public final void Z() {
            throw null;
        }
    }

    /* renamed from: androidx.browser.customtabs.CustomTabsSession$2, reason: invalid class name */
    /* loaded from: classes2.dex */
    class AnonymousClass2 extends IEngagementSignalsCallback.Stub {
        @Override // android.support.customtabs.IEngagementSignalsCallback
        public final void E() {
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                throw null;
            } catch (Throwable th) {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
                throw th;
            }
        }

        @Override // android.support.customtabs.IEngagementSignalsCallback
        public final void H0() {
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                throw null;
            } catch (Throwable th) {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
                throw th;
            }
        }

        @Override // android.support.customtabs.IEngagementSignalsCallback
        public final void Z() {
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                throw null;
            } catch (Throwable th) {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
                throw th;
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class MockSession extends ICustomTabsService.Stub {
        @Override // android.support.customtabs.ICustomTabsService
        public final boolean D(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public final boolean L(long j) {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public final int P(ICustomTabsCallback iCustomTabsCallback, String str, Bundle bundle) {
            return 0;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public final boolean S(ICustomTabsCallback iCustomTabsCallback) {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public final boolean U(ICustomTabsCallback iCustomTabsCallback, Uri uri, Bundle bundle, ArrayList arrayList) {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public final boolean Z0(ICustomTabsCallback iCustomTabsCallback, Uri uri) {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public final void f1(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) {
        }

        @Override // android.support.customtabs.ICustomTabsService
        public final boolean g0(int i, Uri uri, Bundle bundle, ICustomTabsCallback iCustomTabsCallback) {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public final boolean k(int i, Uri uri, Bundle bundle, ICustomTabsCallback iCustomTabsCallback) {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public final Bundle l(Bundle bundle, String str) {
            return null;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public final void n(ICustomTabsCallback iCustomTabsCallback, IBinder iBinder, Bundle bundle) {
        }

        @Override // android.support.customtabs.ICustomTabsService
        public final boolean t0(ICustomTabsCallback iCustomTabsCallback, Uri uri, Bundle bundle) {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public final boolean u0(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) {
            return false;
        }
    }

    @RestrictTo
    /* loaded from: classes2.dex */
    public static class PendingSession {
    }

    public CustomTabsSession(ICustomTabsService iCustomTabsService, ICustomTabsCallback iCustomTabsCallback, ComponentName componentName, PendingIntent pendingIntent) {
        this.b = iCustomTabsService;
        this.c = iCustomTabsCallback;
        this.d = componentName;
        this.e = pendingIntent;
    }

    public final void a(String str) {
        Bundle bundle = new Bundle();
        PendingIntent pendingIntent = this.e;
        if (pendingIntent != null) {
            bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
        }
        synchronized (this.f210a) {
            try {
                try {
                    this.b.P(this.c, str, bundle);
                } catch (RemoteException unused) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
