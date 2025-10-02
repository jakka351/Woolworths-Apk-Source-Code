package com.bumptech.glide.load.engine.bitmap_recycle;

import com.bumptech.glide.load.engine.bitmap_recycle.Poolable;
import com.bumptech.glide.util.Util;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
abstract class BaseKeyPool<T extends Poolable> {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayDeque f13818a;

    public BaseKeyPool() {
        char[] cArr = Util.f13989a;
        this.f13818a = new ArrayDeque(20);
    }

    public abstract Poolable a();

    public final Poolable b() {
        Poolable poolable = (Poolable) this.f13818a.poll();
        return poolable == null ? a() : poolable;
    }

    public final void c(Poolable poolable) {
        ArrayDeque arrayDeque = this.f13818a;
        if (arrayDeque.size() < 20) {
            arrayDeque.offer(poolable);
        }
    }
}
