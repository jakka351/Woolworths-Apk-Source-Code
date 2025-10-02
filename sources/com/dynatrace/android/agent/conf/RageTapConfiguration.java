package com.dynatrace.android.agent.conf;

import YU.a;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nlnlnnn;

/* loaded from: classes.dex */
public final class RageTapConfiguration {
    public static final RageTapConfiguration e;

    /* renamed from: a, reason: collision with root package name */
    public final int f14095a;
    public final int b;
    public final int c;
    public final int d;

    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        public int f14096a;
        public int b;
        public int c;
        public int d;
    }

    static {
        Builder builder = new Builder();
        builder.f14096a = 100;
        builder.b = 100;
        builder.c = nlnlnnn.xxx00780078x0078;
        builder.d = 3;
        e = new RageTapConfiguration(builder);
    }

    public RageTapConfiguration(Builder builder) {
        this.f14095a = builder.f14096a;
        this.b = builder.b;
        this.c = builder.c;
        this.d = builder.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && RageTapConfiguration.class == obj.getClass()) {
            RageTapConfiguration rageTapConfiguration = (RageTapConfiguration) obj;
            if (this.f14095a == rageTapConfiguration.f14095a && this.b == rageTapConfiguration.b && this.c == rageTapConfiguration.c && this.d == rageTapConfiguration.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f14095a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RageTapConfiguration{tapDuration=");
        sb.append(this.f14095a);
        sb.append(", dispersionRadius=");
        sb.append(this.b);
        sb.append(", timespanDifference=");
        sb.append(this.c);
        sb.append(", minimumNumberOfTaps=");
        return a.l(sb, this.d, '}');
    }
}
