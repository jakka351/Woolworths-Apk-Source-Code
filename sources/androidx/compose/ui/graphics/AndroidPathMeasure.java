package androidx.compose.ui.graphics;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/AndroidPathMeasure;", "Landroidx/compose/ui/graphics/PathMeasure;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class AndroidPathMeasure implements PathMeasure {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.PathMeasure f1763a;

    public AndroidPathMeasure(android.graphics.PathMeasure pathMeasure) {
        this.f1763a = pathMeasure;
    }

    @Override // androidx.compose.ui.graphics.PathMeasure
    public final void a(AndroidPath androidPath) {
        this.f1763a.setPath(androidPath != null ? androidPath.f1761a : null, false);
    }

    @Override // androidx.compose.ui.graphics.PathMeasure
    public final boolean b(float f, float f2, Path path) {
        if (!(path instanceof AndroidPath)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        return this.f1763a.getSegment(f, f2, ((AndroidPath) path).f1761a, true);
    }

    @Override // androidx.compose.ui.graphics.PathMeasure
    public final float getLength() {
        return this.f1763a.getLength();
    }
}
