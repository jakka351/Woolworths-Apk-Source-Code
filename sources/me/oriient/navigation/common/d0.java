package me.oriient.navigation.common;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.infra.utils.core.Outcome;
import me.oriient.navigation.common.util.NavigationError;

/* loaded from: classes8.dex */
public final class d0 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Outcome f26237a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(Outcome outcome) {
        super(0);
        this.f26237a = outcome;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return androidx.constraintlayout.core.state.a.s("errorMessage", ((NavigationError) ((Outcome.Failure) this.f26237a).getValue()).getMessage());
    }
}
