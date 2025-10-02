package au.com.woolworths.android.onesite.app.deeplink;

import android.content.Intent;
import android.net.Uri;
import androidx.camera.core.impl.e;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.branch.BranchDeepLinkInteractorImpl;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import dagger.hilt.android.AndroidEntryPoint;
import io.branch.referral.Branch;
import io.branch.referral.BranchLogger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/android/onesite/app/deeplink/ShopAppBranchDeepLinkActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "ShopApp_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes3.dex */
public final class ShopAppBranchDeepLinkActivity extends Hilt_ShopAppBranchDeepLinkActivity {
    public static final /* synthetic */ int A = 0;
    public BranchDeepLinkInteractorImpl x;
    public FeatureToggleManager y;
    public final e z = new e(this, 6);

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) throws JSONException {
        Intrinsics.h(intent, "intent");
        super.onNewIntent(intent);
        setIntent(intent);
        if (intent.getBooleanExtra("branch_force_new_session", false)) {
            Branch.InitSessionBuilder initSessionBuilderO = Branch.o(this);
            initSessionBuilderO.b(this.z);
            initSessionBuilderO.d = true;
            initSessionBuilderO.a();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStart() throws JSONException {
        super.onStart();
        getIntent().putExtra("branch_force_new_session", true);
        Branch.InitSessionBuilder initSessionBuilderO = Branch.o(this);
        initSessionBuilderO.b(this.z);
        Intent intent = getIntent();
        Uri data = intent != null ? intent.getData() : null;
        BranchLogger.e("InitSessionBuilder setting withData with " + data);
        initSessionBuilderO.c = data;
        initSessionBuilderO.a();
    }
}
