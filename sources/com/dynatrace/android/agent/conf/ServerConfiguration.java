package com.dynatrace.android.agent.conf;

import androidx.camera.core.impl.b;
import com.dynatrace.android.agent.conf.ReplayConfiguration;

/* loaded from: classes.dex */
public class ServerConfiguration {

    /* renamed from: a, reason: collision with root package name */
    public final int f14099a;
    public final boolean b;
    public final SessionSplitConfiguration c;
    public final int d;
    public final int e;
    public final RageTapConfiguration f;
    public final int g;
    public final int h;
    public final boolean i;
    public final ReplayConfiguration j;
    public final int k;
    public final int l;
    public final boolean m;
    public final Status n;
    public final long o;

    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        public int f14100a = 150;
        public boolean b = true;
        public SessionSplitConfiguration c = SessionSplitConfiguration.c;
        public int d = 120;
        public int e = 0;
        public RageTapConfiguration f = RageTapConfiguration.e;
        public int g = 1;
        public int h = 100;
        public boolean i = false;
        public ReplayConfiguration j = ReplayConfiguration.i;
        public int k = 1;
        public int l = 1;
        public boolean m = false;
        public Status n = Status.d;
        public long o = 0;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Status {
        public static final Status d;
        public static final Status e;
        public static final /* synthetic */ Status[] f;

        static {
            Status status = new Status("OK", 0);
            d = status;
            Status status2 = new Status("ERROR", 1);
            e = status2;
            f = new Status[]{status, status2};
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) f.clone();
        }
    }

    public ServerConfiguration(Builder builder) {
        this.f14099a = builder.f14100a;
        this.b = builder.b;
        this.c = builder.c;
        this.d = builder.d;
        this.e = builder.e;
        this.f = builder.f;
        this.g = builder.g;
        this.h = builder.h;
        this.j = builder.j;
        this.i = builder.i;
        this.k = builder.k;
        this.l = builder.l;
        this.m = builder.m;
        this.o = builder.o;
        this.n = builder.n;
    }

    public final boolean a() {
        return this.e > 0;
    }

    public final Builder b(boolean z) {
        Builder builder = new Builder();
        builder.f14100a = this.f14099a;
        builder.b = this.b;
        builder.c = this.c;
        builder.d = this.d;
        builder.e = this.e;
        builder.f = this.f;
        builder.g = this.g;
        builder.h = this.h;
        builder.i = this.i;
        ReplayConfiguration.Builder builder2 = new ReplayConfiguration.Builder();
        ReplayConfiguration replayConfiguration = this.j;
        builder2.f14098a = replayConfiguration.f14097a;
        builder2.b = replayConfiguration.b;
        builder2.c = replayConfiguration.c;
        builder2.d = replayConfiguration.d;
        builder2.e = replayConfiguration.e;
        builder2.f = replayConfiguration.f;
        builder2.g = replayConfiguration.g;
        builder2.h = replayConfiguration.h;
        builder.j = new ReplayConfiguration(builder2);
        builder.o = this.o;
        if (z) {
            builder.k = 1;
            builder.l = 1;
            builder.m = false;
            builder.n = Status.d;
            return builder;
        }
        builder.k = this.k;
        builder.l = this.l;
        builder.m = this.m;
        builder.n = this.n;
        return builder;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ServerConfiguration serverConfiguration = (ServerConfiguration) obj;
            if (this.f14099a == serverConfiguration.f14099a && this.b == serverConfiguration.b && this.c.equals(serverConfiguration.c) && this.d == serverConfiguration.d && this.e == serverConfiguration.e && this.f.equals(serverConfiguration.f) && this.g == serverConfiguration.g && this.h == serverConfiguration.h && this.i == serverConfiguration.i && this.j.equals(serverConfiguration.j) && this.k == serverConfiguration.k && this.l == serverConfiguration.l && this.m == serverConfiguration.m && this.o == serverConfiguration.o && this.n == serverConfiguration.n) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.n.hashCode() + ((((((((this.j.hashCode() + ((((((((this.f.hashCode() + ((((((this.c.hashCode() + (((this.f14099a * 31) + (this.b ? 1 : 0)) * 31)) * 31) + this.d) * 31) + this.e) * 31)) * 31) + this.g) * 31) + this.h) * 31) + (this.i ? 1 : 0)) * 31)) * 31) + this.k) * 31) + this.l) * 31) + (this.m ? 1 : 0)) * 31)) * 31;
        long j = this.o;
        return iHashCode + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ServerConfiguration{maxBeaconSizeKb=");
        sb.append(this.f14099a);
        sb.append(", selfmonitoring=");
        sb.append(this.b);
        sb.append(", sessionSplitConfiguration=");
        sb.append(this.c);
        sb.append(", sendIntervalSec=");
        sb.append(this.d);
        sb.append(", maxCachedCrashesCount=");
        sb.append(this.e);
        sb.append(", rageTapConfiguration=");
        sb.append(this.f);
        sb.append(", capture=");
        sb.append(this.g);
        sb.append(", trafficControlPercentage=");
        sb.append(this.h);
        sb.append(", bp4Enabled=");
        sb.append(this.i);
        sb.append(", replayConfiguration=");
        sb.append(this.j);
        sb.append(", multiplicity=");
        sb.append(this.k);
        sb.append(", serverId=");
        sb.append(this.l);
        sb.append(", switchServer=");
        sb.append(this.m);
        sb.append(", status=");
        sb.append(this.n);
        sb.append(", timestamp=");
        return b.q(sb, this.o, '}');
    }
}
