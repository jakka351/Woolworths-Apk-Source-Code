package androidx.compose.foundation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/BackgroundElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/BackgroundNode;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class BackgroundElement extends ModifierNodeElement<BackgroundNode> {
    public final long d;
    public final Brush e;
    public final float f;
    public final Shape g;
    public final Function1 h;

    public BackgroundElement(long j, Brush brush, Shape shape, Function1 function1, int i) {
        j = (i & 1) != 0 ? Color.k : j;
        brush = (i & 2) != 0 ? null : brush;
        this.d = j;
        this.e = brush;
        this.f = 1.0f;
        this.g = shape;
        this.h = function1;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        BackgroundNode backgroundNode = new BackgroundNode();
        backgroundNode.r = this.d;
        backgroundNode.s = this.e;
        backgroundNode.t = this.f;
        backgroundNode.u = this.g;
        backgroundNode.v = 9205357640488583168L;
        return backgroundNode;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        BackgroundNode backgroundNode = (BackgroundNode) node;
        backgroundNode.r = this.d;
        backgroundNode.s = this.e;
        backgroundNode.t = this.f;
        backgroundNode.u = this.g;
    }

    public final boolean equals(Object obj) {
        BackgroundElement backgroundElement = obj instanceof BackgroundElement ? (BackgroundElement) obj : null;
        return backgroundElement != null && Color.c(this.d, backgroundElement.d) && Intrinsics.c(this.e, backgroundElement.e) && this.f == backgroundElement.f && Intrinsics.c(this.g, backgroundElement.g);
    }

    public final int hashCode() {
        int i = Color.l;
        int iHashCode = Long.hashCode(this.d) * 31;
        Brush brush = this.e;
        return this.g.hashCode() + android.support.v4.media.session.a.b(this.f, (iHashCode + (brush != null ? brush.hashCode() : 0)) * 31, 31);
    }
}
