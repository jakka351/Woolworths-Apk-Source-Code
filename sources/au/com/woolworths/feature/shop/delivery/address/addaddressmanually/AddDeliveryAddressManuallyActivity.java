package au.com.woolworths.feature.shop.delivery.address.addaddressmanually;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui.l;
import au.com.woolworths.feature.rewards.offers.detail.composable.f;
import au.com.woolworths.feature.shop.delivery.address.addaddressmanually.AddDeliveryAddressManuallyContract;
import au.com.woolworths.feature.shop.delivery.address.databinding.ActivityAddDeliveryAddressManuallyBinding;
import com.dynatrace.android.callback.Callback;
import com.google.android.material.snackbar.Snackbar;
import com.woolworths.R;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Lazy;
import kotlin.LazyKt;
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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/feature/shop/delivery/address/addaddressmanually/AddDeliveryAddressManuallyActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Extras", "Companion", "delivery-address_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class AddDeliveryAddressManuallyActivity extends Hilt_AddDeliveryAddressManuallyActivity {
    public static final /* synthetic */ int A = 0;
    public ActivityAddDeliveryAddressManuallyBinding x;
    public final ViewModelLazy y = new ViewModelLazy(Reflection.f24268a.b(AddDeliveryAddressManuallyViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.feature.shop.delivery.address.addaddressmanually.AddDeliveryAddressManuallyActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getD();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.feature.shop.delivery.address.addaddressmanually.AddDeliveryAddressManuallyActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelProviderFactory();
        }
    }, new Function0<CreationExtras>() { // from class: au.com.woolworths.feature.shop.delivery.address.addaddressmanually.AddDeliveryAddressManuallyActivity$special$$inlined$viewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelCreationExtras();
        }
    });
    public final Lazy z = LazyKt.b(new f(this, 17));

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/shop/delivery/address/addaddressmanually/AddDeliveryAddressManuallyActivity$Companion;", "", "", "EXTRAS", "Ljava/lang/String;", "delivery-address_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Parcelize
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/delivery/address/addaddressmanually/AddDeliveryAddressManuallyActivity$Extras;", "Landroid/os/Parcelable;", "delivery-address_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Extras implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Extras> CREATOR = new Creator();
        public final boolean d;
        public final boolean e;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Extras> {
            @Override // android.os.Parcelable.Creator
            public final Extras createFromParcel(Parcel parcel) {
                Intrinsics.h(parcel, "parcel");
                return new Extras(parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Extras[] newArray(int i) {
                return new Extras[i];
            }
        }

        public Extras(boolean z, boolean z2) {
            this.d = z;
            this.e = z2;
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
            return this.d == extras.d && this.e == extras.e;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.e) + (Boolean.hashCode(this.d) * 31);
        }

        public final String toString() {
            return "Extras(isAddressUsedForBilling=" + this.d + ", isAlternateAddress=" + this.e + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.h(dest, "dest");
            dest.writeInt(this.d ? 1 : 0);
            dest.writeInt(this.e ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.shop.delivery.address.addaddressmanually.AddDeliveryAddressManuallyActivity$onCreate$3", f = "AddDeliveryAddressManuallyActivity.kt", l = {69}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.shop.delivery.address.addaddressmanually.AddDeliveryAddressManuallyActivity$onCreate$3, reason: invalid class name */
    final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: au.com.woolworths.feature.shop.delivery.address.addaddressmanually.AddDeliveryAddressManuallyActivity$onCreate$3$1, reason: invalid class name */
        final /* synthetic */ class AnonymousClass1 extends AdaptedFunctionReference implements Function2<AddDeliveryAddressManuallyContract.Actions, Continuation<? super Unit>, Object>, SuspendFunction {
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                AddDeliveryAddressManuallyContract.Actions actions = (AddDeliveryAddressManuallyContract.Actions) obj;
                AddDeliveryAddressManuallyActivity addDeliveryAddressManuallyActivity = (AddDeliveryAddressManuallyActivity) this.d;
                int i = AddDeliveryAddressManuallyActivity.A;
                addDeliveryAddressManuallyActivity.getClass();
                if (actions instanceof AddDeliveryAddressManuallyContract.Actions.ShowSnackbarMessage) {
                    String string = addDeliveryAddressManuallyActivity.getString(((AddDeliveryAddressManuallyContract.Actions.ShowSnackbarMessage) actions).f7048a);
                    Intrinsics.g(string, "getString(...)");
                    ActivityAddDeliveryAddressManuallyBinding activityAddDeliveryAddressManuallyBinding = addDeliveryAddressManuallyActivity.x;
                    if (activityAddDeliveryAddressManuallyBinding == null) {
                        Intrinsics.p("binding");
                        throw null;
                    }
                    Snackbar.j(null, activityAddDeliveryAddressManuallyBinding.h, string, 0).l();
                } else {
                    if (!(actions instanceof AddDeliveryAddressManuallyContract.Actions.CloseScreen)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    addDeliveryAddressManuallyActivity.setResult(-1, new Intent().putExtra("RESULT_MESSAGE_EXTRA", addDeliveryAddressManuallyActivity.getString(R.string.delivery_address_details_updated_message)));
                    addDeliveryAddressManuallyActivity.onBackPressed();
                }
                return Unit.f24250a;
            }
        }

        public AnonymousClass3(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return AddDeliveryAddressManuallyActivity.this.new AnonymousClass3(continuation);
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
                int i2 = AddDeliveryAddressManuallyActivity.A;
                AddDeliveryAddressManuallyActivity addDeliveryAddressManuallyActivity = AddDeliveryAddressManuallyActivity.this;
                FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass1(2, addDeliveryAddressManuallyActivity, AddDeliveryAddressManuallyActivity.class, "handleActions", "handleActions(Lau/com/woolworths/feature/shop/delivery/address/addaddressmanually/AddDeliveryAddressManuallyContract$Actions;)V", 4), FlowExtKt.a(addDeliveryAddressManuallyActivity.O4().k, addDeliveryAddressManuallyActivity.getD(), Lifecycle.State.g));
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

    public final AddDeliveryAddressManuallyViewModel O4() {
        return (AddDeliveryAddressManuallyViewModel) this.y.getD();
    }

    @Override // au.com.woolworths.feature.shop.delivery.address.addaddressmanually.Hilt_AddDeliveryAddressManuallyActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Parcelable parcelableExtra = getIntent().getParcelableExtra("ADD_DELIVERY_ADDRESS_MANUALLY_EXTRAS");
        if (parcelableExtra == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Extras extras = (Extras) parcelableExtra;
        O4().l = extras.d;
        O4().m = extras.e;
        ActivityAddDeliveryAddressManuallyBinding activityAddDeliveryAddressManuallyBinding = (ActivityAddDeliveryAddressManuallyBinding) DataBindingUtil.d(this, R.layout.activity_add_delivery_address_manually);
        this.x = activityAddDeliveryAddressManuallyBinding;
        if (activityAddDeliveryAddressManuallyBinding == null) {
            Intrinsics.p("binding");
            throw null;
        }
        AutoCompleteTextView autoCompleteTextView = activityAddDeliveryAddressManuallyBinding.D;
        activityAddDeliveryAddressManuallyBinding.D(this);
        activityAddDeliveryAddressManuallyBinding.L(O4());
        autoCompleteTextView.setAdapter((ArrayAdapter) this.z.getD());
        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: au.com.woolworths.feature.shop.delivery.address.addaddressmanually.a
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
                AddDeliveryAddressManuallyActivity addDeliveryAddressManuallyActivity = this.d;
                int i2 = AddDeliveryAddressManuallyActivity.A;
                Callback.j(view);
                try {
                    addDeliveryAddressManuallyActivity.O4().u6(i);
                } finally {
                    Callback.k();
                }
            }
        });
        ActivityAddDeliveryAddressManuallyBinding activityAddDeliveryAddressManuallyBinding2 = this.x;
        if (activityAddDeliveryAddressManuallyBinding2 == null) {
            Intrinsics.p("binding");
            throw null;
        }
        setSupportActionBar(activityAddDeliveryAddressManuallyBinding2.F);
        O4().i.f(this, new AddDeliveryAddressManuallyActivity$sam$androidx_lifecycle_Observer$0(new l(this, 19)));
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new AnonymousClass3(null), 3);
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        boolean zOnOptionsItemSelected;
        Callback.p(item);
        try {
            Intrinsics.h(item, "item");
            if (item.getItemId() == 16908332) {
                finish();
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
        O4().h.a(AddDeliveryAddressScreen.d);
    }
}
