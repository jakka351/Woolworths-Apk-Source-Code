package com.scandit.djinni;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes6.dex */
public class Promise<T> {

    /* renamed from: a, reason: collision with root package name */
    private AtomicReference f19006a;
    private final d b;

    public Promise() {
        d dVar = new d();
        this.b = dVar;
        this.f19006a = new AtomicReference(dVar);
    }

    public Future<T> getFuture() {
        return new Future<>(this.b);
    }

    public void setException(Throwable th) {
        c cVar = null;
        d dVar = (d) this.f19006a.getAndSet(null);
        synchronized (dVar) {
            dVar.b = th;
            c cVar2 = dVar.c;
            if (cVar2 != null) {
                cVar = cVar2;
            } else {
                dVar.notifyAll();
            }
        }
        if (cVar != null) {
            cVar.a(dVar);
        }
    }

    public void setValue(T t) {
        c cVar = null;
        d dVar = (d) this.f19006a.getAndSet(null);
        synchronized (dVar) {
            dVar.f19009a = t;
            dVar.d = true;
            c cVar2 = dVar.c;
            if (cVar2 != null) {
                cVar = cVar2;
            } else {
                dVar.notifyAll();
            }
        }
        if (cVar != null) {
            cVar.a(dVar);
        }
    }

    public void setValue() {
        setValue(null);
    }
}
