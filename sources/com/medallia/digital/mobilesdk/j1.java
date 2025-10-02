package com.medallia.digital.mobilesdk;

/* loaded from: classes6.dex */
final class j1 {
    protected static final int d = -1;
    private static final long e = 5000;
    protected static final j1 f = new b().a((Long) 5000L).a();

    /* renamed from: a, reason: collision with root package name */
    final long f16534a;
    final c b;
    final boolean c;

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private long f16535a = 5000;
        private c b = c.TOP;
        private boolean c = false;

        public b a(c cVar) {
            this.b = cVar;
            return this;
        }

        public b a(Long l) {
            if (l != null) {
                this.f16535a = l.longValue();
            }
            return this;
        }

        public b a(boolean z) {
            this.c = z;
            return this;
        }

        public j1 a() {
            return new j1(this);
        }
    }

    public enum c {
        TOP,
        BOTTOM;

        public static c getPosition(String str) {
            if (str != null) {
                c cVar = BOTTOM;
                if (str.equalsIgnoreCase(cVar.toString())) {
                    return cVar;
                }
            }
            return TOP;
        }
    }

    private j1(b bVar) {
        this.f16534a = bVar.f16535a;
        this.b = bVar.b;
        this.c = bVar.c;
    }

    public String toString() {
        return androidx.camera.core.impl.b.q(new StringBuilder("DefaultBannerConfigurations{durationInMilliseconds="), this.f16534a, '}');
    }
}
