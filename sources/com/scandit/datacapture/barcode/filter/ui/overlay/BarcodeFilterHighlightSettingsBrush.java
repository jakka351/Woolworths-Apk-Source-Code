package com.scandit.datacapture.barcode.filter.ui.overlay;

import com.scandit.datacapture.core.internal.sdk.annotations.Mockable;
import com.scandit.datacapture.core.internal.sdk.extensions.NativeColorExtensionsKt;
import com.scandit.datacapture.core.internal.sdk.ui.style.NativeBrush;
import com.scandit.datacapture.core.ui.style.Brush;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0005\u001a\u00020\u0003H\u0097\u0001¨\u0006\u0007"}, d2 = {"Lcom/scandit/datacapture/barcode/filter/ui/overlay/BarcodeFilterHighlightSettingsBrush;", "Lcom/scandit/datacapture/barcode/filter/ui/overlay/BarcodeFilterOverlaySettingsBrushProxy;", "impl", "Lcom/scandit/datacapture/barcode/filter/ui/overlay/NativeBarcodeFilterOverlaySettingsBrush;", "(Lcom/scandit/datacapture/barcode/filter/ui/overlay/NativeBarcodeFilterOverlaySettingsBrush;)V", "_impl", "Companion", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Mockable
/* loaded from: classes6.dex */
public final class BarcodeFilterHighlightSettingsBrush implements BarcodeFilterOverlaySettingsBrushProxy {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ BarcodeFilterOverlaySettingsBrushProxyAdapter f17648a;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u0006"}, d2 = {"Lcom/scandit/datacapture/barcode/filter/ui/overlay/BarcodeFilterHighlightSettingsBrush$Companion;", "", "Lcom/scandit/datacapture/core/ui/style/Brush;", "brush", "Lcom/scandit/datacapture/barcode/filter/ui/overlay/BarcodeFilterHighlightSettings;", "create", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final BarcodeFilterHighlightSettings create(@NotNull Brush brush) {
            Intrinsics.h(brush, "brush");
            NativeBarcodeFilterOverlaySettings nativeBarcodeFilterOverlaySettingsCreate = NativeBarcodeFilterOverlaySettingsBrush.create(new NativeBrush(NativeColorExtensionsKt.toNativeColor(brush.getFillColor()), NativeColorExtensionsKt.toNativeColor(brush.getStrokeColor()), brush.getStrokeWidth()));
            Intrinsics.g(nativeBarcodeFilterOverlaySettingsCreate, "create(\n                …      )\n                )");
            return new BarcodeFilterHighlightSettings(nativeBarcodeFilterOverlaySettingsCreate);
        }

        private Companion() {
        }
    }

    public BarcodeFilterHighlightSettingsBrush(@NotNull NativeBarcodeFilterOverlaySettingsBrush impl) {
        Intrinsics.h(impl, "impl");
        this.f17648a = new BarcodeFilterOverlaySettingsBrushProxyAdapter(impl, null, 2, null);
    }

    @JvmStatic
    @NotNull
    public static final BarcodeFilterHighlightSettings create(@NotNull Brush brush) {
        return INSTANCE.create(brush);
    }

    @Override // com.scandit.datacapture.barcode.filter.ui.overlay.BarcodeFilterOverlaySettingsBrushProxy
    @NativeImpl
    @NotNull
    /* renamed from: _impl */
    public NativeBarcodeFilterOverlaySettingsBrush getF17650a() {
        return this.f17648a.getF17650a();
    }
}
