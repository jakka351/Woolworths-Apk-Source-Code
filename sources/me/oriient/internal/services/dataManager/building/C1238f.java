package me.oriient.internal.services.dataManager.building;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: me.oriient.internal.services.dataManager.building.f, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1238f extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f25102a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1238f(String str) {
        super(0);
        this.f25102a = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return androidx.constraintlayout.core.state.a.s("buildingId", this.f25102a);
    }
}
