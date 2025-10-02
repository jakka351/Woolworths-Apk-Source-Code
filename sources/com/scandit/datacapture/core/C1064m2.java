package com.scandit.datacapture.core;

import com.scandit.datacapture.core.component.DataCaptureComponent;
import com.scandit.datacapture.core.internal.sdk.component.NativeDataCaptureComponent;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.core.m2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C1064m2 implements DataCaptureComponent {

    /* renamed from: a, reason: collision with root package name */
    private final NativeDataCaptureComponent f18805a;
    private final String b;

    public C1064m2(NativeDataCaptureComponent impl) {
        Intrinsics.h(impl, "impl");
        this.f18805a = impl;
        String identifier = impl.getIdentifier();
        Intrinsics.g(identifier, "impl.identifier");
        this.b = identifier;
    }

    @Override // com.scandit.datacapture.core.component.DataCaptureComponent, com.scandit.datacapture.barcode.generator.BarcodeGeneratorProxy
    public final NativeDataCaptureComponent _dataCaptureComponentImpl() {
        return this.f18805a;
    }

    @Override // com.scandit.datacapture.core.component.DataCaptureComponent, com.scandit.datacapture.barcode.generator.BarcodeGeneratorProxy
    public final String getId() {
        return this.b;
    }
}
