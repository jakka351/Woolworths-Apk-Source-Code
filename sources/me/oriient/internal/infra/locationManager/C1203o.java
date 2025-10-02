package me.oriient.internal.infra.locationManager;

import android.location.LocationManager;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: me.oriient.internal.infra.locationManager.o, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1203o extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LocationManagerAndroid f24953a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1203o(LocationManagerAndroid locationManagerAndroid) {
        super(0);
        this.f24953a = locationManagerAndroid;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object systemService = this.f24953a.context.getSystemService("location");
        Intrinsics.f(systemService, "null cannot be cast to non-null type android.location.LocationManager");
        return (LocationManager) systemService;
    }
}
