package androidx.compose.foundation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.CombinedClickableNode$onClickKeyUpEvent$2", f = "Clickable.kt", l = {908, 912}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class CombinedClickableNode$onClickKeyUpEvent$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public long p;
    public long q;
    public int r;
    public final /* synthetic */ CombinedClickableNode s;
    public final /* synthetic */ long t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CombinedClickableNode$onClickKeyUpEvent$2(CombinedClickableNode combinedClickableNode, long j, Continuation continuation) {
        super(2, continuation);
        this.s = combinedClickableNode;
        this.t = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CombinedClickableNode$onClickKeyUpEvent$2(this.s, this.t, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CombinedClickableNode$onClickKeyUpEvent$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0059, code lost:
    
        if (kotlinx.coroutines.DelayKt.b(r5 - r7, r11) == r0) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r11.r
            r2 = 2
            androidx.compose.foundation.CombinedClickableNode r3 = r11.s
            r4 = 1
            if (r1 == 0) goto L22
            if (r1 == r4) goto L1a
            if (r1 != r2) goto L12
            kotlin.ResultKt.b(r12)
            goto L5c
        L12:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L1a:
            long r5 = r11.q
            long r7 = r11.p
            kotlin.ResultKt.b(r12)
            goto L43
        L22:
            kotlin.ResultKt.b(r12)
            androidx.compose.runtime.StaticProvidableCompositionLocal r12 = androidx.compose.ui.platform.CompositionLocalsKt.s
            java.lang.Object r12 = androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt.a(r3, r12)
            androidx.compose.ui.platform.ViewConfiguration r12 = (androidx.compose.ui.platform.ViewConfiguration) r12
            r12.getClass()
            long r5 = r12.d()
            r7 = 40
            r11.p = r7
            r11.q = r5
            r11.r = r4
            java.lang.Object r12 = kotlinx.coroutines.DelayKt.b(r7, r11)
            if (r12 != r0) goto L43
            goto L5b
        L43:
            androidx.collection.MutableLongObjectMap r12 = r3.M
            long r9 = r11.t
            java.lang.Object r12 = r12.b(r9)
            androidx.compose.foundation.CombinedClickableNode$DoubleKeyClickState r12 = (androidx.compose.foundation.CombinedClickableNode.DoubleKeyClickState) r12
            if (r12 != 0) goto L50
            goto L52
        L50:
            r12.f831a = r4
        L52:
            long r5 = r5 - r7
            r11.r = r2
            java.lang.Object r12 = kotlinx.coroutines.DelayKt.b(r5, r11)
            if (r12 != r0) goto L5c
        L5b:
            return r0
        L5c:
            kotlin.jvm.functions.Function0 r12 = r3.y
            r12.invoke()
            kotlin.Unit r12 = kotlin.Unit.f24250a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.CombinedClickableNode$onClickKeyUpEvent$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
