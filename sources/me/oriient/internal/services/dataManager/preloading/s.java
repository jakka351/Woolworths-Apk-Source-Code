package me.oriient.internal.services.dataManager.preloading;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class s extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f25382a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(String str) {
        super(0);
        this.f25382a = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return androidx.constraintlayout.core.state.a.s("buildingId", this.f25382a);
    }
}
