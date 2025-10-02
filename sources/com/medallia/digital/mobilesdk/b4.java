package com.medallia.digital.mobilesdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.medallia.digital.mobilesdk.Broadcasts;
import org.json.JSONException;

/* loaded from: classes.dex */
class b4 extends d0 {

    /* renamed from: a, reason: collision with root package name */
    private MDCustomInterceptListener f16383a;
    private final BroadcastReceiver b = new a();

    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || !b4.this.a().equals(intent.getAction())) {
                return;
            }
            try {
                Broadcasts.b.a aVar = (Broadcasts.b.a) intent.getSerializableExtra("com.medallia.digital.mobilesdk.extra_custom_intercept_command");
                long longExtra = intent.getLongExtra("com.medallia.digital.mobilesdk.extra_form_preload_timestamp", 0L);
                long longExtra2 = intent.getLongExtra("com.medallia.digital.mobilesdk.extra_target_evaluation_timestamp", 0L);
                String stringExtra = intent.getStringExtra("com.medallia.digital.mobilesdk.extra_engagement_id");
                MDEngagementType mDEngagementType = (MDEngagementType) intent.getSerializableExtra("com.medallia.digital.mobilesdk.extra_engagement_type");
                MDCustomInterceptPayload mDCustomInterceptPayload = (MDCustomInterceptPayload) intent.getSerializableExtra("com.medallia.digital.mobilesdk.extra_payload");
                if (b4.this.b != null && Broadcasts.b.a.TargetEvaluationSuccess == aVar) {
                    b4.this.f16383a.onTargetEvaluationSuccess(new MDCustomInterceptListenerData(longExtra, longExtra2, stringExtra, mDEngagementType, mDCustomInterceptPayload));
                    a4.e("MDCustomInterceptListener - onTargetEvaluationSuccess was fired");
                }
                b4.this.a(stringExtra, mDEngagementType);
            } catch (Exception e) {
                a4.c(e.getMessage());
            }
        }
    }

    /* loaded from: classes6.dex */
    public class b extends v4 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f16385a;
        final /* synthetic */ MDEngagementType b;

        public b(String str, MDEngagementType mDEngagementType) {
            this.f16385a = str;
            this.b = mDEngagementType;
        }

        @Override // com.medallia.digital.mobilesdk.v4
        public void a() throws JSONException {
            if (b4.this.f16383a != null) {
                AnalyticsBridge.getInstance().reportSetCustomInterceptCallbackEvent(this.f16385a, this.b.toString());
            }
        }
    }

    @Override // com.medallia.digital.mobilesdk.d0
    public BroadcastReceiver c() {
        return this.b;
    }

    @Override // com.medallia.digital.mobilesdk.d0
    public String a() {
        return "com.medallia.digital.mobilesdk.custom_intercept_action";
    }

    @Override // com.medallia.digital.mobilesdk.d0
    public Object b() {
        return this.f16383a;
    }

    @Override // com.medallia.digital.mobilesdk.d0
    public void a(Object obj) {
        if (this.f16383a != null && obj == null) {
            e();
            this.f16383a = null;
        }
        if (obj instanceof MDCustomInterceptListener) {
            this.f16383a = (MDCustomInterceptListener) obj;
        }
        d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, MDEngagementType mDEngagementType) {
        w7.b().a().execute(new b(str, mDEngagementType));
    }
}
