package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.internal.module.spark.ui.SparkScanViewUISettings;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.pd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC0784pd {
    public static final int a(SparkScanViewUISettings sparkScanViewUISettings) {
        Intrinsics.h(sparkScanViewUISettings, "<this>");
        List listR = CollectionsKt.R(Boolean.valueOf(sparkScanViewUISettings.p()), Boolean.valueOf(sparkScanViewUISettings.g()), Boolean.valueOf(sparkScanViewUISettings.h()), Boolean.valueOf(sparkScanViewUISettings.b()), Boolean.valueOf(sparkScanViewUISettings.t()), Boolean.valueOf(sparkScanViewUISettings.a()), Boolean.valueOf(sparkScanViewUISettings.j()), Boolean.valueOf(sparkScanViewUISettings.m()), Boolean.valueOf(sparkScanViewUISettings.c()));
        int i = 0;
        if ((listR instanceof Collection) && listR.isEmpty()) {
            return 0;
        }
        Iterator it = listR.iterator();
        while (it.hasNext()) {
            if (((Boolean) it.next()).booleanValue() && (i = i + 1) < 0) {
                CollectionsKt.y0();
                throw null;
            }
        }
        return i;
    }
}
