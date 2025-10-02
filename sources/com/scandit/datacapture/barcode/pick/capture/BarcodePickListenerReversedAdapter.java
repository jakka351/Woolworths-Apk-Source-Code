package com.scandit.datacapture.barcode.pick.capture;

import com.scandit.datacapture.barcode.internal.module.pick.capture.BarcodePickInternal;
import com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePick;
import com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickPublicListener;
import com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickPublicSession;
import com.scandit.datacapture.barcode.internal.sdk.BarcodeNativeTypeFactory;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\u000f\u001a\u00020\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0016"}, d2 = {"Lcom/scandit/datacapture/barcode/pick/capture/BarcodePickListenerReversedAdapter;", "Lcom/scandit/datacapture/barcode/internal/module/pick/capture/NativeBarcodePickPublicListener;", "Lcom/scandit/datacapture/barcode/internal/module/pick/capture/NativeBarcodePick;", "mode", "Lcom/scandit/datacapture/barcode/internal/module/pick/capture/NativeBarcodePickPublicSession;", "session", "", "onSessionUpdated", "onObservationStarted", "onObservationStopped", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_barcode_capture", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "Lcom/scandit/datacapture/barcode/pick/capture/BarcodePickListener;", "_BarcodePickListener", "Lcom/scandit/datacapture/barcode/internal/module/pick/capture/BarcodePickInternal;", "_BarcodePickInternal", "<init>", "(Lcom/scandit/datacapture/barcode/pick/capture/BarcodePickListener;Lcom/scandit/datacapture/barcode/internal/module/pick/capture/BarcodePickInternal;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class BarcodePickListenerReversedAdapter extends NativeBarcodePickPublicListener {

    /* renamed from: a, reason: collision with root package name */
    private final BarcodePickListener f17891a;

    /* renamed from: b, reason: from kotlin metadata */
    private final ProxyCache proxyCache;
    private final WeakReference c;

    public /* synthetic */ BarcodePickListenerReversedAdapter(BarcodePickListener barcodePickListener, BarcodePickInternal barcodePickInternal, ProxyCache proxyCache, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(barcodePickListener, barcodePickInternal, (i & 4) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }

    @NotNull
    /* renamed from: getProxyCache$scandit_barcode_capture, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickPublicListener
    public void onObservationStarted(@NotNull NativeBarcodePick mode) {
        Intrinsics.h(mode, "mode");
        if (((BarcodePickInternal) this.c.get()) != null) {
            this.f17891a.onObservationStarted(BarcodeNativeTypeFactory.INSTANCE.convert(mode));
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickPublicListener
    public void onObservationStopped(@NotNull NativeBarcodePick mode) {
        Intrinsics.h(mode, "mode");
        if (((BarcodePickInternal) this.c.get()) != null) {
            this.f17891a.onObservationStopped(BarcodeNativeTypeFactory.INSTANCE.convert(mode));
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickPublicListener
    public void onSessionUpdated(@NotNull NativeBarcodePick mode, @NotNull NativeBarcodePickPublicSession session) {
        Intrinsics.h(mode, "mode");
        Intrinsics.h(session, "session");
        BarcodePickInternal barcodePickInternal = (BarcodePickInternal) this.c.get();
        if (barcodePickInternal != null) {
            this.f17891a.onSessionUpdated(BarcodeNativeTypeFactory.INSTANCE.convert(mode), (BarcodePickSession) this.proxyCache.getOrPut(Reflection.f24268a.b(NativeBarcodePickPublicSession.class), null, session, new b(barcodePickInternal)));
        }
    }

    public BarcodePickListenerReversedAdapter(@NotNull BarcodePickListener _BarcodePickListener, @NotNull BarcodePickInternal _BarcodePickInternal, @NotNull ProxyCache proxyCache) {
        Intrinsics.h(_BarcodePickListener, "_BarcodePickListener");
        Intrinsics.h(_BarcodePickInternal, "_BarcodePickInternal");
        Intrinsics.h(proxyCache, "proxyCache");
        this.f17891a = _BarcodePickListener;
        this.proxyCache = proxyCache;
        this.c = new WeakReference(_BarcodePickInternal);
    }
}
