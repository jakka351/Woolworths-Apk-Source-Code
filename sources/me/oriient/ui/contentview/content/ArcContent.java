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
import me.oriient.ui.contentview.models.Degrees;
import me.oriient.ui.contentview.models.Pixel;
import me.oriient.ui.contentview.models.PixelCoordinate;
import me.oriient.ui.contentview.models.PixelMatrix;
import me.oriient.ui.contentview.utils.ExtensionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0017\u0018\u00002\u00020\u0001BT\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\u0019\b\u0002\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0002\b\u0010¢\u0006\u0002\u0010\u0011BZ\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\u0019\b\u0002\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0002\b\u0010¢\u0006\u0002\u0010\u0014J\"\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\b\u0010!\u001a\u00020\"H\u0016R\u0014\u0010\u000b\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0004\u001a\u00020\u0005X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0019\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006#"}, d2 = {"Lme/oriient/ui/contentview/content/ArcContent;", "Lme/oriient/ui/contentview/models/Content;", "center", "Lme/oriient/ui/contentview/models/PixelCoordinate;", "radius", "Lme/oriient/ui/contentview/models/Pixel;", "direction", "Lme/oriient/ui/contentview/models/Degrees;", "opening", "color", "Lme/oriient/ui/contentview/models/ContentColor;", "anchorPoint", "configBlock", "Lkotlin/Function1;", "Lme/oriient/ui/contentview/DrawingOptionsImpl;", "", "Lkotlin/ExtensionFunctionType;", "(Lme/oriient/ui/contentview/models/PixelCoordinate;FLme/oriient/ui/contentview/models/Degrees;Lme/oriient/ui/contentview/models/Degrees;Lme/oriient/ui/contentview/models/ContentColor;Lme/oriient/ui/contentview/models/PixelCoordinate;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "customContentId", "Lme/oriient/ui/contentview/models/ContentId;", "(Lme/oriient/ui/contentview/models/ContentId;Lme/oriient/ui/contentview/models/PixelCoordinate;FLme/oriient/ui/contentview/models/Degrees;Lme/oriient/ui/contentview/models/Degrees;Lme/oriient/ui/contentview/models/ContentColor;Lme/oriient/ui/contentview/models/PixelCoordinate;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAnchorPoint", "()Lme/oriient/ui/contentview/models/PixelCoordinate;", "paint", "Landroid/graphics/Paint;", "F", "draw", "canvas", "Landroid/graphics/Canvas;", "transformMatrix", "Lme/oriient/ui/contentview/models/PixelMatrix;", "image", "Landroid/graphics/Bitmap;", "toString", "", "ui-content-view_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public class ArcContent extends Content {

    @NotNull
    private final PixelCoordinate anchorPoint;

    @NotNull
    private final PixelCoordinate center;

    @NotNull
    private final Degrees direction;

    @NotNull
    private final Degrees opening;

    @NotNull
    private final Paint paint;
    private final float radius;

    public static final class a extends Lambda implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f26593a = new a();

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
        public static final b f26594a = new b();

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

    public /* synthetic */ ArcContent(ContentId contentId, PixelCoordinate pixelCoordinate, float f, Degrees degrees, Degrees degrees2, ContentColor contentColor, PixelCoordinate pixelCoordinate2, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(contentId, pixelCoordinate, f, degrees, degrees2, contentColor, pixelCoordinate2, (Function1<? super DrawingOptionsImpl, Unit>) function1);
    }

    @Override // me.oriient.ui.contentview.models.Content
    public void draw(@NotNull Canvas canvas, @NotNull PixelMatrix transformMatrix, @Nullable Bitmap image) {
        Intrinsics.h(canvas, "canvas");
        Intrinsics.h(transformMatrix, "transformMatrix");
        canvas.drawArc(this.center.getX() - this.radius, this.center.getY() - this.radius, this.center.getX() + this.radius, this.center.getY() + this.radius, this.direction.getValue() - (this.opening.getValue() / 2), this.opening.getValue(), true, this.paint);
    }

    @Override // me.oriient.ui.contentview.models.Content
    @NotNull
    public PixelCoordinate getAnchorPoint() {
        return this.anchorPoint;
    }

    @NotNull
    public String toString() {
        return "ArcContent(center=" + this.center + ", radius=" + ((Object) Pixel.m548toStringimpl(this.radius)) + ", direction=" + this.direction + ", opening=" + this.opening + ", anchorPoint=" + getAnchorPoint() + ", paint=" + this.paint + ')';
    }

    public /* synthetic */ ArcContent(PixelCoordinate pixelCoordinate, float f, Degrees degrees, Degrees degrees2, ContentColor contentColor, PixelCoordinate pixelCoordinate2, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(pixelCoordinate, f, degrees, degrees2, contentColor, pixelCoordinate2, function1);
    }

    public /* synthetic */ ArcContent(ContentId contentId, PixelCoordinate pixelCoordinate, float f, Degrees degrees, Degrees degrees2, ContentColor contentColor, PixelCoordinate pixelCoordinate2, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(contentId, pixelCoordinate, f, degrees, degrees2, contentColor, (i & 64) != 0 ? pixelCoordinate : pixelCoordinate2, (i & 128) != 0 ? a.f26593a : function1, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private ArcContent(ContentId customContentId, PixelCoordinate center, float f, Degrees direction, Degrees opening, ContentColor color, PixelCoordinate anchorPoint, Function1<? super DrawingOptionsImpl, Unit> configBlock) {
        super(customContentId, (String) null, configBlock);
        Intrinsics.h(customContentId, "customContentId");
        Intrinsics.h(center, "center");
        Intrinsics.h(direction, "direction");
        Intrinsics.h(opening, "opening");
        Intrinsics.h(color, "color");
        Intrinsics.h(anchorPoint, "anchorPoint");
        Intrinsics.h(configBlock, "configBlock");
        this.center = center;
        this.radius = f;
        this.direction = direction;
        this.opening = opening;
        this.anchorPoint = anchorPoint;
        Paint paint = new Paint();
        this.paint = paint;
        ExtensionsKt.setContentColor(paint, color);
        paint.setAntiAlias(true);
    }

    public /* synthetic */ ArcContent(PixelCoordinate pixelCoordinate, float f, Degrees degrees, Degrees degrees2, ContentColor contentColor, PixelCoordinate pixelCoordinate2, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(pixelCoordinate, f, degrees, degrees2, contentColor, (i & 32) != 0 ? pixelCoordinate : pixelCoordinate2, (i & 64) != 0 ? b.f26594a : function1, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    private ArcContent(PixelCoordinate center, float f, Degrees direction, Degrees opening, ContentColor color, PixelCoordinate anchorPoint, Function1<? super DrawingOptionsImpl, Unit> configBlock) {
        this(ContentId.INSTANCE.getRandom(), center, f, direction, opening, color, anchorPoint, configBlock, (DefaultConstructorMarker) null);
        Intrinsics.h(center, "center");
        Intrinsics.h(direction, "direction");
        Intrinsics.h(opening, "opening");
        Intrinsics.h(color, "color");
        Intrinsics.h(anchorPoint, "anchorPoint");
        Intrinsics.h(configBlock, "configBlock");
    }
}
