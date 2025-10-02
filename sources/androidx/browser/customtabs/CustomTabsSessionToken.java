package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.support.customtabs.ICustomTabsCallback;

/* loaded from: classes2.dex */
public class CustomTabsSessionToken {

    /* renamed from: a, reason: collision with root package name */
    public final ICustomTabsCallback f211a;
    public final PendingIntent b;

    /* renamed from: androidx.browser.customtabs.CustomTabsSessionToken$1, reason: invalid class name */
    class AnonymousClass1 extends CustomTabsCallback {
        @Override // androidx.browser.customtabs.CustomTabsCallback
        public final void extraCallback(String str, Bundle bundle) {
            throw null;
        }

        @Override // androidx.browser.customtabs.CustomTabsCallback
        public final Bundle extraCallbackWithResult(String str, Bundle bundle) {
            throw null;
        }

        @Override // androidx.browser.customtabs.CustomTabsCallback
        public final void onActivityLayout(int i, int i2, int i3, int i4, int i5, Bundle bundle) {
            throw null;
        }

        @Override // androidx.browser.customtabs.CustomTabsCallback
        public final void onActivityResized(int i, int i2, Bundle bundle) {
            throw null;
        }

        @Override // androidx.browser.customtabs.CustomTabsCallback
        public final void onMessageChannelReady(Bundle bundle) {
            throw null;
        }

        @Override // androidx.browser.customtabs.CustomTabsCallback
        public final void onMinimized(Bundle bundle) {
            throw null;
        }

        @Override // androidx.browser.customtabs.CustomTabsCallback
        public final void onNavigationEvent(int i, Bundle bundle) {
            throw null;
        }

        @Override // androidx.browser.customtabs.CustomTabsCallback
        public final void onPostMessage(String str, Bundle bundle) {
            throw null;
        }

        @Override // androidx.browser.customtabs.CustomTabsCallback
        public final void onRelationshipValidationResult(int i, Uri uri, boolean z, Bundle bundle) {
            throw null;
        }

        @Override // androidx.browser.customtabs.CustomTabsCallback
        public final void onUnminimized(Bundle bundle) {
            throw null;
        }

        @Override // androidx.browser.customtabs.CustomTabsCallback
        public final void onWarmupCompleted(Bundle bundle) {
            throw null;
        }
    }

    public static class MockCallback extends ICustomTabsCallback.Stub {
        @Override // android.support.customtabs.ICustomTabsCallback
        public final void O(int i, int i2, Bundle bundle) {
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public final void Q0(Bundle bundle) {
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public final void S0(Bundle bundle) {
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public final void V(int i, Bundle bundle) {
        }

        @Override // android.support.customtabs.ICustomTabsCallback.Stub, android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public final void b1(String str, Bundle bundle) {
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public final void c1(Bundle bundle) {
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public final void e(int i, int i2, int i3, int i4, int i5, Bundle bundle) {
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public final void e1(int i, Uri uri, boolean z, Bundle bundle) {
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public final Bundle g(String str, Bundle bundle) {
            return null;
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public final void v0(String str, Bundle bundle) {
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public final void y0(Bundle bundle) {
        }
    }

    public CustomTabsSessionToken(ICustomTabsCallback iCustomTabsCallback, PendingIntent pendingIntent) {
        if (iCustomTabsCallback == null && pendingIntent == null) {
            throw new IllegalStateException("CustomTabsSessionToken must have either a session id or a callback (or both).");
        }
        this.f211a = iCustomTabsCallback;
        this.b = pendingIntent;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof CustomTabsSessionToken) {
            CustomTabsSessionToken customTabsSessionToken = (CustomTabsSessionToken) obj;
            PendingIntent pendingIntent = customTabsSessionToken.b;
            PendingIntent pendingIntent2 = this.b;
            if ((pendingIntent2 == null) == (pendingIntent == null)) {
                if (pendingIntent2 != null) {
                    return pendingIntent2.equals(pendingIntent);
                }
                ICustomTabsCallback iCustomTabsCallback = this.f211a;
                if (iCustomTabsCallback == null) {
                    throw new IllegalStateException("CustomTabSessionToken must have valid binder or pending session");
                }
                IBinder iBinderAsBinder = iCustomTabsCallback.asBinder();
                ICustomTabsCallback iCustomTabsCallback2 = customTabsSessionToken.f211a;
                if (iCustomTabsCallback2 != null) {
                    return iBinderAsBinder.equals(iCustomTabsCallback2.asBinder());
                }
                throw new IllegalStateException("CustomTabSessionToken must have valid binder or pending session");
            }
        }
        return false;
    }

    public final int hashCode() {
        PendingIntent pendingIntent = this.b;
        if (pendingIntent != null) {
            return pendingIntent.hashCode();
        }
        ICustomTabsCallback iCustomTabsCallback = this.f211a;
        if (iCustomTabsCallback != null) {
            return iCustomTabsCallback.asBinder().hashCode();
        }
        throw new IllegalStateException("CustomTabSessionToken must have valid binder or pending session");
    }
}
