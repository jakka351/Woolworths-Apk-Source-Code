package com.salesforce.marketingcloud.analytics;

import com.salesforce.marketingcloud.messages.push.PushMessageManager;
import com.salesforce.marketingcloud.sfmcsdk.components.identity.Identity;
import com.salesforce.marketingcloud.storage.db.k;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.salesforce.marketingcloud.registration.f f16841a;

    @Nullable
    private final PushMessageManager b;
    private final boolean c;

    @Nullable
    private final Identity d;

    public e(@NotNull com.salesforce.marketingcloud.registration.f registrationMeta, @Nullable PushMessageManager pushMessageManager, boolean z, @Nullable Identity identity) {
        Intrinsics.h(registrationMeta, "registrationMeta");
        this.f16841a = registrationMeta;
        this.b = pushMessageManager;
        this.c = z;
        this.d = identity;
    }

    private final com.salesforce.marketingcloud.registration.f a() {
        return this.f16841a;
    }

    private final PushMessageManager b() {
        return this.b;
    }

    private final boolean c() {
        return this.c;
    }

    private final Identity d() {
        return this.d;
    }

    @NotNull
    public final JSONObject e() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("deviceID", this.f16841a.f());
        jSONObject.put("etAppId", this.f16841a.d());
        jSONObject.put(k.a.m, this.f16841a.g());
        jSONObject.put(k.a.b, this.f16841a.h());
        jSONObject.put("platform_Version", this.f16841a.i());
        jSONObject.put("sdk_Version", this.f16841a.j());
        jSONObject.put("app_Version", this.f16841a.e());
        jSONObject.put(k.a.n, Locale.getDefault().toString());
        jSONObject.put("timeZone", com.salesforce.marketingcloud.util.l.b());
        jSONObject.put("location_Enabled", this.c);
        PushMessageManager pushMessageManager = this.b;
        if (pushMessageManager != null) {
            jSONObject.put("backgroundRefreshEnabled", pushMessageManager.isPushEnabled());
            jSONObject.put("push_Enabled", pushMessageManager.isPushEnabled());
        }
        Identity identity = this.d;
        if (identity != null) {
            jSONObject.put("identity", identity.toJson());
        }
        return jSONObject;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.c(this.f16841a, eVar.f16841a) && Intrinsics.c(this.b, eVar.b) && this.c == eVar.c && Intrinsics.c(this.d, eVar.d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = this.f16841a.hashCode() * 31;
        PushMessageManager pushMessageManager = this.b;
        int iHashCode2 = (iHashCode + (pushMessageManager == null ? 0 : pushMessageManager.hashCode())) * 31;
        boolean z = this.c;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (iHashCode2 + i) * 31;
        Identity identity = this.d;
        return i2 + (identity != null ? identity.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "EventMetaData(registrationMeta=" + this.f16841a + ", pushMessageManager=" + this.b + ", locationEnabled=" + this.c + ", identity=" + this.d + ")";
    }

    @NotNull
    public final e a(@NotNull com.salesforce.marketingcloud.registration.f registrationMeta, @Nullable PushMessageManager pushMessageManager, boolean z, @Nullable Identity identity) {
        Intrinsics.h(registrationMeta, "registrationMeta");
        return new e(registrationMeta, pushMessageManager, z, identity);
    }

    public static /* synthetic */ e a(e eVar, com.salesforce.marketingcloud.registration.f fVar, PushMessageManager pushMessageManager, boolean z, Identity identity, int i, Object obj) {
        if ((i & 1) != 0) {
            fVar = eVar.f16841a;
        }
        if ((i & 2) != 0) {
            pushMessageManager = eVar.b;
        }
        if ((i & 4) != 0) {
            z = eVar.c;
        }
        if ((i & 8) != 0) {
            identity = eVar.d;
        }
        return eVar.a(fVar, pushMessageManager, z, identity);
    }
}
