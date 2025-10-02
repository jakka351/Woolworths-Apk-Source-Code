package com.scandit.datacapture.barcode.pick.ui;

import com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewHighlightStyle;
import com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewHighlightStyleDotWithIcons;
import com.scandit.datacapture.barcode.pick.capture.BarcodePickState;
import com.scandit.datacapture.core.ui.style.Brush;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyAdapter;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\ba\u0018\u00002\u00020\u0001J\b\u0010\r\u001a\u00020\u000eH'J\b\u0010\u000f\u001a\u00020\u0010H'J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H'J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u0014H'J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H'J\u001a\u0010\u0019\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u0014H'R\u0014\u0010\u0002\u001a\u00020\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R$\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00078g@gX¦\u000e¢\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u001a"}, d2 = {"Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewHighlightStyleDotWithIconsProxy;", "", "iconStyle", "Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickIconStyle;", "getIconStyle", "()Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickIconStyle;", "<set-?>", "", "styleResponseCacheEnabled", "getStyleResponseCacheEnabled", "()Z", "setStyleResponseCacheEnabled", "(Z)V", "_highlightStyleImpl", "Lcom/scandit/datacapture/barcode/internal/module/pick/ui/NativeBarcodePickViewHighlightStyle;", "_impl", "Lcom/scandit/datacapture/barcode/internal/module/pick/ui/NativeBarcodePickViewHighlightStyleDotWithIcons;", "getBrushForState", "Lcom/scandit/datacapture/core/ui/style/Brush;", "state", "Lcom/scandit/datacapture/barcode/pick/capture/BarcodePickState;", "getSelectedBrushForState", "setBrushForState", "", "brush", "setSelectedBrushForState", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0}, xi = 48)
@ProxyAdapter(NativeBarcodePickViewHighlightStyleDotWithIcons.class)
/* loaded from: classes6.dex */
public interface BarcodePickViewHighlightStyleDotWithIconsProxy {
    @NativeImpl
    @NotNull
    NativeBarcodePickViewHighlightStyle _highlightStyleImpl();

    @NativeImpl
    @NotNull
    NativeBarcodePickViewHighlightStyleDotWithIcons _impl();

    @ProxyFunction(nativeName = "brushForState")
    @NotNull
    Brush getBrushForState(@NotNull BarcodePickState state);

    @ProxyFunction(property = "iconStyle")
    @NotNull
    BarcodePickIconStyle getIconStyle();

    @ProxyFunction(nativeName = "selectedBrushForState")
    @Nullable
    Brush getSelectedBrushForState(@NotNull BarcodePickState state);

    @ProxyFunction(nativeName = "getStyleResponseCacheEnabled", property = "styleResponseCacheEnabled")
    boolean getStyleResponseCacheEnabled();

    @ProxyFunction(nativeName = "setBrushForState")
    void setBrushForState(@NotNull Brush brush, @NotNull BarcodePickState state);

    @ProxyFunction(nativeName = "setSelectedBrushForState")
    void setSelectedBrushForState(@Nullable Brush brush, @NotNull BarcodePickState state);

    @ProxyFunction(nativeName = "setStyleResponseCacheEnabled", property = "styleResponseCacheEnabled")
    void setStyleResponseCacheEnabled(boolean z);
}
