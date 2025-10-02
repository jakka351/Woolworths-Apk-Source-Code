package androidx.compose.ui.draw;

import androidx.camera.core.impl.b;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DrawModifierNodeKt;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import androidx.compose.ui.node.ObserverModifierNode;
import androidx.compose.ui.node.ObserverModifierNodeKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/draw/CacheDrawModifierNodeImpl;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/draw/CacheDrawModifierNode;", "Landroidx/compose/ui/node/ObserverModifierNode;", "Landroidx/compose/ui/draw/BuildDrawCacheParams;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
final class CacheDrawModifierNodeImpl extends Modifier.Node implements CacheDrawModifierNode, ObserverModifierNode, BuildDrawCacheParams {
    public final CacheDrawScope r;
    public boolean s;
    public ScopedGraphicsContext t;
    public Function1 u;

    public CacheDrawModifierNodeImpl(CacheDrawScope cacheDrawScope, Function1 function1) {
        this.r = cacheDrawScope;
        this.u = function1;
        cacheDrawScope.d = this;
        cacheDrawScope.g = new Function0<GraphicsContext>() { // from class: androidx.compose.ui.draw.CacheDrawModifierNodeImpl.1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CacheDrawModifierNodeImpl cacheDrawModifierNodeImpl = CacheDrawModifierNodeImpl.this;
                ScopedGraphicsContext scopedGraphicsContext = cacheDrawModifierNodeImpl.t;
                if (scopedGraphicsContext == null) {
                    scopedGraphicsContext = new ScopedGraphicsContext();
                    cacheDrawModifierNodeImpl.t = scopedGraphicsContext;
                }
                if (scopedGraphicsContext.getB() == null) {
                    scopedGraphicsContext.e(DelegatableNodeKt.h(cacheDrawModifierNodeImpl).getGraphicsContext());
                }
                return scopedGraphicsContext;
            }
        };
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public final void E0() {
        z1();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    @Override // androidx.compose.ui.node.DrawModifierNode
    public final void I(LayoutNodeDrawScope layoutNodeDrawScope) {
        boolean z = this.s;
        final CacheDrawScope cacheDrawScope = this.r;
        if (!z) {
            cacheDrawScope.e = null;
            cacheDrawScope.f = layoutNodeDrawScope;
            ObserverModifierNodeKt.a(this, new Function0<Unit>() { // from class: androidx.compose.ui.draw.CacheDrawModifierNodeImpl$getOrBuildCachedDrawBlock$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    this.h.u.invoke(cacheDrawScope);
                    return Unit.f24250a;
                }
            });
            if (cacheDrawScope.e == null) {
                throw b.w("DrawResult not defined, did you forget to call onDraw?");
            }
            this.s = true;
        }
        DrawResult drawResult = cacheDrawScope.e;
        Intrinsics.e(drawResult);
        drawResult.f1741a.invoke(layoutNodeDrawScope);
    }

    @Override // androidx.compose.ui.node.DelegatableNode, androidx.compose.ui.node.PointerInputModifierNode
    public final void P() {
        z1();
    }

    @Override // androidx.compose.ui.draw.BuildDrawCacheParams
    public final Density getDensity() {
        return DelegatableNodeKt.g(this).D;
    }

    @Override // androidx.compose.ui.draw.BuildDrawCacheParams
    public final LayoutDirection getLayoutDirection() {
        return DelegatableNodeKt.g(this).E;
    }

    @Override // androidx.compose.ui.draw.BuildDrawCacheParams
    public final long h() {
        return IntSizeKt.d(DelegatableNodeKt.e(this, 128).f);
    }

    @Override // androidx.compose.ui.node.DelegatableNode
    public final void j1() {
        z1();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void l2() {
        ScopedGraphicsContext scopedGraphicsContext = this.t;
        if (scopedGraphicsContext != null) {
            scopedGraphicsContext.d();
        }
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public final void o1() {
        z1();
    }

    @Override // androidx.compose.ui.draw.CacheDrawModifierNode
    public final void z1() {
        ScopedGraphicsContext scopedGraphicsContext = this.t;
        if (scopedGraphicsContext != null) {
            scopedGraphicsContext.d();
        }
        this.s = false;
        this.r.e = null;
        DrawModifierNodeKt.a(this);
    }
}
