package me.oriient.ui.contentview.content;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.TextPaint;
import androidx.annotation.Keep;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
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
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\b\b\u0017\u0018\u0000 G2\u00020\u0001:\u0001HBz\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0004\u0012\u0019\b\u0002\u0010\u0016\u001a\u0013\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012¢\u0006\u0002\b\u0015¢\u0006\u0004\b\u0017\u0010\u0018Bt\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0004\u0012\u0019\b\u0002\u0010\u0016\u001a\u0013\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012¢\u0006\u0002\b\u0015¢\u0006\u0004\b\u0017\u0010\u0019J/\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 J/\u0010$\u001a\u00020#2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0014H\u0002¢\u0006\u0004\b&\u0010'J)\u0010,\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010)\u001a\u00020(2\b\u0010+\u001a\u0004\u0018\u00010*H\u0016¢\u0006\u0004\b,\u0010-J\u001f\u0010/\u001a\u00020.2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b/\u00100J\"\u00105\u001a\u00020\u00142\u0006\u00101\u001a\u00020\u00062\u0006\u00102\u001a\u00020\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b3\u00104J\u000f\u00106\u001a\u00020\nH\u0016¢\u0006\u0004\b6\u00107R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00108R\u001a\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0007\u00109R\u001a\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\b\u00109R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010:R\u001a\u0010\u0011\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u00108\u001a\u0004\b;\u0010<R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010=R\u0014\u0010>\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010=R\u0014\u0010?\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010B\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010F\u001a\u00020A8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bD\u0010E\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006I"}, d2 = {"Lme/oriient/ui/contentview/content/TextContent;", "Lme/oriient/ui/contentview/models/Content;", "Lme/oriient/ui/contentview/models/ContentId;", "customContentId", "Lme/oriient/ui/contentview/models/PixelCoordinate;", "coordinate", "Lme/oriient/ui/contentview/models/Pixel;", "fontSize", "strokeWidth", "", "", TextBundle.TEXT_ENTRY, "Lme/oriient/ui/contentview/models/ContentColor;", "color", "borderColor", "Landroid/graphics/Typeface;", "typeface", "anchorPoint", "Lkotlin/Function1;", "Lme/oriient/ui/contentview/DrawingOptionsImpl;", "", "Lkotlin/ExtensionFunctionType;", "configBlock", "<init>", "(Lme/oriient/ui/contentview/models/ContentId;Lme/oriient/ui/contentview/models/PixelCoordinate;FFLjava/util/List;Lme/oriient/ui/contentview/models/ContentColor;Lme/oriient/ui/contentview/models/ContentColor;Landroid/graphics/Typeface;Lme/oriient/ui/contentview/models/PixelCoordinate;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(Lme/oriient/ui/contentview/models/PixelCoordinate;FFLjava/util/List;Lme/oriient/ui/contentview/models/ContentColor;Lme/oriient/ui/contentview/models/ContentColor;Landroid/graphics/Typeface;Lme/oriient/ui/contentview/models/PixelCoordinate;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroid/graphics/Canvas;", "canvas", "", "x", "y", "drawLineOfText", "(Landroid/graphics/Canvas;Ljava/lang/String;FF)V", "Landroid/text/TextPaint;", "paint", "Landroid/graphics/Rect;", "getTextBackgroundSize", "(FFLjava/lang/String;Landroid/text/TextPaint;)Landroid/graphics/Rect;", "updateBackgroundRect", "()V", "Lme/oriient/ui/contentview/models/PixelMatrix;", "transformMatrix", "Landroid/graphics/Bitmap;", "image", "draw", "(Landroid/graphics/Canvas;Lme/oriient/ui/contentview/models/PixelMatrix;Landroid/graphics/Bitmap;)V", "", "isClickedOn", "(Lme/oriient/ui/contentview/models/PixelCoordinate;Lme/oriient/ui/contentview/models/PixelMatrix;)Z", "dx", "dy", "move-oaYw5vM", "(FF)V", "move", "toString", "()Ljava/lang/String;", "Lme/oriient/ui/contentview/models/PixelCoordinate;", "F", "Ljava/util/List;", "getAnchorPoint", "()Lme/oriient/ui/contentview/models/PixelCoordinate;", "Landroid/text/TextPaint;", "borderPaint", "drawBorder", "Z", "Lme/oriient/ui/contentview/models/PixelRect;", "backgroundRect", "Lme/oriient/ui/contentview/models/PixelRect;", "getBounds", "()Lme/oriient/ui/contentview/models/PixelRect;", "bounds", "Companion", "c", "ui-content-view_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public class TextContent extends Content {

    @NotNull
    private static final c Companion = new c(null);
    private static final Typeface DEFAULT_TYPEFACE = Typeface.create(Typeface.DEFAULT, 1);
    private static final boolean LIMIT_TEXT_LENGTH = false;

    @NotNull
    private final PixelCoordinate anchorPoint;

    @NotNull
    private final PixelRect backgroundRect;

    @NotNull
    private final TextPaint borderPaint;

    @NotNull
    private final PixelCoordinate coordinate;
    private final boolean drawBorder;
    private final float fontSize;

    @NotNull
    private final TextPaint paint;
    private final float strokeWidth;

    @NotNull
    private final List<String> text;

    public static final class a extends Lambda implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f26612a = new a();

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
        public static final b f26613a = new b();

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

    public /* synthetic */ TextContent(ContentId contentId, PixelCoordinate pixelCoordinate, float f, float f2, List list, ContentColor contentColor, ContentColor contentColor2, Typeface typeface, PixelCoordinate pixelCoordinate2, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(contentId, pixelCoordinate, f, f2, (List<String>) list, contentColor, contentColor2, typeface, pixelCoordinate2, (Function1<? super DrawingOptionsImpl, Unit>) function1);
    }

    private final void drawLineOfText(Canvas canvas, String text, float x, float y) {
        canvas.drawText(text, x, y, this.paint);
        if (this.drawBorder) {
            canvas.drawText(text, x, y, this.borderPaint);
        }
    }

    private final Rect getTextBackgroundSize(float x, float y, String text, TextPaint paint) {
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        float fMeasureText = (paint.measureText(text) / 2) + 5;
        return new Rect((int) (x - fMeasureText), (int) (fontMetrics.top + y), (int) (x + fMeasureText), (int) (y + fontMetrics.bottom));
    }

    private final void updateBackgroundRect() {
        Object obj;
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = this.text.iterator();
        float f = BitmapDescriptorFactory.HUE_RED;
        while (it.hasNext()) {
            arrayList.add(getTextBackgroundSize(this.coordinate.getX(), this.coordinate.getY() + f, it.next(), this.paint));
            f += this.fontSize;
        }
        Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            Object next = it2.next();
            if (it2.hasNext()) {
                int iWidth = ((Rect) next).width();
                do {
                    Object next2 = it2.next();
                    int iWidth2 = ((Rect) next2).width();
                    if (iWidth < iWidth2) {
                        next = next2;
                        iWidth = iWidth2;
                    }
                } while (it2.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        Rect rect = (Rect) obj;
        if (rect == null) {
            rect = new Rect();
        }
        this.backgroundRect.m585setPpj8M8(ExtensionsKt.getPx(rect.left), ExtensionsKt.getPx(((Rect) CollectionsKt.D(arrayList)).top), ExtensionsKt.getPx(rect.right), ExtensionsKt.getPx(((Rect) CollectionsKt.O(arrayList)).bottom));
    }

    @Override // me.oriient.ui.contentview.models.Content
    public void draw(@NotNull Canvas canvas, @NotNull PixelMatrix transformMatrix, @Nullable Bitmap image) {
        Intrinsics.h(canvas, "canvas");
        Intrinsics.h(transformMatrix, "transformMatrix");
        this.paint.setTextSize(this.fontSize);
        if (this.drawBorder) {
            this.borderPaint.setTextSize(this.fontSize);
            this.borderPaint.setStrokeWidth(this.strokeWidth);
        }
        float f = this.fontSize / 4;
        Iterator<String> it = this.text.iterator();
        while (it.hasNext()) {
            drawLineOfText(canvas, it.next(), this.coordinate.getX(), this.coordinate.getY() + f);
            f += this.fontSize;
        }
    }

    @Override // me.oriient.ui.contentview.models.Content
    @NotNull
    public PixelCoordinate getAnchorPoint() {
        return this.anchorPoint;
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

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("TextContent(coordinate=");
        sb.append(this.coordinate);
        sb.append(", fontSize=");
        sb.append((Object) Pixel.m548toStringimpl(this.fontSize));
        sb.append(", strokeWidth=");
        sb.append((Object) Pixel.m548toStringimpl(this.strokeWidth));
        sb.append(", anchorPoint=");
        sb.append(getAnchorPoint());
        sb.append(", labelText=");
        sb.append(this.text);
        sb.append(", drawBorder=");
        return androidx.camera.core.impl.b.s(sb, this.drawBorder, ')');
    }

    public /* synthetic */ TextContent(PixelCoordinate pixelCoordinate, float f, float f2, List list, ContentColor contentColor, ContentColor contentColor2, Typeface typeface, PixelCoordinate pixelCoordinate2, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(pixelCoordinate, f, f2, list, contentColor, contentColor2, typeface, pixelCoordinate2, function1);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TextContent(ContentId contentId, PixelCoordinate pixelCoordinate, float f, float f2, List list, ContentColor contentColor, ContentColor contentColor2, Typeface typeface, PixelCoordinate pixelCoordinate2, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Typeface typeface2;
        float px = (i & 8) != 0 ? ExtensionsKt.getPx(1) : f2;
        ContentColor contentColor3 = (i & 64) != 0 ? null : contentColor2;
        if ((i & 128) != 0) {
            Typeface DEFAULT_TYPEFACE2 = DEFAULT_TYPEFACE;
            Intrinsics.g(DEFAULT_TYPEFACE2, "DEFAULT_TYPEFACE");
            typeface2 = DEFAULT_TYPEFACE2;
        } else {
            typeface2 = typeface;
        }
        this(contentId, pixelCoordinate, f, px, list, contentColor, contentColor3, typeface2, (i & 256) != 0 ? pixelCoordinate : pixelCoordinate2, (i & 512) != 0 ? a.f26612a : function1, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private TextContent(ContentId customContentId, PixelCoordinate coordinate, float f, float f2, List<String> text, ContentColor color, ContentColor contentColor, Typeface typeface, PixelCoordinate anchorPoint, Function1<? super DrawingOptionsImpl, Unit> configBlock) {
        super(customContentId, (String) null, configBlock);
        Intrinsics.h(customContentId, "customContentId");
        Intrinsics.h(coordinate, "coordinate");
        Intrinsics.h(text, "text");
        Intrinsics.h(color, "color");
        Intrinsics.h(typeface, "typeface");
        Intrinsics.h(anchorPoint, "anchorPoint");
        Intrinsics.h(configBlock, "configBlock");
        this.coordinate = coordinate;
        this.fontSize = f;
        this.strokeWidth = f2;
        this.text = text;
        this.anchorPoint = anchorPoint;
        TextPaint textPaint = new TextPaint();
        this.paint = textPaint;
        TextPaint textPaint2 = new TextPaint();
        this.borderPaint = textPaint2;
        boolean z = contentColor != null;
        this.drawBorder = z;
        this.backgroundRect = new PixelRect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 15, null);
        ExtensionsKt.setContentColor(textPaint, color);
        Paint.Align align = Paint.Align.CENTER;
        textPaint.setTextAlign(align);
        textPaint.setTypeface(typeface);
        textPaint.setAntiAlias(true);
        if (z) {
            ExtensionsKt.setContentColor(textPaint2, contentColor);
            textPaint2.setStyle(Paint.Style.STROKE);
            textPaint2.setTextAlign(align);
            textPaint2.setTypeface(typeface);
            textPaint2.setAntiAlias(true);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TextContent(PixelCoordinate pixelCoordinate, float f, float f2, List list, ContentColor contentColor, ContentColor contentColor2, Typeface typeface, PixelCoordinate pixelCoordinate2, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Typeface typeface2;
        float px = (i & 4) != 0 ? ExtensionsKt.getPx(1) : f2;
        ContentColor contentColor3 = (i & 32) != 0 ? null : contentColor2;
        if ((i & 64) != 0) {
            Typeface DEFAULT_TYPEFACE2 = DEFAULT_TYPEFACE;
            Intrinsics.g(DEFAULT_TYPEFACE2, "DEFAULT_TYPEFACE");
            typeface2 = DEFAULT_TYPEFACE2;
        } else {
            typeface2 = typeface;
        }
        this(pixelCoordinate, f, px, list, contentColor, contentColor3, typeface2, (i & 128) != 0 ? pixelCoordinate : pixelCoordinate2, (i & 256) != 0 ? b.f26613a : function1, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    private TextContent(PixelCoordinate coordinate, float f, float f2, List<String> text, ContentColor color, ContentColor contentColor, Typeface typeface, PixelCoordinate anchorPoint, Function1<? super DrawingOptionsImpl, Unit> configBlock) {
        this(ContentId.INSTANCE.getRandom(), coordinate, f, f2, text, color, contentColor, typeface, anchorPoint, configBlock, (DefaultConstructorMarker) null);
        Intrinsics.h(coordinate, "coordinate");
        Intrinsics.h(text, "text");
        Intrinsics.h(color, "color");
        Intrinsics.h(typeface, "typeface");
        Intrinsics.h(anchorPoint, "anchorPoint");
        Intrinsics.h(configBlock, "configBlock");
    }
}
