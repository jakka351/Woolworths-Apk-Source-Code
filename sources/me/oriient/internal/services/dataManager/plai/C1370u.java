package me.oriient.internal.services.dataManager.plai;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.services.dataManager.CachedDataStatus;

/* renamed from: me.oriient.internal.services.dataManager.plai.u, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1370u extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final C1370u f25313a = new C1370u();

    public C1370u() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List products = (List) obj;
        Intrinsics.h(products, "products");
        return new C1365o(products, CachedDataStatus.REFRESH_RECOMMENDED);
    }
}
