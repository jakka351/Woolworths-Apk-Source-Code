package com.scandit.datacapture.core.ui.animation;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes6.dex */
final class d {
    public static final ThreadLocal g = new ThreadLocal();
    private AnimationHandler$AnimationFrameCallbackProvider d;

    /* renamed from: a, reason: collision with root package name */
    private final HashMap f18891a = new HashMap();
    private final ArrayList b = new ArrayList();
    private final a c = new a(this);
    private long e = 0;
    private boolean f = false;

    public static void b(d dVar, long j) {
        dVar.getClass();
        long jUptimeMillis = SystemClock.uptimeMillis();
        for (int i = 0; i < dVar.b.size(); i++) {
            b bVar = (b) dVar.b.get(i);
            if (bVar != null) {
                Long l = (Long) dVar.f18891a.get(bVar);
                if (l == null) {
                    bVar.doAnimationFrame(j);
                } else if (l.longValue() < jUptimeMillis) {
                    dVar.f18891a.remove(bVar);
                    bVar.doAnimationFrame(j);
                }
            }
        }
        if (dVar.f) {
            for (int size = dVar.b.size() - 1; size >= 0; size--) {
                if (dVar.b.get(size) == null) {
                    dVar.b.remove(size);
                }
            }
            dVar.f = false;
        }
    }

    public static AnimationHandler$AnimationFrameCallbackProvider c(d dVar) {
        if (dVar.d == null) {
            dVar.d = new c(dVar.c);
        }
        return dVar.d;
    }

    public final void a(b bVar) {
        if (this.b.size() == 0) {
            if (this.d == null) {
                this.d = new c(this.c);
            }
            this.d.a();
        }
        if (this.b.contains(bVar)) {
            return;
        }
        this.b.add(bVar);
    }

    public final void b(b bVar) {
        this.f18891a.remove(bVar);
        int iIndexOf = this.b.indexOf(bVar);
        if (iIndexOf >= 0) {
            this.b.set(iIndexOf, null);
            this.f = true;
        }
    }
}
