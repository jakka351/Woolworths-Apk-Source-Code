package com.scandit.datacapture.barcode;

import android.os.Handler;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountStatusListener;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
final class T extends NativeBarcodeCountStatusListener {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f17299a;

    public T(C0544c0 owner) {
        Intrinsics.h(owner, "owner");
        this.f17299a = new WeakReference(owner);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(T this$0) {
        O oJ;
        Intrinsics.h(this$0, "this$0");
        C0544c0 c0544c0 = (C0544c0) this$0.f17299a.get();
        if (c0544c0 == null || (oJ = c0544c0.j()) == null) {
            return;
        }
        oJ.a(false);
    }

    @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountStatusListener
    public final void onAbortStatusMode() {
        Handler handler;
        C0544c0 c0544c0 = (C0544c0) this.f17299a.get();
        if (c0544c0 == null || (handler = c0544c0.t) == null) {
            return;
        }
        handler.post(new kf(this, 0));
    }

    @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountStatusListener
    public final void onBarcodeStatusesReady(ArrayList arrayList) {
        C0544c0 c0544c0;
        O oJ;
        if (arrayList == null || (c0544c0 = (C0544c0) this.f17299a.get()) == null || (oJ = c0544c0.j()) == null) {
            return;
        }
        oJ.a(arrayList);
    }

    @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountStatusListener
    public final void onHideLoading() {
        C0544c0 c0544c0 = (C0544c0) this.f17299a.get();
        if (c0544c0 != null) {
            ((C0602e6) c0544c0.d).a(true, (Function0) X5.f17343a);
            ((C8) c0544c0.j).a(false, "", (Function0) C0827s8.f18002a);
            if (c0544c0.v) {
                return;
            }
            ((Z9) c0544c0.f17395a).c(true, (Function0) M9.f17239a);
        }
    }

    @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountStatusListener
    public final void onShowLoading() {
        C0544c0 c0544c0 = (C0544c0) this.f17299a.get();
        if (c0544c0 != null) {
            ((C0602e6) c0544c0.d).a(false, (Function0) X5.f17343a);
            ((C8) c0544c0.j).a(true, c0544c0.n, (Function0) C0827s8.f18002a);
            ((Z9) c0544c0.f17395a).c(false, (Function0) M9.f17239a);
        }
    }
}
