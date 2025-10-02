package androidx.compose.foundation;

import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.AbstractClickableNode$handlePressInteraction$2$1", f = "Clickable.kt", l = {1263, 1265, 1272, 1273, 1283}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class AbstractClickableNode$handlePressInteraction$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public boolean p;
    public int q;
    public /* synthetic */ Object r;
    public final /* synthetic */ PressGestureScope s;
    public final /* synthetic */ long t;
    public final /* synthetic */ MutableInteractionSource u;
    public final /* synthetic */ AbstractClickableNode v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractClickableNode$handlePressInteraction$2$1(PressGestureScope pressGestureScope, long j, MutableInteractionSource mutableInteractionSource, AbstractClickableNode abstractClickableNode, Continuation continuation) {
        super(2, continuation);
        this.s = pressGestureScope;
        this.t = j;
        this.u = mutableInteractionSource;
        this.v = abstractClickableNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        AbstractClickableNode$handlePressInteraction$2$1 abstractClickableNode$handlePressInteraction$2$1 = new AbstractClickableNode$handlePressInteraction$2$1(this.s, this.t, this.u, this.v, continuation);
        abstractClickableNode$handlePressInteraction$2$1.r = obj;
        return abstractClickableNode$handlePressInteraction$2$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((AbstractClickableNode$handlePressInteraction$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a0, code lost:
    
        if (r14.b(r2, r16) != r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00bc, code lost:
    
        if (r14.b(r3, r16) == r1) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0080  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            r16 = this;
            r0 = r16
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.q
            androidx.compose.foundation.AbstractClickableNode r4 = r0.v
            r9 = 5
            r10 = 4
            r11 = 3
            r12 = 2
            r13 = 1
            androidx.compose.foundation.interaction.MutableInteractionSource r14 = r0.u
            r15 = 0
            if (r2 == 0) goto L42
            if (r2 == r13) goto L38
            if (r2 == r12) goto L32
            if (r2 == r11) goto L2a
            if (r2 == r10) goto L25
            if (r2 != r9) goto L1d
            goto L25
        L1d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L25:
            kotlin.ResultKt.b(r17)
            goto Lbf
        L2a:
            java.lang.Object r2 = r0.r
            androidx.compose.foundation.interaction.PressInteraction$Release r2 = (androidx.compose.foundation.interaction.PressInteraction.Release) r2
            kotlin.ResultKt.b(r17)
            goto L98
        L32:
            boolean r2 = r0.p
            kotlin.ResultKt.b(r17)
            goto L7e
        L38:
            java.lang.Object r2 = r0.r
            kotlinx.coroutines.Job r2 = (kotlinx.coroutines.Job) r2
            kotlin.ResultKt.b(r17)
            r3 = r17
            goto L64
        L42:
            kotlin.ResultKt.b(r17)
            java.lang.Object r2 = r0.r
            kotlinx.coroutines.CoroutineScope r2 = (kotlinx.coroutines.CoroutineScope) r2
            androidx.compose.foundation.AbstractClickableNode$handlePressInteraction$2$1$delayJob$1 r3 = new androidx.compose.foundation.AbstractClickableNode$handlePressInteraction$2$1$delayJob$1
            androidx.compose.foundation.interaction.MutableInteractionSource r7 = r0.u
            r8 = 0
            long r5 = r0.t
            r3.<init>(r4, r5, r7, r8)
            kotlinx.coroutines.Job r2 = kotlinx.coroutines.BuildersKt.c(r2, r15, r15, r3, r11)
            r0.r = r2
            r0.q = r13
            androidx.compose.foundation.gestures.PressGestureScope r3 = r0.s
            java.lang.Object r3 = r3.Y0(r0)
            if (r3 != r1) goto L64
            goto Lbe
        L64:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            boolean r5 = r2.isActive()
            if (r5 == 0) goto La3
            r0.r = r15
            r0.p = r3
            r0.q = r12
            java.lang.Object r2 = kotlinx.coroutines.JobKt.c(r2, r0)
            if (r2 != r1) goto L7d
            goto Lbe
        L7d:
            r2 = r3
        L7e:
            if (r2 == 0) goto Lbf
            androidx.compose.foundation.interaction.PressInteraction$Press r2 = new androidx.compose.foundation.interaction.PressInteraction$Press
            long r5 = r0.t
            r2.<init>(r5)
            androidx.compose.foundation.interaction.PressInteraction$Release r3 = new androidx.compose.foundation.interaction.PressInteraction$Release
            r3.<init>(r2)
            r0.r = r3
            r0.q = r11
            java.lang.Object r2 = r14.b(r2, r0)
            if (r2 != r1) goto L97
            goto Lbe
        L97:
            r2 = r3
        L98:
            r0.r = r15
            r0.q = r10
            java.lang.Object r2 = r14.b(r2, r0)
            if (r2 != r1) goto Lbf
            goto Lbe
        La3:
            androidx.compose.foundation.interaction.PressInteraction$Press r2 = r4.C
            if (r2 == 0) goto Lbf
            if (r3 == 0) goto Laf
            androidx.compose.foundation.interaction.PressInteraction$Release r3 = new androidx.compose.foundation.interaction.PressInteraction$Release
            r3.<init>(r2)
            goto Lb4
        Laf:
            androidx.compose.foundation.interaction.PressInteraction$Cancel r3 = new androidx.compose.foundation.interaction.PressInteraction$Cancel
            r3.<init>(r2)
        Lb4:
            r0.r = r15
            r0.q = r9
            java.lang.Object r2 = r14.b(r3, r0)
            if (r2 != r1) goto Lbf
        Lbe:
            return r1
        Lbf:
            r4.C = r15
            kotlin.Unit r1 = kotlin.Unit.f24250a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AbstractClickableNode$handlePressInteraction$2$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
