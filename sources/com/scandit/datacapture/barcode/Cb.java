package com.scandit.datacapture.barcode;

import com.scandit.datacapture.core.internal.sdk.source.NativeAndroidCamera;
import com.scandit.datacapture.core.source.Camera;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class Cb extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C0540bc f17123a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Cb(C0540bc c0540bc) {
        super(1);
        this.f17123a = c0540bc;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        NativeAndroidCamera f18831a;
        NativeAndroidCamera f18831a2;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        Camera camera = this.f17123a.e;
        if (camera != null && (f18831a2 = camera.getF18831a()) != null) {
            f18831a2.setBatterySavingMode(zBooleanValue);
        }
        Camera camera2 = this.f17123a.f;
        if (camera2 != null && (f18831a = camera2.getF18831a()) != null) {
            f18831a.setBatterySavingMode(zBooleanValue);
        }
        return Unit.f24250a;
    }
}
