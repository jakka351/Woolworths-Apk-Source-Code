package com.dynatrace.android.agent.conf;

import androidx.camera.core.impl.b;

/* loaded from: classes.dex */
public final class ReplayConfiguration {
    public static final ReplayConfiguration i;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f14097a;
    public final boolean b;
    public final boolean c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final boolean h;

    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        public boolean f14098a;
        public boolean b;
        public boolean c;
        public int d;
        public int e;
        public int f;
        public int g;
        public boolean h;
    }

    static {
        Builder builder = new Builder();
        builder.f14098a = false;
        builder.b = false;
        builder.c = false;
        builder.d = 0;
        builder.e = 0;
        builder.f = 1;
        builder.g = 0;
        builder.h = false;
        i = new ReplayConfiguration(builder);
    }

    public ReplayConfiguration(Builder builder) {
        this.f14097a = builder.f14098a;
        this.b = builder.b;
        this.c = builder.c;
        this.d = builder.d;
        this.e = builder.e;
        this.f = builder.f;
        this.g = builder.g;
        this.h = builder.h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ReplayConfiguration.class != obj.getClass()) {
            return false;
        }
        ReplayConfiguration replayConfiguration = (ReplayConfiguration) obj;
        return this.f14097a == replayConfiguration.f14097a && this.b == replayConfiguration.b && this.e == replayConfiguration.e && this.c == replayConfiguration.c && this.f == replayConfiguration.f && this.g == replayConfiguration.g && this.d == replayConfiguration.d && this.h == replayConfiguration.h;
    }

    public final int hashCode() {
        int i2 = (((((((this.f14097a ? 1 : 0) * 31) + (this.b ? 1 : 0)) * 31) + (this.c ? 1 : 0)) * 31) + this.d) * 31;
        int i3 = this.e;
        return ((((((i2 + (i3 ^ (i3 >>> 32))) * 31) + this.f) * 31) + this.g) * 31) + (this.h ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReplayConfiguration{capture=");
        sb.append(this.f14097a);
        sb.append(", fullSessionConfigReceived=");
        sb.append(this.b);
        sb.append(", crashesEnabled=");
        sb.append(this.c);
        sb.append(", trafficControlPercentage=");
        sb.append(this.d);
        sb.append(", retentionTime=");
        sb.append(this.e);
        sb.append(", protocolVersion=");
        sb.append(this.f);
        sb.append(", selfMonitoring=");
        sb.append(this.g);
        sb.append(", pixelCopy=");
        return b.s(sb, this.h, '}');
    }
}
