package au.com.woolworths.feature.shop.editorder.errorscreen;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.MenuItem;
import androidx.activity.OnBackPressedDispatcherKt;
import androidx.appcompat.app.ActionBar;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.analytics.Screens;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui.l;
import au.com.woolworths.feature.shop.editorder.analytics.EditOrderErrorActions;
import au.com.woolworths.feature.shop.editorder.databinding.ActivityEditOrderErrorBinding;
import au.com.woolworths.feature.shop.editorder.errorscreen.EditOrderErrorContract;
import com.dynatrace.android.callback.Callback;
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

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/shop/editorder/errorscreen/EditOrderErrorActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "edit-order_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class EditOrderErrorActivity extends Hilt_EditOrderErrorActivity {
    public static final /* synthetic */ int z = 0;
    public ActivityEditOrderErrorBinding x;
    public final ViewModelLazy y = new ViewModelLazy(Reflection.f24268a.b(EditOrderErrorViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.feature.shop.editorder.errorscreen.EditOrderErrorActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getD();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.feature.shop.editorder.errorscreen.EditOrderErrorActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelProviderFactory();
        }
    }, new Function0<CreationExtras>() { // from class: au.com.woolworths.feature.shop.editorder.errorscreen.EditOrderErrorActivity$special$$inlined$viewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelCreationExtras();
        }
    });

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.shop.editorder.errorscreen.EditOrderErrorActivity$onCreate$2", f = "EditOrderErrorActivity.kt", l = {56}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.shop.editorder.errorscreen.EditOrderErrorActivity$onCreate$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: au.com.woolworths.feature.shop.editorder.errorscreen.EditOrderErrorActivity$onCreate$2$1, reason: invalid class name */
        final /* synthetic */ class AnonymousClass1 extends AdaptedFunctionReference implements Function2<EditOrderErrorContract.Actions, Continuation<? super Unit>, Object>, SuspendFunction {
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                EditOrderErrorActivity editOrderErrorActivity = (EditOrderErrorActivity) this.d;
                int i = EditOrderErrorActivity.z;
                editOrderErrorActivity.getClass();
                if (!(((EditOrderErrorContract.Actions) obj) instanceof EditOrderErrorContract.Actions.NavigateToHome)) {
                    throw new NoWhenBranchMatchedException();
                }
                Activities.MainActivity.f4487a.d(editOrderErrorActivity, Activities.MainActivity.Tab.d);
                editOrderErrorActivity.finish();
                return Unit.f24250a;
            }
        }

        public AnonymousClass2(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return EditOrderErrorActivity.this.new AnonymousClass2(continuation);
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
                int i2 = EditOrderErrorActivity.z;
                EditOrderErrorActivity editOrderErrorActivity = EditOrderErrorActivity.this;
                FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass1(2, editOrderErrorActivity, EditOrderErrorActivity.class, "handleActions", "handleActions(Lau/com/woolworths/feature/shop/editorder/errorscreen/EditOrderErrorContract$Actions;)V", 4), FlowExtKt.a(editOrderErrorActivity.O4().i, editOrderErrorActivity.getD(), Lifecycle.State.h));
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

    public final EditOrderErrorViewModel O4() {
        return (EditOrderErrorViewModel) this.y.getD();
    }

    @Override // au.com.woolworths.feature.shop.editorder.errorscreen.Hilt_EditOrderErrorActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Parcelable parcelableExtra = getIntent().getParcelableExtra("EXTRA_DATA");
        if (parcelableExtra == null) {
            throw new IllegalArgumentException("Edit Order Error Page launched without error message!");
        }
        Activities.EditOrderErrorActivity.Extras extras = (Activities.EditOrderErrorActivity.Extras) parcelableExtra;
        ActivityEditOrderErrorBinding activityEditOrderErrorBinding = (ActivityEditOrderErrorBinding) DataBindingUtil.d(this, R.layout.activity_edit_order_error);
        this.x = activityEditOrderErrorBinding;
        if (activityEditOrderErrorBinding == null) {
            Intrinsics.p("binding");
            throw null;
        }
        activityEditOrderErrorBinding.L(extras);
        activityEditOrderErrorBinding.M(O4());
        EditOrderErrorViewModel editOrderErrorViewModelO4 = O4();
        Screens screen = extras.g;
        Intrinsics.h(screen, "screen");
        editOrderErrorViewModelO4.g = screen;
        ActivityEditOrderErrorBinding activityEditOrderErrorBinding2 = this.x;
        if (activityEditOrderErrorBinding2 == null) {
            Intrinsics.p("binding");
            throw null;
        }
        setSupportActionBar(activityEditOrderErrorBinding2.A);
        ActionBar supportActionBar = getSupportActionBar();
        Intrinsics.e(supportActionBar);
        supportActionBar.u();
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new AnonymousClass2(null), 3);
        O4().f.x();
        OnBackPressedDispatcherKt.a(getF(), this, new l(this, 20), 2);
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        boolean zOnOptionsItemSelected;
        Callback.p(item);
        try {
            Intrinsics.h(item, "item");
            if (item.getItemId() == 16908332) {
                O4().p6();
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
        EditOrderErrorViewModel editOrderErrorViewModelO4 = O4();
        AnalyticsManager analyticsManager = editOrderErrorViewModelO4.e;
        Screens screens = editOrderErrorViewModelO4.g;
        if (screens != null) {
            analyticsManager.c(new EditOrderErrorActions.ErrorImpression(screens));
        } else {
            Intrinsics.p("analyticsScreen");
            throw null;
        }
    }
}
