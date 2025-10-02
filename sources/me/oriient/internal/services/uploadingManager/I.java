package me.oriient.internal.services.uploadingManager;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class I extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Exception f25618a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(Exception exc) {
        super(0);
        this.f25618a = exc;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return androidx.constraintlayout.core.state.a.s("errorMessage", this.f25618a.getMessage());
    }
}
