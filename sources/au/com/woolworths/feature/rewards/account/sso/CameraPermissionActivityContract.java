package au.com.woolworths.feature.rewards.account.sso;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.shared.web.file.uploader.permission.CameraPermissionActivity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u000b\n\u0000\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/rewards/account/sso/CameraPermissionActivityContract;", "Landroidx/activity/result/contract/ActivityResultContract;", "", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CameraPermissionActivityContract extends ActivityResultContract<Unit, Boolean> {
    @Override // androidx.activity.result.contract.ActivityResultContract
    public final Intent createIntent(Context context, Object obj) {
        Unit input = (Unit) obj;
        Intrinsics.h(input, "input");
        return new Intent(context, (Class<?>) CameraPermissionActivity.class);
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    public final Boolean parseResult(int i, Intent intent) {
        return Boolean.valueOf(i == -1);
    }
}
