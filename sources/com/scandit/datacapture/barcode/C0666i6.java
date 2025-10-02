package com.scandit.datacapture.barcode;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.i6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C0666i6 implements InterfaceC0795q6 {

    /* renamed from: a, reason: collision with root package name */
    private ArrayList f17705a = new ArrayList();

    public final void a(InterfaceC0795q6... newDisposables) {
        Intrinsics.h(newDisposables, "newDisposables");
        this.f17705a.addAll(ArraysKt.F(newDisposables));
    }

    @Override // com.scandit.datacapture.barcode.InterfaceC0795q6
    public final void a() {
        Iterator it = this.f17705a.iterator();
        while (it.hasNext()) {
            ((InterfaceC0795q6) it.next()).a();
        }
        this.f17705a.clear();
    }
}
