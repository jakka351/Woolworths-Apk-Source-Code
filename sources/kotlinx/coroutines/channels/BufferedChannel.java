package kotlinx.coroutines.channels;

import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.llqqqql;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CancellableContinuationKt;
import kotlinx.coroutines.Waiter;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.internal.ConcurrentLinkedListKt;
import kotlinx.coroutines.internal.Segment;
import kotlinx.coroutines.internal.SegmentOrClosed;
import kotlinx.coroutines.internal.StackTraceRecoveryKt;
import kotlinx.coroutines.internal.Symbol;
import kotlinx.coroutines.selects.SelectClause1;
import kotlinx.coroutines.selects.SelectClause1Impl;
import kotlinx.coroutines.selects.SelectImplementation;
import kotlinx.coroutines.selects.SelectInstance;
import kotlinx.coroutines.selects.TrySelectDetailedResult;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0002\u0010\u0011R\u000b\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004R\u000b\u0010\u0005\u001a\u00020\u00038\u0002X\u0082\u0004R\u000b\u0010\u0006\u001a\u00020\u00038\u0002X\u0082\u0004R\u000b\u0010\u0007\u001a\u00020\u00038\u0002X\u0082\u0004R\u0017\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t0\b8\u0002X\u0082\u0004R\u0017\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t0\b8\u0002X\u0082\u0004R\u0017\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t0\b8\u0002X\u0082\u0004R\u0013\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\b8\u0002X\u0082\u0004R\u0013\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\b8\u0002X\u0082\u0004¨\u0006\u0012"}, d2 = {"Lkotlinx/coroutines/channels/BufferedChannel;", "E", "Lkotlinx/coroutines/channels/Channel;", "Lkotlinx/atomicfu/AtomicLong;", "sendersAndCloseStatus", "receivers", "bufferEnd", "completedExpandBuffersAndPauseFlag", "Lkotlinx/atomicfu/AtomicRef;", "Lkotlinx/coroutines/channels/ChannelSegment;", "sendSegment", "receiveSegment", "bufferEndSegment", "", "_closeCause", "closeHandler", "SendBroadcast", "BufferedChannelIterator", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public class BufferedChannel<E> implements Channel<E> {
    public static final /* synthetic */ AtomicLongFieldUpdater e = AtomicLongFieldUpdater.newUpdater(BufferedChannel.class, "sendersAndCloseStatus$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater f = AtomicLongFieldUpdater.newUpdater(BufferedChannel.class, "receivers$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater g = AtomicLongFieldUpdater.newUpdater(BufferedChannel.class, "bufferEnd$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater h = AtomicLongFieldUpdater.newUpdater(BufferedChannel.class, "completedExpandBuffersAndPauseFlag$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater i = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "sendSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater j = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "receiveSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater k = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "bufferEndSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater l = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "_closeCause$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater m = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "closeHandler$volatile");
    private volatile /* synthetic */ Object _closeCause$volatile;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    public final int d;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/channels/BufferedChannel$BufferedChannelIterator;", "Lkotlinx/coroutines/channels/ChannelIterator;", "Lkotlinx/coroutines/Waiter;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public final class BufferedChannelIterator implements ChannelIterator<E>, Waiter {
        public Object d = BufferedChannelKt.p;
        public CancellableContinuationImpl e;

        public BufferedChannelIterator() {
        }

        @Override // kotlinx.coroutines.Waiter
        public final void a(Segment segment, int i) {
            CancellableContinuationImpl cancellableContinuationImpl = this.e;
            if (cancellableContinuationImpl != null) {
                cancellableContinuationImpl.a(segment, i);
            }
        }

        @Override // kotlinx.coroutines.channels.ChannelIterator
        public final Object b(Continuation continuation) throws Throwable {
            ChannelSegment channelSegment;
            ChannelSegment channelSegment2;
            Object obj = this.d;
            boolean z = true;
            if (obj == BufferedChannelKt.p || obj == BufferedChannelKt.l) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = BufferedChannel.j;
                BufferedChannel bufferedChannel = BufferedChannel.this;
                ChannelSegment channelSegment3 = (ChannelSegment) atomicReferenceFieldUpdater.get(bufferedChannel);
                while (!bufferedChannel.G()) {
                    long andIncrement = BufferedChannel.f.getAndIncrement(bufferedChannel);
                    long j = BufferedChannelKt.b;
                    long j2 = andIncrement / j;
                    int i = (int) (andIncrement % j);
                    if (channelSegment3.f != j2) {
                        ChannelSegment channelSegmentX = bufferedChannel.x(j2, channelSegment3);
                        if (channelSegmentX == null) {
                            continue;
                        } else {
                            channelSegment = channelSegmentX;
                        }
                    } else {
                        channelSegment = channelSegment3;
                    }
                    Object objV = bufferedChannel.V(channelSegment, i, andIncrement, null);
                    Symbol symbol = BufferedChannelKt.m;
                    if (objV == symbol) {
                        throw new IllegalStateException("unreachable");
                    }
                    Symbol symbol2 = BufferedChannelKt.o;
                    if (objV == symbol2) {
                        if (andIncrement < bufferedChannel.D()) {
                            channelSegment.a();
                        }
                        channelSegment3 = channelSegment;
                    } else {
                        if (objV == BufferedChannelKt.n) {
                            CancellableContinuationImpl cancellableContinuationImplB = CancellableContinuationKt.b(IntrinsicsKt.b(continuation));
                            try {
                                this.e = cancellableContinuationImplB;
                            } catch (Throwable th) {
                                th = th;
                            }
                            try {
                                Object objV2 = bufferedChannel.V(channelSegment, i, andIncrement, this);
                                if (objV2 == symbol) {
                                    bufferedChannel.N();
                                    a(channelSegment, i);
                                } else {
                                    if (objV2 == symbol2) {
                                        if (andIncrement < bufferedChannel.D()) {
                                            channelSegment.a();
                                        }
                                        ChannelSegment channelSegment4 = (ChannelSegment) BufferedChannel.j.get(bufferedChannel);
                                        while (true) {
                                            if (bufferedChannel.G()) {
                                                CancellableContinuationImpl cancellableContinuationImpl = this.e;
                                                Intrinsics.e(cancellableContinuationImpl);
                                                this.e = null;
                                                this.d = BufferedChannelKt.l;
                                                Throwable thA = bufferedChannel.A();
                                                if (thA == null) {
                                                    cancellableContinuationImpl.resumeWith(Boolean.FALSE);
                                                } else {
                                                    cancellableContinuationImpl.resumeWith(ResultKt.a(thA));
                                                }
                                            } else {
                                                long andIncrement2 = BufferedChannel.f.getAndIncrement(bufferedChannel);
                                                long j3 = BufferedChannelKt.b;
                                                long j4 = andIncrement2 / j3;
                                                int i2 = (int) (andIncrement2 % j3);
                                                if (channelSegment4.f != j4) {
                                                    ChannelSegment channelSegmentX2 = bufferedChannel.x(j4, channelSegment4);
                                                    if (channelSegmentX2 != null) {
                                                        channelSegment2 = channelSegmentX2;
                                                    }
                                                } else {
                                                    channelSegment2 = channelSegment4;
                                                }
                                                Object objV3 = bufferedChannel.V(channelSegment2, i2, andIncrement2, this);
                                                ChannelSegment channelSegment5 = channelSegment2;
                                                if (objV3 == BufferedChannelKt.m) {
                                                    bufferedChannel.N();
                                                    a(channelSegment5, i2);
                                                    break;
                                                }
                                                if (objV3 == BufferedChannelKt.o) {
                                                    if (andIncrement2 < bufferedChannel.D()) {
                                                        channelSegment5.a();
                                                    }
                                                    channelSegment4 = channelSegment5;
                                                } else {
                                                    if (objV3 == BufferedChannelKt.n) {
                                                        throw new IllegalStateException("unexpected");
                                                    }
                                                    channelSegment5.a();
                                                    this.d = objV3;
                                                    this.e = null;
                                                }
                                            }
                                        }
                                    } else {
                                        channelSegment.a();
                                        this.d = objV2;
                                        this.e = null;
                                    }
                                    cancellableContinuationImplB.q(Boolean.TRUE, null);
                                }
                                Object objN = cancellableContinuationImplB.n();
                                CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                                return objN;
                            } catch (Throwable th2) {
                                th = th2;
                                cancellableContinuationImplB.A();
                                throw th;
                            }
                        }
                        channelSegment.a();
                        this.d = objV;
                    }
                }
                this.d = BufferedChannelKt.l;
                Throwable thA2 = bufferedChannel.A();
                if (thA2 != null) {
                    int i3 = StackTraceRecoveryKt.f24729a;
                    throw thA2;
                }
                z = false;
            }
            return Boolean.valueOf(z);
        }

        @Override // kotlinx.coroutines.channels.ChannelIterator
        public final Object next() throws Throwable {
            Object obj = this.d;
            Symbol symbol = BufferedChannelKt.p;
            if (obj == symbol) {
                throw new IllegalStateException("`hasNext()` has not been invoked");
            }
            this.d = symbol;
            if (obj != BufferedChannelKt.l) {
                return obj;
            }
            AtomicLongFieldUpdater atomicLongFieldUpdater = BufferedChannel.e;
            Throwable thB = BufferedChannel.this.B();
            int i = StackTraceRecoveryKt.f24729a;
            throw thB;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/channels/BufferedChannel$SendBroadcast;", "Lkotlinx/coroutines/Waiter;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SendBroadcast implements Waiter {
        public final /* synthetic */ CancellableContinuationImpl d;
        public final CancellableContinuationImpl e;

        public SendBroadcast(CancellableContinuationImpl cancellableContinuationImpl) {
            this.d = cancellableContinuationImpl;
            this.e = cancellableContinuationImpl;
        }

        @Override // kotlinx.coroutines.Waiter
        public final void a(Segment segment, int i) {
            this.d.a(segment, i);
        }
    }

    public BufferedChannel(int i2) {
        this.d = i2;
        if (i2 < 0) {
            throw new IllegalArgumentException(YU.a.e(i2, "Invalid channel capacity: ", ", should be >=0").toString());
        }
        ChannelSegment channelSegment = BufferedChannelKt.f24697a;
        this.bufferEnd$volatile = i2 != 0 ? i2 != Integer.MAX_VALUE ? i2 : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag$volatile = g.get(this);
        ChannelSegment channelSegment2 = new ChannelSegment(0L, null, this, 3);
        this.sendSegment$volatile = channelSegment2;
        this.receiveSegment$volatile = channelSegment2;
        if (I()) {
            channelSegment2 = BufferedChannelKt.f24697a;
            Intrinsics.f(channelSegment2, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment$volatile = channelSegment2;
        this._closeCause$volatile = BufferedChannelKt.s;
    }

    public static void E(BufferedChannel bufferedChannel) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = h;
        if ((atomicLongFieldUpdater.addAndGet(bufferedChannel, 1L) & llqqqql.aaa006100610061a) != 0) {
            while ((atomicLongFieldUpdater.get(bufferedChannel) & llqqqql.aaa006100610061a) != 0) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object O(kotlinx.coroutines.channels.BufferedChannel r13, kotlin.coroutines.jvm.internal.ContinuationImpl r14) {
        /*
            boolean r0 = r14 instanceof kotlinx.coroutines.channels.BufferedChannel$receiveCatching$1
            if (r0 == 0) goto L14
            r0 = r14
            kotlinx.coroutines.channels.BufferedChannel$receiveCatching$1 r0 = (kotlinx.coroutines.channels.BufferedChannel$receiveCatching$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.r = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            kotlinx.coroutines.channels.BufferedChannel$receiveCatching$1 r0 = new kotlinx.coroutines.channels.BufferedChannel$receiveCatching$1
            r0.<init>(r13, r14)
            goto L12
        L1a:
            java.lang.Object r14 = r6.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r6.r
            r2 = 1
            if (r1 == 0) goto L35
            if (r1 != r2) goto L2d
            kotlin.ResultKt.b(r14)
            kotlinx.coroutines.channels.ChannelResult r14 = (kotlinx.coroutines.channels.ChannelResult) r14
            java.lang.Object r13 = r14.f24699a
            return r13
        L2d:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L35:
            kotlin.ResultKt.b(r14)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r14 = kotlinx.coroutines.channels.BufferedChannel.j
            java.lang.Object r14 = r14.get(r13)
            kotlinx.coroutines.channels.ChannelSegment r14 = (kotlinx.coroutines.channels.ChannelSegment) r14
        L40:
            boolean r1 = r13.G()
            if (r1 == 0) goto L50
            java.lang.Throwable r13 = r13.A()
            kotlinx.coroutines.channels.ChannelResult$Closed r14 = new kotlinx.coroutines.channels.ChannelResult$Closed
            r14.<init>(r13)
            return r14
        L50:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = kotlinx.coroutines.channels.BufferedChannel.f
            long r4 = r1.getAndIncrement(r13)
            int r1 = kotlinx.coroutines.channels.BufferedChannelKt.b
            long r7 = (long) r1
            long r9 = r4 / r7
            long r7 = r4 % r7
            int r3 = (int) r7
            long r7 = r14.f
            int r1 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r1 == 0) goto L6d
            kotlinx.coroutines.channels.ChannelSegment r1 = r13.x(r9, r14)
            if (r1 != 0) goto L6b
            goto L40
        L6b:
            r8 = r1
            goto L6e
        L6d:
            r8 = r14
        L6e:
            r12 = 0
            r7 = r13
            r9 = r3
            r10 = r4
            java.lang.Object r13 = r7.V(r8, r9, r10, r12)
            r1 = r7
            kotlinx.coroutines.internal.Symbol r14 = kotlinx.coroutines.channels.BufferedChannelKt.m
            if (r13 == r14) goto La0
            kotlinx.coroutines.internal.Symbol r14 = kotlinx.coroutines.channels.BufferedChannelKt.o
            if (r13 != r14) goto L8d
            long r13 = r1.D()
            int r13 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r13 >= 0) goto L8a
            r8.a()
        L8a:
            r13 = r1
            r14 = r8
            goto L40
        L8d:
            kotlinx.coroutines.internal.Symbol r14 = kotlinx.coroutines.channels.BufferedChannelKt.n
            if (r13 != r14) goto L9c
            r6.r = r2
            r2 = r8
            java.lang.Object r13 = r1.P(r2, r3, r4, r6)
            if (r13 != r0) goto L9b
            return r0
        L9b:
            return r13
        L9c:
            r8.a()
            return r13
        La0:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "unexpected"
            r13.<init>(r14)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BufferedChannel.O(kotlinx.coroutines.channels.BufferedChannel, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static final ChannelSegment a(BufferedChannel bufferedChannel, long j2, ChannelSegment channelSegment) {
        Object objA;
        BufferedChannel bufferedChannel2;
        ChannelSegment channelSegment2 = BufferedChannelKt.f24697a;
        BufferedChannelKt$createSegmentFunction$1 bufferedChannelKt$createSegmentFunction$1 = BufferedChannelKt$createSegmentFunction$1.d;
        loop0: while (true) {
            objA = ConcurrentLinkedListKt.a(channelSegment, j2, bufferedChannelKt$createSegmentFunction$1);
            if (!SegmentOrClosed.b(objA)) {
                Segment segmentA = SegmentOrClosed.a(objA);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i;
                    Segment segment = (Segment) atomicReferenceFieldUpdater.get(bufferedChannel);
                    if (segment.f >= segmentA.f) {
                        break loop0;
                    }
                    if (!segmentA.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(bufferedChannel, segment, segmentA)) {
                        if (atomicReferenceFieldUpdater.get(bufferedChannel) != segment) {
                            if (segmentA.f()) {
                                segmentA.e();
                            }
                        }
                    }
                    if (segment.f()) {
                        segment.e();
                    }
                }
            } else {
                break;
            }
        }
        boolean zB = SegmentOrClosed.b(objA);
        AtomicLongFieldUpdater atomicLongFieldUpdater = f;
        if (zB) {
            bufferedChannel.r();
            if (channelSegment.f * BufferedChannelKt.b < atomicLongFieldUpdater.get(bufferedChannel)) {
                channelSegment.a();
                return null;
            }
        } else {
            ChannelSegment channelSegment3 = (ChannelSegment) SegmentOrClosed.a(objA);
            long j3 = channelSegment3.f;
            if (j3 <= j2) {
                return channelSegment3;
            }
            long j4 = BufferedChannelKt.b * j3;
            while (true) {
                long j5 = e.get(bufferedChannel);
                long j6 = 1152921504606846975L & j5;
                if (j6 >= j4) {
                    bufferedChannel2 = bufferedChannel;
                    break;
                }
                bufferedChannel2 = bufferedChannel;
                if (e.compareAndSet(bufferedChannel2, j5, (((int) (j5 >> 60)) << 60) + j6)) {
                    break;
                }
                bufferedChannel = bufferedChannel2;
            }
            if (j3 * BufferedChannelKt.b < atomicLongFieldUpdater.get(bufferedChannel2)) {
                channelSegment3.a();
            }
        }
        return null;
    }

    public static final void e(BufferedChannel bufferedChannel, Object obj, CancellableContinuationImpl cancellableContinuationImpl) {
        cancellableContinuationImpl.resumeWith(ResultKt.a(bufferedChannel.C()));
    }

    public static final void f(BufferedChannel bufferedChannel, SelectInstance selectInstance) {
        ChannelSegment channelSegment;
        BufferedChannel bufferedChannel2;
        SelectInstance selectInstance2;
        int i2;
        bufferedChannel.getClass();
        ChannelSegment channelSegment2 = (ChannelSegment) j.get(bufferedChannel);
        while (!bufferedChannel.G()) {
            long andIncrement = f.getAndIncrement(bufferedChannel);
            long j2 = BufferedChannelKt.b;
            long j3 = andIncrement / j2;
            int i3 = (int) (andIncrement % j2);
            if (channelSegment2.f != j3) {
                ChannelSegment channelSegmentX = bufferedChannel.x(j3, channelSegment2);
                if (channelSegmentX == null) {
                    continue;
                } else {
                    channelSegment = channelSegmentX;
                    selectInstance2 = selectInstance;
                    i2 = i3;
                    bufferedChannel2 = bufferedChannel;
                }
            } else {
                channelSegment = channelSegment2;
                bufferedChannel2 = bufferedChannel;
                selectInstance2 = selectInstance;
                i2 = i3;
            }
            Object objV = bufferedChannel2.V(channelSegment, i2, andIncrement, selectInstance2);
            channelSegment2 = channelSegment;
            if (objV == BufferedChannelKt.m) {
                Waiter waiter = selectInstance2 instanceof Waiter ? (Waiter) selectInstance2 : null;
                if (waiter != null) {
                    bufferedChannel2.N();
                    waiter.a(channelSegment2, i2);
                    return;
                }
                return;
            }
            if (objV != BufferedChannelKt.o) {
                if (objV == BufferedChannelKt.n) {
                    throw new IllegalStateException("unexpected");
                }
                channelSegment2.a();
                selectInstance2.c(objV);
                return;
            }
            if (andIncrement < bufferedChannel2.D()) {
                channelSegment2.a();
            }
            bufferedChannel = bufferedChannel2;
            selectInstance = selectInstance2;
        }
        selectInstance.c(BufferedChannelKt.l);
    }

    public static final int g(BufferedChannel bufferedChannel, ChannelSegment channelSegment, int i2, Object obj, long j2, Object obj2, boolean z) {
        channelSegment.n(i2, obj);
        if (z) {
            return bufferedChannel.W(channelSegment, i2, obj, j2, obj2, z);
        }
        Object objL = channelSegment.l(i2);
        if (objL == null) {
            if (bufferedChannel.h(j2)) {
                if (channelSegment.k(i2, null, BufferedChannelKt.d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (channelSegment.k(i2, null, obj2)) {
                    return 2;
                }
            }
        } else if (objL instanceof Waiter) {
            channelSegment.n(i2, null);
            if (bufferedChannel.T(objL, obj)) {
                channelSegment.o(i2, BufferedChannelKt.i);
                bufferedChannel.M();
                return 0;
            }
            Symbol symbol = BufferedChannelKt.k;
            if (channelSegment.i.getAndSet((i2 * 2) + 1, symbol) == symbol) {
                return 5;
            }
            channelSegment.m(i2, true);
            return 5;
        }
        return bufferedChannel.W(channelSegment, i2, obj, j2, obj2, z);
    }

    public final Throwable A() {
        return (Throwable) l.get(this);
    }

    public final Throwable B() {
        Throwable thA = A();
        return thA == null ? new ClosedReceiveChannelException() : thA;
    }

    public final Throwable C() {
        Throwable thA = A();
        return thA == null ? new ClosedSendChannelException("Channel was closed") : thA;
    }

    public final long D() {
        return e.get(this) & 1152921504606846975L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00a2, code lost:
    
        r0 = (kotlinx.coroutines.channels.ChannelSegment) ((kotlinx.coroutines.internal.ConcurrentLinkedListNode) kotlinx.coroutines.internal.ConcurrentLinkedListNode.e.get(r0));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean F(long r14, boolean r16) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BufferedChannel.F(long, boolean):boolean");
    }

    public final boolean G() {
        return F(e.get(this), true);
    }

    public boolean H() {
        return false;
    }

    public final boolean I() {
        long j2 = g.get(this);
        return j2 == 0 || j2 == Long.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0011, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void J(long r5, kotlinx.coroutines.channels.ChannelSegment r7) {
        /*
            r4 = this;
        L0:
            long r0 = r7.f
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L11
            kotlinx.coroutines.internal.ConcurrentLinkedListNode r0 = r7.c()
            kotlinx.coroutines.channels.ChannelSegment r0 = (kotlinx.coroutines.channels.ChannelSegment) r0
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r7 = r0
            goto L0
        L11:
            boolean r5 = r7.d()
            if (r5 == 0) goto L22
            kotlinx.coroutines.internal.ConcurrentLinkedListNode r5 = r7.c()
            kotlinx.coroutines.channels.ChannelSegment r5 = (kotlinx.coroutines.channels.ChannelSegment) r5
            if (r5 != 0) goto L20
            goto L22
        L20:
            r7 = r5
            goto L11
        L22:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = kotlinx.coroutines.channels.BufferedChannel.k
            java.lang.Object r6 = r5.get(r4)
            kotlinx.coroutines.internal.Segment r6 = (kotlinx.coroutines.internal.Segment) r6
            long r0 = r6.f
            long r2 = r7.f
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L33
            goto L49
        L33:
            boolean r0 = r7.j()
            if (r0 != 0) goto L3a
            goto L11
        L3a:
            boolean r5 = kotlin.reflect.jvm.internal.impl.types.checker.a.z(r5, r4, r6, r7)
            if (r5 == 0) goto L4a
            boolean r5 = r6.f()
            if (r5 == 0) goto L49
            r6.e()
        L49:
            return
        L4a:
            boolean r5 = r7.f()
            if (r5 == 0) goto L22
            r7.e()
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BufferedChannel.J(long, kotlinx.coroutines.channels.ChannelSegment):void");
    }

    public void K() {
    }

    public final Object L(Object obj, Continuation continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt.b(continuation));
        cancellableContinuationImpl.o();
        cancellableContinuationImpl.resumeWith(ResultKt.a(C()));
        Object objN = cancellableContinuationImpl.n();
        return objN == CoroutineSingletons.d ? objN : Unit.f24250a;
    }

    public void M() {
    }

    public void N() {
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object P(kotlinx.coroutines.channels.ChannelSegment r15, int r16, long r17, kotlin.coroutines.jvm.internal.ContinuationImpl r19) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BufferedChannel.P(kotlinx.coroutines.channels.ChannelSegment, int, long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public void Q(SelectInstance selectInstance, Object obj) {
        ChannelSegment channelSegment;
        ChannelSegment channelSegment2 = (ChannelSegment) i.get(this);
        while (true) {
            long andIncrement = e.getAndIncrement(this);
            long j2 = andIncrement & 1152921504606846975L;
            boolean zF = F(andIncrement, false);
            int i2 = BufferedChannelKt.b;
            long j3 = i2;
            long j4 = j2 / j3;
            int i3 = (int) (j2 % j3);
            if (channelSegment2.f != j4) {
                ChannelSegment channelSegmentA = a(this, j4, channelSegment2);
                if (channelSegmentA != null) {
                    channelSegment = channelSegmentA;
                } else if (zF) {
                    selectInstance.c(BufferedChannelKt.l);
                    return;
                }
            } else {
                channelSegment = channelSegment2;
            }
            SelectInstance selectInstance2 = selectInstance;
            Object obj2 = obj;
            int iG = g(this, channelSegment, i3, obj2, j2, selectInstance2, zF);
            channelSegment2 = channelSegment;
            Unit unit = Unit.f24250a;
            if (iG == 0) {
                channelSegment2.a();
                selectInstance2.c(unit);
                return;
            }
            if (iG == 1) {
                selectInstance2.c(unit);
                return;
            }
            if (iG == 2) {
                if (zF) {
                    channelSegment2.i();
                    selectInstance2.c(BufferedChannelKt.l);
                    return;
                } else {
                    Waiter waiter = selectInstance2 instanceof Waiter ? (Waiter) selectInstance2 : null;
                    if (waiter != null) {
                        waiter.a(channelSegment2, i3 + i2);
                        return;
                    }
                    return;
                }
            }
            if (iG == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (iG == 4) {
                if (j2 < f.get(this)) {
                    channelSegment2.a();
                }
                selectInstance2.c(BufferedChannelKt.l);
                return;
            } else {
                if (iG == 5) {
                    channelSegment2.a();
                }
                obj = obj2;
                selectInstance = selectInstance2;
            }
        }
    }

    public final void R(Waiter waiter, boolean z) {
        if (waiter instanceof SendBroadcast) {
            ((SendBroadcast) waiter).e.resumeWith(Boolean.FALSE);
            return;
        }
        if (waiter instanceof CancellableContinuation) {
            ((Continuation) waiter).resumeWith(ResultKt.a(z ? B() : C()));
            return;
        }
        if (waiter instanceof ReceiveCatching) {
            ((ReceiveCatching) waiter).d.resumeWith(new ChannelResult(new ChannelResult.Closed(A())));
            return;
        }
        if (!(waiter instanceof BufferedChannelIterator)) {
            if (waiter instanceof SelectInstance) {
                ((SelectInstance) waiter).e(this, BufferedChannelKt.l);
                return;
            } else {
                throw new IllegalStateException(("Unexpected waiter: " + waiter).toString());
            }
        }
        BufferedChannelIterator bufferedChannelIterator = (BufferedChannelIterator) waiter;
        CancellableContinuationImpl cancellableContinuationImpl = bufferedChannelIterator.e;
        Intrinsics.e(cancellableContinuationImpl);
        bufferedChannelIterator.e = null;
        bufferedChannelIterator.d = BufferedChannelKt.l;
        Throwable thA = BufferedChannel.this.A();
        if (thA == null) {
            cancellableContinuationImpl.resumeWith(Boolean.FALSE);
        } else {
            cancellableContinuationImpl.resumeWith(ResultKt.a(thA));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x008e, code lost:
    
        r0.resumeWith(java.lang.Boolean.TRUE);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object S(kotlin.coroutines.Continuation r14) {
        /*
            r13 = this;
            kotlinx.coroutines.CancellableContinuationImpl r0 = new kotlinx.coroutines.CancellableContinuationImpl
            kotlin.coroutines.Continuation r14 = kotlin.coroutines.intrinsics.IntrinsicsKt.b(r14)
            r1 = 1
            r0.<init>(r1, r14)
            r0.o()
            kotlinx.coroutines.channels.BufferedChannel$SendBroadcast r8 = new kotlinx.coroutines.channels.BufferedChannel$SendBroadcast
            r8.<init>(r0)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r14 = kotlinx.coroutines.channels.BufferedChannel.i
            java.lang.Object r14 = r14.get(r13)
            kotlinx.coroutines.channels.ChannelSegment r14 = (kotlinx.coroutines.channels.ChannelSegment) r14
        L1a:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = kotlinx.coroutines.channels.BufferedChannel.e
            long r2 = r2.getAndIncrement(r13)
            r4 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r6 = r2 & r4
            r4 = 0
            boolean r9 = r13.F(r2, r4)
            int r10 = kotlinx.coroutines.channels.BufferedChannelKt.b
            long r2 = (long) r10
            long r4 = r6 / r2
            long r2 = r6 % r2
            int r2 = (int) r2
            long r11 = r14.f
            int r3 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r3 == 0) goto L49
            kotlinx.coroutines.channels.ChannelSegment r3 = a(r13, r4, r14)
            if (r3 != 0) goto L4a
            if (r9 == 0) goto L1a
            java.lang.Boolean r14 = java.lang.Boolean.FALSE
            r0.resumeWith(r14)
            r2 = r13
            goto L98
        L49:
            r3 = r14
        L4a:
            r5 = 0
            r4 = r2
            r2 = r13
            int r14 = g(r2, r3, r4, r5, r6, r8, r9)
            if (r14 == 0) goto L94
            if (r14 == r1) goto L8e
            r5 = 2
            if (r14 == r5) goto L82
            r4 = 3
            if (r14 == r4) goto L7a
            r4 = 4
            if (r14 == r4) goto L67
            r4 = 5
            if (r14 == r4) goto L62
            goto L65
        L62:
            r3.a()
        L65:
            r14 = r3
            goto L1a
        L67:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r14 = kotlinx.coroutines.channels.BufferedChannel.f
            long r4 = r14.get(r13)
            int r14 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r14 >= 0) goto L74
            r3.a()
        L74:
            java.lang.Boolean r14 = java.lang.Boolean.FALSE
            r0.resumeWith(r14)
            goto L98
        L7a:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "unexpected"
            r14.<init>(r0)
            throw r14
        L82:
            if (r9 == 0) goto L88
            r3.i()
            goto L74
        L88:
            int r14 = r4 + r10
            r8.a(r3, r14)
            goto L98
        L8e:
            java.lang.Boolean r14 = java.lang.Boolean.TRUE
            r0.resumeWith(r14)
            goto L98
        L94:
            r3.a()
            goto L8e
        L98:
            java.lang.Object r14 = r0.n()
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BufferedChannel.S(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final boolean T(Object obj, Object obj2) {
        if (obj instanceof SelectInstance) {
            return ((SelectInstance) obj).e(this, obj2);
        }
        if (obj instanceof ReceiveCatching) {
            return BufferedChannelKt.a(((ReceiveCatching) obj).d, new ChannelResult(obj2), null);
        }
        if (!(obj instanceof BufferedChannelIterator)) {
            if (obj instanceof CancellableContinuation) {
                return BufferedChannelKt.a((CancellableContinuation) obj, obj2, null);
            }
            throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
        }
        BufferedChannelIterator bufferedChannelIterator = (BufferedChannelIterator) obj;
        CancellableContinuationImpl cancellableContinuationImpl = bufferedChannelIterator.e;
        Intrinsics.e(cancellableContinuationImpl);
        bufferedChannelIterator.e = null;
        bufferedChannelIterator.d = obj2;
        return BufferedChannelKt.a(cancellableContinuationImpl, Boolean.TRUE, null);
    }

    public final boolean U(Object obj, ChannelSegment channelSegment, int i2) {
        if (obj instanceof CancellableContinuation) {
            return BufferedChannelKt.a((CancellableContinuation) obj, Unit.f24250a, null);
        }
        if (obj instanceof SelectInstance) {
            TrySelectDetailedResult trySelectDetailedResultL = ((SelectImplementation) obj).l(this);
            if (trySelectDetailedResultL == TrySelectDetailedResult.e) {
                channelSegment.n(i2, null);
            }
            return trySelectDetailedResultL == TrySelectDetailedResult.d;
        }
        if (obj instanceof SendBroadcast) {
            return BufferedChannelKt.a(((SendBroadcast) obj).e, Boolean.TRUE, null);
        }
        throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
    }

    public final Object V(ChannelSegment channelSegment, int i2, long j2, Object obj) {
        Object objL = channelSegment.l(i2);
        AtomicReferenceArray atomicReferenceArray = channelSegment.i;
        AtomicLongFieldUpdater atomicLongFieldUpdater = e;
        if (objL == null) {
            if (j2 >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return BufferedChannelKt.n;
                }
                if (channelSegment.k(i2, objL, obj)) {
                    w();
                    return BufferedChannelKt.m;
                }
            }
        } else if (objL == BufferedChannelKt.d && channelSegment.k(i2, objL, BufferedChannelKt.i)) {
            w();
            Object obj2 = atomicReferenceArray.get(i2 * 2);
            channelSegment.n(i2, null);
            return obj2;
        }
        while (true) {
            Object objL2 = channelSegment.l(i2);
            if (objL2 == null || objL2 == BufferedChannelKt.e) {
                if (j2 < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (channelSegment.k(i2, objL2, BufferedChannelKt.h)) {
                        w();
                        return BufferedChannelKt.o;
                    }
                } else {
                    if (obj == null) {
                        return BufferedChannelKt.n;
                    }
                    if (channelSegment.k(i2, objL2, obj)) {
                        w();
                        return BufferedChannelKt.m;
                    }
                }
            } else {
                if (objL2 != BufferedChannelKt.d) {
                    Symbol symbol = BufferedChannelKt.j;
                    if (objL2 != symbol && objL2 != BufferedChannelKt.h) {
                        if (objL2 == BufferedChannelKt.l) {
                            w();
                            return BufferedChannelKt.o;
                        }
                        if (objL2 != BufferedChannelKt.g && channelSegment.k(i2, objL2, BufferedChannelKt.f)) {
                            boolean z = objL2 instanceof WaiterEB;
                            if (z) {
                                objL2 = ((WaiterEB) objL2).f24701a;
                            }
                            if (U(objL2, channelSegment, i2)) {
                                channelSegment.o(i2, BufferedChannelKt.i);
                                w();
                                Object obj3 = atomicReferenceArray.get(i2 * 2);
                                channelSegment.n(i2, null);
                                return obj3;
                            }
                            channelSegment.o(i2, symbol);
                            channelSegment.i();
                            if (z) {
                                w();
                            }
                            return BufferedChannelKt.o;
                        }
                    }
                    return BufferedChannelKt.o;
                }
                if (channelSegment.k(i2, objL2, BufferedChannelKt.i)) {
                    w();
                    Object obj4 = atomicReferenceArray.get(i2 * 2);
                    channelSegment.n(i2, null);
                    return obj4;
                }
            }
        }
    }

    public final int W(ChannelSegment channelSegment, int i2, Object obj, long j2, Object obj2, boolean z) {
        while (true) {
            Object objL = channelSegment.l(i2);
            if (objL == null) {
                if (!h(j2) || z) {
                    if (z) {
                        if (channelSegment.k(i2, null, BufferedChannelKt.j)) {
                            channelSegment.i();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (channelSegment.k(i2, null, obj2)) {
                            return 2;
                        }
                    }
                } else if (channelSegment.k(i2, null, BufferedChannelKt.d)) {
                    break;
                }
            } else {
                if (objL != BufferedChannelKt.e) {
                    Symbol symbol = BufferedChannelKt.k;
                    if (objL == symbol) {
                        channelSegment.n(i2, null);
                        return 5;
                    }
                    if (objL == BufferedChannelKt.h) {
                        channelSegment.n(i2, null);
                        return 5;
                    }
                    if (objL == BufferedChannelKt.l) {
                        channelSegment.n(i2, null);
                        r();
                        return 4;
                    }
                    channelSegment.n(i2, null);
                    if (objL instanceof WaiterEB) {
                        objL = ((WaiterEB) objL).f24701a;
                    }
                    if (T(objL, obj)) {
                        channelSegment.o(i2, BufferedChannelKt.i);
                        M();
                        return 0;
                    }
                    if (channelSegment.i.getAndSet((i2 * 2) + 1, symbol) != symbol) {
                        channelSegment.m(i2, true);
                    }
                    return 5;
                }
                if (channelSegment.k(i2, objL, BufferedChannelKt.d)) {
                    break;
                }
            }
        }
        return 1;
    }

    public final void X(long j2) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        BufferedChannel<E> bufferedChannel = this;
        if (bufferedChannel.I()) {
            return;
        }
        while (true) {
            atomicLongFieldUpdater = g;
            if (atomicLongFieldUpdater.get(bufferedChannel) > j2) {
                break;
            } else {
                bufferedChannel = this;
            }
        }
        int i2 = BufferedChannelKt.c;
        int i3 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = h;
            if (i3 < i2) {
                long j3 = atomicLongFieldUpdater.get(bufferedChannel);
                if (j3 == (4611686018427387903L & atomicLongFieldUpdater2.get(bufferedChannel)) && j3 == atomicLongFieldUpdater.get(bufferedChannel)) {
                    return;
                } else {
                    i3++;
                }
            } else {
                while (true) {
                    long j4 = atomicLongFieldUpdater2.get(bufferedChannel);
                    if (atomicLongFieldUpdater2.compareAndSet(bufferedChannel, j4, (j4 & 4611686018427387903L) + llqqqql.aaa006100610061a)) {
                        break;
                    } else {
                        bufferedChannel = this;
                    }
                }
                while (true) {
                    long j5 = atomicLongFieldUpdater.get(bufferedChannel);
                    long j6 = atomicLongFieldUpdater2.get(bufferedChannel);
                    long j7 = j6 & 4611686018427387903L;
                    boolean z = (j6 & llqqqql.aaa006100610061a) != 0;
                    if (j5 == j7 && j5 == atomicLongFieldUpdater.get(bufferedChannel)) {
                        break;
                    }
                    if (z) {
                        bufferedChannel = this;
                    } else {
                        bufferedChannel = this;
                        atomicLongFieldUpdater2.compareAndSet(bufferedChannel, j6, llqqqql.aaa006100610061a + j7);
                    }
                }
                while (true) {
                    long j8 = atomicLongFieldUpdater2.get(bufferedChannel);
                    if (atomicLongFieldUpdater2.compareAndSet(bufferedChannel, j8, j8 & 4611686018427387903L)) {
                        return;
                    } else {
                        bufferedChannel = this;
                    }
                }
            }
        }
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public final Object c(Continuation continuation) throws Throwable {
        ChannelSegment channelSegment;
        Throwable th;
        ChannelSegment channelSegment2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = j;
        ChannelSegment channelSegment3 = (ChannelSegment) atomicReferenceFieldUpdater.get(this);
        while (!G()) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j2 = BufferedChannelKt.b;
            long j3 = andIncrement / j2;
            int i2 = (int) (andIncrement % j2);
            if (channelSegment3.f != j3) {
                ChannelSegment channelSegmentX = x(j3, channelSegment3);
                if (channelSegmentX == null) {
                    continue;
                } else {
                    channelSegment = channelSegmentX;
                }
            } else {
                channelSegment = channelSegment3;
            }
            Object objV = V(channelSegment, i2, andIncrement, null);
            Symbol symbol = BufferedChannelKt.m;
            if (objV == symbol) {
                throw new IllegalStateException("unexpected");
            }
            Symbol symbol2 = BufferedChannelKt.o;
            if (objV == symbol2) {
                if (andIncrement < D()) {
                    channelSegment.a();
                }
                channelSegment3 = channelSegment;
            } else {
                if (objV != BufferedChannelKt.n) {
                    channelSegment.a();
                    return objV;
                }
                CancellableContinuationImpl cancellableContinuationImplB = CancellableContinuationKt.b(IntrinsicsKt.b(continuation));
                BufferedChannel<E> bufferedChannel = this;
                try {
                    Object objV2 = bufferedChannel.V(channelSegment, i2, andIncrement, cancellableContinuationImplB);
                    if (objV2 == symbol) {
                        N();
                        cancellableContinuationImplB.a(channelSegment, i2);
                    } else {
                        if (objV2 == symbol2) {
                            if (andIncrement < D()) {
                                channelSegment.a();
                            }
                            ChannelSegment channelSegment4 = (ChannelSegment) atomicReferenceFieldUpdater.get(this);
                            while (true) {
                                if (G()) {
                                    cancellableContinuationImplB.resumeWith(ResultKt.a(B()));
                                    break;
                                }
                                CancellableContinuationImpl cancellableContinuationImpl = cancellableContinuationImplB;
                                try {
                                    long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(this);
                                    long j4 = BufferedChannelKt.b;
                                    long j5 = andIncrement2 / j4;
                                    int i3 = (int) (andIncrement2 % j4);
                                    if (channelSegment4.f != j5) {
                                        try {
                                            ChannelSegment channelSegmentX2 = x(j5, channelSegment4);
                                            if (channelSegmentX2 == null) {
                                                cancellableContinuationImplB = cancellableContinuationImpl;
                                            } else {
                                                channelSegment2 = channelSegmentX2;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            cancellableContinuationImplB = cancellableContinuationImpl;
                                            cancellableContinuationImplB.A();
                                            throw th;
                                        }
                                    } else {
                                        channelSegment2 = channelSegment4;
                                    }
                                    objV2 = bufferedChannel.V(channelSegment2, i3, andIncrement2, cancellableContinuationImpl);
                                    ChannelSegment channelSegment5 = channelSegment2;
                                    cancellableContinuationImplB = cancellableContinuationImpl;
                                    if (objV2 == BufferedChannelKt.m) {
                                        N();
                                        cancellableContinuationImplB.a(channelSegment5, i3);
                                        break;
                                    }
                                    if (objV2 == BufferedChannelKt.o) {
                                        if (andIncrement2 < D()) {
                                            channelSegment5.a();
                                        }
                                        bufferedChannel = this;
                                        channelSegment4 = channelSegment5;
                                    } else {
                                        if (objV2 == BufferedChannelKt.n) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        channelSegment5.a();
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    cancellableContinuationImplB = cancellableContinuationImpl;
                                    th = th;
                                    cancellableContinuationImplB.A();
                                    throw th;
                                }
                            }
                        } else {
                            channelSegment.a();
                        }
                        cancellableContinuationImplB.q(objV2, null);
                    }
                    Object objN = cancellableContinuationImplB.n();
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                    return objN;
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        }
        Throwable thB = B();
        int i4 = StackTraceRecoveryKt.f24729a;
        throw thB;
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public final void cancel(CancellationException cancellationException) {
        i(cancellationException);
    }

    public final boolean h(long j2) {
        return j2 < g.get(this) || j2 < f.get(this) + ((long) this.d);
    }

    public void i(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        l(cancellationException, true);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public final ChannelIterator iterator() {
        return new BufferedChannelIterator();
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public final void j(Function1 function1) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = m;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, function1)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            Symbol symbol = BufferedChannelKt.q;
            if (obj != symbol) {
                if (obj == BufferedChannelKt.r) {
                    throw new IllegalStateException("Another handler was already registered and successfully invoked");
                }
                throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
            }
            Symbol symbol2 = BufferedChannelKt.r;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, symbol, symbol2)) {
                if (atomicReferenceFieldUpdater.get(this) != symbol) {
                    break;
                }
            }
            function1.invoke(A());
            return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00be A[SYNTHETIC] */
    @Override // kotlinx.coroutines.channels.SendChannel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object k(java.lang.Object r16) {
        /*
            r15 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = kotlinx.coroutines.channels.BufferedChannel.e
            long r1 = r8.get(r15)
            r9 = 0
            boolean r3 = r15.F(r1, r9)
            r10 = 1
            r11 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            if (r3 == 0) goto L15
            r1 = r9
            goto L1b
        L15:
            long r1 = r1 & r11
            boolean r1 = r15.h(r1)
            r1 = r1 ^ r10
        L1b:
            kotlinx.coroutines.channels.ChannelResult$Failed r13 = kotlinx.coroutines.channels.ChannelResult.b
            if (r1 == 0) goto L20
            return r13
        L20:
            kotlinx.coroutines.internal.Symbol r6 = kotlinx.coroutines.channels.BufferedChannelKt.j
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.channels.BufferedChannel.i
            java.lang.Object r1 = r1.get(r15)
            kotlinx.coroutines.channels.ChannelSegment r1 = (kotlinx.coroutines.channels.ChannelSegment) r1
        L2a:
            long r2 = r8.getAndIncrement(r15)
            long r4 = r2 & r11
            boolean r7 = r15.F(r2, r9)
            int r14 = kotlinx.coroutines.channels.BufferedChannelKt.b
            long r2 = (long) r14
            long r11 = r4 / r2
            long r2 = r4 % r2
            int r2 = (int) r2
            long r9 = r1.f
            int r3 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r3 == 0) goto L5d
            kotlinx.coroutines.channels.ChannelSegment r3 = a(r15, r11, r1)
            if (r3 != 0) goto L5c
            if (r7 == 0) goto L54
            java.lang.Throwable r1 = r15.C()
            kotlinx.coroutines.channels.ChannelResult$Closed r2 = new kotlinx.coroutines.channels.ChannelResult$Closed
            r2.<init>(r1)
            return r2
        L54:
            r9 = 0
            r10 = 1
        L56:
            r11 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            goto L2a
        L5c:
            r1 = r3
        L5d:
            r0 = r15
            r3 = r16
            int r9 = g(r0, r1, r2, r3, r4, r6, r7)
            kotlin.Unit r3 = kotlin.Unit.f24250a
            if (r9 == 0) goto Lbe
            r10 = 1
            if (r9 == r10) goto Lbd
            r3 = 2
            if (r9 == r3) goto L9c
            r2 = 3
            if (r9 == r2) goto L94
            r2 = 4
            if (r9 == r2) goto L7d
            r2 = 5
            if (r9 == r2) goto L78
            goto L7b
        L78:
            r1.a()
        L7b:
            r9 = 0
            goto L56
        L7d:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = kotlinx.coroutines.channels.BufferedChannel.f
            long r2 = r2.get(r15)
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 >= 0) goto L8a
            r1.a()
        L8a:
            java.lang.Throwable r1 = r15.C()
            kotlinx.coroutines.channels.ChannelResult$Closed r2 = new kotlinx.coroutines.channels.ChannelResult$Closed
            r2.<init>(r1)
            return r2
        L94:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "unexpected"
            r1.<init>(r2)
            throw r1
        L9c:
            if (r7 == 0) goto Lab
            r1.i()
            java.lang.Throwable r1 = r15.C()
            kotlinx.coroutines.channels.ChannelResult$Closed r2 = new kotlinx.coroutines.channels.ChannelResult$Closed
            r2.<init>(r1)
            return r2
        Lab:
            boolean r3 = r6 instanceof kotlinx.coroutines.Waiter
            if (r3 == 0) goto Lb2
            kotlinx.coroutines.Waiter r6 = (kotlinx.coroutines.Waiter) r6
            goto Lb3
        Lb2:
            r6 = 0
        Lb3:
            if (r6 == 0) goto Lb9
            int r2 = r2 + r14
            r6.a(r1, r2)
        Lb9:
            r1.i()
            return r13
        Lbd:
            return r3
        Lbe:
            r1.a()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BufferedChannel.k(java.lang.Object):java.lang.Object");
    }

    public final boolean l(Throwable th, boolean z) {
        BufferedChannel<E> bufferedChannel;
        boolean z2;
        long j2;
        long j3;
        long j4;
        Object obj;
        long j5;
        long j6;
        AtomicLongFieldUpdater atomicLongFieldUpdater = e;
        if (!z) {
            bufferedChannel = this;
            break;
        }
        do {
            j6 = atomicLongFieldUpdater.get(this);
            if (((int) (j6 >> 60)) != 0) {
                bufferedChannel = this;
                break;
            }
            ChannelSegment channelSegment = BufferedChannelKt.f24697a;
            bufferedChannel = this;
        } while (!atomicLongFieldUpdater.compareAndSet(bufferedChannel, j6, (j6 & 1152921504606846975L) + (1 << 60)));
        Symbol symbol = BufferedChannelKt.s;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = l;
            if (atomicReferenceFieldUpdater.compareAndSet(this, symbol, th)) {
                z2 = true;
                break;
            }
            if (atomicReferenceFieldUpdater.get(this) != symbol) {
                z2 = false;
                break;
            }
        }
        if (z) {
            do {
                j5 = atomicLongFieldUpdater.get(this);
            } while (!atomicLongFieldUpdater.compareAndSet(bufferedChannel, j5, (3 << 60) + (j5 & 1152921504606846975L)));
        } else {
            do {
                j2 = atomicLongFieldUpdater.get(this);
                int i2 = (int) (j2 >> 60);
                if (i2 == 0) {
                    j3 = j2 & 1152921504606846975L;
                    j4 = 2;
                } else {
                    if (i2 != 1) {
                        break;
                    }
                    j3 = j2 & 1152921504606846975L;
                    j4 = 3;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(bufferedChannel, j2, (j4 << 60) + j3));
        }
        r();
        K();
        if (z2) {
            loop3: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = m;
                obj = atomicReferenceFieldUpdater2.get(this);
                Symbol symbol2 = obj == null ? BufferedChannelKt.q : BufferedChannelKt.r;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, symbol2)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj) {
                        break;
                    }
                }
            }
            if (obj != null) {
                TypeIntrinsics.d(1, obj);
                ((Function1) obj).invoke(A());
                return z2;
            }
        }
        return z2;
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public final SelectClause1 n() {
        BufferedChannel$onReceiveCatching$1 bufferedChannel$onReceiveCatching$1 = BufferedChannel$onReceiveCatching$1.d;
        TypeIntrinsics.d(3, bufferedChannel$onReceiveCatching$1);
        BufferedChannel$onReceiveCatching$2 bufferedChannel$onReceiveCatching$2 = BufferedChannel$onReceiveCatching$2.d;
        TypeIntrinsics.d(3, bufferedChannel$onReceiveCatching$2);
        return new SelectClause1Impl(this, bufferedChannel$onReceiveCatching$1, bufferedChannel$onReceiveCatching$2, null);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public final Object o() {
        ChannelSegment channelSegment;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f;
        long j2 = atomicLongFieldUpdater.get(this);
        long j3 = e.get(this);
        if (F(j3, true)) {
            return new ChannelResult.Closed(A());
        }
        long j4 = j3 & 1152921504606846975L;
        ChannelResult.Failed failed = ChannelResult.b;
        if (j2 >= j4) {
            return failed;
        }
        Object obj = BufferedChannelKt.k;
        ChannelSegment channelSegment2 = (ChannelSegment) j.get(this);
        while (!G()) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j5 = BufferedChannelKt.b;
            long j6 = andIncrement / j5;
            int i2 = (int) (andIncrement % j5);
            if (channelSegment2.f != j6) {
                ChannelSegment channelSegmentX = x(j6, channelSegment2);
                if (channelSegmentX == null) {
                    continue;
                } else {
                    channelSegment = channelSegmentX;
                }
            } else {
                channelSegment = channelSegment2;
            }
            Object objV = V(channelSegment, i2, andIncrement, obj);
            ChannelSegment channelSegment3 = channelSegment;
            if (objV == BufferedChannelKt.m) {
                Waiter waiter = obj instanceof Waiter ? (Waiter) obj : null;
                if (waiter != null) {
                    N();
                    waiter.a(channelSegment3, i2);
                }
                X(andIncrement);
                channelSegment3.i();
                return failed;
            }
            if (objV != BufferedChannelKt.o) {
                if (objV == BufferedChannelKt.n) {
                    throw new IllegalStateException("unexpected");
                }
                channelSegment3.a();
                return objV;
            }
            if (andIncrement < D()) {
                channelSegment3.a();
            }
            channelSegment2 = channelSegment3;
        }
        return new ChannelResult.Closed(A());
    }

    public void onNext(Object obj) {
        k(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x008d, code lost:
    
        r1 = (kotlinx.coroutines.channels.ChannelSegment) ((kotlinx.coroutines.internal.ConcurrentLinkedListNode) kotlinx.coroutines.internal.ConcurrentLinkedListNode.e.get(r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final kotlinx.coroutines.channels.ChannelSegment p(long r13) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BufferedChannel.p(long):kotlinx.coroutines.channels.ChannelSegment");
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public boolean r() {
        return F(e.get(this), false);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public final Object s(ContinuationImpl continuationImpl) {
        return O(this, continuationImpl);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public final SelectClause1 t() {
        BufferedChannel$onReceive$1 bufferedChannel$onReceive$1 = BufferedChannel$onReceive$1.d;
        TypeIntrinsics.d(3, bufferedChannel$onReceive$1);
        BufferedChannel$onReceive$2 bufferedChannel$onReceive$2 = BufferedChannel$onReceive$2.d;
        TypeIntrinsics.d(3, bufferedChannel$onReceive$2);
        return new SelectClause1Impl(this, bufferedChannel$onReceive$1, bufferedChannel$onReceive$2, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x01c1, code lost:
    
        r16 = r7;
        r3 = (kotlinx.coroutines.channels.ChannelSegment) r3.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01ca, code lost:
    
        if (r3 != null) goto L95;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 502
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BufferedChannel.toString():java.lang.String");
    }

    public final void u(long j2) {
        ChannelSegment channelSegment = (ChannelSegment) j.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f;
            long j3 = atomicLongFieldUpdater.get(this);
            if (j2 < Math.max(this.d + j3, g.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j3, 1 + j3)) {
                long j4 = BufferedChannelKt.b;
                long j5 = j3 / j4;
                int i2 = (int) (j3 % j4);
                if (channelSegment.f != j5) {
                    ChannelSegment channelSegmentX = x(j5, channelSegment);
                    if (channelSegmentX != null) {
                        channelSegment = channelSegmentX;
                    }
                }
                ChannelSegment channelSegment2 = channelSegment;
                if (V(channelSegment2, i2, j3, null) != BufferedChannelKt.o || j3 < D()) {
                    channelSegment2.a();
                }
                channelSegment = channelSegment2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0188, code lost:
    
        E(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x018b, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void w() {
        /*
            Method dump skipped, instructions count: 396
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BufferedChannel.w():void");
    }

    public final ChannelSegment x(long j2, ChannelSegment channelSegment) {
        Object objA;
        long j3;
        ChannelSegment channelSegment2 = BufferedChannelKt.f24697a;
        BufferedChannelKt$createSegmentFunction$1 bufferedChannelKt$createSegmentFunction$1 = BufferedChannelKt$createSegmentFunction$1.d;
        loop0: while (true) {
            objA = ConcurrentLinkedListKt.a(channelSegment, j2, bufferedChannelKt$createSegmentFunction$1);
            if (!SegmentOrClosed.b(objA)) {
                Segment segmentA = SegmentOrClosed.a(objA);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = j;
                    Segment segment = (Segment) atomicReferenceFieldUpdater.get(this);
                    if (segment.f >= segmentA.f) {
                        break loop0;
                    }
                    if (!segmentA.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, segment, segmentA)) {
                        if (atomicReferenceFieldUpdater.get(this) != segment) {
                            if (segmentA.f()) {
                                segmentA.e();
                            }
                        }
                    }
                    if (segment.f()) {
                        segment.e();
                    }
                }
            } else {
                break;
            }
        }
        if (SegmentOrClosed.b(objA)) {
            r();
            if (channelSegment.f * BufferedChannelKt.b < D()) {
                channelSegment.a();
                return null;
            }
        } else {
            ChannelSegment channelSegment3 = (ChannelSegment) SegmentOrClosed.a(objA);
            long j4 = channelSegment3.f;
            if (!I() && j2 <= g.get(this) / BufferedChannelKt.b) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = k;
                    Segment segment2 = (Segment) atomicReferenceFieldUpdater2.get(this);
                    if (segment2.f >= j4 || !channelSegment3.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, segment2, channelSegment3)) {
                        if (atomicReferenceFieldUpdater2.get(this) != segment2) {
                            if (channelSegment3.f()) {
                                channelSegment3.e();
                            }
                        }
                    }
                    if (segment2.f()) {
                        segment2.e();
                    }
                }
            }
            if (j4 <= j2) {
                return channelSegment3;
            }
            long j5 = j4 * BufferedChannelKt.b;
            do {
                j3 = f.get(this);
                if (j3 >= j5) {
                    break;
                }
            } while (!f.compareAndSet(this, j3, j5));
            if (j4 * BufferedChannelKt.b < D()) {
                channelSegment3.a();
            }
        }
        return null;
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public boolean y(Throwable th) {
        return l(th, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x0189, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c6, code lost:
    
        e(r1, r4, r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0173 A[RETURN] */
    @Override // kotlinx.coroutines.channels.SendChannel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object z(java.lang.Object r24, kotlin.coroutines.Continuation r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 399
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BufferedChannel.z(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
