package me.oriient.internal.infra.utils.android;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.StateFlowKt;

/* loaded from: classes7.dex */
public final class b extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f24989a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(f fVar) {
        super(0);
        this.f24989a = fVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return StateFlowKt.a(Boolean.valueOf(((SystemPermissionChecker) this.f24989a.c.getD()).isLocationPermissionGranted()));
    }
}
