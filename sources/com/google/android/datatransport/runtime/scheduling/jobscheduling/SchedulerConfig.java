package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AutoValue_SchedulerConfig_ConfigValue;
import com.google.android.datatransport.runtime.time.Clock;
import com.google.auto.value.AutoValue;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@AutoValue
/* loaded from: classes.dex */
public abstract class SchedulerConfig {

    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        public Clock f14475a;
        public HashMap b;
    }

    @AutoValue
    public static abstract class ConfigValue {

        @AutoValue.Builder
        public static abstract class Builder {
        }

        public abstract long a();

        public abstract Set b();

        public abstract long c();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Flag {
        public static final Flag d;
        public static final Flag e;
        public static final Flag f;
        public static final /* synthetic */ Flag[] g;

        static {
            Flag flag = new Flag("NETWORK_UNMETERED", 0);
            d = flag;
            Flag flag2 = new Flag("DEVICE_IDLE", 1);
            e = flag2;
            Flag flag3 = new Flag("DEVICE_CHARGING", 2);
            f = flag3;
            g = new Flag[]{flag, flag2, flag3};
        }

        public static Flag valueOf(String str) {
            return (Flag) Enum.valueOf(Flag.class, str);
        }

        public static Flag[] values() {
            return (Flag[]) g.clone();
        }
    }

    public static SchedulerConfig b(Clock clock) {
        Builder builder = new Builder();
        builder.b = new HashMap();
        AutoValue_SchedulerConfig_ConfigValue.Builder builder2 = new AutoValue_SchedulerConfig_ConfigValue.Builder();
        Set set = Collections.EMPTY_SET;
        if (set == null) {
            throw new NullPointerException("Null flags");
        }
        builder2.c = set;
        builder2.f14473a = 30000L;
        builder2.b = 86400000L;
        builder.b.put(Priority.d, builder2.a());
        AutoValue_SchedulerConfig_ConfigValue.Builder builder3 = new AutoValue_SchedulerConfig_ConfigValue.Builder();
        if (set == null) {
            throw new NullPointerException("Null flags");
        }
        builder3.c = set;
        builder3.f14473a = 1000L;
        builder3.b = 86400000L;
        builder.b.put(Priority.f, builder3.a());
        AutoValue_SchedulerConfig_ConfigValue.Builder builder4 = new AutoValue_SchedulerConfig_ConfigValue.Builder();
        if (set == null) {
            throw new NullPointerException("Null flags");
        }
        builder4.c = set;
        builder4.f14473a = 86400000L;
        builder4.b = 86400000L;
        Set setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(Flag.e)));
        if (setUnmodifiableSet == null) {
            throw new NullPointerException("Null flags");
        }
        builder4.c = setUnmodifiableSet;
        builder.b.put(Priority.e, builder4.a());
        builder.f14475a = clock;
        if (clock == null) {
            throw new NullPointerException("missing required property: clock");
        }
        if (builder.b.keySet().size() < Priority.values().length) {
            throw new IllegalStateException("Not all priorities have been configured");
        }
        HashMap map = builder.b;
        builder.b = new HashMap();
        return new AutoValue_SchedulerConfig(builder.f14475a, map);
    }

    public abstract Clock a();

    public final long c(Priority priority, long j, int i) {
        long jA = j - a().a();
        ConfigValue configValue = (ConfigValue) d().get(priority);
        long jA2 = configValue.a();
        return Math.min(Math.max((long) (Math.pow(3.0d, i - 1) * jA2 * Math.max(1.0d, Math.log(10000.0d) / Math.log((jA2 > 1 ? jA2 : 2L) * r12))), jA), configValue.c());
    }

    public abstract Map d();
}
