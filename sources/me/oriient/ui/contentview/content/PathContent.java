package me.oriient.ui.contentview.content;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import androidx.annotation.Keep;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import me.oriient.ui.contentview.DrawingOptionsImpl;
import me.oriient.ui.contentview.models.Content;
import me.oriient.ui.contentview.models.ContentColor;
import me.oriient.ui.contentview.models.ContentId;
import me.oriient.ui.contentview.models.Pixel;
import me.oriient.ui.contentview.models.PixelCoordinate;
import me.oriient.ui.contentview.models.PixelMatrix;
import me.oriient.ui.contentview.utils.ExtensionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0017\u0018\u0000 ,2\u00020\u0001:\u0001-Bt\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\t\u0012\u0019\b\u0002\u0010\u0014\u001a\u0013\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010¢\u0006\u0002\b\u0013¢\u0006\u0004\b\u0015\u0010\u0016Bn\b\u0016\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\t\u0012\u0019\b\u0002\u0010\u0014\u001a\u0013\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010¢\u0006\u0002\b\u0013¢\u0006\u0004\b\u0015\u0010\u0017J)\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010#R\u001a\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\n\u0010$R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u000b\u0010%R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010)R\u0014\u0010+\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010&\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006."}, d2 = {"Lme/oriient/ui/contentview/content/PathContent;", "Lme/oriient/ui/contentview/models/Content;", "Lme/oriient/ui/contentview/models/ContentId;", "customContentId", "", "Lme/oriient/ui/contentview/models/PixelCoordinate;", "coordinates", "Lme/oriient/ui/contentview/models/ContentColor;", "color", "Lme/oriient/ui/contentview/models/Pixel;", "width", "strokeWidth", "strokeColor", "", "keepWidth", "cornerRadius", "Lkotlin/Function1;", "Lme/oriient/ui/contentview/DrawingOptionsImpl;", "", "Lkotlin/ExtensionFunctionType;", "configBlock", "<init>", "(Lme/oriient/ui/contentview/models/ContentId;Ljava/util/List;Lme/oriient/ui/contentview/models/ContentColor;FLme/oriient/ui/contentview/models/Pixel;Lme/oriient/ui/contentview/models/ContentColor;ZFLkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(Ljava/util/List;Lme/oriient/ui/contentview/models/ContentColor;FLme/oriient/ui/contentview/models/Pixel;Lme/oriient/ui/contentview/models/ContentColor;ZFLkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroid/graphics/Canvas;", "canvas", "Lme/oriient/ui/contentview/models/PixelMatrix;", "transformMatrix", "Landroid/graphics/Bitmap;", "image", "draw", "(Landroid/graphics/Canvas;Lme/oriient/ui/contentview/models/PixelMatrix;Landroid/graphics/Bitmap;)V", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "F", "Lme/oriient/ui/contentview/models/Pixel;", "Z", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/Paint;", "strokePaint", "drawStroke", "Companion", "c", "ui-content-view_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public class PathContent extends Content {

    @NotNull
    private static final c Companion = new c(null);
    private static final float DEFAULT_CORNER_RADIUS = ExtensionsKt.getPx(5);

    @NotNull
    private final List<PixelCoordinate> coordinates;
    private final boolean drawStroke;
    private final boolean keepWidth;

    @NotNull
    private final Paint paint;

    @NotNull
    private final Paint strokePaint;

    @Nullable
    private final Pixel strokeWidth;
    private final float width;

    public static final class a extends Lambda implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f26604a = new a();

        public a() {
            super(1);
        }

        public final void a(DrawingOptionsImpl drawingOptionsImpl) {
            Intrinsics.h(drawingOptionsImpl, "$this$null");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((DrawingOptionsImpl) obj);
            return Unit.f24250a;
        }
    }

    public static final class b extends Lambda implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f26605a = new b();

        public b() {
            super(1);
        }

        public final void a(DrawingOptionsImpl drawingOptionsImpl) {
            Intrinsics.h(drawingOptionsImpl, "$this$null");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((DrawingOptionsImpl) obj);
            return Unit.f24250a;
        }
    }

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    public /* synthetic */ PathContent(List list, ContentColor contentColor, float f, Pixel pixel, ContentColor contentColor2, boolean z, float f2, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, contentColor, f, pixel, contentColor2, z, f2, function1);
    }

    @Override // me.oriient.ui.contentview.models.Content
    public void draw(@NotNull Canvas canvas, @NotNull PixelMatrix transformMatrix, @Nullable Bitmap image) {
        Intrinsics.h(canvas, "canvas");
        Intrinsics.h(transformMatrix, "transformMatrix");
        if (this.coordinates.size() < 2) {
            return;
        }
        float fM538divRDCHks$ui_content_view_publishRelease = this.width;
        Pixel pixelM533boximpl = this.strokeWidth;
        if (this.keepWidth) {
            fM538divRDCHks$ui_content_view_publishRelease = Pixel.m538divRDCHks$ui_content_view_publishRelease(fM538divRDCHks$ui_content_view_publishRelease, transformMatrix.getScaleFactor$ui_content_view_publishRelease());
            if (this.drawStroke) {
                Pixel pixel = this.strokeWidth;
                Intrinsics.e(pixel);
                pixelM533boximpl = Pixel.m533boximpl(Pixel.m538divRDCHks$ui_content_view_publishRelease(pixel.m551unboximpl(), transformMatrix.getScaleFactor$ui_content_view_publishRelease()));
            }
        }
        this.paint.setStrokeWidth(fM538divRDCHks$ui_content_view_publishRelease);
        if (this.drawStroke) {
            Paint paint = this.strokePaint;
            Intrinsics.e(pixelM533boximpl);
            paint.setStrokeWidth((pixelM533boximpl.m551unboximpl() * 2) + fM538divRDCHks$ui_content_view_publishRelease);
        }
        Path path = new Path();
        PixelCoordinate pixelCoordinate = this.coordinates.get(0);
        path.moveTo(pixelCoordinate.getX(), pixelCoordinate.getY());
        int size = this.coordinates.size();
        for (int i = 1; i < size; i++) {
            PixelCoordinate pixelCoordinate2 = this.coordinates.get(i);
            path.lineTo(pixelCoordinate2.getX(), pixelCoordinate2.getY());
        }
        if (this.drawStroke) {
            canvas.drawPath(path, this.strokePaint);
        }
        canvas.drawPath(path, this.paint);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("PathContent(coordinates=");
        sb.append(this.coordinates);
        sb.append(", width=");
        sb.append((Object) Pixel.m548toStringimpl(this.width));
        sb.append(", strokeWidth=");
        sb.append(this.strokeWidth);
        sb.append(", keepWidth=");
        sb.append(this.keepWidth);
        sb.append(", drawStroke=");
        return androidx.camera.core.impl.b.s(sb, this.drawStroke, ')');
    }

    public /* synthetic */ PathContent(ContentId contentId, List list, ContentColor contentColor, float f, Pixel pixel, ContentColor contentColor2, boolean z, float f2, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(contentId, (List<PixelCoordinate>) list, contentColor, f, pixel, contentColor2, z, f2, (Function1<? super DrawingOptionsImpl, Unit>) function1);
    }

    public /* synthetic */ PathContent(ContentId contentId, List list, ContentColor contentColor, float f, Pixel pixel, ContentColor contentColor2, boolean z, float f2, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(contentId, list, contentColor, f, (i & 16) != 0 ? null : pixel, (i & 32) != 0 ? null : contentColor2, (i & 64) != 0 ? false : z, (i & 128) != 0 ? DEFAULT_CORNER_RADIUS : f2, (i & 256) != 0 ? a.f26604a : function1, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private PathContent(ContentId customContentId, List<PixelCoordinate> coordinates, ContentColor color, float f, Pixel pixel, ContentColor contentColor, boolean z, float f2, Function1<? super DrawingOptionsImpl, Unit> configBlock) {
        super(customContentId, (String) null, configBlock);
        Intrinsics.h(customContentId, "customContentId");
        Intrinsics.h(coordinates, "coordinates");
        Intrinsics.h(color, "color");
        Intrinsics.h(configBlock, "configBlock");
        this.coordinates = coordinates;
        this.width = f;
        this.strokeWidth = pixel;
        this.keepWidth = z;
        Paint paint = new Paint();
        this.paint = paint;
        Paint paint2 = new Paint();
        this.strokePaint = paint2;
        ExtensionsKt.setContentColor(paint, color);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setDither(true);
        Paint.Join join = Paint.Join.ROUND;
        paint.setStrokeJoin(join);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint.setPathEffect(new CornerPathEffect(f2));
        paint.setAntiAlias(true);
        paint.setStrokeWidth(f);
        boolean z2 = (pixel == null || contentColor == null) ? false : true;
        this.drawStroke = z2;
        if (z2) {
            ExtensionsKt.setContentColor(paint2, contentColor);
            paint2.setStyle(style);
            paint2.setDither(true);
            paint2.setStrokeJoin(join);
            paint2.setStrokeCap(cap);
            paint2.setPathEffect(new CornerPathEffect(f2));
            paint2.setAntiAlias(true);
            Intrinsics.e(pixel);
            paint2.setStrokeWidth((pixel.m551unboximpl() * 2) + f);
        }
    }

    public /* synthetic */ PathContent(List list, ContentColor contentColor, float f, Pixel pixel, ContentColor contentColor2, boolean z, float f2, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, contentColor, f, (i & 8) != 0 ? null : pixel, (i & 16) != 0 ? null : contentColor2, (i & 32) != 0 ? false : z, (i & 64) != 0 ? DEFAULT_CORNER_RADIUS : f2, (i & 128) != 0 ? b.f26605a : function1, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    private PathContent(List<PixelCoordinate> coordinates, ContentColor color, float f, Pixel pixel, ContentColor contentColor, boolean z, float f2, Function1<? super DrawingOptionsImpl, Unit> configBlock) {
        this(ContentId.INSTANCE.getRandom(), coordinates, color, f, pixel, contentColor, z, f2, configBlock, (DefaultConstructorMarker) null);
        Intrinsics.h(coordinates, "coordinates");
        Intrinsics.h(color, "color");
        Intrinsics.h(configBlock, "configBlock");
    }
}
