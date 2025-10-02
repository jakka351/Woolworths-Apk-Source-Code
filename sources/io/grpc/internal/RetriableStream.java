package io.grpc.internal;

import com.google.common.base.Preconditions;
import com.google.protobuf.GeneratedMessageLite;
import io.grpc.ClientStreamTracer;
import io.grpc.Compressor;
import io.grpc.Deadline;
import io.grpc.DecompressorRegistry;
import io.grpc.Metadata;
import io.grpc.MethodDescriptor;
import io.grpc.Status;
import io.grpc.SynchronizationContext;
import io.grpc.internal.ClientStreamListener;
import io.grpc.internal.StreamListener;
import java.io.IOException;
import java.io.InputStream;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

/* loaded from: classes7.dex */
abstract class RetriableStream<ReqT> implements ClientStream {
    public static final Metadata.Key A;
    public static final Metadata.Key B;
    public static final Status C;
    public static final Random D;

    /* renamed from: a, reason: collision with root package name */
    public final MethodDescriptor f24079a;
    public final Executor b;
    public final ScheduledExecutorService d;
    public final Metadata e;
    public final RetryPolicy f;
    public final HedgingPolicy g;
    public final boolean h;
    public final ChannelBufferMeter j;
    public final long k;
    public final long l;
    public final Throttle m;
    public SavedCloseMasterListenerReason s;
    public long t;
    public ClientStreamListener u;
    public FutureCanceller v;
    public FutureCanceller w;
    public long x;
    public Status y;
    public boolean z;
    public final SynchronizationContext c = new SynchronizationContext(new AnonymousClass1());
    public final Object i = new Object();
    public final InsightBuilder n = new InsightBuilder();
    public volatile State o = new State(new ArrayList(8), Collections.EMPTY_LIST, null, null, false, false, false, 0);
    public final AtomicBoolean p = new AtomicBoolean();
    public final AtomicInteger q = new AtomicInteger();
    public final AtomicInteger r = new AtomicInteger();

    /* renamed from: io.grpc.internal.RetriableStream$1, reason: invalid class name */
    public class AnonymousClass1 implements Thread.UncaughtExceptionHandler {
        @Override // java.lang.Thread.UncaughtExceptionHandler
        public final void uncaughtException(Thread thread, Throwable th) {
            throw Status.e(th).i("Uncaught exception in the SynchronizationContext. Re-thrown.").a();
        }
    }

    /* renamed from: io.grpc.internal.RetriableStream$1AuthorityEntry, reason: invalid class name */
    class C1AuthorityEntry implements BufferEntry {
        @Override // io.grpc.internal.RetriableStream.BufferEntry
        public final void a(Substream substream) {
            substream.f24094a.f();
        }
    }

    /* renamed from: io.grpc.internal.RetriableStream$1CommitTask, reason: invalid class name */
    class C1CommitTask implements Runnable {
        public final /* synthetic */ Collection d;
        public final /* synthetic */ Substream e;
        public final /* synthetic */ Future f;
        public final /* synthetic */ Future g;

        public C1CommitTask(Collection collection, Substream substream, Future future, Future future2) {
            this.d = collection;
            this.e = substream;
            this.f = future;
            this.g = future2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            for (Substream substream : this.d) {
                if (substream != this.e) {
                    substream.f24094a.e(RetriableStream.C);
                }
            }
            Future future = this.f;
            if (future != null) {
                future.cancel(false);
            }
            Future future2 = this.g;
            if (future2 != null) {
                future2.cancel(false);
            }
            RetriableStream.this.w();
        }
    }

    /* renamed from: io.grpc.internal.RetriableStream$1FlushEntry, reason: invalid class name */
    class C1FlushEntry implements BufferEntry {
        @Override // io.grpc.internal.RetriableStream.BufferEntry
        public final void a(Substream substream) {
            substream.f24094a.flush();
        }
    }

    /* renamed from: io.grpc.internal.RetriableStream$1FullStreamDecompressionEntry, reason: invalid class name */
    class C1FullStreamDecompressionEntry implements BufferEntry {
        @Override // io.grpc.internal.RetriableStream.BufferEntry
        public final void a(Substream substream) {
            substream.f24094a.k();
        }
    }

    /* renamed from: io.grpc.internal.RetriableStream$1HalfCloseEntry, reason: invalid class name */
    class C1HalfCloseEntry implements BufferEntry {
        @Override // io.grpc.internal.RetriableStream.BufferEntry
        public final void a(Substream substream) {
            substream.f24094a.i();
        }
    }

    /* renamed from: io.grpc.internal.RetriableStream$1MessageCompressionEntry, reason: invalid class name */
    class C1MessageCompressionEntry implements BufferEntry {
        @Override // io.grpc.internal.RetriableStream.BufferEntry
        public final void a(Substream substream) {
            ClientStream clientStream = substream.f24094a;
            throw null;
        }
    }

    /* renamed from: io.grpc.internal.RetriableStream$1OptimizeDirectEntry, reason: invalid class name */
    class C1OptimizeDirectEntry implements BufferEntry {
        @Override // io.grpc.internal.RetriableStream.BufferEntry
        public final void a(Substream substream) {
            substream.f24094a.h();
        }
    }

    /* renamed from: io.grpc.internal.RetriableStream$1RequestEntry, reason: invalid class name */
    class C1RequestEntry implements BufferEntry {
        @Override // io.grpc.internal.RetriableStream.BufferEntry
        public final void a(Substream substream) {
            substream.f24094a.b(1);
        }
    }

    public interface BufferEntry {
        void a(Substream substream);
    }

    public class BufferSizeTracer extends ClientStreamTracer {
        public final Substream b;
        public long c;

        public BufferSizeTracer(Substream substream) {
            this.b = substream;
        }

        @Override // io.grpc.StreamTracer
        public final void h(long j) {
            if (RetriableStream.this.o.f != null) {
                return;
            }
            synchronized (RetriableStream.this.i) {
                try {
                    if (RetriableStream.this.o.f == null) {
                        Substream substream = this.b;
                        if (!substream.b) {
                            long j2 = this.c + j;
                            this.c = j2;
                            RetriableStream retriableStream = RetriableStream.this;
                            long j3 = retriableStream.t;
                            if (j2 <= j3) {
                                return;
                            }
                            if (j2 > retriableStream.k) {
                                substream.c = true;
                            } else {
                                long jAddAndGet = retriableStream.j.f24087a.addAndGet(j2 - j3);
                                RetriableStream retriableStream2 = RetriableStream.this;
                                retriableStream2.t = this.c;
                                if (jAddAndGet > retriableStream2.l) {
                                    this.b.c = true;
                                }
                            }
                            Substream substream2 = this.b;
                            Runnable runnableP = substream2.c ? RetriableStream.this.p(substream2) : null;
                            if (runnableP != null) {
                                runnableP.run();
                            }
                        }
                    }
                } finally {
                }
            }
        }
    }

