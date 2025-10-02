package com.woolworths.scanlibrary.ui.tap.tapon;

import au.com.woolworths.android.onesite.repository.PermissionFlagInteractorImpl;
import com.woolworths.scanlibrary.ui.tap.tapon.TapOnContract;
import com.woolworths.scanlibrary.util.permission.SngPermissionWrapper;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final /* synthetic */ class a implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ TapOnFragment e;

    public /* synthetic */ a(TapOnFragment tapOnFragment, int i) {
        this.d = i;
        this.e = tapOnFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                PermissionFlagInteractorImpl permissionFlagInteractorImpl = this.e.n;
                if (permissionFlagInteractorImpl != null) {
                    return new SngPermissionWrapper(permissionFlagInteractorImpl);
                }
                Intrinsics.p("permissionFlagInteractor");
                throw null;
            case 1:
                this.e.n2();
                break;
            case 2:
                TapOnFragment tapOnFragment = this.e;
                ((TapOnContract.Presenter) tapOnFragment.Q1()).C0();
                tapOnFragment.n2();
                break;
            case 3:
                this.e.m2();
                break;
            case 4:
                this.e.m2();
                break;
            default:
                this.e.m2();
                break;
        }
        return Unit.f24250a;
    }
}
