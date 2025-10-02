package com.salesforce.marketingcloud.media;

import java.util.Iterator;

/* loaded from: classes6.dex */
class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final o f16962a;
    final d b;
    final h c;
    private Exception d;

    public e(h hVar, d dVar) {
        this.f16962a = dVar.c();
        this.c = hVar;
        this.b = dVar;
    }

    public Exception a() {
        return this.d;
    }

    public boolean b() {
        return this.d != null;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            try {
                Thread.currentThread().setName("CacheCleaner - Cleaning");
                r rVarA = this.b.a();
                Iterator<String> it = this.b.d().iterator();
                while (it.hasNext()) {
                    rVarA.b(it.next());
                }
                rVarA.a();
            } catch (Exception e) {
                this.d = e;
            }
            Thread.currentThread().setName("CacheCleaner - Idle");
            this.c.a(this);
        } catch (Throwable th) {
            Thread.currentThread().setName("CacheCleaner - Idle");
            throw th;
        }
    }
}
