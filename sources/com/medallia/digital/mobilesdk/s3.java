package com.medallia.digital.mobilesdk;

import android.util.Pair;
import com.medallia.digital.mobilesdk.d7;
import com.medallia.digital.mobilesdk.h4;
import java.io.File;
import java.util.List;
import org.json.JSONException;

/* loaded from: classes.dex */
class s3 implements q0 {

    /* renamed from: a, reason: collision with root package name */
    private h4 f16695a;
    private boolean b;

    public s3() {
        this.b = false;
    }

    private void a() throws JSONException {
        List<Pair<String, Boolean>> listA = v0.a();
        if (listA != null) {
            for (Pair<String, Boolean> pair : listA) {
                if (pair != null) {
                    AnalyticsBridge.getInstance().reportDeleteStorageEvent((String) pair.first, ((Boolean) pair.second).booleanValue());
                }
            }
        }
    }

    private ConfigurationContract b() throws JSONException {
        File fileC = v0.c();
        ConfigurationContract configurationContractA = v0.a(fileC);
        if (!v0.a(fileC, configurationContractA)) {
            if (!this.b) {
                this.f16695a = new s1(h4.a.A);
                a();
            }
            a4.b("Local configuration is not available");
            return null;
        }
        if (this.b) {
            long jA = d7.b().a(d7.a.LOCAL_CONFIGURATION_TIMESTAMP, 0L);
            if (jA == 0) {
                a4.e("Offline: local configuration timestamp: is not available");
                a();
                this.f16695a = new s1(h4.a.B);
                return null;
            }
            if (v0.a(configurationContractA)) {
                a4.e(androidx.camera.core.impl.b.k(jA, "Offline: local configuration is expired. timestamp: "));
                a();
                this.f16695a = new s1(h4.a.C);
                return null;
            }
            AnalyticsBridge.getInstance().reportInitOfflineMechanismEvent(jA);
        }
        a4.e("Local configuration fetched successfully");
        return configurationContractA;
    }

    public s3(boolean z, h4 h4Var) {
        this.f16695a = h4Var;
        this.b = z;
    }

    @Override // com.medallia.digital.mobilesdk.q0
    public void a(n6<u0> n6Var) {
        ConfigurationContract configurationContractB = b();
        if (configurationContractB != null) {
            a4.b("Offline configuration fetched successfully");
            if (n6Var != null) {
                n6Var.a((n6<u0>) new u0(configurationContractB, false));
                return;
            }
            return;
        }
        a4.b("Offline configuration is not available");
        if (n6Var != null) {
            h4 h4Var = this.f16695a;
            if (h4Var != null) {
                n6Var.a(h4Var);
            } else {
                n6Var.a(new s1(h4.a.w));
            }
        }
    }
}
