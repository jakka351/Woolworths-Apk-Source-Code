package me.oriient.navigation.common;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import me.oriient.navigation.common.util.NavigationError;

/* loaded from: classes8.dex */
public final class P extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NavigationError f26220a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(NavigationError navigationError) {
        super(0);
        this.f26220a = navigationError;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return androidx.constraintlayout.core.state.a.s("errorMessage", this.f26220a.getMessage());
    }
}
