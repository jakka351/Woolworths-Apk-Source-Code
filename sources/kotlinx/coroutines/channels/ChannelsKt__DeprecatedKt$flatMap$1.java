package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "R", "Lkotlinx/coroutines/channels/ProducerScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$flatMap$1", f = "Deprecated.kt", l = {351, 352, 352}, m = "invokeSuspend")
/* loaded from: classes7.dex */
final class ChannelsKt__DeprecatedKt$flatMap$1 extends SuspendLambda implements Function2 {
    public ChannelIterator p;
    public int q;
    public /* synthetic */ Object r;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        throw null;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ChannelsKt__DeprecatedKt$flatMap$1) create((ProducerScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0045, code lost:
    
        if (r7 == r0) goto L18;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r6.q
            r2 = 0
            if (r1 == 0) goto L60
            r3 = 1
            if (r1 == r3) goto L48
            r4 = 3
            r5 = 2
            if (r1 == r5) goto L22
            if (r1 != r4) goto L1a
            kotlinx.coroutines.channels.ChannelIterator r1 = r6.p
            java.lang.Object r4 = r6.r
            kotlinx.coroutines.channels.ProducerScope r4 = (kotlinx.coroutines.channels.ProducerScope) r4
            kotlin.ResultKt.b(r7)
            goto L3b
        L1a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L22:
            kotlinx.coroutines.channels.ChannelIterator r1 = r6.p
            java.lang.Object r5 = r6.r
            kotlinx.coroutines.channels.ProducerScope r5 = (kotlinx.coroutines.channels.ProducerScope) r5
            kotlin.ResultKt.b(r7)
            kotlinx.coroutines.channels.ReceiveChannel r7 = (kotlinx.coroutines.channels.ReceiveChannel) r7
            r6.r = r5
            r6.p = r1
            r6.q = r4
            java.lang.Object r7 = kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.a(r7, r5, r6)
            if (r7 != r0) goto L3a
            goto L47
        L3a:
            r4 = r5
        L3b:
            r6.r = r4
            r6.p = r1
            r6.q = r3
            java.lang.Object r7 = r1.b(r6)
            if (r7 != r0) goto L51
        L47:
            return r0
        L48:
            kotlinx.coroutines.channels.ChannelIterator r1 = r6.p
            java.lang.Object r0 = r6.r
            kotlinx.coroutines.channels.ProducerScope r0 = (kotlinx.coroutines.channels.ProducerScope) r0
            kotlin.ResultKt.b(r7)
        L51:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L5c
            kotlin.Unit r7 = kotlin.Unit.f24250a
            return r7
        L5c:
            r1.next()
            throw r2
        L60:
            kotlin.ResultKt.b(r7)
            java.lang.Object r7 = r6.r
            kotlinx.coroutines.channels.ProducerScope r7 = (kotlinx.coroutines.channels.ProducerScope) r7
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$flatMap$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
