package me.oriient.ipssdk.realtime.ofs;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import me.oriient.ipssdk.base.di.DependencyInjectionKt;
import me.oriient.navigation.common.NavigationManager;

/* renamed from: me.oriient.ipssdk.realtime.ofs.o4, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1701o4 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C1701o4 f26123a = new C1701o4();

    public C1701o4() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return (NavigationManager) DependencyInjectionKt.getDi().get(Reflection.f24268a.b(NavigationManager.class));
    }
}
