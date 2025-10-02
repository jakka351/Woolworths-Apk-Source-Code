package com.woolworths.scanlibrary.domain.login;

import com.woolworths.scanlibrary.domain.login.SignInUC;
import com.woolworths.scanlibrary.models.authentication.AuthResponse;
import io.reactivex.internal.operators.single.SingleSubscribeOn;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final /* synthetic */ class b implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ SignInUC e;
    public final /* synthetic */ SignInUC.RequestValues f;

    public /* synthetic */ b(SignInUC signInUC, SignInUC.RequestValues requestValues, int i) {
        this.d = i;
        this.e = signInUC;
        this.f = requestValues;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        AuthResponse it = (AuthResponse) obj;
        switch (this.d) {
            case 0:
                Intrinsics.h(it, "<unused var>");
                SignInUC signInUC = this.e;
                return signInUC.c((SingleSubscribeOn) signInUC.d.c(), this.f.g);
            case 1:
                Intrinsics.h(it, "<unused var>");
                SignInUC signInUC2 = this.e;
                return signInUC2.c((SingleSubscribeOn) signInUC2.d.c(), this.f.g);
            default:
                Intrinsics.h(it, "it");
                SignInUC signInUC3 = this.e;
                return signInUC3.c((SingleSubscribeOn) signInUC3.d.c(), this.f.g);
        }
    }
}
