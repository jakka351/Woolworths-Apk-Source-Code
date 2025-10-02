package me.oriient.positioningengine.support;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScopeKt;
import me.oriient.internal.infra.utils.core.coroutines.CoroutineContextProvider;
import me.oriient.positioningengine.common.DiKt;

/* renamed from: me.oriient.positioningengine.support.s, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1858s extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C1858s f26570a = new C1858s();

    public C1858s() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return CoroutineScopeKt.a(((CoroutineContextProvider) DiKt.getDi().get(Reflection.f24268a.b(CoroutineContextProvider.class), null)).newSingleThreadCoroutineContext());
    }
}
