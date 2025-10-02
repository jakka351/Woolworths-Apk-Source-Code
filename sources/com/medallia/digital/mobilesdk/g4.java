package com.medallia.digital.mobilesdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
class g4 extends d0 {

    /* renamed from: a, reason: collision with root package name */
    private u8 f16497a;
    private final BroadcastReceiver b = new a();

    public class a extends BroadcastReceiver {

        /* renamed from: com.medallia.digital.mobilesdk.g4$a$a, reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        public class C0335a extends v4 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Intent f16499a;

            public C0335a(Intent intent) {
                this.f16499a = intent;
            }

            @Override // com.medallia.digital.mobilesdk.v4
            public void a() {
                Intent intent = this.f16499a;
                if (intent == null || !"com.medallia.digital.mobilesdk.sync_userjourney_action".equals(intent.getAction()) || g4.this.f16497a == null) {
                    return;
                }
                g4.this.f16497a.a(this.f16499a.getStringExtra("com.medallia.digital.mobilesdk.extra_trigger"));
            }
        }

        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            w7.b().a().execute(new C0335a(intent));
        }
    }

    @Override // com.medallia.digital.mobilesdk.d0
    public Object b() {
        return this.f16497a;
    }

    @Override // com.medallia.digital.mobilesdk.d0
    public BroadcastReceiver c() {
        return this.b;
    }

    @Override // com.medallia.digital.mobilesdk.d0
    public String a() {
        return "com.medallia.digital.mobilesdk.sync_userjourney_action";
    }

    @Override // com.medallia.digital.mobilesdk.d0
    public void a(Object obj) {
        if (this.f16497a != null && obj == null) {
            e();
            this.f16497a = null;
        }
        if (obj instanceof u8) {
            this.f16497a = (u8) obj;
        }
        d();
    }
}
