package io.grpc.internal;

import com.google.common.base.Preconditions;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import io.grpc.ChannelLogger;
import io.grpc.InternalChannelz;
import io.grpc.InternalLogId;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

/* loaded from: classes7.dex */
final class ChannelTracer {
    public static final Logger d = Logger.getLogger(ChannelLogger.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final Object f23994a = new Object();
    public final InternalLogId b;
    public final Collection c;

    /* renamed from: io.grpc.internal.ChannelTracer$1, reason: invalid class name */
    class AnonymousClass1 extends ArrayDeque<InternalChannelz.ChannelTrace.Event> {
        @Override // java.util.ArrayDeque, java.util.AbstractCollection, java.util.Collection, java.util.Deque, java.util.Queue
        public final boolean add(Object obj) {
            InternalChannelz.ChannelTrace.Event event = (InternalChannelz.ChannelTrace.Event) obj;
            if (size() == 0) {
                removeFirst();
            }
            return super.add(event);
        }
    }

    /* renamed from: io.grpc.internal.ChannelTracer$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f23995a;

        static {
            int[] iArr = new int[InternalChannelz.ChannelTrace.Event.Severity.values().length];
            f23995a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23995a[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public ChannelTracer(InternalLogId internalLogId, long j, String str) {
        Preconditions.j(str, lqlqqlq.mmm006Dm006Dm);
        this.b = internalLogId;
        this.c = null;
        InternalChannelz.ChannelTrace.Event.Builder builder = new InternalChannelz.ChannelTrace.Event.Builder();
        builder.f23943a = str.concat(" created");
        builder.b = InternalChannelz.ChannelTrace.Event.Severity.d;
        builder.c = Long.valueOf(j);
        b(builder.a());
    }

    public static void a(InternalLogId internalLogId, Level level, String str) {
        Logger logger = d;
        if (logger.isLoggable(level)) {
            LogRecord logRecord = new LogRecord(level, "[" + internalLogId + "] " + str);
            logRecord.setLoggerName(logger.getName());
            logRecord.setSourceClassName(logger.getName());
            logRecord.setSourceMethodName("log");
            logger.log(logRecord);
        }
    }

    public final void b(InternalChannelz.ChannelTrace.Event event) {
        int iOrdinal = event.b.ordinal();
        Level level = iOrdinal != 2 ? iOrdinal != 3 ? Level.FINEST : Level.FINE : Level.FINER;
        synchronized (this.f23994a) {
            Collection collection = this.c;
            if (collection != null) {
                ((AnonymousClass1) collection).add(event);
            }
        }
        a(this.b, level, event.f23942a);
    }
}
