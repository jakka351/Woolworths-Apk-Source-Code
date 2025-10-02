package com.google.common.cache;

import com.google.common.annotations.GwtCompatible;

@ElementTypesAreNonnullByDefault
@GwtCompatible
/* loaded from: classes6.dex */
public abstract class AbstractCache<K, V> implements Cache<K, V> {

    public static final class SimpleStatsCounter implements StatsCounter {

        /* renamed from: a, reason: collision with root package name */
        public final LongAddable f14872a = LongAddables.a();
        public final LongAddable b = LongAddables.a();
        public final LongAddable c = LongAddables.a();
        public final LongAddable d = LongAddables.a();
        public final LongAddable e = LongAddables.a();
        public final LongAddable f = LongAddables.a();

        @Override // com.google.common.cache.AbstractCache.StatsCounter
        public final void a() {
            this.f.a();
        }

        @Override // com.google.common.cache.AbstractCache.StatsCounter
        public final void b(long j) {
            this.c.a();
            this.e.add(j);
        }

        @Override // com.google.common.cache.AbstractCache.StatsCounter
        public final void c() {
            this.b.add(1);
        }

        @Override // com.google.common.cache.AbstractCache.StatsCounter
        public final void d(long j) {
            this.d.a();
            this.e.add(j);
        }

        @Override // com.google.common.cache.AbstractCache.StatsCounter
        public final void e() {
            this.f14872a.add(1);
        }
    }

    public interface StatsCounter {
        void a();

        void b(long j);

        void c();

        void d(long j);

        void e();
    }
}
