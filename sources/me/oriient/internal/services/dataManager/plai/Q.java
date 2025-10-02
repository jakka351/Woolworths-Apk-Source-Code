package me.oriient.internal.services.dataManager.plai;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class Q extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ S f25288a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(S s, String str, String str2) {
        super(1);
        this.f25288a = s;
        this.b = str;
        this.c = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C1365o it = (C1365o) obj;
        Intrinsics.h(it, "it");
        return this.f25288a.a(this.b, this.c, it.f25307a);
    }
}
