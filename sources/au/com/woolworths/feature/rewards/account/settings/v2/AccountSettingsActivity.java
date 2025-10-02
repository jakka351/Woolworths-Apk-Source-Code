package au.com.woolworths.feature.rewards.account.settings.v2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.compose.ComponentActivityKt;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.material.ScaffoldKt;
import androidx.compose.material.ScaffoldState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.android.onesite.analytics.Screens;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.design.wx.foundation.ThemeKt;
import au.com.woolworths.feature.rewards.account.settings.v2.AccountSettingsContract;
import au.com.woolworths.feature.rewards.account.settings.v2.ui.AccountSettingsScreenKt;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/account/settings/v2/AccountSettingsActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Companion", "Lau/com/woolworths/feature/rewards/account/settings/v2/AccountSettingsContract$ViewState;", "viewState", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class AccountSettingsActivity extends Hilt_AccountSettingsActivity {
    public static final /* synthetic */ int A = 0;
    public FeatureToggleManager x;
    public final ViewModelLazy y = new ViewModelLazy(Reflection.f24268a.b(AccountSettingsViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.feature.rewards.account.settings.v2.AccountSettingsActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getViewModelStore();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.feature.rewards.account.settings.v2.AccountSettingsActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelProviderFactory();
        }
    }, new Function0<CreationExtras>() { // from class: au.com.woolworths.feature.rewards.account.settings.v2.AccountSettingsActivity$special$$inlined$viewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelCreationExtras();
        }
    });
    public final ActivityResultLauncher z = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new androidx.activity.compose.a(this, 5));

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/feature/rewards/account/settings/v2/AccountSettingsActivity$Companion;", "", "", "EXTRAS", "Ljava/lang/String;", "Extras", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {

        @Parcelize
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0083\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/account/settings/v2/AccountSettingsActivity$Companion$Extras;", "Landroid/os/Parcelable;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Extras implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Extras> CREATOR = new Creator();
            public final String d;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Extras> {
                @Override // android.os.Parcelable.Creator
                public final Extras createFromParcel(Parcel parcel) {
                    Intrinsics.h(parcel, "parcel");
                    return new Extras(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Extras[] newArray(int i) {
                    return new Extras[i];
                }
            }

            public Extras(String autoOpenItemId) {
                Intrinsics.h(autoOpenItemId, "autoOpenItemId");
                this.d = autoOpenItemId;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Extras) && Intrinsics.c(this.d, ((Extras) obj).d);
            }

            public final int hashCode() {
                return this.d.hashCode();
            }

            public final String toString() {
                return YU.a.h("Extras(autoOpenItemId=", this.d, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.h(dest, "dest");
                dest.writeString(this.d);
            }
        }
    }

    public final AccountSettingsViewModel O4() {
        return (AccountSettingsViewModel) this.y.getD();
    }

    @Override // au.com.woolworths.feature.rewards.account.settings.v2.Hilt_AccountSettingsActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ComponentActivityKt.a(this, new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.account.settings.v2.AccountSettingsActivity.onCreate.1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    int i = AccountSettingsActivity.A;
                    final AccountSettingsActivity accountSettingsActivity = AccountSettingsActivity.this;
                    final MutableState mutableStateA = FlowExtKt.a(accountSettingsActivity.O4().l, composer);
                    final ScaffoldState scaffoldStateD = ScaffoldKt.d(null, composer, 3);
                    Context context = (Context) composer.x(AndroidCompositionLocals_androidKt.b);
                    Object objG = composer.G();
                    Object obj3 = Composer.Companion.f1624a;
                    if (objG == obj3) {
                        objG = android.support.v4.media.session.a.i(composer.y(), composer);
                    }
                    CoroutineScope coroutineScope = (CoroutineScope) objG;
                    Flow flow = accountSettingsActivity.O4().n;
                    composer.o(-1224400529);
                    boolean zI = composer.I(accountSettingsActivity) | composer.I(coroutineScope) | composer.n(scaffoldStateD) | composer.I(context);
                    Object objG2 = composer.G();
                    if (zI || objG2 == obj3) {
                        AccountSettingsActivity$onCreate$1$1$1 accountSettingsActivity$onCreate$1$1$1 = new AccountSettingsActivity$onCreate$1$1$1(accountSettingsActivity, coroutineScope, scaffoldStateD, context, null);
                        composer.A(accountSettingsActivity$onCreate$1$1$1);
                        objG2 = accountSettingsActivity$onCreate$1$1$1;
                    }
                    composer.l();
                    EffectsKt.e(composer, flow, (Function2) objG2);
                    ThemeKt.a(48, composer, ComposableLambdaKt.c(426000784, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.account.settings.v2.AccountSettingsActivity.onCreate.1.2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj4, Object obj5) {
                            Composer composer2 = (Composer) obj4;
                            if ((((Number) obj5).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                AccountSettingsContract.ViewState viewState = (AccountSettingsContract.ViewState) mutableStateA.getD();
                                composer2.o(5004770);
                                final AccountSettingsActivity accountSettingsActivity2 = accountSettingsActivity;
                                boolean zI2 = composer2.I(accountSettingsActivity2);
                                Object objG3 = composer2.G();
                                Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                                if (zI2 || objG3 == composer$Companion$Empty$1) {
                                    AccountSettingsActivity$onCreate$1$2$1$1 accountSettingsActivity$onCreate$1$2$1$1 = new AccountSettingsActivity$onCreate$1$2$1$1(0, accountSettingsActivity2, AccountSettingsActivity.class, "finish", "finish()V", 0);
                                    composer2.A(accountSettingsActivity$onCreate$1$2$1$1);
                                    objG3 = accountSettingsActivity$onCreate$1$2$1$1;
                                }
                                KFunction kFunction = (KFunction) objG3;
                                composer2.l();
                                int i2 = AccountSettingsActivity.A;
                                AccountSettingsViewModel accountSettingsViewModelO4 = accountSettingsActivity2.O4();
                                composer2.o(5004770);
                                boolean zI3 = composer2.I(accountSettingsViewModelO4);
                                Object objG4 = composer2.G();
                                if (zI3 || objG4 == composer$Companion$Empty$1) {
                                    AccountSettingsActivity$onCreate$1$2$2$1 accountSettingsActivity$onCreate$1$2$2$1 = new AccountSettingsActivity$onCreate$1$2$2$1(0, accountSettingsViewModelO4, AccountSettingsViewModel.class, "fetchAccountMenu", "fetchAccountMenu()V", 0);
                                    composer2.A(accountSettingsActivity$onCreate$1$2$2$1);
                                    objG4 = accountSettingsActivity$onCreate$1$2$2$1;
                                }
                                KFunction kFunction2 = (KFunction) objG4;
                                composer2.l();
                                AccountSettingsViewModel accountSettingsViewModelO42 = accountSettingsActivity2.O4();
                                composer2.o(5004770);
                                boolean zI4 = composer2.I(accountSettingsViewModelO42);
                                Object objG5 = composer2.G();
                                if (zI4 || objG5 == composer$Companion$Empty$1) {
                                    AccountSettingsActivity$onCreate$1$2$3$1 accountSettingsActivity$onCreate$1$2$3$1 = new AccountSettingsActivity$onCreate$1$2$3$1(1, accountSettingsViewModelO42, AccountSettingsViewModel.class, "onOptionItemClick", "onOptionItemClick(Lau/com/woolworths/feature/rewards/account/data/AccountHomeOption;)V", 0);
                                    composer2.A(accountSettingsActivity$onCreate$1$2$3$1);
                                    objG5 = accountSettingsActivity$onCreate$1$2$3$1;
                                }
                                KFunction kFunction3 = (KFunction) objG5;
                                composer2.l();
                                AccountSettingsViewModel accountSettingsViewModelO43 = accountSettingsActivity2.O4();
                                composer2.o(5004770);
                                boolean zI5 = composer2.I(accountSettingsViewModelO43);
                                Object objG6 = composer2.G();
                                if (zI5 || objG6 == composer$Companion$Empty$1) {
                                    AccountSettingsActivity$onCreate$1$2$4$1 accountSettingsActivity$onCreate$1$2$4$1 = new AccountSettingsActivity$onCreate$1$2$4$1(0, accountSettingsViewModelO43, AccountSettingsViewModel.class, "dismissChangeCountryConfirmationDialog", "dismissChangeCountryConfirmationDialog()V", 0);
                                    composer2.A(accountSettingsActivity$onCreate$1$2$4$1);
                                    objG6 = accountSettingsActivity$onCreate$1$2$4$1;
                                }
                                KFunction kFunction4 = (KFunction) objG6;
                                composer2.l();
                                AccountSettingsViewModel accountSettingsViewModelO44 = accountSettingsActivity2.O4();
                                composer2.o(5004770);
                                boolean zI6 = composer2.I(accountSettingsViewModelO44);
                                Object objG7 = composer2.G();
                                if (zI6 || objG7 == composer$Companion$Empty$1) {
                                    AccountSettingsActivity$onCreate$1$2$5$1 accountSettingsActivity$onCreate$1$2$5$1 = new AccountSettingsActivity$onCreate$1$2$5$1(0, accountSettingsViewModelO44, AccountSettingsViewModel.class, "dismissLogoutConfirmationDialog", "dismissLogoutConfirmationDialog()V", 0);
                                    composer2.A(accountSettingsActivity$onCreate$1$2$5$1);
                                    objG7 = accountSettingsActivity$onCreate$1$2$5$1;
                                }
                                KFunction kFunction5 = (KFunction) objG7;
                                composer2.l();
                                AccountSettingsViewModel accountSettingsViewModelO45 = accountSettingsActivity2.O4();
                                composer2.o(5004770);
                                boolean zI7 = composer2.I(accountSettingsViewModelO45);
                                Object objG8 = composer2.G();
                                if (zI7 || objG8 == composer$Companion$Empty$1) {
                                    AccountSettingsActivity$onCreate$1$2$6$1 accountSettingsActivity$onCreate$1$2$6$1 = new AccountSettingsActivity$onCreate$1$2$6$1(1, accountSettingsViewModelO45, AccountSettingsViewModel.class, "onBannerCloseButtonClick", "onBannerCloseButtonClick(Lau/com/woolworths/foundation/rewards/banner/model/RewardsNotificationBannerApiData;)V", 0);
                                    composer2.A(accountSettingsActivity$onCreate$1$2$6$1);
                                    objG8 = accountSettingsActivity$onCreate$1$2$6$1;
                                }
                                KFunction kFunction6 = (KFunction) objG8;
                                composer2.l();
                                AccountSettingsViewModel accountSettingsViewModelO46 = accountSettingsActivity2.O4();
                                composer2.o(5004770);
                                boolean zI8 = composer2.I(accountSettingsViewModelO46);
                                Object objG9 = composer2.G();
                                if (zI8 || objG9 == composer$Companion$Empty$1) {
                                    AccountSettingsActivity$onCreate$1$2$7$1 accountSettingsActivity$onCreate$1$2$7$1 = new AccountSettingsActivity$onCreate$1$2$7$1(1, accountSettingsViewModelO46, AccountSettingsViewModel.class, "onBannerActionButtonClick", "onBannerActionButtonClick(Lau/com/woolworths/foundation/rewards/banner/model/RewardsNotificationBannerApiData;)V", 0);
                                    composer2.A(accountSettingsActivity$onCreate$1$2$7$1);
                                    objG9 = accountSettingsActivity$onCreate$1$2$7$1;
                                }
                                KFunction kFunction7 = (KFunction) objG9;
                                composer2.l();
                                AccountSettingsViewModel accountSettingsViewModelO47 = accountSettingsActivity2.O4();
                                composer2.o(5004770);
                                boolean zI9 = composer2.I(accountSettingsViewModelO47);
                                Object objG10 = composer2.G();
                                if (zI9 || objG10 == composer$Companion$Empty$1) {
                                    objG10 = new AccountSettingsActivity$onCreate$1$2$8$1(1, accountSettingsViewModelO47, AccountSettingsViewModel.class, "onFooterActionClick", "onFooterActionClick(Lau/com/woolworths/base/rewards/account/data/IconListItemAction;)V", 0);
                                    composer2.A(objG10);
                                }
                                KFunction kFunction8 = (KFunction) objG10;
                                composer2.l();
                                AccountSettingsViewModel accountSettingsViewModelO48 = accountSettingsActivity2.O4();
                                composer2.o(5004770);
                                boolean zI10 = composer2.I(accountSettingsViewModelO48);
                                Object objG11 = composer2.G();
                                if (zI10 || objG11 == composer$Companion$Empty$1) {
                                    objG11 = new AccountSettingsActivity$onCreate$1$2$9$1(1, accountSettingsViewModelO48, AccountSettingsViewModel.class, "onItemSeen", "onItemSeen(Lau/com/woolworths/feature/rewards/account/settings/v2/model/AccountItemSeen;)V", 0);
                                    composer2.A(objG11);
                                }
                                KFunction kFunction9 = (KFunction) objG11;
                                composer2.l();
                                Function0 function0 = (Function0) kFunction;
                                Function0 function02 = (Function0) kFunction2;
                                Function1 function1 = (Function1) kFunction3;
                                composer2.o(5004770);
                                boolean zI11 = composer2.I(accountSettingsActivity2);
                                Object objG12 = composer2.G();
                                if (zI11 || objG12 == composer$Companion$Empty$1) {
                                    final int i3 = 0;
                                    objG12 = new Function0() { // from class: au.com.woolworths.feature.rewards.account.settings.v2.a
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            int i4 = i3;
                                            Unit unit = Unit.f24250a;
                                            AccountSettingsActivity accountSettingsActivity3 = accountSettingsActivity2;
                                            switch (i4) {
                                                case 0:
                                                    int i5 = AccountSettingsActivity.A;
                                                    accountSettingsActivity3.O4().s6(true);
                                                    break;
                                                default:
                                                    int i6 = AccountSettingsActivity.A;
                                                    accountSettingsActivity3.O4().s6(false);
                                                    break;
                                            }
                                            return unit;
                                        }
                                    };
                                    composer2.A(objG12);
                                }
                                Function0 function03 = (Function0) objG12;
                                composer2.l();
                                Function0 function04 = (Function0) kFunction4;
                                composer2.o(5004770);
                                boolean zI12 = composer2.I(accountSettingsActivity2);
                                Object objG13 = composer2.G();
                                if (zI12 || objG13 == composer$Companion$Empty$1) {
                                    final int i4 = 1;
                                    objG13 = new Function0() { // from class: au.com.woolworths.feature.rewards.account.settings.v2.a
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            int i42 = i4;
                                            Unit unit = Unit.f24250a;
                                            AccountSettingsActivity accountSettingsActivity3 = accountSettingsActivity2;
                                            switch (i42) {
                                                case 0:
                                                    int i5 = AccountSettingsActivity.A;
                                                    accountSettingsActivity3.O4().s6(true);
                                                    break;
                                                default:
                                                    int i6 = AccountSettingsActivity.A;
                                                    accountSettingsActivity3.O4().s6(false);
                                                    break;
                                            }
                                            return unit;
                                        }
                                    };
                                    composer2.A(objG13);
                                }
                                composer2.l();
                                AccountSettingsScreenKt.a(viewState, function0, function02, function1, function03, function04, (Function0) objG13, (Function0) kFunction5, (Function1) kFunction6, (Function1) kFunction7, (Function1) kFunction8, (Function1) kFunction9, scaffoldStateD, composer2, 0, 0, 0);
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, -799124221));
        Intent intent = getIntent();
        Intrinsics.g(intent, "getIntent(...)");
        Companion.Extras extras = (Companion.Extras) intent.getParcelableExtra("ACCOUNT_SETTINGS_EXTRAS");
        if (extras != null) {
            intent.removeExtra("ACCOUNT_SETTINGS_EXTRAS");
        } else {
            extras = null;
        }
        if (extras != null) {
            O4().q6(extras.d);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        O4().j.a(Screens.D);
    }
}
