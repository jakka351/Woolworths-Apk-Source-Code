package me.oriient.ui.contentview.content;

import android.graphics.Bitmap;
import android.graphics.Canvas;
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
import me.oriient.ui.contentview.models.ContentId;
import me.oriient.ui.contentview.models.PixelCoordinate;
import me.oriient.ui.contentview.models.PixelMatrix;
import me.oriient.ui.contentview.models.PixelRect;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Deprecated
@Keep
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B*\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0019\b\u0002\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\b¢\u0006\u0002\u0010\tB0\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0019\b\u0002\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\b¢\u0006\u0002\u0010\fJ\"\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lme/oriient/ui/contentview/content/EmptyContent;", "Lme/oriient/ui/contentview/models/Content;", "area", "Lme/oriient/ui/contentview/models/PixelRect;", "configBlock", "Lkotlin/Function1;", "Lme/oriient/ui/contentview/DrawingOptionsImpl;", "", "Lkotlin/ExtensionFunctionType;", "(Lme/oriient/ui/contentview/models/PixelRect;Lkotlin/jvm/functions/Function1;)V", "customContentId", "Lme/oriient/ui/contentview/models/ContentId;", "(Lme/oriient/ui/contentview/models/ContentId;Lme/oriient/ui/contentview/models/PixelRect;Lkotlin/jvm/functions/Function1;)V", "draw", "canvas", "Landroid/graphics/Canvas;", "transformMatrix", "Lme/oriient/ui/contentview/models/PixelMatrix;", "image", "Landroid/graphics/Bitmap;", "isClickedOn", "", "coordinate", "Lme/oriient/ui/contentview/models/PixelCoordinate;", "ui-content-view_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public class EmptyContent extends Content {

    @NotNull
    private final PixelRect area;

    public static final class a extends Lambda implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f26599a = new a();

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
        public static final b f26600a = new b();

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

    public /* synthetic */ EmptyContent(ContentId contentId, PixelRect pixelRect, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(contentId, pixelRect, (i & 4) != 0 ? a.f26599a : function1);
    }

    @Override // me.oriient.ui.contentview.models.Content
    public void draw(@NotNull Canvas canvas, @NotNull PixelMatrix transformMatrix, @Nullable Bitmap image) {
        Intrinsics.h(canvas, "canvas");
        Intrinsics.h(transformMatrix, "transformMatrix");
    }

    @Override // me.oriient.ui.contentview.models.Content
    public boolean isClickedOn(@NotNull PixelCoordinate coordinate, @NotNull PixelMatrix transformMatrix) {
        Intrinsics.h(coordinate, "coordinate");
        Intrinsics.h(transformMatrix, "transformMatrix");
        return this.area.contains(coordinate);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmptyContent(@NotNull ContentId customContentId, @NotNull PixelRect area, @NotNull Function1<? super DrawingOptionsImpl, Unit> configBlock) {
        super(customContentId, (String) null, configBlock);
        Intrinsics.h(customContentId, "customContentId");
        Intrinsics.h(area, "area");
        Intrinsics.h(configBlock, "configBlock");
        this.area = area;
    }

    public /* synthetic */ EmptyContent(PixelRect pixelRect, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(pixelRect, (i & 2) != 0 ? b.f26600a : function1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EmptyContent(@NotNull PixelRect area, @NotNull Function1<? super DrawingOptionsImpl, Unit> configBlock) {
        this(ContentId.INSTANCE.getRandom(), area, configBlock);
        Intrinsics.h(area, "area");
        Intrinsics.h(configBlock, "configBlock");
    }
}
