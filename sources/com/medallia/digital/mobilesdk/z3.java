package com.medallia.digital.mobilesdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
class z3 extends d0 {

    /* renamed from: a, reason: collision with root package name */
    private MDCallback f16790a;
    private final BroadcastReceiver b = new a();

    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || !"com.medallia.digital.mobilesdk.localization_action".equals(intent.getAction()) || z3.this.f16790a == null) {
                return;
            }
            MDExternalError mDExternalError = (MDExternalError) intent.getSerializableExtra("com.medallia.digital.mobilesdk.extra_error");
            String stringExtra = intent.getStringExtra("com.medallia.digital.mobilesdk.extra_success");
            if (mDExternalError != null) {
                z3.this.f16790a.onError(mDExternalError);
            } else {
                z3.this.f16790a.onSuccess(stringExtra);
            }
        }
    }

    @Override // com.medallia.digital.mobilesdk.d0
    public Object b() {
        return this.f16790a;
    }

    @Override // com.medallia.digital.mobilesdk.d0
    public BroadcastReceiver c() {
        return this.b;
    }

    @Override // com.medallia.digital.mobilesdk.d0
    public String a() {
        return "com.medallia.digital.mobilesdk.localization_action";
    }

    @Override // com.medallia.digital.mobilesdk.d0
    public void a(Object obj) {
        if (this.f16790a != null && obj == null) {
            e();
            this.f16790a = null;
        }
        if (obj instanceof MDCallback) {
            this.f16790a = (MDCallback) obj;
        }
    }
}
