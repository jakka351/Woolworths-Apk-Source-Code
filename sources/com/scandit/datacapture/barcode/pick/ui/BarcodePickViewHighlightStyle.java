package com.scandit.datacapture.barcode.pick.ui;

import android.graphics.Bitmap;
import androidx.annotation.DrawableRes;
import com.scandit.datacapture.barcode.V3;
import com.scandit.datacapture.barcode.W3;
import com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickStatusIconSettings;
import com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewHighlightStyle;
import com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewHighlightStyleCustomView;
import com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewHighlightStyleDot;
import com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewHighlightStyleDotWithIcons;
import com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewHighlightStyleRectangular;
import com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewHighlightStyleRectangularWithIcons;
import com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.BarcodePickHighlightStyleIconsHolder;
import com.scandit.datacapture.barcode.pick.capture.BarcodePickState;
import com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializer;
import com.scandit.datacapture.core.ui.style.Brush;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyBaseClass;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ProxyBaseClass(NativeBarcodePickViewHighlightStyle.class)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0005\u0006\u0007\b\t\nJ\b\u0010\u0002\u001a\u00020\u0003H'J\b\u0010\u0004\u001a\u00020\u0005H&\u0082\u0001\u0005\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewHighlightStyle;", "", "_highlightStyleImpl", "Lcom/scandit/datacapture/barcode/internal/module/pick/ui/NativeBarcodePickViewHighlightStyle;", "toJson", "", "CustomView", "Dot", "DotWithIcons", "Rectangular", "RectangularWithIcons", "Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewHighlightStyle$CustomView;", "Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewHighlightStyle$Dot;", "Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewHighlightStyle$DotWithIcons;", "Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewHighlightStyle$Rectangular;", "Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewHighlightStyle$RectangularWithIcons;", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface BarcodePickViewHighlightStyle {

    @Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0000\u0012\u0006\u00101\u001a\u00020\u0005\u0012\b\b\u0002\u00102\u001a\u00020 ¢\u0006\u0004\b3\u00104B\t\b\u0016¢\u0006\u0004\b3\u00105B\u0011\b\u0016\u0012\u0006\u0010)\u001a\u00020&¢\u0006\u0004\b3\u00106J\t\u0010\u0004\u001a\u00020\u0003H\u0097\u0001J\t\u0010\u0006\u001a\u00020\u0005H\u0097\u0001J\u0011\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0097\u0001J\u0013\u0010\u000b\u001a\u0004\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\u0007H\u0097\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0097\u0001J\u001b\u0010\u000f\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\u0007H\u0097\u0001J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\u0018\u0010\u0014\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\b\u001a\u00020\u0007J\u0018\u0010\u0014\u001a\u00020\r2\b\b\u0001\u0010\u0016\u001a\u00020\u00152\u0006\u0010\b\u001a\u00020\u0007J\u0018\u0010\u0017\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\b\u001a\u00020\u0007J\u0018\u0010\u0017\u001a\u00020\r2\b\b\u0001\u0010\u0016\u001a\u00020\u00152\u0006\u0010\b\u001a\u00020\u0007R$\u0010\u001f\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010%\u001a\u00020 8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b'\u0010(R$\u00100\u001a\u00020*2\u0006\u0010+\u001a\u00020*8W@WX\u0096\u000f¢\u0006\f\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/¨\u00067"}, d2 = {"Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewHighlightStyle$DotWithIcons;", "Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewHighlightStyle;", "Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewHighlightStyleDotWithIconsProxy;", "Lcom/scandit/datacapture/barcode/internal/module/pick/ui/NativeBarcodePickViewHighlightStyle;", "_highlightStyleImpl", "Lcom/scandit/datacapture/barcode/internal/module/pick/ui/NativeBarcodePickViewHighlightStyleDotWithIcons;", "_impl", "Lcom/scandit/datacapture/barcode/pick/capture/BarcodePickState;", "state", "Lcom/scandit/datacapture/core/ui/style/Brush;", "getBrushForState", "getSelectedBrushForState", "brush", "", "setBrushForState", "setSelectedBrushForState", "", "toJson", "Landroid/graphics/Bitmap;", BarcodePickDeserializer.FIELD_ICON, "setIconForState", "", "iconResource", "setSelectedIconForState", "Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewHighlightStyleAsyncProvider;", "b", "Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewHighlightStyleAsyncProvider;", "getAsyncStyleProvider", "()Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewHighlightStyleAsyncProvider;", "setAsyncStyleProvider", "(Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewHighlightStyleAsyncProvider;)V", "asyncStyleProvider", "Lcom/scandit/datacapture/barcode/internal/module/pick/ui/highlightstyle/BarcodePickHighlightStyleIconsHolder;", "c", "Lcom/scandit/datacapture/barcode/internal/module/pick/ui/highlightstyle/BarcodePickHighlightStyleIconsHolder;", "get_iconsHolder$scandit_barcode_capture", "()Lcom/scandit/datacapture/barcode/internal/module/pick/ui/highlightstyle/BarcodePickHighlightStyleIconsHolder;", "_iconsHolder", "Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickIconStyle;", "getIconStyle", "()Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickIconStyle;", "iconStyle", "", "<set-?>", "getStyleResponseCacheEnabled", "()Z", "setStyleResponseCacheEnabled", "(Z)V", "styleResponseCacheEnabled", "impl", "iconsHolder", "<init>", "(Lcom/scandit/datacapture/barcode/internal/module/pick/ui/NativeBarcodePickViewHighlightStyleDotWithIcons;Lcom/scandit/datacapture/barcode/internal/module/pick/ui/highlightstyle/BarcodePickHighlightStyleIconsHolder;)V", "()V", "(Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickIconStyle;)V", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension
    public static final class DotWithIcons implements BarcodePickViewHighlightStyle, BarcodePickViewHighlightStyleDotWithIconsProxy {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ BarcodePickViewHighlightStyleDotWithIconsProxyAdapter f17942a;

        /* renamed from: b, reason: from kotlin metadata */
        private BarcodePickViewHighlightStyleAsyncProvider asyncStyleProvider;

        /* renamed from: c, reason: from kotlin metadata */
        private final /* synthetic */ BarcodePickHighlightStyleIconsHolder _iconsHolder;

        public DotWithIcons(@NotNull NativeBarcodePickViewHighlightStyleDotWithIcons impl, @NotNull BarcodePickHighlightStyleIconsHolder iconsHolder) {
            Intrinsics.h(impl, "impl");
            Intrinsics.h(iconsHolder, "iconsHolder");
            this.f17942a = new BarcodePickViewHighlightStyleDotWithIconsProxyAdapter(impl, null, 2, 0 == true ? 1 : 0);
            this._iconsHolder = iconsHolder;
        }

        @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyle, com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleCustomViewProxy
        @NativeImpl
        @NotNull
        /* renamed from: _highlightStyleImpl */
        public NativeBarcodePickViewHighlightStyle getC() {
            return this.f17942a.getC();
        }

        @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleDotWithIconsProxy
        @NativeImpl
        @NotNull
        /* renamed from: _impl */
        public NativeBarcodePickViewHighlightStyleDotWithIcons getF17948a() {
            return this.f17942a.getF17948a();
        }

        @Nullable
        public final BarcodePickViewHighlightStyleAsyncProvider getAsyncStyleProvider() {
            return this.asyncStyleProvider;
        }

        @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleDotWithIconsProxy
        @ProxyFunction(nativeName = "brushForState")
        @NotNull
        public Brush getBrushForState(@NotNull BarcodePickState state) {
            Intrinsics.h(state, "state");
            return this.f17942a.getBrushForState(state);
        }

        @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleDotWithIconsProxy
        @ProxyFunction(property = "iconStyle")
        @NotNull
        public BarcodePickIconStyle getIconStyle() {
            return this.f17942a.getIconStyle();
        }

        @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleDotWithIconsProxy
        @ProxyFunction(nativeName = "selectedBrushForState")
        @Nullable
        public Brush getSelectedBrushForState(@NotNull BarcodePickState state) {
            Intrinsics.h(state, "state");
            return this.f17942a.getSelectedBrushForState(state);
        }

        @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleDotWithIconsProxy
        @ProxyFunction(nativeName = "getStyleResponseCacheEnabled", property = "styleResponseCacheEnabled")
        public boolean getStyleResponseCacheEnabled() {
            return this.f17942a.getStyleResponseCacheEnabled();
        }

        @NotNull
        /* renamed from: get_iconsHolder$scandit_barcode_capture, reason: from getter */
        public final BarcodePickHighlightStyleIconsHolder get_iconsHolder() {
            return this._iconsHolder;
        }

        public final void setAsyncStyleProvider(@Nullable BarcodePickViewHighlightStyleAsyncProvider barcodePickViewHighlightStyleAsyncProvider) {
            this.asyncStyleProvider = barcodePickViewHighlightStyleAsyncProvider;
        }

        @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleDotWithIconsProxy
        @ProxyFunction(nativeName = "setBrushForState")
        public void setBrushForState(@NotNull Brush brush, @NotNull BarcodePickState state) {
            Intrinsics.h(brush, "brush");
            Intrinsics.h(state, "state");
            this.f17942a.setBrushForState(brush, state);
        }

        public final void setIconForState(@Nullable Bitmap icon, @NotNull BarcodePickState state) {
            Intrinsics.h(state, "state");
            this._iconsHolder.b(icon, state);
        }

        @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleDotWithIconsProxy
        @ProxyFunction(nativeName = "setSelectedBrushForState")
        public void setSelectedBrushForState(@Nullable Brush brush, @NotNull BarcodePickState state) {
            Intrinsics.h(state, "state");
            this.f17942a.setSelectedBrushForState(brush, state);
        }

        public final void setSelectedIconForState(@Nullable Bitmap icon, @NotNull BarcodePickState state) {
            Intrinsics.h(state, "state");
            this._iconsHolder.a(icon, state);
        }

        @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleDotWithIconsProxy
        @ProxyFunction(nativeName = "setStyleResponseCacheEnabled", property = "styleResponseCacheEnabled")
        public void setStyleResponseCacheEnabled(boolean z) {
            this.f17942a.setStyleResponseCacheEnabled(z);
        }

        @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyle
        @NotNull
        public String toJson() {
            return V3.a(this, getF17948a().toJson());
        }

        public final void setIconForState(@DrawableRes int iconResource, @NotNull BarcodePickState state) {
            Intrinsics.h(state, "state");
            this._iconsHolder.b(iconResource, state);
        }

        public final void setSelectedIconForState(@DrawableRes int iconResource, @NotNull BarcodePickState state) {
            Intrinsics.h(state, "state");
            this._iconsHolder.a(iconResource, state);
        }

        public /* synthetic */ DotWithIcons(NativeBarcodePickViewHighlightStyleDotWithIcons nativeBarcodePickViewHighlightStyleDotWithIcons, BarcodePickHighlightStyleIconsHolder barcodePickHighlightStyleIconsHolder, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(nativeBarcodePickViewHighlightStyleDotWithIcons, (i & 2) != 0 ? W3.a() : barcodePickHighlightStyleIconsHolder);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public DotWithIcons() {
            NativeBarcodePickViewHighlightStyleDotWithIcons nativeBarcodePickViewHighlightStyleDotWithIconsCreate = NativeBarcodePickViewHighlightStyleDotWithIcons.create();
            Intrinsics.g(nativeBarcodePickViewHighlightStyleDotWithIconsCreate, "create()");
            this(nativeBarcodePickViewHighlightStyleDotWithIconsCreate, null, 2, 0 == true ? 1 : 0);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public DotWithIcons(@NotNull BarcodePickIconStyle iconStyle) {
            Intrinsics.h(iconStyle, "iconStyle");
            NativeBarcodePickViewHighlightStyleDotWithIcons nativeBarcodePickViewHighlightStyleDotWithIconsCreate = NativeBarcodePickViewHighlightStyleDotWithIcons.create();
            nativeBarcodePickViewHighlightStyleDotWithIconsCreate.setIconStyle(iconStyle._toNativeEnum$scandit_barcode_capture());
            this(nativeBarcodePickViewHighlightStyleDotWithIconsCreate, null, 2, 0 == true ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0000\u0012\u0006\u0010@\u001a\u00020\u0005\u0012\b\b\u0002\u0010A\u001a\u00020 ¢\u0006\u0004\bB\u0010CB\t\b\u0016¢\u0006\u0004\bB\u0010DB\u0011\b\u0016\u0012\u0006\u0010)\u001a\u00020&¢\u0006\u0004\bB\u0010EJ\t\u0010\u0004\u001a\u00020\u0003H\u0097\u0001J\t\u0010\u0006\u001a\u00020\u0005H\u0097\u0001J\u0011\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0097\u0001J\u0013\u0010\u000b\u001a\u0004\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\u0007H\u0097\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0097\u0001J\u001b\u0010\u000f\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\u0007H\u0097\u0001J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\u0018\u0010\u0014\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\b\u001a\u00020\u0007J\u0018\u0010\u0014\u001a\u00020\r2\b\b\u0001\u0010\u0016\u001a\u00020\u00152\u0006\u0010\b\u001a\u00020\u0007J\u0018\u0010\u0017\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\b\u001a\u00020\u0007J\u0018\u0010\u0017\u001a\u00020\r2\b\b\u0001\u0010\u0016\u001a\u00020\u00152\u0006\u0010\b\u001a\u00020\u0007R$\u0010\u001f\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010%\u001a\u00020 8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b'\u0010(R$\u0010/\u001a\u00020\u00152\u0006\u0010*\u001a\u00020\u00158W@WX\u0096\u000f¢\u0006\f\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R$\u00102\u001a\u00020\u00152\u0006\u0010*\u001a\u00020\u00158W@WX\u0096\u000f¢\u0006\f\u001a\u0004\b0\u0010,\"\u0004\b1\u0010.R$\u00108\u001a\u0002032\u0006\u0010*\u001a\u0002038W@WX\u0096\u000f¢\u0006\f\u001a\u0004\b4\u00105\"\u0004\b6\u00107R$\u0010?\u001a\u0002092\u0006\u0010:\u001a\u0002098F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>¨\u0006F"}, d2 = {"Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewHighlightStyle$RectangularWithIcons;", "Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewHighlightStyle;", "Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewHighlightStyleRectangularWithIconsProxy;", "Lcom/scandit/datacapture/barcode/internal/module/pick/ui/NativeBarcodePickViewHighlightStyle;", "_highlightStyleImpl", "Lcom/scandit/datacapture/barcode/internal/module/pick/ui/NativeBarcodePickViewHighlightStyleRectangularWithIcons;", "_impl", "Lcom/scandit/datacapture/barcode/pick/capture/BarcodePickState;", "state", "Lcom/scandit/datacapture/core/ui/style/Brush;", "getBrushForState", "getSelectedBrushForState", "brush", "", "setBrushForState", "setSelectedBrushForState", "", "toJson", "Landroid/graphics/Bitmap;", BarcodePickDeserializer.FIELD_ICON, "setIconForState", "", "iconResource", "setSelectedIconForState", "Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewHighlightStyleAsyncProvider;", "b", "Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewHighlightStyleAsyncProvider;", "getAsyncStyleProvider", "()Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewHighlightStyleAsyncProvider;", "setAsyncStyleProvider", "(Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewHighlightStyleAsyncProvider;)V", "asyncStyleProvider", "Lcom/scandit/datacapture/barcode/internal/module/pick/ui/highlightstyle/BarcodePickHighlightStyleIconsHolder;", "c", "Lcom/scandit/datacapture/barcode/internal/module/pick/ui/highlightstyle/BarcodePickHighlightStyleIconsHolder;", "get_iconsHolder$scandit_barcode_capture", "()Lcom/scandit/datacapture/barcode/internal/module/pick/ui/highlightstyle/BarcodePickHighlightStyleIconsHolder;", "_iconsHolder", "Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickIconStyle;", "getIconStyle", "()Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickIconStyle;", "iconStyle", "<set-?>", "getMinimumHighlightHeight", "()I", "setMinimumHighlightHeight", "(I)V", "minimumHighlightHeight", "getMinimumHighlightWidth", "setMinimumHighlightWidth", "minimumHighlightWidth", "", "getStyleResponseCacheEnabled", "()Z", "setStyleResponseCacheEnabled", "(Z)V", "styleResponseCacheEnabled", "Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickStatusIconSettings;", "value", "getStatusIconSettings", "()Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickStatusIconSettings;", "setStatusIconSettings", "(Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickStatusIconSettings;)V", "statusIconSettings", "impl", "iconsHolder", "<init>", "(Lcom/scandit/datacapture/barcode/internal/module/pick/ui/NativeBarcodePickViewHighlightStyleRectangularWithIcons;Lcom/scandit/datacapture/barcode/internal/module/pick/ui/highlightstyle/BarcodePickHighlightStyleIconsHolder;)V", "()V", "(Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickIconStyle;)V", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension
    public static final class RectangularWithIcons implements BarcodePickViewHighlightStyle, BarcodePickViewHighlightStyleRectangularWithIconsProxy {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ BarcodePickViewHighlightStyleRectangularWithIconsProxyAdapter f17944a;

        /* renamed from: b, reason: from kotlin metadata */
        private BarcodePickViewHighlightStyleAsyncProvider asyncStyleProvider;

        /* renamed from: c, reason: from kotlin metadata */
        private final /* synthetic */ BarcodePickHighlightStyleIconsHolder _iconsHolder;

        public RectangularWithIcons(@NotNull NativeBarcodePickViewHighlightStyleRectangularWithIcons impl, @NotNull BarcodePickHighlightStyleIconsHolder iconsHolder) {
            Intrinsics.h(impl, "impl");
            Intrinsics.h(iconsHolder, "iconsHolder");
            this.f17944a = new BarcodePickViewHighlightStyleRectangularWithIconsProxyAdapter(impl, null, 2, 0 == true ? 1 : 0);
            this._iconsHolder = iconsHolder;
        }

        @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyle, com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleCustomViewProxy
        @NativeImpl
        @NotNull
        /* renamed from: _highlightStyleImpl */
        public NativeBarcodePickViewHighlightStyle getC() {
            return this.f17944a.getC();
        }

        @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleRectangularWithIconsProxy
        @NativeImpl
        @NotNull
        /* renamed from: _impl */
        public NativeBarcodePickViewHighlightStyleRectangularWithIcons getF17950a() {
            return this.f17944a.getF17950a();
        }

        @Nullable
        public final BarcodePickViewHighlightStyleAsyncProvider getAsyncStyleProvider() {
            return this.asyncStyleProvider;
        }

        @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleRectangularWithIconsProxy
        @ProxyFunction(nativeName = "brushForState")
        @NotNull
        public Brush getBrushForState(@NotNull BarcodePickState state) {
            Intrinsics.h(state, "state");
            return this.f17944a.getBrushForState(state);
        }

        @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleRectangularWithIconsProxy
        @ProxyFunction(property = "iconStyle")
        @NotNull
        public BarcodePickIconStyle getIconStyle() {
            return this.f17944a.getIconStyle();
        }

        @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleRectangularWithIconsProxy
        @ProxyFunction(nativeName = "getMinimumHighlightHeight", property = "minimumHighlightHeight")
        public int getMinimumHighlightHeight() {
            return this.f17944a.getMinimumHighlightHeight();
        }

        @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleRectangularWithIconsProxy
        @ProxyFunction(nativeName = "getMinimumHighlightWidth", property = "minimumHighlightWidth")
        public int getMinimumHighlightWidth() {
            return this.f17944a.getMinimumHighlightWidth();
        }

        @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleRectangularWithIconsProxy
        @ProxyFunction(nativeName = "selectedBrushForState")
        @Nullable
        public Brush getSelectedBrushForState(@NotNull BarcodePickState state) {
            Intrinsics.h(state, "state");
            return this.f17944a.getSelectedBrushForState(state);
        }

        @NotNull
        public final BarcodePickStatusIconSettings getStatusIconSettings() {
            NativeBarcodePickStatusIconSettings statusIconSettings = getF17950a().getStatusIconSettings();
            Intrinsics.g(statusIconSettings, "_impl().statusIconSettings");
            return new BarcodePickStatusIconSettings(statusIconSettings);
        }

        @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleRectangularWithIconsProxy
        @ProxyFunction(nativeName = "getStyleResponseCacheEnabled", property = "styleResponseCacheEnabled")
        public boolean getStyleResponseCacheEnabled() {
            return this.f17944a.getStyleResponseCacheEnabled();
        }

        @NotNull
        /* renamed from: get_iconsHolder$scandit_barcode_capture, reason: from getter */
        public final BarcodePickHighlightStyleIconsHolder get_iconsHolder() {
            return this._iconsHolder;
        }

        public final void setAsyncStyleProvider(@Nullable BarcodePickViewHighlightStyleAsyncProvider barcodePickViewHighlightStyleAsyncProvider) {
            this.asyncStyleProvider = barcodePickViewHighlightStyleAsyncProvider;
        }

        @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleRectangularWithIconsProxy
        @ProxyFunction(nativeName = "setBrushForState")
        public void setBrushForState(@NotNull Brush brush, @NotNull BarcodePickState state) {
            Intrinsics.h(brush, "brush");
            Intrinsics.h(state, "state");
            this.f17944a.setBrushForState(brush, state);
        }

        public final void setIconForState(@Nullable Bitmap icon, @NotNull BarcodePickState state) {
            Intrinsics.h(state, "state");
            this._iconsHolder.b(icon, state);
        }

        @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleRectangularWithIconsProxy
        @ProxyFunction(nativeName = "setMinimumHighlightHeight", property = "minimumHighlightHeight")
        public void setMinimumHighlightHeight(int i) {
            this.f17944a.setMinimumHighlightHeight(i);
        }

        @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleRectangularWithIconsProxy
        @ProxyFunction(nativeName = "setMinimumHighlightWidth", property = "minimumHighlightWidth")
        public void setMinimumHighlightWidth(int i) {
            this.f17944a.setMinimumHighlightWidth(i);
        }

        @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleRectangularWithIconsProxy
        @ProxyFunction(nativeName = "setSelectedBrushForState")
        public void setSelectedBrushForState(@Nullable Brush brush, @NotNull BarcodePickState state) {
            Intrinsics.h(state, "state");
            this.f17944a.setSelectedBrushForState(brush, state);
        }

        public final void setSelectedIconForState(@Nullable Bitmap icon, @NotNull BarcodePickState state) {
            Intrinsics.h(state, "state");
            this._iconsHolder.a(icon, state);
        }

        public final void setStatusIconSettings(@NotNull BarcodePickStatusIconSettings value) {
            Intrinsics.h(value, "value");
            getF17950a().setStatusIconSettings(value.getF17937a());
        }

        @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleRectangularWithIconsProxy
        @ProxyFunction(nativeName = "setStyleResponseCacheEnabled", property = "styleResponseCacheEnabled")
        public void setStyleResponseCacheEnabled(boolean z) {
            this.f17944a.setStyleResponseCacheEnabled(z);
        }

        @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyle
        @NotNull
        public String toJson() {
            return V3.a(this, getF17950a().toJson());
        }

        public final void setIconForState(@DrawableRes int iconResource, @NotNull BarcodePickState state) {
            Intrinsics.h(state, "state");
            this._iconsHolder.b(iconResource, state);
        }

        public final void setSelectedIconForState(@DrawableRes int iconResource, @NotNull BarcodePickState state) {
            Intrinsics.h(state, "state");
            this._iconsHolder.a(iconResource, state);
        }

        public /* synthetic */ RectangularWithIcons(NativeBarcodePickViewHighlightStyleRectangularWithIcons nativeBarcodePickViewHighlightStyleRectangularWithIcons, BarcodePickHighlightStyleIconsHolder barcodePickHighlightStyleIconsHolder, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(nativeBarcodePickViewHighlightStyleRectangularWithIcons, (i & 2) != 0 ? W3.a() : barcodePickHighlightStyleIconsHolder);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public RectangularWithIcons() {
            NativeBarcodePickViewHighlightStyleRectangularWithIcons nativeBarcodePickViewHighlightStyleRectangularWithIconsCreate = NativeBarcodePickViewHighlightStyleRectangularWithIcons.create();
            Intrinsics.g(nativeBarcodePickViewHighlightStyleRectangularWithIconsCreate, "create()");
            this(nativeBarcodePickViewHighlightStyleRectangularWithIconsCreate, null, 2, 0 == true ? 1 : 0);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public RectangularWithIcons(@NotNull BarcodePickIconStyle iconStyle) {
            Intrinsics.h(iconStyle, "iconStyle");
            NativeBarcodePickViewHighlightStyleRectangularWithIcons nativeBarcodePickViewHighlightStyleRectangularWithIconsCreate = NativeBarcodePickViewHighlightStyleRectangularWithIcons.create();
            nativeBarcodePickViewHighlightStyleRectangularWithIconsCreate.setIconStyle(iconStyle._toNativeEnum$scandit_barcode_capture());
            this(nativeBarcodePickViewHighlightStyleRectangularWithIconsCreate, null, 2, 0 == true ? 1 : 0);
        }
    }

    @NativeImpl
    @NotNull
    /* renamed from: _highlightStyleImpl */
    NativeBarcodePickViewHighlightStyle getC();

    @NotNull
    String toJson();

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0000\u0012\u0006\u0010(\u001a\u00020\u0005¢\u0006\u0004\b)\u0010*B\t\b\u0016¢\u0006\u0004\b)\u0010+J\t\u0010\u0004\u001a\u00020\u0003H\u0097\u0001J\t\u0010\u0006\u001a\u00020\u0005H\u0097\u0001J\b\u0010\b\u001a\u00020\u0007H\u0016R$\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00118W@WX\u0096\u000f¢\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u00188W@WX\u0096\u000f¢\u0006\f\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010 \u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u00188W@WX\u0096\u000f¢\u0006\f\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001cR$\u0010'\u001a\u00020!2\u0006\u0010\"\u001a\u00020!8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u0006,"}, d2 = {"Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewHighlightStyle$CustomView;", "Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewHighlightStyle;", "Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewHighlightStyleCustomViewProxy;", "Lcom/scandit/datacapture/barcode/internal/module/pick/ui/NativeBarcodePickViewHighlightStyle;", "_highlightStyleImpl", "Lcom/scandit/datacapture/barcode/internal/module/pick/ui/NativeBarcodePickViewHighlightStyleCustomView;", "_impl", "", "toJson", "Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewHighlightStyleCustomViewProvider;", "b", "Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewHighlightStyleCustomViewProvider;", "getAsyncCustomViewProvider", "()Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewHighlightStyleCustomViewProvider;", "setAsyncCustomViewProvider", "(Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewHighlightStyleCustomViewProvider;)V", "asyncCustomViewProvider", "", "<set-?>", "getFitViewsToBarcode", "()Z", "setFitViewsToBarcode", "(Z)V", "fitViewsToBarcode", "", "getMinimumHighlightHeight", "()I", "setMinimumHighlightHeight", "(I)V", "minimumHighlightHeight", "getMinimumHighlightWidth", "setMinimumHighlightWidth", "minimumHighlightWidth", "Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickStatusIconSettings;", "value", "getStatusIconSettings", "()Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickStatusIconSettings;", "setStatusIconSettings", "(Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickStatusIconSettings;)V", "statusIconSettings", "impl", "<init>", "(Lcom/scandit/datacapture/barcode/internal/module/pick/ui/NativeBarcodePickViewHighlightStyleCustomView;)V", "()V", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
    public static final class CustomView implements BarcodePickViewHighlightStyle, BarcodePickViewHighlightStyleCustomViewProxy {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ BarcodePickViewHighlightStyleCustomViewProxyAdapter f17940a;

        /* renamed from: b, reason: from kotlin metadata */
        private BarcodePickViewHighlightStyleCustomViewProvider asyncCustomViewProvider;

        public CustomView(@NotNull NativeBarcodePickViewHighlightStyleCustomView impl) {
            Intrinsics.h(impl, "impl");
            this.f17940a = new BarcodePickViewHighlightStyleCustomViewProxyAdapter(impl, null, 2, 0 == true ? 1 : 0);
        }

        @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyle, com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleCustomViewProxy
        @NativeImpl
        @NotNull
        /* renamed from: _highlightStyleImpl */
        public NativeBarcodePickViewHighlightStyle getC() {
            return this.f17940a.getC();
        }

        @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleCustomViewProxy
        @NativeImpl
        @NotNull
        /* renamed from: _impl */
        public NativeBarcodePickViewHighlightStyleCustomView getF17945a() {
            return this.f17940a.getF17945a();
        }

        @Nullable
        public final BarcodePickViewHighlightStyleCustomViewProvider getAsyncCustomViewProvider() {
            return this.asyncCustomViewProvider;
        }

        @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleCustomViewProxy
        @ProxyFunction(nativeName = "getFitViewsToBarcode", property = "fitViewsToBarcode")
        public boolean getFitViewsToBarcode() {
            return this.f17940a.getFitViewsToBarcode();
        }

        @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleCustomViewProxy
        @ProxyFunction(nativeName = "getMinimumHighlightHeight", property = "minimumHighlightHeight")
        public int getMinimumHighlightHeight() {
            return this.f17940a.getMinimumHighlightHeight();
        }

        @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleCustomViewProxy
        @ProxyFunction(nativeName = "getMinimumHighlightWidth", property = "minimumHighlightWidth")
        public int getMinimumHighlightWidth() {
            return this.f17940a.getMinimumHighlightWidth();
        }

        @NotNull
        public final BarcodePickStatusIconSettings getStatusIconSettings() {
            NativeBarcodePickStatusIconSettings statusIconSettings = getF17945a().getStatusIconSettings();
            Intrinsics.g(statusIconSettings, "_impl().statusIconSettings");
            return new BarcodePickStatusIconSettings(statusIconSettings);
        }

        public final void setAsyncCustomViewProvider(@Nullable BarcodePickViewHighlightStyleCustomViewProvider barcodePickViewHighlightStyleCustomViewProvider) {
            this.asyncCustomViewProvider = barcodePickViewHighlightStyleCustomViewProvider;
        }

        @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleCustomViewProxy
        @ProxyFunction(nativeName = "setFitViewsToBarcode", property = "fitViewsToBarcode")
        public void setFitViewsToBarcode(boolean z) {
            this.f17940a.setFitViewsToBarcode(z);
        }

        @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleCustomViewProxy
        @ProxyFunction(nativeName = "setMinimumHighlightHeight", property = "minimumHighlightHeight")
        public void setMinimumHighlightHeight(int i) {
            this.f17940a.setMinimumHighlightHeight(i);
        }

        @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleCustomViewProxy
        @ProxyFunction(nativeName = "setMinimumHighlightWidth", property = "minimumHighlightWidth")
        public void setMinimumHighlightWidth(int i) {
            this.f17940a.setMinimumHighlightWidth(i);
        }

        public final void setStatusIconSettings(@NotNull BarcodePickStatusIconSettings value) {
            Intrinsics.h(value, "value");
            getF17945a().setStatusIconSettings(value.getF17937a());
        }

        @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyle
        @NotNull
        public String toJson() {
            String json = getF17945a().toJson();
            Intrinsics.g(json, "_impl().toJson()");
            return json;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public CustomView() {
            NativeBarcodePickViewHighlightStyleCustomView nativeBarcodePickViewHighlightStyleCustomViewCreate = NativeBarcodePickViewHighlightStyleCustomView.create();
            Intrinsics.g(nativeBarcodePickViewHighlightStyleCustomViewCreate, "create()");
            this(nativeBarcodePickViewHighlightStyleCustomViewCreate);
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0016¢\u0006\u0002\u0010\u0003B\u000f\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u0007\u001a\u00020\bH\u0097\u0001J\t\u0010\t\u001a\u00020\u0005H\u0097\u0001J\u0011\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0097\u0001J\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rH\u0097\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0097\u0001J\u001b\u0010\u0012\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rH\u0097\u0001J\b\u0010\u0013\u001a\u00020\u0014H\u0016¨\u0006\u0015"}, d2 = {"Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewHighlightStyle$Dot;", "Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewHighlightStyle;", "Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewHighlightStyleDotProxy;", "()V", "impl", "Lcom/scandit/datacapture/barcode/internal/module/pick/ui/NativeBarcodePickViewHighlightStyleDot;", "(Lcom/scandit/datacapture/barcode/internal/module/pick/ui/NativeBarcodePickViewHighlightStyleDot;)V", "_highlightStyleImpl", "Lcom/scandit/datacapture/barcode/internal/module/pick/ui/NativeBarcodePickViewHighlightStyle;", "_impl", "getBrushForState", "Lcom/scandit/datacapture/core/ui/style/Brush;", "state", "Lcom/scandit/datacapture/barcode/pick/capture/BarcodePickState;", "getSelectedBrushForState", "setBrushForState", "", "brush", "setSelectedBrushForState", "toJson", "", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Dot implements BarcodePickViewHighlightStyle, BarcodePickViewHighlightStyleDotProxy {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ BarcodePickViewHighlightStyleDotProxyAdapter f17941a;

        public Dot(@NotNull NativeBarcodePickViewHighlightStyleDot impl) {
            Intrinsics.h(impl, "impl");
            this.f17941a = new BarcodePickViewHighlightStyleDotProxyAdapter(impl, null, 2, 0 == true ? 1 : 0);
        }

        @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyle, com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleCustomViewProxy
        @NativeImpl
        @NotNull
        /* renamed from: _highlightStyleImpl */
        public NativeBarcodePickViewHighlightStyle getC() {
            return this.f17941a.getC();
        }

        @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleDotProxy
        @NativeImpl
        @NotNull
        /* renamed from: _impl */
        public NativeBarcodePickViewHighlightStyleDot getF17947a() {
            return this.f17941a.getF17947a();
        }

        @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleDotProxy
        @ProxyFunction(nativeName = "brushForState")
        @NotNull
        public Brush getBrushForState(@NotNull BarcodePickState state) {
            Intrinsics.h(state, "state");
            return this.f17941a.getBrushForState(state);
        }

        @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleDotProxy
        @ProxyFunction(nativeName = "selectedBrushForState")
        @Nullable
        public Brush getSelectedBrushForState(@NotNull BarcodePickState state) {
            Intrinsics.h(state, "state");
            return this.f17941a.getSelectedBrushForState(state);
        }

        @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleDotProxy
        @ProxyFunction(nativeName = "setBrushForState")
        public void setBrushForState(@NotNull Brush brush, @NotNull BarcodePickState state) {
            Intrinsics.h(brush, "brush");
            Intrinsics.h(state, "state");
            this.f17941a.setBrushForState(brush, state);
        }

        @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleDotProxy
        @ProxyFunction(nativeName = "setSelectedBrushForState")
        public void setSelectedBrushForState(@Nullable Brush brush, @NotNull BarcodePickState state) {
            Intrinsics.h(state, "state");
            this.f17941a.setSelectedBrushForState(brush, state);
        }

        @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyle
        @NotNull
        public String toJson() {
            String json = getF17947a().toJson();
            Intrinsics.g(json, "_impl().toJson()");
            return json;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Dot() {
            NativeBarcodePickViewHighlightStyleDot nativeBarcodePickViewHighlightStyleDotCreate = NativeBarcodePickViewHighlightStyleDot.create();
            Intrinsics.g(nativeBarcodePickViewHighlightStyleDotCreate, "create()");
            this(nativeBarcodePickViewHighlightStyleDotCreate);
        }
    }

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0016¢\u0006\u0002\u0010\u0003B\u000f\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u0011\u001a\u00020\u0012H\u0097\u0001J\t\u0010\u0013\u001a\u00020\u0005H\u0097\u0001J\u0011\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0097\u0001J\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0097\u0001J\u0019\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0097\u0001J\u001b\u0010\u001c\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0097\u0001J\b\u0010\u001d\u001a\u00020\u001eH\u0016R$\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8W@WX\u0096\u000f¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR$\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8W@WX\u0096\u000f¢\u0006\f\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\r¨\u0006\u001f"}, d2 = {"Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewHighlightStyle$Rectangular;", "Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewHighlightStyle;", "Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewHighlightStyleRectangularProxy;", "()V", "impl", "Lcom/scandit/datacapture/barcode/internal/module/pick/ui/NativeBarcodePickViewHighlightStyleRectangular;", "(Lcom/scandit/datacapture/barcode/internal/module/pick/ui/NativeBarcodePickViewHighlightStyleRectangular;)V", "<set-?>", "", "minimumHighlightHeight", "getMinimumHighlightHeight", "()I", "setMinimumHighlightHeight", "(I)V", "minimumHighlightWidth", "getMinimumHighlightWidth", "setMinimumHighlightWidth", "_highlightStyleImpl", "Lcom/scandit/datacapture/barcode/internal/module/pick/ui/NativeBarcodePickViewHighlightStyle;", "_impl", "getBrushForState", "Lcom/scandit/datacapture/core/ui/style/Brush;", "state", "Lcom/scandit/datacapture/barcode/pick/capture/BarcodePickState;", "getSelectedBrushForState", "setBrushForState", "", "brush", "setSelectedBrushForState", "toJson", "", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Rectangular implements BarcodePickViewHighlightStyle, BarcodePickViewHighlightStyleRectangularProxy {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ BarcodePickViewHighlightStyleRectangularProxyAdapter f17943a;

        public Rectangular(@NotNull NativeBarcodePickViewHighlightStyleRectangular impl) {
            Intrinsics.h(impl, "impl");
            this.f17943a = new BarcodePickViewHighlightStyleRectangularProxyAdapter(impl, null, 2, 0 == true ? 1 : 0);
        }

        @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyle, com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleCustomViewProxy
        @NativeImpl
        @NotNull
        /* renamed from: _highlightStyleImpl */
        public NativeBarcodePickViewHighlightStyle getC() {
            return this.f17943a.getC();
        }

        @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleRectangularProxy
        @NativeImpl
        @NotNull
        /* renamed from: _impl */
        public NativeBarcodePickViewHighlightStyleRectangular getF17949a() {
            return this.f17943a.getF17949a();
        }

        @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleRectangularProxy
        @ProxyFunction(nativeName = "brushForState")
        @NotNull
        public Brush getBrushForState(@NotNull BarcodePickState state) {
            Intrinsics.h(state, "state");
            return this.f17943a.getBrushForState(state);
        }

        @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleRectangularProxy
        @ProxyFunction(nativeName = "getMinimumHighlightHeight", property = "minimumHighlightHeight")
        public int getMinimumHighlightHeight() {
            return this.f17943a.getMinimumHighlightHeight();
        }

        @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleRectangularProxy
        @ProxyFunction(nativeName = "getMinimumHighlightWidth", property = "minimumHighlightWidth")
        public int getMinimumHighlightWidth() {
            return this.f17943a.getMinimumHighlightWidth();
        }

        @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleRectangularProxy
        @ProxyFunction(nativeName = "selectedBrushForState")
        @Nullable
        public Brush getSelectedBrushForState(@NotNull BarcodePickState state) {
            Intrinsics.h(state, "state");
            return this.f17943a.getSelectedBrushForState(state);
        }

        @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleRectangularProxy
        @ProxyFunction(nativeName = "setBrushForState")
        public void setBrushForState(@NotNull Brush brush, @NotNull BarcodePickState state) {
            Intrinsics.h(brush, "brush");
            Intrinsics.h(state, "state");
            this.f17943a.setBrushForState(brush, state);
        }

        @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleRectangularProxy
        @ProxyFunction(nativeName = "setMinimumHighlightHeight", property = "minimumHighlightHeight")
        public void setMinimumHighlightHeight(int i) {
            this.f17943a.setMinimumHighlightHeight(i);
        }

        @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleRectangularProxy
        @ProxyFunction(nativeName = "setMinimumHighlightWidth", property = "minimumHighlightWidth")
        public void setMinimumHighlightWidth(int i) {
            this.f17943a.setMinimumHighlightWidth(i);
        }

        @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleRectangularProxy
        @ProxyFunction(nativeName = "setSelectedBrushForState")
        public void setSelectedBrushForState(@Nullable Brush brush, @NotNull BarcodePickState state) {
            Intrinsics.h(state, "state");
            this.f17943a.setSelectedBrushForState(brush, state);
        }

        @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyle
        @NotNull
        public String toJson() {
            String json = getF17949a().toJson();
            Intrinsics.g(json, "_impl().toJson()");
            return json;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Rectangular() {
            NativeBarcodePickViewHighlightStyleRectangular nativeBarcodePickViewHighlightStyleRectangularCreate = NativeBarcodePickViewHighlightStyleRectangular.create();
            Intrinsics.g(nativeBarcodePickViewHighlightStyleRectangularCreate, "create()");
            this(nativeBarcodePickViewHighlightStyleRectangularCreate);
        }
    }
}
