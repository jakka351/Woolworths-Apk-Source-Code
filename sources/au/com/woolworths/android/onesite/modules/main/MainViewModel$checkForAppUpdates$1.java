package au.com.woolworths.android.onesite.modules.main;

import android.os.Build;
import androidx.lifecycle.MutableLiveData;
import au.com.woolworths.android.onesite.modules.main.MainContract;
import au.com.woolworths.foundation.force.upgrade.data.UpgradeConfig;
import au.com.woolworths.foundation.force.upgrade.impl.AppConfigClientImpl;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.android.onesite.modules.main.MainViewModel$checkForAppUpdates$1", f = "MainViewModel.kt", l = {1217}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class MainViewModel$checkForAppUpdates$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ MainViewModel q;
    public final /* synthetic */ String r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainViewModel$checkForAppUpdates$1(MainViewModel mainViewModel, String str, Continuation continuation) {
        super(2, continuation);
        String str2 = Build.VERSION.RELEASE;
        this.q = mainViewModel;
        this.r = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        String str = Build.VERSION.RELEASE;
        return new MainViewModel$checkForAppUpdates$1(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((MainViewModel$checkForAppUpdates$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        MainViewModel mainViewModel = this.q;
        if (i == 0) {
            ResultKt.b(obj);
            AppConfigClientImpl appConfigClientImpl = mainViewModel.t;
            String str = Build.VERSION.RELEASE;
            this.p = 1;
            obj = appConfigClientImpl.b(this.r, str, Boolean.FALSE, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        UpgradeConfig upgradeConfig = (UpgradeConfig) obj;
        if (upgradeConfig != null) {
            MutableLiveData mutableLiveData = mainViewModel.u;
            MainContract.ViewState viewState = (MainContract.ViewState) mutableLiveData.e();
            mutableLiveData.m(viewState != null ? MainContract.ViewState.a(viewState, null, false, upgradeConfig, 255) : null);
            mainViewModel.v.onNext(new MainContract.Actions.ShowUpgradePrompt(upgradeConfig));
        }
        return Unit.f24250a;
    }
}
