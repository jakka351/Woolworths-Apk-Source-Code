package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.AnchoredDraggableState", f = "AnchoredDraggable.kt", l = {1170}, m = "anchoredDrag")
/* loaded from: classes2.dex */
final class AnchoredDraggableState$anchoredDrag$3 extends ContinuationImpl {
    public AnchoredDraggableState p;
    public /* synthetic */ Object q;
    public final /* synthetic */ AnchoredDraggableState r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableState$anchoredDrag$3(AnchoredDraggableState anchoredDraggableState, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.r = anchoredDraggableState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Type inference failed for: r8v11, types: [androidx.compose.runtime.SnapshotMutableStateImpl] */
    /* JADX WARN: Type inference failed for: r8v3, types: [androidx.compose.foundation.gestures.AnchoredDraggableState, java.lang.Object] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            r7.q = r8
            int r8 = r7.s
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = r8 | r0
            r7.s = r8
            androidx.compose.foundation.gestures.AnchoredDraggableState r8 = r7.r
            r8.getClass()
            boolean r0 = r7 instanceof androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$3
            if (r0 == 0) goto L1f
            int r0 = r7.s
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L1f
            int r0 = r0 - r1
            r7.s = r0
            r0 = r7
            goto L24
        L1f:
            androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$3 r0 = new androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$3
            r0.<init>(r8, r7)
        L24:
            java.lang.Object r1 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r3 = r0.s
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L40
            if (r3 != r4) goto L38
            androidx.compose.foundation.gestures.AnchoredDraggableState r8 = r0.p
            kotlin.ResultKt.b(r1)     // Catch: java.lang.Throwable -> L36
            goto L60
        L36:
            r0 = move-exception
            goto L68
        L38:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L40:
            kotlin.ResultKt.b(r1)
            androidx.compose.foundation.gestures.DraggableAnchors r1 = r8.a()
            r3 = 0
            boolean r1 = r1.d(r3)
            if (r1 == 0) goto L70
            androidx.compose.foundation.MutatorMutex r1 = r8.b     // Catch: java.lang.Throwable -> L36
            androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$4 r6 = new androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$4     // Catch: java.lang.Throwable -> L36
            r6.<init>(r8, r3, r3, r5)     // Catch: java.lang.Throwable -> L36
            r0.p = r8     // Catch: java.lang.Throwable -> L36
            r0.s = r4     // Catch: java.lang.Throwable -> L36
            java.lang.Object r0 = r1.b(r3, r6, r0)     // Catch: java.lang.Throwable -> L36
            if (r0 != r2) goto L60
            goto L8f
        L60:
            androidx.compose.runtime.MutableState r8 = r8.i
            androidx.compose.runtime.SnapshotMutableStateImpl r8 = (androidx.compose.runtime.SnapshotMutableStateImpl) r8
            r8.setValue(r5)
            goto L8d
        L68:
            androidx.compose.runtime.MutableState r8 = r8.i
            androidx.compose.runtime.SnapshotMutableStateImpl r8 = (androidx.compose.runtime.SnapshotMutableStateImpl) r8
            r8.setValue(r5)
            throw r0
        L70:
            kotlin.jvm.functions.Function1 r0 = r8.f868a
            androidx.compose.foundation.gestures.AnchoredDraggableState$confirmValueChange$1 r0 = (androidx.compose.foundation.gestures.AnchoredDraggableState$confirmValueChange$1) r0
            r0.getClass()
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L8d
            androidx.compose.runtime.MutableState r0 = r8.d
            androidx.compose.runtime.SnapshotMutableStateImpl r0 = (androidx.compose.runtime.SnapshotMutableStateImpl) r0
            r0.setValue(r3)
            androidx.compose.runtime.MutableState r8 = r8.c
            androidx.compose.runtime.SnapshotMutableStateImpl r8 = (androidx.compose.runtime.SnapshotMutableStateImpl) r8
            r8.setValue(r3)
        L8d:
            kotlin.Unit r2 = kotlin.Unit.f24250a
        L8f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
