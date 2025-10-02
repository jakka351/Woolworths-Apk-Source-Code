package com.tealium.core;

import com.tealium.core.Tealium;
import com.tealium.core.persistence.DataLayer;
import com.tealium.core.persistence.Expiry;
import com.tealium.core.persistence.Serialization;
import com.tealium.core.persistence.e0;
import com.tealium.core.persistence.f0;
import com.tealium.core.persistence.g0;
import com.tealium.core.persistence.j;
import com.tealium.core.persistence.k;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/tealium/core/f;", "Lcom/tealium/core/persistence/DataLayer$DataLayerUpdatedListener;", "a", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class f implements DataLayer.DataLayerUpdatedListener {

    /* renamed from: a, reason: collision with root package name */
    public final String f19151a;
    public final k b;
    public final f0 c;
    public final Function1 d;
    public String e;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tealium/core/f$a;", "", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0})
    public static final class a {
        public static String a() {
            UUID uuidRandomUUID = UUID.randomUUID();
            Intrinsics.g(uuidRandomUUID, "randomUUID()");
            String string = uuidRandomUUID.toString();
            Intrinsics.g(string, "uuid.toString()");
            return StringsKt.Q(string, "-", "", false);
        }
    }

    public f(TealiumConfig tealiumConfig, k kVar, f0 f0Var, Function1 function1) {
        String strG;
        String str = tealiumConfig.o;
        this.f19151a = str;
        this.b = kVar;
        this.c = f0Var;
        this.d = function1;
        e0 e0VarB = kVar.f19174a.b("tealium_visitor_id");
        String strG2 = e0VarB != null ? e0VarB.b : null;
        if (strG2 == null) {
            strG2 = f0Var.G("tealium_visitor_id");
            strG2 = strG2 == null ? a.a() : strG2;
            b(strG2);
        }
        this.e = strG2;
        if (str != null && (strG = f0Var.G(str)) != null) {
            e(strG, str);
        }
        if (f0Var.G("tealium_visitor_id") == null) {
            f0Var.J("tealium_visitor_id", this.e, Expiry.b);
        }
    }

    public final void b(String str) {
        if (Intrinsics.c(this.e, str)) {
            return;
        }
        this.e = str;
        k kVar = this.b;
        g0 g0Var = kVar.f19174a;
        Serialization serialization = Serialization.STRING;
        Expiry expiry = Expiry.b;
        g0Var.c(new e0("tealium_visitor_id", str, expiry, null, serialization));
        String strA = kVar.a();
        if (strA != null) {
            kVar.b(strA, this.e);
        }
        this.c.J("tealium_visitor_id", str, expiry);
        ((Tealium.h) this.d).invoke(str);
    }

    public final void c() {
        Logger.f19124a.b("Tealium-1.6.0", "Resetting current visitor id");
        b(a.a());
    }

    @Override // com.tealium.core.persistence.DataLayer.DataLayerUpdatedListener
    public final void e(Object value, String key) {
        Intrinsics.h(key, "key");
        Intrinsics.h(value, "value");
        if (key.equals(this.f19151a)) {
            String str = value instanceof String ? (String) value : null;
            if (str == null || StringsKt.D(str)) {
                return;
            }
            k kVar = this.b;
            g0 g0Var = kVar.f19174a;
            String strA = kVar.a();
            String strA2 = j.a(str);
            if (!strA2.equals(strA)) {
                Logger.f19124a.b("Tealium-1.6.0", "Identity change has been detected.");
                g0Var.c(new e0("current_identity", strA2, Expiry.b, null, Serialization.STRING));
            }
            e0 e0VarB = g0Var.b(strA2);
            String str2 = e0VarB != null ? e0VarB.b : null;
            if (str2 != null) {
                if (str2.equals(this.e)) {
                    return;
                }
                Logger.f19124a.b("Tealium-1.6.0", "Identity has been seen before; setting known visitor id");
                b(str2);
                return;
            }
            if (strA == null) {
                Logger.f19124a.b("Tealium-1.6.0", "Identity unknown; linking to current visitor id");
                kVar.b(strA2, this.e);
            } else {
                Logger.f19124a.b("Tealium-1.6.0", "Identity unknown; resetting visitor id");
                c();
            }
        }
    }

    @Override // com.tealium.core.persistence.DataLayer.DataLayerUpdatedListener
    public final void q(Set keys) {
        Intrinsics.h(keys, "keys");
    }
}
