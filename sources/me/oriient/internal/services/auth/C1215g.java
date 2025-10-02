package me.oriient.internal.services.auth;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.infra.utils.core.coroutines.CoroutineContextProvider;

/* renamed from: me.oriient.internal.services.auth.g, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1215g extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ D f25028a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1215g(D d) {
        super(0);
        this.f25028a = d;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return ((CoroutineContextProvider) this.f25028a.g.getD()).newSingleThreadCoroutineContext();
    }
}
