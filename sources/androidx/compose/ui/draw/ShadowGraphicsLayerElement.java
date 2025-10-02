package androidx.compose.ui.draw;

import android.support.v4.media.session.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.BlockGraphicsLayerModifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/graphics/BlockGraphicsLayerModifier;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ShadowGraphicsLayerElement extends ModifierNodeElement<BlockGraphicsLayerModifier> {
    public final float d;
    public final Shape e;
    public final boolean f;
    public final long g;
    public final long h;

    public ShadowGraphicsLayerElement(float f, Shape shape, boolean z, long j, long j2) {
        this.d = f;
        this.e = shape;
        this.f = z;
        this.g = j;
        this.h = j2;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        return new BlockGraphicsLayerModifier(new ShadowGraphicsLayerElement$createBlock$1(this));
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        BlockGraphicsLayerModifier blockGraphicsLayerModifier = (BlockGraphicsLayerModifier) node;
        blockGraphicsLayerModifier.r = new ShadowGraphicsLayerElement$createBlock$1(this);
        NodeCoordinator nodeCoordinator = DelegatableNodeKt.e(blockGraphicsLayerModifier, 2).s;
        if (nodeCoordinator != null) {
            nodeCoordinator.d2(blockGraphicsLayerModifier.r, true);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShadowGraphicsLayerElement)) {
            return false;
        }
        ShadowGraphicsLayerElement shadowGraphicsLayerElement = (ShadowGraphicsLayerElement) obj;
        return Dp.a(this.d, shadowGraphicsLayerElement.d) && Intrinsics.c(this.e, shadowGraphicsLayerElement.e) && this.f == shadowGraphicsLayerElement.f && Color.c(this.g, shadowGraphicsLayerElement.g) && Color.c(this.h, shadowGraphicsLayerElement.h);
    }

    public final int hashCode() {
        int iE = b.e((this.e.hashCode() + (Float.hashCode(this.d) * 31)) * 31, 31, this.f);
        int i = Color.l;
        return Long.hashCode(this.h) + b.b(iE, 31, this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShadowGraphicsLayerElement(elevation=");
        sb.append((Object) Dp.b(this.d));
        sb.append(", shape=");
        sb.append(this.e);
        sb.append(", clip=");
        sb.append(this.f);
        sb.append(", ambientColor=");
        a.A(this.g, ", spotColor=", sb);
        sb.append((Object) Color.i(this.h));
        sb.append(')');
        return sb.toString();
    }
}
