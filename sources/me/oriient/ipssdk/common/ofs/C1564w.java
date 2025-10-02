package me.oriient.ipssdk.common.ofs;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import me.oriient.internal.services.sensorsManager.support.SupportSensorsManager;
import me.oriient.ipssdk.base.di.DependencyInjectionKt;

/* renamed from: me.oriient.ipssdk.common.ofs.w, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1564w extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C1564w f25770a = new C1564w();

    public C1564w() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return (SupportSensorsManager) DependencyInjectionKt.getDi().get(Reflection.f24268a.b(SupportSensorsManager.class));
    }
}
