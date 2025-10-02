package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.AndroidCanvas;
import androidx.compose.ui.graphics.AndroidImageBitmap;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/vector/DrawCache;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class DrawCache {

    /* renamed from: a, reason: collision with root package name */
    public AndroidImageBitmap f1811a;
    public AndroidCanvas b;
    public DrawScope c;
    public long d;
    public int e;
    public final CanvasDrawScope f;

    public DrawCache() {
        LayoutDirection layoutDirection = LayoutDirection.d;
        this.d = 0L;
        this.e = 0;
        this.f = new CanvasDrawScope();
    }
}
