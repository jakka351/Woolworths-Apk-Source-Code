package me.oriient.ipssdk.realtime.ofs;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import me.oriient.ipssdk.base.di.DependencyInjectionKt;
import me.oriient.ipssdk.realtime.ips.proximity.local.LocalProximityEventWrapperImpl;
import me.oriient.ipssdk.realtime.ips.proximity.local.LocalProximityLocationResolverFactory;

/* renamed from: me.oriient.ipssdk.realtime.ofs.x2, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1748x2 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LocalProximityEventWrapperImpl f26173a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1748x2(LocalProximityEventWrapperImpl localProximityEventWrapperImpl) {
        super(0);
        this.f26173a = localProximityEventWrapperImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return ((LocalProximityLocationResolverFactory) DependencyInjectionKt.getDi().get(Reflection.f24268a.b(LocalProximityLocationResolverFactory.class))).createResolver(this.f26173a.getEvent());
    }
}
