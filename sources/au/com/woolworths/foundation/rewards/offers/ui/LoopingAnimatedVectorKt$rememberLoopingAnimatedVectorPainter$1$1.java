package au.com.woolworths.foundation.rewards.offers.ui;

import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.foundation.rewards.offers.ui.LoopingAnimatedVectorKt$rememberLoopingAnimatedVectorPainter$1$1", f = "LoopingAnimatedVector.kt", l = {32}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class LoopingAnimatedVectorKt$rememberLoopingAnimatedVectorPainter$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ long q;
    public final /* synthetic */ MutableState r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoopingAnimatedVectorKt$rememberLoopingAnimatedVectorPainter$1$1(long j, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.q = j;
        this.r = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LoopingAnimatedVectorKt$rememberLoopingAnimatedVectorPainter$1$1(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((LoopingAnimatedVectorKt$rememberLoopingAnimatedVectorPainter$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        return CoroutineSingletons.d;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0025 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:12:0x0026). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r7.p
            r2 = 1
            if (r1 == 0) goto L15
            if (r1 != r2) goto Ld
            kotlin.ResultKt.b(r8)
            goto L26
        Ld:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L15:
            kotlin.ResultKt.b(r8)
        L18:
            r8 = 2
            long r3 = (long) r8
            long r5 = r7.q
            long r3 = r3 * r5
            r7.p = r2
            java.lang.Object r8 = kotlinx.coroutines.DelayKt.b(r3, r7)
            if (r8 != r0) goto L26
            return r0
        L26:
            androidx.compose.runtime.MutableState r8 = r7.r
            java.lang.Object r1 = r8.getD()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r1 = r1 ^ r2
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r8.setValue(r1)
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.foundation.rewards.offers.ui.LoopingAnimatedVectorKt$rememberLoopingAnimatedVectorPainter$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
