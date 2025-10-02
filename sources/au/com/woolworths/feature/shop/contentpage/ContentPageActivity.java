package au.com.woolworths.feature.shop.contentpage;

import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.WindowCompat;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.feature.shop.contentpage.ContentPageFragment;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/shop/contentpage/ContentPageActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Companion", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ContentPageActivity extends Hilt_ContentPageActivity {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/shop/contentpage/ContentPageActivity$Companion;", "", "", "SHARE_LINK_INTENT_TYPE", "Ljava/lang/String;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Override // au.com.woolworths.feature.shop.contentpage.Hilt_ContentPageActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        WindowCompat.b(getWindow(), false);
        Activities.ContentPage.ContentPageExtras contentPageExtras = (Activities.ContentPage.ContentPageExtras) getIntent().getParcelableExtra("EXTRA_DATA");
        if (contentPageExtras == null) {
            throw new IllegalStateException("Content Page: Activity should be launched with extra Content Page Data!");
        }
        if (bundle == null) {
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            Intrinsics.g(supportFragmentManager, "getSupportFragmentManager(...)");
            FragmentTransaction fragmentTransactionE = supportFragmentManager.e();
            fragmentTransactionE.j(android.R.id.content, ContentPageFragment.Companion.a(new ContentPageFragment.Extras(contentPageExtras), true), null);
            fragmentTransactionE.d();
        }
    }
}
