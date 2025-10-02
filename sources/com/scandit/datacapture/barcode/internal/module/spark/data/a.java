package com.scandit.datacapture.barcode.internal.module.spark.data;

import com.scandit.datacapture.barcode.Fa;
import com.scandit.datacapture.barcode.Za;
import com.scandit.datacapture.barcode.spark.ui.SparkScanScanningMode;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
final class a implements Fa {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f17774a;

    public a(SparkScanStateManager owner) {
        Intrinsics.h(owner, "owner");
        this.f17774a = new WeakReference(owner);
    }

    @Override // com.scandit.datacapture.barcode.Fa
    public final void a(SparkScanScanningMode previousMode, SparkScanScanningMode newMode) {
        CopyOnWriteArraySet copyOnWriteArraySet;
        Intrinsics.h(previousMode, "previousMode");
        Intrinsics.h(newMode, "newMode");
        SparkScanStateManager sparkScanStateManager = (SparkScanStateManager) this.f17774a.get();
        if (sparkScanStateManager == null || (copyOnWriteArraySet = sparkScanStateManager.t) == null) {
            return;
        }
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((Za) it.next()).a(previousMode, newMode);
        }
    }
}
