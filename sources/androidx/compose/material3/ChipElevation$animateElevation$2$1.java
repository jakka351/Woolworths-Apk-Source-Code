package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material3.ChipElevation$animateElevation$2$1", f = "Chip.kt", l = {2241, 2243}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ChipElevation$animateElevation$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ Animatable q;
    public final /* synthetic */ float r;
    public final /* synthetic */ boolean s;
    public final /* synthetic */ Interaction t;
    public final /* synthetic */ MutableState u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChipElevation$animateElevation$2$1(Animatable animatable, float f, boolean z, Interaction interaction, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.q = animatable;
        this.r = f;
        this.s = z;
        this.t = interaction;
        this.u = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChipElevation$animateElevation$2$1(this.q, this.r, this.s, this.t, this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ChipElevation$animateElevation$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0045, code lost:
    
        if (r8.h(r1, r7) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0054, code lost:
    
        if (androidx.compose.material3.internal.ElevationKt.a(r8, r6, r1, r2, r7) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0056, code lost:
    
        return r0;
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
            int r1 = r7.p
            androidx.compose.foundation.interaction.Interaction r2 = r7.t
            androidx.compose.runtime.MutableState r3 = r7.u
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L1d
            if (r1 == r5) goto L19
            if (r1 != r4) goto L11
            goto L19
        L11:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L19:
            kotlin.ResultKt.b(r8)
            goto L57
        L1d:
            kotlin.ResultKt.b(r8)
            androidx.compose.animation.core.Animatable r8 = r7.q
            androidx.compose.runtime.MutableState r1 = r8.e
            androidx.compose.runtime.SnapshotMutableStateImpl r1 = (androidx.compose.runtime.SnapshotMutableStateImpl) r1
            java.lang.Object r1 = r1.getD()
            androidx.compose.ui.unit.Dp r1 = (androidx.compose.ui.unit.Dp) r1
            float r1 = r1.d
            float r6 = r7.r
            boolean r1 = androidx.compose.ui.unit.Dp.a(r1, r6)
            if (r1 != 0) goto L5a
            boolean r1 = r7.s
            if (r1 != 0) goto L48
            androidx.compose.ui.unit.Dp r1 = new androidx.compose.ui.unit.Dp
            r1.<init>(r6)
            r7.p = r5
            java.lang.Object r8 = r8.h(r1, r7)
            if (r8 != r0) goto L57
            goto L56
        L48:
            java.lang.Object r1 = r3.getD()
            androidx.compose.foundation.interaction.Interaction r1 = (androidx.compose.foundation.interaction.Interaction) r1
            r7.p = r4
            java.lang.Object r8 = androidx.compose.material3.internal.ElevationKt.a(r8, r6, r1, r2, r7)
            if (r8 != r0) goto L57
        L56:
            return r0
        L57:
            r3.setValue(r2)
        L5a:
            kotlin.Unit r8 = kotlin.Unit.f24250a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ChipElevation$animateElevation$2$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
