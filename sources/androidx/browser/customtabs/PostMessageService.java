package androidx.browser.customtabs;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.support.customtabs.ICustomTabsCallback;
import android.support.customtabs.IPostMessageService;

/* loaded from: classes2.dex */
public class PostMessageService extends Service {
    public final IPostMessageService.Stub d;

    /* renamed from: androidx.browser.customtabs.PostMessageService$1, reason: invalid class name */
    public class AnonymousClass1 extends IPostMessageService.Stub {
        @Override // android.support.customtabs.IPostMessageService
        public final void T0(ICustomTabsCallback iCustomTabsCallback, String str, Bundle bundle) {
            iCustomTabsCallback.b1(str, bundle);
        }

        @Override // android.support.customtabs.IPostMessageService
        public final void h(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) {
            iCustomTabsCallback.c1(bundle);
        }
    }

    public PostMessageService() {
        AnonymousClass1 anonymousClass1 = new AnonymousClass1();
        anonymousClass1.attachInterface(anonymousClass1, IPostMessageService.X2);
        this.d = anonymousClass1;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.d;
    }
}
