package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettings;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.d3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C0583d3 {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f17593a;

    private C0583d3(boolean z) {
        this.f17593a = z;
    }

    public final boolean a() {
        return this.f17593a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0583d3(BarcodePickViewSettings settings) {
        this(settings.getDrawDebugInfo());
        Intrinsics.h(settings, "settings");
    }
}
