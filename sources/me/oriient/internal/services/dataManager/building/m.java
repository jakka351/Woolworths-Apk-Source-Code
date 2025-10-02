package me.oriient.internal.services.dataManager.building;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class m extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final m f25109a = new m();

    public m() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List it = (List) obj;
        Intrinsics.h(it, "it");
        return new BuildingsSearchResult(it, null);
    }
}
