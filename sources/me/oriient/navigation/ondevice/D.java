package me.oriient.navigation.ondevice;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes8.dex */
public final class D extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f26274a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(String str) {
        super(0);
        this.f26274a = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return androidx.constraintlayout.core.state.a.s("buildingId", this.f26274a);
    }
}
