package me.oriient.ui.contentview.content;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.TextPaint;
import androidx.annotation.Keep;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 H2\u00020\u0001:\u0002IJB\\\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\u0019\b\u0002\u0010\u0014\u001a\u0013\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010¢\u0006\u0002\b\u0013¢\u0006\u0004\b\u0015\u0010\u0016J/\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ/\u0010!\u001a\u00020 2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0012H\u0002¢\u0006\u0004\b#\u0010$J)\u0010)\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010&\u001a\u00020%2\b\u0010(\u001a\u0004\u0018\u00010'H\u0016¢\u0006\u0004\b)\u0010*J\u001f\u0010,\u001a\u00020+2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b,\u0010-J\"\u00102\u001a\u00020\u00122\u0006\u0010.\u001a\u00020\n2\u0006\u0010/\u001a\u00020\nH\u0016ø\u0001\u0000¢\u0006\u0004\b0\u00101R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00103R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00104R\u001a\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u000b\u00105R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00106R\u0014\u00107\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010=\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010@\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010D\u001a\u00020?8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bB\u0010CR\u0014\u0010G\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bE\u0010F\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006K"}, d2 = {"Lme/oriient/ui/contentview/content/SignMarkContent;", "Lme/oriient/ui/contentview/models/Content;", "Lme/oriient/ui/contentview/models/ContentId;", "customContentId", "Lme/oriient/ui/contentview/models/PixelCoordinate;", "coordinate", "", TextBundle.TEXT_ENTRY, "Lme/oriient/ui/contentview/models/ContentColor;", "textColor", "Lme/oriient/ui/contentview/models/Pixel;", "textFontSize", "Lme/oriient/ui/contentview/content/SignMarkContent$BackgroundStyle;", "backgroundStyle", "Landroid/graphics/Typeface;", "typeface", "Lkotlin/Function1;", "Lme/oriient/ui/contentview/DrawingOptionsImpl;", "", "Lkotlin/ExtensionFunctionType;", "configBlock", "<init>", "(Lme/oriient/ui/contentview/models/ContentId;Lme/oriient/ui/contentview/models/PixelCoordinate;Ljava/lang/String;Lme/oriient/ui/contentview/models/ContentColor;FLme/oriient/ui/contentview/content/SignMarkContent$BackgroundStyle;Landroid/graphics/Typeface;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroid/graphics/Canvas;", "canvas", "", "x", "y", "drawLineOfText", "(Landroid/graphics/Canvas;Ljava/lang/String;FF)V", "Landroid/text/TextPaint;", "paint", "Landroid/graphics/Rect;", "getTextBackgroundSize", "(FFLjava/lang/String;Landroid/text/TextPaint;)Landroid/graphics/Rect;", "updateBackgroundRect", "()V", "Lme/oriient/ui/contentview/models/PixelMatrix;", "transformMatrix", "Landroid/graphics/Bitmap;", "image", "draw", "(Landroid/graphics/Canvas;Lme/oriient/ui/contentview/models/PixelMatrix;Landroid/graphics/Bitmap;)V", "", "isClickedOn", "(Lme/oriient/ui/contentview/models/PixelCoordinate;Lme/oriient/ui/contentview/models/PixelMatrix;)Z", "dx", "dy", "move-oaYw5vM", "(FF)V", "move", "Lme/oriient/ui/contentview/models/PixelCoordinate;", "Ljava/lang/String;", "F", "Lme/oriient/ui/contentview/content/SignMarkContent$BackgroundStyle;", "textPaint", "Landroid/text/TextPaint;", "Landroid/graphics/Paint;", "backgroundPaint", "Landroid/graphics/Paint;", "Landroid/graphics/Path;", com.salesforce.marketingcloud.config.a.j, "Landroid/graphics/Path;", "Lme/oriient/ui/contentview/models/PixelRect;", "backgroundRect", "Lme/oriient/ui/contentview/models/PixelRect;", "getBounds", "()Lme/oriient/ui/contentview/models/PixelRect;", "bounds", "getAnchorPoint", "()Lme/oriient/ui/contentview/models/PixelCoordinate;", "anchorPoint", "Companion", "BackgroundStyle", "b", "ui-content-view_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SignMarkContent extends Content {

    @NotNull
    private static final b Companion = new b(null);
    private static final Typeface DEFAULT_TYPEFACE = Typeface.create(Typeface.DEFAULT, 1);

    @NotNull
    private static final String TAG = "SignMarkContent";

    @NotNull
    private final Paint backgroundPaint;

    @NotNull
    private final PixelRect backgroundRect;

    @NotNull
    private final BackgroundStyle backgroundStyle;

    @NotNull
    private final PixelCoordinate coordinate;

    @NotNull
    private final Path path;

    @NotNull
    private final String text;
    private final float textFontSize;

    @NotNull
    private final TextPaint textPaint;

    @Keep
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lme/oriient/ui/contentview/content/SignMarkContent$BackgroundStyle;", "", "()V", "Clear", "Rounded", "Lme/oriient/ui/contentview/content/SignMarkContent$BackgroundStyle$Clear;", "Lme/oriient/ui/contentview/content/SignMarkContent$BackgroundStyle$Rounded;", "ui-content-view_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class BackgroundStyle {

        @Keep
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lme/oriient/ui/contentview/content/SignMarkContent$BackgroundStyle$Clear;", "Lme/oriient/ui/contentview/content/SignMarkContent$BackgroundStyle;", "()V", "ui-content-view_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Clear extends BackgroundStyle {

            @NotNull
            public static final Clear INSTANCE = new Clear();

            private Clear() {
                super(null);
            }
        }

        @Keep
        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0016\u0010\r\u001a\u00020\u0005HÆ\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\nJ'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0019\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001a"}, d2 = {"Lme/oriient/ui/contentview/content/SignMarkContent$BackgroundStyle$Rounded;", "Lme/oriient/ui/contentview/content/SignMarkContent$BackgroundStyle;", "backgroundColor", "Lme/oriient/ui/contentview/models/ContentColor;", "backgroundPadding", "Lme/oriient/ui/contentview/models/Pixel;", "(Lme/oriient/ui/contentview/models/ContentColor;FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getBackgroundColor", "()Lme/oriient/ui/contentview/models/ContentColor;", "getBackgroundPadding-XFKo8e8", "()F", "F", "component1", "component2", "component2-XFKo8e8", "copy", "copy-oFkhdDI", "(Lme/oriient/ui/contentview/models/ContentColor;F)Lme/oriient/ui/contentview/content/SignMarkContent$BackgroundStyle$Rounded;", "equals", "", "other", "", "hashCode", "", "toString", "", "ui-content-view_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Rounded extends BackgroundStyle {

            @NotNull
            private final ContentColor backgroundColor;
            private final float backgroundPadding;

            public /* synthetic */ Rounded(ContentColor contentColor, float f, DefaultConstructorMarker defaultConstructorMarker) {
                this(contentColor, f);
            }

            /* renamed from: copy-oFkhdDI$default, reason: not valid java name */
            public static /* synthetic */ Rounded m524copyoFkhdDI$default(Rounded rounded, ContentColor contentColor, float f, int i, Object obj) {
                if ((i & 1) != 0) {
                    contentColor = rounded.backgroundColor;
                }
                if ((i & 2) != 0) {
                    f = rounded.backgroundPadding;
                }
                return rounded.m526copyoFkhdDI(contentColor, f);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final ContentColor getBackgroundColor() {
                return this.backgroundColor;
            }

            /* renamed from: component2-XFKo8e8, reason: not valid java name and from getter */
            public final float getBackgroundPadding() {
                return this.backgroundPadding;
            }

            @NotNull
            /* renamed from: copy-oFkhdDI, reason: not valid java name */
            public final Rounded m526copyoFkhdDI(@NotNull ContentColor backgroundColor, float backgroundPadding) {
                Intrinsics.h(backgroundColor, "backgroundColor");
                return new Rounded(backgroundColor, backgroundPadding, null);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Rounded)) {
                    return false;
                }
                Rounded rounded = (Rounded) other;
                return Intrinsics.c(this.backgroundColor, rounded.backgroundColor) && Pixel.m540equalsimpl0(this.backgroundPadding, rounded.backgroundPadding);
            }

            @NotNull
            public final ContentColor getBackgroundColor() {
                return this.backgroundColor;
            }

            /* renamed from: getBackgroundPadding-XFKo8e8, reason: not valid java name */
            public final float m527getBackgroundPaddingXFKo8e8() {
                return this.backgroundPadding;
            }

            public int hashCode() {
                return Pixel.m541hashCodeimpl(this.backgroundPadding) + (this.backgroundColor.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                return "Rounded(backgroundColor=" + this.backgroundColor + ", backgroundPadding=" + ((Object) Pixel.m548toStringimpl(this.backgroundPadding)) + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            private Rounded(ContentColor backgroundColor, float f) {
                super(null);
                Intrinsics.h(backgroundColor, "backgroundColor");
                this.backgroundColor = backgroundColor;
                this.backgroundPadding = f;
            }
        }

        public /* synthetic */ BackgroundStyle(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private BackgroundStyle() {
        }
    }

    public static final class a extends Lambda implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f26611a = new a();

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

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public /* synthetic */ SignMarkContent(ContentId contentId, PixelCoordinate pixelCoordinate, String str, ContentColor contentColor, float f, BackgroundStyle backgroundStyle, Typeface typeface, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(contentId, pixelCoordinate, str, contentColor, f, backgroundStyle, typeface, function1);
    }

    private final void drawLineOfText(Canvas canvas, String text, float x, float y) {
        canvas.drawText(text, x, y, this.textPaint);
    }

    private final Rect getTextBackgroundSize(float x, float y, String text, TextPaint paint) {
        float fM527getBackgroundPaddingXFKo8e8;
        BackgroundStyle backgroundStyle = this.backgroundStyle;
        if (backgroundStyle instanceof BackgroundStyle.Rounded) {
            fM527getBackgroundPaddingXFKo8e8 = ((BackgroundStyle.Rounded) backgroundStyle).m527getBackgroundPaddingXFKo8e8();
        } else {
            if (!(backgroundStyle instanceof BackgroundStyle.Clear)) {
                throw new NoWhenBranchMatchedException();
            }
            fM527getBackgroundPaddingXFKo8e8 = BitmapDescriptorFactory.HUE_RED;
        }
        float fAbs = Math.abs(paint.getFontMetrics().top);
        float fMax = Math.max(paint.measureText(text) / 2, fAbs);
        return new Rect((int) ((x - fMax) - fM527getBackgroundPaddingXFKo8e8), (int) ((y - fAbs) - fM527getBackgroundPaddingXFKo8e8), (int) (x + fMax + fM527getBackgroundPaddingXFKo8e8), (int) (y + fAbs + fM527getBackgroundPaddingXFKo8e8));
    }

    private final void updateBackgroundRect() {
        this.backgroundRect.set$ui_content_view_publishRelease(getTextBackgroundSize(this.coordinate.getX(), this.coordinate.getY(), this.text, this.textPaint));
    }

    @Override // me.oriient.ui.contentview.models.Content
    public void draw(@NotNull Canvas canvas, @NotNull PixelMatrix transformMatrix, @Nullable Bitmap image) {
        Intrinsics.h(canvas, "canvas");
        Intrinsics.h(transformMatrix, "transformMatrix");
        if (this.backgroundStyle instanceof BackgroundStyle.Rounded) {
            this.path.reset();
            float f = 2;
            this.path.addRoundRect(getBackgroundRect().getRectF(), getBackgroundRect().getHeight() / f, getBackgroundRect().getHeight() / f, Path.Direction.CW);
            this.path.close();
            canvas.drawPath(this.path, this.backgroundPaint);
        }
        drawLineOfText(canvas, this.text, this.coordinate.getX(), (this.textFontSize / 4) + this.coordinate.getY());
    }

    @Override // me.oriient.ui.contentview.models.Content
    @NotNull
    /* renamed from: getAnchorPoint, reason: from getter */
    public PixelCoordinate getCoordinate() {
        return this.coordinate;
    }

    @Override // me.oriient.ui.contentview.models.Content
    @NotNull
    /* renamed from: getBounds, reason: from getter */
    public PixelRect getBackgroundRect() {
        return this.backgroundRect;
    }

    @Override // me.oriient.ui.contentview.models.Content
    public boolean isClickedOn(@NotNull PixelCoordinate coordinate, @NotNull PixelMatrix transformMatrix) {
        Intrinsics.h(coordinate, "coordinate");
        Intrinsics.h(transformMatrix, "transformMatrix");
        updateBackgroundRect();
        return this.backgroundRect.contains(coordinate);
    }

    @Override // me.oriient.ui.contentview.models.Content
    /* renamed from: move-oaYw5vM */
    public void mo511moveoaYw5vM(float dx, float dy) {
        this.coordinate.m554offsetoaYw5vM(dx, dy);
        updateBackgroundRect();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SignMarkContent(ContentId contentId, PixelCoordinate pixelCoordinate, String str, ContentColor contentColor, float f, BackgroundStyle backgroundStyle, Typeface typeface, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Typeface typeface2;
        if ((i & 64) != 0) {
            Typeface DEFAULT_TYPEFACE2 = DEFAULT_TYPEFACE;
            Intrinsics.g(DEFAULT_TYPEFACE2, "DEFAULT_TYPEFACE");
            typeface2 = DEFAULT_TYPEFACE2;
        } else {
            typeface2 = typeface;
        }
        this(contentId, pixelCoordinate, str, contentColor, f, backgroundStyle, typeface2, (i & 128) != 0 ? a.f26611a : function1, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private SignMarkContent(ContentId customContentId, PixelCoordinate coordinate, String text, ContentColor textColor, float f, BackgroundStyle backgroundStyle, Typeface typeface, Function1<? super DrawingOptionsImpl, Unit> configBlock) {
        super(customContentId, (String) null, configBlock);
        Intrinsics.h(customContentId, "customContentId");
        Intrinsics.h(coordinate, "coordinate");
        Intrinsics.h(text, "text");
        Intrinsics.h(textColor, "textColor");
        Intrinsics.h(backgroundStyle, "backgroundStyle");
        Intrinsics.h(typeface, "typeface");
        Intrinsics.h(configBlock, "configBlock");
        this.coordinate = coordinate;
        this.text = text;
        this.textFontSize = f;
        this.backgroundStyle = backgroundStyle;
        TextPaint textPaint = new TextPaint();
        this.textPaint = textPaint;
        Paint paint = new Paint();
        this.backgroundPaint = paint;
        this.path = new Path();
        this.backgroundRect = new PixelRect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 15, null);
        ExtensionsKt.setContentColor(textPaint, textColor);
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setAntiAlias(true);
        textPaint.setTextSize(f);
        textPaint.setTypeface(typeface);
        updateBackgroundRect();
        if (backgroundStyle instanceof BackgroundStyle.Rounded) {
            ExtensionsKt.setContentColor(paint, ((BackgroundStyle.Rounded) backgroundStyle).getBackgroundColor());
        }
        paint.setAntiAlias(true);
    }
}
