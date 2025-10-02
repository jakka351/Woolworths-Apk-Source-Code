package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.find.capture.BarcodeFindItem;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class N1 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ P1 f17244a;
    final /* synthetic */ Map b;
    final /* synthetic */ Collection c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N1(P1 p1, Map map, Set set) {
        super(0);
        this.f17244a = p1;
        this.b = map;
        this.c = set;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        S5 s5 = this.f17244a.h;
        Map map = this.b;
        Collection collection = this.c;
        ArrayList arrayList = new ArrayList(map.size());
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            BarcodeFindItem barcodeFindItem = (BarcodeFindItem) ((Map.Entry) it.next()).getValue();
            arrayList.add(new C0914x5(barcodeFindItem, collection.contains(barcodeFindItem)));
        }
        s5.a(arrayList);
        return Unit.f24250a;
    }
}
