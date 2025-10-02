package me.oriient.internal.services.auth;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.infra.utils.core.OriientError;

/* renamed from: me.oriient.internal.services.auth.s, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1226s extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ OriientError f25054a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1226s(OriientError oriientError) {
        super(0);
        this.f25054a = oriientError;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return androidx.constraintlayout.core.state.a.s("errorMessage", this.f25054a.getMessage());
    }
}
