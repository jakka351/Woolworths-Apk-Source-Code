package me.oriient.internal.services.uploadingManager;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScopeKt;
import me.oriient.internal.di.InternalDiKt;
import me.oriient.internal.infra.utils.core.coroutines.CoroutineContextProvider;

/* renamed from: me.oriient.internal.services.uploadingManager.u, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1542u extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C1542u f25659a = new C1542u();

    public C1542u() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return CoroutineScopeKt.a(((CoroutineContextProvider) InternalDiKt.getDi().get(Reflection.f24268a.b(CoroutineContextProvider.class))).newSingleThreadCoroutineContext());
    }
}
