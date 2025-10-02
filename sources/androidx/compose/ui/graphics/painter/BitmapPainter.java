package androidx.compose.ui.graphics.painter;

import androidx.camera.core.impl.b;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/painter/BitmapPainter;", "Landroidx/compose/ui/graphics/painter/Painter;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class BitmapPainter extends Painter {
    public final ImageBitmap i;
    public final long j;
    public int k = 1;
    public final long l;
    public float m;
    public ColorFilter n;

    public BitmapPainter(ImageBitmap imageBitmap, long j) {
        int i;
        int i2;
        this.i = imageBitmap;
        this.j = j;
        if (((int) 0) < 0 || ((int) 0) < 0 || (i = (int) (j >> 32)) < 0 || (i2 = (int) (4294967295L & j)) < 0 || i > imageBitmap.getWidth() || i2 > imageBitmap.getHeight()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.l = j;
        this.m = 1.0f;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final boolean a(float f) {
        this.m = f;
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final boolean b(ColorFilter colorFilter) {
        this.n = colorFilter;
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BitmapPainter)) {
            return false;
        }
        BitmapPainter bitmapPainter = (BitmapPainter) obj;
        return Intrinsics.c(this.i, bitmapPainter.i) && IntOffset.b(0L, 0L) && IntSize.b(this.j, bitmapPainter.j) && this.k == bitmapPainter.k;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final long f() {
        return IntSizeKt.d(this.l);
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final void h(DrawScope drawScope) {
        DrawScope.X(drawScope, this.i, 0L, this.j, 0L, (Math.round(Float.intBitsToFloat((int) (drawScope.h() >> 32))) << 32) | (Math.round(Float.intBitsToFloat((int) (drawScope.h() & 4294967295L))) & 4294967295L), this.m, null, this.n, 0, this.k, 328);
    }

    public final int hashCode() {
        return Integer.hashCode(this.k) + b.b(b.b(this.i.hashCode() * 31, 31, 0L), 31, this.j);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BitmapPainter(image=");
        sb.append(this.i);
        sb.append(", srcOffset=");
        sb.append((Object) IntOffset.e(0L));
        sb.append(", srcSize=");
        sb.append((Object) IntSize.c(this.j));
        sb.append(", filterQuality=");
        int i = this.k;
        sb.append((Object) (i == 0 ? "None" : i == 1 ? "Low" : i == 2 ? "Medium" : i == 3 ? "High" : "Unknown"));
        sb.append(')');
        return sb.toString();
    }
}
