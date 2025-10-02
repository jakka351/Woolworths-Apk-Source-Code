package com.dynatrace.android.agent.conf;

import YU.a;

/* loaded from: classes.dex */
public final class SessionSplitConfiguration {
    public static final SessionSplitConfiguration c;

    /* renamed from: a, reason: collision with root package name */
    public final int f14102a;
    public final int b;

    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        public int f14103a;
        public int b;
    }

    static {
        Builder builder = new Builder();
        builder.f14103a = 360;
        builder.b = 600;
        c = new SessionSplitConfiguration(builder);
    }

    public SessionSplitConfiguration(Builder builder) {
        this.f14102a = builder.f14103a;
        this.b = builder.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && SessionSplitConfiguration.class == obj.getClass()) {
            SessionSplitConfiguration sessionSplitConfiguration = (SessionSplitConfiguration) obj;
            if (this.f14102a == sessionSplitConfiguration.f14102a && this.b == sessionSplitConfiguration.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f14102a * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SessionSplitConfiguration{maxSessionDuration=");
        sb.append(this.f14102a);
        sb.append(", inactivityTimeout=");
        return a.l(sb, this.b, '}');
    }
}
