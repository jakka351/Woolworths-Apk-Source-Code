package au.com.woolworths.feature.shop.myorders.editorderconditions;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.MenuItem;
import androidx.activity.compose.ComponentActivityKt;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.ActionBar;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.modules.customviews.statefulbutton.StatefulButton;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.android.onesite.navigation.ActivityNavigatorKt;
import au.com.woolworths.android.onesite.navigation.ApplicationType;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.feature.shop.myorders.MyOrdersFeature;
import au.com.woolworths.feature.shop.myorders.databinding.ActivityEditOrderConditionsBinding;
import au.com.woolworths.feature.shop.myorders.details.analytics.MyOrdersScreens;
import au.com.woolworths.feature.shop.myorders.details.models.EditOrderWarning;
import au.com.woolworths.feature.shop.myorders.editorderconditions.EditOrderConditionsContract;
import au.com.woolworths.feature.shop.myorders.editorderconditions.analytics.EditOrderConditionsActions;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.dynatrace.android.callback.Callback;
import com.google.android.material.snackbar.Snackbar;
import com.woolworths.R;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\b"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/editorderconditions/EditOrderConditionsActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Extras", "Result", "CmoReviewResult", "Companion", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class EditOrderConditionsActivity extends Hilt_EditOrderConditionsActivity {
    public static final /* synthetic */ int C = 0;
    public FeatureToggleManager A;
    public ActivityEditOrderConditionsBinding x;
    public EditOrderWarningEpoxyController z;
    public final ViewModelLazy y = new ViewModelLazy(Reflection.f24268a.b(EditOrderConditionsViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.feature.shop.myorders.editorderconditions.EditOrderConditionsActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getViewModelStore();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.feature.shop.myorders.editorderconditions.EditOrderConditionsActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelProviderFactory();
        }
    }, new Function0<CreationExtras>() { // from class: au.com.woolworths.feature.shop.myorders.editorderconditions.EditOrderConditionsActivity$special$$inlined$viewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelCreationExtras();
        }
    });
    public final ActivityResultLauncher B = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new androidx.activity.compose.a(this, 9));

    @StabilityInferred
    @Parcelize
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/editorderconditions/EditOrderConditionsActivity$CmoReviewResult;", "Landroid/os/Parcelable;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CmoReviewResult implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<CmoReviewResult> CREATOR = new Creator();
        public final boolean d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<CmoReviewResult> {
            @Override // android.os.Parcelable.Creator
            public final CmoReviewResult createFromParcel(Parcel parcel) {
                Intrinsics.h(parcel, "parcel");
                return new CmoReviewResult(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final CmoReviewResult[] newArray(int i) {
                return new CmoReviewResult[i];
            }
        }

        public CmoReviewResult(boolean z) {
            this.d = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CmoReviewResult) && this.d == ((CmoReviewResult) obj).d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d);
        }

        public final String toString() {
            return androidx.compose.ui.input.pointer.a.n("CmoReviewResult(shouldExitOrderDetailScreen=", ")", this.d);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.h(dest, "dest");
            dest.writeInt(this.d ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/editorderconditions/EditOrderConditionsActivity$Companion;", "", "", "EXTRA_EDIT_ORDER_WARNING", "Ljava/lang/String;", "RESULT", "CMO_REVIEW_RESULT", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Parcelize
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/editorderconditions/EditOrderConditionsActivity$Extras;", "Landroid/os/Parcelable;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Extras implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Extras> CREATOR = new Creator();
        public final int d;
        public final EditOrderWarning e;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Extras> {
            @Override // android.os.Parcelable.Creator
            public final Extras createFromParcel(Parcel parcel) {
                Intrinsics.h(parcel, "parcel");
                return new Extras(parcel.readInt(), EditOrderWarning.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Extras[] newArray(int i) {
                return new Extras[i];
            }
        }

        public Extras(int i, EditOrderWarning editOrderWarning) {
            Intrinsics.h(editOrderWarning, "editOrderWarning");
            this.d = i;
            this.e = editOrderWarning;
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
            return this.d == extras.d && Intrinsics.c(this.e, extras.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + (Integer.hashCode(this.d) * 31);
        }

        public final String toString() {
            return "Extras(orderId=" + this.d + ", editOrderWarning=" + this.e + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.h(dest, "dest");
            dest.writeInt(this.d);
            this.e.writeToParcel(dest, i);
        }
    }

    @StabilityInferred
    @Parcelize
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/editorderconditions/EditOrderConditionsActivity$Result;", "Landroid/os/Parcelable;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Result implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Result> CREATOR = new Creator();
        public final String d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Result> {
            @Override // android.os.Parcelable.Creator
            public final Result createFromParcel(Parcel parcel) {
                Intrinsics.h(parcel, "parcel");
                return new Result(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Result[] newArray(int i) {
                return new Result[i];
            }
        }

        public Result(String message) {
            Intrinsics.h(message, "message");
            this.d = message;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Result) && Intrinsics.c(this.d, ((Result) obj).d);
        }

        public final int hashCode() {
            return this.d.hashCode();
        }

        public final String toString() {
            return YU.a.h("Result(message=", this.d, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.h(dest, "dest");
            dest.writeString(this.d);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7837a;

        static {
            int[] iArr = new int[Activities.CmoReviewActivity.Result.Destination.values().length];
            try {
                Activities.CmoReviewActivity.Result.Destination destination = Activities.CmoReviewActivity.Result.Destination.d;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Activities.CmoReviewActivity.Result.Destination destination2 = Activities.CmoReviewActivity.Result.Destination.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f7837a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.shop.myorders.editorderconditions.EditOrderConditionsActivity$onCreate$1", f = "EditOrderConditionsActivity.kt", l = {67}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.shop.myorders.editorderconditions.EditOrderConditionsActivity$onCreate$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: au.com.woolworths.feature.shop.myorders.editorderconditions.EditOrderConditionsActivity$onCreate$1$1, reason: invalid class name and collision with other inner class name */
        final /* synthetic */ class C02081 extends AdaptedFunctionReference implements Function2<EditOrderConditionsContract.Actions, Continuation<? super Unit>, Object>, SuspendFunction {
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                EditOrderConditionsContract.Actions actions = (EditOrderConditionsContract.Actions) obj;
                EditOrderConditionsActivity editOrderConditionsActivity = (EditOrderConditionsActivity) this.d;
                int i = EditOrderConditionsActivity.C;
                editOrderConditionsActivity.getClass();
                if (actions instanceof EditOrderConditionsContract.Actions.NavigateToHome) {
                    Activities.MainActivity.f4487a.d(editOrderConditionsActivity, Activities.MainActivity.Tab.d);
                    editOrderConditionsActivity.finish();
                } else if (actions instanceof EditOrderConditionsContract.Actions.NavigateBack) {
                    editOrderConditionsActivity.finish();
                } else if (actions instanceof EditOrderConditionsContract.Actions.NavigateToCmoReview) {
                    editOrderConditionsActivity.B.a(ActivityNavigatorKt.a(Activities.CmoReviewActivity.f4458a, ApplicationType.e), null);
                } else if (actions instanceof EditOrderConditionsContract.Actions.NavigateBackWithMessage) {
                    editOrderConditionsActivity.setResult(-1, new Intent().putExtra("EDIT_ORDER_CONDITIONS_RESULT", new Result(((EditOrderConditionsContract.Actions.NavigateBackWithMessage) actions).f7839a)));
                    editOrderConditionsActivity.finish();
                } else {
                    if (!(actions instanceof EditOrderConditionsContract.Actions.ShowSnackbarMessage)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    String string = ((EditOrderConditionsContract.Actions.ShowSnackbarMessage) actions).f7842a.getText(editOrderConditionsActivity).toString();
                    ActivityEditOrderConditionsBinding activityEditOrderConditionsBinding = editOrderConditionsActivity.x;
                    if (activityEditOrderConditionsBinding == null) {
                        Intrinsics.p("binding");
                        throw null;
                    }
                    Snackbar snackbarJ = Snackbar.j(null, activityEditOrderConditionsBinding.h, string, 0);
                    ActivityEditOrderConditionsBinding activityEditOrderConditionsBinding2 = editOrderConditionsActivity.x;
                    if (activityEditOrderConditionsBinding2 == null) {
                        Intrinsics.p("binding");
                        throw null;
                    }
                    snackbarJ.f(activityEditOrderConditionsBinding2.C);
                    snackbarJ.l();
                }
                return Unit.f24250a;
            }
        }

        public AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return EditOrderConditionsActivity.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            if (i == 0) {
                ResultKt.b(obj);
                int i2 = EditOrderConditionsActivity.C;
                EditOrderConditionsActivity editOrderConditionsActivity = EditOrderConditionsActivity.this;
                FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new C02081(2, editOrderConditionsActivity, EditOrderConditionsActivity.class, "handleActions", "handleActions(Lau/com/woolworths/feature/shop/myorders/editorderconditions/EditOrderConditionsContract$Actions;)V", 4), FlowExtKt.a(editOrderConditionsActivity.O4().k, editOrderConditionsActivity.getD(), Lifecycle.State.g));
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

    public final EditOrderConditionsViewModel O4() {
        return (EditOrderConditionsViewModel) this.y.getD();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        EditOrderConditionsContract.ViewState viewState = (EditOrderConditionsContract.ViewState) O4().l.e();
        if (viewState == null || !viewState.f7843a) {
            super.onBackPressed();
        }
    }

    @Override // au.com.woolworths.feature.shop.myorders.editorderconditions.Hilt_EditOrderConditionsActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        final Extras extras = intent != null ? (Extras) intent.getParcelableExtra("EXTRA_EDIT_ORDER_WARNING") : null;
        if (extras == null) {
            extras = null;
        }
        if (extras == null) {
            throw new IllegalArgumentException("No extras passed in to EditOrderConditionsActivity");
        }
        EditOrderWarning editOrderWarning = extras.e;
        O4().m = String.valueOf(extras.d);
        this.x = (ActivityEditOrderConditionsBinding) DataBindingUtil.d(this, R.layout.activity_edit_order_conditions);
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new AnonymousClass1(null), 3);
        FeatureToggleManager featureToggleManager = this.A;
        if (featureToggleManager == null) {
            Intrinsics.p("featureToggleManager");
            throw null;
        }
        if (featureToggleManager.c(MyOrdersFeature.e)) {
            ComponentActivityKt.a(this, new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.myorders.editorderconditions.EditOrderConditionsActivity.onCreate.2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                        composer.j();
                    } else {
                        final Extras extras2 = extras;
                        final EditOrderConditionsActivity editOrderConditionsActivity = this;
                        CoreThemeKt.c(6, composer, ComposableLambdaKt.c(-1637753569, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.myorders.editorderconditions.EditOrderConditionsActivity.onCreate.2.1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                Composer composer2 = (Composer) obj3;
                                if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                    composer2.j();
                                } else {
                                    EditOrderWarning editOrderWarning2 = extras2.e;
                                    composer2.o(5004770);
                                    final EditOrderConditionsActivity editOrderConditionsActivity2 = editOrderConditionsActivity;
                                    boolean zI = composer2.I(editOrderConditionsActivity2);
                                    Object objG = composer2.G();
                                    Object obj5 = Composer.Companion.f1624a;
                                    if (zI || objG == obj5) {
                                        final int i = 0;
                                        objG = new Function0() { // from class: au.com.woolworths.feature.shop.myorders.editorderconditions.a
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                int i2 = i;
                                                Unit unit = Unit.f24250a;
                                                EditOrderConditionsActivity editOrderConditionsActivity3 = editOrderConditionsActivity2;
                                                switch (i2) {
                                                    case 0:
                                                        int i3 = EditOrderConditionsActivity.C;
                                                        EditOrderConditionsViewModel editOrderConditionsViewModelO4 = editOrderConditionsActivity3.O4();
                                                        editOrderConditionsViewModelO4.g.c(EditOrderConditionsActions.f);
                                                        editOrderConditionsViewModelO4.j.f(EditOrderConditionsContract.Actions.NavigateBack.f7838a);
                                                        break;
                                                    default:
                                                        int i4 = EditOrderConditionsActivity.C;
                                                        editOrderConditionsActivity3.O4().q6();
                                                        break;
                                                }
                                                return unit;
                                            }
                                        };
                                        composer2.A(objG);
                                    }
                                    Function0 function0 = (Function0) objG;
                                    composer2.l();
                                    composer2.o(5004770);
                                    boolean zI2 = composer2.I(editOrderConditionsActivity2);
                                    Object objG2 = composer2.G();
                                    if (zI2 || objG2 == obj5) {
                                        final int i2 = 1;
                                        objG2 = new Function0() { // from class: au.com.woolworths.feature.shop.myorders.editorderconditions.a
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                int i22 = i2;
                                                Unit unit = Unit.f24250a;
                                                EditOrderConditionsActivity editOrderConditionsActivity3 = editOrderConditionsActivity2;
                                                switch (i22) {
                                                    case 0:
                                                        int i3 = EditOrderConditionsActivity.C;
                                                        EditOrderConditionsViewModel editOrderConditionsViewModelO4 = editOrderConditionsActivity3.O4();
                                                        editOrderConditionsViewModelO4.g.c(EditOrderConditionsActions.f);
                                                        editOrderConditionsViewModelO4.j.f(EditOrderConditionsContract.Actions.NavigateBack.f7838a);
                                                        break;
                                                    default:
                                                        int i4 = EditOrderConditionsActivity.C;
                                                        editOrderConditionsActivity3.O4().q6();
                                                        break;
                                                }
                                                return unit;
                                            }
                                        };
                                        composer2.A(objG2);
                                    }
                                    composer2.l();
                                    int i3 = EditOrderConditionsActivity.C;
                                    EditOrderConditionScreenKt.c(editOrderWarning2, function0, (Function0) objG2, editOrderConditionsActivity2.O4().k, composer2, 0);
                                }
                                return Unit.f24250a;
                            }
                        }, composer));
                    }
                    return Unit.f24250a;
                }
            }, true, -1969951549));
            return;
        }
        this.x = (ActivityEditOrderConditionsBinding) DataBindingUtil.d(this, R.layout.activity_edit_order_conditions);
        this.z = new EditOrderWarningEpoxyController(O4());
        ActivityEditOrderConditionsBinding activityEditOrderConditionsBinding = this.x;
        if (activityEditOrderConditionsBinding == null) {
            Intrinsics.p("binding");
            throw null;
        }
        activityEditOrderConditionsBinding.D(this);
        activityEditOrderConditionsBinding.L(O4());
        StatefulButton statefulButton = activityEditOrderConditionsBinding.z;
        String str = editOrderWarning.h;
        statefulButton.a(str, str);
        activityEditOrderConditionsBinding.y.setText(editOrderWarning.i);
        EpoxyRecyclerView epoxyRecyclerView = activityEditOrderConditionsBinding.A;
        EditOrderWarningEpoxyController editOrderWarningEpoxyController = this.z;
        if (editOrderWarningEpoxyController == null) {
            Intrinsics.p("epoxyController");
            throw null;
        }
        epoxyRecyclerView.setController(editOrderWarningEpoxyController);
        EditOrderWarningEpoxyController editOrderWarningEpoxyController2 = this.z;
        if (editOrderWarningEpoxyController2 == null) {
            Intrinsics.p("epoxyController");
            throw null;
        }
        editOrderWarningEpoxyController2.setData(editOrderWarning);
        ActivityEditOrderConditionsBinding activityEditOrderConditionsBinding2 = this.x;
        if (activityEditOrderConditionsBinding2 == null) {
            Intrinsics.p("binding");
            throw null;
        }
        setSupportActionBar(activityEditOrderConditionsBinding2.D);
        ActionBar supportActionBar = getSupportActionBar();
        Intrinsics.e(supportActionBar);
        supportActionBar.u();
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        boolean zOnOptionsItemSelected;
        Callback.p(item);
        try {
            Intrinsics.h(item, "item");
            if (item.getItemId() == 16908332) {
                onBackPressed();
                zOnOptionsItemSelected = true;
            } else {
                zOnOptionsItemSelected = super.onOptionsItemSelected(item);
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
        O4().g.a(MyOrdersScreens.d);
    }
}
