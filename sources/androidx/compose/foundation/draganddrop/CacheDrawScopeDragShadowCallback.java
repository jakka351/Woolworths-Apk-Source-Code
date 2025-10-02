package androidx.compose.foundation.draganddrop;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawResult;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.graphics.layer.GraphicsLayerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/draganddrop/CacheDrawScopeDragShadowCallback;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class CacheDrawScopeDragShadowCallback {

    /* renamed from: a, reason: collision with root package name */
    public GraphicsLayer f863a;

    public final DrawResult a(CacheDrawScope cacheDrawScope) {
        Function0 function0 = cacheDrawScope.g;
        Intrinsics.e(function0);
        GraphicsLayer graphicsLayerA = ((GraphicsContext) function0.invoke()).a();
        CacheDrawScope.o(cacheDrawScope, graphicsLayerA, CacheDrawScopeDragShadowCallback$cachePicture$1$1$1.h);
        this.f863a = graphicsLayerA;
        return cacheDrawScope.n(new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.foundation.draganddrop.CacheDrawScopeDragShadowCallback$cachePicture$1$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                GraphicsLayer graphicsLayer = this.h.f863a;
                Intrinsics.e(graphicsLayer);
                GraphicsLayerKt.a((ContentDrawScope) obj, graphicsLayer);
                return Unit.f24250a;
            }
        });
    }
}
