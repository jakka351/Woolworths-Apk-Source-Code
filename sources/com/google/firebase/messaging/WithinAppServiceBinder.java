package com.google.firebase.messaging;

import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.google.firebase.messaging.EnhancedIntentService;
import com.google.firebase.messaging.WithinAppServiceConnection;

/* loaded from: classes6.dex */
class WithinAppServiceBinder extends Binder {
    public static final /* synthetic */ int e = 0;
    public final EnhancedIntentService.AnonymousClass1 d;

    public interface IntentHandler {
    }

    public WithinAppServiceBinder(EnhancedIntentService.AnonymousClass1 anonymousClass1) {
        this.d = anonymousClass1;
    }

    public final void a(WithinAppServiceConnection.BindRequest bindRequest) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "service received new intent via bind strategy");
        }
        EnhancedIntentService.this.b(bindRequest.f15659a).addOnCompleteListener(new androidx.arch.core.executor.a(2), new i(bindRequest, 2));
    }
}
