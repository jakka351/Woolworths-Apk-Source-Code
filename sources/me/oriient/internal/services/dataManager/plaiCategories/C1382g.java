package me.oriient.internal.services.dataManager.plaiCategories;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.services.dataManager.CachedDataStatus;

/* renamed from: me.oriient.internal.services.dataManager.plaiCategories.g, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1382g extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final C1382g f25346a = new C1382g();

    public C1382g() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List categories = (List) obj;
        Intrinsics.h(categories, "categories");
        return new C1376a(categories, CachedDataStatus.REFRESH_RECOMMENDED);
    }
}
