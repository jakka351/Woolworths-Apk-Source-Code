package me.oriient.ui.contentview.content;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
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
import me.oriient.ui.contentview.models.ContentId;
import me.oriient.ui.contentview.models.PixelCoordinate;
import me.oriient.ui.contentview.models.PixelMatrix;
import me.oriient.ui.contentview.models.PixelRect;
import me.oriient.ui.contentview.utils.ExtensionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001BJ\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u0019\b\u0002\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000e¢\u0006\u0002\u0010\u000fBP\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u0019\b\u0002\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000e¢\u0006\u0002\u0010\u0012J\"\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u0018\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\"\u0010%\u001a\u00020\r2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020'H\u0016ø\u0001\u0000¢\u0006\u0004\b)\u0010*J\u0018\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020!2\u0006\u0010\u0004\u001a\u00020\u0005H\u0002J\b\u0010.\u001a\u00020\u0003H\u0016R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006/"}, d2 = {"Lme/oriient/ui/contentview/content/ImageContent;", "Lme/oriient/ui/contentview/models/Content;", "imageIdentifier", "", "bounds", "Lme/oriient/ui/contentview/models/PixelRect;", "anchorPoint", "Lme/oriient/ui/contentview/models/PixelCoordinate;", "scaleType", "Lme/oriient/ui/contentview/content/ScaleType;", "configBlock", "Lkotlin/Function1;", "Lme/oriient/ui/contentview/DrawingOptionsImpl;", "", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/String;Lme/oriient/ui/contentview/models/PixelRect;Lme/oriient/ui/contentview/models/PixelCoordinate;Lme/oriient/ui/contentview/content/ScaleType;Lkotlin/jvm/functions/Function1;)V", "customContentId", "Lme/oriient/ui/contentview/models/ContentId;", "(Lme/oriient/ui/contentview/models/ContentId;Ljava/lang/String;Lme/oriient/ui/contentview/models/PixelRect;Lme/oriient/ui/contentview/models/PixelCoordinate;Lme/oriient/ui/contentview/content/ScaleType;Lkotlin/jvm/functions/Function1;)V", "getAnchorPoint", "()Lme/oriient/ui/contentview/models/PixelCoordinate;", "getBounds", "()Lme/oriient/ui/contentview/models/PixelRect;", "setBounds", "(Lme/oriient/ui/contentview/models/PixelRect;)V", "paint", "Landroid/graphics/Paint;", "draw", "canvas", "Landroid/graphics/Canvas;", "transformMatrix", "Lme/oriient/ui/contentview/models/PixelMatrix;", "image", "Landroid/graphics/Bitmap;", "isClickedOn", "", "coordinate", "move", "dx", "Lme/oriient/ui/contentview/models/Pixel;", "dy", "move-oaYw5vM", "(FF)V", "performScaleToFit", "Landroid/graphics/RectF;", "bitmap", "toString", "ui-content-view_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public class ImageContent extends Content {

    @NotNull
    private final PixelCoordinate anchorPoint;

    @Nullable
    private PixelRect bounds;

    @NotNull
    private final Paint paint;

    @NotNull
    private final ScaleType scaleType;

    public static final class a extends Lambda implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f26602a = new a();

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
        public static final b f26603a = new b();

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

    public /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ScaleType.values().length];
            try {
                iArr[ScaleType.SCALE_TO_FIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ScaleType.NO_SCALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ ImageContent(ContentId contentId, String str, PixelRect pixelRect, PixelCoordinate pixelCoordinate, ScaleType scaleType, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(contentId, str, (i & 4) != 0 ? null : pixelRect, (i & 8) != 0 ? new PixelCoordinate() : pixelCoordinate, (i & 16) != 0 ? ScaleType.NO_SCALE : scaleType, (i & 32) != 0 ? a.f26602a : function1);
    }

    private final RectF performScaleToFit(Bitmap bitmap, PixelRect bounds) {
        boolean z = bitmap.getWidth() > bitmap.getHeight();
        float width = bounds.getWidth() / bitmap.getWidth();
        float height = bounds.getHeight() / bitmap.getHeight();
        float f = z ? width : height;
        float width2 = bitmap.getWidth() * f;
        float height2 = bitmap.getHeight() * f;
        RectF rectF = new RectF(bounds.getLeft(), bounds.getTop(), bounds.getLeft() + width2, bounds.getTop() + height2);
        if (width == height) {
            return rectF;
        }
        float f2 = 2;
        rectF.offset((bounds.getWidth() - width2) / f2, (bounds.getHeight() - height2) / f2);
        return rectF;
    }

    @Override // me.oriient.ui.contentview.models.Content
    public void draw(@NotNull Canvas canvas, @NotNull PixelMatrix transformMatrix, @Nullable Bitmap image) {
        RectF rectFPerformScaleToFit;
        Intrinsics.h(canvas, "canvas");
        Intrinsics.h(transformMatrix, "transformMatrix");
        if (image != null) {
            PixelRect bounds = getBounds();
            if (bounds == null) {
                PixelRect pixelRect = new PixelRect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, ExtensionsKt.getPx(image.getWidth()), ExtensionsKt.getPx(image.getHeight()), 3, null);
                setBounds(pixelRect);
                bounds = pixelRect;
            }
            int i = c.$EnumSwitchMapping$0[this.scaleType.ordinal()];
            if (i == 1) {
                rectFPerformScaleToFit = performScaleToFit(image, bounds);
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                rectFPerformScaleToFit = bounds.getRectF();
            }
            canvas.drawBitmap(image, (Rect) null, rectFPerformScaleToFit, (Paint) null);
        }
    }

    @Override // me.oriient.ui.contentview.models.Content
    @NotNull
    public PixelCoordinate getAnchorPoint() {
        return this.anchorPoint;
    }

    @Override // me.oriient.ui.contentview.models.Content
    @Nullable
    public PixelRect getBounds() {
        return this.bounds;
    }

    @Override // me.oriient.ui.contentview.models.Content
    public boolean isClickedOn(@NotNull PixelCoordinate coordinate, @NotNull PixelMatrix transformMatrix) {
        Intrinsics.h(coordinate, "coordinate");
        Intrinsics.h(transformMatrix, "transformMatrix");
        PixelRect bounds = getBounds();
        if (bounds != null) {
            return bounds.contains(coordinate);
        }
        return false;
    }

    @Override // me.oriient.ui.contentview.models.Content
    /* renamed from: move-oaYw5vM */
    public void mo511moveoaYw5vM(float dx, float dy) {
        PixelRect bounds = getBounds();
        if (bounds != null) {
            bounds.m584moveoaYw5vM(dx, dy);
        }
        getAnchorPoint().m554offsetoaYw5vM(dx, dy);
    }

    public void setBounds(@Nullable PixelRect pixelRect) {
        this.bounds = pixelRect;
    }

    @NotNull
    public String toString() {
        return "ImageContent(bounds=" + getBounds() + ", anchorPoint=" + getAnchorPoint() + ')';
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageContent(@NotNull ContentId customContentId, @NotNull String imageIdentifier, @Nullable PixelRect pixelRect, @NotNull PixelCoordinate anchorPoint, @NotNull ScaleType scaleType, @NotNull Function1<? super DrawingOptionsImpl, Unit> configBlock) {
        super(customContentId, imageIdentifier, configBlock);
        Intrinsics.h(customContentId, "customContentId");
        Intrinsics.h(imageIdentifier, "imageIdentifier");
        Intrinsics.h(anchorPoint, "anchorPoint");
        Intrinsics.h(scaleType, "scaleType");
        Intrinsics.h(configBlock, "configBlock");
        this.bounds = pixelRect;
        this.anchorPoint = anchorPoint;
        this.scaleType = scaleType;
        Paint paint = new Paint();
        this.paint = paint;
        paint.setAntiAlias(true);
    }

    public /* synthetic */ ImageContent(String str, PixelRect pixelRect, PixelCoordinate pixelCoordinate, ScaleType scaleType, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : pixelRect, (i & 4) != 0 ? new PixelCoordinate() : pixelCoordinate, (i & 8) != 0 ? ScaleType.NO_SCALE : scaleType, (i & 16) != 0 ? b.f26603a : function1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ImageContent(@NotNull String imageIdentifier, @Nullable PixelRect pixelRect, @NotNull PixelCoordinate anchorPoint, @NotNull ScaleType scaleType, @NotNull Function1<? super DrawingOptionsImpl, Unit> configBlock) {
        this(ContentId.INSTANCE.getRandom(), imageIdentifier, pixelRect, anchorPoint, scaleType, configBlock);
        Intrinsics.h(imageIdentifier, "imageIdentifier");
        Intrinsics.h(anchorPoint, "anchorPoint");
        Intrinsics.h(scaleType, "scaleType");
        Intrinsics.h(configBlock, "configBlock");
    }
}
