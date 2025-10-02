package com.scandit.datacapture.barcode.internal.module.count.capture;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class InternalBarcodeCountSessionCallback {

    /* renamed from: a, reason: collision with root package name */
    private final Function0 f17716a;
    private final Function0 b;
    private final Function2 c;

    public InternalBarcodeCountSessionCallback(Function0 reset, Function0 toJson, Function2 getSpatialMap) {
        Intrinsics.h(reset, "reset");
        Intrinsics.h(toJson, "toJson");
        Intrinsics.h(getSpatialMap, "getSpatialMap");
        this.f17716a = reset;
        this.b = toJson;
        this.c = getSpatialMap;
    }

    public final Function2 a() {
        return this.c;
    }

    public final Function0 b() {
        return this.f17716a;
    }

    public final Function0 c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InternalBarcodeCountSessionCallback)) {
            return false;
        }
        InternalBarcodeCountSessionCallback internalBarcodeCountSessionCallback = (InternalBarcodeCountSessionCallback) obj;
        return Intrinsics.c(this.f17716a, internalBarcodeCountSessionCallback.f17716a) && Intrinsics.c(this.b, internalBarcodeCountSessionCallback.b) && Intrinsics.c(this.c, internalBarcodeCountSessionCallback.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f17716a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "InternalBarcodeCountSessionCallback(reset=" + this.f17716a + ", toJson=" + this.b + ", getSpatialMap=" + this.c + ')';
    }
}
