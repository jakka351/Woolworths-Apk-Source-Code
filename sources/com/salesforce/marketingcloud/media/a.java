package com.salesforce.marketingcloud.media;

import android.annotation.SuppressLint;
import com.salesforce.marketingcloud.media.o;
import com.salesforce.marketingcloud.media.u;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

@SuppressLint
/* loaded from: classes6.dex */
public abstract class a<T> {

    /* renamed from: a, reason: collision with root package name */
    final s f16955a;
    final WeakReference<T> b;
    final v<T> c;
    private final o d;
    private boolean e;

    /* renamed from: com.salesforce.marketingcloud.media.a$a, reason: collision with other inner class name */
    public static class C0366a<M> extends WeakReference<M> {

        /* renamed from: a, reason: collision with root package name */
        final a f16956a;

        public C0366a(a aVar, M m, ReferenceQueue<? super M> referenceQueue) {
            super(m, referenceQueue);
            this.f16956a = aVar;
        }
    }

    public a(o oVar, v<T> vVar, s sVar) {
        this.d = oVar;
        this.f16955a = sVar;
        if (vVar == null) {
            this.b = null;
        } else {
            this.b = new C0366a(this, vVar.f16983a, oVar.h);
            vVar.f16983a = null;
        }
        this.c = vVar;
    }

    public void a() {
        this.e = true;
    }

    public abstract void a(u.b bVar);

    public abstract void a(Exception exc);

    public o b() {
        return this.d;
    }

    public String c() {
        return this.f16955a.b;
    }

    public o.c d() {
        return this.f16955a.c;
    }

    public s e() {
        return this.f16955a;
    }

    public T f() {
        WeakReference<T> weakReference = this.b;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public boolean g() {
        return this.e;
    }
}
