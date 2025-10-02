package androidx.compose.ui.text.android;

import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.DrawFilter;
import android.graphics.Matrix;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.RenderNode;
import android.graphics.fonts.Font;
import android.graphics.text.MeasuredText;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/android/TextAndroidCanvas;", "Landroid/graphics/Canvas;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextAndroidCanvas extends Canvas {

    /* renamed from: a, reason: collision with root package name */
    public Canvas f2077a;

    @Override // android.graphics.Canvas
    public final boolean clipOutPath(Path path) {
        Canvas canvas = this.f2077a;
        if (canvas != null) {
            return CanvasCompatO.a(canvas, path);
        }
        Intrinsics.p("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(RectF rectF) {
        Canvas canvas = this.f2077a;
        if (canvas != null) {
            return CanvasCompatO.e(canvas, rectF);
        }
        Intrinsics.p("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipPath(Path path, Region.Op op) {
        Canvas canvas = this.f2077a;
        if (canvas != null) {
            return canvas.clipPath(path, op);
        }
        Intrinsics.p("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(RectF rectF, Region.Op op) {
        Canvas canvas = this.f2077a;
        if (canvas != null) {
            return canvas.clipRect(rectF, op);
        }
        Intrinsics.p("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void concat(Matrix matrix) {
        Canvas canvas = this.f2077a;
        if (canvas != null) {
            canvas.concat(matrix);
        } else {
            Intrinsics.p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void disableZ() {
        Canvas canvas = this.f2077a;
        if (canvas != null) {
            CanvasCompatQ.a(canvas);
        } else {
            Intrinsics.p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawARGB(int i, int i2, int i3, int i4) {
        Canvas canvas = this.f2077a;
        if (canvas != null) {
            canvas.drawARGB(i, i2, i3, i4);
        } else {
            Intrinsics.p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawArc(RectF rectF, float f, float f2, boolean z, Paint paint) {
        Canvas canvas = this.f2077a;
        if (canvas != null) {
            canvas.drawArc(rectF, f, f2, z, paint);
        } else {
            Intrinsics.p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, float f, float f2, Paint paint) {
        Canvas canvas = this.f2077a;
        if (canvas != null) {
            canvas.drawBitmap(bitmap, f, f2, paint);
        } else {
            Intrinsics.p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawBitmapMesh(Bitmap bitmap, int i, int i2, float[] fArr, int i3, int[] iArr, int i4, Paint paint) {
        Canvas canvas = this.f2077a;
        if (canvas != null) {
            canvas.drawBitmapMesh(bitmap, i, i2, fArr, i3, iArr, i4, paint);
        } else {
            Intrinsics.p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawCircle(float f, float f2, float f3, Paint paint) {
        Canvas canvas = this.f2077a;
        if (canvas != null) {
            canvas.drawCircle(f, f2, f3, paint);
        } else {
            Intrinsics.p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i) {
        Canvas canvas = this.f2077a;
        if (canvas != null) {
            canvas.drawColor(i);
        } else {
            Intrinsics.p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawDoubleRoundRect(RectF rectF, float f, float f2, RectF rectF2, float f3, float f4, Paint paint) {
        Canvas canvas = this.f2077a;
        if (canvas != null) {
            CanvasCompatQ.e(canvas, rectF, f, f2, rectF2, f3, f4, paint);
        } else {
            Intrinsics.p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawGlyphs(int[] iArr, int i, float[] fArr, int i2, int i3, Font font, Paint paint) {
        Canvas canvas = this.f2077a;
        if (canvas != null) {
            CanvasCompatS.a(canvas, iArr, i, fArr, i2, i3, font, paint);
        } else {
            Intrinsics.p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawLine(float f, float f2, float f3, float f4, Paint paint) {
        Canvas canvas = this.f2077a;
        if (canvas != null) {
            canvas.drawLine(f, f2, f3, f4, paint);
        } else {
            Intrinsics.p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawLines(float[] fArr, int i, int i2, Paint paint) {
        Canvas canvas = this.f2077a;
        if (canvas != null) {
            canvas.drawLines(fArr, i, i2, paint);
        } else {
            Intrinsics.p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawOval(RectF rectF, Paint paint) {
        Canvas canvas = this.f2077a;
        if (canvas != null) {
            canvas.drawOval(rectF, paint);
        } else {
            Intrinsics.p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPaint(Paint paint) {
        Canvas canvas = this.f2077a;
        if (canvas != null) {
            canvas.drawPaint(paint);
        } else {
            Intrinsics.p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPatch(NinePatch ninePatch, Rect rect, Paint paint) {
        Canvas canvas = this.f2077a;
        if (canvas != null) {
            CanvasCompatS.b(canvas, ninePatch, rect, paint);
        } else {
            Intrinsics.p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPath(Path path, Paint paint) {
        Canvas canvas = this.f2077a;
        if (canvas != null) {
            canvas.drawPath(path, paint);
        } else {
            Intrinsics.p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture) {
        Canvas canvas = this.f2077a;
        if (canvas != null) {
            canvas.drawPicture(picture);
        } else {
            Intrinsics.p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPoint(float f, float f2, Paint paint) {
        Canvas canvas = this.f2077a;
        if (canvas != null) {
            canvas.drawPoint(f, f2, paint);
        } else {
            Intrinsics.p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPoints(float[] fArr, int i, int i2, Paint paint) {
        Canvas canvas = this.f2077a;
        if (canvas != null) {
            canvas.drawPoints(fArr, i, i2, paint);
        } else {
            Intrinsics.p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPosText(char[] cArr, int i, int i2, float[] fArr, Paint paint) {
        Canvas canvas = this.f2077a;
        if (canvas != null) {
            canvas.drawPosText(cArr, i, i2, fArr, paint);
        } else {
            Intrinsics.p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRGB(int i, int i2, int i3) {
        Canvas canvas = this.f2077a;
        if (canvas != null) {
            canvas.drawRGB(i, i2, i3);
        } else {
            Intrinsics.p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRect(RectF rectF, Paint paint) {
        Canvas canvas = this.f2077a;
        if (canvas != null) {
            canvas.drawRect(rectF, paint);
        } else {
            Intrinsics.p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRenderNode(RenderNode renderNode) {
        Canvas canvas = this.f2077a;
        if (canvas != null) {
            CanvasCompatQ.g(canvas, renderNode);
        } else {
            Intrinsics.p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRoundRect(RectF rectF, float f, float f2, Paint paint) {
        Canvas canvas = this.f2077a;
        if (canvas != null) {
            canvas.drawRoundRect(rectF, f, f2, paint);
        } else {
            Intrinsics.p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawText(char[] cArr, int i, int i2, float f, float f2, Paint paint) {
        Canvas canvas = this.f2077a;
        if (canvas != null) {
            canvas.drawText(cArr, i, i2, f, f2, paint);
        } else {
            Intrinsics.p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawTextOnPath(char[] cArr, int i, int i2, Path path, float f, float f2, Paint paint) {
        Canvas canvas = this.f2077a;
        if (canvas != null) {
            canvas.drawTextOnPath(cArr, i, i2, path, f, f2, paint);
        } else {
            Intrinsics.p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(char[] cArr, int i, int i2, int i3, int i4, float f, float f2, boolean z, Paint paint) {
        Canvas canvas = this.f2077a;
        if (canvas != null) {
            canvas.drawTextRun(cArr, i, i2, i3, i4, f, f2, z, paint);
        } else {
            Intrinsics.p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawVertices(Canvas.VertexMode vertexMode, int i, float[] fArr, int i2, float[] fArr2, int i3, int[] iArr, int i4, short[] sArr, int i5, int i6, Paint paint) {
        Canvas canvas = this.f2077a;
        if (canvas != null) {
            canvas.drawVertices(vertexMode, i, fArr, i2, fArr2, i3, iArr, i4, sArr, i5, i6, paint);
        } else {
            Intrinsics.p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void enableZ() {
        Canvas canvas = this.f2077a;
        if (canvas != null) {
            CanvasCompatQ.i(canvas);
        } else {
            Intrinsics.p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean getClipBounds(Rect rect) {
        Canvas canvas = this.f2077a;
        if (canvas == null) {
            Intrinsics.p("nativeCanvas");
            throw null;
        }
        boolean clipBounds = canvas.getClipBounds(rect);
        if (clipBounds) {
            rect.set(0, 0, rect.width(), Integer.MAX_VALUE);
        }
        return clipBounds;
    }

    @Override // android.graphics.Canvas
    public final int getDensity() {
        Canvas canvas = this.f2077a;
        if (canvas != null) {
            return canvas.getDensity();
        }
        Intrinsics.p("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final DrawFilter getDrawFilter() {
        Canvas canvas = this.f2077a;
        if (canvas != null) {
            return canvas.getDrawFilter();
        }
        Intrinsics.p("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int getHeight() {
        Canvas canvas = this.f2077a;
        if (canvas != null) {
            return canvas.getHeight();
        }
        Intrinsics.p("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void getMatrix(Matrix matrix) {
        Canvas canvas = this.f2077a;
        if (canvas != null) {
            canvas.getMatrix(matrix);
        } else {
            Intrinsics.p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final int getMaximumBitmapHeight() {
        Canvas canvas = this.f2077a;
        if (canvas != null) {
            return canvas.getMaximumBitmapHeight();
        }
        Intrinsics.p("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int getMaximumBitmapWidth() {
        Canvas canvas = this.f2077a;
        if (canvas != null) {
            return canvas.getMaximumBitmapWidth();
        }
        Intrinsics.p("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int getSaveCount() {
        Canvas canvas = this.f2077a;
        if (canvas != null) {
            return canvas.getSaveCount();
        }
        Intrinsics.p("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int getWidth() {
        Canvas canvas = this.f2077a;
        if (canvas != null) {
            return canvas.getWidth();
        }
        Intrinsics.p("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean isOpaque() {
        Canvas canvas = this.f2077a;
        if (canvas != null) {
            return canvas.isOpaque();
        }
        Intrinsics.p("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(RectF rectF, Canvas.EdgeType edgeType) {
        Canvas canvas = this.f2077a;
        if (canvas != null) {
            return canvas.quickReject(rectF, edgeType);
        }
        Intrinsics.p("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void restore() {
        Canvas canvas = this.f2077a;
        if (canvas != null) {
            canvas.restore();
        } else {
            Intrinsics.p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void restoreToCount(int i) {
        Canvas canvas = this.f2077a;
        if (canvas != null) {
            canvas.restoreToCount(i);
        } else {
            Intrinsics.p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void rotate(float f) {
        Canvas canvas = this.f2077a;
        if (canvas != null) {
            canvas.rotate(f);
        } else {
            Intrinsics.p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final int save() {
        Canvas canvas = this.f2077a;
        if (canvas != null) {
            return canvas.save();
        }
        Intrinsics.p("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(RectF rectF, Paint paint, int i) {
        Canvas canvas = this.f2077a;
        if (canvas != null) {
            return canvas.saveLayer(rectF, paint, i);
        }
        Intrinsics.p("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(RectF rectF, int i, int i2) {
        Canvas canvas = this.f2077a;
        if (canvas != null) {
            return canvas.saveLayerAlpha(rectF, i, i2);
        }
        Intrinsics.p("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void scale(float f, float f2) {
        Canvas canvas = this.f2077a;
        if (canvas != null) {
            canvas.scale(f, f2);
        } else {
            Intrinsics.p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void setBitmap(Bitmap bitmap) {
        Canvas canvas = this.f2077a;
        if (canvas != null) {
            canvas.setBitmap(bitmap);
        } else {
            Intrinsics.p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void setDensity(int i) {
        Canvas canvas = this.f2077a;
        if (canvas != null) {
            canvas.setDensity(i);
        } else {
            Intrinsics.p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void setDrawFilter(DrawFilter drawFilter) {
        Canvas canvas = this.f2077a;
        if (canvas != null) {
            canvas.setDrawFilter(drawFilter);
        } else {
            Intrinsics.p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void setMatrix(Matrix matrix) {
        Canvas canvas = this.f2077a;
        if (canvas != null) {
            canvas.setMatrix(matrix);
        } else {
            Intrinsics.p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void skew(float f, float f2) {
        Canvas canvas = this.f2077a;
        if (canvas != null) {
            canvas.skew(f, f2);
        } else {
            Intrinsics.p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void translate(float f, float f2) {
        Canvas canvas = this.f2077a;
        if (canvas != null) {
            canvas.translate(f, f2);
        } else {
            Intrinsics.p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(Rect rect) {
        Canvas canvas = this.f2077a;
        if (canvas != null) {
            return CanvasCompatO.d(canvas, rect);
        }
        Intrinsics.p("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipPath(Path path) {
        Canvas canvas = this.f2077a;
        if (canvas != null) {
            return canvas.clipPath(path);
        }
        Intrinsics.p("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(Rect rect, Region.Op op) {
        Canvas canvas = this.f2077a;
        if (canvas != null) {
            return canvas.clipRect(rect, op);
        }
        Intrinsics.p("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawArc(float f, float f2, float f3, float f4, float f5, float f6, boolean z, Paint paint) {
        Canvas canvas = this.f2077a;
        if (canvas != null) {
            canvas.drawArc(f, f2, f3, f4, f5, f6, z, paint);
        } else {
            Intrinsics.p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Rect rect, RectF rectF, Paint paint) {
        Canvas canvas = this.f2077a;
        if (canvas != null) {
            canvas.drawBitmap(bitmap, rect, rectF, paint);
        } else {
            Intrinsics.p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawColor(long j) {
        Canvas canvas = this.f2077a;
        if (canvas != null) {
            CanvasCompatQ.c(canvas, j);
        } else {
            Intrinsics.p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawLines(float[] fArr, Paint paint) {
        Canvas canvas = this.f2077a;
        if (canvas != null) {
            canvas.drawLines(fArr, paint);
        } else {
            Intrinsics.p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawOval(float f, float f2, float f3, float f4, Paint paint) {
        Canvas canvas = this.f2077a;
        if (canvas != null) {
            canvas.drawOval(f, f2, f3, f4, paint);
        } else {
            Intrinsics.p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPatch(NinePatch ninePatch, RectF rectF, Paint paint) {
        Canvas canvas = this.f2077a;
        if (canvas != null) {
            CanvasCompatS.c(canvas, ninePatch, rectF, paint);
        } else {
            Intrinsics.p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture, RectF rectF) {
        Canvas canvas = this.f2077a;
        if (canvas != null) {
            canvas.drawPicture(picture, rectF);
        } else {
            Intrinsics.p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPoints(float[] fArr, Paint paint) {
        Canvas canvas = this.f2077a;
        if (canvas != null) {
            canvas.drawPoints(fArr, paint);
        } else {
            Intrinsics.p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPosText(String str, float[] fArr, Paint paint) {
        Canvas canvas = this.f2077a;
        if (canvas != null) {
            canvas.drawPosText(str, fArr, paint);
        } else {
            Intrinsics.p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRect(Rect rect, Paint paint) {
        Canvas canvas = this.f2077a;
        if (canvas != null) {
            canvas.drawRect(rect, paint);
        } else {
            Intrinsics.p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRoundRect(float f, float f2, float f3, float f4, float f5, float f6, Paint paint) {
        Canvas canvas = this.f2077a;
        if (canvas != null) {
            canvas.drawRoundRect(f, f2, f3, f4, f5, f6, paint);
        } else {
            Intrinsics.p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawText(String str, float f, float f2, Paint paint) {
        Canvas canvas = this.f2077a;
        if (canvas != null) {
            canvas.drawText(str, f, f2, paint);
        } else {
            Intrinsics.p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawTextOnPath(String str, Path path, float f, float f2, Paint paint) {
        Canvas canvas = this.f2077a;
        if (canvas != null) {
            canvas.drawTextOnPath(str, path, f, f2, paint);
        } else {
            Intrinsics.p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(RectF rectF) {
        Canvas canvas = this.f2077a;
        if (canvas != null) {
            return CanvasCompatR.c(canvas, rectF);
        }
        Intrinsics.p("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(RectF rectF, Paint paint) {
        Canvas canvas = this.f2077a;
        if (canvas != null) {
            return canvas.saveLayer(rectF, paint);
        }
        Intrinsics.p("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(RectF rectF, int i) {
        Canvas canvas = this.f2077a;
        if (canvas != null) {
            return canvas.saveLayerAlpha(rectF, i);
        }
        Intrinsics.p("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(float f, float f2, float f3, float f4) {
        Canvas canvas = this.f2077a;
        if (canvas != null) {
            return CanvasCompatO.b(canvas, f, f2, f3, f4);
        }
        Intrinsics.p("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(RectF rectF) {
        Canvas canvas = this.f2077a;
        if (canvas != null) {
            return canvas.clipRect(rectF);
        }
        Intrinsics.p("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Rect rect, Rect rect2, Paint paint) {
        Canvas canvas = this.f2077a;
        if (canvas != null) {
            canvas.drawBitmap(bitmap, rect, rect2, paint);
        } else {
            Intrinsics.p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i, PorterDuff.Mode mode) {
        Canvas canvas = this.f2077a;
        if (canvas != null) {
            canvas.drawColor(i, mode);
        } else {
            Intrinsics.p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture, Rect rect) {
        Canvas canvas = this.f2077a;
        if (canvas != null) {
            canvas.drawPicture(picture, rect);
        } else {
            Intrinsics.p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRect(float f, float f2, float f3, float f4, Paint paint) {
        Canvas canvas = this.f2077a;
        if (canvas != null) {
            canvas.drawRect(f, f2, f3, f4, paint);
        } else {
            Intrinsics.p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawText(String str, int i, int i2, float f, float f2, Paint paint) {
        Canvas canvas = this.f2077a;
        if (canvas != null) {
            canvas.drawText(str, i, i2, f, f2, paint);
        } else {
            Intrinsics.p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(Path path, Canvas.EdgeType edgeType) {
        Canvas canvas = this.f2077a;
        if (canvas != null) {
            return canvas.quickReject(path, edgeType);
        }
        Intrinsics.p("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(float f, float f2, float f3, float f4, Paint paint, int i) {
        Canvas canvas = this.f2077a;
        if (canvas != null) {
            return canvas.saveLayer(f, f2, f3, f4, paint, i);
        }
        Intrinsics.p("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(float f, float f2, float f3, float f4, int i, int i2) {
        Canvas canvas = this.f2077a;
        if (canvas != null) {
            return canvas.saveLayerAlpha(f, f2, f3, f4, i, i2);
        }
        Intrinsics.p("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(int i, int i2, int i3, int i4) {
        Canvas canvas = this.f2077a;
        if (canvas != null) {
            return CanvasCompatO.c(canvas, i, i2, i3, i4);
        }
        Intrinsics.p("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(Rect rect) {
        Canvas canvas = this.f2077a;
        if (canvas != null) {
            return canvas.clipRect(rect);
        }
        Intrinsics.p("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(int[] iArr, int i, int i2, float f, float f2, int i3, int i4, boolean z, Paint paint) {
        Canvas canvas = this.f2077a;
        if (canvas != null) {
            canvas.drawBitmap(iArr, i, i2, f, f2, i3, i4, z, paint);
        } else {
            Intrinsics.p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i, BlendMode blendMode) {
        Canvas canvas = this.f2077a;
        if (canvas != null) {
            CanvasCompatQ.b(canvas, i, blendMode);
        } else {
            Intrinsics.p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawDoubleRoundRect(RectF rectF, float[] fArr, RectF rectF2, float[] fArr2, Paint paint) {
        Canvas canvas = this.f2077a;
        if (canvas != null) {
            CanvasCompatQ.f(canvas, rectF, fArr, rectF2, fArr2, paint);
        } else {
            Intrinsics.p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawText(CharSequence charSequence, int i, int i2, float f, float f2, Paint paint) {
        Canvas canvas = this.f2077a;
        if (canvas != null) {
            canvas.drawText(charSequence, i, i2, f, f2, paint);
        } else {
            Intrinsics.p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(CharSequence charSequence, int i, int i2, int i3, int i4, float f, float f2, boolean z, Paint paint) {
        Canvas canvas = this.f2077a;
        if (canvas != null) {
            canvas.drawTextRun(charSequence, i, i2, i3, i4, f, f2, z, paint);
        } else {
            Intrinsics.p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(Path path) {
        Canvas canvas = this.f2077a;
        if (canvas != null) {
            return CanvasCompatR.b(canvas, path);
        }
        Intrinsics.p("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(float f, float f2, float f3, float f4, Paint paint) {
        Canvas canvas = this.f2077a;
        if (canvas != null) {
            return canvas.saveLayer(f, f2, f3, f4, paint);
        }
        Intrinsics.p("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(float f, float f2, float f3, float f4, int i) {
        Canvas canvas = this.f2077a;
        if (canvas != null) {
            return canvas.saveLayerAlpha(f, f2, f3, f4, i);
        }
        Intrinsics.p("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(float f, float f2, float f3, float f4, Region.Op op) {
        Canvas canvas = this.f2077a;
        if (canvas != null) {
            return canvas.clipRect(f, f2, f3, f4, op);
        }
        Intrinsics.p("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(int[] iArr, int i, int i2, int i3, int i4, int i5, int i6, boolean z, Paint paint) {
        Canvas canvas = this.f2077a;
        if (canvas != null) {
            canvas.drawBitmap(iArr, i, i2, i3, i4, i5, i6, z, paint);
        } else {
            Intrinsics.p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawColor(long j, BlendMode blendMode) {
        Canvas canvas = this.f2077a;
        if (canvas != null) {
            CanvasCompatQ.d(canvas, j, blendMode);
        } else {
            Intrinsics.p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(float f, float f2, float f3, float f4, Canvas.EdgeType edgeType) {
        Canvas canvas = this.f2077a;
        if (canvas != null) {
            return canvas.quickReject(f, f2, f3, f4, edgeType);
        }
        Intrinsics.p("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(float f, float f2, float f3, float f4) {
        Canvas canvas = this.f2077a;
        if (canvas != null) {
            return canvas.clipRect(f, f2, f3, f4);
        }
        Intrinsics.p("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Matrix matrix, Paint paint) {
        Canvas canvas = this.f2077a;
        if (canvas != null) {
            canvas.drawBitmap(bitmap, matrix, paint);
        } else {
            Intrinsics.p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(float f, float f2, float f3, float f4) {
        Canvas canvas = this.f2077a;
        if (canvas != null) {
            return CanvasCompatR.a(canvas, f, f2, f3, f4);
        }
        Intrinsics.p("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(int i, int i2, int i3, int i4) {
        Canvas canvas = this.f2077a;
        if (canvas != null) {
            return canvas.clipRect(i, i2, i3, i4);
        }
        Intrinsics.p("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(MeasuredText measuredText, int i, int i2, int i3, int i4, float f, float f2, boolean z, Paint paint) {
        Canvas canvas = this.f2077a;
        if (canvas != null) {
            CanvasCompatQ.h(canvas, measuredText, i, i2, i3, i4, f, f2, z, paint);
        } else {
            Intrinsics.p("nativeCanvas");
            throw null;
        }
    }
}
