package androidx.compose.ui.draw;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope$drawContext$1;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/draw/CacheDrawScope;", "Landroidx/compose/ui/unit/Density;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class CacheDrawScope implements Density {
    public BuildDrawCacheParams d = EmptyBuildDrawCacheParams.d;
    public DrawResult e;
    public LayoutNodeDrawScope f;
    public Function0 g;

    public static void o(final CacheDrawScope cacheDrawScope, GraphicsLayer graphicsLayer, final Function1 function1) {
        final LayoutDirection layoutDirection = cacheDrawScope.d.getLayoutDirection();
        long jH = cacheDrawScope.d.h();
        long jIntBitsToFloat = (((int) Float.intBitsToFloat((int) (jH >> 32))) << 32) | (((int) Float.intBitsToFloat((int) (jH & 4294967295L))) & 4294967295L);
        final LayoutNodeDrawScope layoutNodeDrawScope = cacheDrawScope.f;
        Intrinsics.e(layoutNodeDrawScope);
        CanvasDrawScope canvasDrawScope = layoutNodeDrawScope.d;
        final Density densityB = canvasDrawScope.e.b();
        final LayoutDirection layoutDirectionC = canvasDrawScope.e.c();
        layoutNodeDrawScope.n(jIntBitsToFloat, graphicsLayer, new Function1<DrawScope, Unit>() { // from class: androidx.compose.ui.draw.CacheDrawScope$record$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                DrawScope drawScope = (DrawScope) obj;
                LayoutDirection layoutDirection2 = layoutDirectionC;
                Density density = densityB;
                CanvasDrawScope$drawContext$1 e = drawScope.getE();
                e.f(cacheDrawScope);
                e.g(layoutDirection);
                try {
                    function1.invoke(layoutNodeDrawScope);
                    CanvasDrawScope$drawContext$1 e2 = drawScope.getE();
                    e2.f(density);
                    e2.g(layoutDirection2);
                    return Unit.f24250a;
                } catch (Throwable th) {
                    CanvasDrawScope$drawContext$1 e3 = drawScope.getE();
                    e3.f(density);
                    e3.g(layoutDirection2);
                    throw th;
                }
            }
        });
    }

    @Override // androidx.compose.ui.unit.FontScaling
    /* renamed from: Q1 */
    public final float getE() {
        return this.d.getDensity().getE();
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: getDensity */
    public final float getD() {
        return this.d.getDensity().getD();
    }

    public final DrawResult i(final Function1 function1) {
        return n(new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.ui.draw.CacheDrawScope$onDrawBehind$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                ContentDrawScope contentDrawScope = (ContentDrawScope) obj;
                function1.invoke(contentDrawScope);
                contentDrawScope.Q0();
                return Unit.f24250a;
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final DrawResult n(Function1 function1) {
        DrawResult drawResult = new DrawResult();
        drawResult.f1741a = (Lambda) function1;
        this.e = drawResult;
        return drawResult;
    }
}
