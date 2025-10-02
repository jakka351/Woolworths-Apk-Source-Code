package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickSession;
import com.scandit.datacapture.barcode.internal.sdk.BarcodeNativeTypeFactory;
import com.scandit.datacapture.barcode.tracking.internal.module.data.NativeTrackedObject;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class D4 {

    /* renamed from: a, reason: collision with root package name */
    private final NativeBarcodePickSession f17132a;

    public D4(NativeBarcodePickSession _NativeBarcodePickSession, ProxyCache proxyCache) {
        Intrinsics.h(_NativeBarcodePickSession, "_NativeBarcodePickSession");
        Intrinsics.h(proxyCache, "proxyCache");
        this.f17132a = _NativeBarcodePickSession;
    }

    public final List a() {
        ArrayList<NativeTrackedObject> _0 = this.f17132a.getAddedTrackedObjects();
        BarcodeNativeTypeFactory barcodeNativeTypeFactory = BarcodeNativeTypeFactory.INSTANCE;
        Intrinsics.g(_0, "_0");
        return barcodeNativeTypeFactory.convertNativeTrackedObjectList(_0);
    }

    public final Map b() {
        HashMap<Integer, NativeTrackedObject> _0 = this.f17132a.getFilteredTrackedObjects();
        BarcodeNativeTypeFactory barcodeNativeTypeFactory = BarcodeNativeTypeFactory.INSTANCE;
        Intrinsics.g(_0, "_0");
        return barcodeNativeTypeFactory.convertTrackedObjectNativeMap(_0);
    }

    public final HashSet c() {
        HashSet<String> _0 = this.f17132a.getPickedObjects();
        Intrinsics.g(_0, "_0");
        return _0;
    }

    public final ArrayList d() {
        ArrayList<Integer> _0 = this.f17132a.getRemovedTrackedObjects();
        Intrinsics.g(_0, "_0");
        return _0;
    }

    public final HashSet e() {
        HashSet<String> _0 = this.f17132a.getToPickObjects();
        Intrinsics.g(_0, "_0");
        return _0;
    }

    public final Map f() {
        HashMap<Integer, NativeTrackedObject> _0 = this.f17132a.getTrackedObjects();
        BarcodeNativeTypeFactory barcodeNativeTypeFactory = BarcodeNativeTypeFactory.INSTANCE;
        Intrinsics.g(_0, "_0");
        return barcodeNativeTypeFactory.convertTrackedObjectNativeMap(_0);
    }

    public final HashSet g() {
        HashSet<String> _0 = this.f17132a.getUndefinedObjects();
        Intrinsics.g(_0, "_0");
        return _0;
    }

    public final List h() {
        ArrayList<NativeTrackedObject> _0 = this.f17132a.getUpdatedTrackedObjects();
        BarcodeNativeTypeFactory barcodeNativeTypeFactory = BarcodeNativeTypeFactory.INSTANCE;
        Intrinsics.g(_0, "_0");
        return barcodeNativeTypeFactory.convertNativeTrackedObjectList(_0);
    }
}
