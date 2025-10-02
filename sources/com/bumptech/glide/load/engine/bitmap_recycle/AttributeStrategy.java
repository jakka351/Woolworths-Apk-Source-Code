package com.bumptech.glide.load.engine.bitmap_recycle;

import YU.a;
import androidx.annotation.VisibleForTesting;

/* loaded from: classes4.dex */
class AttributeStrategy implements LruPoolStrategy {

    @VisibleForTesting
    public static class Key implements Poolable {

        /* renamed from: a, reason: collision with root package name */
        public final KeyPool f13817a;

        public Key(KeyPool keyPool) {
            this.f13817a = keyPool;
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.Poolable
        public final void a() {
            this.f13817a.c(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof Key;
        }

        public final int hashCode() {
            return (((0 * 31) + 0) * 31) + 0;
        }

        public final String toString() {
            StringBuilder sbQ = a.q(0, 0, "[", "x", "], ");
            sbQ.append((Object) null);
            return sbQ.toString();
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
        return "AttributeStrategy:\n  null";
    }
}
