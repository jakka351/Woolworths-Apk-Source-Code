package au.com.woolworths.feature.shop.myorders.details.cancel;

import YU.a;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Html;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.view.MenuItem;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.res.ResourcesCompat;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.appdata.AppConfig;
import au.com.woolworths.android.onesite.extensions.SpannableStringExtKt;
import au.com.woolworths.android.onesite.extensions.ViewExtKt;
import au.com.woolworths.feature.shop.modeselector.ui.b;
import au.com.woolworths.feature.shop.myorders.databinding.ActivityOrderCancelPromptBinding;
import au.com.woolworths.feature.shop.myorders.details.cancel.OrderCancellationPromptContract;
import au.com.woolworths.feature.shop.myorders.details.models.OrderCancelWarning;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/cancel/OrderCancellationPromptActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Extras", "Result", "Companion", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class OrderCancellationPromptActivity extends Hilt_OrderCancellationPromptActivity {
    public static final /* synthetic */ int C = 0;
    public ActivityOrderCancelPromptBinding A;
    public Extras B;
    public AnalyticsManager x;
    public AppConfig y;
    public final ViewModelLazy z = new ViewModelLazy(Reflection.f24268a.b(OrderCancellationPromptViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.feature.shop.myorders.details.cancel.OrderCancellationPromptActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getViewModelStore();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.feature.shop.myorders.details.cancel.OrderCancellationPromptActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelProviderFactory();
        }
    }, new Function0<CreationExtras>() { // from class: au.com.woolworths.feature.shop.myorders.details.cancel.OrderCancellationPromptActivity$special$$inlined$viewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelCreationExtras();
        }
    });

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/cancel/OrderCancellationPromptActivity$Companion;", "", "", "EXTRAS", "Ljava/lang/String;", "RESULT", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Parcelize
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/cancel/OrderCancellationPromptActivity$Extras;", "Landroid/os/Parcelable;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Extras implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Extras> CREATOR = new Creator();
        public final int d;
        public final OrderCancelWarning e;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Extras> {
            @Override // android.os.Parcelable.Creator
            public final Extras createFromParcel(Parcel parcel) {
                Intrinsics.h(parcel, "parcel");
                return new Extras(parcel.readInt(), OrderCancelWarning.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Extras[] newArray(int i) {
                return new Extras[i];
            }
        }

        public Extras(int i, OrderCancelWarning cancelWarning) {
            Intrinsics.h(cancelWarning, "cancelWarning");
            this.d = i;
            this.e = cancelWarning;
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
            return "Extras(orderId=" + this.d + ", cancelWarning=" + this.e + ")";
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
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/cancel/OrderCancellationPromptActivity$Result;", "Landroid/os/Parcelable;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Result implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Result> CREATOR = new Creator();
        public final int d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Result> {
            @Override // android.os.Parcelable.Creator
            public final Result createFromParcel(Parcel parcel) {
                Intrinsics.h(parcel, "parcel");
                return new Result(parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final Result[] newArray(int i) {
                return new Result[i];
            }
        }

        public Result(int i) {
            this.d = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Result) && this.d == ((Result) obj).d;
        }

        public final int hashCode() {
            return Integer.hashCode(this.d);
        }

        public final String toString() {
            return a.e(this.d, "Result(messageResId=", ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.h(dest, "dest");
            dest.writeInt(this.d);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.shop.myorders.details.cancel.OrderCancellationPromptActivity$onCreate$2", f = "OrderCancellationPromptActivity.kt", l = {83}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.shop.myorders.details.cancel.OrderCancellationPromptActivity$onCreate$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: au.com.woolworths.feature.shop.myorders.details.cancel.OrderCancellationPromptActivity$onCreate$2$1, reason: invalid class name */
        final /* synthetic */ class AnonymousClass1 extends AdaptedFunctionReference implements Function2<OrderCancellationPromptContract.Actions, Continuation<? super Unit>, Object>, SuspendFunction {
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                OrderCancellationPromptContract.Actions actions = (OrderCancellationPromptContract.Actions) obj;
                OrderCancellationPromptActivity orderCancellationPromptActivity = (OrderCancellationPromptActivity) this.d;
                int i = OrderCancellationPromptActivity.C;
                orderCancellationPromptActivity.getClass();
                if (actions instanceof OrderCancellationPromptContract.Actions.CancelSuccess) {
                    Intent intent = new Intent();
                    intent.putExtra("ORDER_CANCEL_WARNING_RESULT", new Result(R.string.cancel_order_successful));
                    orderCancellationPromptActivity.setResult(-1, intent);
                    orderCancellationPromptActivity.finish();
                } else if (actions instanceof OrderCancellationPromptContract.Actions.ShowSnackbarMessage) {
                    int i2 = ((OrderCancellationPromptContract.Actions.ShowSnackbarMessage) actions).f7695a;
                    ActivityOrderCancelPromptBinding activityOrderCancelPromptBinding = orderCancellationPromptActivity.A;
                    if (activityOrderCancelPromptBinding == null) {
                        Intrinsics.p("binding");
                        throw null;
                    }
                    Snackbar snackbarI = Snackbar.i(activityOrderCancelPromptBinding.h, i2, 0);
                    ActivityOrderCancelPromptBinding activityOrderCancelPromptBinding2 = orderCancellationPromptActivity.A;
                    if (activityOrderCancelPromptBinding2 == null) {
                        Intrinsics.p("binding");
                        throw null;
                    }
                    snackbarI.f(activityOrderCancelPromptBinding2.z);
                    snackbarI.l();
                } else {
                    if (!(actions instanceof OrderCancellationPromptContract.Actions.OrderOutOfWindow)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    orderCancellationPromptActivity.finish();
                }
                return Unit.f24250a;
            }
        }

        public AnonymousClass2(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return OrderCancellationPromptActivity.this.new AnonymousClass2(continuation);
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
                int i2 = OrderCancellationPromptActivity.C;
                OrderCancellationPromptActivity orderCancellationPromptActivity = OrderCancellationPromptActivity.this;
                FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass1(2, orderCancellationPromptActivity, OrderCancellationPromptActivity.class, "handleActions", "handleActions(Lau/com/woolworths/feature/shop/myorders/details/cancel/OrderCancellationPromptContract$Actions;)V", 4), FlowExtKt.a(((OrderCancellationPromptViewModel) orderCancellationPromptActivity.z.getD()).k, orderCancellationPromptActivity.getD(), Lifecycle.State.g));
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

    @Override // au.com.woolworths.feature.shop.myorders.details.cancel.Hilt_OrderCancellationPromptActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A = (ActivityOrderCancelPromptBinding) DataBindingUtil.d(this, R.layout.activity_order_cancel_prompt);
        Extras extras = (Extras) getIntent().getParcelableExtra("ORDER_CANCEL_WARNING_EXTRAS");
        if (extras == null) {
            throw new IllegalStateException("OrderCancellationPromptActivity should contain extras");
        }
        this.B = extras;
        ActivityOrderCancelPromptBinding activityOrderCancelPromptBinding = this.A;
        if (activityOrderCancelPromptBinding == null) {
            Intrinsics.p("binding");
            throw null;
        }
        TextView content = activityOrderCancelPromptBinding.A;
        activityOrderCancelPromptBinding.D(this);
        ViewModelLazy viewModelLazy = this.z;
        activityOrderCancelPromptBinding.M((OrderCancellationPromptViewModel) viewModelLazy.getD());
        Intrinsics.g(content, "content");
        Extras extras2 = this.B;
        if (extras2 == null) {
            Intrinsics.p("extrasData");
            throw null;
        }
        String source = extras2.e.f;
        Typeface typefaceCreate = Typeface.create(ResourcesCompat.e(R.font.roboto_medium, content.getContext()), 0);
        Intrinsics.h(source, "source");
        SpannableString spannableString = new SpannableString(Html.fromHtml(source, 0));
        Object[] spans = spannableString.getSpans(0, spannableString.length(), URLSpan.class);
        Intrinsics.g(spans, "getSpans(...)");
        for (Object obj : spans) {
            URLSpan uRLSpan = (URLSpan) obj;
            String string = spannableString.subSequence(spannableString.getSpanStart(uRLSpan), spannableString.getSpanEnd(uRLSpan)).toString();
            spannableString.removeSpan(uRLSpan);
            SpannableStringExtKt.a(spannableString, string, typefaceCreate, new androidx.navigation.compose.a(2, content, uRLSpan));
        }
        content.setText(spannableString);
        content.setMovementMethod(LinkMovementMethod.getInstance());
        Extras extras3 = this.B;
        if (extras3 == null) {
            Intrinsics.p("extrasData");
            throw null;
        }
        activityOrderCancelPromptBinding.L(Integer.valueOf(extras3.d));
        setSupportActionBar(activityOrderCancelPromptBinding.F);
        ActionBar supportActionBar = getSupportActionBar();
        Intrinsics.e(supportActionBar);
        supportActionBar.s(true);
        ConstraintLayout cancelOrderSlider = activityOrderCancelPromptBinding.z;
        Intrinsics.g(cancelOrderSlider, "cancelOrderSlider");
        ViewExtKt.b(cancelOrderSlider, new b(6));
        OrderCancellationPromptViewModel orderCancellationPromptViewModel = (OrderCancellationPromptViewModel) viewModelLazy.getD();
        Extras extras4 = this.B;
        if (extras4 == null) {
            Intrinsics.p("extrasData");
            throw null;
        }
        OrderCancelWarning cancelWarning = extras4.e;
        Intrinsics.h(cancelWarning, "cancelWarning");
        orderCancellationPromptViewModel.h.m(new OrderCancellationPromptContract.ViewState(false, cancelWarning, null));
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
