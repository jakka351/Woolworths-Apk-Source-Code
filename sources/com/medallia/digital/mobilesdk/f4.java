package com.medallia.digital.mobilesdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.medallia.digital.mobilesdk.Broadcasts;
import org.json.JSONException;

/* loaded from: classes.dex */
class f4 extends d0 {

    /* renamed from: a, reason: collision with root package name */
    private MDTouchListener f16476a;
    private final BroadcastReceiver b = new a();

    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || !f4.this.a().equals(intent.getAction())) {
                return;
            }
            try {
                Broadcasts.j.a aVar = (Broadcasts.j.a) intent.getSerializableExtra("com.medallia.digital.mobilesdk.extra_touch_event_command");
                int intExtra = intent.getIntExtra("com.medallia.digital.mobilesdk.extra_motion_event_action", 0);
                if (f4.this.f16476a != null && Broadcasts.j.a.TouchEvent == aVar) {
                    f4.this.f16476a.onMDTouchEvent(new MDTouchListenerData(intExtra));
                    a4.e("MDTouchListener - onMDTouchEvent was fired");
                }
                f4.this.a(intExtra);
            } catch (Exception e) {
                a4.c(e.getMessage());
            }
        }
    }

    /* loaded from: classes6.dex */
    public class b extends v4 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f16478a;

        public b(int i) {
            this.f16478a = i;
        }

        @Override // com.medallia.digital.mobilesdk.v4
        public void a() throws JSONException {
            if (f4.this.f16476a != null) {
                a4.e("reportTouchEventCallbackEvent");
                AnalyticsBridge.getInstance().reportTouchEventCallbackEvent(this.f16478a);
            }
        }
    }

    @Override // com.medallia.digital.mobilesdk.d0
    public Object b() {
        return this.f16476a;
    }

    @Override // com.medallia.digital.mobilesdk.d0
    public BroadcastReceiver c() {
        return this.b;
    }

    @Override // com.medallia.digital.mobilesdk.d0
    public String a() {
        return "com.medallia.digital.mobilesdk.touch_event_action";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        w7.b().a().execute(new b(i));
    }

    @Override // com.medallia.digital.mobilesdk.d0
    public void a(Object obj) {
        if (this.f16476a != null && obj == null) {
            e();
            this.f16476a = null;
        }
        if (obj instanceof MDTouchListener) {
            this.f16476a = (MDTouchListener) obj;
        }
        d();
    }
}
