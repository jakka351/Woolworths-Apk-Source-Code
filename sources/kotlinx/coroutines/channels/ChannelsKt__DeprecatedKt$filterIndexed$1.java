package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "E", "Lkotlinx/coroutines/channels/ProducerScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterIndexed$1", f = "Deprecated.kt", l = {241, 242, 242}, m = "invokeSuspend")
/* loaded from: classes7.dex */
final class ChannelsKt__DeprecatedKt$filterIndexed$1 extends SuspendLambda implements Function2 {
    public ChannelIterator p;
    public Object q;
    public int r;
    public int s;
    public /* synthetic */ Object t;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        throw null;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ChannelsKt__DeprecatedKt$filterIndexed$1) create((ProducerScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005c, code lost:
    
        if (r9 != r0) goto L23;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r8.s
            r2 = 0
            if (r1 == 0) goto L77
            r3 = 1
            if (r1 == r3) goto L5f
            r4 = 3
            r5 = 2
            if (r1 == r5) goto L24
            if (r1 != r4) goto L1c
            int r1 = r8.r
            kotlinx.coroutines.channels.ChannelIterator r4 = r8.p
            java.lang.Object r5 = r8.t
            kotlinx.coroutines.channels.ProducerScope r5 = (kotlinx.coroutines.channels.ProducerScope) r5
            kotlin.ResultKt.b(r9)
            goto L4c
        L1c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L24:
            int r1 = r8.r
            java.lang.Object r5 = r8.q
            kotlinx.coroutines.channels.ChannelIterator r6 = r8.p
            java.lang.Object r7 = r8.t
            kotlinx.coroutines.channels.ProducerScope r7 = (kotlinx.coroutines.channels.ProducerScope) r7
            kotlin.ResultKt.b(r9)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L4e
            r8.t = r7
            r8.p = r6
            r8.q = r2
            r8.r = r1
            r8.s = r4
            java.lang.Object r9 = r7.z(r5, r8)
            if (r9 != r0) goto L4a
            goto L5e
        L4a:
            r4 = r6
            r5 = r7
        L4c:
            r6 = r4
            r7 = r5
        L4e:
            r8.t = r7
            r8.p = r6
            r8.q = r2
            r8.r = r1
            r8.s = r3
            java.lang.Object r9 = r6.b(r8)
            if (r9 != r0) goto L68
        L5e:
            return r0
        L5f:
            kotlinx.coroutines.channels.ChannelIterator r6 = r8.p
            java.lang.Object r0 = r8.t
            kotlinx.coroutines.channels.ProducerScope r0 = (kotlinx.coroutines.channels.ProducerScope) r0
            kotlin.ResultKt.b(r9)
        L68:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L73
            kotlin.Unit r9 = kotlin.Unit.f24250a
            return r9
        L73:
            r6.next()
            throw r2
        L77:
            kotlin.ResultKt.b(r9)
            java.lang.Object r9 = r8.t
            kotlinx.coroutines.channels.ProducerScope r9 = (kotlinx.coroutines.channels.ProducerScope) r9
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterIndexed$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
