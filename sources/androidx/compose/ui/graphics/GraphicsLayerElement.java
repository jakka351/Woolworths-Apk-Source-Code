package androidx.compose.ui.graphics;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.node.NodeCoordinator;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/GraphicsLayerElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/graphics/SimpleGraphicsLayerModifier;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class GraphicsLayerElement extends ModifierNodeElement<SimpleGraphicsLayerModifier> {
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final float i;
    public final long j;
    public final Shape k;
    public final boolean l;
    public final long m;
    public final long n;

    public GraphicsLayerElement(float f, float f2, float f3, float f4, float f5, float f6, long j, Shape shape, boolean z, long j2, long j3) {
        this.d = f;
        this.e = f2;
        this.f = f3;
        this.g = f4;
        this.h = f5;
        this.i = f6;
        this.j = j;
        this.k = shape;
        this.l = z;
        this.m = j2;
        this.n = j3;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        final SimpleGraphicsLayerModifier simpleGraphicsLayerModifier = new SimpleGraphicsLayerModifier();
        simpleGraphicsLayerModifier.r = this.d;
        simpleGraphicsLayerModifier.s = this.e;
        simpleGraphicsLayerModifier.t = this.f;
        simpleGraphicsLayerModifier.u = this.g;
        simpleGraphicsLayerModifier.v = this.h;
        simpleGraphicsLayerModifier.w = this.i;
        simpleGraphicsLayerModifier.x = 8.0f;
        simpleGraphicsLayerModifier.y = this.j;
        simpleGraphicsLayerModifier.z = this.k;
        simpleGraphicsLayerModifier.A = this.l;
        simpleGraphicsLayerModifier.B = this.m;
        simpleGraphicsLayerModifier.C = this.n;
        simpleGraphicsLayerModifier.D = new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.ui.graphics.SimpleGraphicsLayerModifier$layerBlock$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                GraphicsLayerScope graphicsLayerScope = (GraphicsLayerScope) obj;
                SimpleGraphicsLayerModifier simpleGraphicsLayerModifier2 = simpleGraphicsLayerModifier;
                graphicsLayerScope.j(simpleGraphicsLayerModifier2.r);
                graphicsLayerScope.l(simpleGraphicsLayerModifier2.s);
                graphicsLayerScope.b(simpleGraphicsLayerModifier2.t);
                graphicsLayerScope.m(simpleGraphicsLayerModifier2.u);
                graphicsLayerScope.c(BitmapDescriptorFactory.HUE_RED);
                graphicsLayerScope.A(simpleGraphicsLayerModifier2.v);
                graphicsLayerScope.e(BitmapDescriptorFactory.HUE_RED);
                graphicsLayerScope.f(BitmapDescriptorFactory.HUE_RED);
                graphicsLayerScope.g(simpleGraphicsLayerModifier2.w);
                graphicsLayerScope.d(simpleGraphicsLayerModifier2.x);
                graphicsLayerScope.p0(simpleGraphicsLayerModifier2.y);
                graphicsLayerScope.H0(simpleGraphicsLayerModifier2.z);
                graphicsLayerScope.z(simpleGraphicsLayerModifier2.A);
                graphicsLayerScope.k(null);
                graphicsLayerScope.K(simpleGraphicsLayerModifier2.B);
                graphicsLayerScope.L(simpleGraphicsLayerModifier2.C);
                graphicsLayerScope.x();
                return Unit.f24250a;
            }
        };
        return simpleGraphicsLayerModifier;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        SimpleGraphicsLayerModifier simpleGraphicsLayerModifier = (SimpleGraphicsLayerModifier) node;
        simpleGraphicsLayerModifier.r = this.d;
        simpleGraphicsLayerModifier.s = this.e;
        simpleGraphicsLayerModifier.t = this.f;
        simpleGraphicsLayerModifier.u = this.g;
        simpleGraphicsLayerModifier.v = this.h;
        simpleGraphicsLayerModifier.w = this.i;
        simpleGraphicsLayerModifier.x = 8.0f;
        simpleGraphicsLayerModifier.y = this.j;
        simpleGraphicsLayerModifier.z = this.k;
        simpleGraphicsLayerModifier.A = this.l;
        simpleGraphicsLayerModifier.B = this.m;
        simpleGraphicsLayerModifier.C = this.n;
        NodeCoordinator nodeCoordinator = DelegatableNodeKt.e(simpleGraphicsLayerModifier, 2).s;
        if (nodeCoordinator != null) {
            nodeCoordinator.d2(simpleGraphicsLayerModifier.D, true);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GraphicsLayerElement)) {
            return false;
        }
        GraphicsLayerElement graphicsLayerElement = (GraphicsLayerElement) obj;
        return Float.compare(this.d, graphicsLayerElement.d) == 0 && Float.compare(this.e, graphicsLayerElement.e) == 0 && Float.compare(this.f, graphicsLayerElement.f) == 0 && Float.compare(this.g, graphicsLayerElement.g) == 0 && Float.compare(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == 0 && Float.compare(this.h, graphicsLayerElement.h) == 0 && Float.compare(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == 0 && Float.compare(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == 0 && Float.compare(this.i, graphicsLayerElement.i) == 0 && Float.compare(8.0f, 8.0f) == 0 && TransformOrigin.a(this.j, graphicsLayerElement.j) && Intrinsics.c(this.k, graphicsLayerElement.k) && this.l == graphicsLayerElement.l && Color.c(this.m, graphicsLayerElement.m) && Color.c(this.n, graphicsLayerElement.n);
    }

    public final int hashCode() {
        int iB = android.support.v4.media.session.a.b(8.0f, android.support.v4.media.session.a.b(this.i, android.support.v4.media.session.a.b(BitmapDescriptorFactory.HUE_RED, android.support.v4.media.session.a.b(BitmapDescriptorFactory.HUE_RED, android.support.v4.media.session.a.b(this.h, android.support.v4.media.session.a.b(BitmapDescriptorFactory.HUE_RED, android.support.v4.media.session.a.b(this.g, android.support.v4.media.session.a.b(this.f, android.support.v4.media.session.a.b(this.e, Float.hashCode(this.d) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
        int i = TransformOrigin.c;
        int iE = androidx.camera.core.impl.b.e((this.k.hashCode() + androidx.camera.core.impl.b.b(iB, 31, this.j)) * 31, 961, this.l);
        int i2 = Color.l;
        return Integer.hashCode(0) + androidx.camera.core.impl.b.b(androidx.camera.core.impl.b.b(iE, 31, this.m), 31, this.n);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GraphicsLayerElement(scaleX=");
        sb.append(this.d);
        sb.append(", scaleY=");
        sb.append(this.e);
        sb.append(", alpha=");
        sb.append(this.f);
        sb.append(", translationX=");
        sb.append(this.g);
        sb.append(", translationY=0.0, shadowElevation=");
        sb.append(this.h);
        sb.append(", rotationX=0.0, rotationY=0.0, rotationZ=");
        sb.append(this.i);
        sb.append(", cameraDistance=8.0, transformOrigin=");
        sb.append((Object) TransformOrigin.d(this.j));
        sb.append(", shape=");
        sb.append(this.k);
        sb.append(", clip=");
        sb.append(this.l);
        sb.append(", renderEffect=null, ambientShadowColor=");
        android.support.v4.media.session.a.A(this.m, ", spotShadowColor=", sb);
        sb.append((Object) Color.i(this.n));
        sb.append(", compositingStrategy=CompositingStrategy(value=0))");
        return sb.toString();
    }
}
