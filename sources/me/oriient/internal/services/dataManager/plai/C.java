package me.oriient.internal.services.dataManager.plai;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class C extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final C f25276a = new C();

    public C() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List it = (List) obj;
        Intrinsics.h(it, "it");
        return CollectionsKt.G(it);
    }
}
