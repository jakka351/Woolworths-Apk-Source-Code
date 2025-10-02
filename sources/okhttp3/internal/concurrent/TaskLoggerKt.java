package okhttp3.internal.concurrent;

import android.support.v4.media.session.a;
import java.util.Arrays;
import java.util.logging.Logger;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"okhttp"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TaskLoggerKt {
    public static final void a(Logger logger, Task task, TaskQueue taskQueue, String str) {
        logger.fine(taskQueue.b + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + ": " + task.f26706a);
    }

    public static final String b(long j) {
        String strL;
        if (j <= -999500000) {
            strL = a.l((j - 500000000) / 1000000000, " s ", new StringBuilder());
        } else if (j <= -999500) {
            strL = a.l((j - 500000) / 1000000, " ms", new StringBuilder());
        } else if (j <= 0) {
            strL = a.l((j - 500) / 1000, " µs", new StringBuilder());
        } else if (j < 999500) {
            strL = a.l((j + 500) / 1000, " µs", new StringBuilder());
        } else if (j < 999500000) {
            strL = a.l((j + 500000) / 1000000, " ms", new StringBuilder());
        } else {
            strL = a.l((j + 500000000) / 1000000000, " s ", new StringBuilder());
        }
        return String.format("%6s", Arrays.copyOf(new Object[]{strL}, 1));
    }
}
