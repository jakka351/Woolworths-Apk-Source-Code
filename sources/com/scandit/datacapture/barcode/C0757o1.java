package com.scandit.datacapture.barcode;

import android.view.View;
import com.scandit.datacapture.barcode.find.capture.BarcodeFindItem;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.barcode.o1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C0757o1 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ P1 f17866a;
    final /* synthetic */ BarcodeFindItem b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0757o1(P1 p1, BarcodeFindItem barcodeFindItem) {
        super(0);
        this.f17866a = p1;
        this.b = barcodeFindItem;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object next;
        List listB = this.f17866a.c.b();
        BarcodeFindItem barcodeFindItem = this.b;
        Iterator it = listB.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.c(((C0847t6) next).b(), barcodeFindItem)) {
                break;
            }
        }
        C0847t6 c0847t6 = (C0847t6) next;
        if (c0847t6 != null) {
            F0 f0 = this.f17866a.c;
            f0.getClass();
            int childCount = f0.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = f0.getChildAt(i);
                R0 r0 = childAt instanceof R0 ? (R0) childAt : null;
                if (r0 != null) {
                    if (Intrinsics.c(r0.getTag(), c0847t6)) {
                        r0.start();
                    } else {
                        r0.stop();
                    }
                }
            }
        }
        return Unit.f24250a;
    }
}
