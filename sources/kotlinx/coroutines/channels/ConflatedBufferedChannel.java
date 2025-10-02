package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.selects.SelectInstance;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/channels/ConflatedBufferedChannel;", "E", "Lkotlinx/coroutines/channels/BufferedChannel;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public class ConflatedBufferedChannel<E> extends BufferedChannel<E> {
    public final BufferOverflow n;

    public ConflatedBufferedChannel(int i, BufferOverflow bufferOverflow) {
        super(i);
        this.n = bufferOverflow;
        if (bufferOverflow != BufferOverflow.d) {
            if (i < 1) {
                throw new IllegalArgumentException(YU.a.e(i, "Buffered channel capacity must be at least 1, but ", " was specified").toString());
            }
        } else {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + Reflection.f24268a.b(BufferedChannel.class).B() + " instead").toString());
        }
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    public final boolean H() {
        return this.n == BufferOverflow.e;
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    public final void Q(SelectInstance selectInstance, Object obj) {
        Object objY = Y(obj, false);
        if (!(objY instanceof ChannelResult.Failed)) {
            selectInstance.c(Unit.f24250a);
        } else {
            if (!(objY instanceof ChannelResult.Closed)) {
                throw new IllegalStateException("unreachable");
            }
            selectInstance.c(BufferedChannelKt.l);
        }
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    public final Object S(Continuation continuation) {
        Object objY = Y(null, true);
        if (objY instanceof ChannelResult.Failed) {
            return Boolean.FALSE;
        }
        return Boolean.TRUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b6, code lost:
    
        return r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object Y(java.lang.Object r16, boolean r17) {
        /*
            r15 = this;
            kotlinx.coroutines.channels.BufferOverflow r1 = r15.n
            kotlinx.coroutines.channels.BufferOverflow r2 = kotlinx.coroutines.channels.BufferOverflow.f
            kotlin.Unit r8 = kotlin.Unit.f24250a
            if (r1 != r2) goto L17
            java.lang.Object r1 = super.k(r16)
            boolean r2 = r1 instanceof kotlinx.coroutines.channels.ChannelResult.Failed
            if (r2 == 0) goto L16
            boolean r2 = r1 instanceof kotlinx.coroutines.channels.ChannelResult.Closed
            if (r2 == 0) goto L15
            goto L16
        L15:
            return r8
        L16:
            return r1
        L17:
            kotlinx.coroutines.internal.Symbol r6 = kotlinx.coroutines.channels.BufferedChannelKt.d
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.channels.BufferedChannel.i
            java.lang.Object r1 = r1.get(r15)
            kotlinx.coroutines.channels.ChannelSegment r1 = (kotlinx.coroutines.channels.ChannelSegment) r1
        L21:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = kotlinx.coroutines.channels.BufferedChannel.e
            long r2 = r2.getAndIncrement(r15)
            r4 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r4 = r4 & r2
            r7 = 0
            boolean r7 = r15.F(r2, r7)
            int r9 = kotlinx.coroutines.channels.BufferedChannelKt.b
            long r10 = (long) r9
            long r2 = r4 / r10
            long r12 = r4 % r10
            int r12 = (int) r12
            long r13 = r1.f
            int r13 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r13 == 0) goto L53
            kotlinx.coroutines.channels.ChannelSegment r2 = kotlinx.coroutines.channels.BufferedChannel.a(r15, r2, r1)
            if (r2 != 0) goto L52
            if (r7 == 0) goto L21
            java.lang.Throwable r1 = r15.C()
            kotlinx.coroutines.channels.ChannelResult$Closed r2 = new kotlinx.coroutines.channels.ChannelResult$Closed
            r2.<init>(r1)
            return r2
        L52:
            r1 = r2
        L53:
            r0 = r15
            r3 = r16
            r2 = r12
            int r12 = kotlinx.coroutines.channels.BufferedChannel.g(r0, r1, r2, r3, r4, r6, r7)
            if (r12 == 0) goto Lb7
            r3 = 1
            if (r12 == r3) goto Lb6
            r3 = 2
            if (r12 == r3) goto L90
            r2 = 3
            if (r12 == r2) goto L88
            r2 = 4
            if (r12 == r2) goto L71
            r2 = 5
            if (r12 == r2) goto L6d
            goto L21
        L6d:
            r1.a()
            goto L21
        L71:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = kotlinx.coroutines.channels.BufferedChannel.f
            long r2 = r2.get(r15)
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 >= 0) goto L7e
            r1.a()
        L7e:
            java.lang.Throwable r1 = r15.C()
            kotlinx.coroutines.channels.ChannelResult$Closed r2 = new kotlinx.coroutines.channels.ChannelResult$Closed
            r2.<init>(r1)
            return r2
        L88:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "unexpected"
            r1.<init>(r2)
            throw r1
        L90:
            if (r7 == 0) goto L9f
            r1.i()
            java.lang.Throwable r1 = r15.C()
            kotlinx.coroutines.channels.ChannelResult$Closed r2 = new kotlinx.coroutines.channels.ChannelResult$Closed
            r2.<init>(r1)
            return r2
        L9f:
            boolean r3 = r6 instanceof kotlinx.coroutines.Waiter
            if (r3 == 0) goto La6
            kotlinx.coroutines.Waiter r6 = (kotlinx.coroutines.Waiter) r6
            goto La7
        La6:
            r6 = 0
        La7:
            if (r6 == 0) goto Lae
            int r12 = r2 + r9
            r6.a(r1, r12)
        Lae:
            long r3 = r1.f
            long r3 = r3 * r10
            long r1 = (long) r2
            long r3 = r3 + r1
            r15.u(r3)
        Lb6:
            return r8
        Lb7:
            r1.a()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ConflatedBufferedChannel.Y(java.lang.Object, boolean):java.lang.Object");
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel, kotlinx.coroutines.channels.SendChannel
    public final Object k(Object obj) {
        return Y(obj, false);
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel, kotlinx.coroutines.channels.SendChannel
    public final Object z(Object obj, Continuation continuation) throws Throwable {
        if (Y(obj, true) instanceof ChannelResult.Closed) {
            throw C();
        }
        return Unit.f24250a;
    }
}
