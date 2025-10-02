package au.com.woolworths.feature.shop.myorders.editdriverinstruction;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.MenuItem;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.extensions.ViewExtKt;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.android.onesite.modules.customviews.statefulbutton.StatefulButton;
import au.com.woolworths.android.onesite.modules.customviews.statefulbutton.StatefulButtonState;
import au.com.woolworths.feature.shop.modeselector.ui.b;
import au.com.woolworths.feature.shop.myorders.databinding.ActivityEditDriverInstructionBinding;
import au.com.woolworths.feature.shop.myorders.editdriverinstruction.EditDriverInstructionsContract;
import au.com.woolworths.feature.shop.myorders.editdriverinstruction.analytics.EditDriverInstructionsActions;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/editdriverinstruction/EditDriverInstructionActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Extras", "Result", "Companion", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class EditDriverInstructionActivity extends Hilt_EditDriverInstructionActivity {
    public static final /* synthetic */ int A = 0;
    public AnalyticsManager x;
    public ActivityEditDriverInstructionBinding y;
    public final ViewModelLazy z = new ViewModelLazy(Reflection.f24268a.b(EditDriverInstructionsViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.feature.shop.myorders.editdriverinstruction.EditDriverInstructionActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getViewModelStore();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.feature.shop.myorders.editdriverinstruction.EditDriverInstructionActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelProviderFactory();
        }
    }, new Function0<CreationExtras>() { // from class: au.com.woolworths.feature.shop.myorders.editdriverinstruction.EditDriverInstructionActivity$special$$inlined$viewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelCreationExtras();
        }
    });

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/editdriverinstruction/EditDriverInstructionActivity$Companion;", "", "", "EXTRAS", "Ljava/lang/String;", "RESULT", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Parcelize
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/editdriverinstruction/EditDriverInstructionActivity$Extras;", "Landroid/os/Parcelable;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Extras implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Extras> CREATOR = new Creator();
        public final int d;
        public final String e;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Extras> {
            @Override // android.os.Parcelable.Creator
            public final Extras createFromParcel(Parcel parcel) {
                Intrinsics.h(parcel, "parcel");
                return new Extras(parcel.readInt(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Extras[] newArray(int i) {
                return new Extras[i];
            }
        }

        public Extras(int i, String savedInstructions) {
            Intrinsics.h(savedInstructions, "savedInstructions");
            this.d = i;
            this.e = savedInstructions;
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
            return "Extras(orderId=" + this.d + ", savedInstructions=" + this.e + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.h(dest, "dest");
            dest.writeInt(this.d);
            dest.writeString(this.e);
        }
    }

    @StabilityInferred
    @Parcelize
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/editdriverinstruction/EditDriverInstructionActivity$Result;", "Landroid/os/Parcelable;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Result implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Result> CREATOR = new Creator();
        public final boolean d;
        public final String e;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Result> {
            @Override // android.os.Parcelable.Creator
            public final Result createFromParcel(Parcel parcel) {
                Intrinsics.h(parcel, "parcel");
                return new Result(parcel.readInt() != 0, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Result[] newArray(int i) {
                return new Result[i];
            }
        }

        public Result(boolean z, String message) {
            Intrinsics.h(message, "message");
            this.d = z;
            this.e = message;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Result)) {
                return false;
            }
            Result result = (Result) obj;
            return this.d == result.d && Intrinsics.c(this.e, result.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + (Boolean.hashCode(this.d) * 31);
        }

        public final String toString() {
            return a.m("Result(success=", this.d, ", message=", this.e, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.h(dest, "dest");
            dest.writeInt(this.d ? 1 : 0);
            dest.writeString(this.e);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.shop.myorders.editdriverinstruction.EditDriverInstructionActivity$onCreate$2", f = "EditDriverInstructionActivity.kt", l = {69}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.shop.myorders.editdriverinstruction.EditDriverInstructionActivity$onCreate$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: au.com.woolworths.feature.shop.myorders.editdriverinstruction.EditDriverInstructionActivity$onCreate$2$1, reason: invalid class name */
        final /* synthetic */ class AnonymousClass1 extends AdaptedFunctionReference implements Function2<EditDriverInstructionsContract.Actions, Continuation<? super Unit>, Object>, SuspendFunction {
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                EditDriverInstructionsContract.Actions actions = (EditDriverInstructionsContract.Actions) obj;
                EditDriverInstructionActivity editDriverInstructionActivity = (EditDriverInstructionActivity) this.d;
                int i = EditDriverInstructionActivity.A;
                editDriverInstructionActivity.getClass();
                if (actions instanceof EditDriverInstructionsContract.Actions.ShowSnackbar) {
                    Text text = ((EditDriverInstructionsContract.Actions.ShowSnackbar) actions).f7827a;
                    ActivityEditDriverInstructionBinding activityEditDriverInstructionBinding = editDriverInstructionActivity.y;
                    if (activityEditDriverInstructionBinding == null) {
                        Intrinsics.p("binding");
                        throw null;
                    }
                    Snackbar.j(null, activityEditDriverInstructionBinding.h, text.getText(editDriverInstructionActivity), 0).l();
                } else {
                    if (!(actions instanceof EditDriverInstructionsContract.Actions.FinishWithMessage)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    editDriverInstructionActivity.setResult(-1, new Intent().putExtra("ORDER_EDIT_DRIVER_NOTES_RESULT", ((EditDriverInstructionsContract.Actions.FinishWithMessage) actions).f7826a));
                    editDriverInstructionActivity.finish();
                }
                return Unit.f24250a;
            }
        }

        public AnonymousClass2(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return EditDriverInstructionActivity.this.new AnonymousClass2(continuation);
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
                int i2 = EditDriverInstructionActivity.A;
                EditDriverInstructionActivity editDriverInstructionActivity = EditDriverInstructionActivity.this;
                FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass1(2, editDriverInstructionActivity, EditDriverInstructionActivity.class, "handleActions", "handleActions(Lau/com/woolworths/feature/shop/myorders/editdriverinstruction/EditDriverInstructionsContract$Actions;)V", 4), FlowExtKt.a(((EditDriverInstructionsViewModel) editDriverInstructionActivity.z.getD()).j, editDriverInstructionActivity.getD(), Lifecycle.State.g));
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

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        EditDriverInstructionsContract.ViewState viewState = (EditDriverInstructionsContract.ViewState) ((EditDriverInstructionsViewModel) this.z.getD()).k.e();
        if (viewState == null || viewState.f7828a == StatefulButtonState.e) {
            return;
        }
        AnalyticsManager analyticsManager = this.x;
        if (analyticsManager == null) {
            Intrinsics.p("analyticsManager");
            throw null;
        }
        analyticsManager.c(EditDriverInstructionsActions.e);
        super.onBackPressed();
    }

    @Override // au.com.woolworths.feature.shop.myorders.editdriverinstruction.Hilt_EditDriverInstructionActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Parcelable parcelableExtra = getIntent().getParcelableExtra("ORDER_EDIT_DRIVER_NOTES_EXTRAS");
        if (parcelableExtra == null) {
            throw new IllegalArgumentException("Extras data passed into Edit Driver Instruction screen is null");
        }
        Extras extras = (Extras) parcelableExtra;
        ViewModelLazy viewModelLazy = this.z;
        ((EditDriverInstructionsViewModel) viewModelLazy.getD()).g = extras;
        ActivityEditDriverInstructionBinding activityEditDriverInstructionBinding = (ActivityEditDriverInstructionBinding) DataBindingUtil.d(this, R.layout.activity_edit_driver_instruction);
        this.y = activityEditDriverInstructionBinding;
        if (activityEditDriverInstructionBinding == null) {
            Intrinsics.p("binding");
            throw null;
        }
        StatefulButton statefulButton = activityEditDriverInstructionBinding.z;
        activityEditDriverInstructionBinding.D(this);
        String string = getString(R.string.edit_driver_instruction_save_button_label);
        Intrinsics.g(string, "getString(...)");
        String string2 = getString(R.string.edit_driver_instruction_save_button_label);
        Intrinsics.g(string2, "getString(...)");
        statefulButton.a(string, string2);
        ViewExtKt.b(statefulButton, new b(16));
        activityEditDriverInstructionBinding.L((EditDriverInstructionsViewModel) viewModelLazy.getD());
        activityEditDriverInstructionBinding.y.setText(extras.e);
        ActivityEditDriverInstructionBinding activityEditDriverInstructionBinding2 = this.y;
        if (activityEditDriverInstructionBinding2 == null) {
            Intrinsics.p("binding");
            throw null;
        }
        setSupportActionBar(activityEditDriverInstructionBinding2.A);
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new AnonymousClass2(null), 3);
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
}
