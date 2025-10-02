package com.scandit.datacapture.barcode.internal.module.pick.capture;

import com.scandit.datacapture.barcode.B4;
import com.scandit.datacapture.barcode.C0943z4;
import com.scandit.datacapture.barcode.internal.module.tracking.capture.TrackedObject;
import com.scandit.datacapture.barcode.pick.capture.BarcodePick;
import com.scandit.datacapture.barcode.pick.capture.BarcodePickActionListener;
import com.scandit.datacapture.barcode.pick.capture.BarcodePickActionListenerKt;
import com.scandit.datacapture.barcode.pick.capture.BarcodePickListenerReversedAdapter;
import com.scandit.datacapture.barcode.pick.capture.BarcodePickScanningListener;
import com.scandit.datacapture.barcode.pick.capture.BarcodePickScanningListenerReversedAdapter;
import com.scandit.datacapture.barcode.pick.capture.BarcodePickScanningSession;
import com.scandit.datacapture.barcode.pick.capture.BarcodePickSelectItemActionCallback;
import com.scandit.datacapture.barcode.pick.capture.BarcodePickSelectItemActionCallbackKt;
import com.scandit.datacapture.barcode.pick.capture.BarcodePickSettings;
import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.capture.DataCaptureMode;
import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureMode;
import com.scandit.datacapture.core.internal.sdk.common.async.NativeWrappedFuture;
import com.scandit.datacapture.core.internal.sdk.extensions.NativeExtensionsKt;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class BarcodePickInternal implements DataCaptureMode {

    /* renamed from: a, reason: collision with root package name */
    private final BarcodePickSession f17738a;
    private final BarcodePickScanningSession b;
    private final /* synthetic */ B4 c;
    private BarcodePick d;
    private final CopyOnWriteArraySet e;
    private final CopyOnWriteArraySet f;
    private final CopyOnWriteArraySet g;
    private final CopyOnWriteArraySet h;
    private DataCaptureContext i;

    public BarcodePickInternal(NativeBarcodePick impl, BarcodePickSession session, BarcodePickScanningSession scanningSession) {
        Intrinsics.h(impl, "impl");
        Intrinsics.h(session, "session");
        Intrinsics.h(scanningSession, "scanningSession");
        this.f17738a = session;
        this.b = scanningSession;
        this.c = new B4(impl);
        this.e = new CopyOnWriteArraySet();
        this.f = new CopyOnWriteArraySet();
        this.g = new CopyOnWriteArraySet();
        this.h = new CopyOnWriteArraySet();
        this.i = f();
        impl.addListenerAsync(new C0943z4(new f(this), this));
        impl.addActionListenerAsync(BarcodePickActionListenerKt.asNative(new c(this)));
        impl.addScanningListenerAsync(new BarcodePickScanningListenerReversedAdapter(new e(this), this, null, 4, null));
        impl.addPublicListenerAsync(new BarcodePickListenerReversedAdapter(new d(this), this, null, 4, null));
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureMode, com.scandit.datacapture.barcode.capture.BarcodeCaptureProxy
    public final NativeDataCaptureMode _dataCaptureModeImpl() {
        return this.c.a();
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureMode
    public final void _setDataCaptureContext(DataCaptureContext dataCaptureContext) {
        this.i = dataCaptureContext;
    }

    public final NativeBarcodePick a() {
        return this.c.b();
    }

    public final BarcodePickSession d() {
        return this.f17738a;
    }

    public final BarcodePick e() {
        BarcodePick barcodePick = this.d;
        if (barcodePick != null) {
            return barcodePick;
        }
        BarcodePick barcodePick2 = new BarcodePick(this);
        this.d = barcodePick2;
        return barcodePick2;
    }

    public final DataCaptureContext f() {
        return this.c.c();
    }

    public final /* synthetic */ CopyOnWriteArraySet g() {
        return this.f;
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureMode
    /* renamed from: getDataCaptureContext */
    public final DataCaptureContext getC() {
        return this.i;
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureMode, com.scandit.datacapture.barcode.capture.BarcodeCaptureProxy
    public final boolean isEnabled() {
        return this.c.d();
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureMode, com.scandit.datacapture.barcode.capture.BarcodeCaptureProxy
    public final void setEnabled(boolean z) {
        this.c.a(z);
    }

    public final void a(BarcodePickSettings settings, Runnable runnable) {
        Intrinsics.h(settings, "settings");
        NativeWrappedFuture nativeWrappedFutureApplySettingsWrapped = this.c.b().applySettingsWrapped(settings._impl());
        Intrinsics.g(nativeWrappedFutureApplySettingsWrapped, "_impl().applySettingsWrapped(settings._impl())");
        NativeExtensionsKt.andThen(nativeWrappedFutureApplySettingsWrapped, runnable);
    }

    public final com.scandit.datacapture.barcode.pick.capture.BarcodePickSession b() {
        return new com.scandit.datacapture.barcode.pick.capture.BarcodePickSession(new g(this));
    }

    public final BarcodePickScanningSession c() {
        return this.b;
    }

    public final void b(BarcodePickListener listener) {
        Intrinsics.h(listener, "listener");
        if (this.e.remove(listener)) {
            listener.b(this);
        }
    }

    public final void a(String itemData, boolean z) {
        Intrinsics.h(itemData, "itemData");
        this.c.a(itemData, z);
    }

    public final void b(BarcodePickActionListener listener) {
        Intrinsics.h(listener, "listener");
        this.f.remove(listener);
    }

    public final void a(BarcodePick value) {
        Intrinsics.h(value, "value");
        this.d = value;
    }

    public final boolean b(BarcodePickScanningListener listener) {
        Intrinsics.h(listener, "listener");
        return this.g.remove(listener);
    }

    public final void a(BarcodePickListener listener) {
        Intrinsics.h(listener, "listener");
        if (this.e.add(listener)) {
            listener.a(this);
        }
    }

    public final boolean b(com.scandit.datacapture.barcode.pick.capture.BarcodePickListener listener) {
        Intrinsics.h(listener, "listener");
        return this.h.remove(listener);
    }

    public final void a(BarcodePickActionListener listener) {
        Intrinsics.h(listener, "listener");
        this.f.add(listener);
    }

    public final boolean a(BarcodePickScanningListener listener) {
        Intrinsics.h(listener, "listener");
        return this.g.add(listener);
    }

    public final boolean a(com.scandit.datacapture.barcode.pick.capture.BarcodePickListener listener) {
        Intrinsics.h(listener, "listener");
        return this.h.add(listener);
    }

    public final void a(TrackedObject track, BarcodePickSelectItemActionCallback barcodePickSelectItemActionCallback) {
        Intrinsics.h(track, "track");
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((BarcodePickListener) it.next()).a(track);
        }
        this.c.b().handleTapAsync(track.a(), barcodePickSelectItemActionCallback != null ? BarcodePickSelectItemActionCallbackKt.asNative(barcodePickSelectItemActionCallback) : null);
    }

    public /* synthetic */ BarcodePickInternal(NativeBarcodePick nativeBarcodePick) {
        this(nativeBarcodePick, new BarcodePickSession(new a(nativeBarcodePick)), new BarcodePickScanningSession(new b(nativeBarcodePick)));
    }
}
