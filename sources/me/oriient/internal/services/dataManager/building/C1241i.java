package me.oriient.internal.services.dataManager.building;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: me.oriient.internal.services.dataManager.building.i, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1241i extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f25105a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1241i(String str) {
        super(0);
        this.f25105a = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return androidx.constraintlayout.core.state.a.s("buildingClientId", this.f25105a);
    }
}
