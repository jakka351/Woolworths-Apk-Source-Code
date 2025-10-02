package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.find.capture.BarcodeFindItem;
import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class N5 implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ BarcodeFindItem f17247a;

    public N5(BarcodeFindItem barcodeFindItem) {
        this.f17247a = barcodeFindItem;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ComparisonsKt.a(Boolean.valueOf(Intrinsics.c(((C0914x5) obj2).c(), this.f17247a)), Boolean.valueOf(Intrinsics.c(((C0914x5) obj).c(), this.f17247a)));
    }
}
