package me.oriient.ipssdk.common.ofs;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import me.oriient.internal.infra.rest.RestService;
import me.oriient.internal.services.auth.AuthenticatedRestServiceImpl;
import me.oriient.internal.services.auth.UnauthenticatedRestService;
import me.oriient.ipssdk.base.di.DependencyInjectionKt;

/* renamed from: me.oriient.ipssdk.common.ofs.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1548f extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C1548f f25747a = new C1548f();

    public C1548f() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new AuthenticatedRestServiceImpl((RestService) DependencyInjectionKt.getDi().get(Reflection.f24268a.b(UnauthenticatedRestService.class)));
    }
}
