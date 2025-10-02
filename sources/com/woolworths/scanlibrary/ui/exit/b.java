package com.woolworths.scanlibrary.ui.exit;

import com.woolworths.scanlibrary.domain.login.LogoutManager;
import com.woolworths.scanlibrary.domain.transfertopos.RecallConfirmAtPosUC;
import com.woolworths.scanlibrary.ui.exit.ExitScanCodeViewModel;
import com.woolworths.scanlibrary.ui.exit.ExitScanCodeViewModel.ConfirmRecallPOSObserver;
import com.woolworths.scanlibrary.ui.splash.SngInitializerActivity;
import com.woolworths.scanlibrary.ui.tap.TapActivity;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.internal.operators.single.SingleObserveOn;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final /* synthetic */ class b implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ b(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.d;
        Unit unit = Unit.f24250a;
        Object obj = this.e;
        switch (i) {
            case 0:
                int i2 = ExitScanCodeActivity.I;
                ExitScanCodeViewModel exitScanCodeViewModelV4 = ((ExitScanCodeActivity) obj).V4();
                exitScanCodeViewModelV4.q6();
                CompositeDisposable compositeDisposable = exitScanCodeViewModelV4.e;
                SingleObserveOn singleObserveOnF = exitScanCodeViewModelV4.m.b(new RecallConfirmAtPosUC.RequestValues()).f(AndroidSchedulers.a());
                ExitScanCodeViewModel.ConfirmRecallPOSObserver confirmRecallPOSObserver = exitScanCodeViewModelV4.new ConfirmRecallPOSObserver();
                singleObserveOnF.a(confirmRecallPOSObserver);
                compositeDisposable.d(confirmRecallPOSObserver);
                return unit;
            case 1:
                int i3 = ExitScanCodeActivity.I;
                return ((ExitScanCodeActivity) obj).Q4();
            case 2:
                int i4 = ExitScanCodeActivity.I;
                return Boolean.valueOf(((ExitScanCodeActivity) obj).getIntent().getBooleanExtra("key.back.button.allowed", false));
            case 3:
                int i5 = ExitScanCodeActivity.I;
                TapActivity.Companion.a((ExitScanCodeActivity) obj, null, null, 12);
                return unit;
            case 4:
                int i6 = ExitScanCodeActivity.I;
                TapActivity.Companion.a((ExitScanCodeActivity) obj, null, null, 12);
                return unit;
            case 5:
                int i7 = ExitScanCodeActivity.I;
                TapActivity.Companion.a((ExitScanCodeActivity) obj, null, null, 12);
                return unit;
            case 6:
                ExitScanCodeActivity exitScanCodeActivity = (ExitScanCodeActivity) obj;
                LogoutManager logoutManager = exitScanCodeActivity.E;
                if (logoutManager == null) {
                    Intrinsics.p("logoutManager");
                    throw null;
                }
                logoutManager.a();
                exitScanCodeActivity.P4().b();
                SngInitializerActivity.Companion.a(exitScanCodeActivity, true);
                return unit;
            default:
                ExitDTO exitDTO = ((ExitScanCodeViewModel) obj).y;
                if (exitDTO != null) {
                    return Boolean.valueOf(exitDTO.e);
                }
                Intrinsics.p("exitData");
                throw null;
        }
    }
}
