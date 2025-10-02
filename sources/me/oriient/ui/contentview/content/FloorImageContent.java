package me.oriient.ui.contentview.content;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.Rect;
import androidx.annotation.Keep;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import me.oriient.ipssdk.api.models.IPSFloorImage;
import me.oriient.ipssdk.api.models.IPSFloorImageData;
import me.oriient.ui.contentview.DrawingOptionsImpl;
import me.oriient.ui.contentview.models.Content;
import me.oriient.ui.contentview.models.ContentId;
import me.oriient.ui.contentview.models.PixelMatrix;
import me.oriient.ui.contentview.models.PixelRect;
import me.oriient.ui.contentview.utils.ExtensionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B2\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0019\b\u0002\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n¢\u0006\u0002\u0010\u000bJ\"\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016R\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lme/oriient/ui/contentview/content/FloorImageContent;", "Lme/oriient/ui/contentview/models/Content;", "floorImageData", "Lme/oriient/ipssdk/api/models/IPSFloorImageData;", "id", "Lme/oriient/ui/contentview/models/ContentId;", "configBlock", "Lkotlin/Function1;", "Lme/oriient/ui/contentview/DrawingOptionsImpl;", "", "Lkotlin/ExtensionFunctionType;", "(Lme/oriient/ipssdk/api/models/IPSFloorImageData;Lme/oriient/ui/contentview/models/ContentId;Lkotlin/jvm/functions/Function1;)V", "bounds", "Lme/oriient/ui/contentview/models/PixelRect;", "getBounds", "()Lme/oriient/ui/contentview/models/PixelRect;", "picture", "Landroid/graphics/Picture;", "draw", "canvas", "Landroid/graphics/Canvas;", "transformMatrix", "Lme/oriient/ui/contentview/models/PixelMatrix;", "image", "Landroid/graphics/Bitmap;", "Companion", "ui-content-view_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class FloorImageContent extends Content {

    @Keep
    public static final int MAP_LAYER = -1;

    @NotNull
    private final PixelRect bounds;

    @NotNull
    private final IPSFloorImageData floorImageData;

    @Nullable
    private Picture picture;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Keep
    @NotNull
    private static final ContentId CONTENT_ID = new ContentId("me.oriient.floor.map.content.id");

    @Keep
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0010\u0010\u0007\u001a\u00020\b8\u0006X\u0087T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lme/oriient/ui/contentview/content/FloorImageContent$Companion;", "", "()V", "CONTENT_ID", "Lme/oriient/ui/contentview/models/ContentId;", "getCONTENT_ID", "()Lme/oriient/ui/contentview/models/ContentId;", "MAP_LAYER", "", "ui-content-view_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ContentId getCONTENT_ID() {
            return FloorImageContent.CONTENT_ID;
        }

        private Companion() {
        }
    }

    public static final class a extends Lambda implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f26601a = new a();

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

    public /* synthetic */ FloorImageContent(IPSFloorImageData iPSFloorImageData, ContentId contentId, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(iPSFloorImageData, (i & 2) != 0 ? CONTENT_ID : contentId, (i & 4) != 0 ? a.f26601a : function1);
    }

    @Override // me.oriient.ui.contentview.models.Content
    public void draw(@NotNull Canvas canvas, @NotNull PixelMatrix transformMatrix, @Nullable Bitmap image) {
        Picture picture;
        Intrinsics.h(canvas, "canvas");
        Intrinsics.h(transformMatrix, "transformMatrix");
        IPSFloorImage image2 = this.floorImageData.getImage();
        if (image2 instanceof IPSFloorImage.IPSFloorBitmapImage) {
            canvas.drawBitmap(((IPSFloorImage.IPSFloorBitmapImage) image2).getImage(), (Rect) null, getBounds().getRectF(), (Paint) null);
        } else {
            if (!(image2 instanceof IPSFloorImage.IPSFloorSvgImage) || (picture = this.picture) == null) {
                return;
            }
            canvas.drawPicture(picture);
        }
    }

    @Override // me.oriient.ui.contentview.models.Content
    @NotNull
    public PixelRect getBounds() {
        return this.bounds;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FloorImageContent(@NotNull IPSFloorImageData floorImageData, @NotNull ContentId id, @NotNull Function1<? super DrawingOptionsImpl, Unit> configBlock) {
        PixelRect pixelRect;
        super(id, (String) null, configBlock);
        Intrinsics.h(floorImageData, "floorImageData");
        Intrinsics.h(id, "id");
        Intrinsics.h(configBlock, "configBlock");
        Picture pictureRenderToPicture = null;
        this.floorImageData = floorImageData;
        IPSFloorImage image = floorImageData.getImage();
        if (image instanceof IPSFloorImage.IPSFloorBitmapImage) {
            IPSFloorImage.IPSFloorBitmapImage iPSFloorBitmapImage = (IPSFloorImage.IPSFloorBitmapImage) image;
            pixelRect = new PixelRect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, ExtensionsKt.getPx(iPSFloorBitmapImage.getImage().getWidth()), ExtensionsKt.getPx(iPSFloorBitmapImage.getImage().getHeight()), 3, null);
        } else {
            if (!(image instanceof IPSFloorImage.IPSFloorSvgImage)) {
                throw new NoWhenBranchMatchedException();
            }
            IPSFloorImage.IPSFloorSvgImage iPSFloorSvgImage = (IPSFloorImage.IPSFloorSvgImage) image;
            pixelRect = new PixelRect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, ExtensionsKt.getPx(iPSFloorSvgImage.getImage().getWidth()), ExtensionsKt.getPx(iPSFloorSvgImage.getImage().getHeight()), 3, null);
        }
        this.bounds = pixelRect;
        IPSFloorImage image2 = floorImageData.getImage();
        if (!(image2 instanceof IPSFloorImage.IPSFloorBitmapImage)) {
            if (image2 instanceof IPSFloorImage.IPSFloorSvgImage) {
                pictureRenderToPicture = ((IPSFloorImage.IPSFloorSvgImage) image2).getImage().renderToPicture();
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        this.picture = pictureRenderToPicture;
    }
}
