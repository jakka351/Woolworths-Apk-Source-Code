package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.internal.module.spark.data.SparkScanStateManager;
import com.scandit.datacapture.core.source.CameraPosition;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;

/* renamed from: com.scandit.datacapture.barcode.cb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C0575cb extends ObservableProperty {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ SparkScanStateManager f17464a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0575cb(CameraPosition cameraPosition, SparkScanStateManager sparkScanStateManager) {
        super(cameraPosition);
        this.f17464a = sparkScanStateManager;
    }

    @Override // kotlin.properties.ObservableProperty
    public final void afterChange(KProperty property, Object obj, Object obj2) {
        Intrinsics.h(property, "property");
        this.f17464a.b().b((CameraPosition) obj2);
    }
}
