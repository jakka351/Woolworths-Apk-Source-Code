package au.com.woolworths.base.rewards.account.utils;

import android.content.Intent;
import androidx.activity.compose.a;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCaller;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.android.onesite.navigation.ActivityNavigatorKt;
import au.com.woolworths.android.onesite.navigation.ApplicationType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J3\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\u0011\u0010\u0012R$\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lau/com/woolworths/base/rewards/account/utils/TwoFactorAuthStepUpHelper;", "", "Landroidx/activity/result/ActivityResultCaller;", "activity", "<init>", "(Landroidx/activity/result/ActivityResultCaller;)V", "", "url", "Lkotlin/Function1;", "", "", "onResult", "Lau/com/woolworths/android/onesite/navigation/ApplicationType;", "applicationType", "Landroid/content/Intent;", "createAuthenticationIntent", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lau/com/woolworths/android/onesite/navigation/ApplicationType;)Landroid/content/Intent;", "launchRewardsAuthentication", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "onStepUpResult", "Lkotlin/jvm/functions/Function1;", "Landroidx/activity/result/ActivityResultLauncher;", "launcher", "Landroidx/activity/result/ActivityResultLauncher;", "base-rewards-account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TwoFactorAuthStepUpHelper {

    @NotNull
    private final ActivityResultLauncher<Intent> launcher;

    @Nullable
    private Function1<? super Boolean, Unit> onStepUpResult;

    public TwoFactorAuthStepUpHelper(@NotNull ActivityResultCaller activity) {
        Intrinsics.h(activity, "activity");
        this.launcher = activity.registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new a(this, 2));
    }

    private final Intent createAuthenticationIntent(String url, Function1<? super Boolean, Unit> onResult, ApplicationType applicationType) {
        this.onStepUpResult = onResult;
        Intent intentPutExtra = ActivityNavigatorKt.a(Activities.Authentication.f4448a, applicationType).putExtra("EXTRA_2FA_STEP_UP_CONFIG", new Activities.Authentication.ExtrasStepUp(url));
        Intrinsics.g(intentPutExtra, "putExtra(...)");
        return intentPutExtra;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void launcher$lambda$0(TwoFactorAuthStepUpHelper twoFactorAuthStepUpHelper, ActivityResult result) {
        Intrinsics.h(result, "result");
        Function1<? super Boolean, Unit> function1 = twoFactorAuthStepUpHelper.onStepUpResult;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(result.d == -1));
        }
    }

    public final void launchRewardsAuthentication(@NotNull String url, @NotNull Function1<? super Boolean, Unit> onResult) {
        Intrinsics.h(url, "url");
        Intrinsics.h(onResult, "onResult");
        this.launcher.a(createAuthenticationIntent(url, onResult, ApplicationType.d), null);
    }
}
