package io.grpc.internal;

import com.google.common.base.Preconditions;
import io.grpc.ChannelLogger;
import io.grpc.InternalChannelz;
import io.grpc.InternalLogId;
import io.grpc.internal.ChannelTracer;
import java.text.MessageFormat;
import java.util.Collection;
import java.util.logging.Level;

/* loaded from: classes7.dex */
final class ChannelLoggerImpl extends ChannelLogger {

    /* renamed from: a, reason: collision with root package name */
    public final ChannelTracer f23992a;
    public final TimeProvider b;

    /* renamed from: io.grpc.internal.ChannelLoggerImpl$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f23993a;

        static {
            int[] iArr = new int[ChannelLogger.ChannelLogLevel.values().length];
            f23993a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23993a[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23993a[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public ChannelLoggerImpl(ChannelTracer channelTracer, TimeProvider timeProvider) {
        this.f23992a = channelTracer;
        Preconditions.j(timeProvider, "time");
        this.b = timeProvider;
    }

    public static Level d(ChannelLogger.ChannelLogLevel channelLogLevel) {
        int iOrdinal = channelLogLevel.ordinal();
        return iOrdinal != 1 ? (iOrdinal == 2 || iOrdinal == 3) ? Level.FINE : Level.FINEST : Level.FINER;
    }

    @Override // io.grpc.ChannelLogger
    public final void a(ChannelLogger.ChannelLogLevel channelLogLevel, String str) {
        ChannelTracer channelTracer = this.f23992a;
        InternalLogId internalLogId = channelTracer.b;
        Level levelD = d(channelLogLevel);
        if (ChannelTracer.d.isLoggable(levelD)) {
            ChannelTracer.a(internalLogId, levelD, str);
        }
        if (!c(channelLogLevel) || channelLogLevel == ChannelLogger.ChannelLogLevel.d) {
            return;
        }
        InternalChannelz.ChannelTrace.Event.Builder builder = new InternalChannelz.ChannelTrace.Event.Builder();
        builder.f23943a = str;
        int iOrdinal = channelLogLevel.ordinal();
        builder.b = iOrdinal != 2 ? iOrdinal != 3 ? InternalChannelz.ChannelTrace.Event.Severity.d : InternalChannelz.ChannelTrace.Event.Severity.f : InternalChannelz.ChannelTrace.Event.Severity.e;
        builder.c = Long.valueOf(this.b.a());
        InternalChannelz.ChannelTrace.Event eventA = builder.a();
        synchronized (channelTracer.f23994a) {
            Collection collection = channelTracer.c;
            if (collection != null) {
                ((ChannelTracer.AnonymousClass1) collection).add(eventA);
            }
        }
    }

    @Override // io.grpc.ChannelLogger
    public final void b(ChannelLogger.ChannelLogLevel channelLogLevel, String str, Object... objArr) {
        a(channelLogLevel, (c(channelLogLevel) || ChannelTracer.d.isLoggable(d(channelLogLevel))) ? MessageFormat.format(str, objArr) : null);
    }

    public final boolean c(ChannelLogger.ChannelLogLevel channelLogLevel) {
        boolean z;
        if (channelLogLevel != ChannelLogger.ChannelLogLevel.d) {
            ChannelTracer channelTracer = this.f23992a;
            synchronized (channelTracer.f23994a) {
                z = channelTracer.c != null;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }
}
