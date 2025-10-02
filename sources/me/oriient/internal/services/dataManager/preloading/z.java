package me.oriient.internal.services.dataManager.preloading;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class z extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DataPreloadingManagerImpl f25389a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(DataPreloadingManagerImpl dataPreloadingManagerImpl) {
        super(0);
        this.f25389a = dataPreloadingManagerImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.f25389a.getCoroutineContextProvider().newSingleThreadCoroutineContext();
    }
}
