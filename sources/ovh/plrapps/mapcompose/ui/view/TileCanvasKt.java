package ovh.plrapps.mapcompose.ui.view;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Rect;
import androidx.camera.core.impl.b;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.SnapshotMutableDoubleStateImpl;
import androidx.compose.runtime.SnapshotMutableFloatStateImpl;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope$drawContext$1;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScopeKt$asDrawTransform$1;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import au.com.woolworths.android.onesite.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import ovh.plrapps.mapcompose.core.ColorFilterProvider;
import ovh.plrapps.mapcompose.core.Tile;
import ovh.plrapps.mapcompose.core.VisibleTilesResolver;
import ovh.plrapps.mapcompose.ui.state.ZoomPanRotateState;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"mapcompose_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class TileCanvasKt {
    public static final void a(final ZoomPanRotateState zoomPRState, final VisibleTilesResolver visibleTilesResolver, final int i, final float f, final ColorFilterProvider colorFilterProvider, final List tilesToRender, final Function0 isFilteringBitmap, Composer composer, final int i2) {
        Intrinsics.h(zoomPRState, "zoomPRState");
        Intrinsics.h(visibleTilesResolver, "visibleTilesResolver");
        Intrinsics.h(tilesToRender, "tilesToRender");
        Intrinsics.h(isFilteringBitmap, "isFilteringBitmap");
        ComposerImpl composerImplV = composer.v(-1341878649);
        composerImplV.o(-1810162931);
        Object objG = composerImplV.G();
        Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
        if (objG == composer$Companion$Empty$1) {
            objG = new Rect();
            composerImplV.A(objG);
        }
        final Rect rect = (Rect) objG;
        Object objD = a.d(-1810161492, composerImplV, false);
        Object obj = objD;
        if (objD == composer$Companion$Empty$1) {
            Paint paint = new Paint();
            paint.setAntiAlias(false);
            composerImplV.A(paint);
            obj = paint;
        }
        final Paint paint2 = (Paint) obj;
        composerImplV.V(false);
        CanvasKt.a(SizeKt.c, new Function1<DrawScope, Unit>() { // from class: ovh.plrapps.mapcompose.ui.view.TileCanvasKt$TileCanvas$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Bitmap bitmap;
                DrawScope Canvas = (DrawScope) obj2;
                Intrinsics.h(Canvas, "$this$Canvas");
                double d = 65536;
                int iCeil = (int) ((Math.ceil(((SnapshotMutableDoubleStateImpl) zoomPRState.n).f() / d) * d) / ((SnapshotMutableDoubleStateImpl) zoomPRState.l).f());
                int iCeil2 = (int) ((Math.ceil(((SnapshotMutableDoubleStateImpl) zoomPRState.o).f() / d) * d) / ((SnapshotMutableDoubleStateImpl) zoomPRState.l).f());
                ZoomPanRotateState zoomPanRotateState = zoomPRState;
                Paint paint3 = paint2;
                Function0 function0 = isFilteringBitmap;
                List<Tile> list = tilesToRender;
                VisibleTilesResolver visibleTilesResolver2 = visibleTilesResolver;
                int i3 = i;
                Rect rect2 = rect;
                ColorFilterProvider colorFilterProvider2 = colorFilterProvider;
                float f2 = f;
                CanvasDrawScope$drawContext$1 e = Canvas.getE();
                long jD = e.d();
                e.a().save();
                try {
                    CanvasDrawScopeKt$asDrawTransform$1 canvasDrawScopeKt$asDrawTransform$1 = e.f1798a;
                    canvasDrawScopeKt$asDrawTransform$1.d(OffsetKt.a((float) ((SnapshotMutableDoubleStateImpl) zoomPanRotateState.p).f(), (float) ((SnapshotMutableDoubleStateImpl) zoomPanRotateState.q).f()), ((SnapshotMutableFloatStateImpl) zoomPanRotateState.m).a());
                    canvasDrawScopeKt$asDrawTransform$1.f((float) ((iCeil * ((SnapshotMutableDoubleStateImpl) zoomPanRotateState.l).f()) + (-((SnapshotMutableDoubleStateImpl) zoomPanRotateState.n).f())), (float) ((iCeil2 * ((SnapshotMutableDoubleStateImpl) zoomPanRotateState.l).f()) + (-((SnapshotMutableDoubleStateImpl) zoomPanRotateState.o).f())));
                    float f3 = (float) ((SnapshotMutableDoubleStateImpl) zoomPanRotateState.l).f();
                    canvasDrawScopeKt$asDrawTransform$1.e(0L, f3, f3);
                    paint3.setFilterBitmap(((Boolean) function0.invoke()).booleanValue());
                    for (Tile tile : list) {
                        if (!tile.j && (bitmap = tile.g) != null) {
                            Double d2 = (Double) visibleTilesResolver2.e.get(Integer.valueOf(tile.f26935a));
                            if (d2 != null) {
                                int iDoubleValue = (int) (i3 / d2.doubleValue());
                                int i4 = tile.c * iDoubleValue;
                                int i5 = tile.b * iDoubleValue;
                                rect2.set(i4 - iCeil, i5 - iCeil2, (i4 + iDoubleValue) - iCeil, (iDoubleValue + i5) - iCeil2);
                                ColorFilter colorFilterC = colorFilterProvider2 != null ? colorFilterProvider2.c() : null;
                                paint3.setAlpha((int) (((SnapshotMutableFloatStateImpl) tile.h).a() * 255));
                                paint3.setColorFilter(colorFilterC != null ? colorFilterC.f1767a : null);
                                AndroidCanvas_androidKt.a(Canvas.getE().a()).drawBitmap(bitmap, (Rect) null, rect2, paint3);
                                float f4 = 1.0f;
                                if (((SnapshotMutableFloatStateImpl) tile.h).a() < 1.0f) {
                                    float fA = ((SnapshotMutableFloatStateImpl) tile.h).a() + f2;
                                    if (fA <= 1.0f) {
                                        f4 = fA;
                                    }
                                    ((SnapshotMutableFloatStateImpl) tile.h).p(f4);
                                } else {
                                    Tile tile2 = tile.i;
                                    if (tile2 != null) {
                                        tile2.j = true;
                                    }
                                    tile.i = null;
                                }
                            }
                        }
                    }
                    b.C(e, jD);
                    return Unit.f24250a;
                } catch (Throwable th) {
                    b.C(e, jD);
                    throw th;
                }
            }
        }, composerImplV, 0);
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>(visibleTilesResolver, i, f, colorFilterProvider, tilesToRender, isFilteringBitmap, i2) { // from class: ovh.plrapps.mapcompose.ui.view.TileCanvasKt$TileCanvas$2
                public final /* synthetic */ VisibleTilesResolver i;
                public final /* synthetic */ int j;
                public final /* synthetic */ float k;
                public final /* synthetic */ ColorFilterProvider l;
                public final /* synthetic */ List m;
                public final /* synthetic */ Function0 n;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Number) obj3).intValue();
                    int iA = RecomposeScopeImplKt.a(2097735);
                    TileCanvasKt.a(this.h, this.i, this.j, this.k, this.l, this.m, this.n, (Composer) obj2, iA);
                    return Unit.f24250a;
                }
            };
        }
    }
}
