package io.grpc.internal;

import com.google.common.annotations.VisibleForTesting;
import java.util.concurrent.TimeUnit;

/* loaded from: classes7.dex */
public final class KeepAliveEnforcer {

    @VisibleForTesting
    public static class SystemTicker implements Ticker {
    }

    @VisibleForTesting
    public interface Ticker {
    }

    static {
        TimeUnit.HOURS.toNanos(2L);
    }
}
