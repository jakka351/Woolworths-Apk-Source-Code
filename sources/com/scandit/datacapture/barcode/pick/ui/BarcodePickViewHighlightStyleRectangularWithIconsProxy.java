package com.scandit.datacapture.barcode.pick.ui;

import com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewHighlightStyle;
import com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewHighlightStyleRectangularWithIcons;
import com.scandit.datacapture.barcode.pick.capture.BarcodePickState;
import com.scandit.datacapture.core.ui.style.Brush;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyAdapter;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\ba\u0018\u00002\u00020\u0001J\b\u0010\u0016\u001a\u00020\u0017H'J\b\u0010\u0018\u001a\u00020\u0019H'J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH'J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH'J\u0018\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH'J\u001a\u0010\"\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH'R\u0014\u0010\u0002\u001a\u00020\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R$\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00078g@gX¦\u000e¢\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR$\u0010\r\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00078g@gX¦\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\fR$\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00108g@gX¦\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006#"}, d2 = {"Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewHighlightStyleRectangularWithIconsProxy;", "", "iconStyle", "Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickIconStyle;", "getIconStyle", "()Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickIconStyle;", "<set-?>", "", "minimumHighlightHeight", "getMinimumHighlightHeight", "()I", "setMinimumHighlightHeight", "(I)V", "minimumHighlightWidth", "getMinimumHighlightWidth", "setMinimumHighlightWidth", "", "styleResponseCacheEnabled", "getStyleResponseCacheEnabled", "()Z", "setStyleResponseCacheEnabled", "(Z)V", "_highlightStyleImpl", "Lcom/scandit/datacapture/barcode/internal/module/pick/ui/NativeBarcodePickViewHighlightStyle;", "_impl", "Lcom/scandit/datacapture/barcode/internal/module/pick/ui/NativeBarcodePickViewHighlightStyleRectangularWithIcons;", "getBrushForState", "Lcom/scandit/datacapture/core/ui/style/Brush;", "state", "Lcom/scandit/datacapture/barcode/pick/capture/BarcodePickState;", "getSelectedBrushForState", "setBrushForState", "", "brush", "setSelectedBrushForState", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0}, xi = 48)
@ProxyAdapter(NativeBarcodePickViewHighlightStyleRectangularWithIcons.class)
/* loaded from: classes6.dex */
public interface BarcodePickViewHighlightStyleRectangularWithIconsProxy {
    @NativeImpl
    @NotNull
    NativeBarcodePickViewHighlightStyle _highlightStyleImpl();

    @NativeImpl
    @NotNull
    NativeBarcodePickViewHighlightStyleRectangularWithIcons _impl();

    @ProxyFunction(nativeName = "brushForState")
    @NotNull
    Brush getBrushForState(@NotNull BarcodePickState state);

    @ProxyFunction(property = "iconStyle")
    @NotNull
    BarcodePickIconStyle getIconStyle();

    @ProxyFunction(nativeName = "getMinimumHighlightHeight", property = "minimumHighlightHeight")
    int getMinimumHighlightHeight();

    @ProxyFunction(nativeName = "getMinimumHighlightWidth", property = "minimumHighlightWidth")
    int getMinimumHighlightWidth();

    @ProxyFunction(nativeName = "selectedBrushForState")
    @Nullable
    Brush getSelectedBrushForState(@NotNull BarcodePickState state);

    @ProxyFunction(nativeName = "getStyleResponseCacheEnabled", property = "styleResponseCacheEnabled")
    boolean getStyleResponseCacheEnabled();

    @ProxyFunction(nativeName = "setBrushForState")
    void setBrushForState(@NotNull Brush brush, @NotNull BarcodePickState state);

    @ProxyFunction(nativeName = "setMinimumHighlightHeight", property = "minimumHighlightHeight")
    void setMinimumHighlightHeight(int i);

    @ProxyFunction(nativeName = "setMinimumHighlightWidth", property = "minimumHighlightWidth")
    void setMinimumHighlightWidth(int i);

    @ProxyFunction(nativeName = "setSelectedBrushForState")
    void setSelectedBrushForState(@Nullable Brush brush, @NotNull BarcodePickState state);

    @ProxyFunction(nativeName = "setStyleResponseCacheEnabled", property = "styleResponseCacheEnabled")
    void setStyleResponseCacheEnabled(boolean z);
}
