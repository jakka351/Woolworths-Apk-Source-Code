package kotlinx.coroutines.flow;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.channels.ChannelResult;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\n"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "value", "Lkotlinx/coroutines/channels/ChannelResult;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$1", f = "Delay.kt", l = {395}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes7.dex */
final class FlowKt__DelayKt$timeoutInternal$1$1$1 extends SuspendLambda implements Function2<ChannelResult<Object>, Continuation<? super Boolean>, Object> {
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ FlowCollector r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$timeoutInternal$1$1$1(FlowCollector flowCollector, Continuation continuation) {
        super(2, continuation);
        this.r = flowCollector;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        FlowKt__DelayKt$timeoutInternal$1$1$1 flowKt__DelayKt$timeoutInternal$1$1$1 = new FlowKt__DelayKt$timeoutInternal$1$1$1(this.r, continuation);
        flowKt__DelayKt$timeoutInternal$1$1$1.q = obj;
        return flowKt__DelayKt$timeoutInternal$1$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((FlowKt__DelayKt$timeoutInternal$1$1$1) create(new ChannelResult(((ChannelResult) obj).f24699a), (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0042  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r4) throws java.lang.Throwable {
        /*
            r3 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r3.p
            r2 = 1
            if (r1 == 0) goto L17
            if (r1 != r2) goto Lf
            java.lang.Object r0 = r3.q
            kotlin.ResultKt.b(r4)
            goto L32
        Lf:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
        L17:
            kotlin.ResultKt.b(r4)
            java.lang.Object r4 = r3.q
            kotlinx.coroutines.channels.ChannelResult r4 = (kotlinx.coroutines.channels.ChannelResult) r4
            java.lang.Object r4 = r4.f24699a
            boolean r1 = r4 instanceof kotlinx.coroutines.channels.ChannelResult.Failed
            if (r1 != 0) goto L33
            r3.q = r4
            r3.p = r2
            kotlinx.coroutines.flow.FlowCollector r1 = r3.r
            java.lang.Object r1 = r1.emit(r4, r3)
            if (r1 != r0) goto L31
            return r0
        L31:
            r0 = r4
        L32:
            r4 = r0
        L33:
            boolean r0 = r4 instanceof kotlinx.coroutines.channels.ChannelResult.Closed
            if (r0 == 0) goto L42
            java.lang.Throwable r4 = kotlinx.coroutines.channels.ChannelResult.a(r4)
            if (r4 != 0) goto L41
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            return r4
        L41:
            throw r4
        L42:
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
