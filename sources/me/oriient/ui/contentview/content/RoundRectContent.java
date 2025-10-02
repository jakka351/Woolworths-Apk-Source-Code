package me.oriient.ui.contentview.content;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.annotation.Keep;
import kotlin.Deprecated;
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

@Deprecated
@Keep
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\\\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\u0019\b\u0002\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0002\b\u0010¢\u0006\u0002\u0010\u0011Bb\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\u0019\b\u0002\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0002\b\u0010¢\u0006\u0002\u0010\u0014J\"\u0010\u001f\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0004\u001a\u00020\u0005X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006&"}, d2 = {"Lme/oriient/ui/contentview/content/RoundRectContent;", "Lme/oriient/ui/contentview/models/Content;", "bounds", "Lme/oriient/ui/contentview/models/PixelRect;", "cornerRadius", "Lme/oriient/ui/contentview/models/Pixel;", "color", "Lme/oriient/ui/contentview/models/ContentColor;", "strokeWidth", "strokeColor", "anchorPoint", "Lme/oriient/ui/contentview/models/PixelCoordinate;", "configBlock", "Lkotlin/Function1;", "Lme/oriient/ui/contentview/DrawingOptionsImpl;", "", "Lkotlin/ExtensionFunctionType;", "(Lme/oriient/ui/contentview/models/PixelRect;FLme/oriient/ui/contentview/models/ContentColor;Lme/oriient/ui/contentview/models/Pixel;Lme/oriient/ui/contentview/models/ContentColor;Lme/oriient/ui/contentview/models/PixelCoordinate;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "customContentId", "Lme/oriient/ui/contentview/models/ContentId;", "(Lme/oriient/ui/contentview/models/ContentId;Lme/oriient/ui/contentview/models/PixelRect;FLme/oriient/ui/contentview/models/ContentColor;Lme/oriient/ui/contentview/models/Pixel;Lme/oriient/ui/contentview/models/ContentColor;Lme/oriient/ui/contentview/models/PixelCoordinate;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAnchorPoint", "()Lme/oriient/ui/contentview/models/PixelCoordinate;", "getBounds", "()Lme/oriient/ui/contentview/models/PixelRect;", "F", "drawStroke", "", "paint", "Landroid/graphics/Paint;", "strokePaint", "draw", "canvas", "Landroid/graphics/Canvas;", "transformMatrix", "Lme/oriient/ui/contentview/models/PixelMatrix;", "image", "Landroid/graphics/Bitmap;", "ui-content-view_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public class RoundRectContent extends Content {

    @NotNull
    private final PixelCoordinate anchorPoint;

    @NotNull
    private final PixelRect bounds;
    private final float cornerRadius;
    private final boolean drawStroke;

    @NotNull
    private final Paint paint;

    @NotNull
    private final Paint strokePaint;

    public static final class a extends Lambda implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f26609a = new a();

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
        public static final b f26610a = new b();

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

    public /* synthetic */ RoundRectContent(ContentId contentId, PixelRect pixelRect, float f, ContentColor contentColor, Pixel pixel, ContentColor contentColor2, PixelCoordinate pixelCoordinate, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(contentId, pixelRect, f, contentColor, pixel, contentColor2, pixelCoordinate, (Function1<? super DrawingOptionsImpl, Unit>) function1);
    }

    @Override // me.oriient.ui.contentview.models.Content
    public void draw(@NotNull Canvas canvas, @NotNull PixelMatrix transformMatrix, @Nullable Bitmap image) {
        Intrinsics.h(canvas, "canvas");
        Intrinsics.h(transformMatrix, "transformMatrix");
        RectF rectF = getBounds().getRectF();
        float f = this.cornerRadius;
        canvas.drawRoundRect(rectF, f, f, this.paint);
        if (this.drawStroke) {
            RectF rectF2 = getBounds().getRectF();
            float f2 = this.cornerRadius;
            canvas.drawRoundRect(rectF2, f2, f2, this.paint);
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

    public /* synthetic */ RoundRectContent(PixelRect pixelRect, float f, ContentColor contentColor, Pixel pixel, ContentColor contentColor2, PixelCoordinate pixelCoordinate, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(pixelRect, f, contentColor, pixel, contentColor2, pixelCoordinate, function1);
    }

    public /* synthetic */ RoundRectContent(ContentId contentId, PixelRect pixelRect, float f, ContentColor contentColor, Pixel pixel, ContentColor contentColor2, PixelCoordinate pixelCoordinate, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(contentId, pixelRect, f, contentColor, (i & 16) != 0 ? null : pixel, (i & 32) != 0 ? null : contentColor2, (i & 64) != 0 ? new PixelCoordinate(pixelRect.m574getCenterXXFKo8e8(), pixelRect.m575getCenterYXFKo8e8(), null) : pixelCoordinate, (i & 128) != 0 ? a.f26609a : function1, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private RoundRectContent(ContentId customContentId, PixelRect bounds, float f, ContentColor color, Pixel pixel, ContentColor contentColor, PixelCoordinate anchorPoint, Function1<? super DrawingOptionsImpl, Unit> configBlock) {
        super(customContentId, (String) null, configBlock);
        Intrinsics.h(customContentId, "customContentId");
        Intrinsics.h(bounds, "bounds");
        Intrinsics.h(color, "color");
        Intrinsics.h(anchorPoint, "anchorPoint");
        Intrinsics.h(configBlock, "configBlock");
        this.bounds = bounds;
        this.cornerRadius = f;
        this.anchorPoint = anchorPoint;
        Paint paint = new Paint();
        this.paint = paint;
        Paint paint2 = new Paint();
        this.strokePaint = paint2;
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

    public /* synthetic */ RoundRectContent(PixelRect pixelRect, float f, ContentColor contentColor, Pixel pixel, ContentColor contentColor2, PixelCoordinate pixelCoordinate, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(pixelRect, f, contentColor, (i & 8) != 0 ? null : pixel, (i & 16) != 0 ? null : contentColor2, (i & 32) != 0 ? new PixelCoordinate(pixelRect.m574getCenterXXFKo8e8(), pixelRect.m575getCenterYXFKo8e8(), null) : pixelCoordinate, (i & 64) != 0 ? b.f26610a : function1, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    private RoundRectContent(PixelRect bounds, float f, ContentColor color, Pixel pixel, ContentColor contentColor, PixelCoordinate anchorPoint, Function1<? super DrawingOptionsImpl, Unit> configBlock) {
        this(ContentId.INSTANCE.getRandom(), bounds, f, color, pixel, contentColor, anchorPoint, configBlock, (DefaultConstructorMarker) null);
        Intrinsics.h(bounds, "bounds");
        Intrinsics.h(color, "color");
        Intrinsics.h(anchorPoint, "anchorPoint");
        Intrinsics.h(configBlock, "configBlock");
    }
}
