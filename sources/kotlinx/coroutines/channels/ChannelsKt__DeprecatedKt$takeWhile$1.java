package kotlinx.coroutines.channels;

import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nlnlnnn;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "E", "Lkotlinx/coroutines/channels/ProducerScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$takeWhile$1", f = "Deprecated.kt", l = {299, nlnlnnn.xxx00780078x0078, 301}, m = "invokeSuspend")
/* loaded from: classes7.dex */
final class ChannelsKt__DeprecatedKt$takeWhile$1 extends SuspendLambda implements Function2 {
    public ChannelIterator p;
    public Object q;
    public int r;
    public /* synthetic */ Object s;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        throw null;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ChannelsKt__DeprecatedKt$takeWhile$1) create((ProducerScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0051, code lost:
    
        if (r8 == r0) goto L21;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r7.r
            r2 = 0
            if (r1 == 0) goto L6c
            r3 = 1
            if (r1 == r3) goto L54
            r4 = 3
            r5 = 2
            if (r1 == r5) goto L22
            if (r1 != r4) goto L1a
            kotlinx.coroutines.channels.ChannelIterator r1 = r7.p
            java.lang.Object r4 = r7.s
            kotlinx.coroutines.channels.ProducerScope r4 = (kotlinx.coroutines.channels.ProducerScope) r4
            kotlin.ResultKt.b(r8)
            goto L47
        L1a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L22:
            java.lang.Object r1 = r7.q
            kotlinx.coroutines.channels.ChannelIterator r5 = r7.p
            java.lang.Object r6 = r7.s
            kotlinx.coroutines.channels.ProducerScope r6 = (kotlinx.coroutines.channels.ProducerScope) r6
            kotlin.ResultKt.b(r8)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L36
            goto L65
        L36:
            r7.s = r6
            r7.p = r5
            r7.q = r2
            r7.r = r4
            java.lang.Object r8 = r6.z(r1, r7)
            if (r8 != r0) goto L45
            goto L53
        L45:
            r1 = r5
            r4 = r6
        L47:
            r7.s = r4
            r7.p = r1
            r7.r = r3
            java.lang.Object r8 = r1.b(r7)
            if (r8 != r0) goto L5d
        L53:
            return r0
        L54:
            kotlinx.coroutines.channels.ChannelIterator r1 = r7.p
            java.lang.Object r0 = r7.s
            kotlinx.coroutines.channels.ProducerScope r0 = (kotlinx.coroutines.channels.ProducerScope) r0
            kotlin.ResultKt.b(r8)
        L5d:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L68
        L65:
            kotlin.Unit r8 = kotlin.Unit.f24250a
            return r8
        L68:
            r1.next()
            throw r2
        L6c:
            kotlin.ResultKt.b(r8)
            java.lang.Object r8 = r7.s
            kotlinx.coroutines.channels.ProducerScope r8 = (kotlinx.coroutines.channels.ProducerScope) r8
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$takeWhile$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
