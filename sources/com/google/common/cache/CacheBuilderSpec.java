package com.google.common.cache;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Splitter;
import com.google.common.cache.LocalCache;
import com.google.common.collect.ImmutableMap;
import java.util.Arrays;

@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* loaded from: classes6.dex */
public final class CacheBuilderSpec {

    /* renamed from: com.google.common.cache.CacheBuilderSpec$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14875a;

        static {
            int[] iArr = new int[LocalCache.Strength.values().length];
            f14875a = iArr;
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14875a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static class AccessDurationParser extends DurationParser {
    }

    public static class ConcurrencyLevelParser extends IntegerParser {
    }

    public static abstract class DurationParser implements ValueParser {
    }

    public static class InitialCapacityParser extends IntegerParser {
    }

    public static abstract class IntegerParser implements ValueParser {
    }

    public static class KeyStrengthParser implements ValueParser {
    }

    public static abstract class LongParser implements ValueParser {
    }

    public static class MaximumSizeParser extends LongParser {
    }

    public static class MaximumWeightParser extends LongParser {
    }

    public static class RecordStatsParser implements ValueParser {
    }

    public static class RefreshDurationParser extends DurationParser {
    }

    public interface ValueParser {
    }

    public static class ValueStrengthParser implements ValueParser {
    }

    public static class WriteDurationParser extends DurationParser {
    }

    static {
        Splitter.a(',').d();
        Splitter.a('=').d();
        ImmutableMap.Builder builderA = ImmutableMap.a();
        builderA.c("initialCapacity", new InitialCapacityParser());
        builderA.c("maximumSize", new MaximumSizeParser());
        builderA.c("maximumWeight", new MaximumWeightParser());
        builderA.c("concurrencyLevel", new ConcurrencyLevelParser());
        builderA.c("weakKeys", new KeyStrengthParser());
        builderA.c("softValues", new ValueStrengthParser());
        builderA.c("weakValues", new ValueStrengthParser());
        builderA.c("recordStats", new RecordStatsParser());
        builderA.c("expireAfterAccess", new AccessDurationParser());
        builderA.c("expireAfterWrite", new WriteDurationParser());
        builderA.c("refreshAfterWrite", new RefreshDurationParser());
        builderA.c("refreshInterval", new RefreshDurationParser());
        builderA.a(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CacheBuilderSpec) && Objects.a(null, null) && Objects.a(null, null) && Objects.a(null, null) && Objects.a(null, null) && Objects.a(null, null) && Objects.a(null, null) && Objects.a(null, null) && Objects.a(null, null) && Objects.a(null, null) && Objects.a(null, null);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, null, null, null, null, null, null, null, null, null});
    }

    public final String toString() {
        MoreObjects.ToStringHelper toStringHelperB = MoreObjects.b(this);
        toStringHelperB.f(null);
        return toStringHelperB.toString();
    }
}
