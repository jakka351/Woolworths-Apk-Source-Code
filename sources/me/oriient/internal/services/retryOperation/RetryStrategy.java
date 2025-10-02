package me.oriient.internal.services.retryOperation;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Keep
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J%\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H ¢\u0006\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lme/oriient/internal/services/retryOperation/RetryStrategy;", "", "(Ljava/lang/String;I)V", "calculateDelay", "", "tryNumber", "", "initialIntervalMilli", "maxIntervalMilli", "calculateDelay$internal_publishRelease", "CONSTANT", "LINEAR", "EXPONENTIAL", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class RetryStrategy {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ RetryStrategy[] $VALUES;
    public static final RetryStrategy CONSTANT = new RetryStrategy() { // from class: me.oriient.internal.services.retryOperation.e
        @Override // me.oriient.internal.services.retryOperation.RetryStrategy
        public final long calculateDelay$internal_publishRelease(int i, long j, long j2) {
            return j > j2 ? j2 : j;
        }
    };
    public static final RetryStrategy LINEAR = new RetryStrategy() { // from class: me.oriient.internal.services.retryOperation.g
        @Override // me.oriient.internal.services.retryOperation.RetryStrategy
        public final long calculateDelay$internal_publishRelease(int i, long j, long j2) {
            long j3 = j * i;
            return j3 > j2 ? j2 : j3;
        }
    };
    public static final RetryStrategy EXPONENTIAL = new RetryStrategy() { // from class: me.oriient.internal.services.retryOperation.f
        @Override // me.oriient.internal.services.retryOperation.RetryStrategy
        public final long calculateDelay$internal_publishRelease(int i, long j, long j2) {
            long jPow = j * ((long) Math.pow(2.0d, i));
            return jPow > j2 ? j2 : jPow;
        }
    };

    private static final /* synthetic */ RetryStrategy[] $values() {
        return new RetryStrategy[]{CONSTANT, LINEAR, EXPONENTIAL};
    }

    static {
        RetryStrategy[] retryStrategyArr$values = $values();
        $VALUES = retryStrategyArr$values;
        $ENTRIES = EnumEntriesKt.a(retryStrategyArr$values);
    }

    public /* synthetic */ RetryStrategy(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i);
    }

    @NotNull
    public static EnumEntries<RetryStrategy> getEntries() {
        return $ENTRIES;
    }

    public static RetryStrategy valueOf(String str) {
        return (RetryStrategy) Enum.valueOf(RetryStrategy.class, str);
    }

    public static RetryStrategy[] values() {
        return (RetryStrategy[]) $VALUES.clone();
    }

    public abstract long calculateDelay$internal_publishRelease(int tryNumber, long initialIntervalMilli, long maxIntervalMilli);

    private RetryStrategy(String str, int i) {
    }
}
