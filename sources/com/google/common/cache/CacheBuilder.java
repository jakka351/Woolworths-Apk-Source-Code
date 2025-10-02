package com.google.common.cache;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Ascii;
import com.google.common.base.Equivalence;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.google.common.base.Ticker;
import com.google.common.cache.AbstractCache;
import com.google.common.cache.LocalCache;
import java.util.logging.Level;
import java.util.logging.Logger;

@ElementTypesAreNonnullByDefault
@GwtCompatible
/* loaded from: classes6.dex */
public final class CacheBuilder<K, V> {
    public static final Supplier o = Suppliers.b(new AnonymousClass1());
    public static final Ticker p = new AnonymousClass3();

    /* renamed from: a, reason: collision with root package name */
    public boolean f14873a;
    public int b;
    public long c;
    public long d;
    public Weigher e;
    public LocalCache.Strength f;
    public LocalCache.Strength g;
    public long h;
    public long i;
    public Equivalence j;
    public Equivalence k;
    public RemovalListener l;
    public Ticker m;
    public Supplier n;

    /* renamed from: com.google.common.cache.CacheBuilder$1, reason: invalid class name */
    public class AnonymousClass1 implements AbstractCache.StatsCounter {
        @Override // com.google.common.cache.AbstractCache.StatsCounter
        public final void a() {
        }

        @Override // com.google.common.cache.AbstractCache.StatsCounter
        public final void b(long j) {
        }

        @Override // com.google.common.cache.AbstractCache.StatsCounter
        public final void c() {
        }

        @Override // com.google.common.cache.AbstractCache.StatsCounter
        public final void d(long j) {
        }

        @Override // com.google.common.cache.AbstractCache.StatsCounter
        public final void e() {
        }
    }

    /* renamed from: com.google.common.cache.CacheBuilder$2, reason: invalid class name */
    public class AnonymousClass2 implements Supplier<AbstractCache.StatsCounter> {
        @Override // com.google.common.base.Supplier
        public final Object get() {
            return new AbstractCache.SimpleStatsCounter();
        }
    }

    /* renamed from: com.google.common.cache.CacheBuilder$3, reason: invalid class name */
    public class AnonymousClass3 extends Ticker {
        @Override // com.google.common.base.Ticker
        public final long a() {
            return 0L;
        }
    }

    public static final class LoggerHolder {

        /* renamed from: a, reason: collision with root package name */
        public static final Logger f14874a = Logger.getLogger(CacheBuilder.class.getName());
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class NullListener implements RemovalListener<Object, Object> {
        public static final NullListener d;
        public static final /* synthetic */ NullListener[] e;

        static {
            NullListener nullListener = new NullListener("INSTANCE", 0);
            d = nullListener;
            e = new NullListener[]{nullListener};
        }

        public static NullListener valueOf(String str) {
            return (NullListener) Enum.valueOf(NullListener.class, str);
        }

        public static NullListener[] values() {
            return (NullListener[]) e.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class OneWeigher implements Weigher<Object, Object> {
        public static final OneWeigher d;
        public static final /* synthetic */ OneWeigher[] e;

        static {
            OneWeigher oneWeigher = new OneWeigher("INSTANCE", 0);
            d = oneWeigher;
            e = new OneWeigher[]{oneWeigher};
        }

        public static OneWeigher valueOf(String str) {
            return (OneWeigher) Enum.valueOf(OneWeigher.class, str);
        }

        public static OneWeigher[] values() {
            return (OneWeigher[]) e.clone();
        }
    }

    public static CacheBuilder c() {
        CacheBuilder cacheBuilder = new CacheBuilder();
        cacheBuilder.f14873a = true;
        cacheBuilder.b = -1;
        cacheBuilder.c = -1L;
        cacheBuilder.d = -1L;
        cacheBuilder.h = -1L;
        cacheBuilder.i = -1L;
        cacheBuilder.n = o;
        return cacheBuilder;
    }

    public final LoadingCache a(CacheLoader cacheLoader) {
        b();
        cacheLoader.getClass();
        return new LocalCache.LocalLoadingCache(new LocalCache(this, cacheLoader));
    }

    public final void b() {
        if (this.e == null) {
            Preconditions.q("maximumWeight requires weigher", this.d == -1);
        } else if (this.f14873a) {
            Preconditions.q("weigher requires maximumWeight", this.d != -1);
        } else if (this.d == -1) {
            LoggerHolder.f14874a.log(Level.WARNING, "ignoring weigher specified without maximumWeight");
        }
    }

    public final void d() {
        LocalCache.Strength strength = this.f;
        Preconditions.p("Key strength was already set to %s", strength, strength == null);
        this.f = LocalCache.Strength.e;
    }

    public final String toString() {
        MoreObjects.ToStringHelper toStringHelperB = MoreObjects.b(this);
        int i = this.b;
        if (i != -1) {
            toStringHelperB.a(i, "concurrencyLevel");
        }
        long j = this.c;
        if (j != -1) {
            toStringHelperB.b(j, "maximumSize");
        }
        long j2 = this.d;
        if (j2 != -1) {
            toStringHelperB.b(j2, "maximumWeight");
        }
        if (this.h != -1) {
            toStringHelperB.c(android.support.v4.media.session.a.l(this.h, "ns", new StringBuilder()), "expireAfterWrite");
        }
        if (this.i != -1) {
            toStringHelperB.c(android.support.v4.media.session.a.l(this.i, "ns", new StringBuilder()), "expireAfterAccess");
        }
        LocalCache.Strength strength = this.f;
        if (strength != null) {
            toStringHelperB.c(Ascii.b(strength.toString()), "keyStrength");
        }
        LocalCache.Strength strength2 = this.g;
        if (strength2 != null) {
            toStringHelperB.c(Ascii.b(strength2.toString()), "valueStrength");
        }
        if (this.j != null) {
            toStringHelperB.f("keyEquivalence");
        }
        if (this.k != null) {
            toStringHelperB.f("valueEquivalence");
        }
        if (this.l != null) {
            toStringHelperB.f("removalListener");
        }
        return toStringHelperB.toString();
    }
}
