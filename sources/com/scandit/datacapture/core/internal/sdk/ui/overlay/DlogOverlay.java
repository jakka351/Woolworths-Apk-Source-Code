package com.scandit.datacapture.core.internal.sdk.ui.overlay;

import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.ui.overlay.DataCaptureOverlay;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \r2\u00020\u00012\u00020\u0002:\u0001\rB\u000f\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\t\u0010\u0006\u001a\u00020\u0007H\u0097\u0001J\t\u0010\b\u001a\u00020\u0004H\u0097\u0001J\u0011\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0097\u0001¨\u0006\u000e"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/DlogOverlay;", "Lcom/scandit/datacapture/core/ui/overlay/DataCaptureOverlay;", "Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/DlogOverlayProxy;", "impl", "Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/NativeDlogOverlay;", "(Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/NativeDlogOverlay;)V", "_dataCaptureOverlayImpl", "Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/NativeDataCaptureOverlay;", "_impl", "setGlobFilter", "", "globFilter", "", "Companion", "scandit-capture-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DlogOverlay implements DataCaptureOverlay, DlogOverlayProxy {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ DlogOverlayProxyAdapter f18741a;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u0006"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/DlogOverlay$Companion;", "", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "dataCaptureContext", "Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/DlogOverlay;", "create", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final DlogOverlay create(@NotNull DataCaptureContext dataCaptureContext) {
            Intrinsics.h(dataCaptureContext, "dataCaptureContext");
            NativeDlogOverlay nativeDlogOverlayCreate = NativeDlogOverlay.create(dataCaptureContext.getF18429a());
            Intrinsics.g(nativeDlogOverlayCreate, "native");
            return new DlogOverlay(nativeDlogOverlayCreate);
        }

        private Companion() {
        }
    }

    public DlogOverlay(@NotNull NativeDlogOverlay impl) {
        Intrinsics.h(impl, "impl");
        this.f18741a = new DlogOverlayProxyAdapter(impl, null, 2, null);
    }

    @JvmStatic
    @NotNull
    public static final DlogOverlay create(@NotNull DataCaptureContext dataCaptureContext) {
        return INSTANCE.create(dataCaptureContext);
    }

    @Override // com.scandit.datacapture.core.ui.overlay.DataCaptureOverlay
    @NativeImpl
    @NotNull
    /* renamed from: _dataCaptureOverlayImpl */
    public NativeDataCaptureOverlay getC() {
        return this.f18741a.getC();
    }

    @Override // com.scandit.datacapture.core.internal.sdk.ui.overlay.DlogOverlayProxy
    @NativeImpl
    @NotNull
    /* renamed from: _impl */
    public NativeDlogOverlay getF18742a() {
        return this.f18741a.getF18742a();
    }

    @Override // com.scandit.datacapture.core.internal.sdk.ui.overlay.DlogOverlayProxy
    @ProxyFunction
    public void setGlobFilter(@NotNull String globFilter) {
        Intrinsics.h(globFilter, "globFilter");
        this.f18741a.setGlobFilter(globFilter);
    }
}
