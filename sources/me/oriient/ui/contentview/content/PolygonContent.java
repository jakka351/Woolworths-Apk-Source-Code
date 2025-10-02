package me.oriient.ui.contentview.content;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import androidx.annotation.Keep;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\b\u0017\u0018\u00002\u00020\u0001Bf\b\u0016\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\u0019\b\u0002\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0002\b\u0010¢\u0006\u0002\u0010\u0011Bl\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\u0019\b\u0002\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0002\b\u0010¢\u0006\u0002\u0010\u0014J\"\u0010;\u001a\u00020\u000f2\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?2\b\u0010@\u001a\u0004\u0018\u00010AH\u0016J\u0018\u0010B\u001a\u00020(2\u0006\u0010C\u001a\u00020\u00042\u0006\u0010>\u001a\u00020?H\u0016J\"\u0010D\u001a\u00020\u000f2\u0006\u0010E\u001a\u00020\b2\u0006\u0010F\u001a\u00020\bH\u0016ø\u0001\u0000¢\u0006\u0004\bG\u0010HJ\b\u0010I\u001a\u00020JH\u0016R\u0014\u0010\u0015\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\b8BX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\"\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0002\b\u0010¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0019\u0010\n\u001a\u00020\bø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010&\u001a\u0004\b%\u0010\u001aR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020(X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010)\u001a\u00020\b8BX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b*\u0010\u001aR\u000e\u0010+\u001a\u00020,X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020.X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u000200X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u000202X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u00103\u001a\u00020\b8BX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b4\u0010\u001aR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b5\u0010 R\u000e\u00106\u001a\u00020,X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\bø\u0001\u0000ø\u0001\u0001¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u001a\u00109\u001a\u00020\b8BX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b:\u0010\u001a\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006K"}, d2 = {"Lme/oriient/ui/contentview/content/PolygonContent;", "Lme/oriient/ui/contentview/models/Content;", "coordinates", "", "Lme/oriient/ui/contentview/models/PixelCoordinate;", "color", "Lme/oriient/ui/contentview/models/ContentColor;", "strokeWidth", "Lme/oriient/ui/contentview/models/Pixel;", "strokeColor", "cornerRadius", "customAnchorPoint", "configBlock", "Lkotlin/Function1;", "Lme/oriient/ui/contentview/DrawingOptionsImpl;", "", "Lkotlin/ExtensionFunctionType;", "(Ljava/util/List;Lme/oriient/ui/contentview/models/ContentColor;Lme/oriient/ui/contentview/models/Pixel;Lme/oriient/ui/contentview/models/ContentColor;FLme/oriient/ui/contentview/models/PixelCoordinate;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "customContentId", "Lme/oriient/ui/contentview/models/ContentId;", "(Lme/oriient/ui/contentview/models/ContentId;Ljava/util/List;Lme/oriient/ui/contentview/models/ContentColor;Lme/oriient/ui/contentview/models/Pixel;Lme/oriient/ui/contentview/models/ContentColor;FLme/oriient/ui/contentview/models/PixelCoordinate;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "anchorPoint", "getAnchorPoint", "()Lme/oriient/ui/contentview/models/PixelCoordinate;", "bottom", "getBottom-XFKo8e8", "()F", "bounds", "Lme/oriient/ui/contentview/models/PixelRect;", "getBounds", "()Lme/oriient/ui/contentview/models/PixelRect;", "getColor", "()Lme/oriient/ui/contentview/models/ContentColor;", "getConfigBlock", "()Lkotlin/jvm/functions/Function1;", "getCoordinates", "()Ljava/util/List;", "getCornerRadius-XFKo8e8", "F", "drawStroke", "", "left", "getLeft-XFKo8e8", "paint", "Landroid/graphics/Paint;", com.salesforce.marketingcloud.config.a.j, "Landroid/graphics/Path;", "pathBounds", "Landroid/graphics/RectF;", "pathRegion", "Landroid/graphics/Region;", "right", "getRight-XFKo8e8", "getStrokeColor", "strokePaint", "getStrokeWidth-Yj9MB40", "()Lme/oriient/ui/contentview/models/Pixel;", "top", "getTop-XFKo8e8", "draw", "canvas", "Landroid/graphics/Canvas;", "transformMatrix", "Lme/oriient/ui/contentview/models/PixelMatrix;", "image", "Landroid/graphics/Bitmap;", "isClickedOn", "coordinate", "move", "dx", "dy", "move-oaYw5vM", "(FF)V", "toString", "", "ui-content-view_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public class PolygonContent extends Content {

    @NotNull
    private final ContentColor color;

    @NotNull
    private final Function1<DrawingOptionsImpl, Unit> configBlock;

    @NotNull
    private final List<PixelCoordinate> coordinates;
    private final float cornerRadius;

    @Nullable
    private final PixelCoordinate customAnchorPoint;
    private final boolean drawStroke;

    @NotNull
    private final Paint paint;

    @NotNull
    private final Path path;

    @NotNull
    private final RectF pathBounds;

    @NotNull
    private final Region pathRegion;

    @Nullable
    private final ContentColor strokeColor;

    @NotNull
    private final Paint strokePaint;

    @Nullable
    private final Pixel strokeWidth;

    public static final class a extends Lambda implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f26606a = new a();

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
        public static final b f26607a = new b();

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

    public /* synthetic */ PolygonContent(List list, ContentColor contentColor, Pixel pixel, ContentColor contentColor2, float f, PixelCoordinate pixelCoordinate, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, contentColor, pixel, contentColor2, f, pixelCoordinate, function1);
    }

    /* renamed from: getBottom-XFKo8e8, reason: not valid java name */
    private final float m512getBottomXFKo8e8() {
        List<PixelCoordinate> list = this.coordinates;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Pixel.m533boximpl(((PixelCoordinate) it.next()).getY()));
        }
        Pixel pixel = (Pixel) CollectionsKt.T(arrayList);
        return pixel != null ? pixel.m551unboximpl() : ExtensionsKt.getPx(0);
    }

    /* renamed from: getLeft-XFKo8e8, reason: not valid java name */
    private final float m513getLeftXFKo8e8() {
        List<PixelCoordinate> list = this.coordinates;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Pixel.m533boximpl(((PixelCoordinate) it.next()).getX()));
        }
        Pixel pixel = (Pixel) CollectionsKt.V(arrayList);
        return pixel != null ? pixel.m551unboximpl() : ExtensionsKt.getPx(0);
    }

    /* renamed from: getRight-XFKo8e8, reason: not valid java name */
    private final float m514getRightXFKo8e8() {
        List<PixelCoordinate> list = this.coordinates;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Pixel.m533boximpl(((PixelCoordinate) it.next()).getX()));
        }
        Pixel pixel = (Pixel) CollectionsKt.T(arrayList);
        return pixel != null ? pixel.m551unboximpl() : ExtensionsKt.getPx(0);
    }

    /* renamed from: getTop-XFKo8e8, reason: not valid java name */
    private final float m515getTopXFKo8e8() {
        List<PixelCoordinate> list = this.coordinates;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Pixel.m533boximpl(((PixelCoordinate) it.next()).getY()));
        }
        Pixel pixel = (Pixel) CollectionsKt.V(arrayList);
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
        return new PixelRect(m513getLeftXFKo8e8(), m515getTopXFKo8e8(), m514getRightXFKo8e8(), m512getBottomXFKo8e8(), null);
    }

    @NotNull
    public final ContentColor getColor() {
        return this.color;
    }

    @NotNull
    public final Function1<DrawingOptionsImpl, Unit> getConfigBlock() {
        return this.configBlock;
    }

    @NotNull
    public final List<PixelCoordinate> getCoordinates() {
        return this.coordinates;
    }

    /* renamed from: getCornerRadius-XFKo8e8, reason: not valid java name and from getter */
    public final float getCornerRadius() {
        return this.cornerRadius;
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

    @NotNull
    public String toString() {
        return "PolygonContent(coordinates=" + this.coordinates + ", color=" + this.color + ", strokeWidth=" + this.strokeWidth + ", strokeColor=" + this.strokeColor + ", cornerRadius=" + ((Object) Pixel.m548toStringimpl(this.cornerRadius)) + ", anchorPoint=" + getAnchorPoint() + ", drawStroke=" + this.drawStroke + ", pathRegion=" + this.pathRegion + ", bounds=" + getBounds() + ", top=" + ((Object) Pixel.m548toStringimpl(m515getTopXFKo8e8())) + ", bottom=" + ((Object) Pixel.m548toStringimpl(m512getBottomXFKo8e8())) + ", left=" + ((Object) Pixel.m548toStringimpl(m513getLeftXFKo8e8())) + ", right=" + ((Object) Pixel.m548toStringimpl(m514getRightXFKo8e8())) + ')';
    }

    public /* synthetic */ PolygonContent(ContentId contentId, List list, ContentColor contentColor, Pixel pixel, ContentColor contentColor2, float f, PixelCoordinate pixelCoordinate, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(contentId, (List<PixelCoordinate>) list, contentColor, pixel, contentColor2, f, pixelCoordinate, (Function1<? super DrawingOptionsImpl, Unit>) function1);
    }

    public /* synthetic */ PolygonContent(ContentId contentId, List list, ContentColor contentColor, Pixel pixel, ContentColor contentColor2, float f, PixelCoordinate pixelCoordinate, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(contentId, list, contentColor, (i & 8) != 0 ? null : pixel, (i & 16) != 0 ? null : contentColor2, (i & 32) != 0 ? ExtensionsKt.getPx(0) : f, (i & 64) != 0 ? null : pixelCoordinate, (i & 128) != 0 ? a.f26606a : function1, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    private PolygonContent(ContentId customContentId, List<PixelCoordinate> coordinates, ContentColor color, Pixel pixel, ContentColor contentColor, float f, PixelCoordinate pixelCoordinate, Function1<? super DrawingOptionsImpl, Unit> configBlock) {
        super(customContentId, (String) null, configBlock);
        Intrinsics.h(customContentId, "customContentId");
        Intrinsics.h(coordinates, "coordinates");
        Intrinsics.h(color, "color");
        Intrinsics.h(configBlock, "configBlock");
        this.coordinates = coordinates;
        this.color = color;
        this.strokeWidth = pixel;
        this.strokeColor = contentColor;
        this.cornerRadius = f;
        this.customAnchorPoint = pixelCoordinate;
        this.configBlock = configBlock;
        Paint paint = new Paint();
        this.paint = paint;
        Paint paint2 = new Paint();
        this.strokePaint = paint2;
        this.path = new Path();
        this.pathBounds = new RectF();
        this.pathRegion = new Region();
        ExtensionsKt.setContentColor(paint, color);
        paint.setAntiAlias(true);
        Paint.Join join = Paint.Join.ROUND;
        paint.setStrokeJoin(join);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint.setPathEffect(new CornerPathEffect(f));
        boolean z = (pixel == null || contentColor == null) ? false : true;
        this.drawStroke = z;
        if (z) {
            paint2.setStyle(Paint.Style.STROKE);
            ExtensionsKt.setContentColor(paint2, contentColor);
            Intrinsics.e(pixel);
            paint2.setStrokeWidth(pixel.m551unboximpl());
            paint2.setAntiAlias(true);
            paint2.setStrokeJoin(join);
            paint2.setStrokeCap(cap);
            paint2.setPathEffect(new CornerPathEffect(f));
        }
    }

    public /* synthetic */ PolygonContent(List list, ContentColor contentColor, Pixel pixel, ContentColor contentColor2, float f, PixelCoordinate pixelCoordinate, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, contentColor, (i & 4) != 0 ? null : pixel, (i & 8) != 0 ? null : contentColor2, (i & 16) != 0 ? ExtensionsKt.getPx(0) : f, (i & 32) != 0 ? null : pixelCoordinate, (i & 64) != 0 ? b.f26607a : function1, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    private PolygonContent(List<PixelCoordinate> coordinates, ContentColor color, Pixel pixel, ContentColor contentColor, float f, PixelCoordinate pixelCoordinate, Function1<? super DrawingOptionsImpl, Unit> configBlock) {
        this(ContentId.INSTANCE.getRandom(), coordinates, color, pixel, contentColor, f, pixelCoordinate, configBlock, (DefaultConstructorMarker) null);
        Intrinsics.h(coordinates, "coordinates");
        Intrinsics.h(color, "color");
        Intrinsics.h(configBlock, "configBlock");
    }
}
