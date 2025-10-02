package okhttp3.internal.connection;

import androidx.camera.core.impl.b;
import java.io.IOException;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.collections.EmptyMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.connection.RealConnectionPool;
import okhttp3.internal.platform.Platform;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0002\b\tR\"\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lokhttp3/internal/connection/RealConnectionPool;", "", "", "Lokhttp3/Address;", "Lokhttp3/internal/connection/RealConnectionPool$AddressState;", "d", "Ljava/util/Map;", "addressStates", "AddressState", "Companion", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class RealConnectionPool {
    public static final /* synthetic */ int h = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f26717a;
    public final ConnectionListener b;
    public final long c;

    /* renamed from: d, reason: from kotlin metadata */
    public volatile Map addressStates = EmptyMap.d;
    public final TaskQueue e;
    public final RealConnectionPool$cleanupTask$1 f;
    public final ConcurrentLinkedQueue g;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/connection/RealConnectionPool$AddressState;", "", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AddressState {
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Rv\u0010\b\u001ab\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0012\u001c\u0012\u001a\u0012\u0002\b\u0003\u0012\u0002\b\u0003 \u0006*\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u00070\u0007 \u0006*0\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0012\u001c\u0012\u001a\u0012\u0002\b\u0003\u0012\u0002\b\u0003 \u0006*\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u00070\u0007\u0018\u00010\u00040\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lokhttp3/internal/connection/RealConnectionPool$Companion;", "", "<init>", "()V", "Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;", "Lokhttp3/internal/connection/RealConnectionPool;", "kotlin.jvm.PlatformType", "", "addressStatesUpdater", "Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        private Companion() {
        }
    }

    static {
        new Companion(0);
        AtomicReferenceFieldUpdater.newUpdater(RealConnectionPool.class, Map.class, "d");
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [okhttp3.internal.connection.RealConnectionPool$cleanupTask$1] */
    public RealConnectionPool(TaskRunner taskRunner, int i, long j, TimeUnit timeUnit, ConnectionListener connectionListener, okhttp3.a aVar) {
        this.f26717a = i;
        this.b = connectionListener;
        this.c = timeUnit.toNanos(j);
        this.e = taskRunner.d();
        final String strO = YU.a.o(new StringBuilder(), _UtilJvmKt.b, " ConnectionPool connection closer");
        this.f = new Task(strO) { // from class: okhttp3.internal.connection.RealConnectionPool$cleanupTask$1
            @Override // okhttp3.internal.concurrent.Task
            public final long a() throws IOException {
                RealConnectionPool realConnectionPool = this.e;
                long jNanoTime = System.nanoTime();
                Map map = realConnectionPool.addressStates;
                Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    ((RealConnectionPool.AddressState) it.next()).getClass();
                }
                Iterator it2 = realConnectionPool.g.iterator();
                Intrinsics.g(it2, "iterator(...)");
                while (it2.hasNext()) {
                    RealConnection realConnection = (RealConnection) it2.next();
                    if (((RealConnectionPool.AddressState) map.get(realConnection.g.f26694a)) != null) {
                        synchronized (realConnection) {
                        }
                    }
                }
                long j2 = (jNanoTime - realConnectionPool.c) + 1;
                Iterator it3 = realConnectionPool.g.iterator();
                Intrinsics.g(it3, "iterator(...)");
                int i2 = 0;
                long j3 = Long.MAX_VALUE;
                RealConnection realConnection2 = null;
                RealConnection realConnection3 = null;
                int i3 = 0;
                while (it3.hasNext()) {
                    RealConnection realConnection4 = (RealConnection) it3.next();
                    Intrinsics.e(realConnection4);
                    synchronized (realConnection4) {
                        if (realConnectionPool.a(realConnection4, jNanoTime) > 0) {
                            i3++;
                        } else {
                            int i4 = i3;
                            long j4 = realConnection4.x;
                            if (j4 < j2) {
                                j2 = j4;
                                realConnection2 = realConnection4;
                            }
                            if (((RealConnectionPool.AddressState) map.get(realConnection4.g.f26694a)) != null) {
                                throw null;
                            }
                            i2++;
                            if (j4 < j3) {
                                j3 = j4;
                                realConnection3 = realConnection4;
                            }
                            i3 = i4;
                        }
                    }
                }
                int i5 = i3;
                if (realConnection2 == null) {
                    if (i2 > realConnectionPool.f26717a) {
                        j2 = j3;
                        realConnection2 = realConnection3;
                    } else {
                        j2 = -1;
                        realConnection2 = null;
                    }
                }
                if (realConnection2 == null) {
                    if (realConnection3 != null) {
                        return (j3 + realConnectionPool.c) - jNanoTime;
                    }
                    if (i5 > 0) {
                        return realConnectionPool.c;
                    }
                    return -1L;
                }
                synchronized (realConnection2) {
                    if (!realConnection2.w.isEmpty()) {
                        return 0L;
                    }
                    if (realConnection2.x != j2) {
                        return 0L;
                    }
                    realConnection2.q = true;
                    realConnectionPool.g.remove(realConnection2);
                    RealConnectionPool.AddressState addressState = (RealConnectionPool.AddressState) map.get(realConnection2.g.f26694a);
                    if (addressState != null) {
                        realConnectionPool.b(addressState);
                        throw null;
                    }
                    _UtilJvmKt.c(realConnection2.i);
                    if (!realConnectionPool.g.isEmpty()) {
                        return 0L;
                    }
                    TaskQueue taskQueue = realConnectionPool.e;
                    synchronized (taskQueue.f26707a) {
                        if (taskQueue.a()) {
                            taskQueue.f26707a.c(taskQueue);
                        }
                    }
                    return 0L;
                }
            }
        };
        this.g = new ConcurrentLinkedQueue();
        if (j <= 0) {
            throw new IllegalArgumentException(b.k(j, "keepAliveDuration <= 0: ").toString());
        }
    }

    public final int a(RealConnection realConnection, long j) {
        TimeZone timeZone = _UtilJvmKt.f26699a;
        ArrayList arrayList = realConnection.w;
        int i = 0;
        while (i < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                String str = "A connection to " + realConnection.g.f26694a.h + " was leaked. Did you forget to close a response body?";
                Platform.f26752a.getClass();
                Platform.b.i(((RealCall.CallReference) reference).f26716a, str);
                arrayList.remove(i);
                if (arrayList.isEmpty()) {
                    realConnection.x = j - this.c;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }

    public final void b(final AddressState addressState) {
        final String strO = YU.a.o(new StringBuilder(), _UtilJvmKt.b, " ConnectionPool connection opener");
        new Task(strO) { // from class: okhttp3.internal.connection.RealConnectionPool$scheduleOpener$1
            @Override // okhttp3.internal.concurrent.Task
            public final long a() {
                int i = RealConnectionPool.h;
                this.e.getClass();
                addressState.getClass();
                throw null;
            }
        };
        throw null;
    }
}
