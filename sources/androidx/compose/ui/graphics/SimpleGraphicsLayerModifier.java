package androidx.compose.ui.graphics;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/SimpleGraphicsLayerModifier;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
final class SimpleGraphicsLayerModifier extends Modifier.Node implements LayoutModifierNode {
    public boolean A;
    public long B;
    public long C;
    public Function1 D;
    public float r;
    public float s;
    public float t;
    public float u;
    public float v;
    public float w;
    public float x;
    public long y;
    public Shape z;

    @Override // androidx.compose.ui.Modifier.Node
    public final boolean h2() {
        return false;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final MeasureResult n(MeasureScope measureScope, Measurable measurable, long j) {
        final Placeable placeableC0 = measurable.c0(j);
        return measureScope.L0(placeableC0.d, placeableC0.e, EmptyMap.d, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.ui.graphics.SimpleGraphicsLayerModifier$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Placeable.PlacementScope.m((Placeable.PlacementScope) obj, placeableC0, 0, 0, this.D, 4);
                return Unit.f24250a;
            }
        });
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SimpleGraphicsLayerModifier(scaleX=");
        sb.append(this.r);
        sb.append(", scaleY=");
        sb.append(this.s);
        sb.append(", alpha = ");
        sb.append(this.t);
        sb.append(", translationX=");
        sb.append(this.u);
        sb.append(", translationY=0.0, shadowElevation=");
        sb.append(this.v);
        sb.append(", rotationX=0.0, rotationY=0.0, rotationZ=");
        sb.append(this.w);
        sb.append(", cameraDistance=");
        sb.append(this.x);
        sb.append(", transformOrigin=");
        sb.append((Object) TransformOrigin.d(this.y));
        sb.append(", shape=");
        sb.append(this.z);
        sb.append(", clip=");
        sb.append(this.A);
        sb.append(", renderEffect=null, ambientShadowColor=");
        android.support.v4.media.session.a.A(this.B, ", spotShadowColor=", sb);
        sb.append((Object) Color.i(this.C));
        sb.append(", compositingStrategy=CompositingStrategy(value=0))");
        return sb.toString();
    }
}
