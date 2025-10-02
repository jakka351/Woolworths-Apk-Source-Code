package com.scandit.datacapture.barcode.pick.ui;

import com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewHighlightStyle;
import com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewHighlightStyleDot;
import com.scandit.datacapture.barcode.pick.capture.BarcodePickState;
import com.scandit.datacapture.core.ui.style.Brush;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyAdapter;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\ba\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H'J\b\u0010\u0004\u001a\u00020\u0005H'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH'J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH'J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH'J\u001a\u0010\u000e\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH'¨\u0006\u000f"}, d2 = {"Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewHighlightStyleDotProxy;", "", "_highlightStyleImpl", "Lcom/scandit/datacapture/barcode/internal/module/pick/ui/NativeBarcodePickViewHighlightStyle;", "_impl", "Lcom/scandit/datacapture/barcode/internal/module/pick/ui/NativeBarcodePickViewHighlightStyleDot;", "getBrushForState", "Lcom/scandit/datacapture/core/ui/style/Brush;", "state", "Lcom/scandit/datacapture/barcode/pick/capture/BarcodePickState;", "getSelectedBrushForState", "setBrushForState", "", "brush", "setSelectedBrushForState", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0}, xi = 48)
@ProxyAdapter(NativeBarcodePickViewHighlightStyleDot.class)
/* loaded from: classes6.dex */
public interface BarcodePickViewHighlightStyleDotProxy {
    @NativeImpl
    @NotNull
    NativeBarcodePickViewHighlightStyle _highlightStyleImpl();

    @NativeImpl
    @NotNull
    NativeBarcodePickViewHighlightStyleDot _impl();

    @ProxyFunction(nativeName = "brushForState")
    @NotNull
    Brush getBrushForState(@NotNull BarcodePickState state);

    @ProxyFunction(nativeName = "selectedBrushForState")
    @Nullable
    Brush getSelectedBrushForState(@NotNull BarcodePickState state);

    @ProxyFunction(nativeName = "setBrushForState")
    void setBrushForState(@NotNull Brush brush, @NotNull BarcodePickState state);

    @ProxyFunction(nativeName = "setSelectedBrushForState")
    void setSelectedBrushForState(@Nullable Brush brush, @NotNull BarcodePickState state);
}
