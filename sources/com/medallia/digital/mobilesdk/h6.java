package com.medallia.digital.mobilesdk;

import android.util.Pair;
import com.medallia.digital.mobilesdk.h4;
import com.medallia.digital.mobilesdk.j8;
import com.medallia.digital.mobilesdk.o6;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;

/* loaded from: classes6.dex */
class h6 implements q0 {
    private static final String h = "uuid";

    /* renamed from: a, reason: collision with root package name */
    private final w f16513a;
    private final o6 b;
    private final String c;
    private final HashMap<String, String> d;
    private final HashMap<String, String> e;
    private int f;
    private n6<u0> g;

    public class a implements o6.a {
        public a() {
        }

        @Override // com.medallia.digital.mobilesdk.o6.a
        public void a(i6 i6Var) {
            if (i6Var != null && i6Var.b() == 401) {
                a4.b("Remote configuration auth error");
                h6.this.a(i6Var);
            } else if (i6Var == null || i6Var.b() != -45) {
                a4.b("Remote configuration error trying to fetch offline");
                h6.this.a(false);
            } else {
                a4.b("Remote configuration no network errortrying to fetch offline");
                h6.this.a(true);
            }
        }

        @Override // com.medallia.digital.mobilesdk.o6.a
        public void a(k6 k6Var) throws JSONException {
            if (k6Var == null) {
                a4.c("Configuration response is null");
                h6.this.a(false);
                return;
            }
            String strB = k6Var.b();
            ConfigurationContract configurationContractCreateConfiguration = ModelFactory.getInstance().createConfiguration(strB);
            if (configurationContractCreateConfiguration == null) {
                a4.b("Remote configuration is broken trying to fetch offline");
                a4.c(h4.a.E.toString());
                h6.this.a(false);
                return;
            }
            List<Pair<String, Boolean>> listA = v0.a(strB);
            if (listA != null) {
                for (Pair<String, Boolean> pair : listA) {
                    if (pair != null) {
                        AnalyticsBridge.getInstance().reportDeleteStorageEvent((String) pair.first, ((Boolean) pair.second).booleanValue());
                    }
                }
            }
            if (configurationContractCreateConfiguration.getConfigurationUUID() != null) {
                a4.e("Saving UUID and UUID url");
                j8.b bVar = j8.b.CONFIGURATION_UUID;
                j8.b(bVar, configurationContractCreateConfiguration.getConfigurationUUID().getUuid());
                j8.c(bVar, configurationContractCreateConfiguration.getConfigurationUUID().getUrl());
            }
            a4.e("Configuration fetch finished - using configuration from remote server");
            a4.b("Configuration updated successfully");
            h6.this.g.a((n6) new u0(configurationContractCreateConfiguration, true));
        }
    }

    public h6(o6 o6Var, String str, HashMap<String, String> map, HashMap<String, String> map2) {
        this.b = o6Var;
        this.f16513a = new w(o6Var);
        this.c = str;
        this.d = map;
        this.e = map2;
    }

    public class b implements n6<Void> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ i6 f16515a;

        public b(i6 i6Var) {
            this.f16515a = i6Var;
        }

        @Override // com.medallia.digital.mobilesdk.n6
        public void a(h4 h4Var) {
            h6.this.a(this.f16515a);
        }

        @Override // com.medallia.digital.mobilesdk.n6
        public void a(Void r2) {
            h6 h6Var = h6.this;
            h6Var.a(h6Var.g);
        }
    }

    public void a(i6 i6Var) {
        int i;
        if (i6Var.b() == 401 && (i = this.f) < 2) {
            this.f = i + 1;
            this.f16513a.a(new b(i6Var));
        } else {
            n6<u0> n6Var = this.g;
            if (n6Var != null) {
                n6Var.a(new h4(h4.a.D));
            }
        }
    }

    @Override // com.medallia.digital.mobilesdk.q0
    public void a(n6<u0> n6Var) {
        this.g = n6Var;
        j8.b bVar = j8.b.CONFIGURATION_UUID;
        if (j8.b(bVar) != null) {
            try {
                this.d.put(h, URLEncoder.encode(j8.b(bVar), "UTF-8"));
            } catch (Exception e) {
                a4.c(e.getMessage());
            }
        }
        this.b.a(this.c, this.d, this.e, s4.f().i().c().a().intValue(), new a());
    }

    public void a(boolean z) {
        (z ? new s3(true, new h4(h4.a.T)) : new s3()).a(this.g);
    }
}
