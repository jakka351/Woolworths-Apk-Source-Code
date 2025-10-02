package me.oriient.ipssdk.base.di;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import me.oriient.ipssdk.base.rest.SdkOriientApiProvider;

/* loaded from: classes2.dex */
public final class f extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final f f25689a = new f();

    public f() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return (SdkOriientApiProvider) DependencyInjectionKt.getDi().get(Reflection.f24268a.b(SdkOriientApiProvider.class));
    }
}
