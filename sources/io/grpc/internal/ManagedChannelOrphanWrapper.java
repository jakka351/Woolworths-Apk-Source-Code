package io.grpc.internal;

import com.google.common.annotations.VisibleForTesting;
import io.grpc.ManagedChannel;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

/* loaded from: classes7.dex */
final class ManagedChannelOrphanWrapper extends ForwardingManagedChannel {
    public static final ReferenceQueue c = new ReferenceQueue();
    public static final ConcurrentHashMap d = new ConcurrentHashMap();
    public static final Logger e = Logger.getLogger(ManagedChannelOrphanWrapper.class.getName());
    public final ManagedChannelReference b;

    @VisibleForTesting
    public static final class ManagedChannelReference extends WeakReference<ManagedChannelOrphanWrapper> {
        public static final boolean f = Boolean.parseBoolean(System.getProperty("io.grpc.ManagedChannel.enableAllocationTracking", "true"));
        public static final RuntimeException g;

        /* renamed from: a, reason: collision with root package name */
        public final ReferenceQueue f24054a;
        public final ConcurrentMap b;
        public final String c;
        public final SoftReference d;
        public final AtomicBoolean e;

        static {
            RuntimeException runtimeException = new RuntimeException("ManagedChannel allocation site not recorded.  Set -Dio.grpc.ManagedChannel.enableAllocationTracking=true to enable it");
            runtimeException.setStackTrace(new StackTraceElement[0]);
            g = runtimeException;
        }

        public ManagedChannelReference(ManagedChannelOrphanWrapper managedChannelOrphanWrapper, ManagedChannel managedChannel, ReferenceQueue referenceQueue, ConcurrentMap concurrentMap) {
            super(managedChannelOrphanWrapper, referenceQueue);
            this.e = new AtomicBoolean();
            this.d = new SoftReference(f ? new RuntimeException("ManagedChannel allocation site") : g);
            this.c = managedChannel.toString();
            this.f24054a = referenceQueue;
            this.b = concurrentMap;
            concurrentMap.put(this, this);
            a(referenceQueue);
        }

        public static void a(ReferenceQueue referenceQueue) {
            while (true) {
                ManagedChannelReference managedChannelReference = (ManagedChannelReference) referenceQueue.poll();
                if (managedChannelReference == null) {
                    return;
                }
                SoftReference softReference = managedChannelReference.d;
                RuntimeException runtimeException = (RuntimeException) softReference.get();
                super.clear();
                managedChannelReference.b.remove(managedChannelReference);
                softReference.clear();
                if (!managedChannelReference.e.get()) {
                    Level level = Level.SEVERE;
                    Logger logger = ManagedChannelOrphanWrapper.e;
                    if (logger.isLoggable(level)) {
                        LogRecord logRecord = new LogRecord(level, "*~*~*~ Previous channel {0} was garbage collected without being shut down! ~*~*~*" + System.getProperty("line.separator") + "    Make sure to call shutdown()/shutdownNow()");
                        logRecord.setLoggerName(logger.getName());
                        logRecord.setParameters(new Object[]{managedChannelReference.c});
                        logRecord.setThrown(runtimeException);
                        logger.log(logRecord);
                    }
                }
            }
        }

        @Override // java.lang.ref.Reference
        public final void clear() {
            super.clear();
            this.b.remove(this);
            this.d.clear();
            a(this.f24054a);
        }
    }

    public ManagedChannelOrphanWrapper(ManagedChannel managedChannel) {
        super(managedChannel);
        this.b = new ManagedChannelReference(this, managedChannel, c, d);
    }

    @Override // io.grpc.internal.ForwardingManagedChannel, io.grpc.ManagedChannel
    public final ManagedChannel l() {
        ManagedChannelReference managedChannelReference = this.b;
        if (!managedChannelReference.e.getAndSet(true)) {
            managedChannelReference.clear();
        }
        return super.l();
    }
}
