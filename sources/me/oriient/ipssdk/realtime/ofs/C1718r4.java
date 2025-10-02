package me.oriient.ipssdk.realtime.ofs;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import me.oriient.ipssdk.base.di.DependencyInjectionKt;
import me.oriient.ipssdk.realtime.ips.SdkNavigationPositioningProvider;

/* renamed from: me.oriient.ipssdk.realtime.ofs.r4, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1718r4 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C1718r4 f26140a = new C1718r4();

    public C1718r4() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return (SdkNavigationPositioningProvider) DependencyInjectionKt.getDi().get(Reflection.f24268a.b(SdkNavigationPositioningProvider.class));
    }
}
