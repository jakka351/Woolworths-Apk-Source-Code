package com.bumptech.glide.util.pool;

import android.util.Log;
import androidx.core.util.Pools;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class FactoryPools {

    /* renamed from: a, reason: collision with root package name */
    public static final Resetter f13991a = new AnonymousClass1();

    /* renamed from: com.bumptech.glide.util.pool.FactoryPools$1, reason: invalid class name */
    public class AnonymousClass1 implements Resetter<Object> {
        @Override // com.bumptech.glide.util.pool.FactoryPools.Resetter
        public final void a(Object obj) {
        }
    }

    /* renamed from: com.bumptech.glide.util.pool.FactoryPools$2, reason: invalid class name */
    class AnonymousClass2 implements Factory<List<Object>> {
        @Override // com.bumptech.glide.util.pool.FactoryPools.Factory
        public final Object create() {
            return new ArrayList();
        }
    }

    /* renamed from: com.bumptech.glide.util.pool.FactoryPools$3, reason: invalid class name */
    class AnonymousClass3 implements Resetter<List<Object>> {
        @Override // com.bumptech.glide.util.pool.FactoryPools.Resetter
        public final void a(Object obj) {
            ((List) obj).clear();
        }
    }

    public interface Factory<T> {
        Object create();
    }

    public static final class FactoryPool<T> implements Pools.Pool<T> {

        /* renamed from: a, reason: collision with root package name */
        public final Factory f13992a;
        public final Resetter b;
        public final Pools.SynchronizedPool c;

        public FactoryPool(Pools.SynchronizedPool synchronizedPool, Factory factory, Resetter resetter) {
            this.c = synchronizedPool;
            this.f13992a = factory;
            this.b = resetter;
        }

        @Override // androidx.core.util.Pools.Pool
        public final Object a() {
            Object objA = this.c.a();
            if (objA == null) {
                objA = this.f13992a.create();
                if (Log.isLoggable("FactoryPools", 2)) {
                    Log.v("FactoryPools", "Created new " + objA.getClass());
                }
            }
            if (objA instanceof Poolable) {
                ((Poolable) objA).c().b(false);
            }
            return objA;
        }

        @Override // androidx.core.util.Pools.Pool
        public final boolean b(Object obj) {
            if (obj instanceof Poolable) {
                ((Poolable) obj).c().b(true);
            }
            this.b.a(obj);
            return this.c.b(obj);
        }
    }

    /* loaded from: classes4.dex */
    public interface Poolable {
        StateVerifier c();
    }

    public interface Resetter<T> {
        void a(Object obj);
    }

    public static Pools.Pool a(int i, Factory factory) {
        return new FactoryPool(new Pools.SynchronizedPool(i), factory, f13991a);
    }

    public static Pools.Pool b() {
        return new FactoryPool(new Pools.SynchronizedPool(20), new AnonymousClass2(), new AnonymousClass3());
    }
}
