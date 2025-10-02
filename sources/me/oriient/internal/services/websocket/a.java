package me.oriient.internal.services.websocket;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes7.dex */
public final class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f25665a = new ArrayList();
    public final /* synthetic */ b b;

    public a(b bVar) {
        this.b = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long jNanoTime;
        this.f25665a.clear();
        try {
            this.f25665a.addAll(Collections.singletonList(((me.oriient.internal.services.websocket.client.c) this.b).h));
            synchronized (this.b.f) {
                jNanoTime = (long) (System.nanoTime() - (this.b.d * 1.5d));
            }
            Iterator it = this.f25665a.iterator();
            while (it.hasNext()) {
                f fVar = (f) it.next();
                this.b.getClass();
                b.a(fVar, jNanoTime);
            }
        } catch (Exception unused) {
        }
        this.f25665a.clear();
    }
}
