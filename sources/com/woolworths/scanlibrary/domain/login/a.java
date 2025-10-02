package com.woolworths.scanlibrary.domain.login;

import com.woolworths.scanlibrary.domain.login.SignInUC;
import com.woolworths.scanlibrary.models.authentication.AuthResponse;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final /* synthetic */ class a implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ SignInUC e;

    public /* synthetic */ a(SignInUC signInUC, int i) {
        this.d = i;
        this.e = signInUC;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                SignInUC.ResponseValue response = (SignInUC.ResponseValue) obj;
                Intrinsics.h(response, "response");
                return this.e.d(response, false);
            case 1:
                SignInUC.ResponseValue response2 = (SignInUC.ResponseValue) obj;
                Intrinsics.h(response2, "response");
                return this.e.d(response2, true);
            case 2:
                AuthResponse response3 = (AuthResponse) obj;
                Intrinsics.h(response3, "response");
                return this.e.e(response3);
            case 3:
                SignInUC.ResponseValue response4 = (SignInUC.ResponseValue) obj;
                Intrinsics.h(response4, "response");
                return this.e.d(response4, true);
            case 4:
                AuthResponse response5 = (AuthResponse) obj;
                Intrinsics.h(response5, "response");
                return this.e.e(response5);
            case 5:
                SignInUC.ResponseValue response6 = (SignInUC.ResponseValue) obj;
                Intrinsics.h(response6, "response");
                return this.e.d(response6, true);
            default:
                AuthResponse response7 = (AuthResponse) obj;
                Intrinsics.h(response7, "response");
                return this.e.e(response7);
        }
    }
}
