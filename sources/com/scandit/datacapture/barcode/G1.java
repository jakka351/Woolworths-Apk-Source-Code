package com.scandit.datacapture.barcode;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class G1 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ P1 f17166a;
    final /* synthetic */ Collection b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G1(P1 p1, Set set) {
        super(0);
        this.f17166a = p1;
        this.b = set;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        S5 s5 = this.f17166a.h;
        List<C0914x5> listD = this.f17166a.h.d();
        Collection collection = this.b;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(listD, 10));
        for (C0914x5 c0914x5 : listD) {
            arrayList.add(C0914x5.a(c0914x5, collection.contains(c0914x5.c())));
        }
        s5.a(arrayList);
        this.f17166a.h.a(true, false);
        if (this.f17166a.h()) {
            this.f17166a.h.setVisibility(0);
        }
        return Unit.f24250a;
    }
}
