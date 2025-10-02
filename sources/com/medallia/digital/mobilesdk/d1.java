package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.s0;
import java.util.HashMap;
import java.util.Locale;

/* loaded from: classes.dex */
class d1 extends z1<CustomParameter> {
    private final HashMap<String, CustomParameter> f;

    public d1(n0 n0Var) {
        super(n0Var);
        this.f = new HashMap<>();
    }

    public void a(CustomParameter customParameter) {
        this.f.put(customParameter.b(), customParameter);
    }

    @Override // com.medallia.digital.mobilesdk.m0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(CustomParameter customParameter) {
        super.a((d1) customParameter);
        Locale locale = Locale.US;
        a4.b(YU.a.A("Collectors > set custom params: ", customParameter.toString()));
    }

    @Override // com.medallia.digital.mobilesdk.m0
    public CollectorContract c() {
        return s0.a.E;
    }

    @Override // com.medallia.digital.mobilesdk.m0
    public ValueType g() {
        return f().c() == null ? ValueType.TypeString : f().c() instanceof Integer ? ValueType.TypeInteger : f().c() instanceof Double ? ValueType.TypeDouble : f().c() instanceof Long ? ValueType.TypeLong : f().c() instanceof Boolean ? ValueType.TypeBoolean : f().c() instanceof Float ? ValueType.TypeDouble : ValueType.TypeString;
    }

    public void j() {
        this.f.clear();
    }

    public HashMap<String, CustomParameter> k() {
        return this.f;
    }
}
