package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.internal.module.tracking.capture.TrackedObject;
import com.scandit.datacapture.barcode.pick.capture.BarcodePickState;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.barcode.n4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C0744n4 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Map f17857a;
    final /* synthetic */ Map b;
    final /* synthetic */ List c;
    final /* synthetic */ C0760o4 d;
    final /* synthetic */ List e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0744n4(LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, List list, C0760o4 c0760o4, List list2) {
        super(0);
        this.f17857a = linkedHashMap;
        this.b = linkedHashMap2;
        this.c = list;
        this.d = c0760o4;
        this.e = list2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Map map = this.f17857a;
        C0760o4 c0760o4 = this.d;
        for (Map.Entry entry : map.entrySet()) {
            c0760o4.e.b((TrackedObject) entry.getKey(), (BarcodePickState) entry.getValue());
        }
        Map map2 = this.b;
        C0760o4 c0760o42 = this.d;
        for (Map.Entry entry2 : map2.entrySet()) {
            c0760o42.e.a((TrackedObject) entry2.getKey(), (BarcodePickState) entry2.getValue());
        }
        List list = this.c;
        C0760o4 c0760o43 = this.d;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c0760o43.e.a(((Number) it.next()).intValue());
        }
        this.d.e.a(this.e);
        this.d.c.invoke(Boolean.valueOf(this.d.e.b()));
        return Unit.f24250a;
    }
}
