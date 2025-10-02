package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.internal.module.spark.data.SparkScanStateManager;
import com.scandit.datacapture.core.source.TorchState;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;

/* renamed from: com.scandit.datacapture.barcode.bb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C0539bb extends ObservableProperty {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ SparkScanStateManager f17389a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0539bb(TorchState torchState, SparkScanStateManager sparkScanStateManager) {
        super(torchState);
        this.f17389a = sparkScanStateManager;
    }

    @Override // kotlin.properties.ObservableProperty
    public final void afterChange(KProperty property, Object obj, Object obj2) {
        Intrinsics.h(property, "property");
        this.f17389a.s().b((TorchState) obj2);
    }
}
