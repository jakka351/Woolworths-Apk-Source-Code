package au.com.woolworths.feature.rewards.everydayextras.signup;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import au.com.woolworths.android.onesite.navigation.Activities;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasSignUpViewModel;", "Landroidx/lifecycle/ViewModel;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EverydayExtrasSignUpViewModel extends ViewModel {
    public final EverydayExtrasSignUpInteractor e;
    public final SignUpQueryParamsManager f;
    public final BufferedChannel g;
    public final Flow h;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5942a;

        static {
            int[] iArr = new int[Activities.EverydayExtraNativeSignUpActivity.InitialScreen.values().length];
            try {
                Activities.EverydayExtraNativeSignUpActivity.InitialScreen initialScreen = Activities.EverydayExtraNativeSignUpActivity.InitialScreen.d;
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Activities.EverydayExtraNativeSignUpActivity.InitialScreen initialScreen2 = Activities.EverydayExtraNativeSignUpActivity.InitialScreen.d;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f5942a = iArr;
        }
    }

    public EverydayExtrasSignUpViewModel(EverydayExtrasSignUpInteractor signUpInteractor, SignUpQueryParamsManager queryParamsManager) {
        Intrinsics.h(signUpInteractor, "signUpInteractor");
        Intrinsics.h(queryParamsManager, "queryParamsManager");
        this.e = signUpInteractor;
        this.f = queryParamsManager;
        BufferedChannel bufferedChannelA = ChannelKt.a(0, 7, null);
        this.g = bufferedChannelA;
        this.h = FlowKt.I(bufferedChannelA);
    }
}
