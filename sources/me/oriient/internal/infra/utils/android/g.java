package me.oriient.internal.infra.utils.android;

import androidx.core.content.ContextCompat;
import kotlin.Lazy;
import kotlin.jvm.internal.Reflection;
import me.oriient.internal.di.InternalDiKt;

/* loaded from: classes7.dex */
public final class g implements SystemPermissionChecker {

    /* renamed from: a, reason: collision with root package name */
    public final Lazy f24994a = InternalDiKt.getDi().inject(Reflection.f24268a.b(ContextProvider.class));

    @Override // me.oriient.internal.infra.utils.android.SystemPermissionChecker
    public final boolean isLocationPermissionGranted() {
        return ContextCompat.a(((ContextProvider) this.f24994a.getD()).getContext(), "android.permission.ACCESS_FINE_LOCATION") == 0;
    }
}
