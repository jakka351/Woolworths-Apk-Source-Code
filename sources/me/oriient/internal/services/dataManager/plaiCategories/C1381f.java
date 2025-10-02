package me.oriient.internal.services.dataManager.plaiCategories;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.services.dataManager.CachedDataStatus;

/* renamed from: me.oriient.internal.services.dataManager.plaiCategories.f, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1381f extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final C1381f f25345a = new C1381f();

    public C1381f() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List categories = (List) obj;
        Intrinsics.h(categories, "categories");
        return new C1376a(categories, CachedDataStatus.VALID);
    }
}
