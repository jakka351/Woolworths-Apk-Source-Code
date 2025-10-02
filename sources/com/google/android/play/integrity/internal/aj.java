package com.google.android.play.integrity.internal;

/* loaded from: classes6.dex */
public final class aj implements an {
    public static final Object c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile an f14771a;
    public volatile Object b;

    /* JADX WARN: Multi-variable type inference failed */
    public static aj b(ak akVar) {
        if (akVar instanceof aj) {
            return (aj) akVar;
        }
        aj ajVar = new aj();
        ajVar.b = c;
        ajVar.f14771a = akVar;
        return ajVar;
    }

    @Override // com.google.android.play.integrity.internal.an
    public final Object a() {
        Object objA;
        Object obj = this.b;
        Object obj2 = c;
        if (obj != obj2) {
            return obj;
        }
        synchronized (this) {
            try {
                objA = this.b;
                if (objA == obj2) {
                    objA = this.f14771a.a();
                    Object obj3 = this.b;
                    if (obj3 != obj2 && obj3 != objA) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + objA + ". This is likely due to a circular dependency.");
                    }
                    this.b = objA;
                    this.f14771a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return objA;
    }
}
