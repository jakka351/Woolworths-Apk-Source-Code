package me.oriient.internal.services.dataManager.plai;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.services.dataManager.CachedDataStatus;

/* renamed from: me.oriient.internal.services.dataManager.plai.t, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1369t extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final C1369t f25312a = new C1369t();

    public C1369t() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List products = (List) obj;
        Intrinsics.h(products, "products");
        return new C1365o(products, CachedDataStatus.VALID);
    }
}
