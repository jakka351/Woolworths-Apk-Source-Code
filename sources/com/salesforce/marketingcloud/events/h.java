package com.salesforce.marketingcloud.events;

import com.salesforce.marketingcloud.internal.m;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@SourceDebugExtension
/* loaded from: classes6.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f16889a;

    @NotNull
    private final String b;

    @Nullable
    private final Date c;

    @Nullable
    private final List<g> d;

    @NotNull
    private final List<e> e;

    @Nullable
    private String f;

    public h(@NotNull String id, @NotNull String key, @Nullable Date date, @Nullable List<g> list, @NotNull List<e> outcomes, @Nullable String str) {
        Intrinsics.h(id, "id");
        Intrinsics.h(key, "key");
        Intrinsics.h(outcomes, "outcomes");
        this.f16889a = id;
        this.b = key;
        this.c = date;
        this.d = list;
        this.e = outcomes;
        this.f = str;
    }

    @NotNull
    public final String a() {
        return this.f16889a;
    }

    @NotNull
    public final String b() {
        return this.b;
    }

    @Nullable
    public final Date c() {
        return this.c;
    }

    @Nullable
    public final List<g> d() {
        return this.d;
    }

    @NotNull
    public final List<e> e() {
        return this.e;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Intrinsics.c(this.f16889a, hVar.f16889a) && Intrinsics.c(this.b, hVar.b) && Intrinsics.c(this.c, hVar.c) && Intrinsics.c(this.d, hVar.d) && Intrinsics.c(this.e, hVar.e) && Intrinsics.c(this.f, hVar.f);
    }

    @Nullable
    public final String f() {
        return this.f;
    }

    @Nullable
    public final String g() {
        return this.f;
    }

    @NotNull
    public final String h() {
        return this.f16889a;
    }

    public int hashCode() {
        int iC = androidx.camera.core.impl.b.c(this.f16889a.hashCode() * 31, 31, this.b);
        Date date = this.c;
        int iHashCode = (iC + (date == null ? 0 : date.hashCode())) * 31;
        List<g> list = this.d;
        int iD = androidx.camera.core.impl.b.d((iHashCode + (list == null ? 0 : list.hashCode())) * 31, 31, this.e);
        String str = this.f;
        return iD + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public final String i() {
        return this.b;
    }

    @NotNull
    public final List<e> j() {
        return this.e;
    }

    @Nullable
    public final List<g> k() {
        return this.d;
    }

    @Nullable
    public final Date l() {
        return this.c;
    }

    @NotNull
    public final JSONObject m() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", this.f16889a);
        jSONObject.put("key", this.b);
        Date date = this.c;
        if (date != null) {
            jSONObject.put("startDateUtc", m.a(date));
        }
        List<g> list = this.d;
        if (list != null) {
            JSONArray jSONArray = new JSONArray();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                jSONArray.put(((g) it.next()).k());
            }
            jSONObject.put("rules", jSONArray);
        }
        JSONArray jSONArray2 = new JSONArray();
        Iterator<T> it2 = this.e.iterator();
        while (it2.hasNext()) {
            jSONArray2.put(((e) it2.next()).g());
        }
        jSONObject.put("outcomes", jSONArray2);
        String str = this.f;
        if (str != null) {
            jSONObject.put("evalLogic", str);
        }
        return jSONObject;
    }

    @NotNull
    public String toString() {
        String str = this.f16889a;
        String str2 = this.b;
        Date date = this.c;
        List<g> list = this.d;
        List<e> list2 = this.e;
        String str3 = this.f;
        StringBuilder sbV = YU.a.v("Trigger(id=", str, ", key=", str2, ", startDateUtc=");
        sbV.append(date);
        sbV.append(", rules=");
        sbV.append(list);
        sbV.append(", outcomes=");
        sbV.append(list2);
        sbV.append(", evalLogic=");
        sbV.append(str3);
        sbV.append(")");
        return sbV.toString();
    }

    public /* synthetic */ h(String str, String str2, Date date, List list, List list2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : date, (i & 8) != 0 ? null : list, list2, (i & 32) != 0 ? null : str3);
    }

    @NotNull
    public final h a(@NotNull String id, @NotNull String key, @Nullable Date date, @Nullable List<g> list, @NotNull List<e> outcomes, @Nullable String str) {
        Intrinsics.h(id, "id");
        Intrinsics.h(key, "key");
        Intrinsics.h(outcomes, "outcomes");
        return new h(id, key, date, list, outcomes, str);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public h(@org.jetbrains.annotations.NotNull org.json.JSONObject r20) {
        /*
            Method dump skipped, instructions count: 703
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.salesforce.marketingcloud.events.h.<init>(org.json.JSONObject):void");
    }

    public static /* synthetic */ h a(h hVar, String str, String str2, Date date, List list, List list2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hVar.f16889a;
        }
        if ((i & 2) != 0) {
            str2 = hVar.b;
        }
        if ((i & 4) != 0) {
            date = hVar.c;
        }
        if ((i & 8) != 0) {
            list = hVar.d;
        }
        if ((i & 16) != 0) {
            list2 = hVar.e;
        }
        if ((i & 32) != 0) {
            str3 = hVar.f;
        }
        List list3 = list2;
        String str4 = str3;
        return hVar.a(str, str2, date, list, list3, str4);
    }

    public final void a(@Nullable String str) {
        this.f = str;
    }
}
