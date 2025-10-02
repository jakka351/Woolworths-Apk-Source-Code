package me.oriient.ui.contentview.models;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import androidx.annotation.Keep;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import me.oriient.ui.contentview.DrawingOptions;
import me.oriient.ui.contentview.DrawingOptionsImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0001B,\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0019\b\u0002\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\b¢\u0006\u0002\u0010\tB\"\b\u0016\u0012\u0019\b\u0002\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\b¢\u0006\u0002\u0010\nB2\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0019\b\u0002\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\b¢\u0006\u0002\u0010\rJ!\u00101\u001a\u00020\u00072\u0019\b\u0002\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\bJ\u0013\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u00010\u0000H\u0096\u0002J\"\u00105\u001a\u00020\u00072\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u00020*2\b\u00109\u001a\u0004\u0018\u00010:H&J\u0018\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020\u000f2\u0006\u00108\u001a\u00020*H\u0016J\"\u0010>\u001a\u00020\u00072\u0006\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020@H\u0016ø\u0001\u0000¢\u0006\u0004\bB\u0010CJ\u000e\u0010D\u001a\u00020\u00072\u0006\u0010-\u001a\u00020.R \u0010\u000e\u001a\u00020\u000fX\u0080\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u0006X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u0013R\u0016\u0010#\u001a\u0004\u0018\u00010\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u0019R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0014\u0010)\u001a\u00020*X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0011\u0010-\u001a\u00020.8F¢\u0006\u0006\u001a\u0004\b/\u00100\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006E"}, d2 = {"Lme/oriient/ui/contentview/models/Content;", "", "imageIdentifier", "", "configBlock", "Lkotlin/Function1;", "Lme/oriient/ui/contentview/DrawingOptionsImpl;", "", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "(Lkotlin/jvm/functions/Function1;)V", "contentId", "Lme/oriient/ui/contentview/models/ContentId;", "(Lme/oriient/ui/contentview/models/ContentId;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "_anchorPoint", "Lme/oriient/ui/contentview/models/PixelCoordinate;", "get_anchorPoint$ui_content_view_publishRelease$annotations", "()V", "get_anchorPoint$ui_content_view_publishRelease", "()Lme/oriient/ui/contentview/models/PixelCoordinate;", "set_anchorPoint$ui_content_view_publishRelease", "(Lme/oriient/ui/contentview/models/PixelCoordinate;)V", "_bounds", "Lme/oriient/ui/contentview/models/PixelRect;", "get_bounds$ui_content_view_publishRelease", "()Lme/oriient/ui/contentview/models/PixelRect;", "set_bounds$ui_content_view_publishRelease", "(Lme/oriient/ui/contentview/models/PixelRect;)V", "_options", "get_options$ui_content_view_publishRelease", "()Lme/oriient/ui/contentview/DrawingOptionsImpl;", "set_options$ui_content_view_publishRelease", "(Lme/oriient/ui/contentview/DrawingOptionsImpl;)V", "anchorPoint", "getAnchorPoint", "bounds", "getBounds", "getContentId", "()Lme/oriient/ui/contentview/models/ContentId;", "getImageIdentifier", "()Ljava/lang/String;", "matrix", "Lme/oriient/ui/contentview/models/PixelMatrix;", "getMatrix$ui_content_view_publishRelease", "()Lme/oriient/ui/contentview/models/PixelMatrix;", "options", "Lme/oriient/ui/contentview/DrawingOptions;", "getOptions", "()Lme/oriient/ui/contentview/DrawingOptions;", "applyOptions", "compareTo", "", "other", "draw", "canvas", "Landroid/graphics/Canvas;", "transformMatrix", "image", "Landroid/graphics/Bitmap;", "isClickedOn", "", "coordinate", "move", "dx", "Lme/oriient/ui/contentview/models/Pixel;", "dy", "move-oaYw5vM", "(FF)V", "setOptions", "ui-content-view_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class Content implements Comparable<Content> {

    @NotNull
    private PixelCoordinate _anchorPoint;

    @Nullable
    private PixelRect _bounds;

    @NotNull
    private DrawingOptionsImpl _options;

    @NotNull
    private final ContentId contentId;

    @Nullable
    private final String imageIdentifier;

    @NotNull
    private final PixelMatrix matrix;

    public static final class a extends Lambda implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f26619a = new a();

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
        public static final b f26620a = new b();

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

    public static final class c extends Lambda implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final c f26621a = new c();

        public c() {
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

    public static final class d extends Lambda implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final d f26622a = new d();

        public d() {
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

    public Content(@NotNull ContentId contentId, @Nullable String str, @NotNull Function1<? super DrawingOptionsImpl, Unit> configBlock) {
        Intrinsics.h(contentId, "contentId");
        Intrinsics.h(configBlock, "configBlock");
        this.contentId = contentId;
        this.imageIdentifier = str;
        this._anchorPoint = new PixelCoordinate();
        this._options = new DrawingOptionsImpl(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, false, false, false, false, 511, null);
        this.matrix = new PixelMatrix();
        configBlock.invoke(this._options);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void applyOptions$default(Content content, Function1 function1, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: applyOptions");
        }
        if ((i & 1) != 0) {
            function1 = d.f26622a;
        }
        content.applyOptions(function1);
    }

    public static /* synthetic */ void get_anchorPoint$ui_content_view_publishRelease$annotations() {
    }

    public final void applyOptions(@NotNull Function1<? super DrawingOptionsImpl, Unit> configBlock) {
        Intrinsics.h(configBlock, "configBlock");
        configBlock.invoke(this._options);
    }

    public abstract void draw(@NotNull Canvas canvas, @NotNull PixelMatrix transformMatrix, @Nullable Bitmap image);

    @NotNull
    /* renamed from: getAnchorPoint, reason: from getter */
    public PixelCoordinate get_anchorPoint() {
        return this._anchorPoint;
    }

    @Nullable
    /* renamed from: getBounds, reason: from getter */
    public PixelRect get_bounds() {
        return this._bounds;
    }

    @NotNull
    public final ContentId getContentId() {
        return this.contentId;
    }

    @Nullable
    public final String getImageIdentifier() {
        return this.imageIdentifier;
    }

    @NotNull
    /* renamed from: getMatrix$ui_content_view_publishRelease, reason: from getter */
    public final PixelMatrix getMatrix() {
        return this.matrix;
    }

    @NotNull
    public final DrawingOptions getOptions() {
        return this._options;
    }

    @NotNull
    public final PixelCoordinate get_anchorPoint$ui_content_view_publishRelease() {
        return this._anchorPoint;
    }

    @Nullable
    public final PixelRect get_bounds$ui_content_view_publishRelease() {
        return this._bounds;
    }

    @NotNull
    /* renamed from: get_options$ui_content_view_publishRelease, reason: from getter */
    public final DrawingOptionsImpl get_options() {
        return this._options;
    }

    public boolean isClickedOn(@NotNull PixelCoordinate coordinate, @NotNull PixelMatrix transformMatrix) {
        Intrinsics.h(coordinate, "coordinate");
        Intrinsics.h(transformMatrix, "transformMatrix");
        return false;
    }

    /* renamed from: move-oaYw5vM */
    public void mo511moveoaYw5vM(float dx, float dy) {
    }

    public final void setOptions(@NotNull DrawingOptions options) {
        Intrinsics.h(options, "options");
        this._options = new DrawingOptionsImpl(options);
    }

    public final void set_anchorPoint$ui_content_view_publishRelease(@NotNull PixelCoordinate pixelCoordinate) {
        Intrinsics.h(pixelCoordinate, "<set-?>");
        this._anchorPoint = pixelCoordinate;
    }

    public final void set_bounds$ui_content_view_publishRelease(@Nullable PixelRect pixelRect) {
        this._bounds = pixelRect;
    }

    public final void set_options$ui_content_view_publishRelease(@NotNull DrawingOptionsImpl drawingOptionsImpl) {
        Intrinsics.h(drawingOptionsImpl, "<set-?>");
        this._options = drawingOptionsImpl;
    }

    @Override // java.lang.Comparable
    public int compareTo(@Nullable Content other) {
        if (other == null) {
            return 1;
        }
        return Intrinsics.j(getOptions().getZOrder(), other.getOptions().getZOrder());
    }

    public /* synthetic */ Content(ContentId contentId, String str, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(contentId, str, (Function1<? super DrawingOptionsImpl, Unit>) ((i & 4) != 0 ? a.f26619a : function1));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Content(@Nullable String str, @NotNull Function1<? super DrawingOptionsImpl, Unit> configBlock) {
        this(ContentId.INSTANCE.getRandom(), str, configBlock);
        Intrinsics.h(configBlock, "configBlock");
    }

    public /* synthetic */ Content(String str, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? b.f26620a : function1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Content(@NotNull Function1<? super DrawingOptionsImpl, Unit> configBlock) {
        this(null, configBlock);
        Intrinsics.h(configBlock, "configBlock");
    }

    public /* synthetic */ Content(Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? c.f26621a : function1);
    }
}
