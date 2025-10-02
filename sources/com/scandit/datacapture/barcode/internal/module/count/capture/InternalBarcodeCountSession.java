package com.scandit.datacapture.barcode.internal.module.count.capture;

import com.scandit.datacapture.barcode.M7;
import com.scandit.datacapture.barcode.count.capture.map.BarcodeSpatialGrid;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountSession;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeSpatialGrid;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class InternalBarcodeCountSession {

    /* renamed from: a, reason: collision with root package name */
    private final Function0 f17715a;
    private final Lazy b;

    public InternalBarcodeCountSession(Function0 getImpl) {
        Intrinsics.h(getImpl, "getImpl");
        this.f17715a = getImpl;
        this.b = LazyKt.b(new a(this));
    }

    private final M7 b() {
        return (M7) this.b.getD();
    }

    public final long c() {
        return b().b();
    }

    public final boolean d() {
        return b().c();
    }

    public final Map e() {
        return b().d();
    }

    public final void f() {
        b().e();
    }

    public final String g() {
        return b().f();
    }

    public final NativeBarcodeCountSession a() {
        return (NativeBarcodeCountSession) this.f17715a.invoke();
    }

    public final BarcodeSpatialGrid a(int i, int i2) {
        NativeBarcodeSpatialGrid spatialMap = b().a().getSpatialMap(i, i2);
        if (spatialMap != null) {
            return new BarcodeSpatialGrid(spatialMap);
        }
        return null;
    }
}
