package com.salesforce.marketingcloud.events;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

@SourceDebugExtension
/* loaded from: classes6.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private final int f16886a;

    @NotNull
    private final String b;

    @NotNull
    private final a c;

    @NotNull
    private final b d;

    @NotNull
    private final String e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f16887a = new a("EQ", 0);
        public static final a b = new a("NEQ", 1);
        public static final a c = new a("LT", 2);
        public static final a d = new a("GT", 3);
        public static final a e = new a("LTEQ", 4);
        public static final a f = new a("GTEQ", 5);
        public static final a g = new a("REGEX", 6);
        private static final /* synthetic */ a[] h;
        private static final /* synthetic */ EnumEntries i;

        static {
            a[] aVarArrA = a();
            h = aVarArrA;
            i = EnumEntriesKt.a(aVarArrA);
        }

        private a(String str, int i2) {
        }

        private static final /* synthetic */ a[] a() {
            return new a[]{f16887a, b, c, d, e, f, g};
        }

        @NotNull
        public static EnumEntries<a> b() {
            return i;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) h.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final b f16888a = new b("INT", 0);
        public static final b b = new b("DOUBLE", 1);
        public static final b c = new b("BOOL", 2);
        public static final b d = new b("STRING", 3);
        private static final /* synthetic */ b[] e;
        private static final /* synthetic */ EnumEntries f;

        static {
            b[] bVarArrA = a();
            e = bVarArrA;
            f = EnumEntriesKt.a(bVarArrA);
        }

        private b(String str, int i) {
        }

        private static final /* synthetic */ b[] a() {
            return new b[]{f16888a, b, c, d};
        }

        @NotNull
        public static EnumEntries<b> b() {
            return f;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) e.clone();
        }
    }

    public g(int i, @NotNull String key, @NotNull a operator, @NotNull b valueType, @NotNull String value) {
        Intrinsics.h(key, "key");
        Intrinsics.h(operator, "operator");
        Intrinsics.h(valueType, "valueType");
        Intrinsics.h(value, "value");
        this.f16886a = i;
        this.b = key;
        this.c = operator;
        this.d = valueType;
        this.e = value;
    }

    public final int a() {
        return this.f16886a;
    }

    @NotNull
    public final String b() {
        return this.b;
    }

    @NotNull
    public final a c() {
        return this.c;
    }

    @NotNull
    public final b d() {
        return this.d;
    }

    @NotNull
    public final String e() {
        return this.e;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f16886a == gVar.f16886a && Intrinsics.c(this.b, gVar.b) && this.c == gVar.c && this.d == gVar.d && Intrinsics.c(this.e, gVar.e);
    }

    public final int f() {
        return this.f16886a;
    }

    @NotNull
    public final String g() {
        return this.b;
    }

    @NotNull
    public final a h() {
        return this.c;
    }

    public int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + androidx.camera.core.impl.b.c(Integer.hashCode(this.f16886a) * 31, 31, this.b)) * 31)) * 31);
    }

    @NotNull
    public final String i() {
        return this.e;
    }

    @NotNull
    public final b j() {
        return this.d;
    }

    @NotNull
    public final JSONObject k() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("index", this.f16886a);
        jSONObject.put("key", this.b);
        jSONObject.put("operator", this.c.name());
        jSONObject.put("valueType", this.d.name());
        jSONObject.put("value", this.e);
        return jSONObject;
    }

    @NotNull
    public String toString() {
        int i = this.f16886a;
        String str = this.b;
        a aVar = this.c;
        b bVar = this.d;
        String str2 = this.e;
        StringBuilder sbP = androidx.constraintlayout.core.state.a.p("Rule(index=", i, ", key=", str, ", operator=");
        sbP.append(aVar);
        sbP.append(", valueType=");
        sbP.append(bVar);
        sbP.append(", value=");
        return YU.a.o(sbP, str2, ")");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public g(@NotNull JSONObject json) throws JSONException {
        Intrinsics.h(json, "json");
        int iOptInt = json.optInt("index", 0);
        String string = json.getString("key");
        Intrinsics.g(string, "getString(...)");
        String string2 = json.getString("operator");
        Intrinsics.g(string2, "getString(...)");
        a aVarValueOf = a.valueOf(string2);
        String string3 = json.getString("valueType");
        Intrinsics.g(string3, "getString(...)");
        b bVarValueOf = b.valueOf(string3);
        String string4 = json.getString("value");
        Intrinsics.g(string4, "getString(...)");
        this(iOptInt, string, aVarValueOf, bVarValueOf, string4);
    }

    @NotNull
    public final g a(int i, @NotNull String key, @NotNull a operator, @NotNull b valueType, @NotNull String value) {
        Intrinsics.h(key, "key");
        Intrinsics.h(operator, "operator");
        Intrinsics.h(valueType, "valueType");
        Intrinsics.h(value, "value");
        return new g(i, key, operator, valueType, value);
    }

    public static /* synthetic */ g a(g gVar, int i, String str, a aVar, b bVar, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = gVar.f16886a;
        }
        if ((i2 & 2) != 0) {
            str = gVar.b;
        }
        if ((i2 & 4) != 0) {
            aVar = gVar.c;
        }
        if ((i2 & 8) != 0) {
            bVar = gVar.d;
        }
        if ((i2 & 16) != 0) {
            str2 = gVar.e;
        }
        String str3 = str2;
        a aVar2 = aVar;
        return gVar.a(i, str, aVar2, bVar, str3);
    }
}
