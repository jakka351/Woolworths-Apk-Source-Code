package com.medallia.digital.mobilesdk;

/* loaded from: classes6.dex */
class i6 {

    /* renamed from: a, reason: collision with root package name */
    private final int f16527a;
    private final a b;

    public enum a {
        NO_CONNECTION,
        TIMEOUT,
        OTHER;

        public static a a(int i) {
            return (i == 408 || i == 504 || i == -46) ? TIMEOUT : i == -45 ? NO_CONNECTION : OTHER;
        }
    }

    public i6(int i) {
        this.f16527a = i;
        this.b = a.a(i);
    }

    public a a() {
        return this.b;
    }

    public int b() {
        return this.f16527a;
    }
}
