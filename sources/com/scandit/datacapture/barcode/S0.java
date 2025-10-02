package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewLayout;
import com.scandit.datacapture.barcode.internal.module.find.ui.overlay.BarcodeFindGuidanceHandler;
import com.scandit.datacapture.core.internal.module.ui.NativeToastHintStyle;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class S0 implements BarcodeFindGuidanceHandler {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f17294a;
    private int b;

    public S0(P1 viewLayout) {
        Intrinsics.h(viewLayout, "viewLayout");
        this.f17294a = new WeakReference(viewLayout);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.overlay.BarcodeFindGuidanceHandler
    public final void a(boolean z, String text) {
        Intrinsics.h(text, "text");
        if (z) {
            if (2 != this.b) {
                BarcodeFindViewLayout barcodeFindViewLayout = (BarcodeFindViewLayout) this.f17294a.get();
                if (barcodeFindViewLayout != null) {
                    barcodeFindViewLayout.b(text);
                }
                this.b = 2;
                return;
            }
            return;
        }
        if (2 == this.b) {
            BarcodeFindViewLayout barcodeFindViewLayout2 = (BarcodeFindViewLayout) this.f17294a.get();
            if (barcodeFindViewLayout2 != null) {
                barcodeFindViewLayout2.k();
            }
            this.b = 0;
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.overlay.BarcodeFindGuidanceHandler
    public final void b(boolean z, String text) {
        Intrinsics.h(text, "text");
        if (z) {
            if (1 != this.b) {
                BarcodeFindViewLayout barcodeFindViewLayout = (BarcodeFindViewLayout) this.f17294a.get();
                if (barcodeFindViewLayout != null) {
                    barcodeFindViewLayout.a(text);
                }
                this.b = 1;
                return;
            }
            return;
        }
        if (1 == this.b) {
            BarcodeFindViewLayout barcodeFindViewLayout2 = (BarcodeFindViewLayout) this.f17294a.get();
            if (barcodeFindViewLayout2 != null) {
                barcodeFindViewLayout2.k();
            }
            this.b = 0;
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.overlay.BarcodeFindGuidanceHandler
    public final void c(boolean z, String text) {
        Intrinsics.h(text, "text");
        if (!z) {
            BarcodeFindViewLayout barcodeFindViewLayout = (BarcodeFindViewLayout) this.f17294a.get();
            if (barcodeFindViewLayout != null) {
                barcodeFindViewLayout.c("item_list_updated");
                return;
            }
            return;
        }
        WeakReference weakReference = this.f17294a;
        NativeToastHintStyle nativeToastHintStyle = NativeToastHintStyle.INFO;
        BarcodeFindViewLayout barcodeFindViewLayout2 = (BarcodeFindViewLayout) weakReference.get();
        if (barcodeFindViewLayout2 != null) {
            barcodeFindViewLayout2.a(text, nativeToastHintStyle, "item_list_updated");
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.overlay.BarcodeFindGuidanceHandler
    public final void d(boolean z, String text) {
        Intrinsics.h(text, "text");
        if (z) {
            if (4 != this.b) {
                BarcodeFindViewLayout barcodeFindViewLayout = (BarcodeFindViewLayout) this.f17294a.get();
                if (barcodeFindViewLayout != null) {
                    barcodeFindViewLayout.a(text);
                }
                this.b = 4;
                return;
            }
            return;
        }
        if (4 == this.b) {
            BarcodeFindViewLayout barcodeFindViewLayout2 = (BarcodeFindViewLayout) this.f17294a.get();
            if (barcodeFindViewLayout2 != null) {
                barcodeFindViewLayout2.k();
            }
            this.b = 0;
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.overlay.BarcodeFindGuidanceHandler
    public final void e(boolean z, String text) {
        Intrinsics.h(text, "text");
        if (z) {
            if (3 != this.b) {
                BarcodeFindViewLayout barcodeFindViewLayout = (BarcodeFindViewLayout) this.f17294a.get();
                if (barcodeFindViewLayout != null) {
                    barcodeFindViewLayout.a(text);
                }
                this.b = 3;
                return;
            }
            return;
        }
        if (3 == this.b) {
            BarcodeFindViewLayout barcodeFindViewLayout2 = (BarcodeFindViewLayout) this.f17294a.get();
            if (barcodeFindViewLayout2 != null) {
                barcodeFindViewLayout2.k();
            }
            this.b = 0;
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.overlay.BarcodeFindGuidanceHandler
    public final void f(boolean z, String text) {
        Intrinsics.h(text, "text");
        if (!z) {
            BarcodeFindViewLayout barcodeFindViewLayout = (BarcodeFindViewLayout) this.f17294a.get();
            if (barcodeFindViewLayout != null) {
                barcodeFindViewLayout.c("all_items_found");
                return;
            }
            return;
        }
        WeakReference weakReference = this.f17294a;
        NativeToastHintStyle nativeToastHintStyle = NativeToastHintStyle.SUCCESS;
        BarcodeFindViewLayout barcodeFindViewLayout2 = (BarcodeFindViewLayout) weakReference.get();
        if (barcodeFindViewLayout2 != null) {
            barcodeFindViewLayout2.a(text, nativeToastHintStyle, "all_items_found");
        }
    }
}
