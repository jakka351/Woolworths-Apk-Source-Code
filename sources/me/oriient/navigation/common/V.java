package me.oriient.navigation.common;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScopeKt;
import me.oriient.internal.infra.utils.core.coroutines.CoroutineContextProvider;

/* loaded from: classes8.dex */
public final class V extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final V f26225a = new V();

    public V() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return CoroutineScopeKt.a(((CoroutineContextProvider) DiKt.a().get(Reflection.f24268a.b(CoroutineContextProvider.class), null)).newSingleThreadCoroutineContext());
    }
}
