package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanViewDefaults;
import com.scandit.datacapture.core.internal.sdk.common.graphics.NativeColor;
import com.scandit.datacapture.core.internal.sdk.extensions.NativeColorExtensionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.qb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC0800qb {

    /* renamed from: a, reason: collision with root package name */
    private final int f17982a;
    private final int b;

    public /* synthetic */ AbstractC0800qb(int i) {
        this();
    }

    public int a() {
        return this.b;
    }

    public int b() {
        return this.f17982a;
    }

    private AbstractC0800qb() {
        NativeColor nativeColorDefaultToastTextColor = NativeSparkScanViewDefaults.defaultToastTextColor();
        Intrinsics.g(nativeColorDefaultToastTextColor, "defaultToastTextColor()");
        this.f17982a = NativeColorExtensionsKt.toInt(nativeColorDefaultToastTextColor);
        NativeColor nativeColorDefaultToastBackgroundColor = NativeSparkScanViewDefaults.defaultToastBackgroundColor();
        Intrinsics.g(nativeColorDefaultToastBackgroundColor, "defaultToastBackgroundColor()");
        this.b = NativeColorExtensionsKt.toInt(nativeColorDefaultToastBackgroundColor);
    }
}
