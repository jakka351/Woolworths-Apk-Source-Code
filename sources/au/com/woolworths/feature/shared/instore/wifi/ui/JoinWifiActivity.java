package au.com.woolworths.feature.shared.instore.wifi.ui;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.TextView;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.android.onesite.appdata.AppConfig;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.handlers.LinkHandler;
import au.com.woolworths.feature.shared.instore.wifi.InStoreWifiFeature;
import au.com.woolworths.feature.shared.instore.wifi.analytics.TermsAndConditionsInStoreWifiActions;
import au.com.woolworths.feature.shared.instore.wifi.analytics.WifiScreens;
import au.com.woolworths.feature.shared.instore.wifi.databinding.ActivityJoinWifiBinding;
import au.com.woolworths.feature.shared.instore.wifi.markdown.MarkdownHeadingPlugin;
import au.com.woolworths.foundation.feature.app.AppIdentifier;
import com.woolworths.R;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/shared/instore/wifi/ui/JoinWifiActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lau/com/woolworths/feature/shared/instore/wifi/ui/JoinWifiActionHandler;", "<init>", "()V", "instore-wifi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class JoinWifiActivity extends Hilt_JoinWifiActivity implements JoinWifiActionHandler {
    public static final /* synthetic */ int C = 0;
    public final ViewModelLazy A = new ViewModelLazy(Reflection.f24268a.b(JoinWifiViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.feature.shared.instore.wifi.ui.JoinWifiActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getViewModelStore();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.feature.shared.instore.wifi.ui.JoinWifiActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelProviderFactory();
        }
    }, new Function0<CreationExtras>() { // from class: au.com.woolworths.feature.shared.instore.wifi.ui.JoinWifiActivity$special$$inlined$viewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelCreationExtras();
        }
    });
    public ActivityJoinWifiBinding B;
    public AppConfig x;
    public AppIdentifier y;
    public FeatureToggleManager z;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[AppIdentifier.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                AppIdentifier appIdentifier = AppIdentifier.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static void P4(JoinWifiActivity joinWifiActivity, int i) {
        new AlertDialog.Builder(joinWifiActivity).setTitle(i).setPositiveButton(R.string.ok, new au.com.woolworths.feature.product.list.q(2)).show();
    }

    public final JoinWifiViewModel O4() {
        return (JoinWifiViewModel) this.A.getD();
    }

    @Override // au.com.woolworths.feature.shared.instore.wifi.ui.JoinWifiActionHandler
    public final void b1() {
        P4(this, R.string.wifi_generic_error);
    }

    @Override // au.com.woolworths.feature.shared.instore.wifi.ui.JoinWifiActionHandler
    public final void b2(boolean z) {
        setResult(z ? -1 : 0);
        finish();
    }

    @Override // au.com.woolworths.feature.shared.instore.wifi.ui.Hilt_JoinWifiActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FeatureToggleManager featureToggleManager = this.z;
        if (featureToggleManager == null) {
            Intrinsics.p("featureToggleManager");
            throw null;
        }
        if (featureToggleManager.c(InStoreWifiFeature.d)) {
            ComponentActivityKt.a(this, new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shared.instore.wifi.ui.JoinWifiActivity$setUpliftedContent$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                        composer.j();
                    } else {
                        int i = JoinWifiActivity.C;
                        JoinWifiActivity joinWifiActivity = this.d;
                        JoinWifiViewModel joinWifiViewModelO4 = joinWifiActivity.O4();
                        AppIdentifier appIdentifier = joinWifiActivity.y;
                        if (appIdentifier == null) {
                            Intrinsics.p("appIdentifier");
                            throw null;
                        }
                        JoinInStoreWifiScreenKt.f(appIdentifier, joinWifiViewModelO4, joinWifiActivity, null, composer, 0);
                    }
                    return Unit.f24250a;
                }
            }, true, 453934194));
            return;
        }
        AppIdentifier appIdentifier = this.y;
        if (appIdentifier == null) {
            Intrinsics.p("appIdentifier");
            throw null;
        }
        int iOrdinal = appIdentifier.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            ComponentActivityKt.a(this, new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shared.instore.wifi.ui.JoinWifiActivity$setOldContent$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                        composer.j();
                    } else {
                        int i = JoinWifiActivity.C;
                        JoinWifiActivity joinWifiActivity = this.d;
                        JoinWifiViewModel joinWifiViewModelO4 = joinWifiActivity.O4();
                        AppIdentifier appIdentifier2 = joinWifiActivity.y;
                        if (appIdentifier2 == null) {
                            Intrinsics.p("appIdentifier");
                            throw null;
                        }
                        JoinInStoreWifiScreenKt.f(appIdentifier2, joinWifiViewModelO4, joinWifiActivity, null, composer, 0);
                    }
                    return Unit.f24250a;
                }
            }, true, 1405892673));
            return;
        }
        ActivityJoinWifiBinding activityJoinWifiBinding = (ActivityJoinWifiBinding) DataBindingUtil.d(this, R.layout.activity_join_wifi);
        activityJoinWifiBinding.L(O4());
        this.B = activityJoinWifiBinding;
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new JoinWifiActivity$setupOldShopAppScreenVersion$2(this, null), 3);
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new JoinWifiActivity$setupOldShopAppScreenVersion$3(this, null), 3);
        ActivityJoinWifiBinding activityJoinWifiBinding2 = this.B;
        if (activityJoinWifiBinding2 == null) {
            Intrinsics.p("activityBinding");
            throw null;
        }
        TextView textInformation = activityJoinWifiBinding2.D;
        Intrinsics.g(textInformation, "textInformation");
        AppConfig appConfig = this.x;
        if (appConfig == null) {
            Intrinsics.p("appConfig");
            throw null;
        }
        final String strG = YU.a.g(appConfig.getL(), "zeus/mnemosyne/v1/public/cisco-wifi/terms_and_conditions.html");
        AppConfig appConfig2 = this.x;
        if (appConfig2 == null) {
            Intrinsics.p("appConfig");
            throw null;
        }
        final String strG2 = YU.a.g(appConfig2.getL(), "/zeus/mnemosyne/v1/public/cisco-wifi/collection_notice.html");
        String string = getString(R.string.join_wifi_conditions, strG, strG, "https://www.woolworthsgroup.com.au/privacy-policy", strG2);
        Intrinsics.g(string, "getString(...)");
        BindingAdaptersKt.l(textInformation, string, false, new LinkHandler() { // from class: au.com.woolworths.feature.shared.instore.wifi.ui.JoinWifiActivity$setupTextInformationMarkdown$1
            @Override // au.com.woolworths.android.onesite.handlers.LinkHandler
            public final boolean U3(String url, String linkText) {
                Intrinsics.h(url, "url");
                Intrinsics.h(linkText, "linkText");
                boolean zEquals = url.equals(strG);
                JoinWifiActivity joinWifiActivity = this;
                if (zEquals) {
                    int i = JoinWifiActivity.C;
                    joinWifiActivity.O4().f.c(TermsAndConditionsInStoreWifiActions.g);
                    return true;
                }
                if (url.equals("https://www.woolworthsgroup.com.au/privacy-policy")) {
                    int i2 = JoinWifiActivity.C;
                    joinWifiActivity.O4().f.c(TermsAndConditionsInStoreWifiActions.h);
                    return true;
                }
                if (!url.equals(strG2)) {
                    return false;
                }
                int i3 = JoinWifiActivity.C;
                joinWifiActivity.O4().f.c(TermsAndConditionsInStoreWifiActions.i);
                return true;
            }
        }, CollectionsKt.Q(new MarkdownHeadingPlugin()));
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        O4().h.f6517a.a(WifiScreens.f);
    }

    @Override // au.com.woolworths.feature.shared.instore.wifi.ui.JoinWifiActionHandler
    public final void t4() {
        P4(this, R.string.instore_wifi_login_to_continue);
    }

    @Override // au.com.woolworths.feature.shared.instore.wifi.ui.JoinWifiActionHandler
    public final void w4() {
        int i;
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        AppIdentifier appIdentifier = this.y;
        if (appIdentifier == null) {
            Intrinsics.p("appIdentifier");
            throw null;
        }
        int iOrdinal = appIdentifier.ordinal();
        if (iOrdinal == 0) {
            i = R.string.title_confirm_join_wifi;
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            i = R.string.rewards_title_confirm_join_wifi;
        }
        builder.setTitle(i).setPositiveButton(R.string.button_allow, new DialogInterface.OnClickListener() { // from class: au.com.woolworths.feature.shared.instore.wifi.ui.t
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                int i3 = JoinWifiActivity.C;
                JoinWifiViewModel joinWifiViewModelO4 = this.d.O4();
                BuildersKt.c(ViewModelKt.a(joinWifiViewModelO4), null, null, new JoinWifiViewModel$register$1(joinWifiViewModelO4, null), 3);
                dialogInterface.dismiss();
            }
        }).setNegativeButton(R.string.cancel, new au.com.woolworths.feature.product.list.q(3)).setCancelable(true).show();
    }
}
