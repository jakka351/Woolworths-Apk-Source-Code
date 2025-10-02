package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.b0;
import com.medallia.digital.mobilesdk.d7;

/* loaded from: classes.dex */
public class s8 implements m8 {
    private static s8 c;

    /* renamed from: a, reason: collision with root package name */
    private String f16704a = null;
    private boolean b;

    /* loaded from: classes6.dex */
    public class a implements MDResultCallback {
        public a() {
        }

        @Override // com.medallia.digital.mobilesdk.MDResultCallback
        public void onError(MDExternalError mDExternalError) {
            StringBuilder sb = new StringBuilder("OCQValidationRules failed ");
            sb.append(mDExternalError != null ? mDExternalError.getMessage() : "");
            a4.c(sb.toString());
        }

        @Override // com.medallia.digital.mobilesdk.MDResultCallback
        public void onSuccess() {
            a4.b("OCQValidationRules success after set user id");
        }
    }

    private void a() {
        f1 f1VarA = f1.a();
        b0.a aVar = b0.a.QuarantineRule;
        if (f1VarA.c(aVar) > 0) {
            f1.a().a(aVar);
        }
        d7.b().b(d7.a.C_UUID, (String) null);
        d7.b().b(d7.a.OCQ_UUID_URL, (String) null);
        CollectorsInfrastructure.getInstance().isOCQRulesValidCollector.a(Boolean.FALSE);
    }

    public static s8 b() {
        if (c == null) {
            c = new s8();
        }
        return c;
    }

    @Override // com.medallia.digital.mobilesdk.m8
    public void clearAndDisconnect() {
        c = null;
        this.f16704a = null;
        this.b = false;
    }

    private void a(String str) {
        t4.e().a(d7.a.OCQ_PREVIOUS_USER_ID, str);
        t4.e().a(d7.a.OCQ_USER_ID, this.f16704a);
        CollectorsInfrastructure.getInstance().isOCQUserSetCollector.a(Boolean.valueOf(!this.b));
    }

    private void a(String str, boolean z) {
        this.f16704a = str;
        this.b = z;
    }

    public void a(String str, boolean z, boolean z2) {
        a(str, z);
        a(z2, false);
    }

    private void a(boolean z) {
        if (z) {
            return;
        }
        p5.a().b(new a());
    }

    public void a(boolean z, boolean z2) {
        String str;
        if ((this.b || !((str = this.f16704a) == null || str.isEmpty())) && CollectorsInfrastructure.getInstance() != null && CollectorsInfrastructure.getInstance().isInitialized() && d7.b().d() && z) {
            String str2 = this.f16704a;
            String strA = t4.e().a(d7.a.OCQ_USER_ID);
            String strA2 = t4.e().a(d7.a.OCQ_PREVIOUS_USER_ID);
            if ((str2 != null && str2.equals(strA)) || ((str2 == null || str2.isEmpty()) && strA == null)) {
                a4.b("new user id is equal to the one is storage");
                return;
            }
            if (str2 == null || str2.isEmpty()) {
                a4.b("new user id is null or empty");
                a(strA);
            } else {
                if (strA == null && str2.equals(strA2)) {
                    a4.b("new user id is equal to previous");
                    a((String) null);
                } else if (!str2.equals(strA)) {
                    a4.b("new user id is not equal to previous");
                    a((String) null);
                    a();
                }
                a(z2);
            }
            this.b = false;
            this.f16704a = null;
        }
    }
}
