package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "E", "Lkotlinx/coroutines/channels/ProducerScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$take$1", f = "Deprecated.kt", l = {284, 285}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes7.dex */
final class ChannelsKt__DeprecatedKt$take$1 extends SuspendLambda implements Function2 {
    public ChannelIterator p;
    public int q;
    public int r;
    public /* synthetic */ Object s;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        throw null;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ChannelsKt__DeprecatedKt$take$1) create((ProducerScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0043 -> B:16:0x0046). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r6.r
            if (r1 == 0) goto L5d
            r2 = 2
            r3 = 1
            if (r1 == r3) goto L20
            if (r1 != r2) goto L18
            int r1 = r6.q
            kotlinx.coroutines.channels.ChannelIterator r4 = r6.p
            java.lang.Object r5 = r6.s
            kotlinx.coroutines.channels.ProducerScope r5 = (kotlinx.coroutines.channels.ProducerScope) r5
            kotlin.ResultKt.b(r7)
            goto L46
        L18:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L20:
            int r1 = r6.q
            kotlinx.coroutines.channels.ChannelIterator r4 = r6.p
            java.lang.Object r5 = r6.s
            kotlinx.coroutines.channels.ProducerScope r5 = (kotlinx.coroutines.channels.ProducerScope) r5
            kotlin.ResultKt.b(r7)
        L2b:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L5a
            java.lang.Object r7 = r4.next()
            r6.s = r5
            r6.p = r4
            r6.q = r1
            r6.r = r2
            java.lang.Object r7 = r5.z(r7, r6)
            if (r7 != r0) goto L46
            goto L59
        L46:
            int r1 = r1 + (-1)
            if (r1 != 0) goto L4b
            goto L5a
        L4b:
            r6.s = r5
            r6.p = r4
            r6.q = r1
            r6.r = r3
            java.lang.Object r7 = r4.b(r6)
            if (r7 != r0) goto L2b
        L59:
            return r0
        L5a:
            kotlin.Unit r7 = kotlin.Unit.f24250a
            return r7
        L5d:
            kotlin.ResultKt.b(r7)
            java.lang.Object r7 = r6.s
            kotlinx.coroutines.channels.ProducerScope r7 = (kotlinx.coroutines.channels.ProducerScope) r7
            r7 = 0
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$take$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
