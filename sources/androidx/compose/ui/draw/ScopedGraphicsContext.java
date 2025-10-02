package androidx.compose.ui.draw;

import androidx.collection.MutableObjectList;
import androidx.collection.ObjectListKt;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.internal.InlineClassHelperKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/draw/ScopedGraphicsContext;", "Landroidx/compose/ui/graphics/GraphicsContext;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class ScopedGraphicsContext implements GraphicsContext {

    /* renamed from: a, reason: collision with root package name */
    public MutableObjectList f1742a;
    public GraphicsContext b;

    @Override // androidx.compose.ui.graphics.GraphicsContext
    public final GraphicsLayer a() {
        GraphicsContext graphicsContext = this.b;
        if (graphicsContext == null) {
            InlineClassHelperKt.b("GraphicsContext not provided");
        }
        GraphicsLayer graphicsLayerA = graphicsContext.a();
        MutableObjectList mutableObjectList = this.f1742a;
        if (mutableObjectList != null) {
            mutableObjectList.g(graphicsLayerA);
            return graphicsLayerA;
        }
        Object[] objArr = ObjectListKt.f695a;
        MutableObjectList mutableObjectList2 = new MutableObjectList(1);
        mutableObjectList2.g(graphicsLayerA);
        this.f1742a = mutableObjectList2;
        return graphicsLayerA;
    }

    @Override // androidx.compose.ui.graphics.GraphicsContext
    public final void b(GraphicsLayer graphicsLayer) {
        GraphicsContext graphicsContext = this.b;
        if (graphicsContext != null) {
            graphicsContext.b(graphicsLayer);
        }
    }

    /* renamed from: c, reason: from getter */
    public final GraphicsContext getB() {
        return this.b;
    }

    public final void d() {
        MutableObjectList mutableObjectList = this.f1742a;
        if (mutableObjectList != null) {
            Object[] objArr = mutableObjectList.f694a;
            int i = mutableObjectList.b;
            for (int i2 = 0; i2 < i; i2++) {
                b((GraphicsLayer) objArr[i2]);
            }
            mutableObjectList.j();
        }
    }

    public final void e(GraphicsContext graphicsContext) {
        d();
        this.b = graphicsContext;
    }
}
