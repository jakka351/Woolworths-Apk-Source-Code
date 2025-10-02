package com.scandit.datacapture.barcode;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.scandit.datacapture.barcode.internal.module.pick.ui.guidances.BarcodePickGuidanceHandler;
import com.scandit.datacapture.core.internal.sdk.extensions.ViewExtensionsKt;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
final class S3 extends FrameLayout implements BarcodePickGuidanceHandler {
    private int b;
    private final Lazy c;
    private boolean d;
    private boolean e;
    private final Lazy f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S3(Context context, InterfaceC0732m8 loadingViewFactory, InterfaceC0667i7 guidanceViewFactory) {
        super(context);
        Intrinsics.h(context, "context");
        Intrinsics.h(loadingViewFactory, "loadingViewFactory");
        Intrinsics.h(guidanceViewFactory, "guidanceViewFactory");
        this.b = 1;
        this.c = LazyKt.b(new P3(loadingViewFactory));
        this.f = LazyKt.b(new N3(guidanceViewFactory));
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.guidances.BarcodePickGuidanceHandler
    public final View getView() {
        return this;
    }

    public static final InterfaceC0635g7 a(S3 s3) {
        return (InterfaceC0635g7) s3.f.getD();
    }

    public static final View b(S3 s3) {
        return (View) s3.c.getD();
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.guidances.BarcodePickGuidanceHandler
    public final void c(boolean z, String text) {
        Intrinsics.h(text, "text");
        if (z) {
            this.b = 4;
        } else if (this.b != 4) {
            return;
        } else {
            this.b = 1;
        }
        ViewExtensionsKt.runOnMainThread(this, new Q3(z, this, text, false));
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.guidances.BarcodePickGuidanceHandler
    public final void a() {
        ViewExtensionsKt.runOnMainThread(this, new O3(this));
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.guidances.BarcodePickGuidanceHandler
    public final void b() {
        ViewExtensionsKt.runOnMainThread(this, new R3(this));
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.guidances.BarcodePickGuidanceHandler
    public final void a(boolean z, String text) {
        Intrinsics.h(text, "text");
        if (z) {
            this.b = 3;
        } else if (this.b != 3) {
            return;
        } else {
            this.b = 1;
        }
        ViewExtensionsKt.runOnMainThread(this, new Q3(z, this, text, true));
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.guidances.BarcodePickGuidanceHandler
    public final void b(boolean z, String text) {
        Intrinsics.h(text, "text");
        if (z) {
            this.b = 2;
        } else if (this.b != 2) {
            return;
        } else {
            this.b = 1;
        }
        ViewExtensionsKt.runOnMainThread(this, new Q3(z, this, text, false));
    }
}