    public static final class ChannelBufferMeter {

        /* renamed from: a, reason: collision with root package name */
        public final AtomicLong f24087a = new AtomicLong();
    }

    public static final class FutureCanceller {

        /* renamed from: a, reason: collision with root package name */
        public final Object f24088a;
        public Future b;
        public boolean c;

        public FutureCanceller(Object obj) {
            this.f24088a = obj;
        }

        public final void a(ScheduledFuture scheduledFuture) {
            synchronized (this.f24088a) {
                try {
                    if (!this.c) {
                        this.b = scheduledFuture;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static final class HedgingPlan {
    }

    public final class HedgingRunnable implements Runnable {
        public final FutureCanceller d;

        public HedgingRunnable(FutureCanceller futureCanceller) {
            this.d = futureCanceller;
        }

        @Override // java.lang.Runnable
        public final void run() {
            RetriableStream retriableStream = RetriableStream.this;
            final Substream substreamQ = retriableStream.q(retriableStream.o.e, false);
            if (substreamQ == null) {
                return;
            }
            RetriableStream.this.b.execute(new Runnable() { // from class: io.grpc.internal.RetriableStream.HedgingRunnable.1
                /* JADX WARN: Removed duplicated region for block: B:20:0x0053 A[Catch: all -> 0x0051, TryCatch #0 {all -> 0x0051, blocks: (B:4:0x0007, B:25:0x007c, B:7:0x0013, B:9:0x002c, B:11:0x0034, B:16:0x0042, B:20:0x0053, B:24:0x0073, B:23:0x005e), top: B:35:0x0007 }] */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final void run() {
                    /*
                        r15 = this;
                        io.grpc.internal.RetriableStream$HedgingRunnable r0 = io.grpc.internal.RetriableStream.HedgingRunnable.this
                        io.grpc.internal.RetriableStream r0 = io.grpc.internal.RetriableStream.this
                        java.lang.Object r1 = r0.i
                        monitor-enter(r1)
                        io.grpc.internal.RetriableStream$HedgingRunnable r0 = io.grpc.internal.RetriableStream.HedgingRunnable.this     // Catch: java.lang.Throwable -> L51
                        io.grpc.internal.RetriableStream$FutureCanceller r2 = r0.d     // Catch: java.lang.Throwable -> L51
                        boolean r2 = r2.c     // Catch: java.lang.Throwable -> L51
                        r3 = 1
                        r4 = 0
                        if (r2 == 0) goto L13
                        goto L7c
                    L13:
                        io.grpc.internal.RetriableStream r0 = io.grpc.internal.RetriableStream.this     // Catch: java.lang.Throwable -> L51
                        io.grpc.internal.RetriableStream$State r2 = r0.o     // Catch: java.lang.Throwable -> L51
                        io.grpc.internal.RetriableStream$Substream r5 = r2     // Catch: java.lang.Throwable -> L51
                        io.grpc.internal.RetriableStream$State r2 = r2.a(r5)     // Catch: java.lang.Throwable -> L51
                        r0.o = r2     // Catch: java.lang.Throwable -> L51
                        io.grpc.internal.RetriableStream$HedgingRunnable r0 = io.grpc.internal.RetriableStream.HedgingRunnable.this     // Catch: java.lang.Throwable -> L51
                        io.grpc.internal.RetriableStream r0 = io.grpc.internal.RetriableStream.this     // Catch: java.lang.Throwable -> L51
                        io.grpc.internal.RetriableStream$State r2 = r0.o     // Catch: java.lang.Throwable -> L51
                        boolean r0 = r0.u(r2)     // Catch: java.lang.Throwable -> L51
                        r2 = 0
                        if (r0 == 0) goto L53
                        io.grpc.internal.RetriableStream$HedgingRunnable r0 = io.grpc.internal.RetriableStream.HedgingRunnable.this     // Catch: java.lang.Throwable -> L51
                        io.grpc.internal.RetriableStream r0 = io.grpc.internal.RetriableStream.this     // Catch: java.lang.Throwable -> L51
                        io.grpc.internal.RetriableStream$Throttle r0 = r0.m     // Catch: java.lang.Throwable -> L51
                        if (r0 == 0) goto L42
                        java.util.concurrent.atomic.AtomicInteger r5 = r0.d     // Catch: java.lang.Throwable -> L51
                        int r5 = r5.get()     // Catch: java.lang.Throwable -> L51
                        int r0 = r0.b     // Catch: java.lang.Throwable -> L51
                        if (r5 <= r0) goto L3f
                        goto L40
                    L3f:
                        r3 = r2
                    L40:
                        if (r3 == 0) goto L53
                    L42:
                        io.grpc.internal.RetriableStream$HedgingRunnable r0 = io.grpc.internal.RetriableStream.HedgingRunnable.this     // Catch: java.lang.Throwable -> L51
                        io.grpc.internal.RetriableStream r0 = io.grpc.internal.RetriableStream.this     // Catch: java.lang.Throwable -> L51
                        io.grpc.internal.RetriableStream$FutureCanceller r4 = new io.grpc.internal.RetriableStream$FutureCanceller     // Catch: java.lang.Throwable -> L51
                        java.lang.Object r3 = r0.i     // Catch: java.lang.Throwable -> L51
                        r4.<init>(r3)     // Catch: java.lang.Throwable -> L51
                        r0.w = r4     // Catch: java.lang.Throwable -> L51
                    L4f:
                        r3 = r2
                        goto L7c
                    L51:
                        r0 = move-exception
                        goto Lc3
                    L53:
                        io.grpc.internal.RetriableStream$HedgingRunnable r0 = io.grpc.internal.RetriableStream.HedgingRunnable.this     // Catch: java.lang.Throwable -> L51
                        io.grpc.internal.RetriableStream r0 = io.grpc.internal.RetriableStream.this     // Catch: java.lang.Throwable -> L51
                        io.grpc.internal.RetriableStream$State r3 = r0.o     // Catch: java.lang.Throwable -> L51
                        boolean r5 = r3.h     // Catch: java.lang.Throwable -> L51
                        if (r5 == 0) goto L5e
                        goto L73
                    L5e:
                        io.grpc.internal.RetriableStream$State r6 = new io.grpc.internal.RetriableStream$State     // Catch: java.lang.Throwable -> L51
                        java.util.List r7 = r3.b     // Catch: java.lang.Throwable -> L51
                        java.util.Collection r8 = r3.c     // Catch: java.lang.Throwable -> L51
                        java.util.Collection r9 = r3.d     // Catch: java.lang.Throwable -> L51
                        io.grpc.internal.RetriableStream$Substream r10 = r3.f     // Catch: java.lang.Throwable -> L51
                        boolean r11 = r3.g     // Catch: java.lang.Throwable -> L51
                        boolean r12 = r3.f24092a     // Catch: java.lang.Throwable -> L51
                        int r14 = r3.e     // Catch: java.lang.Throwable -> L51
                        r13 = 1
                        r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)     // Catch: java.lang.Throwable -> L51
                        r3 = r6
                    L73:
                        r0.o = r3     // Catch: java.lang.Throwable -> L51
                        io.grpc.internal.RetriableStream$HedgingRunnable r0 = io.grpc.internal.RetriableStream.HedgingRunnable.this     // Catch: java.lang.Throwable -> L51
                        io.grpc.internal.RetriableStream r0 = io.grpc.internal.RetriableStream.this     // Catch: java.lang.Throwable -> L51
                        r0.w = r4     // Catch: java.lang.Throwable -> L51
                        goto L4f
                    L7c:
                        monitor-exit(r1)     // Catch: java.lang.Throwable -> L51
                        if (r3 == 0) goto L9f
                        io.grpc.internal.RetriableStream$Substream r0 = r2
                        io.grpc.internal.ClientStream r1 = r0.f24094a
                        io.grpc.internal.RetriableStream$Sublistener r2 = new io.grpc.internal.RetriableStream$Sublistener
                        io.grpc.internal.RetriableStream$HedgingRunnable r3 = io.grpc.internal.RetriableStream.HedgingRunnable.this
                        io.grpc.internal.RetriableStream r3 = io.grpc.internal.RetriableStream.this
                        r2.<init>(r0)
                        r1.n(r2)
                        io.grpc.internal.RetriableStream$Substream r0 = r2
                        io.grpc.internal.ClientStream r0 = r0.f24094a
                        io.grpc.Status r1 = io.grpc.Status.f
                        java.lang.String r2 = "Unneeded hedging"
                        io.grpc.Status r1 = r1.i(r2)
                        r0.e(r1)
                        return
                    L9f:
                        if (r4 == 0) goto Lb9
                        io.grpc.internal.RetriableStream$HedgingRunnable r0 = io.grpc.internal.RetriableStream.HedgingRunnable.this
                        io.grpc.internal.RetriableStream r0 = io.grpc.internal.RetriableStream.this
                        java.util.concurrent.ScheduledExecutorService r1 = r0.d
                        io.grpc.internal.RetriableStream$HedgingRunnable r2 = new io.grpc.internal.RetriableStream$HedgingRunnable
                        r2.<init>(r4)
                        io.grpc.internal.HedgingPolicy r0 = r0.g
                        long r5 = r0.b
                        java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.NANOSECONDS
                        java.util.concurrent.ScheduledFuture r0 = r1.schedule(r2, r5, r0)
                        r4.a(r0)
                    Lb9:
                        io.grpc.internal.RetriableStream$HedgingRunnable r0 = io.grpc.internal.RetriableStream.HedgingRunnable.this
                        io.grpc.internal.RetriableStream r0 = io.grpc.internal.RetriableStream.this
                        io.grpc.internal.RetriableStream$Substream r1 = r2
                        r0.s(r1)
                        return
                    Lc3:
                        monitor-exit(r1)     // Catch: java.lang.Throwable -> L51
                        throw r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.RetriableStream.HedgingRunnable.AnonymousClass1.run():void");
                }
            });
        }
    }

    public static final class RetryPlan {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f24089a;
        public final long b;

        public RetryPlan(long j, boolean z) {
            this.f24089a = z;
            this.b = j;
        }
    }

    public static final class SavedCloseMasterListenerReason {

        /* renamed from: a, reason: collision with root package name */
        public final Status f24090a;
        public final ClientStreamListener.RpcProgress b;
        public final Metadata c;

        public SavedCloseMasterListenerReason(Status status, ClientStreamListener.RpcProgress rpcProgress, Metadata metadata) {
            this.f24090a = status;
            this.b = rpcProgress;
            this.c = metadata;
        }
    }

    public class StartEntry implements BufferEntry {
        public StartEntry() {
        }

        @Override // io.grpc.internal.RetriableStream.BufferEntry
        public final void a(Substream substream) {
            substream.f24094a.n(new Sublistener(substream));
        }
    }

    public static final class State {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f24092a;
        public final List b;
        public final Collection c;
        public final Collection d;
        public final int e;
        public final Substream f;
        public final boolean g;
        public final boolean h;

        public State(List list, Collection collection, Collection collection2, Substream substream, boolean z, boolean z2, boolean z3, int i) {
            this.b = list;
            Preconditions.j(collection, "drainedSubstreams");
            this.c = collection;
            this.f = substream;
            this.d = collection2;
            this.g = z;
            this.f24092a = z2;
            this.h = z3;
            this.e = i;
            Preconditions.q("passThrough should imply buffer is null", !z2 || list == null);
            Preconditions.q("passThrough should imply winningSubstream != null", (z2 && substream == null) ? false : true);
            Preconditions.q("passThrough should imply winningSubstream is drained", !z2 || (collection.size() == 1 && collection.contains(substream)) || (collection.size() == 0 && substream.b));
            Preconditions.q("cancelled should imply committed", (z && substream == null) ? false : true);
        }

        public final State a(Substream substream) {
            Collection collectionUnmodifiableCollection;
            Preconditions.q("hedging frozen", !this.h);
            Preconditions.q("already committed", this.f == null);
            Collection collection = this.d;
            if (collection == null) {
                collectionUnmodifiableCollection = Collections.singleton(substream);
            } else {
                ArrayList arrayList = new ArrayList(collection);
                arrayList.add(substream);
                collectionUnmodifiableCollection = Collections.unmodifiableCollection(arrayList);
            }
            return new State(this.b, this.c, collectionUnmodifiableCollection, this.f, this.g, this.f24092a, this.h, this.e + 1);
        }

        public final State b(Substream substream) {
            ArrayList arrayList = new ArrayList(this.d);
            arrayList.remove(substream);
            return new State(this.b, this.c, Collections.unmodifiableCollection(arrayList), this.f, this.g, this.f24092a, this.h, this.e);
        }

        public final State c(Substream substream, Substream substream2) {
            ArrayList arrayList = new ArrayList(this.d);
            arrayList.remove(substream);
            arrayList.add(substream2);
            return new State(this.b, this.c, Collections.unmodifiableCollection(arrayList), this.f, this.g, this.f24092a, this.h, this.e);
        }

        public final State d(Substream substream) {
            substream.b = true;
            Collection collection = this.c;
            if (!collection.contains(substream)) {
                return this;
            }
            ArrayList arrayList = new ArrayList(collection);
            arrayList.remove(substream);
            return new State(this.b, Collections.unmodifiableCollection(arrayList), this.d, this.f, this.g, this.f24092a, this.h, this.e);
        }

        public final State e(Substream substream) {
            List list;
            Preconditions.q("Already passThrough", !this.f24092a);
            boolean z = substream.b;
            Collection collectionUnmodifiableCollection = this.c;
            if (!z) {
                if (collectionUnmodifiableCollection.isEmpty()) {
                    collectionUnmodifiableCollection = Collections.singletonList(substream);
                } else {
                    ArrayList arrayList = new ArrayList(collectionUnmodifiableCollection);
                    arrayList.add(substream);
                    collectionUnmodifiableCollection = Collections.unmodifiableCollection(arrayList);
                }
            }
            Collection collection = collectionUnmodifiableCollection;
            Substream substream2 = this.f;
            boolean z2 = substream2 != null;
            if (z2) {
                Preconditions.q("Another RPC attempt has already committed", substream2 == substream);
                list = null;
            } else {
                list = this.b;
            }
            return new State(list, collection, this.d, this.f, this.g, z2, this.h, this.e);
        }
    }

    public final class Sublistener implements ClientStreamListener {

        /* renamed from: a, reason: collision with root package name */
        public final Substream f24093a;

        public Sublistener(Substream substream) {
            this.f24093a = substream;
        }

        @Override // io.grpc.internal.StreamListener
        public final void a(final StreamListener.MessageProducer messageProducer) throws IOException {
            State state = RetriableStream.this.o;
            Preconditions.q("Headers should be received prior to messages.", state.f != null);
            if (state.f == this.f24093a) {
                RetriableStream.this.c.execute(new Runnable() { // from class: io.grpc.internal.RetriableStream.Sublistener.4
                    @Override // java.lang.Runnable
                    public final void run() {
                        RetriableStream.this.u.a(messageProducer);
                    }
                });
                return;
            }
            Logger logger = GrpcUtil.f24015a;
            while (true) {
                InputStream next = messageProducer.next();
                if (next == null) {
                    return;
                } else {
                    GrpcUtil.b(next);
                }
            }
        }

        @Override // io.grpc.internal.ClientStreamListener
        public final void b(final Metadata metadata) {
            int i;
            int i2;
            if (this.f24093a.d > 0) {
                Metadata.Key key = RetriableStream.A;
                metadata.a(key);
                metadata.f(key, String.valueOf(this.f24093a.d));
            }
            RetriableStream retriableStream = RetriableStream.this;
            Substream substream = this.f24093a;
            Metadata.Key key2 = RetriableStream.A;
            Runnable runnableP = retriableStream.p(substream);
            if (runnableP != null) {
                retriableStream.b.execute(runnableP);
            }
            if (RetriableStream.this.o.f == this.f24093a) {
                Throttle throttle = RetriableStream.this.m;
                if (throttle != null) {
                    AtomicInteger atomicInteger = throttle.d;
                    do {
                        i = atomicInteger.get();
                        i2 = throttle.f24095a;
                        if (i == i2) {
                            break;
                        }
                    } while (!atomicInteger.compareAndSet(i, Math.min(throttle.c + i, i2)));
                }
                RetriableStream.this.c.execute(new Runnable() { // from class: io.grpc.internal.RetriableStream.Sublistener.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        RetriableStream.this.u.b(metadata);
                    }
                });
            }
        }

        @Override // io.grpc.internal.ClientStreamListener
        public final void c(Status status, ClientStreamListener.RpcProgress rpcProgress, Metadata metadata) throws NumberFormatException {
            boolean z;
            RetryPlan retryPlan;
            RetriableStream retriableStream;
            FutureCanceller futureCanceller;
            Integer numValueOf = -1;
            synchronized (RetriableStream.this.i) {
                RetriableStream retriableStream2 = RetriableStream.this;
                retriableStream2.o = retriableStream2.o.d(this.f24093a);
                RetriableStream.this.n.f24022a.add(String.valueOf(status.f23971a));
            }
            if (RetriableStream.this.r.decrementAndGet() == Integer.MIN_VALUE) {
                RetriableStream.this.c.execute(new Runnable() { // from class: io.grpc.internal.RetriableStream.Sublistener.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        RetriableStream retriableStream3 = RetriableStream.this;
                        retriableStream3.z = true;
                        ClientStreamListener clientStreamListener = retriableStream3.u;
                        SavedCloseMasterListenerReason savedCloseMasterListenerReason = retriableStream3.s;
                        clientStreamListener.c(savedCloseMasterListenerReason.f24090a, savedCloseMasterListenerReason.b, savedCloseMasterListenerReason.c);
                    }
                });
                return;
            }
            Substream substream = this.f24093a;
            if (substream.c) {
                RetriableStream retriableStream3 = RetriableStream.this;
                Runnable runnableP = retriableStream3.p(substream);
                if (runnableP != null) {
                    retriableStream3.b.execute(runnableP);
                }
                if (RetriableStream.this.o.f == this.f24093a) {
                    RetriableStream.this.y(status, rpcProgress, metadata);
                    return;
                }
                return;
            }
            ClientStreamListener.RpcProgress rpcProgress2 = ClientStreamListener.RpcProgress.g;
            if (rpcProgress == rpcProgress2 && RetriableStream.this.q.incrementAndGet() > 1000) {
                RetriableStream retriableStream4 = RetriableStream.this;
                Runnable runnableP2 = retriableStream4.p(this.f24093a);
                if (runnableP2 != null) {
                    retriableStream4.b.execute(runnableP2);
                }
                if (RetriableStream.this.o.f == this.f24093a) {
                    RetriableStream.this.y(Status.m.i("Too many transparent retries. Might be a bug in gRPC").h(status.a()), rpcProgress, metadata);
                    return;
                }
                return;
            }
            if (RetriableStream.this.o.f == null) {
                if (rpcProgress == rpcProgress2 || (rpcProgress == ClientStreamListener.RpcProgress.e && RetriableStream.this.p.compareAndSet(false, true))) {
                    final Substream substreamQ = RetriableStream.this.q(this.f24093a.d, true);
                    if (substreamQ == null) {
                        return;
                    }
                    RetriableStream retriableStream5 = RetriableStream.this;
                    if (retriableStream5.h) {
                        synchronized (retriableStream5.i) {
                            RetriableStream retriableStream6 = RetriableStream.this;
                            retriableStream6.o = retriableStream6.o.c(this.f24093a, substreamQ);
                        }
                    }
                    RetriableStream.this.b.execute(new Runnable() { // from class: io.grpc.internal.RetriableStream.Sublistener.3
                        @Override // java.lang.Runnable
                        public final void run() {
                            RetriableStream retriableStream7 = RetriableStream.this;
                            Metadata.Key key = RetriableStream.A;
                            retriableStream7.s(substreamQ);
                        }
                    });
                    return;
                }
                if (rpcProgress == ClientStreamListener.RpcProgress.f) {
                    RetriableStream retriableStream7 = RetriableStream.this;
                    if (retriableStream7.h) {
                        retriableStream7.t();
                    }
                } else {
                    RetriableStream.this.p.set(true);
                    RetriableStream retriableStream8 = RetriableStream.this;
                    if (retriableStream8.h) {
                        String str = (String) metadata.c(RetriableStream.B);
                        if (str != null) {
                            try {
                                numValueOf = Integer.valueOf(str);
                            } catch (NumberFormatException unused) {
                            }
                        } else {
                            numValueOf = null;
                        }
                        RetriableStream retriableStream9 = RetriableStream.this;
                        boolean zContains = retriableStream9.g.c.contains(status.f23971a);
                        boolean z2 = (retriableStream9.m == null || (!zContains && (numValueOf == null || numValueOf.intValue() >= 0))) ? false : !retriableStream9.m.a();
                        if (zContains && !z2 && !status.f() && numValueOf != null && numValueOf.intValue() > 0) {
                            numValueOf = 0;
                        }
                        boolean z3 = zContains && !z2;
                        if (z3) {
                            RetriableStream.o(RetriableStream.this, numValueOf);
                        }
                        synchronized (RetriableStream.this.i) {
                            try {
                                RetriableStream retriableStream10 = RetriableStream.this;
                                retriableStream10.o = retriableStream10.o.b(this.f24093a);
                                if (z3) {
                                    RetriableStream retriableStream11 = RetriableStream.this;
                                    if (!retriableStream11.u(retriableStream11.o)) {
                                        if (!RetriableStream.this.o.d.isEmpty()) {
                                        }
                                    }
                                    return;
                                }
                            } finally {
                            }
                        }
                    } else {
                        RetryPolicy retryPolicy = retriableStream8.f;
                        long nanos = 0;
                        if (retryPolicy == null) {
                            retryPlan = new RetryPlan(0L, false);
                        } else {
                            boolean zContains2 = retryPolicy.f.contains(status.f23971a);
                            String str2 = (String) metadata.c(RetriableStream.B);
                            if (str2 != null) {
                                try {
                                    numValueOf = Integer.valueOf(str2);
                                } catch (NumberFormatException unused2) {
                                }
                            } else {
                                numValueOf = null;
                            }
                            boolean z4 = (retriableStream8.m == null || (!zContains2 && (numValueOf == null || numValueOf.intValue() >= 0))) ? false : !retriableStream8.m.a();
                            if (retriableStream8.f.f24096a <= this.f24093a.d + 1 || z4) {
                                z = false;
                                retryPlan = new RetryPlan(nanos, z);
                            } else {
                                if (numValueOf == null) {
                                    if (zContains2) {
                                        nanos = (long) (RetriableStream.D.nextDouble() * retriableStream8.x);
                                        double d = retriableStream8.x;
                                        RetryPolicy retryPolicy2 = retriableStream8.f;
                                        retriableStream8.x = Math.min((long) (d * retryPolicy2.d), retryPolicy2.c);
                                        z = true;
                                    }
                                    z = false;
                                } else {
                                    if (numValueOf.intValue() >= 0) {
                                        nanos = TimeUnit.MILLISECONDS.toNanos(numValueOf.intValue());
                                        retriableStream8.x = retriableStream8.f.b;
                                        z = true;
                                    }
                                    z = false;
                                }
                                retryPlan = new RetryPlan(nanos, z);
                            }
                        }
                        if (retryPlan.f24089a) {
                            final Substream substreamQ2 = RetriableStream.this.q(this.f24093a.d + 1, false);
                            if (substreamQ2 == null) {
                                return;
                            }
                            synchronized (RetriableStream.this.i) {
                                retriableStream = RetriableStream.this;
                                futureCanceller = new FutureCanceller(retriableStream.i);
                                retriableStream.v = futureCanceller;
                            }
                            futureCanceller.a(retriableStream.d.schedule(new Runnable() { // from class: io.grpc.internal.RetriableStream.Sublistener.1RetryBackoffRunnable
                                @Override // java.lang.Runnable
                                public final void run() {
                                    RetriableStream.this.b.execute(new Runnable() { // from class: io.grpc.internal.RetriableStream.Sublistener.1RetryBackoffRunnable.1
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            C1RetryBackoffRunnable c1RetryBackoffRunnable = C1RetryBackoffRunnable.this;
                                            RetriableStream retriableStream12 = RetriableStream.this;
                                            Substream substream2 = substreamQ2;
                                            Metadata.Key key = RetriableStream.A;
                                            retriableStream12.s(substream2);
                                        }
                                    });
                                }
                            }, retryPlan.b, TimeUnit.NANOSECONDS));
                            return;
                        }
                    }
                }
            }
            RetriableStream retriableStream12 = RetriableStream.this;
            Runnable runnableP3 = retriableStream12.p(this.f24093a);
            if (runnableP3 != null) {
                retriableStream12.b.execute(runnableP3);
            }
            if (RetriableStream.this.o.f == this.f24093a) {
                RetriableStream.this.y(status, rpcProgress, metadata);
            }
        }

        @Override // io.grpc.internal.StreamListener
        public final void onReady() {
            RetriableStream retriableStream = RetriableStream.this;
            if (retriableStream.isReady()) {
                retriableStream.c.execute(new Runnable() { // from class: io.grpc.internal.RetriableStream.Sublistener.5
                    @Override // java.lang.Runnable
                    public final void run() {
                        RetriableStream retriableStream2 = RetriableStream.this;
                        if (retriableStream2.z) {
                            return;
                        }
                        retriableStream2.u.onReady();
                    }
                });
            }
        }
    }

    public static final class Substream {

        /* renamed from: a, reason: collision with root package name */
        public ClientStream f24094a;
        public boolean b;
        public boolean c;
        public final int d;

        public Substream(int i) {
            this.d = i;
        }
    }

    public static final class Throttle {

        /* renamed from: a, reason: collision with root package name */
        public final int f24095a;
        public final int b;
        public final int c;
        public final AtomicInteger d;

        public Throttle(float f, float f2) {
            AtomicInteger atomicInteger = new AtomicInteger();
            this.d = atomicInteger;
            this.c = (int) (f2 * 1000.0f);
            int i = (int) (f * 1000.0f);
            this.f24095a = i;
            this.b = i / 2;
            atomicInteger.set(i);
        }

        public final boolean a() {
            AtomicInteger atomicInteger;
            int i;
            int i2;
            do {
                atomicInteger = this.d;
                i = atomicInteger.get();
                if (i == 0) {
                    return false;
                }
                i2 = i - 1000;
            } while (!atomicInteger.compareAndSet(i, Math.max(i2, 0)));
            return i2 > this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Throttle)) {
                return false;
            }
            Throttle throttle = (Throttle) obj;
            return this.f24095a == throttle.f24095a && this.c == throttle.c;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Integer.valueOf(this.f24095a), Integer.valueOf(this.c)});
        }
    }

    static {
        Metadata.AsciiMarshaller asciiMarshaller = Metadata.d;
        A = Metadata.Key.a("grpc-previous-rpc-attempts", asciiMarshaller);
        B = Metadata.Key.a("grpc-retry-pushback-ms", asciiMarshaller);
        C = Status.f.i("Stream thrown away because RetriableStream committed");
        D = new Random();
    }

    public RetriableStream(MethodDescriptor methodDescriptor, Metadata metadata, ChannelBufferMeter channelBufferMeter, long j, long j2, Executor executor, ScheduledExecutorService scheduledExecutorService, RetryPolicy retryPolicy, HedgingPolicy hedgingPolicy, Throttle throttle) {
        this.f24079a = methodDescriptor;
        this.j = channelBufferMeter;
        this.k = j;
        this.l = j2;
        this.b = executor;
        this.d = scheduledExecutorService;
        this.e = metadata;
        this.f = retryPolicy;
        if (retryPolicy != null) {
            this.x = retryPolicy.b;
        }
        this.g = hedgingPolicy;
        Preconditions.f("Should not provide both retryPolicy and hedgingPolicy", retryPolicy == null || hedgingPolicy == null);
        this.h = hedgingPolicy != null;
        this.m = throttle;
    }

    public static void o(RetriableStream retriableStream, Integer num) {
        if (num == null) {
            return;
        }
        if (num.intValue() < 0) {
            retriableStream.t();
            return;
        }
        synchronized (retriableStream.i) {
            try {
                FutureCanceller futureCanceller = retriableStream.w;
                if (futureCanceller == null) {
                    return;
                }
                futureCanceller.c = true;
                Future future = futureCanceller.b;
                FutureCanceller futureCanceller2 = new FutureCanceller(retriableStream.i);
                retriableStream.w = futureCanceller2;
                if (future != null) {
                    future.cancel(false);
                }
                futureCanceller2.a(retriableStream.d.schedule(new HedgingRunnable(futureCanceller2), num.intValue(), TimeUnit.MILLISECONDS));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.grpc.internal.Stream
    public final void a(final Compressor compressor) {
        r(new BufferEntry() { // from class: io.grpc.internal.RetriableStream.1CompressorEntry
            @Override // io.grpc.internal.RetriableStream.BufferEntry
            public final void a(Substream substream) {
                substream.f24094a.a(compressor);
            }
        });
    }

    @Override // io.grpc.internal.Stream
    public final void b(int i) {
        State state = this.o;
        if (state.f24092a) {
            state.f.f24094a.b(1);
        } else {
            r(new C1RequestEntry());
        }
    }

    @Override // io.grpc.internal.ClientStream
    public final void c(final int i) {
        r(new BufferEntry() { // from class: io.grpc.internal.RetriableStream.1MaxInboundMessageSizeEntry
            @Override // io.grpc.internal.RetriableStream.BufferEntry
            public final void a(Substream substream) {
                substream.f24094a.c(i);
            }
        });
    }

    @Override // io.grpc.internal.ClientStream
    public final void d(final int i) {
        r(new BufferEntry() { // from class: io.grpc.internal.RetriableStream.1MaxOutboundMessageSizeEntry
            @Override // io.grpc.internal.RetriableStream.BufferEntry
            public final void a(Substream substream) {
                substream.f24094a.d(i);
            }
        });
    }

    @Override // io.grpc.internal.ClientStream
    public final void e(Status status) {
        Substream substream;
        Substream substream2 = new Substream(0);
        substream2.f24094a = new NoopClientStream();
        Runnable runnableP = p(substream2);
        if (runnableP != null) {
            synchronized (this.i) {
                this.o = this.o.e(substream2);
            }
            ((C1CommitTask) runnableP).run();
            y(status, ClientStreamListener.RpcProgress.d, new Metadata());
            return;
        }
        synchronized (this.i) {
            try {
                if (this.o.c.contains(this.o.f)) {
                    substream = this.o.f;
                } else {
                    this.y = status;
                    substream = null;
                }
                State state = this.o;
                this.o = new State(state.b, state.c, state.d, state.f, true, state.f24092a, state.h, state.e);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (substream != null) {
            substream.f24094a.e(status);
        }
    }

    @Override // io.grpc.internal.ClientStream
    public final void f() {
        r(new C1AuthorityEntry());
    }

    @Override // io.grpc.internal.Stream
    public final void flush() {
        State state = this.o;
        if (state.f24092a) {
            state.f.f24094a.flush();
        } else {
            r(new C1FlushEntry());
        }
    }

    @Override // io.grpc.internal.Stream
    public final void g(InputStream inputStream) {
        throw new IllegalStateException("RetriableStream.writeMessage() should not be called directly");
    }

    @Override // io.grpc.internal.Stream
    public final void h() {
        r(new C1OptimizeDirectEntry());
    }

    @Override // io.grpc.internal.ClientStream
    public final void i() {
        r(new C1HalfCloseEntry());
    }

    @Override // io.grpc.internal.Stream
    public final boolean isReady() {
        Iterator it = this.o.c.iterator();
        while (it.hasNext()) {
            if (((Substream) it.next()).f24094a.isReady()) {
                return true;
            }
        }
        return false;
    }

    @Override // io.grpc.internal.ClientStream
    public final void j(final DecompressorRegistry decompressorRegistry) {
        r(new BufferEntry() { // from class: io.grpc.internal.RetriableStream.1DecompressorRegistryEntry
            @Override // io.grpc.internal.RetriableStream.BufferEntry
            public final void a(Substream substream) {
                substream.f24094a.j(decompressorRegistry);
            }
        });
    }

    @Override // io.grpc.internal.ClientStream
    public final void k() {
        r(new C1FullStreamDecompressionEntry());
    }

    @Override // io.grpc.internal.ClientStream
    public final void l(InsightBuilder insightBuilder) {
        State state;
        synchronized (this.i) {
            insightBuilder.a(this.n, "closed");
            state = this.o;
        }
        if (state.f != null) {
            InsightBuilder insightBuilder2 = new InsightBuilder();
            state.f.f24094a.l(insightBuilder2);
            insightBuilder.a(insightBuilder2, "committed");
            return;
        }
        InsightBuilder insightBuilder3 = new InsightBuilder();
        for (Substream substream : state.c) {
            InsightBuilder insightBuilder4 = new InsightBuilder();
            substream.f24094a.l(insightBuilder4);
            insightBuilder3.f24022a.add(String.valueOf(insightBuilder4));
        }
        insightBuilder.a(insightBuilder3, "open");
    }

    @Override // io.grpc.internal.ClientStream
    public final void m(final Deadline deadline) {
        r(new BufferEntry() { // from class: io.grpc.internal.RetriableStream.1DeadlineEntry
            @Override // io.grpc.internal.RetriableStream.BufferEntry
            public final void a(Substream substream) {
                substream.f24094a.m(deadline);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0058  */
    @Override // io.grpc.internal.ClientStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n(io.grpc.internal.ClientStreamListener r7) {
        /*
            r6 = this;
            r6.u = r7
            io.grpc.Status r7 = r6.x()
            if (r7 == 0) goto Lc
            r6.e(r7)
            return
        Lc:
            java.lang.Object r7 = r6.i
            monitor-enter(r7)
            io.grpc.internal.RetriableStream$State r0 = r6.o     // Catch: java.lang.Throwable -> L77
            java.util.List r0 = r0.b     // Catch: java.lang.Throwable -> L77
            io.grpc.internal.RetriableStream$StartEntry r1 = new io.grpc.internal.RetriableStream$StartEntry     // Catch: java.lang.Throwable -> L77
            r1.<init>()     // Catch: java.lang.Throwable -> L77
            r0.add(r1)     // Catch: java.lang.Throwable -> L77
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L77
            r7 = 0
            io.grpc.internal.RetriableStream$Substream r0 = r6.q(r7, r7)
            if (r0 != 0) goto L24
            return
        L24:
            boolean r1 = r6.h
            if (r1 == 0) goto L73
            java.lang.Object r1 = r6.i
            monitor-enter(r1)
            io.grpc.internal.RetriableStream$State r2 = r6.o     // Catch: java.lang.Throwable -> L56
            io.grpc.internal.RetriableStream$State r2 = r2.a(r0)     // Catch: java.lang.Throwable -> L56
            r6.o = r2     // Catch: java.lang.Throwable -> L56
            io.grpc.internal.RetriableStream$State r2 = r6.o     // Catch: java.lang.Throwable -> L56
            boolean r2 = r6.u(r2)     // Catch: java.lang.Throwable -> L56
            if (r2 == 0) goto L58
            io.grpc.internal.RetriableStream$Throttle r2 = r6.m     // Catch: java.lang.Throwable -> L56
            if (r2 == 0) goto L4c
            java.util.concurrent.atomic.AtomicInteger r3 = r2.d     // Catch: java.lang.Throwable -> L56
            int r3 = r3.get()     // Catch: java.lang.Throwable -> L56
            int r2 = r2.b     // Catch: java.lang.Throwable -> L56
            if (r3 <= r2) goto L4a
            r7 = 1
        L4a:
            if (r7 == 0) goto L58
        L4c:
            io.grpc.internal.RetriableStream$FutureCanceller r7 = new io.grpc.internal.RetriableStream$FutureCanceller     // Catch: java.lang.Throwable -> L56
            java.lang.Object r2 = r6.i     // Catch: java.lang.Throwable -> L56
            r7.<init>(r2)     // Catch: java.lang.Throwable -> L56
            r6.w = r7     // Catch: java.lang.Throwable -> L56
            goto L59
        L56:
            r7 = move-exception
            goto L71
        L58:
            r7 = 0
        L59:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L56
            if (r7 == 0) goto L73
            java.util.concurrent.ScheduledExecutorService r1 = r6.d
            io.grpc.internal.RetriableStream$HedgingRunnable r2 = new io.grpc.internal.RetriableStream$HedgingRunnable
            r2.<init>(r7)
            io.grpc.internal.HedgingPolicy r3 = r6.g
            long r3 = r3.b
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.NANOSECONDS
            java.util.concurrent.ScheduledFuture r1 = r1.schedule(r2, r3, r5)
            r7.a(r1)
            goto L73
        L71:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L56
            throw r7
        L73:
            r6.s(r0)
            return
        L77:
            r0 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L77
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.RetriableStream.n(io.grpc.internal.ClientStreamListener):void");
    }

    public final Runnable p(Substream substream) {
        List list;
        boolean z;
        Collection collectionSingleton;
        Future future;
        Future future2;
        synchronized (this.i) {
            try {
                if (this.o.f != null) {
                    return null;
                }
                Collection collection = this.o.c;
                State state = this.o;
                Preconditions.q("Already committed", state.f == null);
                List list2 = state.b;
                if (state.c.contains(substream)) {
                    list = null;
                    collectionSingleton = Collections.singleton(substream);
                    z = true;
                } else {
                    list = list2;
                    z = false;
                    collectionSingleton = Collections.EMPTY_LIST;
                }
                this.o = new State(list, collectionSingleton, state.d, substream, state.g, z, state.h, state.e);
                this.j.f24087a.addAndGet(-this.t);
                FutureCanceller futureCanceller = this.v;
                if (futureCanceller != null) {
                    futureCanceller.c = true;
                    Future future3 = futureCanceller.b;
                    this.v = null;
                    future = future3;
                } else {
                    future = null;
                }
                FutureCanceller futureCanceller2 = this.w;
                if (futureCanceller2 != null) {
                    futureCanceller2.c = true;
                    Future future4 = futureCanceller2.b;
                    this.w = null;
                    future2 = future4;
                } else {
                    future2 = null;
                }
                return new C1CommitTask(collection, substream, future, future2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Substream q(int i, boolean z) {
        AtomicInteger atomicInteger;
        int i2;
        do {
            atomicInteger = this.r;
            i2 = atomicInteger.get();
            if (i2 < 0) {
                return null;
            }
        } while (!atomicInteger.compareAndSet(i2, i2 + 1));
        Substream substream = new Substream(i);
        final BufferSizeTracer bufferSizeTracer = new BufferSizeTracer(substream);
        ClientStreamTracer.Factory factory = new ClientStreamTracer.Factory() { // from class: io.grpc.internal.RetriableStream.2
            @Override // io.grpc.ClientStreamTracer.Factory
            public final ClientStreamTracer a(ClientStreamTracer.StreamInfo streamInfo, Metadata metadata) {
                return bufferSizeTracer;
            }
        };
        Metadata metadata = new Metadata();
        metadata.d(this.e);
        if (i > 0) {
            metadata.f(A, String.valueOf(i));
        }
        substream.f24094a = v(metadata, factory, i, z);
        return substream;
    }

    public final void r(BufferEntry bufferEntry) {
        Collection collection;
        synchronized (this.i) {
            try {
                if (!this.o.f24092a) {
                    this.o.b.add(bufferEntry);
                }
                collection = this.o.c;
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            bufferEntry.a((Substream) it.next());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0036, code lost:
    
        if (r1 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0038, code lost:
    
        r8.c.execute(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003e, code lost:
    
        if (r2 != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0040, code lost:
    
        r9.f24094a.n(new io.grpc.internal.RetriableStream.Sublistener(r8, r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004a, code lost:
    
        r0 = r9.f24094a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0050, code lost:
    
        if (r8.o.f != r9) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0052, code lost:
    
        r9 = r8.y;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0055, code lost:
    
        r9 = io.grpc.internal.RetriableStream.C;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0057, code lost:
    
        r0.e(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x005a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0088, code lost:
    
        r0 = r3.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0090, code lost:
    
        if (r0.hasNext() == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0092, code lost:
    
        r4 = (io.grpc.internal.RetriableStream.BufferEntry) r0.next();
        r4.a(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x009d, code lost:
    
        if ((r4 instanceof io.grpc.internal.RetriableStream.StartEntry) == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x009f, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a0, code lost:
    
        r4 = r8.o;
        r5 = r4.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a4, code lost:
    
        if (r5 == null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00a6, code lost:
    
        if (r5 == r9) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00ab, code lost:
    
        if (r4.g == false) goto L67;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void s(io.grpc.internal.RetriableStream.Substream r9) {
        /*
            r8 = this;
            r0 = 0
            r1 = 0
            r2 = r0
            r3 = r1
        L4:
            java.lang.Object r4 = r8.i
            monitor-enter(r4)
            io.grpc.internal.RetriableStream$State r5 = r8.o     // Catch: java.lang.Throwable -> L11
            io.grpc.internal.RetriableStream$Substream r6 = r5.f     // Catch: java.lang.Throwable -> L11
            if (r6 == 0) goto L14
            if (r6 == r9) goto L14
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L11
            goto L36
        L11:
            r9 = move-exception
            goto Lb0
        L14:
            boolean r6 = r5.g     // Catch: java.lang.Throwable -> L11
            if (r6 == 0) goto L1a
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L11
            goto L36
        L1a:
            java.util.List r6 = r5.b     // Catch: java.lang.Throwable -> L11
            int r6 = r6.size()     // Catch: java.lang.Throwable -> L11
            if (r0 != r6) goto L5b
            io.grpc.internal.RetriableStream$State r0 = r5.e(r9)     // Catch: java.lang.Throwable -> L11
            r8.o = r0     // Catch: java.lang.Throwable -> L11
            boolean r0 = r8.isReady()     // Catch: java.lang.Throwable -> L11
            if (r0 != 0) goto L30
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L11
            return
        L30:
            io.grpc.internal.RetriableStream$3 r1 = new io.grpc.internal.RetriableStream$3     // Catch: java.lang.Throwable -> L11
            r1.<init>()     // Catch: java.lang.Throwable -> L11
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L11
        L36:
            if (r1 == 0) goto L3e
            io.grpc.SynchronizationContext r9 = r8.c
            r9.execute(r1)
            return
        L3e:
            if (r2 != 0) goto L4a
            io.grpc.internal.ClientStream r0 = r9.f24094a
            io.grpc.internal.RetriableStream$Sublistener r1 = new io.grpc.internal.RetriableStream$Sublistener
            r1.<init>(r9)
            r0.n(r1)
        L4a:
            io.grpc.internal.ClientStream r0 = r9.f24094a
            io.grpc.internal.RetriableStream$State r1 = r8.o
            io.grpc.internal.RetriableStream$Substream r1 = r1.f
            if (r1 != r9) goto L55
            io.grpc.Status r9 = r8.y
            goto L57
        L55:
            io.grpc.Status r9 = io.grpc.internal.RetriableStream.C
        L57:
            r0.e(r9)
            return
        L5b:
            boolean r6 = r9.b     // Catch: java.lang.Throwable -> L11
            if (r6 == 0) goto L61
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L11
            return
        L61:
            int r6 = r0 + 128
            java.util.List r7 = r5.b     // Catch: java.lang.Throwable -> L11
            int r7 = r7.size()     // Catch: java.lang.Throwable -> L11
            int r6 = java.lang.Math.min(r6, r7)     // Catch: java.lang.Throwable -> L11
            if (r3 != 0) goto L7b
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L11
            java.util.List r5 = r5.b     // Catch: java.lang.Throwable -> L11
            java.util.List r0 = r5.subList(r0, r6)     // Catch: java.lang.Throwable -> L11
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L11
            goto L87
        L7b:
            r3.clear()     // Catch: java.lang.Throwable -> L11
            java.util.List r5 = r5.b     // Catch: java.lang.Throwable -> L11
            java.util.List r0 = r5.subList(r0, r6)     // Catch: java.lang.Throwable -> L11
            r3.addAll(r0)     // Catch: java.lang.Throwable -> L11
        L87:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L11
            java.util.Iterator r0 = r3.iterator()
        L8c:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto Lad
            java.lang.Object r4 = r0.next()
            io.grpc.internal.RetriableStream$BufferEntry r4 = (io.grpc.internal.RetriableStream.BufferEntry) r4
            r4.a(r9)
            boolean r4 = r4 instanceof io.grpc.internal.RetriableStream.StartEntry
            if (r4 == 0) goto La0
            r2 = 1
        La0:
            io.grpc.internal.RetriableStream$State r4 = r8.o
            io.grpc.internal.RetriableStream$Substream r5 = r4.f
            if (r5 == 0) goto La9
            if (r5 == r9) goto La9
            goto Lad
        La9:
            boolean r4 = r4.g
            if (r4 == 0) goto L8c
        Lad:
            r0 = r6
            goto L4
        Lb0:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L11
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.RetriableStream.s(io.grpc.internal.RetriableStream$Substream):void");
    }

    public final void t() {
        Future future;
        synchronized (this.i) {
            try {
                FutureCanceller futureCanceller = this.w;
                future = null;
                if (futureCanceller != null) {
                    futureCanceller.c = true;
                    Future future2 = futureCanceller.b;
                    this.w = null;
                    future = future2;
                }
                State state = this.o;
                if (!state.h) {
                    state = new State(state.b, state.c, state.d, state.f, state.g, state.f24092a, true, state.e);
                }
                this.o = state;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (future != null) {
            future.cancel(false);
        }
    }

    public final boolean u(State state) {
        return state.f == null && state.e < this.g.f24019a && !state.h;
    }

    public abstract ClientStream v(Metadata metadata, ClientStreamTracer.Factory factory, int i, boolean z);

    public abstract void w();

    public abstract Status x();

    public final void y(final Status status, final ClientStreamListener.RpcProgress rpcProgress, final Metadata metadata) {
        this.s = new SavedCloseMasterListenerReason(status, rpcProgress, metadata);
        if (this.r.addAndGet(Integer.MIN_VALUE) == Integer.MIN_VALUE) {
            this.c.execute(new Runnable() { // from class: io.grpc.internal.RetriableStream.4
                @Override // java.lang.Runnable
                public final void run() {
                    RetriableStream retriableStream = RetriableStream.this;
                    retriableStream.z = true;
                    retriableStream.u.c(status, rpcProgress, metadata);
                }
            });
        }
    }

    public final void z(final GeneratedMessageLite generatedMessageLite) {
        State state = this.o;
        if (state.f24092a) {
            state.f.f24094a.g(this.f24079a.d.a(generatedMessageLite));
        } else {
            r(new BufferEntry() { // from class: io.grpc.internal.RetriableStream.1SendMessageEntry
                @Override // io.grpc.internal.RetriableStream.BufferEntry
                public final void a(Substream substream) {
                    ClientStream clientStream = substream.f24094a;
                    MethodDescriptor methodDescriptor = RetriableStream.this.f24079a;
                    clientStream.g(methodDescriptor.d.a(generatedMessageLite));
                    substream.f24094a.flush();
                }
            });
        }
    }
}
