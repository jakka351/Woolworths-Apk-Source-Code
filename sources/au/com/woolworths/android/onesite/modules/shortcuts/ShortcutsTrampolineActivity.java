package au.com.woolworths.android.onesite.modules.shortcuts;

import android.content.Intent;
import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.splashscreen.SplashScreen;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractor;
import au.com.woolworths.android.onesite.modules.shortcuts.Shortcuts;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.android.onesite.navigation.ActivityNavigatorKt;
import au.com.woolworths.android.onesite.navigation.ApplicationType;
import au.com.woolworths.android.onesite.repository.LaunchManager;
import com.woolworths.R;
import dagger.hilt.android.AndroidEntryPoint;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/android/onesite/modules/shortcuts/ShortcutsTrampolineActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Companion", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ShortcutsTrampolineActivity extends Hilt_ShortcutsTrampolineActivity {
    public AnalyticsManager A;
    public LaunchManager x;
    public RewardsAccountInteractor y;
    public FeatureToggleManager z;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/android/onesite/modules/shortcuts/ShortcutsTrampolineActivity$Companion;", "", "", "TRAMPOLINE_TARGET", "Ljava/lang/String;", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[Shortcuts.values().length];
            try {
                iArr[Shortcuts.h.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Shortcuts.i.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Shortcuts.j.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Shortcuts.k.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @Override // au.com.woolworths.android.onesite.modules.shortcuts.Hilt_ShortcutsTrampolineActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Collection collectionF;
        SplashScreen.Companion.a(this);
        super.onCreate(bundle);
        setContentView(R.layout.activity_placeholder);
        LaunchManager launchManager = this.x;
        if (launchManager == null) {
            Intrinsics.p("launchManager");
            throw null;
        }
        if (launchManager.d() == LaunchManager.LaunchState.d) {
            startActivity(ActivityNavigatorKt.a(Activities.ShopAppSplash.f4530a, ApplicationType.e));
            return;
        }
        Shortcuts.Companion companion = Shortcuts.f;
        String stringExtra = getIntent().getStringExtra("trampoline_target");
        Intrinsics.e(stringExtra);
        companion.getClass();
        Shortcuts shortcuts = (Shortcuts) Shortcuts.g.get(stringExtra);
        if (shortcuts != null) {
            AnalyticsManager analyticsManager = this.A;
            if (analyticsManager == null) {
                Intrinsics.p("analyticsManager");
                throw null;
            }
            analyticsManager.d(shortcuts.e);
            int iOrdinal = shortcuts.ordinal();
            Activities.MainActivity mainActivity = Activities.MainActivity.f4487a;
            if (iOrdinal == 0) {
                collectionF = ArraysKt.F(new Intent[]{mainActivity.c(Activities.MainActivity.Tab.e, null), null});
            } else if (iOrdinal == 1) {
                Intent intentC = mainActivity.c(Activities.MainActivity.Tab.d, null);
                RewardsAccountInteractor rewardsAccountInteractor = this.y;
                if (rewardsAccountInteractor == null) {
                    Intrinsics.p("rewardsAccountInteractor");
                    throw null;
                }
                if (rewardsAccountInteractor.getCardData() != null) {
                    collectionF = CollectionsKt.R(intentC, ActivityNavigatorKt.a(Activities.RewardsCardOverlay.f4517a, ApplicationType.e));
                } else {
                    String string = getString(R.string.rewards_show_barcode_but_not_linked_error);
                    Intrinsics.g(string, "getString(...)");
                    Intent intentPutExtra = intentC.putExtra("EXTRA_MESSAGE", string);
                    Intrinsics.g(intentPutExtra, "putExtra(...)");
                    collectionF = CollectionsKt.Q(intentPutExtra);
                }
            } else if (iOrdinal == 2) {
                collectionF = CollectionsKt.R(mainActivity.b(), Activities.Search.f4526a.b(new Activities.Search.Extras.Generic(null)));
            } else {
                if (iOrdinal != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                collectionF = CollectionsKt.Q(mainActivity.c(Activities.MainActivity.Tab.g, null));
            }
            startActivities((Intent[]) collectionF.toArray(new Intent[0]));
        }
    }
}
