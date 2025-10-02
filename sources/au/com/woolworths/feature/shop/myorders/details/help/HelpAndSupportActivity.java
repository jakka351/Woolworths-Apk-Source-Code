package au.com.woolworths.feature.shop.myorders.details.help;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.compose.ComponentActivityKt;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.IntentCompat;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.android.onesite.analytics.Screen;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.feature.rewards.offers.detail.composable.f;
import au.com.woolworths.feature.shop.myorders.details.analytics.MyOrdersScreens;
import au.com.woolworths.feature.shop.myorders.details.help.HelpAndSupportActivity;
import au.com.woolworths.feature.shop.myorders.details.help.HelpAndSupportContract;
import au.com.woolworths.feature.shop.myorders.details.help.HelpAndSupportViewModel;
import au.com.woolworths.feature.shop.myorders.details.help.models.OrderHelpDataList;
import com.woolworths.R;
import dagger.hilt.android.AndroidEntryPoint;
import dagger.hilt.android.lifecycle.HiltViewModelExtensions;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/help/HelpAndSupportActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "Extras", "HelpAndSupportHostScreen", "Companion", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class HelpAndSupportActivity extends Hilt_HelpAndSupportActivity {
    public static final /* synthetic */ int y = 0;
    public final Lazy w = LazyKt.b(new Function0<Extras>() { // from class: au.com.woolworths.feature.shop.myorders.details.help.HelpAndSupportActivity$special$$inlined$extraOrThrow$1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Parcelable parcelable = (Parcelable) IntentCompat.a(this.d.getIntent(), ".helpData", HelpAndSupportActivity.Extras.class);
            if (parcelable != null) {
                return parcelable;
            }
            throw new IllegalArgumentException("Value for .helpData must be provided and not null.");
        }
    });
    public final ViewModelLazy x = new ViewModelLazy(Reflection.f24268a.b(HelpAndSupportViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.feature.shop.myorders.details.help.HelpAndSupportActivity$special$$inlined$assistedViewModels$1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.d.getD();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.feature.shop.myorders.details.help.HelpAndSupportActivity$special$$inlined$assistedViewModels$2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.d.getDefaultViewModelProviderFactory();
        }
    }, new Function0<CreationExtras>() { // from class: au.com.woolworths.feature.shop.myorders.details.help.HelpAndSupportActivity$special$$inlined$assistedViewModels$3
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            CreationExtras defaultViewModelCreationExtras = this.d.getDefaultViewModelCreationExtras();
            final HelpAndSupportActivity helpAndSupportActivity = this;
            return HiltViewModelExtensions.a(defaultViewModelCreationExtras, new Function1<HelpAndSupportViewModel.Factory, ViewModel>() { // from class: au.com.woolworths.feature.shop.myorders.details.help.HelpAndSupportActivity$special$$inlined$assistedViewModels$3.1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ((HelpAndSupportViewModel.Factory) obj).a(((HelpAndSupportActivity.Extras) helpAndSupportActivity.w.getD()).e);
                }
            });
        }
    });

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/help/HelpAndSupportActivity$Companion;", "", "", "EXTRA_HELP_DATA", "Ljava/lang/String;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public static void a(Activity activity, OrderHelpDataList helpData, MyOrdersScreens myOrdersScreens) {
            Intrinsics.h(helpData, "helpData");
            HelpAndSupportHostScreen helpAndSupportHostScreen = new HelpAndSupportHostScreen(myOrdersScreens.getD(), myOrdersScreens.getE(), myOrdersScreens.getF());
            Intent intent = new Intent(activity, (Class<?>) HelpAndSupportActivity.class);
            intent.putExtra(".helpData", new Extras(helpData, helpAndSupportHostScreen));
            activity.startActivity(intent);
        }
    }

    @Parcelize
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0083\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/help/HelpAndSupportActivity$Extras;", "Landroid/os/Parcelable;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Extras implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Extras> CREATOR = new Creator();
        public final OrderHelpDataList d;
        public final HelpAndSupportHostScreen e;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Extras> {
            @Override // android.os.Parcelable.Creator
            public final Extras createFromParcel(Parcel parcel) {
                Intrinsics.h(parcel, "parcel");
                return new Extras(OrderHelpDataList.CREATOR.createFromParcel(parcel), HelpAndSupportHostScreen.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Extras[] newArray(int i) {
                return new Extras[i];
            }
        }

        public Extras(OrderHelpDataList helpData, HelpAndSupportHostScreen hostScreen) {
            Intrinsics.h(helpData, "helpData");
            Intrinsics.h(hostScreen, "hostScreen");
            this.d = helpData;
            this.e = hostScreen;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Extras)) {
                return false;
            }
            Extras extras = (Extras) obj;
            return Intrinsics.c(this.d, extras.d) && Intrinsics.c(this.e, extras.e);
        }

        public final int hashCode() {
            return (this.d.hashCode() * 31) + this.e.hashCode();
        }

        public final String toString() {
            return "Extras(helpData=" + this.d + ", hostScreen=" + this.e + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.h(dest, "dest");
            this.d.writeToParcel(dest, i);
            this.e.writeToParcel(dest, i);
        }
    }

    @Parcelize
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0083\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/help/HelpAndSupportActivity$HelpAndSupportHostScreen;", "Lau/com/woolworths/android/onesite/analytics/Screen;", "Landroid/os/Parcelable;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class HelpAndSupportHostScreen implements Screen, Parcelable {

        @NotNull
        public static final Parcelable.Creator<HelpAndSupportHostScreen> CREATOR = new Creator();
        public final String d;
        public final String e;
        public final String f;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<HelpAndSupportHostScreen> {
            @Override // android.os.Parcelable.Creator
            public final HelpAndSupportHostScreen createFromParcel(Parcel parcel) {
                Intrinsics.h(parcel, "parcel");
                return new HelpAndSupportHostScreen(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final HelpAndSupportHostScreen[] newArray(int i) {
                return new HelpAndSupportHostScreen[i];
            }
        }

        public HelpAndSupportHostScreen(String screenName, String sectionName, String screenTealiumKey) {
            Intrinsics.h(screenName, "screenName");
            Intrinsics.h(sectionName, "sectionName");
            Intrinsics.h(screenTealiumKey, "screenTealiumKey");
            this.d = screenName;
            this.e = sectionName;
            this.f = screenTealiumKey;
        }

        @Override // au.com.woolworths.android.onesite.analytics.Screen
        /* renamed from: a, reason: from getter */
        public final String getE() {
            return this.e;
        }

        @Override // au.com.woolworths.android.onesite.analytics.Screen
        /* renamed from: b, reason: from getter */
        public final String getF() {
            return this.f;
        }

        @Override // au.com.woolworths.android.onesite.analytics.Screen
        /* renamed from: d, reason: from getter */
        public final String getD() {
            return this.d;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HelpAndSupportHostScreen)) {
                return false;
            }
            HelpAndSupportHostScreen helpAndSupportHostScreen = (HelpAndSupportHostScreen) obj;
            return Intrinsics.c(this.d, helpAndSupportHostScreen.d) && Intrinsics.c(this.e, helpAndSupportHostScreen.e) && Intrinsics.c(this.f, helpAndSupportHostScreen.f);
        }

        public final int hashCode() {
            return this.f.hashCode() + b.c(this.d.hashCode() * 31, 31, this.e);
        }

        public final String toString() {
            return YU.a.o(YU.a.v("HelpAndSupportHostScreen(screenName=", this.d, ", sectionName=", this.e, ", screenTealiumKey="), this.f, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.h(dest, "dest");
            dest.writeString(this.d);
            dest.writeString(this.e);
            dest.writeString(this.f);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lau/com/woolworths/feature/shop/myorders/details/help/HelpAndSupportContract$Actions;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.shop.myorders.details.help.HelpAndSupportActivity$onCreate$2", f = "HelpAndSupportActivity.kt", l = {}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.shop.myorders.details.help.HelpAndSupportActivity$onCreate$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements Function2<HelpAndSupportContract.Actions, Continuation<? super Unit>, Object> {
        public /* synthetic */ Object p;

        public AnonymousClass2(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass2 anonymousClass2 = HelpAndSupportActivity.this.new AnonymousClass2(continuation);
            anonymousClass2.p = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass2 anonymousClass2 = (AnonymousClass2) create((HelpAndSupportContract.Actions) obj, (Continuation) obj2);
            Unit unit = Unit.f24250a;
            anonymousClass2.invokeSuspend(unit);
            return unit;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            ResultKt.b(obj);
            HelpAndSupportContract.Actions actions = (HelpAndSupportContract.Actions) this.p;
            int i = HelpAndSupportActivity.y;
            boolean z = actions instanceof HelpAndSupportContract.Actions.OpenFAQs;
            Activities.WebViewActivity webViewActivity = Activities.WebViewActivity.f4554a;
            HelpAndSupportActivity helpAndSupportActivity = HelpAndSupportActivity.this;
            if (z) {
                String string = helpAndSupportActivity.getString(R.string.faq_screen_name);
                Intrinsics.g(string, "getString(...)");
                String str = ((HelpAndSupportContract.Actions.OpenFAQs) actions).f7713a;
                String string2 = helpAndSupportActivity.getString(R.string.faq_analytics_screen_name);
                Intrinsics.g(string2, "getString(...)");
                helpAndSupportActivity.startActivity(webViewActivity.b(new Activities.WebViewActivity.Extras(56, str, string, string2)));
            } else if (actions instanceof HelpAndSupportContract.Actions.OpenMessageUs) {
                HelpAndSupportContract.Actions.OpenMessageUs openMessageUs = (HelpAndSupportContract.Actions.OpenMessageUs) actions;
                helpAndSupportActivity.startActivity(Activities.AskOliveActivity.b(4, openMessageUs.f7714a, openMessageUs.b, null));
            } else if (actions instanceof HelpAndSupportContract.Actions.OpenCallUs) {
                HelpAndSupportContract.Actions.OpenCallUs openCallUs = (HelpAndSupportContract.Actions.OpenCallUs) actions;
                helpAndSupportActivity.startActivity(webViewActivity.b(new Activities.WebViewActivity.Extras(56, openCallUs.b, openCallUs.f7712a, "")));
            } else {
                if (!(actions instanceof HelpAndSupportContract.Actions.Back)) {
                    throw new NoWhenBranchMatchedException();
                }
                helpAndSupportActivity.finish();
            }
            return Unit.f24250a;
        }
    }

    @Override // au.com.woolworths.feature.shop.myorders.details.help.Hilt_HelpAndSupportActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ComponentActivityKt.a(this, new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.myorders.details.help.HelpAndSupportActivity.onCreate.1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    final HelpAndSupportActivity helpAndSupportActivity = HelpAndSupportActivity.this;
                    CoreThemeKt.c(6, composer, ComposableLambdaKt.c(-1937247729, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.myorders.details.help.HelpAndSupportActivity.onCreate.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                HelpAndSupportActivity helpAndSupportActivity2 = helpAndSupportActivity;
                                OrderHelpDataList orderHelpDataList = ((Extras) helpAndSupportActivity2.w.getD()).d;
                                composer2.o(5004770);
                                boolean zI = composer2.I(helpAndSupportActivity2);
                                Object objG = composer2.G();
                                Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                                if (zI || objG == composer$Companion$Empty$1) {
                                    objG = new f(helpAndSupportActivity2, 28);
                                    composer2.A(objG);
                                }
                                Function0 function0 = (Function0) objG;
                                composer2.l();
                                composer2.o(5004770);
                                boolean zI2 = composer2.I(helpAndSupportActivity2);
                                Object objG2 = composer2.G();
                                if (zI2 || objG2 == composer$Companion$Empty$1) {
                                    objG2 = new au.com.woolworths.feature.shop.instore.navigation.map.utils.a(helpAndSupportActivity2, 1);
                                    composer2.A(objG2);
                                }
                                composer2.l();
                                HelpAndSupportScreenKt.e(orderHelpDataList, function0, (Function1) objG2, composer2, 0);
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, 1391687915));
        FlowKt.E(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass2(null), FlowExtKt.a(((HelpAndSupportViewModel) this.x.getD()).h, getD(), Lifecycle.State.g)), LifecycleOwnerKt.a(this));
    }
}
