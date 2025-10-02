package com.medallia.digital.mobilesdk;

import java.util.Observable;

/* loaded from: classes.dex */
abstract class m0<T> extends Observable {

    /* renamed from: a, reason: collision with root package name */
    private boolean f16591a;
    private n0 b;
    private String c;
    private Lifetime d;
    private T e;

    public m0(n0 n0Var) {
        this.b = n0Var;
        if (n0Var != null) {
            this.c = n0Var.getName();
            this.d = n0Var.getLifetime();
        }
    }

    public n0 a() {
        if (this.b == null) {
            this.b = n0.Unknown;
        }
        return this.b;
    }

    public String b() {
        return getClass().getSimpleName().replace("Collector", "");
    }

    public abstract CollectorContract c();

    public Lifetime d() {
        return this.d;
    }

    public String e() {
        return this.c;
    }

    public T f() {
        return this.e;
    }

    public ValueType g() {
        T t = this.e;
        return t == null ? ValueType.TypeString : t instanceof Integer ? ValueType.TypeInteger : t instanceof Double ? ValueType.TypeDouble : t instanceof Long ? ValueType.TypeLong : t instanceof Boolean ? ValueType.TypeBoolean : ValueType.TypeString;
    }

    public boolean h() {
        return this.f16591a;
    }

    public c0 i() {
        T t = this.e;
        return new c0(t == null ? null : t.toString(), GroupType.collector, d(), g(), e());
    }

    public void a(Lifetime lifetime) {
        this.d = lifetime;
    }

    public void a(T t) {
        if (t == null || !this.f16591a) {
            return;
        }
        this.e = t;
        setChanged();
        notifyObservers(i());
    }

    public void a(boolean z) {
        this.f16591a = z;
    }
}
