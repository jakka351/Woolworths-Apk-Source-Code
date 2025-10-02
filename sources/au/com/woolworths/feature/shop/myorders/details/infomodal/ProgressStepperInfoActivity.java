package au.com.woolworths.feature.shop.myorders.details.infomodal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.OnBackPressedCallback;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.feature.shop.myorders.databinding.ActivityProgressStepperInfoBinding;
import au.com.woolworths.feature.shop.myorders.details.models.StepsToolTip;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.woolworths.R;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.internal.ChannelFlow;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/infomodal/ProgressStepperInfoActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Companion", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ProgressStepperInfoActivity extends Hilt_ProgressStepperInfoActivity {
    public static final /* synthetic */ int z = 0;
    public ProgressStepperInfoController x;
    public final ViewModelLazy y = new ViewModelLazy(Reflection.f24268a.b(ProgressStepperInfoViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.feature.shop.myorders.details.infomodal.ProgressStepperInfoActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getD();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.feature.shop.myorders.details.infomodal.ProgressStepperInfoActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelProviderFactory();
        }
    }, new Function0<CreationExtras>() { // from class: au.com.woolworths.feature.shop.myorders.details.infomodal.ProgressStepperInfoActivity$special$$inlined$viewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelCreationExtras();
        }
    });

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/infomodal/ProgressStepperInfoActivity$Companion;", "", "", "EXTRAS_PROGRESS_STEPPER_INFO", "Ljava/lang/String;", "Extras", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {

        @StabilityInferred
        @Parcelize
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/infomodal/ProgressStepperInfoActivity$Companion$Extras;", "Landroid/os/Parcelable;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Extras implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Extras> CREATOR = new Creator();
            public final StepsToolTip d;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Extras> {
                @Override // android.os.Parcelable.Creator
                public final Extras createFromParcel(Parcel parcel) {
                    Intrinsics.h(parcel, "parcel");
                    return new Extras(StepsToolTip.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final Extras[] newArray(int i) {
                    return new Extras[i];
                }
            }

            public Extras(StepsToolTip toolTip) {
                Intrinsics.h(toolTip, "toolTip");
                this.d = toolTip;
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
                return "Extras(toolTip=" + this.d + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.h(dest, "dest");
                this.d.writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.shop.myorders.details.infomodal.ProgressStepperInfoActivity$onCreate$3", f = "ProgressStepperInfoActivity.kt", l = {55}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.shop.myorders.details.infomodal.ProgressStepperInfoActivity$onCreate$3, reason: invalid class name */
    final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        public AnonymousClass3(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return ProgressStepperInfoActivity.this.new AnonymousClass3(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass3) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            if (i == 0) {
                ResultKt.b(obj);
                final ProgressStepperInfoActivity progressStepperInfoActivity = ProgressStepperInfoActivity.this;
                Flow flowA = FlowExtKt.a(((ProgressStepperInfoViewModel) progressStepperInfoActivity.y.getD()).f, progressStepperInfoActivity.getD(), Lifecycle.State.g);
                FlowCollector flowCollector = new FlowCollector() { // from class: au.com.woolworths.feature.shop.myorders.details.infomodal.ProgressStepperInfoActivity.onCreate.3.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(Object obj2, Continuation continuation) {
                        ProgressStepperInfoViewState progressStepperInfoViewState = (ProgressStepperInfoViewState) obj2;
                        ProgressStepperInfoController progressStepperInfoController = progressStepperInfoActivity.x;
                        if (progressStepperInfoController != null) {
                            progressStepperInfoController.setData(progressStepperInfoViewState.f7738a);
                            return Unit.f24250a;
                        }
                        Intrinsics.p("progressStepperInfoController");
                        throw null;
                    }
                };
                this.p = 1;
                if (((ChannelFlow) flowA).collect(flowCollector, this) == coroutineSingletons) {
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

    @Override // au.com.woolworths.feature.shop.myorders.details.infomodal.Hilt_ProgressStepperInfoActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getF().a(this, new OnBackPressedCallback() { // from class: au.com.woolworths.feature.shop.myorders.details.infomodal.ProgressStepperInfoActivity.onCreate.1
            @Override // androidx.activity.OnBackPressedCallback
            public final void e() {
                ProgressStepperInfoActivity.this.finish();
            }
        });
        this.x = new ProgressStepperInfoController();
        ActivityProgressStepperInfoBinding activityProgressStepperInfoBinding = (ActivityProgressStepperInfoBinding) DataBindingUtil.d(this, R.layout.activity_progress_stepper_info);
        if (activityProgressStepperInfoBinding == null) {
            Intrinsics.p("binding");
            throw null;
        }
        activityProgressStepperInfoBinding.z.setNavigationOnClickListener(new au.com.woolworths.base.shopapp.customviews.a(this, 9));
        EpoxyRecyclerView epoxyRecyclerView = activityProgressStepperInfoBinding.y;
        ProgressStepperInfoController progressStepperInfoController = this.x;
        if (progressStepperInfoController == null) {
            Intrinsics.p("progressStepperInfoController");
            throw null;
        }
        epoxyRecyclerView.setController(progressStepperInfoController);
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new AnonymousClass3(null), 3);
    }
}
