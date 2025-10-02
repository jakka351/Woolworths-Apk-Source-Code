package com.scandit.datacapture.core.internal.sdk.ui.overlay;

import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.internal.sdk.annotations.Mockable;
import com.scandit.datacapture.core.ui.overlay.DataCaptureOverlay;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \t2\u00020\u00012\u00020\u0002:\u0001\tB\u000f\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\t\u0010\u0006\u001a\u00020\u0007H\u0097\u0001J\t\u0010\b\u001a\u00020\u0004H\u0097\u0001¨\u0006\n"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/ProfilingOverlay;", "Lcom/scandit/datacapture/core/ui/overlay/DataCaptureOverlay;", "Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/ProfilingOverlayProxy;", "impl", "Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/NativeProfilingOverlay;", "(Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/NativeProfilingOverlay;)V", "_dataCaptureOverlayImpl", "Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/NativeDataCaptureOverlay;", "_impl", "Companion", "scandit-capture-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Mockable
/* loaded from: classes6.dex */
public final class ProfilingOverlay implements DataCaptureOverlay, ProfilingOverlayProxy {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ ProfilingOverlayProxyAdapter f18745a;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u0006"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/ProfilingOverlay$Companion;", "", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "dataCaptureContext", "Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/ProfilingOverlay;", "create", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final ProfilingOverlay create(@NotNull DataCaptureContext dataCaptureContext) {
            Intrinsics.h(dataCaptureContext, "dataCaptureContext");
            NativeProfilingOverlay nativeProfilingOverlayCreate = NativeProfilingOverlay.create(dataCaptureContext._impl());
            Intrinsics.g(nativeProfilingOverlayCreate, "native");
            return new ProfilingOverlay(nativeProfilingOverlayCreate);
        }

        private Companion() {
        }
    }

    public ProfilingOverlay(@NotNull NativeProfilingOverlay impl) {
        Intrinsics.h(impl, "impl");
        this.f18745a = new ProfilingOverlayProxyAdapter(impl, null, 2, null);
    }

    @JvmStatic
    @NotNull
    public static final ProfilingOverlay create(@NotNull DataCaptureContext dataCaptureContext) {
        return INSTANCE.create(dataCaptureContext);
    }

    @Override // com.scandit.datacapture.core.ui.overlay.DataCaptureOverlay
    @NativeImpl
    @NotNull
    /* renamed from: _dataCaptureOverlayImpl */
    public NativeDataCaptureOverlay getC() {
        return this.f18745a.getC();
    }

    @Override // com.scandit.datacapture.core.internal.sdk.ui.overlay.ProfilingOverlayProxy
    @NativeImpl
    @NotNull
    /* renamed from: _impl */
    public NativeProfilingOverlay getF18746a() {
        return this.f18745a.getF18746a();
    }
}
