package com.tealium.core.persistence;

import java.util.LinkedHashMap;
import kotlin.Metadata;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tealium/core/persistence/h0;", "", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public static final LinkedHashMap f19171a = new LinkedHashMap();
    public static Serde b;
    public static Serde c;
    public static Serde d;
    public static Serde e;
    public static Serde f;
    public static Serde g;
    public static Serde h;
    public static Serde i;
    public static Serde j;
    public static Serde k;
    public static Serde l;
    public static Serde m;

    public static Serde a() {
        Serde vVar = c;
        if (vVar == null) {
            vVar = new v(new r(), new u());
        }
        c = vVar;
        f19171a.put(Integer.TYPE, vVar);
        return vVar;
    }

    public static Serde b() {
        Serde zVar = l;
        if (zVar == null) {
            zVar = new z(new r(), new y());
        }
        l = zVar;
        f19171a.put(JSONObject.class, zVar);
        return zVar;
    }

    public static Serde c() {
        Serde d0Var = d;
        if (d0Var == null) {
            d0Var = new d0();
        }
        d = d0Var;
        f19171a.put(Long.TYPE, d0Var);
        return d0Var;
    }

    public static Serde d() {
        Serde k0Var = g;
        if (k0Var == null) {
            k0Var = new k0();
        }
        g = k0Var;
        f19171a.put(String[].class, k0Var);
        return k0Var;
    }

    public static Serde e() {
        Serde m0Var = b;
        if (m0Var == null) {
            m0Var = new m0(new r(), new l0());
        }
        b = m0Var;
        f19171a.put(String.class, m0Var);
        return m0Var;
    }
}
