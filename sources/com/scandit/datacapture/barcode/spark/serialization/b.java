package com.scandit.datacapture.barcode.spark.serialization;

import com.scandit.datacapture.barcode.spark.capture.SparkScan;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class b extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final b f18118a = new b();

    public b() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new SparkScan();
    }
}
