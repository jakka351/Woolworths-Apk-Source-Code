package com.woolworths.scanlibrary.ui.menu.setting;

import android.R;
import android.content.ComponentCallbacks2;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowInsetsController;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceCategory;
import androidx.preference.PreferenceFragmentCompat;
import androidx.preference.PreferenceGroupAdapter;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.app.di.SnGLibraryEntryPoint;
import au.com.woolworths.android.onesite.extensions.ViewExtKt;
import au.com.woolworths.shop.ratings.and.reviews.ui.reviewsdetailsscreen.b;
import com.google.common.net.a;
import com.woolworths.scanlibrary.analytics.ActionTracking;
import com.woolworths.scanlibrary.analytics.AnalyticsProvider;
import com.woolworths.scanlibrary.analytics.AppSettingScreenTracking;
import com.woolworths.scanlibrary.analytics.ClickedSoundInSettingTracking;
import com.woolworths.scanlibrary.analytics.ClickedTimerOutInSettingTracking;
import com.woolworths.scanlibrary.analytics.ClickedVibrateInSettingTracking;
import com.woolworths.scanlibrary.analytics.Screens;
import com.woolworths.scanlibrary.analytics.TimeOutSettingScreenTracking;
import com.woolworths.scanlibrary.di.component.SnGAppProvider;
import com.woolworths.scanlibrary.ui.menu.analytics.SettingsActions;
import com.woolworths.scanlibrary.ui.menu.setting.di.SnGLibraryEntryPointFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/woolworths/scanlibrary/ui/menu/setting/UserSettingsActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "GeneralPreferenceFragment", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class UserSettingsActivity extends AppCompatActivity {
    public static final /* synthetic */ int u = 0;
    public AnalyticsManager t;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/woolworths/scanlibrary/ui/menu/setting/UserSettingsActivity$GeneralPreferenceFragment;", "Landroidx/preference/PreferenceFragmentCompat;", "Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;", "Companion", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class GeneralPreferenceFragment extends PreferenceFragmentCompat implements SharedPreferences.OnSharedPreferenceChangeListener {
        public final AnalyticsManager l;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/woolworths/scanlibrary/ui/menu/setting/UserSettingsActivity$GeneralPreferenceFragment$Companion;", "", "", "KEY_TIMEOUT", "Ljava/lang/String;", "KEY_SOUND", "KEY_VIBRATE", "KEY_AUTO_CHECK", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
        }

        public GeneralPreferenceFragment(AnalyticsManager analyticsManager) {
            this.l = analyticsManager;
        }

        @Override // androidx.preference.PreferenceFragmentCompat
        public final void E1(String str) throws Resources.NotFoundException {
            I1(str);
            setHasOptionsMenu(true);
            Preference preferenceC = C("preferenceKeyScannerTimer");
            Intrinsics.f(preferenceC, "null cannot be cast to non-null type androidx.preference.ListPreference");
            ListPreference listPreference = (ListPreference) preferenceC;
            listPreference.N = new a(23);
            listPreference.m();
            PreferenceCategory preferenceCategory = (PreferenceCategory) C("listsCategory");
            if (preferenceCategory == null || preferenceCategory.y) {
                return;
            }
            preferenceCategory.y = true;
            PreferenceGroupAdapter preferenceGroupAdapter = preferenceCategory.I;
            if (preferenceGroupAdapter != null) {
                preferenceGroupAdapter.J();
            }
        }

        public final void Q1(ActionTracking actionTracking) {
            FragmentActivity activity = getActivity();
            Intrinsics.f(activity, "null cannot be cast to non-null type com.woolworths.scanlibrary.ui.menu.setting.UserSettingsActivity");
            int i = UserSettingsActivity.u;
            ((UserSettingsActivity) activity).N4().b(actionTracking);
        }

        @Override // androidx.fragment.app.Fragment
        public final boolean onOptionsItemSelected(MenuItem item) {
            Intrinsics.h(item, "item");
            if (item.getItemId() != 16908332) {
                return super.onOptionsItemSelected(item);
            }
            FragmentActivity activity = getActivity();
            if (activity == null) {
                return true;
            }
            activity.finish();
            return true;
        }

        @Override // androidx.fragment.app.Fragment
        public final void onPause() {
            super.onPause();
            SharedPreferences sharedPreferencesB = this.e.b();
            if (sharedPreferencesB != null) {
                sharedPreferencesB.unregisterOnSharedPreferenceChangeListener(this);
            }
        }

        @Override // androidx.fragment.app.Fragment
        public final void onResume() {
            super.onResume();
            SharedPreferences sharedPreferencesB = this.e.b();
            if (sharedPreferencesB != null) {
                sharedPreferencesB.registerOnSharedPreferenceChangeListener(this);
            }
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
        java.lang.NullPointerException
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
         */
        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
        public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
            Intrinsics.h(sharedPreferences, "sharedPreferences");
            if (str != null) {
                switch (str.hashCode()) {
                    case -1557604981:
                        if (str.equals("preferenceKeyScannerTimer")) {
                            FragmentActivity activity = getActivity();
                            Intrinsics.f(activity, "null cannot be cast to non-null type com.woolworths.scanlibrary.ui.menu.setting.UserSettingsActivity");
                            int i = UserSettingsActivity.u;
                            ((UserSettingsActivity) activity).N4().a(new TimeOutSettingScreenTracking("Timeout Setting Screen"));
                            Q1(new ClickedTimerOutInSettingTracking("Timeout Setting"));
                            break;
                        }
                        break;
                    case -774802066:
                        if (str.equals("preferenceKeyScanSound")) {
                            Q1(new ClickedSoundInSettingTracking("Sound Setting"));
                            break;
                        }
                        break;
                    case 75313528:
                        if (str.equals("preferenceKeyListAutoCheckOff")) {
                            this.l.c(sharedPreferences.getBoolean(str, false) ? SettingsActions.f : SettingsActions.e);
                            break;
                        }
                        break;
                    case 917865998:
                        if (str.equals("preferenceKeyScanVibrate")) {
                            Q1(new ClickedVibrateInSettingTracking("Vibration Setting"));
                            break;
                        }
                        break;
                }
            }
        }

        @Override // androidx.preference.PreferenceFragmentCompat, androidx.fragment.app.Fragment
        public final void onViewCreated(View view, Bundle bundle) {
            Intrinsics.h(view, "view");
            super.onViewCreated(view, bundle);
            ViewExtKt.b(view, new b(13));
        }
    }

    public final AnalyticsProvider N4() {
        ComponentCallbacks2 application = getApplication();
        Intrinsics.f(application, "null cannot be cast to non-null type com.woolworths.scanlibrary.di.component.SnGAppProvider");
        return ((SnGAppProvider) application).c();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        WindowInsetsController insetsController;
        super.onCreate(bundle);
        ComponentCallbacks2 application = getApplication();
        Intrinsics.f(application, "null cannot be cast to non-null type com.woolworths.scanlibrary.ui.menu.setting.di.SnGLibraryEntryPointFactory");
        SnGLibraryEntryPoint snGLibraryEntryPointH = ((SnGLibraryEntryPointFactory) application).h();
        snGLibraryEntryPointH.getClass();
        AnalyticsManager analyticsManagerC = snGLibraryEntryPointH.c();
        if (analyticsManagerC == null) {
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
        this.t = analyticsManagerC;
        FragmentTransaction fragmentTransactionE = getSupportFragmentManager().e();
        AnalyticsManager analyticsManager = this.t;
        if (analyticsManager == null) {
            Intrinsics.p("analyticsManager");
            throw null;
        }
        fragmentTransactionE.j(R.id.content, new GeneralPreferenceFragment(analyticsManager), null);
        fragmentTransactionE.d();
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.t();
            supportActionBar.s(true);
        }
        if (Build.VERSION.SDK_INT >= 35 && (insetsController = getWindow().getInsetsController()) != null) {
            insetsController.setSystemBarsAppearance(8, 8);
        }
        N4().a(new AppSettingScreenTracking("APP Setting Screen"));
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        AnalyticsManager analyticsManager = this.t;
        if (analyticsManager != null) {
            analyticsManager.a(Screens.m);
        } else {
            Intrinsics.p("analyticsManager");
            throw null;
        }
    }
}
