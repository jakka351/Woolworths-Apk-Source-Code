package me.oriient.ipssdk.realtime.ofs;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import me.oriient.internal.infra.utils.core.coroutines.CoroutineContextProvider;
import me.oriient.ipssdk.base.di.DependencyInjectionKt;
import me.oriient.ipssdk.realtime.services.tag.EventTaggingRestServiceImpl;

/* renamed from: me.oriient.ipssdk.realtime.ofs.f4, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1647f4 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C1647f4 f26073a = new C1647f4();

    public C1647f4() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new EventTaggingRestServiceImpl((CoroutineContextProvider) DependencyInjectionKt.getDi().get(Reflection.f24268a.b(CoroutineContextProvider.class)));
    }
}
