package com.medallia.digital.mobilesdk;

import android.text.TextUtils;
import com.medallia.digital.mobilesdk.MDExternalError;
import com.medallia.digital.mobilesdk.b0;
import com.medallia.digital.mobilesdk.d7;
import com.medallia.digital.mobilesdk.f2;
import java.util.ArrayList;
import org.json.JSONException;

/* loaded from: classes.dex */
class d {

    /* loaded from: classes6.dex */
    public class a implements n6<u0> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f16411a;
        final /* synthetic */ n b;
        final /* synthetic */ n c;
        final /* synthetic */ MDResultCallback d;

        public a(String str, n nVar, n nVar2, MDResultCallback mDResultCallback) {
            this.f16411a = str;
            this.b = nVar;
            this.c = nVar2;
            this.d = mDResultCallback;
        }

        @Override // com.medallia.digital.mobilesdk.n6
        public void a(h4 h4Var) {
            StringBuilder sb = new StringBuilder("Migration getConfiguration Error: ");
            sb.append(h4Var != null ? h4Var.getMessage() : "");
            a4.c(sb.toString());
        }

        @Override // com.medallia.digital.mobilesdk.n6
        public void a(u0 u0Var) throws JSONException {
            s4.f().a(u0Var.a());
            d.c(this.f16411a, this.b, this.c, this.d);
        }
    }

    /* loaded from: classes6.dex */
    public class b implements f2.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f16412a;
        final /* synthetic */ n b;
        final /* synthetic */ n c;
        final /* synthetic */ MDResultCallback d;

        public b(String str, n nVar, n nVar2, MDResultCallback mDResultCallback) {
            this.f16412a = str;
            this.b = nVar;
            this.c = nVar2;
            this.d = mDResultCallback;
        }

        @Override // com.medallia.digital.mobilesdk.f2.b
        public void a() {
            a4.c("Migration Submit Stored feedbacks Error");
        }

        @Override // com.medallia.digital.mobilesdk.f2.b
        public void onSuccess() {
            a4.e("Migration Stored feedbacks have been submitted successfully");
            d.a(this.f16412a, this.b, this.c, this.d);
        }
    }

    public static void a(String str, MDResultCallback mDResultCallback) {
        n nVarCreateApiToken = ModelFactory.getInstance().createApiToken(t4.e().a(d7.a.API_TOKEN));
        n nVarCreateApiToken2 = ModelFactory.getInstance().createApiToken(str);
        if (nVarCreateApiToken == null || nVarCreateApiToken2 == null) {
            return;
        }
        a4.e("Migration between accounts has started from propertyId " + nVarCreateApiToken.c() + " to propertyId " + nVarCreateApiToken2.c());
        w2.c().a(nVarCreateApiToken);
        b(str, nVarCreateApiToken, nVarCreateApiToken2, mDResultCallback);
    }

    private static void b(String str, n nVar, n nVar2, MDResultCallback mDResultCallback) {
        ArrayList<? extends b0> arrayListC = f1.a().c(b0.a.Feedback, new Object[0]);
        if (arrayListC == null || arrayListC.isEmpty()) {
            a(str, nVar, nVar2, mDResultCallback);
        } else if (x8.b()) {
            s4.f().a("2.0.0", new a(str, nVar, nVar2, mDResultCallback));
        } else {
            a4.c("Migration Error: there are feedbacks to submit but no internet connection");
            mDResultCallback.onError(new MDExternalError(MDExternalError.ExternalError.NO_INTERNET_CONNECTION_AVAILABLE_12));
        }
    }

    public static void c(String str, n nVar, n nVar2, MDResultCallback mDResultCallback) throws JSONException {
        MedalliaDigital.getMedalliaDigitalBrain().c().a(new b(str, nVar, nVar2, mDResultCallback));
    }

    public static void a(String str, n nVar, n nVar2, MDResultCallback mDResultCallback) {
        a4.e("Migration between accounts has ended from propertyId " + nVar.c() + " to propertyId " + nVar2.c());
        MDLogLevel mDLogLevelB = a4.a().b();
        MedalliaDigital.getMedalliaDigitalBrain().clearAndDisconnect();
        a4.a().a(mDLogLevelB);
        MedalliaDigital.updateBrainOnMigration();
        MedalliaDigital.getMedalliaDigitalBrain().b(str, mDResultCallback);
    }

    public static boolean a(String str) {
        n nVarCreateApiToken = ModelFactory.getInstance().createApiToken(t4.e().a(d7.a.API_TOKEN));
        return (nVarCreateApiToken == null || TextUtils.isEmpty(nVarCreateApiToken.a()) || str == null || str.isEmpty() || nVarCreateApiToken.a().equals(str) || nVarCreateApiToken.c() == new n(str).c()) ? false : true;
    }
}
