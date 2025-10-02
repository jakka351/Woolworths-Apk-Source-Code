package androidx.compose.foundation;

import android.view.View;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatableNode_androidKt;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@StabilityInferred
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/MagnifierElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/MagnifierNode;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MagnifierElement extends ModifierNodeElement<MagnifierNode> {
    public final Lambda d;
    public final Lambda e;
    public final PlatformMagnifierFactory f;

    /* JADX WARN: Multi-variable type inference failed */
    public MagnifierElement(Function1 function1, Function1 function12, PlatformMagnifierFactory platformMagnifierFactory) {
        this.d = (Lambda) function1;
        this.e = (Lambda) function12;
        this.f = platformMagnifierFactory;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        return new MagnifierNode(this.d, this.e, this.f);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        MagnifierNode magnifierNode = (MagnifierNode) node;
        float f = magnifierNode.t;
        long j = magnifierNode.v;
        float f2 = magnifierNode.w;
        boolean z = magnifierNode.u;
        float f3 = magnifierNode.x;
        boolean z2 = magnifierNode.y;
        PlatformMagnifierFactory platformMagnifierFactory = magnifierNode.z;
        View view = magnifierNode.A;
        Density density = magnifierNode.B;
        magnifierNode.r = this.d;
        magnifierNode.t = Float.NaN;
        magnifierNode.u = true;
        magnifierNode.v = 9205357640488583168L;
        magnifierNode.w = Float.NaN;
        magnifierNode.x = Float.NaN;
        magnifierNode.y = true;
        magnifierNode.s = this.e;
        PlatformMagnifierFactory platformMagnifierFactory2 = this.f;
        magnifierNode.z = platformMagnifierFactory2;
        View viewA = DelegatableNode_androidKt.a(magnifierNode);
        Density density2 = DelegatableNodeKt.g(magnifierNode).D;
        if (magnifierNode.C != null) {
            SemanticsPropertyKey semanticsPropertyKey = Magnifier_androidKt.f839a;
            if (((!Float.isNaN(Float.NaN) || !Float.isNaN(f)) && Float.NaN != f && !platformMagnifierFactory2.b()) || 9205357640488583168L != j || !Dp.a(Float.NaN, f2) || !Dp.a(Float.NaN, f3) || true != z || true != z2 || !platformMagnifierFactory2.equals(platformMagnifierFactory) || !viewA.equals(view) || !Intrinsics.c(density2, density)) {
                magnifierNode.t2();
            }
        }
        magnifierNode.u2();
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + b.e(android.support.v4.media.session.a.b(Float.NaN, android.support.v4.media.session.a.b(Float.NaN, b.b(b.e(android.support.v4.media.session.a.b(Float.NaN, this.d.hashCode() * 961, 31), 31, true), 31, 9205357640488583168L), 31), 31), 31, true)) * 31);
    }
}
