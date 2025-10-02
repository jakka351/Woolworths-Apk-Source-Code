package com.bumptech.glide.util.pool;

/* loaded from: classes4.dex */
public abstract class StateVerifier {

    public static class DebugStateVerifier extends StateVerifier {
        @Override // com.bumptech.glide.util.pool.StateVerifier
        public final void b(boolean z) {
            if (z) {
                new RuntimeException("Released");
            }
        }

        @Override // com.bumptech.glide.util.pool.StateVerifier
        public final void c() {
            throw null;
        }
    }

    public static class DefaultStateVerifier extends StateVerifier {

        /* renamed from: a, reason: collision with root package name */
        public volatile boolean f13993a;

        @Override // com.bumptech.glide.util.pool.StateVerifier
        public final void b(boolean z) {
            this.f13993a = z;
        }

        @Override // com.bumptech.glide.util.pool.StateVerifier
        public final void c() {
            if (this.f13993a) {
                throw new IllegalStateException("Already released");
            }
        }
    }

    public static StateVerifier a() {
        return new DefaultStateVerifier();
    }

    public abstract void b(boolean z);

    public abstract void c();
}
