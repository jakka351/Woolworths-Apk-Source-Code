package com.medallia.digital.mobilesdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.medallia.digital.mobilesdk.Broadcasts;
import org.json.JSONException;

/* loaded from: classes.dex */
class d4 extends d0 {

    /* renamed from: a, reason: collision with root package name */
    private MDFormListener f16424a;
    private final BroadcastReceiver b = new a();

    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String str;
            MDFormListener mDFormListener;
            MDFormListenerData mDFormListenerData;
            if (intent == null || !"com.medallia.digital.mobilesdk.form_action".equals(intent.getAction())) {
                return;
            }
            try {
                long longExtra = intent.getLongExtra("com.medallia.digital.mobilesdk.extra_timestamp", 0L);
                String stringExtra = intent.getStringExtra("com.medallia.digital.mobilesdk.extra_form_id");
                FormViewType formViewType = (FormViewType) intent.getSerializableExtra("com.medallia.digital.mobilesdk.extra_form_view_type");
                if (formViewType == null) {
                    formViewType = FormViewType.none;
                }
                FormTriggerType formTriggerType = (FormTriggerType) intent.getSerializableExtra("com.medallia.digital.mobilesdk.extra_form_trigger_type");
                long longExtra2 = intent.getLongExtra("com.medallia.digital.mobilesdk.extra_form_time_to_display", 0L);
                Broadcasts.d.a aVar = (Broadcasts.d.a) intent.getSerializableExtra("com.medallia.digital.mobilesdk.extra_option");
                String stringExtra2 = intent.getStringExtra("com.medallia.digital.mobilesdk.extra_form_url");
                String stringExtra3 = intent.getStringExtra("com.medallia.digital.mobilesdk.extra_form_locale_set");
                String stringExtra4 = intent.getStringExtra("com.medallia.digital.mobilesdk.extra_form_locale_display");
                boolean booleanExtra = intent.getBooleanExtra("com.medallia.digital.mobilesdk.extra_thank_you_prompt_button_display", false);
                boolean booleanExtra2 = intent.getBooleanExtra("com.medallia.digital.mobilesdk.extra_thank_you_prompt_image_display", false);
                MDAppearanceMode mDAppearanceMode = (MDAppearanceMode) intent.getSerializableExtra("com.medallia.digital.mobilesdk.extra_form_header_appearance_set");
                MDAppearanceMode mDAppearanceMode2 = (MDAppearanceMode) intent.getSerializableExtra("com.medallia.digital.mobilesdk.extra_form_header_appearance_display");
                if (d4.this.f16424a == null) {
                    str = stringExtra3;
                } else {
                    if (aVar == Broadcasts.d.a.codeFormReady) {
                        d4.this.f16424a.onCodeFormReady(new MDFormListenerData(longExtra, stringExtra, formTriggerType));
                    } else if (aVar == Broadcasts.d.a.formSubmitted) {
                        d4.this.f16424a.onFormSubmitted(new MDFormListenerData(longExtra, stringExtra, formTriggerType));
                    } else if (aVar == Broadcasts.d.a.formDismissed) {
                        d4.this.f16424a.onFormDismissed(new MDFormListenerData(longExtra, stringExtra, formTriggerType));
                    } else if (aVar == Broadcasts.d.a.formClosed) {
                        d4.this.f16424a.onFormClosed(new MDFormListenerData(longExtra, stringExtra, formTriggerType));
                    } else if (aVar == Broadcasts.d.a.formDisplayed) {
                        MDFormListener mDFormListener2 = d4.this.f16424a;
                        MDFormListenerData mDFormListenerData2 = new MDFormListenerData(longExtra, stringExtra, formTriggerType, stringExtra3, stringExtra4, mDAppearanceMode, mDAppearanceMode2);
                        stringExtra4 = stringExtra4;
                        mDAppearanceMode = mDAppearanceMode;
                        str = stringExtra3;
                        mDFormListener2.onFormDisplayed(mDFormListenerData2);
                    } else {
                        str = stringExtra3;
                        if (aVar == Broadcasts.d.a.formBlockedUrl) {
                            mDFormListener = d4.this.f16424a;
                            mDFormListenerData = new MDFormListenerData(longExtra, stringExtra, formTriggerType, stringExtra2, true);
                        } else if (aVar == Broadcasts.d.a.formLinkSelected) {
                            mDFormListener = d4.this.f16424a;
                            mDFormListenerData = new MDFormListenerData(longExtra, stringExtra, formTriggerType, stringExtra2, false);
                        } else if (aVar == Broadcasts.d.a.formThankYouPrompt) {
                            MDFormListener mDFormListener3 = d4.this.f16424a;
                            MDFormListenerData mDFormListenerData3 = new MDFormListenerData(longExtra, stringExtra, formTriggerType, mDAppearanceMode, mDAppearanceMode2);
                            mDAppearanceMode = mDAppearanceMode;
                            mDFormListener3.onFormThankYouPrompt(mDFormListenerData3);
                        }
                        mDFormListener.onFormLinkSelected(mDFormListenerData);
                    }
                    str = stringExtra3;
                }
                d4.this.a(aVar, stringExtra, formTriggerType, formViewType, longExtra, longExtra2, str, stringExtra4, booleanExtra, booleanExtra2, mDAppearanceMode);
            } catch (Exception e) {
                a4.c(e.getMessage());
            }
        }
    }

    public class b extends v4 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Broadcasts.d.a f16426a;
        final /* synthetic */ String b;
        final /* synthetic */ FormTriggerType c;
        final /* synthetic */ FormViewType d;
        final /* synthetic */ long e;
        final /* synthetic */ long f;
        final /* synthetic */ String g;
        final /* synthetic */ String h;
        final /* synthetic */ MDAppearanceMode i;
        final /* synthetic */ boolean j;
        final /* synthetic */ boolean k;

        public b(Broadcasts.d.a aVar, String str, FormTriggerType formTriggerType, FormViewType formViewType, long j, long j2, String str2, String str3, MDAppearanceMode mDAppearanceMode, boolean z, boolean z2) {
            this.f16426a = aVar;
            this.b = str;
            this.c = formTriggerType;
            this.d = formViewType;
            this.e = j;
            this.f = j2;
            this.g = str2;
            this.h = str3;
            this.i = mDAppearanceMode;
            this.j = z;
            this.k = z2;
        }

        @Override // com.medallia.digital.mobilesdk.v4
        public void a() throws JSONException {
            Broadcasts.d.a aVar = this.f16426a;
            if (aVar == Broadcasts.d.a.codeFormReady) {
                AnalyticsBridge.getInstance().reportCodeFormReadyEvent(this.b, this.c, this.d);
            } else if (aVar == Broadcasts.d.a.formSubmitted) {
                AnalyticsBridge.getInstance().reportFormSubmittedEvent(this.b, this.c, this.e, this.d);
            } else if (aVar == Broadcasts.d.a.formDismissed) {
                AnalyticsBridge.getInstance().reportFormDismissedEvent(this.b, this.c, this.d);
            } else if (aVar == Broadcasts.d.a.formClosed) {
                AnalyticsBridge.getInstance().reportFormClosedEvent(this.b, this.c, this.d);
            } else if (aVar == Broadcasts.d.a.formDisplayed) {
                AnalyticsBridge.getInstance().reportFormDisplayedEvent(this.b, this.c, this.d, this.f, this.g, this.h, this.i);
                Broadcasts.h.a(Broadcasts.h.a.formDisplayed);
            } else if (aVar == Broadcasts.d.a.formThankYouPrompt) {
                AnalyticsBridge.getInstance().reportFormThankYouPromptEvent(this.b, this.c, this.d, this.j, this.k, this.i);
            }
            if (d4.this.f16424a != null) {
                AnalyticsBridge.getInstance().reportSetFormCallbackEvent(this.f16426a.name(), this.b, this.c);
            }
        }
    }

    @Override // com.medallia.digital.mobilesdk.d0
    public Object b() {
        return this.f16424a;
    }

    @Override // com.medallia.digital.mobilesdk.d0
    public BroadcastReceiver c() {
        return this.b;
    }

    @Override // com.medallia.digital.mobilesdk.d0
    public String a() {
        return "com.medallia.digital.mobilesdk.form_action";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Broadcasts.d.a aVar, String str, FormTriggerType formTriggerType, FormViewType formViewType, long j, long j2, String str2, String str3, boolean z, boolean z2, MDAppearanceMode mDAppearanceMode) {
        w7.b().a().execute(new b(aVar, str, formTriggerType, formViewType, j, j2, str2, str3, mDAppearanceMode, z, z2));
    }

    @Override // com.medallia.digital.mobilesdk.d0
    public void a(Object obj) {
        if (this.f16424a != null && obj == null) {
            e();
            this.f16424a = null;
        }
        if (obj instanceof MDFormListener) {
            this.f16424a = (MDFormListener) obj;
        }
        d();
    }
}
