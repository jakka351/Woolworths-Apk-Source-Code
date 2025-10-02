package kotlinx.coroutines.channels;

import java.util.HashSet;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "E", "Lkotlinx/coroutines/channels/ProducerScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinctBy$1", f = "Deprecated.kt", l = {417, 418, 420}, m = "invokeSuspend")
/* loaded from: classes7.dex */
final class ChannelsKt__DeprecatedKt$distinctBy$1 extends SuspendLambda implements Function2<ProducerScope<Object>, Continuation<? super Unit>, Object> {
    public HashSet p;
    public ChannelIterator q;
    public Object r;
    public int s;
    public /* synthetic */ Object t;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        throw null;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ChannelsKt__DeprecatedKt$distinctBy$1) create((ProducerScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0062, code lost:
    
        if (r10 != r0) goto L23;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r9.s
            r2 = 0
            if (r1 == 0) goto L7d
            r3 = 1
            if (r1 == r3) goto L65
            r4 = 3
            r5 = 2
            if (r1 == r5) goto L27
            if (r1 != r4) goto L1f
            java.lang.Object r1 = r9.r
            kotlinx.coroutines.channels.ChannelIterator r4 = r9.q
            java.util.HashSet r5 = r9.p
            java.lang.Object r6 = r9.t
            kotlinx.coroutines.channels.ProducerScope r6 = (kotlinx.coroutines.channels.ProducerScope) r6
            kotlin.ResultKt.b(r10)
            r10 = r1
            goto L4e
        L1f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L27:
            java.lang.Object r1 = r9.r
            kotlinx.coroutines.channels.ChannelIterator r5 = r9.q
            java.util.HashSet r6 = r9.p
            java.lang.Object r7 = r9.t
            kotlinx.coroutines.channels.ProducerScope r7 = (kotlinx.coroutines.channels.ProducerScope) r7
            kotlin.ResultKt.b(r10)
            boolean r8 = r6.contains(r10)
            if (r8 != 0) goto L54
            r9.t = r7
            r9.p = r6
            r9.q = r5
            r9.r = r10
            r9.s = r4
            java.lang.Object r1 = r7.z(r1, r9)
            if (r1 != r0) goto L4b
            goto L64
        L4b:
            r4 = r5
            r5 = r6
            r6 = r7
        L4e:
            r5.add(r10)
            r7 = r6
            r6 = r5
            r5 = r4
        L54:
            r9.t = r7
            r9.p = r6
            r9.q = r5
            r9.r = r2
            r9.s = r3
            java.lang.Object r10 = r5.b(r9)
            if (r10 != r0) goto L6e
        L64:
            return r0
        L65:
            kotlinx.coroutines.channels.ChannelIterator r5 = r9.q
            java.lang.Object r0 = r9.t
            kotlinx.coroutines.channels.ProducerScope r0 = (kotlinx.coroutines.channels.ProducerScope) r0
            kotlin.ResultKt.b(r10)
        L6e:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 != 0) goto L79
            kotlin.Unit r10 = kotlin.Unit.f24250a
            return r10
        L79:
            r5.next()
            throw r2
        L7d:
            kotlin.ResultKt.b(r10)
            java.lang.Object r10 = r9.t
            kotlinx.coroutines.channels.ProducerScope r10 = (kotlinx.coroutines.channels.ProducerScope) r10
            java.util.HashSet r10 = new java.util.HashSet
            r10.<init>()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinctBy$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
