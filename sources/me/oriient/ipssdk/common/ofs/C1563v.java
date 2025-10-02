package me.oriient.ipssdk.common.ofs;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import me.oriient.internal.services.sensorsManager.support.SensorsDataProviderFactory;
import me.oriient.internal.services.sensorsManager.support.SupportSensorsManagerImpl;
import me.oriient.ipssdk.base.di.DependencyInjectionKt;

/* renamed from: me.oriient.ipssdk.common.ofs.v, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1563v extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C1563v f25769a = new C1563v();

    public C1563v() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new SupportSensorsManagerImpl((SensorsDataProviderFactory) DependencyInjectionKt.getDi().get(Reflection.f24268a.b(SensorsDataProviderFactory.class)));
    }
}
