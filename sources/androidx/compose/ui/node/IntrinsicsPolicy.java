package androidx.compose.ui.node;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.MeasurePolicy;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/node/IntrinsicsPolicy;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class IntrinsicsPolicy {

    /* renamed from: a, reason: collision with root package name */
    public final LayoutNode f1911a;
    public final MutableState b;

    public IntrinsicsPolicy(LayoutNode layoutNode, MeasurePolicy measurePolicy) {
        this.f1911a = layoutNode;
        this.b = SnapshotStateKt.f(measurePolicy);
    }

    public final MeasurePolicy a() {
        return (MeasurePolicy) ((SnapshotMutableStateImpl) this.b).getD();
    }

    public final int b(int i) {
        MeasurePolicy measurePolicyA = a();
        LayoutNode layoutNode = this.f1911a;
        return measurePolicyA.f(layoutNode.K.c, layoutNode.C(), i);
    }

    public final int c(int i) {
        MeasurePolicy measurePolicyA = a();
        LayoutNode layoutNode = this.f1911a;
        return measurePolicyA.h(layoutNode.K.c, layoutNode.C(), i);
    }

    public final int d(int i) {
        MeasurePolicy measurePolicyA = a();
        LayoutNode layoutNode = this.f1911a;
        return measurePolicyA.d(layoutNode.K.c, layoutNode.C(), i);
    }

    public final int e(int i) {
        MeasurePolicy measurePolicyA = a();
        LayoutNode layoutNode = this.f1911a;
        return measurePolicyA.e(layoutNode.K.c, layoutNode.C(), i);
    }

    public final void f(MeasurePolicy measurePolicy) {
        ((SnapshotMutableStateImpl) this.b).setValue(measurePolicy);
    }
}
