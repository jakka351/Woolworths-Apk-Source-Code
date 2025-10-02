package me.oriient.ui.contentview.content;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.annotation.Keep;
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
import me.oriient.ui.contentview.models.PixelRect;
import me.oriient.ui.contentview.utils.ExtensionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\\\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\u0019\b\u0002\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0002\b\u000f¢\u0006\u0002\u0010\u0010Bb\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\u0019\b\u0002\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0002\b\u000f¢\u0006\u0002\u0010\u0013J\"\u0010 \u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\u0018\u0010'\u001a\u00020\u001b2\u0006\u0010(\u001a\u00020\u00032\u0006\u0010#\u001a\u00020$H\u0016J\"\u0010)\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020\u00052\u0006\u0010+\u001a\u00020\u0005H\u0016ø\u0001\u0000¢\u0006\u0004\b,\u0010-J\b\u0010.\u001a\u00020/H\u0016R\u0014\u0010\n\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u0017X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0004\u001a\u00020\u0005X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u001eR\u000e\u0010\u001f\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00060"}, d2 = {"Lme/oriient/ui/contentview/content/CircleContent;", "Lme/oriient/ui/contentview/models/Content;", "center", "Lme/oriient/ui/contentview/models/PixelCoordinate;", "radius", "Lme/oriient/ui/contentview/models/Pixel;", "color", "Lme/oriient/ui/contentview/models/ContentColor;", "strokeWidth", "strokeColor", "anchorPoint", "configBlock", "Lkotlin/Function1;", "Lme/oriient/ui/contentview/DrawingOptionsImpl;", "", "Lkotlin/ExtensionFunctionType;", "(Lme/oriient/ui/contentview/models/PixelCoordinate;FLme/oriient/ui/contentview/models/ContentColor;Lme/oriient/ui/contentview/models/Pixel;Lme/oriient/ui/contentview/models/ContentColor;Lme/oriient/ui/contentview/models/PixelCoordinate;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "customContentId", "Lme/oriient/ui/contentview/models/ContentId;", "(Lme/oriient/ui/contentview/models/ContentId;Lme/oriient/ui/contentview/models/PixelCoordinate;FLme/oriient/ui/contentview/models/ContentColor;Lme/oriient/ui/contentview/models/Pixel;Lme/oriient/ui/contentview/models/ContentColor;Lme/oriient/ui/contentview/models/PixelCoordinate;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAnchorPoint", "()Lme/oriient/ui/contentview/models/PixelCoordinate;", "bounds", "Lme/oriient/ui/contentview/models/PixelRect;", "getBounds", "()Lme/oriient/ui/contentview/models/PixelRect;", "drawStroke", "", "paint", "Landroid/graphics/Paint;", "F", "strokePaint", "draw", "canvas", "Landroid/graphics/Canvas;", "transformMatrix", "Lme/oriient/ui/contentview/models/PixelMatrix;", "image", "Landroid/graphics/Bitmap;", "isClickedOn", "coordinate", "move", "dx", "dy", "move-oaYw5vM", "(FF)V", "toString", "", "ui-content-view_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public class CircleContent extends Content {

    @NotNull
    private final PixelCoordinate anchorPoint;

    @NotNull
    private final PixelRect bounds;

    @NotNull
    private final PixelCoordinate center;
    private final boolean drawStroke;

    @NotNull
    private final Paint paint;
    private final float radius;

    @NotNull
    private final Paint strokePaint;

    public static final class a extends Lambda implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f26597a = new a();

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
        public static final b f26598a = new b();

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

    public /* synthetic */ CircleContent(ContentId contentId, PixelCoordinate pixelCoordinate, float f, ContentColor contentColor, Pixel pixel, ContentColor contentColor2, PixelCoordinate pixelCoordinate2, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(contentId, pixelCoordinate, f, contentColor, pixel, contentColor2, pixelCoordinate2, (Function1<? super DrawingOptionsImpl, Unit>) function1);
    }

    @Override // me.oriient.ui.contentview.models.Content
    public void draw(@NotNull Canvas canvas, @NotNull PixelMatrix transformMatrix, @Nullable Bitmap image) {
        Intrinsics.h(canvas, "canvas");
        Intrinsics.h(transformMatrix, "transformMatrix");
        canvas.drawCircle(this.center.getX(), this.center.getY(), this.radius, this.paint);
        if (this.drawStroke) {
            canvas.drawCircle(this.center.getX(), this.center.getY(), this.radius, this.strokePaint);
        }
    }

    @Override // me.oriient.ui.contentview.models.Content
    @NotNull
    public PixelCoordinate getAnchorPoint() {
        return this.anchorPoint;
    }

    @Override // me.oriient.ui.contentview.models.Content
    @NotNull
    public PixelRect getBounds() {
        return this.bounds;
    }

    @Override // me.oriient.ui.contentview.models.Content
    public boolean isClickedOn(@NotNull PixelCoordinate coordinate, @NotNull PixelMatrix transformMatrix) {
        Intrinsics.h(coordinate, "coordinate");
        Intrinsics.h(transformMatrix, "transformMatrix");
        return ((float) Math.hypot((double) (this.center.getX() - coordinate.getX()), (double) (this.center.getY() - coordinate.getY()))) <= this.radius;
    }

    @Override // me.oriient.ui.contentview.models.Content
    /* renamed from: move-oaYw5vM */
    public void mo511moveoaYw5vM(float dx, float dy) {
        this.center.m554offsetoaYw5vM(dx, dy);
        getAnchorPoint().m554offsetoaYw5vM(dx, dy);
        getBounds().m584moveoaYw5vM(dx, dy);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("CircleContent(center=");
        sb.append(this.center);
        sb.append(", radius=");
        sb.append((Object) Pixel.m548toStringimpl(this.radius));
        sb.append(", anchorPoint=");
        sb.append(getAnchorPoint());
        sb.append(", drawStroke=");
        return androidx.camera.core.impl.b.s(sb, this.drawStroke, ')');
    }

    public /* synthetic */ CircleContent(PixelCoordinate pixelCoordinate, float f, ContentColor contentColor, Pixel pixel, ContentColor contentColor2, PixelCoordinate pixelCoordinate2, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(pixelCoordinate, f, contentColor, pixel, contentColor2, pixelCoordinate2, function1);
    }

    public /* synthetic */ CircleContent(ContentId contentId, PixelCoordinate pixelCoordinate, float f, ContentColor contentColor, Pixel pixel, ContentColor contentColor2, PixelCoordinate pixelCoordinate2, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(contentId, pixelCoordinate, f, contentColor, (i & 16) != 0 ? null : pixel, (i & 32) != 0 ? null : contentColor2, (i & 64) != 0 ? pixelCoordinate : pixelCoordinate2, (i & 128) != 0 ? a.f26597a : function1, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private CircleContent(ContentId customContentId, PixelCoordinate center, float f, ContentColor color, Pixel pixel, ContentColor contentColor, PixelCoordinate anchorPoint, Function1<? super DrawingOptionsImpl, Unit> configBlock) {
        super(customContentId, (String) null, configBlock);
        Intrinsics.h(customContentId, "customContentId");
        Intrinsics.h(center, "center");
        Intrinsics.h(color, "color");
        Intrinsics.h(anchorPoint, "anchorPoint");
        Intrinsics.h(configBlock, "configBlock");
        this.center = center;
        this.radius = f;
        this.anchorPoint = anchorPoint;
        Paint paint = new Paint();
        this.paint = paint;
        Paint paint2 = new Paint();
        this.strokePaint = paint2;
        this.bounds = new PixelRect(Pixel.m542minuse6v528(center.getX(), f), Pixel.m542minuse6v528(center.getY(), f), Pixel.m543pluse6v528(center.getX(), f), Pixel.m543pluse6v528(center.getY(), f), null);
        ExtensionsKt.setContentColor(paint, color);
        paint.setAntiAlias(true);
        boolean z = (pixel == null || contentColor == null) ? false : true;
        this.drawStroke = z;
        if (z) {
            paint2.setStyle(Paint.Style.STROKE);
            ExtensionsKt.setContentColor(paint2, contentColor);
            Intrinsics.e(pixel);
            paint2.setStrokeWidth(pixel.m551unboximpl());
        }
    }

    public /* synthetic */ CircleContent(PixelCoordinate pixelCoordinate, float f, ContentColor contentColor, Pixel pixel, ContentColor contentColor2, PixelCoordinate pixelCoordinate2, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(pixelCoordinate, f, contentColor, (i & 8) != 0 ? null : pixel, (i & 16) != 0 ? null : contentColor2, (i & 32) != 0 ? pixelCoordinate : pixelCoordinate2, (i & 64) != 0 ? b.f26598a : function1, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    private CircleContent(PixelCoordinate center, float f, ContentColor color, Pixel pixel, ContentColor contentColor, PixelCoordinate anchorPoint, Function1<? super DrawingOptionsImpl, Unit> configBlock) {
        this(ContentId.INSTANCE.getRandom(), center, f, color, pixel, contentColor, anchorPoint, configBlock, (DefaultConstructorMarker) null);
        Intrinsics.h(center, "center");
        Intrinsics.h(color, "color");
        Intrinsics.h(anchorPoint, "anchorPoint");
        Intrinsics.h(configBlock, "configBlock");
    }
}
