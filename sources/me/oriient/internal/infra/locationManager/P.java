package me.oriient.internal.infra.locationManager;

import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference0Impl;
import me.oriient.internal.infra.utils.core.time.TimeProvider;

/* loaded from: classes7.dex */
public final class P extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SystemLocationManagerFactoryImpl f24941a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(SystemLocationManagerFactoryImpl systemLocationManagerFactoryImpl) {
        super(0);
        this.f24941a = systemLocationManagerFactoryImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Context context = this.f24941a.getContextProvider().getContext();
        final TimeProvider timeProvider = this.f24941a.getTimeProvider();
        return new LocationManagerAndroid(context, new PropertyReference0Impl(timeProvider) { // from class: me.oriient.internal.infra.locationManager.O
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
            public final Object get() {
                return Long.valueOf(((TimeProvider) this.receiver).getCurrentTimeMillis());
            }
        });
    }
}
