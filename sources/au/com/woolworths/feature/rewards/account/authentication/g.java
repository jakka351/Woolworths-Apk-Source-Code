package au.com.woolworths.feature.rewards.account.authentication;

import android.net.Uri;
import androidx.compose.runtime.MutableState;
import androidx.lifecycle.LifecycleOwnerKt;
import au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractor;
import au.com.woolworths.feature.rewards.account.authentication.RewardsAuthenticationContractNew;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;

/* loaded from: classes3.dex */
public final /* synthetic */ class g implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ g(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        int i = this.d;
        Object obj2 = this.f;
        Object obj3 = this.e;
        switch (i) {
            case 0:
                RewardsAuthenticationActivityNew rewardsAuthenticationActivityNew = (RewardsAuthenticationActivityNew) obj3;
                MutableState mutableState = (MutableState) obj2;
                String str = (String) obj;
                int i2 = RewardsAuthenticationActivityNew.D;
                MutableStateFlow mutableStateFlow = rewardsAuthenticationActivityNew.O4().h;
                do {
                    value = mutableStateFlow.getValue();
                } while (!mutableStateFlow.d(value, RewardsAuthenticationContractNew.ViewState.Loading.f5661a));
                mutableState.setValue(Boolean.FALSE);
                BuildersKt.c(LifecycleOwnerKt.a(rewardsAuthenticationActivityNew), null, null, new RewardsAuthenticationActivityNew$launchAuth0Form$1(rewardsAuthenticationActivityNew, false, str, Boolean.TRUE, null), 3);
                return Unit.f24250a;
            default:
                Uri uri = (Uri) obj2;
                String it = (String) obj;
                Intrinsics.h(it, "it");
                RewardsAccountInteractor rewardsAccountInteractor = ((RewardsAuthenticationViewModel) obj3).e;
                String queryParameter = uri.getQueryParameter("authcode");
                if (queryParameter == null && (queryParameter = uri.getQueryParameter("code")) == null) {
                    queryParameter = "";
                }
                return rewardsAccountInteractor.login(queryParameter, it);
        }
    }
}
