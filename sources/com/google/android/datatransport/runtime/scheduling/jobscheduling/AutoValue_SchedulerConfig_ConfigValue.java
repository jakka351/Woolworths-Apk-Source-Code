package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import java.util.Set;

/* loaded from: classes.dex */
final class AutoValue_SchedulerConfig_ConfigValue extends SchedulerConfig.ConfigValue {

    /* renamed from: a, reason: collision with root package name */
    public final long f14472a;
    public final long b;
    public final Set c;

    public static final class Builder extends SchedulerConfig.ConfigValue.Builder {

        /* renamed from: a, reason: collision with root package name */
        public Long f14473a;
        public Long b;
        public Set c;

        public final SchedulerConfig.ConfigValue a() {
            String strG = this.f14473a == null ? " delta" : "";
            if (this.b == null) {
                strG = strG.concat(" maxAllowedDelay");
            }
            if (this.c == null) {
                strG = YU.a.g(strG, " flags");
            }
            if (strG.isEmpty()) {
                return new AutoValue_SchedulerConfig_ConfigValue(this.f14473a.longValue(), this.b.longValue(), this.c);
            }
            throw new IllegalStateException("Missing required properties:".concat(strG));
        }
    }

    public AutoValue_SchedulerConfig_ConfigValue(long j, long j2, Set set) {
        this.f14472a = j;
        this.b = j2;
        this.c = set;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue
    public final long a() {
        return this.f14472a;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue
    public final Set b() {
        return this.c;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue
    public final long c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SchedulerConfig.ConfigValue)) {
            return false;
        }
        SchedulerConfig.ConfigValue configValue = (SchedulerConfig.ConfigValue) obj;
        return this.f14472a == configValue.a() && this.b == configValue.c() && this.c.equals(configValue.b());
    }

    public final int hashCode() {
        long j = this.f14472a;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        long j2 = this.b;
        return ((i ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f14472a + ", maxAllowedDelay=" + this.b + ", flags=" + this.c + "}";
    }
}
