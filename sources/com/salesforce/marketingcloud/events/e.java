package com.salesforce.marketingcloud.events;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f16885a;

    @Nullable
    private final String b;

    @NotNull
    private final String c;

    public e(@NotNull String id, @Nullable String str, @NotNull String type) {
        Intrinsics.h(id, "id");
        Intrinsics.h(type, "type");
        this.f16885a = id;
        this.b = str;
        this.c = type;
    }

    @NotNull
    public final String a() {
        return this.f16885a;
    }

    @Nullable
    public final String b() {
        return this.b;
    }

    @NotNull
    public final String c() {
        return this.c;
    }

    @Nullable
    public final String d() {
        return this.b;
    }

    @NotNull
    public final String e() {
        return this.f16885a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.c(this.f16885a, eVar.f16885a) && Intrinsics.c(this.b, eVar.b) && Intrinsics.c(this.c, eVar.c);
    }

    @NotNull
    public final String f() {
        return this.c;
    }

    @NotNull
    public final JSONObject g() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", this.f16885a);
        String str = this.b;
        if (str != null) {
            jSONObject.put("activityInstanceId", str);
        }
        jSONObject.put("type", this.c);
        return jSONObject;
    }

    public int hashCode() {
        int iHashCode = this.f16885a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        String str = this.f16885a;
        String str2 = this.b;
        return YU.a.o(YU.a.v("Outcome(id=", str, ", activityInstanceId=", str2, ", type="), this.c, ")");
    }

    public /* synthetic */ e(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, str3);
    }

    @NotNull
    public final e a(@NotNull String id, @Nullable String str, @NotNull String type) {
        Intrinsics.h(id, "id");
        Intrinsics.h(type, "type");
        return new e(id, str, type);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public e(@NotNull JSONObject json) throws JSONException {
        Intrinsics.h(json, "json");
        String string = json.getString("id");
        Intrinsics.g(string, "getString(...)");
        String strI = com.google.android.gms.common.api.internal.a.i(json, "activityInstanceId", "optString(...)");
        String string2 = json.getString("type");
        Intrinsics.g(string2, "getString(...)");
        this(string, strI, string2);
    }

    public static /* synthetic */ e a(e eVar, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = eVar.f16885a;
        }
        if ((i & 2) != 0) {
            str2 = eVar.b;
        }
        if ((i & 4) != 0) {
            str3 = eVar.c;
        }
        return eVar.a(str, str2, str3);
    }
}
