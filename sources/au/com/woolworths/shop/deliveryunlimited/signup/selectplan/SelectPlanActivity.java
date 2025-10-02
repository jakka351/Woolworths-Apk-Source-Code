package au.com.woolworths.shop.deliveryunlimited.signup.selectplan;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.MenuItem;
import androidx.appcompat.app.ActionBar;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.analytics.Screens;
import au.com.woolworths.android.onesite.extensions.ContextExtKt;
import au.com.woolworths.android.onesite.extensions.ViewExtKt;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerApiData;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerApiDataExtKt;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.android.onesite.navigation.ActivityNavigatorKt;
import au.com.woolworths.android.onesite.navigation.ApplicationType;
import au.com.woolworths.shop.deliveryunlimited.signup.confirmsubscription.ConfirmSubscriptionActivity;
import au.com.woolworths.shop.deliveryunlimited.signup.data.DeliveryUnlimitedSignUpPlan;
import au.com.woolworths.shop.deliveryunlimited.signup.data.DeliveryUnlimitedSignUpPlanType;
import au.com.woolworths.shop.deliveryunlimited.signup.data.DeliveryUnlimitedSignUpPlanTypeUiModel;
import au.com.woolworths.shop.deliveryunlimited.signup.data.DeliveryUnlimitedSignUpPlanUiModel;
import au.com.woolworths.shop.deliveryunlimited.signup.data.DeliveryUnlimitedSignUpPlans;
import au.com.woolworths.shop.deliveryunlimited.signup.databinding.ActivityDeliveryUnlimitedSelectPlanBinding;
import au.com.woolworths.shop.deliveryunlimited.signup.selectplan.SelectPlanActivity;
import au.com.woolworths.shop.deliveryunlimited.signup.selectplan.SelectPlanContract;
import au.com.woolworths.shop.deliveryunlimited.signup.selectplan.SelectPlanViewModel;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.dynatrace.android.callback.Callback;
import com.woolworths.R;
import dagger.hilt.android.AndroidEntryPoint;
import dagger.hilt.android.lifecycle.HiltViewModelExtensions;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/shop/deliveryunlimited/signup/selectplan/SelectPlanActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Companion", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class SelectPlanActivity extends Hilt_SelectPlanActivity {
    public static final /* synthetic */ int C = 0;
    public ActivityDeliveryUnlimitedSelectPlanBinding A;
    public SelectPlanEpoxyController B;
    public AnalyticsManager x;
    public final Lazy y = LazyKt.b(new Function0() { // from class: au.com.woolworths.shop.deliveryunlimited.signup.selectplan.b
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            int i = SelectPlanActivity.C;
            SelectPlanActivity.Companion.Extras extras = (SelectPlanActivity.Companion.Extras) this.d.getIntent().getParcelableExtra("EXTRAS_DATA");
            if (extras != null) {
                return extras;
            }
            throw new IllegalStateException("Launching DU select plan page without data");
        }
    });
    public final ViewModelLazy z = new ViewModelLazy(Reflection.f24268a.b(SelectPlanViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.shop.deliveryunlimited.signup.selectplan.SelectPlanActivity$special$$inlined$assistedViewModels$1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.d.getViewModelStore();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.shop.deliveryunlimited.signup.selectplan.SelectPlanActivity$special$$inlined$assistedViewModels$2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.d.getDefaultViewModelProviderFactory();
        }
    }, new Function0<CreationExtras>() { // from class: au.com.woolworths.shop.deliveryunlimited.signup.selectplan.SelectPlanActivity$special$$inlined$assistedViewModels$3
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            CreationExtras defaultViewModelCreationExtras = this.d.getDefaultViewModelCreationExtras();
            final SelectPlanActivity selectPlanActivity = this;
            return HiltViewModelExtensions.a(defaultViewModelCreationExtras, new Function1<SelectPlanViewModel.Factory, ViewModel>() { // from class: au.com.woolworths.shop.deliveryunlimited.signup.selectplan.SelectPlanActivity$special$$inlined$assistedViewModels$3.1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    SelectPlanViewModel.Factory factory = (SelectPlanViewModel.Factory) obj;
                    int i = SelectPlanActivity.C;
                    SelectPlanActivity selectPlanActivity2 = selectPlanActivity;
                    List planTypes = selectPlanActivity2.O4().d.getPlanTypes();
                    ArrayList arrayList = new ArrayList(CollectionsKt.s(planTypes, 10));
                    int i2 = 0;
                    for (Object obj2 : planTypes) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            CollectionsKt.z0();
                            throw null;
                        }
                        DeliveryUnlimitedSignUpPlanType deliveryUnlimitedSignUpPlanType = (DeliveryUnlimitedSignUpPlanType) obj2;
                        boolean z = i2 == 0;
                        Intrinsics.h(deliveryUnlimitedSignUpPlanType, "<this>");
                        String title = deliveryUnlimitedSignUpPlanType.getTitle();
                        List feed = deliveryUnlimitedSignUpPlanType.getFeed();
                        ArrayList arrayList2 = new ArrayList(CollectionsKt.s(feed, 10));
                        for (Object uiModel : feed) {
                            if (uiModel instanceof DeliveryUnlimitedSignUpPlan) {
                                if (deliveryUnlimitedSignUpPlanType.getDefaultPlanSelection() != null) {
                                    DeliveryUnlimitedSignUpPlan deliveryUnlimitedSignUpPlan = (DeliveryUnlimitedSignUpPlan) uiModel;
                                    uiModel = DeliveryUnlimitedSignUpPlanUiModel.a(new DeliveryUnlimitedSignUpPlanUiModel(deliveryUnlimitedSignUpPlan.getIdentifier(), deliveryUnlimitedSignUpPlan.getTitle(), deliveryUnlimitedSignUpPlan.getSubtitle(), deliveryUnlimitedSignUpPlan.getPrice(), deliveryUnlimitedSignUpPlan.getBadge(), false), Intrinsics.c(deliveryUnlimitedSignUpPlanType.getDefaultPlanSelection(), deliveryUnlimitedSignUpPlan.getIdentifier()));
                                } else {
                                    DeliveryUnlimitedSignUpPlan deliveryUnlimitedSignUpPlan2 = (DeliveryUnlimitedSignUpPlan) uiModel;
                                    uiModel = new DeliveryUnlimitedSignUpPlanUiModel(deliveryUnlimitedSignUpPlan2.getIdentifier(), deliveryUnlimitedSignUpPlan2.getTitle(), deliveryUnlimitedSignUpPlan2.getSubtitle(), deliveryUnlimitedSignUpPlan2.getPrice(), deliveryUnlimitedSignUpPlan2.getBadge(), false);
                                }
                            } else if (uiModel instanceof InsetBannerApiData) {
                                uiModel = InsetBannerApiDataExtKt.toUiModel((InsetBannerApiData) uiModel);
                            }
                            arrayList2.add(uiModel);
                        }
                        arrayList.add(new DeliveryUnlimitedSignUpPlanTypeUiModel(title, z, arrayList2));
                        i2 = i3;
                    }
                    return factory.a(arrayList, selectPlanActivity2.O4().e);
                }
            });
        }
    });

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/shop/deliveryunlimited/signup/selectplan/SelectPlanActivity$Companion;", "", "", "EXTRAS_DATA", "Ljava/lang/String;", "Extras", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {

        @Parcelize
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/deliveryunlimited/signup/selectplan/SelectPlanActivity$Companion$Extras;", "Landroid/os/Parcelable;", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Extras implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Extras> CREATOR = new Creator();
            public final DeliveryUnlimitedSignUpPlans d;
            public final boolean e;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Extras> {
                @Override // android.os.Parcelable.Creator
                public final Extras createFromParcel(Parcel parcel) {
                    Intrinsics.h(parcel, "parcel");
                    return new Extras(DeliveryUnlimitedSignUpPlans.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                public final Extras[] newArray(int i) {
                    return new Extras[i];
                }
            }

            public Extras(DeliveryUnlimitedSignUpPlans selectPlanPage, boolean z) {
                Intrinsics.h(selectPlanPage, "selectPlanPage");
                this.d = selectPlanPage;
                this.e = z;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.h(dest, "dest");
                this.d.writeToParcel(dest, i);
                dest.writeInt(this.e ? 1 : 0);
            }
        }

        public static void a(Activity activity, DeliveryUnlimitedSignUpPlans selectPlanPage, boolean z) {
            Intrinsics.h(activity, "activity");
            Intrinsics.h(selectPlanPage, "selectPlanPage");
            activity.startActivity(new Intent(activity, (Class<?>) SelectPlanActivity.class).putExtra("EXTRAS_DATA", new Extras(selectPlanPage, z)));
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.shop.deliveryunlimited.signup.selectplan.SelectPlanActivity$onCreate$2", f = "SelectPlanActivity.kt", l = {81}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.shop.deliveryunlimited.signup.selectplan.SelectPlanActivity$onCreate$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: au.com.woolworths.shop.deliveryunlimited.signup.selectplan.SelectPlanActivity$onCreate$2$1, reason: invalid class name */
        final /* synthetic */ class AnonymousClass1 extends AdaptedFunctionReference implements Function2<SelectPlanContract.Actions, Continuation<? super Unit>, Object>, SuspendFunction {
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                SelectPlanContract.Actions actions = (SelectPlanContract.Actions) obj;
                SelectPlanActivity selectPlanActivity = (SelectPlanActivity) this.d;
                int i = SelectPlanActivity.C;
                selectPlanActivity.getClass();
                if (actions instanceof SelectPlanContract.Actions.LaunchPaymentScreen) {
                    String str = ((SelectPlanContract.Actions.LaunchPaymentScreen) actions).f10898a;
                    Intent intentPutExtra = ActivityNavigatorKt.a(Activities.DeliveryUnlimitedPaymentActivity.f4467a, ApplicationType.e).putExtra("deliveryUnlimitedPaymentExtra", new Activities.DeliveryUnlimitedPaymentActivity.Extras(str));
                    Intrinsics.g(intentPutExtra, "putExtra(...)");
                    selectPlanActivity.startActivity(intentPutExtra);
                } else if (actions instanceof SelectPlanContract.Actions.LaunchConfirmSubscription) {
                    selectPlanActivity.startActivity(new Intent(selectPlanActivity, (Class<?>) ConfirmSubscriptionActivity.class).putExtra(".plan_id", ((SelectPlanContract.Actions.LaunchConfirmSubscription) actions).f10897a));
                } else {
                    if (!(actions instanceof SelectPlanContract.Actions.OpenUrl)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ContextExtKt.j(selectPlanActivity, ((SelectPlanContract.Actions.OpenUrl) actions).f10899a, null, null, null, 62);
                }
                return Unit.f24250a;
            }
        }

        public AnonymousClass2(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return SelectPlanActivity.this.new AnonymousClass2(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            if (i == 0) {
                ResultKt.b(obj);
                int i2 = SelectPlanActivity.C;
                SelectPlanActivity selectPlanActivity = SelectPlanActivity.this;
                FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass1(2, selectPlanActivity, SelectPlanActivity.class, "handleActions", "handleActions(Lau/com/woolworths/shop/deliveryunlimited/signup/selectplan/SelectPlanContract$Actions;)V", 4), FlowExtKt.a(FlowKt.a(((SelectPlanViewModel) selectPlanActivity.z.getD()).j), selectPlanActivity.getD(), Lifecycle.State.h));
                this.p = 1;
                if (FlowKt.g(flowKt__TransformKt$onEach$$inlined$unsafeTransform$1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            return Unit.f24250a;
        }
    }

    public final Companion.Extras O4() {
        return (Companion.Extras) this.y.getD();
    }

    @Override // au.com.woolworths.shop.deliveryunlimited.signup.selectplan.Hilt_SelectPlanActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A = (ActivityDeliveryUnlimitedSelectPlanBinding) DataBindingUtil.d(this, R.layout.activity_delivery_unlimited_select_plan);
        ViewModelLazy viewModelLazy = this.z;
        SelectPlanViewModel selectPlanViewModel = (SelectPlanViewModel) viewModelLazy.getD();
        AnalyticsManager analyticsManager = this.x;
        if (analyticsManager == null) {
            Intrinsics.p("analyticsManager");
            throw null;
        }
        this.B = new SelectPlanEpoxyController(selectPlanViewModel, analyticsManager);
        ActivityDeliveryUnlimitedSelectPlanBinding activityDeliveryUnlimitedSelectPlanBinding = this.A;
        if (activityDeliveryUnlimitedSelectPlanBinding == null) {
            Intrinsics.p("binding");
            throw null;
        }
        EpoxyRecyclerView epoxyRecyclerView = activityDeliveryUnlimitedSelectPlanBinding.y;
        activityDeliveryUnlimitedSelectPlanBinding.D(this);
        activityDeliveryUnlimitedSelectPlanBinding.N((SelectPlanViewModel) viewModelLazy.getD());
        activityDeliveryUnlimitedSelectPlanBinding.M(O4().d);
        activityDeliveryUnlimitedSelectPlanBinding.L(O4().d.getFooter().getButton());
        SelectPlanEpoxyController selectPlanEpoxyController = this.B;
        if (selectPlanEpoxyController == null) {
            Intrinsics.p("epoxyController");
            throw null;
        }
        epoxyRecyclerView.setController(selectPlanEpoxyController);
        epoxyRecyclerView.setItemAnimator(null);
        ConstraintLayout footer = activityDeliveryUnlimitedSelectPlanBinding.A;
        Intrinsics.g(footer, "footer");
        ViewExtKt.a(footer);
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new AnonymousClass2(null), 3);
        ActivityDeliveryUnlimitedSelectPlanBinding activityDeliveryUnlimitedSelectPlanBinding2 = this.A;
        if (activityDeliveryUnlimitedSelectPlanBinding2 == null) {
            Intrinsics.p("binding");
            throw null;
        }
        setSupportActionBar(activityDeliveryUnlimitedSelectPlanBinding2.C);
        ActionBar supportActionBar = getSupportActionBar();
        Intrinsics.e(supportActionBar);
        supportActionBar.A(O4().d.getTitle());
        supportActionBar.s(true);
        ((SelectPlanViewModel) viewModelLazy.getD()).i.f(this, new SelectPlanActivity$sam$androidx_lifecycle_Observer$0(new a(this)));
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        boolean zOnOptionsItemSelected;
        Callback.p(menuItem);
        try {
            Intrinsics.h(menuItem, "menuItem");
            if (menuItem.getItemId() == 16908332) {
                onBackPressed();
                zOnOptionsItemSelected = true;
            } else {
                zOnOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            }
            Callback.q();
            return zOnOptionsItemSelected;
        } catch (Throwable th) {
            Callback.q();
            throw th;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        AnalyticsManager analyticsManager = this.x;
        if (analyticsManager != null) {
            analyticsManager.e(Screens.L, TrackingMetadata.Companion.a(TrackableValue.o0, "Plan Selection"));
        } else {
            Intrinsics.p("analyticsManager");
            throw null;
        }
    }
}
