package me.oriient.internal.infra.utils.android;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScopeKt;
import me.oriient.internal.di.InternalDiKt;
import me.oriient.internal.infra.utils.core.coroutines.CoroutineContextProvider;

/* loaded from: classes7.dex */
public final class e extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final e f24992a = new e();

    public e() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return CoroutineScopeKt.a(((CoroutineContextProvider) InternalDiKt.getDi().get(Reflection.f24268a.b(CoroutineContextProvider.class))).getMain());
    }
}
