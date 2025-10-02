package com.scandit.datacapture.barcode;

import android.content.Context;
import com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettings;
import com.scandit.datacapture.core.ui.DataCaptureView;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.r3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C0807r3 implements InterfaceC0792q3 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f17988a;

    public C0807r3(Context context) {
        Intrinsics.h(context, "context");
        this.f17988a = context;
    }

    public final DataCaptureView a(BarcodePickViewSettings settings) {
        Intrinsics.h(settings, "settings");
        DataCaptureView dataCaptureViewNewInstance = DataCaptureView.INSTANCE.newInstance(this.f17988a, null);
        dataCaptureViewNewInstance.setZoomGesture(null);
        return dataCaptureViewNewInstance;
    }
}
