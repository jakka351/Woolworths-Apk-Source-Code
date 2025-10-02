package me.oriient.ui.contentview.content;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.annotation.Keep;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u009c\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\n\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0005\u0012\u0019\b\u0002\u0010\u0012\u001a\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013¢\u0006\u0002\b\u0016¢\u0006\u0002\u0010\u0017J\"\u00109\u001a\u00020\u00152\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=2\b\u0010>\u001a\u0004\u0018\u00010?H\u0016J\u0018\u0010@\u001a\u00020)2\u0006\u0010A\u001a\u00020\u00062\u0006\u0010<\u001a\u00020=H\u0016J\"\u0010B\u001a\u00020\u00152\u0006\u0010C\u001a\u00020\f2\u0006\u0010D\u001a\u00020\fH\u0016ø\u0001\u0000¢\u0006\u0004\bE\u0010FR\u0014\u0010\u0018\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\f8BX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\fø\u0001\u0000ø\u0001\u0001¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u000e\u0010(\u001a\u00020)X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u001a\u0010,\u001a\u00020\f8BX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b-\u0010\u001dR\u000e\u0010.\u001a\u00020#X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020%X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u000201X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u00102\u001a\u00020\f8BX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b3\u0010\u001dR\u0013\u0010\r\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b4\u0010+R\u000e\u00105\u001a\u00020#X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\fø\u0001\u0000ø\u0001\u0001¢\u0006\b\n\u0000\u001a\u0004\b6\u0010'R\u001a\u00107\u001a\u00020\f8BX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b8\u0010\u001d\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006G"}, d2 = {"Lme/oriient/ui/contentview/content/RestrictedAreaContent;", "Lme/oriient/ui/contentview/models/Content;", "customContentId", "Lme/oriient/ui/contentview/models/ContentId;", "coordinates", "", "Lme/oriient/ui/contentview/models/PixelCoordinate;", "dashCoordinates", "customAnchorPoint", "fillColor", "Lme/oriient/ui/contentview/models/ContentColor;", "strokeWidth", "Lme/oriient/ui/contentview/models/Pixel;", "strokeColor", "dashStrokeWidth", "dashStrokeColor", "dottedLineDashPattern", "", "configBlock", "Lkotlin/Function1;", "Lme/oriient/ui/contentview/DrawingOptionsImpl;", "", "Lkotlin/ExtensionFunctionType;", "(Lme/oriient/ui/contentview/models/ContentId;Ljava/util/List;Ljava/util/List;Lme/oriient/ui/contentview/models/PixelCoordinate;Lme/oriient/ui/contentview/models/ContentColor;Lme/oriient/ui/contentview/models/Pixel;Lme/oriient/ui/contentview/models/ContentColor;Lme/oriient/ui/contentview/models/Pixel;Lme/oriient/ui/contentview/models/ContentColor;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "anchorPoint", "getAnchorPoint", "()Lme/oriient/ui/contentview/models/PixelCoordinate;", "bottom", "getBottom-XFKo8e8", "()F", "bounds", "Lme/oriient/ui/contentview/models/PixelRect;", "getBounds", "()Lme/oriient/ui/contentview/models/PixelRect;", "dashPaint", "Landroid/graphics/Paint;", "dashPath", "Landroid/graphics/Path;", "getDashStrokeWidth-Yj9MB40", "()Lme/oriient/ui/contentview/models/Pixel;", "drawStroke", "", "getFillColor", "()Lme/oriient/ui/contentview/models/ContentColor;", "left", "getLeft-XFKo8e8", "paint", com.salesforce.marketingcloud.config.a.j, "pathBounds", "Landroid/graphics/RectF;", "right", "getRight-XFKo8e8", "getStrokeColor", "strokePaint", "getStrokeWidth-Yj9MB40", "top", "getTop-XFKo8e8", "draw", "canvas", "Landroid/graphics/Canvas;", "transformMatrix", "Lme/oriient/ui/contentview/models/PixelMatrix;", "image", "Landroid/graphics/Bitmap;", "isClickedOn", "coordinate", "move", "dx", "dy", "move-oaYw5vM", "(FF)V", "ui-content-view_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class RestrictedAreaContent extends Content {

    @NotNull
    private final List<PixelCoordinate> coordinates;

    @Nullable
    private final PixelCoordinate customAnchorPoint;

    @Nullable
    private final List<PixelCoordinate> dashCoordinates;

    @NotNull
    private final Paint dashPaint;

    @NotNull
    private final Path dashPath;

    @Nullable
    private final Pixel dashStrokeWidth;
    private final boolean drawStroke;

    @NotNull
    private final ContentColor fillColor;

    @NotNull
    private final Paint paint;

    @NotNull
    private final Path path;

    @NotNull
    private final RectF pathBounds;

    @Nullable
    private final ContentColor strokeColor;

    @NotNull
    private final Paint strokePaint;

    @Nullable
    private final Pixel strokeWidth;

    public static final class a extends Lambda implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f26608a = new a();

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

    public /* synthetic */ RestrictedAreaContent(ContentId contentId, List list, List list2, PixelCoordinate pixelCoordinate, ContentColor contentColor, Pixel pixel, ContentColor contentColor2, Pixel pixel2, ContentColor contentColor3, List list3, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(contentId, list, list2, pixelCoordinate, contentColor, pixel, contentColor2, pixel2, contentColor3, list3, function1);
    }

    /* renamed from: getBottom-XFKo8e8, reason: not valid java name */
    private final float m518getBottomXFKo8e8() {
        Pixel pixel;
        Iterator<T> it = this.coordinates.iterator();
        if (it.hasNext()) {
            Pixel pixelM533boximpl = Pixel.m533boximpl(((PixelCoordinate) it.next()).getY());
            while (it.hasNext()) {
                Pixel pixelM533boximpl2 = Pixel.m533boximpl(((PixelCoordinate) it.next()).getY());
                if (pixelM533boximpl.compareTo(pixelM533boximpl2) < 0) {
                    pixelM533boximpl = pixelM533boximpl2;
                }
            }
            pixel = pixelM533boximpl;
        } else {
            pixel = null;
        }
        return pixel != null ? pixel.m551unboximpl() : ExtensionsKt.getPx(0);
    }

    /* renamed from: getLeft-XFKo8e8, reason: not valid java name */
    private final float m519getLeftXFKo8e8() {
        Pixel pixel;
        Iterator<T> it = this.coordinates.iterator();
        if (it.hasNext()) {
            Pixel pixelM533boximpl = Pixel.m533boximpl(((PixelCoordinate) it.next()).getX());
            while (it.hasNext()) {
                Pixel pixelM533boximpl2 = Pixel.m533boximpl(((PixelCoordinate) it.next()).getX());
                if (pixelM533boximpl.compareTo(pixelM533boximpl2) > 0) {
                    pixelM533boximpl = pixelM533boximpl2;
                }
            }
            pixel = pixelM533boximpl;
        } else {
            pixel = null;
        }
        return pixel != null ? pixel.m551unboximpl() : ExtensionsKt.getPx(0);
    }

    /* renamed from: getRight-XFKo8e8, reason: not valid java name */
    private final float m520getRightXFKo8e8() {
        Pixel pixel;
        Iterator<T> it = this.coordinates.iterator();
        if (it.hasNext()) {
            Pixel pixelM533boximpl = Pixel.m533boximpl(((PixelCoordinate) it.next()).getX());
            while (it.hasNext()) {
                Pixel pixelM533boximpl2 = Pixel.m533boximpl(((PixelCoordinate) it.next()).getX());
                if (pixelM533boximpl.compareTo(pixelM533boximpl2) < 0) {
                    pixelM533boximpl = pixelM533boximpl2;
                }
            }
            pixel = pixelM533boximpl;
        } else {
            pixel = null;
        }
        return pixel != null ? pixel.m551unboximpl() : ExtensionsKt.getPx(0);
    }

    /* renamed from: getTop-XFKo8e8, reason: not valid java name */
    private final float m521getTopXFKo8e8() {
        Pixel pixel;
        Iterator<T> it = this.coordinates.iterator();
        if (it.hasNext()) {
            Pixel pixelM533boximpl = Pixel.m533boximpl(((PixelCoordinate) it.next()).getY());
            while (it.hasNext()) {
                Pixel pixelM533boximpl2 = Pixel.m533boximpl(((PixelCoordinate) it.next()).getY());
                if (pixelM533boximpl.compareTo(pixelM533boximpl2) > 0) {
                    pixelM533boximpl = pixelM533boximpl2;
                }
            }
            pixel = pixelM533boximpl;
        } else {
            pixel = null;
        }
        return pixel != null ? pixel.m551unboximpl() : ExtensionsKt.getPx(0);
    }

    @Override // me.oriient.ui.contentview.models.Content
    public void draw(@NotNull Canvas canvas, @NotNull PixelMatrix transformMatrix, @Nullable Bitmap image) {
        Intrinsics.h(canvas, "canvas");
        Intrinsics.h(transformMatrix, "transformMatrix");
        if (this.coordinates.size() < 3) {
            return;
        }
        this.path.reset();
        PixelCoordinate pixelCoordinate = this.coordinates.get(0);
        this.path.moveTo(pixelCoordinate.getX(), pixelCoordinate.getY());
        int size = this.coordinates.size();
        for (int i = 1; i < size; i++) {
            PixelCoordinate pixelCoordinate2 = this.coordinates.get(i);
            this.path.lineTo(pixelCoordinate2.getX(), pixelCoordinate2.getY());
        }
        this.path.close();
        canvas.drawPath(this.path, this.paint);
        if (this.dashCoordinates != null) {
            this.dashPath.reset();
            PixelCoordinate pixelCoordinate3 = this.dashCoordinates.get(0);
            this.dashPath.moveTo(pixelCoordinate3.getX(), pixelCoordinate3.getY());
            int size2 = this.dashCoordinates.size();
            for (int i2 = 1; i2 < size2; i2++) {
                PixelCoordinate pixelCoordinate4 = this.dashCoordinates.get(i2);
                this.dashPath.lineTo(pixelCoordinate4.getX(), pixelCoordinate4.getY());
            }
            this.dashPath.close();
            canvas.drawPath(this.dashPath, this.dashPaint);
        }
        if (this.drawStroke) {
            canvas.drawPath(this.path, this.strokePaint);
        }
    }

    @Override // me.oriient.ui.contentview.models.Content
    @NotNull
    public PixelCoordinate getAnchorPoint() {
        PixelCoordinate pixelCoordinate = this.customAnchorPoint;
        if (pixelCoordinate != null) {
            return pixelCoordinate;
        }
        ExtensionsKt.bounds(this.path, this.pathBounds);
        return new PixelCoordinate(ExtensionsKt.getPx(this.pathBounds.centerX()), ExtensionsKt.getPx(this.pathBounds.centerY()), null);
    }

    @Override // me.oriient.ui.contentview.models.Content
    @NotNull
    public PixelRect getBounds() {
        return new PixelRect(m519getLeftXFKo8e8(), m521getTopXFKo8e8(), m520getRightXFKo8e8(), m518getBottomXFKo8e8(), null);
    }

    @Nullable
    /* renamed from: getDashStrokeWidth-Yj9MB40, reason: not valid java name and from getter */
    public final Pixel getDashStrokeWidth() {
        return this.dashStrokeWidth;
    }

    @NotNull
    public final ContentColor getFillColor() {
        return this.fillColor;
    }

    @Nullable
    public final ContentColor getStrokeColor() {
        return this.strokeColor;
    }

    @Nullable
    /* renamed from: getStrokeWidth-Yj9MB40, reason: not valid java name and from getter */
    public final Pixel getStrokeWidth() {
        return this.strokeWidth;
    }

    @Override // me.oriient.ui.contentview.models.Content
    public boolean isClickedOn(@NotNull PixelCoordinate coordinate, @NotNull PixelMatrix transformMatrix) {
        Intrinsics.h(coordinate, "coordinate");
        Intrinsics.h(transformMatrix, "transformMatrix");
        ExtensionsKt.bounds(this.path, this.pathBounds);
        return this.pathBounds.contains(coordinate.getX(), coordinate.getY());
    }

    @Override // me.oriient.ui.contentview.models.Content
    /* renamed from: move-oaYw5vM */
    public void mo511moveoaYw5vM(float dx, float dy) {
        Iterator<T> it = this.coordinates.iterator();
        while (it.hasNext()) {
            ((PixelCoordinate) it.next()).m554offsetoaYw5vM(dx, dy);
        }
        getAnchorPoint().m554offsetoaYw5vM(dx, dy);
    }

    public /* synthetic */ RestrictedAreaContent(ContentId contentId, List list, List list2, PixelCoordinate pixelCoordinate, ContentColor contentColor, Pixel pixel, ContentColor contentColor2, Pixel pixel2, ContentColor contentColor3, List list3, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(contentId, list, (i & 4) != 0 ? null : list2, (i & 8) != 0 ? null : pixelCoordinate, (i & 16) != 0 ? new ContentColor.Int(Color.argb(204, 175, 188, 195)) : contentColor, (i & 32) != 0 ? null : pixel, (i & 64) != 0 ? new ContentColor.Int(Color.argb(255, 255, 142, 54)) : contentColor2, (i & 128) != 0 ? null : pixel2, (i & 256) != 0 ? new ContentColor.Int(-1) : contentColor3, (i & 512) != 0 ? CollectionsKt.R(Float.valueOf(40.0f), Float.valueOf(20.0f)) : list3, (i & 1024) != 0 ? a.f26608a : function1, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private RestrictedAreaContent(ContentId customContentId, List<PixelCoordinate> coordinates, List<PixelCoordinate> list, PixelCoordinate pixelCoordinate, ContentColor fillColor, Pixel pixel, ContentColor contentColor, Pixel pixel2, ContentColor dashStrokeColor, List<Float> dottedLineDashPattern, Function1<? super DrawingOptionsImpl, Unit> configBlock) {
        super(customContentId, (String) null, configBlock);
        Intrinsics.h(customContentId, "customContentId");
        Intrinsics.h(coordinates, "coordinates");
        Intrinsics.h(fillColor, "fillColor");
        Intrinsics.h(dashStrokeColor, "dashStrokeColor");
        Intrinsics.h(dottedLineDashPattern, "dottedLineDashPattern");
        Intrinsics.h(configBlock, "configBlock");
        this.coordinates = coordinates;
        this.dashCoordinates = list;
        this.customAnchorPoint = pixelCoordinate;
        this.fillColor = fillColor;
        this.strokeWidth = pixel;
        this.strokeColor = contentColor;
        this.dashStrokeWidth = pixel2;
        Paint paint = new Paint();
        this.paint = paint;
        Paint paint2 = new Paint();
        this.strokePaint = paint2;
        Paint paint3 = new Paint();
        this.dashPaint = paint3;
        this.path = new Path();
        this.dashPath = new Path();
        this.pathBounds = new RectF();
        ExtensionsKt.setContentColor(paint, fillColor);
        paint.setAntiAlias(true);
        Paint.Join join = Paint.Join.ROUND;
        paint.setStrokeJoin(join);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        Paint.Style style = Paint.Style.STROKE;
        paint3.setStyle(style);
        ExtensionsKt.setContentColor(paint3, dashStrokeColor);
        paint3.setStrokeWidth(pixel2 != null ? pixel2.m551unboximpl() : 5.0f);
        paint3.setAntiAlias(true);
        paint3.setPathEffect(new DashPathEffect(CollectionsKt.D0(dottedLineDashPattern), BitmapDescriptorFactory.HUE_RED));
        boolean z = (pixel == null || contentColor == null) ? false : true;
        this.drawStroke = z;
        if (z) {
            paint2.setStyle(style);
            ExtensionsKt.setContentColor(paint2, contentColor);
            Intrinsics.e(pixel);
            paint2.setStrokeWidth(pixel.m551unboximpl());
            paint2.setAntiAlias(true);
            paint2.setStrokeJoin(join);
            paint2.setStrokeCap(cap);
        }
    }
}
