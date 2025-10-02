package androidx.compose.foundation.gestures;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutableFloatStateImpl;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/foundation/gestures/AnchoredDraggableState$anchoredDragScope$1", "Landroidx/compose/foundation/gestures/AnchoredDragScope;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AnchoredDraggableState$anchoredDragScope$1 implements AnchoredDragScope {

    /* renamed from: a, reason: collision with root package name */
    public Object f869a;
    public Object b;
    public float c = Float.NaN;
    public final /* synthetic */ AnchoredDraggableState d;

    public AnchoredDraggableState$anchoredDragScope$1(AnchoredDraggableState anchoredDraggableState) {
        this.d = anchoredDraggableState;
    }

    @Override // androidx.compose.foundation.gestures.AnchoredDragScope
    public final void a(float f, float f2) {
        AnchoredDraggableState anchoredDraggableState = this.d;
        MutableState mutableState = anchoredDraggableState.c;
        MutableFloatState mutableFloatState = anchoredDraggableState.f;
        float fA = ((SnapshotMutableFloatStateImpl) mutableFloatState).a();
        ((SnapshotMutableFloatStateImpl) mutableFloatState).p(f);
        ((SnapshotMutableFloatStateImpl) anchoredDraggableState.h).p(f2);
        if (Float.isNaN(fA)) {
            return;
        }
        boolean z = f >= fA;
        SnapshotMutableStateImpl snapshotMutableStateImpl = (SnapshotMutableStateImpl) mutableState;
        SnapshotMutableFloatStateImpl snapshotMutableFloatStateImpl = (SnapshotMutableFloatStateImpl) mutableFloatState;
        if (snapshotMutableFloatStateImpl.a() == anchoredDraggableState.a().c(snapshotMutableStateImpl.getD())) {
            Object objA = anchoredDraggableState.a().a(snapshotMutableFloatStateImpl.a() + (z ? 1.0f : -1.0f), z);
            if (objA == null) {
                objA = snapshotMutableStateImpl.getD();
            }
            if (z) {
                this.f869a = snapshotMutableStateImpl.getD();
                this.b = objA;
            } else {
                this.f869a = objA;
                this.b = snapshotMutableStateImpl.getD();
            }
        } else {
            Object objA2 = anchoredDraggableState.a().a(snapshotMutableFloatStateImpl.a(), false);
            if (objA2 == null) {
                objA2 = snapshotMutableStateImpl.getD();
            }
            Object objA3 = anchoredDraggableState.a().a(snapshotMutableFloatStateImpl.a(), true);
            if (objA3 == null) {
                objA3 = snapshotMutableStateImpl.getD();
            }
            this.f869a = objA2;
            this.b = objA3;
        }
        DraggableAnchors draggableAnchorsA = anchoredDraggableState.a();
        Object obj = this.f869a;
        Intrinsics.e(obj);
        float fC = draggableAnchorsA.c(obj);
        DraggableAnchors draggableAnchorsA2 = anchoredDraggableState.a();
        Object obj2 = this.b;
        Intrinsics.e(obj2);
        this.c = Math.abs(fC - draggableAnchorsA2.c(obj2));
        if (Math.abs(snapshotMutableFloatStateImpl.a() - anchoredDraggableState.a().c(snapshotMutableStateImpl.getD())) >= this.c / 2.0f) {
            Object d = z ? this.b : this.f869a;
            if (d == null) {
                d = snapshotMutableStateImpl.getD();
            }
            ((AnchoredDraggableState$confirmValueChange$1) anchoredDraggableState.f868a).getClass();
            if (Boolean.TRUE.booleanValue()) {
                ((SnapshotMutableStateImpl) mutableState).setValue(d);
            }
        }
    }
}
