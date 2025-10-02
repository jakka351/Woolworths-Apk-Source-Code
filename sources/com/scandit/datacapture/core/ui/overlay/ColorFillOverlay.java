package com.scandit.datacapture.core.ui.overlay;

import com.scandit.datacapture.core.internal.module.ui.NativeColorFillOverlay;
import com.scandit.datacapture.core.internal.sdk.common.graphics.NativeColor;
import com.scandit.datacapture.core.internal.sdk.extensions.NativeColorExtensionsKt;
import com.scandit.datacapture.core.internal.sdk.ui.overlay.NativeDataCaptureOverlay;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00112\u00020\u00012\u00020\u0002:\u0001\u0011B\u0007\b\u0016¢\u0006\u0002\u0010\u0003B\u000f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u000f\b\u0000\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u000e\u001a\u00020\u000fH\u0097\u0001J\t\u0010\u0010\u001a\u00020\bH\u0097\u0001R$\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00058W@WX\u0096\u000f¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u0006¨\u0006\u0012"}, d2 = {"Lcom/scandit/datacapture/core/ui/overlay/ColorFillOverlay;", "Lcom/scandit/datacapture/core/ui/overlay/DataCaptureOverlay;", "Lcom/scandit/datacapture/core/ui/overlay/ColorFillOverlayProxy;", "()V", "color", "", "(I)V", "impl", "Lcom/scandit/datacapture/core/internal/module/ui/NativeColorFillOverlay;", "(Lcom/scandit/datacapture/core/internal/module/ui/NativeColorFillOverlay;)V", "<set-?>", "getColor", "()I", "setColor", "_dataCaptureOverlayImpl", "Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/NativeDataCaptureOverlay;", "_impl", "Companion", "scandit-capture-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ColorFillOverlay implements DataCaptureOverlay, ColorFillOverlayProxy {
    private static final NativeColor b = NativeColorExtensionsKt.toNativeColor(0);

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ ColorFillOverlayProxyAdapter f18935a;

    public ColorFillOverlay(@NotNull NativeColorFillOverlay impl) {
        Intrinsics.h(impl, "impl");
        this.f18935a = new ColorFillOverlayProxyAdapter(impl, null, 2, null);
    }

    @Override // com.scandit.datacapture.core.ui.overlay.DataCaptureOverlay
    @NativeImpl
    @NotNull
    /* renamed from: _dataCaptureOverlayImpl */
    public NativeDataCaptureOverlay getC() {
        return this.f18935a.getC();
    }

    @Override // com.scandit.datacapture.core.ui.overlay.ColorFillOverlayProxy
    @NativeImpl
    @NotNull
    /* renamed from: _impl */
    public NativeColorFillOverlay getF18936a() {
        return this.f18935a.getF18936a();
    }

    @Override // com.scandit.datacapture.core.ui.overlay.ColorFillOverlayProxy
    @ProxyFunction(property = "color")
    public int getColor() {
        return this.f18935a.getColor();
    }

    @Override // com.scandit.datacapture.core.ui.overlay.ColorFillOverlayProxy
    @ProxyFunction(property = "color")
    public void setColor(int i) {
        this.f18935a.setColor(i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ColorFillOverlay() {
        NativeColorFillOverlay nativeColorFillOverlayCreate = NativeColorFillOverlay.create(b);
        Intrinsics.g(nativeColorFillOverlayCreate, "create(DEFAULT_COLOR)");
        this(nativeColorFillOverlayCreate);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ColorFillOverlay(int i) {
        NativeColorFillOverlay nativeColorFillOverlayCreate = NativeColorFillOverlay.create(NativeColorExtensionsKt.toNativeColor(i));
        Intrinsics.g(nativeColorFillOverlayCreate, "create(color.toNativeColor())");
        this(nativeColorFillOverlayCreate);
    }
}
