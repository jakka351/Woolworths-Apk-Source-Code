package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.OnGloballyPositionedModifier;
import androidx.compose.ui.node.NodeCoordinator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuationImpl;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;", "Landroidx/compose/ui/layout/OnGloballyPositionedModifier;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class AwaitFirstLayoutModifier implements OnGloballyPositionedModifier {
    public boolean d;
    public CancellableContinuationImpl e;

    @Override // androidx.compose.ui.layout.OnGloballyPositionedModifier
    public final void Q(NodeCoordinator nodeCoordinator) {
        if (this.d) {
            return;
        }
        this.d = true;
        CancellableContinuationImpl cancellableContinuationImpl = this.e;
        if (cancellableContinuationImpl != null) {
            cancellableContinuationImpl.resumeWith(Unit.f24250a);
        }
        this.e = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier$waitForFirstLayout$1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier$waitForFirstLayout$1 r0 = (androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier$waitForFirstLayout$1) r0
            int r1 = r0.s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s = r1
            goto L18
        L13:
            androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier$waitForFirstLayout$1 r0 = new androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier$waitForFirstLayout$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.s
            kotlin.Unit r3 = kotlin.Unit.f24250a
            r4 = 1
            if (r2 == 0) goto L33
            if (r2 != r4) goto L2b
            kotlinx.coroutines.CancellableContinuationImpl r0 = r0.p
            kotlin.ResultKt.b(r6)
            goto L56
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L33:
            kotlin.ResultKt.b(r6)
            boolean r6 = r5.d
            if (r6 != 0) goto L5b
            kotlinx.coroutines.CancellableContinuationImpl r6 = r5.e
            r0.p = r6
            r0.s = r4
            kotlinx.coroutines.CancellableContinuationImpl r2 = new kotlinx.coroutines.CancellableContinuationImpl
            kotlin.coroutines.Continuation r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.b(r0)
            r2.<init>(r4, r0)
            r2.o()
            r5.e = r2
            java.lang.Object r0 = r2.n()
            if (r0 != r1) goto L55
            return r1
        L55:
            r0 = r6
        L56:
            if (r0 == 0) goto L5b
            r0.resumeWith(r3)
        L5b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
