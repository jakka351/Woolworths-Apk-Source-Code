package com.bumptech.glide.load.engine.bitmap_recycle;

import YU.a;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;

@RequiresApi
/* loaded from: classes4.dex */
final class SizeStrategy implements LruPoolStrategy {

    @VisibleForTesting
    public static final class Key implements Poolable {

        /* renamed from: a, reason: collision with root package name */
        public final KeyPool f13827a;

        public Key(KeyPool keyPool) {
            this.f13827a = keyPool;
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.Poolable
        public final void a() {
            this.f13827a.c(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof Key;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return a.e(0, "[", "]");
        }
    }

    @VisibleForTesting
    public static class KeyPool extends BaseKeyPool<Key> {
        @Override // com.bumptech.glide.load.engine.bitmap_recycle.BaseKeyPool
        public final Poolable a() {
            return new Key(this);
        }
    }

    public final String toString() {
        return "SizeStrategy:\n  null\n  SortedSizesnull";
    }
}
