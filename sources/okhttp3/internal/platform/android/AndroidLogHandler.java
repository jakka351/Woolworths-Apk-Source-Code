package okhttp3.internal.platform.android;

import java.util.logging.Handler;
import java.util.logging.LogRecord;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/internal/platform/android/AndroidLogHandler;", "Ljava/util/logging/Handler;", "<init>", "()V", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidLogHandler extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public static final AndroidLogHandler f26756a = new AndroidLogHandler();

    private AndroidLogHandler() {
    }

    @Override // java.util.logging.Handler
    public final void close() {
    }

    @Override // java.util.logging.Handler
    public final void flush() {
    }

    @Override // java.util.logging.Handler
    public final void publish(LogRecord record) {
        Intrinsics.h(record, "record");
        AndroidLog androidLog = AndroidLog.f26755a;
        String loggerName = record.getLoggerName();
        Intrinsics.g(loggerName, "getLoggerName(...)");
        int iA = AndroidLogKt.a(record);
        String message = record.getMessage();
        Intrinsics.g(message, "getMessage(...)");
        Throwable thrown = record.getThrown();
        androidLog.getClass();
        AndroidLog.a(iA, loggerName, message, thrown);
    }
}
