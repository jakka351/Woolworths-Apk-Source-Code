package au.com.woolworths.feature.shop.catalogue.termsandconditions;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.MenuItem;
import androidx.appcompat.app.ActionBar;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.input.pointer.a;
import androidx.databinding.DataBinderMapperImpl;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.PausingDispatcherKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import au.com.woolworths.feature.shop.catalogue.databinding.ActivityTermsAndConditionsBinding;
import au.com.woolworths.feature.shop.catalogue.home.model.Term;
import au.com.woolworths.feature.shop.catalogue.termsandconditions.TermsAndConditionsContract;
import com.dynatrace.android.callback.Callback;
import com.woolworths.R;
import dagger.hilt.android.AndroidEntryPoint;
import java.util.ArrayList;
import java.util.Iterator;
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
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/termsandconditions/TermsAndConditionsActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Extra", "Companion", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class TermsAndConditionsActivity extends Hilt_TermsAndConditionsActivity {
    public final ViewModelLazy x = new ViewModelLazy(Reflection.f24268a.b(TermsAndConditionsViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.feature.shop.catalogue.termsandconditions.TermsAndConditionsActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getD();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.feature.shop.catalogue.termsandconditions.TermsAndConditionsActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelProviderFactory();
        }
    }, new Function0<CreationExtras>() { // from class: au.com.woolworths.feature.shop.catalogue.termsandconditions.TermsAndConditionsActivity$special$$inlined$viewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelCreationExtras();
        }
    });
    public ActivityTermsAndConditionsBinding y;
    public TermsEpoxyController z;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/termsandconditions/TermsAndConditionsActivity$Companion;", "", "", "EXTRA_TERMS_AND_CONDITIONS", "Ljava/lang/String;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Parcelize
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/termsandconditions/TermsAndConditionsActivity$Extra;", "Landroid/os/Parcelable;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Extra implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Extra> CREATOR = new Creator();
        public final ArrayList d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Extra> {
            @Override // android.os.Parcelable.Creator
            public final Extra createFromParcel(Parcel parcel) {
                Intrinsics.h(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = a.e(Term.CREATOR, parcel, arrayList, iE, 1);
                }
                return new Extra(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Extra[] newArray(int i) {
                return new Extra[i];
            }
        }

        public Extra(ArrayList arrayList) {
            this.d = arrayList;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Extra) && this.d.equals(((Extra) obj).d);
        }

        public final int hashCode() {
            return this.d.hashCode();
        }

        public final String toString() {
            return au.com.woolworths.android.onesite.a.k("Extra(terms=", ")", this.d);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.h(dest, "dest");
            ArrayList arrayList = this.d;
            dest.writeInt(arrayList.size());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((Term) it.next()).writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.shop.catalogue.termsandconditions.TermsAndConditionsActivity$onCreate$1", f = "TermsAndConditionsActivity.kt", l = {59}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.shop.catalogue.termsandconditions.TermsAndConditionsActivity$onCreate$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;
        public final /* synthetic */ Extra r;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "au.com.woolworths.feature.shop.catalogue.termsandconditions.TermsAndConditionsActivity$onCreate$1$1", f = "TermsAndConditionsActivity.kt", l = {}, m = "invokeSuspend")
        /* renamed from: au.com.woolworths.feature.shop.catalogue.termsandconditions.TermsAndConditionsActivity$onCreate$1$1, reason: invalid class name and collision with other inner class name */
        final class C01621 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public final /* synthetic */ TermsAndConditionsActivity p;
            public final /* synthetic */ Extra q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C01621(TermsAndConditionsActivity termsAndConditionsActivity, Extra extra, Continuation continuation) {
                super(2, continuation);
                this.p = termsAndConditionsActivity;
                this.q = extra;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new C01621(this.p, this.q, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                C01621 c01621 = (C01621) create((CoroutineScope) obj, (Continuation) obj2);
                Unit unit = Unit.f24250a;
                c01621.invokeSuspend(unit);
                return unit;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                ResultKt.b(obj);
                ((TermsAndConditionsViewModel) this.p.x.getD()).e.setValue(new TermsAndConditionsContract.ViewState(this.q.d));
                return Unit.f24250a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Extra extra, Continuation continuation) {
            super(2, continuation);
            this.r = extra;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return TermsAndConditionsActivity.this.new AnonymousClass1(this.r, continuation);
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
                Extra extra = this.r;
                TermsAndConditionsActivity termsAndConditionsActivity = TermsAndConditionsActivity.this;
                C01621 c01621 = new C01621(termsAndConditionsActivity, extra, null);
                this.p = 1;
                if (PausingDispatcherKt.a(termsAndConditionsActivity.getD(), Lifecycle.State.g, c01621, this) == coroutineSingletons) {
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

    @Override // au.com.woolworths.feature.shop.catalogue.termsandconditions.Hilt_TermsAndConditionsActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LayoutInflater layoutInflater = getLayoutInflater();
        int i = ActivityTermsAndConditionsBinding.A;
        DataBinderMapperImpl dataBinderMapperImpl = DataBindingUtil.f2545a;
        ActivityTermsAndConditionsBinding activityTermsAndConditionsBinding = (ActivityTermsAndConditionsBinding) ViewDataBinding.q(layoutInflater, R.layout.activity_terms_and_conditions, null, false, null);
        this.y = activityTermsAndConditionsBinding;
        if (activityTermsAndConditionsBinding == null) {
            Intrinsics.p("binding");
            throw null;
        }
        setContentView(activityTermsAndConditionsBinding.h);
        ActivityTermsAndConditionsBinding activityTermsAndConditionsBinding2 = this.y;
        if (activityTermsAndConditionsBinding2 == null) {
            Intrinsics.p("binding");
            throw null;
        }
        activityTermsAndConditionsBinding2.y.setLayoutManager(new LinearLayoutManager(1));
        TermsEpoxyController termsEpoxyController = new TermsEpoxyController();
        this.z = termsEpoxyController;
        ActivityTermsAndConditionsBinding activityTermsAndConditionsBinding3 = this.y;
        if (activityTermsAndConditionsBinding3 == null) {
            Intrinsics.p("binding");
            throw null;
        }
        activityTermsAndConditionsBinding3.y.setAdapter(termsEpoxyController.getAdapter());
        ActivityTermsAndConditionsBinding activityTermsAndConditionsBinding4 = this.y;
        if (activityTermsAndConditionsBinding4 == null) {
            Intrinsics.p("binding");
            throw null;
        }
        setSupportActionBar(activityTermsAndConditionsBinding4.z);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        supportActionBar.s(true);
        Bundle extras = getIntent().getExtras();
        Extra extra = extras != null ? (Extra) extras.getParcelable("extra_terms_and_conditions") : null;
        if (extra == null) {
            throw new IllegalArgumentException("Expected TermsAndConditionsActivity.Extra to be passed in intent extras");
        }
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new TermsAndConditionsActivity$observeViewState$1(this, null), 3);
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new AnonymousClass1(extra, null), 3);
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        Callback.p(item);
        try {
            Intrinsics.h(item, "item");
            if (item.getItemId() == 16908332) {
                finish();
                Callback.q();
                return true;
            }
            boolean zOnOptionsItemSelected = super.onOptionsItemSelected(item);
            Callback.q();
            return zOnOptionsItemSelected;
        } catch (Throwable th) {
            Callback.q();
            throw th;
        }
    }
}
