package me.oriient.internal.infra.utils;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import me.oriient.internal.di.InternalDiKt;
import me.oriient.internal.infra.locationManager.SystemLocationManagerFactory;

/* loaded from: classes7.dex */
public final class d extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final d f25009a = new d();

    public d() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return ((SystemLocationManagerFactory) InternalDiKt.getDi().get(Reflection.f24268a.b(SystemLocationManagerFactory.class))).createReadOnly();
    }
}
