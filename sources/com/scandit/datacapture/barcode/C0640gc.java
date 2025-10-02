package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.internal.module.spark.ui.SparkScanViewUISettings;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.barcode.gc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C0640gc extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C0656hc f17682a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0640gc(SparkScanViewUISettings sparkScanViewUISettings, C0656hc c0656hc) {
        super(1);
        this.f17682a = c0656hc;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String it = (String) obj;
        Intrinsics.h(it, "it");
        if (it.equals("toolbarIconInactiveTintColor")) {
            C0656hc.a(this.f17682a);
        } else if (it.equals("toolbarBackgroundColor")) {
            C0656hc.b(this.f17682a);
        } else if (it.equals("captureButtonBackgroundColor")) {
            C0656hc.c(this.f17682a);
        }
        return Unit.f24250a;
    }
}
