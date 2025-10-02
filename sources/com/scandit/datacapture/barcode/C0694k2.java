package com.scandit.datacapture.barcode;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.barcode.k2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C0694k2 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C0710l2 f17828a;
    final /* synthetic */ long b;
    final /* synthetic */ List c;
    final /* synthetic */ List d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0694k2(C0710l2 c0710l2, long j, List list, ArrayList arrayList) {
        super(0);
        this.f17828a = c0710l2;
        this.b = j;
        this.c = list;
        this.d = arrayList;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        long j = this.f17828a.g;
        long j2 = this.b;
        if (j != j2) {
            this.f17828a.g = j2;
            this.f17828a.b();
        }
        C0710l2.b(this.f17828a, this.c);
        C0710l2.a(this.f17828a, this.d);
        return Unit.f24250a;
    }
}
