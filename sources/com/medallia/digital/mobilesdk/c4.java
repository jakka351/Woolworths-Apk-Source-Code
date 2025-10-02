package com.medallia.digital.mobilesdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.medallia.digital.mobilesdk.Broadcasts;

/* loaded from: classes.dex */
class c4 extends d0 {

    /* renamed from: a, reason: collision with root package name */
    private MDFeedbackListener f16395a;
    private final BroadcastReceiver b = new a();

    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || !"com.medallia.digital.mobilesdk.feedback_action".equals(intent.getAction())) {
                return;
            }
            try {
                long longExtra = intent.getLongExtra("com.medallia.digital.mobilesdk.extra_timestamp", 0L);
                String stringExtra = intent.getStringExtra("com.medallia.digital.mobilesdk.extra_form_id");
                FormTriggerType formTriggerType = (FormTriggerType) intent.getSerializableExtra("com.medallia.digital.mobilesdk.extra_form_trigger_type");
                Broadcasts.d.a aVar = (Broadcasts.d.a) intent.getSerializableExtra("com.medallia.digital.mobilesdk.extra_option");
                String stringExtra2 = intent.getStringExtra("com.medallia.digital.mobilesdk.extra_feedback_payload");
                String stringExtra3 = intent.getStringExtra("com.medallia.digital.mobilesdk.extra_feedback_id");
                if (aVar == Broadcasts.d.a.feedbackPayload && c4.this.f16395a != null) {
                    c4.this.f16395a.onFeedbackSubmitted(new MDFeedbackListenerData(stringExtra3, longExtra, stringExtra2, stringExtra));
                }
                if (c4.this.f16395a != null) {
                    AnalyticsBridge.getInstance().reportSetFeedbackCallbackEvent(aVar != null ? aVar.name() : null, stringExtra, formTriggerType, stringExtra3);
                }
            } catch (Exception e) {
                a4.c(e.getMessage());
            }
        }
    }

    @Override // com.medallia.digital.mobilesdk.d0
    public Object b() {
        return this.f16395a;
    }

    @Override // com.medallia.digital.mobilesdk.d0
    public BroadcastReceiver c() {
        return this.b;
    }

    @Override // com.medallia.digital.mobilesdk.d0
    public String a() {
        return "com.medallia.digital.mobilesdk.feedback_action";
    }

    @Override // com.medallia.digital.mobilesdk.d0
    public void a(Object obj) {
        if (this.f16395a != null && obj == null) {
            e();
            this.f16395a = null;
        }
        if (obj instanceof MDFeedbackListener) {
            this.f16395a = (MDFeedbackListener) obj;
        }
    }
}
