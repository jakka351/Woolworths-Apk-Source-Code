package com.medallia.digital.mobilesdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.medallia.digital.mobilesdk.Broadcasts;
import org.json.JSONException;

/* loaded from: classes.dex */
class e4 extends d0 {

    /* renamed from: a, reason: collision with root package name */
    private MDInterceptListener f16443a;
    private final BroadcastReceiver b = new a();

    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || !e4.this.a().equals(intent.getAction())) {
                return;
            }
            try {
                String stringExtra = intent.getStringExtra("com.medallia.digital.mobilesdk.extra_id");
                long longExtra = intent.getLongExtra("com.medallia.digital.mobilesdk.extra_timestamp", 0L);
                e3 e3Var = (e3) intent.getSerializableExtra("com.medallia.digital.mobilesdk.extra_reason");
                String stringExtra2 = intent.getStringExtra("com.medallia.digital.mobilesdk.extra_invite_type");
                MDEngagementType mDEngagementType = (MDEngagementType) intent.getSerializableExtra("com.medallia.digital.mobilesdk.extra_engagement_type");
                MDAppearanceMode mDAppearanceMode = (MDAppearanceMode) intent.getSerializableExtra("com.medallia.digital.mobilesdk.extra_intercept_appearance_set");
                MDAppearanceMode mDAppearanceMode2 = (MDAppearanceMode) intent.getSerializableExtra("com.medallia.digital.mobilesdk.extra_intercept_appearance_display");
                Broadcasts.e.a aVar = (Broadcasts.e.a) intent.getSerializableExtra("com.medallia.digital.mobilesdk.extra_intercept_command");
                if (e4.this.f16443a != null) {
                    if (Broadcasts.e.a.interceptAccepted == aVar) {
                        e4.this.f16443a.onInterceptAccepted(new MDInterceptListenerData(longExtra, stringExtra, mDEngagementType));
                    } else if (Broadcasts.e.a.interceptDeclined == aVar) {
                        e4.this.f16443a.onInterceptDeclined(new MDInterceptListenerData(longExtra, stringExtra, mDEngagementType));
                    } else if (Broadcasts.e.a.interceptDeferred == aVar) {
                        MDInterceptListener mDInterceptListener = e4.this.f16443a;
                        MDInterceptListenerData mDInterceptListenerData = new MDInterceptListenerData(longExtra, stringExtra, e3Var != null ? e3Var.a() : null, mDEngagementType);
                        mDEngagementType = mDEngagementType;
                        mDInterceptListener.onInterceptDeferred(mDInterceptListenerData);
                    } else if (Broadcasts.e.a.interceptDisplayed == aVar) {
                        e4.this.f16443a.onInterceptDisplayed(new MDInterceptListenerData(longExtra, stringExtra, mDEngagementType, mDAppearanceMode, mDAppearanceMode2));
                    } else if (Broadcasts.e.a.interceptClosed == aVar) {
                        e4.this.f16443a.onInterceptClosed(new MDInterceptListenerData(longExtra, stringExtra, mDEngagementType));
                    } else if (Broadcasts.e.a.interceptTriggered == aVar) {
                        e4.this.f16443a.onInterceptTriggerInAppReview(new MDInterceptListenerData(longExtra, stringExtra));
                    }
                }
                e4.this.a(aVar, stringExtra, stringExtra2, mDEngagementType, e3Var);
            } catch (Exception e) {
                a4.c(e.getMessage());
            }
        }
    }

    /* loaded from: classes6.dex */
    public class b extends v4 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Broadcasts.e.a f16445a;
        final /* synthetic */ String b;
        final /* synthetic */ String c;
        final /* synthetic */ MDEngagementType d;
        final /* synthetic */ e3 e;

        public b(Broadcasts.e.a aVar, String str, String str2, MDEngagementType mDEngagementType, e3 e3Var) {
            this.f16445a = aVar;
            this.b = str;
            this.c = str2;
            this.d = mDEngagementType;
            this.e = e3Var;
        }

        @Override // com.medallia.digital.mobilesdk.v4
        public void a() throws JSONException {
            if (e4.this.f16443a != null) {
                AnalyticsBridge analyticsBridge = AnalyticsBridge.getInstance();
                String strName = this.f16445a.name();
                String str = this.b;
                String str2 = this.c;
                MDEngagementType mDEngagementType = this.d;
                analyticsBridge.reportSetInterceptCallbackEvent(strName, str, str2, mDEngagementType != null ? mDEngagementType.toString() : null, this.e);
            }
        }
    }

    @Override // com.medallia.digital.mobilesdk.d0
    public Object b() {
        return this.f16443a;
    }

    @Override // com.medallia.digital.mobilesdk.d0
    public BroadcastReceiver c() {
        return this.b;
    }

    @Override // com.medallia.digital.mobilesdk.d0
    public String a() {
        return "com.medallia.digital.mobilesdk.intercept_action";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Broadcasts.e.a aVar, String str, String str2, MDEngagementType mDEngagementType, e3 e3Var) {
        w7.b().a().execute(new b(aVar, str, str2, mDEngagementType, e3Var));
    }

    @Override // com.medallia.digital.mobilesdk.d0
    public void a(Object obj) {
        if (this.f16443a != null && obj == null) {
            e();
            this.f16443a = null;
        }
        if (obj instanceof MDInterceptListener) {
            this.f16443a = (MDInterceptListener) obj;
        }
        d();
    }
}
