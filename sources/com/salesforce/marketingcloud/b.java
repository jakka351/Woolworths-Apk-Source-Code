package com.salesforce.marketingcloud;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.salesforce.marketingcloud.k;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import org.json.JSONException;
import org.json.JSONObject;

@SuppressLint
@RestrictTo
/* loaded from: classes6.dex */
public class b implements d, k.e {
    public static final int i = 0;
    public static final int j = 1;
    public static final int k = 2;
    public static final int l = 4;
    public static final int m = 8;
    public static final int n = 16;
    public static final int o = 32;
    public static final int p = 64;
    public static final int q = 128;
    public static final int r = 256;
    public static final int s = 512;
    public static final int t = 1024;
    public static final int u = 2048;
    public static final int v = 4096;
    private static final int w = 1;
    private final com.salesforce.marketingcloud.storage.f d;
    private final k e;
    private InterfaceC0353b f;
    private c g;
    private c h;

    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    @RestrictTo
    /* renamed from: com.salesforce.marketingcloud.b$b, reason: collision with other inner class name */
    public interface InterfaceC0353b {
        void a(int i);
    }

    @VisibleForTesting
    public enum c {
        RTBF(8191),
        ROP(8190),
        DNT(1888),
        NONE(0),
        NO_BEACON(64),
        NO_GEOFENCE(32),
        NO_LOCATION(96);


        /* renamed from: a, reason: collision with root package name */
        public final int f16854a;

        c(int i2) {
            this.f16854a = i2;
        }

        public static c a(String str) {
            try {
                return valueOf(str);
            } catch (Exception unused) {
                return NONE;
            }
        }
    }

    public b(k kVar, com.salesforce.marketingcloud.storage.f fVar) {
        this.e = kVar;
        this.d = fVar;
        c cVarB = b(fVar);
        this.h = cVarB;
        if (cVarB != c.RTBF) {
            kVar.a(k.d.blocked, this);
        }
    }

    public static boolean a(int i2, int i3) {
        return (i2 & i3) == i3;
    }

    private static c b(@NonNull com.salesforce.marketingcloud.storage.f fVar) {
        String strA = fVar.a((String) null);
        return strA != null ? c.a(strA) : c.NONE;
    }

    public static boolean c(int i2, int i3) {
        if (b(i2, i3)) {
            return false;
        }
        switch (i3) {
            case 2:
            case 256:
            case 512:
            case 2048:
                if (c.ROP.f16854a != i2) {
                }
                break;
            case 4:
            case 8:
            case 16:
            case 32:
            case 64:
            case 128:
            case 4096:
                break;
        }
        return false;
    }

    @Override // com.salesforce.marketingcloud.d
    @NonNull
    public String componentName() {
        return "ControlChannel";
    }

    @Override // com.salesforce.marketingcloud.d
    @Nullable
    public JSONObject componentState() {
        try {
            return new JSONObject().put("flag", this.h.name());
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // com.salesforce.marketingcloud.k.e
    @WorkerThread
    public void onSyncReceived(@NonNull k.d dVar, @NonNull JSONObject jSONObject) {
        if (dVar == k.d.blocked && jSONObject.optInt("version", -1) == 1) {
            try {
                a(jSONObject.getJSONObject("items").getInt("blocked"));
            } catch (JSONException e) {
                g.b(MarketingCloudSdk.u, e, "Failed to parse [blocked] sync data.", new Object[0]);
            }
        }
    }

    @Override // com.salesforce.marketingcloud.d
    public void tearDown(boolean z) {
        this.e.a(k.d.blocked, (k.e) null);
        this.f = null;
    }

    public static boolean b(int i2, int i3) {
        return !a(i2, i3);
    }

    public int a() {
        return this.h.f16854a;
    }

    public static int a(@NonNull com.salesforce.marketingcloud.storage.f fVar) {
        return b(fVar).f16854a;
    }

    private synchronized void a(int i2) {
        try {
            c cVar = c.RTBF;
            if (!a(i2, cVar.f16854a)) {
                cVar = c.ROP;
                if (!a(i2, cVar.f16854a)) {
                    cVar = c.DNT;
                    if (!a(i2, cVar.f16854a)) {
                        cVar = c.NONE;
                    }
                }
            }
            g.d(MarketingCloudSdk.u, "Control Channel blocked value %d received", Integer.valueOf(i2));
            this.d.b(cVar.name());
            if (cVar != this.h) {
                InterfaceC0353b interfaceC0353b = this.f;
                if (interfaceC0353b != null) {
                    this.h = cVar;
                    interfaceC0353b.a(cVar.f16854a);
                } else {
                    this.g = cVar;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void a(InterfaceC0353b interfaceC0353b) {
        c cVar;
        this.f = interfaceC0353b;
        if (interfaceC0353b != null && (cVar = this.g) != null) {
            this.h = cVar;
            this.g = null;
            interfaceC0353b.a(cVar.f16854a);
        }
    }
}
