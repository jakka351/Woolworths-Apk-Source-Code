package com.salesforce.marketingcloud.events.predicates;

import androidx.annotation.NonNull;

/* loaded from: classes6.dex */
public abstract class f {

    @NonNull
    public static final f b = new a();

    @NonNull
    public static final f c = new b();
    private static final String d = com.salesforce.marketingcloud.g.a("Predicate");

    /* renamed from: a, reason: collision with root package name */
    private Boolean f16893a;

    public class a extends f {
        @Override // com.salesforce.marketingcloud.events.predicates.f
        public boolean a() {
            return true;
        }

        @Override // com.salesforce.marketingcloud.events.predicates.f
        @NonNull
        public String c() {
            return "true";
        }
    }

    public class b extends f {
        @Override // com.salesforce.marketingcloud.events.predicates.f
        public boolean a() {
            return false;
        }

        @Override // com.salesforce.marketingcloud.events.predicates.f
        @NonNull
        public String c() {
            return "false";
        }
    }

    public abstract boolean a();

    public final boolean b() {
        if (this.f16893a == null) {
            this.f16893a = Boolean.valueOf(a());
        }
        com.salesforce.marketingcloud.g.d(d, "%s %s", c(), this.f16893a.booleanValue() ? "passed" : "failed");
        return this.f16893a.booleanValue();
    }

    @NonNull
    public abstract String c();
}
