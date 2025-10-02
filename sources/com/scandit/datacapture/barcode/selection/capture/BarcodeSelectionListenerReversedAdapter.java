package com.scandit.datacapture.barcode.selection.capture;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.scandit.datacapture.barcode.selection.internal.module.capture.NativeBarcodeSelection;
import com.scandit.datacapture.barcode.selection.internal.module.capture.NativeBarcodeSelectionListener;
import com.scandit.datacapture.barcode.selection.internal.module.capture.NativeBarcodeSelectionSession;
import com.scandit.datacapture.core.data.FrameData;
import com.scandit.datacapture.core.internal.sdk.data.NativeFrameData;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\"\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\"\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016R\u001a\u0010\u0012\u001a\u00020\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0019"}, d2 = {"Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionListenerReversedAdapter;", "Lcom/scandit/datacapture/barcode/selection/internal/module/capture/NativeBarcodeSelectionListener;", "Lcom/scandit/datacapture/barcode/selection/internal/module/capture/NativeBarcodeSelection;", "mode", "", "onObservationStarted", "onObservationStopped", "Lcom/scandit/datacapture/barcode/selection/internal/module/capture/NativeBarcodeSelectionSession;", "session", "Lcom/scandit/datacapture/core/internal/sdk/data/NativeFrameData;", "data", "onSessionUpdated", "onSelectionUpdated", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_barcode_capture", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelection;", "barcodeSelection", "<init>", "(Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionListener;Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelection;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class BarcodeSelectionListenerReversedAdapter extends NativeBarcodeSelectionListener {

    /* renamed from: a, reason: collision with root package name */
    private final BarcodeSelectionListener f18025a;

    /* renamed from: b, reason: from kotlin metadata */
    private final ProxyCache proxyCache;
    private final WeakReference c;

    public /* synthetic */ BarcodeSelectionListenerReversedAdapter(BarcodeSelectionListener barcodeSelectionListener, BarcodeSelection barcodeSelection, ProxyCache proxyCache, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(barcodeSelectionListener, barcodeSelection, (i & 4) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }

    @NotNull
    /* renamed from: getProxyCache$scandit_barcode_capture, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.selection.internal.module.capture.NativeBarcodeSelectionListener
    public void onObservationStarted(@NotNull NativeBarcodeSelection mode) {
        Intrinsics.h(mode, "mode");
        BarcodeSelection barcodeSelection = (BarcodeSelection) this.c.get();
        if (barcodeSelection != null) {
            Object orPut = this.proxyCache.getOrPut(Reflection.f24268a.b(NativeBarcodeSelection.class), null, mode, new x(barcodeSelection));
            Intrinsics.g(orPut, "{\n            val cached…ted(cachedMode)\n        }");
            this.f18025a.onObservationStarted((BarcodeSelection) orPut);
        }
    }

    @Override // com.scandit.datacapture.barcode.selection.internal.module.capture.NativeBarcodeSelectionListener
    public void onObservationStopped(@NotNull NativeBarcodeSelection mode) {
        Intrinsics.h(mode, "mode");
        BarcodeSelection barcodeSelection = (BarcodeSelection) this.c.get();
        if (barcodeSelection != null) {
            Object orPut = this.proxyCache.getOrPut(Reflection.f24268a.b(NativeBarcodeSelection.class), null, mode, new y(barcodeSelection));
            Intrinsics.g(orPut, "{\n            val cached…ped(cachedMode)\n        }");
            this.f18025a.onObservationStopped((BarcodeSelection) orPut);
        }
    }

    @Override // com.scandit.datacapture.barcode.selection.internal.module.capture.NativeBarcodeSelectionListener
    public void onSelectionUpdated(@NotNull NativeBarcodeSelection mode, @NotNull NativeBarcodeSelectionSession session, @Nullable NativeFrameData data) {
        Intrinsics.h(mode, "mode");
        Intrinsics.h(session, "session");
        BarcodeSelection barcodeSelection = (BarcodeSelection) this.c.get();
        if (barcodeSelection != null) {
            ProxyCache proxyCache = this.proxyCache;
            ReflectionFactory reflectionFactory = Reflection.f24268a;
            Object orPut = proxyCache.getOrPut(reflectionFactory.b(NativeBarcodeSelection.class), null, mode, new A(barcodeSelection));
            Intrinsics.g(orPut, "{\n            val cached…achedFrameData)\n        }");
            this.f18025a.onSelectionUpdated((BarcodeSelection) orPut, (BarcodeSelectionSession) this.proxyCache.getOrPut(reflectionFactory.b(NativeBarcodeSelectionSession.class), null, session, new B(barcodeSelection)), data != null ? (FrameData) this.proxyCache.getOrPut(reflectionFactory.b(NativeFrameData.class), null, data, new z(data)) : null);
        }
    }

    @Override // com.scandit.datacapture.barcode.selection.internal.module.capture.NativeBarcodeSelectionListener
    public void onSessionUpdated(@NotNull NativeBarcodeSelection mode, @NotNull NativeBarcodeSelectionSession session, @Nullable NativeFrameData data) {
        Intrinsics.h(mode, "mode");
        Intrinsics.h(session, "session");
        BarcodeSelection barcodeSelection = (BarcodeSelection) this.c.get();
        if (barcodeSelection != null) {
            ProxyCache proxyCache = this.proxyCache;
            ReflectionFactory reflectionFactory = Reflection.f24268a;
            Object orPut = proxyCache.getOrPut(reflectionFactory.b(NativeBarcodeSelection.class), null, mode, new D(barcodeSelection));
            Intrinsics.g(orPut, "{\n            val cached…achedFrameData)\n        }");
            this.f18025a.onSessionUpdated((BarcodeSelection) orPut, (BarcodeSelectionSession) this.proxyCache.getOrPut(reflectionFactory.b(NativeBarcodeSelectionSession.class), null, session, new E(barcodeSelection)), data != null ? (FrameData) this.proxyCache.getOrPut(reflectionFactory.b(NativeFrameData.class), null, data, new C(data)) : null);
        }
    }

    public BarcodeSelectionListenerReversedAdapter(@NotNull BarcodeSelectionListener listener, @NotNull BarcodeSelection barcodeSelection, @NotNull ProxyCache proxyCache) {
        Intrinsics.h(listener, "listener");
        Intrinsics.h(barcodeSelection, "barcodeSelection");
        Intrinsics.h(proxyCache, "proxyCache");
        this.f18025a = listener;
        this.proxyCache = proxyCache;
        this.c = new WeakReference(barcodeSelection);
    }
}
