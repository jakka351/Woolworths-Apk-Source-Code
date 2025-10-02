package androidx.core.util;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Landroidx/core/util/Pools;", "", "Pool", "SimplePool", "SynchronizedPool", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class Pools {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Landroidx/core/util/Pools$Pool;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public interface Pool<T> {
        Object a();

        boolean b(Object obj);
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Landroidx/core/util/Pools$SimplePool;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/core/util/Pools$Pool;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension
    /* loaded from: classes.dex */
    public static class SimplePool<T> implements Pool<T> {

        /* renamed from: a, reason: collision with root package name */
        public final Object[] f2464a;
        public int b;

        public SimplePool(int i) {
            if (i <= 0) {
                throw new IllegalArgumentException("The max pool size must be > 0");
            }
            this.f2464a = new Object[i];
        }

        @Override // androidx.core.util.Pools.Pool
        public Object a() {
            int i = this.b;
            if (i <= 0) {
                return null;
            }
            int i2 = i - 1;
            Object[] objArr = this.f2464a;
            Object obj = objArr[i2];
            Intrinsics.f(obj, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
            objArr[i2] = null;
            this.b--;
            return obj;
        }

        @Override // androidx.core.util.Pools.Pool
        public boolean b(Object instance) {
            Object[] objArr;
            boolean z;
            Intrinsics.h(instance, "instance");
            int i = this.b;
            int i2 = 0;
            while (true) {
                objArr = this.f2464a;
                if (i2 >= i) {
                    z = false;
                    break;
                }
                if (objArr[i2] == instance) {
                    z = true;
                    break;
                }
                i2++;
            }
            if (z) {
                throw new IllegalStateException("Already in the pool!");
            }
            int i3 = this.b;
            if (i3 >= objArr.length) {
                return false;
            }
            objArr[i3] = instance;
            this.b = i3 + 1;
            return true;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Landroidx/core/util/Pools$SynchronizedPool;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/core/util/Pools$SimplePool;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static class SynchronizedPool<T> extends SimplePool<T> {
        public final Object c;

        public SynchronizedPool(int i) {
            super(i);
            this.c = new Object();
        }

        @Override // androidx.core.util.Pools.SimplePool, androidx.core.util.Pools.Pool
        public final Object a() {
            Object objA;
            synchronized (this.c) {
                objA = super.a();
            }
            return objA;
        }

        @Override // androidx.core.util.Pools.SimplePool, androidx.core.util.Pools.Pool
        public final boolean b(Object instance) {
            boolean zB;
            Intrinsics.h(instance, "instance");
            synchronized (this.c) {
                zB = super.b(instance);
            }
            return zB;
        }
    }
}
