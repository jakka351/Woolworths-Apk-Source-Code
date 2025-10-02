package androidx.media3.exoplayer.analytics;

import android.media.metrics.LogSessionId;
import androidx.annotation.RequiresApi;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.util.Objects;

@UnstableApi
/* loaded from: classes2.dex */
public final class PlayerId {
    public static final /* synthetic */ int d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final String f3037a;
    public final LogSessionIdApi31 b;
    public final Object c;

    @RequiresApi
    public static final class LogSessionIdApi31 {

        /* renamed from: a, reason: collision with root package name */
        public LogSessionId f3038a;
    }

    static {
        new PlayerId("");
    }

    public PlayerId(String str) {
        LogSessionIdApi31 logSessionIdApi31;
        this.f3037a = str;
        if (Util.f2928a >= 31) {
            logSessionIdApi31 = new LogSessionIdApi31();
            logSessionIdApi31.f3038a = LogSessionId.LOG_SESSION_ID_NONE;
        } else {
            logSessionIdApi31 = null;
        }
        this.b = logSessionIdApi31;
        this.c = new Object();
    }

    public final synchronized LogSessionId a() {
        LogSessionIdApi31 logSessionIdApi31;
        logSessionIdApi31 = this.b;
        logSessionIdApi31.getClass();
        return logSessionIdApi31.f3038a;
    }

    public final synchronized void b(LogSessionId logSessionId) {
        LogSessionIdApi31 logSessionIdApi31 = this.b;
        logSessionIdApi31.getClass();
        LogSessionId logSessionId2 = logSessionIdApi31.f3038a;
        LogSessionId unused = LogSessionId.LOG_SESSION_ID_NONE;
        Assertions.f(logSessionId2.equals(LogSessionId.LOG_SESSION_ID_NONE));
        logSessionIdApi31.f3038a = logSessionId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlayerId)) {
            return false;
        }
        PlayerId playerId = (PlayerId) obj;
        return Objects.equals(this.f3037a, playerId.f3037a) && Objects.equals(this.b, playerId.b) && Objects.equals(this.c, playerId.c);
    }

    public final int hashCode() {
        return Objects.hash(this.f3037a, this.b, this.c);
    }
}
