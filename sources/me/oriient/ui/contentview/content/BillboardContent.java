package me.oriient.ui.contentview.content;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.annotation.Keep;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import me.oriient.ui.contentview.DrawingOptionsImpl;
import me.oriient.ui.contentview.models.BillboardParameters;
import me.oriient.ui.contentview.models.Content;
import me.oriient.ui.contentview.models.ContentId;
import me.oriient.ui.contentview.models.PixelCoordinate;
import me.oriient.ui.contentview.models.PixelMatrix;
import me.oriient.ui.contentview.models.PixelSize;
import me.oriient.ui.contentview.utils.ExtensionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001BJ\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u0019\b\u0002\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000e¢\u0006\u0002\u0010\u000fBP\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u0019\b\u0002\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000e¢\u0006\u0002\u0010\u0012J\"\u0010'\u001a\u00020\r2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0007H\u0016J\u0018\u0010-\u001a\u00020.2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010*\u001a\u00020+H\u0016J\"\u0010/\u001a\u00020\r2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u000201H\u0016ø\u0001\u0000¢\u0006\u0004\b3\u00104J\b\u00105\u001a\u00020\u0005H\u0016R\u000e\u0010\u0013\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00066"}, d2 = {"Lme/oriient/ui/contentview/content/BillboardContent;", "Lme/oriient/ui/contentview/models/Content;", "coordinate", "Lme/oriient/ui/contentview/models/PixelCoordinate;", "imageIdentifier", "", "imageOverlay", "Landroid/graphics/Bitmap;", "billboardParameters", "Lme/oriient/ui/contentview/models/BillboardParameters;", "configBlock", "Lkotlin/Function1;", "Lme/oriient/ui/contentview/DrawingOptionsImpl;", "", "Lkotlin/ExtensionFunctionType;", "(Lme/oriient/ui/contentview/models/PixelCoordinate;Ljava/lang/String;Landroid/graphics/Bitmap;Lme/oriient/ui/contentview/models/BillboardParameters;Lkotlin/jvm/functions/Function1;)V", "customContentId", "Lme/oriient/ui/contentview/models/ContentId;", "(Lme/oriient/ui/contentview/models/ContentId;Lme/oriient/ui/contentview/models/PixelCoordinate;Ljava/lang/String;Landroid/graphics/Bitmap;Lme/oriient/ui/contentview/models/BillboardParameters;Lkotlin/jvm/functions/Function1;)V", "_bottomRight", "_topLeft", "anchorPoint", "getAnchorPoint", "()Lme/oriient/ui/contentview/models/PixelCoordinate;", "clickRect", "Landroid/graphics/RectF;", "imageRect", "paint", "Landroid/graphics/Paint;", com.salesforce.marketingcloud.config.a.j, "Landroid/graphics/Path;", "shadowCirclePaint", "shadowCircleSize", "Lme/oriient/ui/contentview/models/PixelSize;", "shadowColor", "", "standPaint", "standPath", "standShadowPaint", "draw", "canvas", "Landroid/graphics/Canvas;", "transformMatrix", "Lme/oriient/ui/contentview/models/PixelMatrix;", "image", "isClickedOn", "", "move", "dx", "Lme/oriient/ui/contentview/models/Pixel;", "dy", "move-oaYw5vM", "(FF)V", "toString", "ui-content-view_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public class BillboardContent extends Content {

    @NotNull
    private final PixelCoordinate _bottomRight;

    @NotNull
    private final PixelCoordinate _topLeft;

    @NotNull
    private final BillboardParameters billboardParameters;

    @NotNull
    private final RectF clickRect;

    @NotNull
    private final PixelCoordinate coordinate;

    @Nullable
    private final Bitmap imageOverlay;

    @NotNull
    private final RectF imageRect;

    @NotNull
    private final Paint paint;

    @NotNull
    private final Path path;

    @NotNull
    private final Paint shadowCirclePaint;

    @NotNull
    private final PixelSize shadowCircleSize;
    private final int shadowColor;

    @NotNull
    private final Paint standPaint;

    @NotNull
    private final Path standPath;

    @NotNull
    private final Paint standShadowPaint;

    public static final class a extends Lambda implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f26595a = new a();

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
        public static final b f26596a = new b();

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

    public /* synthetic */ BillboardContent(ContentId contentId, PixelCoordinate pixelCoordinate, String str, Bitmap bitmap, BillboardParameters billboardParameters, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(contentId, pixelCoordinate, str, (i & 8) != 0 ? null : bitmap, (i & 16) != 0 ? new BillboardParameters(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, 127, null) : billboardParameters, (i & 32) != 0 ? a.f26595a : function1);
    }

    @Override // me.oriient.ui.contentview.models.Content
    public void draw(@NotNull Canvas canvas, @NotNull PixelMatrix transformMatrix, @Nullable Bitmap image) {
        Intrinsics.h(canvas, "canvas");
        Intrinsics.h(transformMatrix, "transformMatrix");
        this.standPath.reset();
        this.standPath.moveTo(this.coordinate.getX(), this.coordinate.getY());
        this.standPath.lineTo(this.coordinate.getX() - (this.billboardParameters.getBottomStandWidth() / 2.0f), (this.coordinate.getY() - this.billboardParameters.getBottomStandHeight()) - 1.0f);
        this.standPath.lineTo((this.billboardParameters.getBottomStandWidth() / 2.0f) + this.coordinate.getX(), (this.coordinate.getY() - this.billboardParameters.getBottomStandHeight()) - 1.0f);
        this.standPath.close();
        this.path.reset();
        float x = this.coordinate.getX() - (this.billboardParameters.getWidth() / 2.0f);
        float y = this.coordinate.getY() - this.billboardParameters.getBottomStandHeight();
        this.path.moveTo(x, y);
        float height = BitmapDescriptorFactory.HUE_RED - this.billboardParameters.getHeight();
        float f = y + height;
        this.path.lineTo(x + BitmapDescriptorFactory.HUE_RED, f);
        float width = this.billboardParameters.getWidth() + BitmapDescriptorFactory.HUE_RED + x;
        this.path.lineTo(width, f);
        this.path.lineTo(width, this.billboardParameters.getHeight() + height + y);
        this.path.close();
        canvas.drawOval(this.coordinate.getX() - (this.shadowCircleSize.getWidth() / 2.0f), this.coordinate.getY() - (this.shadowCircleSize.getHeight() / 2.0f), (this.shadowCircleSize.getWidth() / 2.0f) + this.coordinate.getX(), (this.shadowCircleSize.getHeight() / 2.0f) + this.coordinate.getY(), this.shadowCirclePaint);
        canvas.drawPath(this.standPath, this.standShadowPaint);
        canvas.drawPath(this.path, this.paint);
        canvas.drawPath(this.standPath, this.standPaint);
        if (image != null) {
            float height2 = image.getHeight() / image.getWidth();
            if (height2 < this.billboardParameters.getHeight() / this.billboardParameters.getWidth()) {
                float imageMargins = this.billboardParameters.getImageMargins() + (this.coordinate.getX() - (this.billboardParameters.getWidth() / 2.0f));
                float width2 = ((this.billboardParameters.getWidth() / 2.0f) + this.coordinate.getX()) - this.billboardParameters.getImageMargins();
                float f2 = ((width2 - imageMargins) * height2) / 2.0f;
                this.imageRect.set(imageMargins, ((this.coordinate.getY() - this.billboardParameters.getBottomStandHeight()) - (this.billboardParameters.getHeight() / 2.0f)) - f2, width2, ((this.coordinate.getY() - this.billboardParameters.getBottomStandHeight()) - (this.billboardParameters.getHeight() / 2.0f)) + f2);
            } else {
                float y2 = (this.coordinate.getY() - this.billboardParameters.getBottomStandHeight()) - this.billboardParameters.getImageMargins();
                float imageMargins2 = this.billboardParameters.getImageMargins() + ((this.coordinate.getY() - this.billboardParameters.getBottomStandHeight()) - this.billboardParameters.getHeight());
                float f3 = ((y2 - imageMargins2) / height2) / 2.0f;
                this.imageRect.set(this.coordinate.getX() - f3, imageMargins2, this.coordinate.getX() + f3, y2);
            }
            canvas.drawBitmap(image, (Rect) null, this.imageRect, (Paint) null);
            Bitmap bitmap = this.imageOverlay;
            if (bitmap != null) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) this.billboardParameters.getWidth(), (int) this.billboardParameters.getHeight(), Bitmap.Config.ARGB_8888);
                Intrinsics.g(bitmapCreateBitmap, "createBitmap(...)");
                Canvas canvas2 = new Canvas(bitmapCreateBitmap);
                Paint paint = new Paint();
                Rect rect = new Rect(0, 0, (int) this.billboardParameters.getWidth(), (int) this.billboardParameters.getHeight());
                RectF rectF = new RectF(rect);
                paint.setAntiAlias(true);
                canvas2.drawARGB(0, 0, 0, 0);
                canvas2.drawRoundRect(rectF, 10.0f, 10.0f, paint);
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                canvas2.drawBitmap(bitmap, rect, rect, paint);
                canvas.drawBitmap(bitmapCreateBitmap, x, y - ((int) this.billboardParameters.getHeight()), new Paint());
            }
        }
    }

    @Override // me.oriient.ui.contentview.models.Content
    @NotNull
    /* renamed from: getAnchorPoint, reason: from getter */
    public PixelCoordinate getCoordinate() {
        return this.coordinate;
    }

    @Override // me.oriient.ui.contentview.models.Content
    public boolean isClickedOn(@NotNull PixelCoordinate coordinate, @NotNull PixelMatrix transformMatrix) {
        Intrinsics.h(coordinate, "coordinate");
        Intrinsics.h(transformMatrix, "transformMatrix");
        ExtensionsKt.bounds(this.path, this.clickRect);
        return this.clickRect.contains(coordinate.getX(), coordinate.getY());
    }

    @Override // me.oriient.ui.contentview.models.Content
    /* renamed from: move-oaYw5vM, reason: not valid java name */
    public void mo511moveoaYw5vM(float dx, float dy) {
        this.coordinate.m554offsetoaYw5vM(dx, dy);
    }

    @NotNull
    public String toString() {
        return "BillboardContent(coordinate=" + this.coordinate + ", imageOverlay=" + this.imageOverlay + ", billboardParameters=" + this.billboardParameters + ", paint=" + this.paint + ", standPaint=" + this.standPaint + ", standShadowPaint=" + this.standShadowPaint + ", shadowCirclePaint=" + this.shadowCirclePaint + ", shadowCircleSize=" + this.shadowCircleSize + ", shadowColor=" + this.shadowColor + ", path=" + this.path + ", standPath=" + this.standPath + ", imageRect=" + this.imageRect + ", clickRect=" + this.clickRect + ", _topLeft=" + this._topLeft + ", _bottomRight=" + this._bottomRight + ')';
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillboardContent(@NotNull ContentId customContentId, @NotNull PixelCoordinate coordinate, @Nullable String str, @Nullable Bitmap bitmap, @NotNull BillboardParameters billboardParameters, @NotNull Function1<? super DrawingOptionsImpl, Unit> configBlock) {
        super(customContentId, str, configBlock);
        Intrinsics.h(customContentId, "customContentId");
        Intrinsics.h(coordinate, "coordinate");
        Intrinsics.h(billboardParameters, "billboardParameters");
        Intrinsics.h(configBlock, "configBlock");
        this.coordinate = coordinate;
        this.imageOverlay = bitmap;
        this.billboardParameters = billboardParameters;
        Paint paint = new Paint();
        this.paint = paint;
        Paint paint2 = new Paint();
        this.standPaint = paint2;
        Paint paint3 = new Paint();
        this.standShadowPaint = paint3;
        Paint paint4 = new Paint();
        this.shadowCirclePaint = paint4;
        this.shadowCircleSize = new PixelSize(ExtensionsKt.getPx(18), ExtensionsKt.getPx(5), null);
        int color = Color.parseColor("#80424242");
        this.shadowColor = color;
        this.path = new Path();
        this.standPath = new Path();
        this.imageRect = new RectF();
        this.clickRect = new RectF();
        this._topLeft = new PixelCoordinate();
        this._bottomRight = new PixelCoordinate();
        billboardParameters.getColor().applyToPaint(paint);
        paint.setDither(true);
        paint.setPathEffect(new CornerPathEffect(10.0f));
        paint.setAntiAlias(true);
        paint.setShadowLayer(5.0f, 2.0f, 2.0f, color);
        billboardParameters.getColor().applyToPaint(paint2);
        paint2.setAntiAlias(true);
        paint3.setColor(0);
        paint3.setAntiAlias(true);
        paint3.setShadowLayer(2.0f, 2.0f, 2.0f, color);
        paint4.setColor(0);
        paint4.setAntiAlias(true);
        paint4.setShadowLayer(2.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, color);
    }

    public /* synthetic */ BillboardContent(PixelCoordinate pixelCoordinate, String str, Bitmap bitmap, BillboardParameters billboardParameters, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(pixelCoordinate, str, (i & 4) != 0 ? null : bitmap, (i & 8) != 0 ? new BillboardParameters(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, 127, null) : billboardParameters, (i & 16) != 0 ? b.f26596a : function1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BillboardContent(@NotNull PixelCoordinate coordinate, @Nullable String str, @Nullable Bitmap bitmap, @NotNull BillboardParameters billboardParameters, @NotNull Function1<? super DrawingOptionsImpl, Unit> configBlock) {
        this(ContentId.INSTANCE.getRandom(), coordinate, str, bitmap, billboardParameters, configBlock);
        Intrinsics.h(coordinate, "coordinate");
        Intrinsics.h(billboardParameters, "billboardParameters");
        Intrinsics.h(configBlock, "configBlock");
    }
}
