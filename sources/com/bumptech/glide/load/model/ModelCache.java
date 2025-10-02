package com.bumptech.glide.load.model;

import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.util.LruCache;
import com.bumptech.glide.util.Util;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public class ModelCache<A, B> {

    /* renamed from: a, reason: collision with root package name */
    public final LruCache f13860a = new AnonymousClass1(500);

    /* renamed from: com.bumptech.glide.load.model.ModelCache$1, reason: invalid class name */
    class AnonymousClass1 extends LruCache<ModelKey<Object>, Object> {
        @Override // com.bumptech.glide.util.LruCache
        public final void i(Object obj, Object obj2) {
            ((ModelKey) obj).b();
        }
    }

    @VisibleForTesting
    /* loaded from: classes4.dex */
    public static final class ModelKey<A> {
        public static final ArrayDeque b;

        /* renamed from: a, reason: collision with root package name */
        public Object f13861a;

        static {
            char[] cArr = Util.f13989a;
            b = new ArrayDeque(0);
        }

        public static ModelKey a(Object obj) {
            ModelKey modelKey;
            ArrayDeque arrayDeque = b;
            synchronized (arrayDeque) {
                modelKey = (ModelKey) arrayDeque.poll();
            }
            if (modelKey == null) {
                modelKey = new ModelKey();
            }
            modelKey.f13861a = obj;
            return modelKey;
        }

        public final void b() {
            ArrayDeque arrayDeque = b;
            synchronized (arrayDeque) {
                arrayDeque.offer(this);
            }
        }

        public final boolean equals(Object obj) {
            return (obj instanceof ModelKey) && this.f13861a.equals(((ModelKey) obj).f13861a);
        }

        public final int hashCode() {
            return this.f13861a.hashCode();
        }
    }

    public final Object a(Object obj) {
        ModelKey modelKeyA = ModelKey.a(obj);
        Object objG = this.f13860a.g(modelKeyA);
        modelKeyA.b();
        return objG;
    }

    public final void b(Object obj, Object obj2) {
        this.f13860a.j(ModelKey.a(obj), obj2);
    }
}
