package au.com.woolworths.feature.shop.catalogue.intro;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.MenuItem;
import androidx.activity.compose.a;
import androidx.activity.result.ActivityResultLauncher;
import androidx.appcompat.app.ActionBar;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.ActivityCompat;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.rxutils.SchedulersProvider;
import au.com.woolworths.feature.rewards.offers.detail.composable.f;
import au.com.woolworths.feature.shop.catalogue.CatalogueScreen;
import au.com.woolworths.feature.shop.catalogue.SelectStore;
import au.com.woolworths.feature.shop.catalogue.databinding.ActivityCatalogueIntroBinding;
import au.com.woolworths.feature.shop.catalogue.intro.CatalogueIntroContract;
import com.dynatrace.android.callback.Callback;
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

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/intro/CatalogueIntroActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Companion", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class CatalogueIntroActivity extends Hilt_CatalogueIntroActivity {
    public static final /* synthetic */ int D = 0;
    public ActivityCatalogueIntroBinding A;
    public AnalyticsManager x;
    public SchedulersProvider y;
    public final Lazy z = LazyKt.b(new f(this, 12));
    public final ViewModelLazy B = new ViewModelLazy(Reflection.f24268a.b(CatalogueIntroViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.feature.shop.catalogue.intro.CatalogueIntroActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getViewModelStore();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.feature.shop.catalogue.intro.CatalogueIntroActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelProviderFactory();
        }
    }, new Function0<CreationExtras>() { // from class: au.com.woolworths.feature.shop.catalogue.intro.CatalogueIntroActivity$special$$inlined$viewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelCreationExtras();
        }
    });
    public final ActivityResultLauncher C = registerForActivityResult(new SelectStore(), new a(this, 8));

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/intro/CatalogueIntroActivity$Companion;", "", "", "EXTRA_CATALOGUE_INTRO", "Ljava/lang/String;", "Extras", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {

        @StabilityInferred
        @Parcelize
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/intro/CatalogueIntroActivity$Companion$Extras;", "Landroid/os/Parcelable;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
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

            public Extras(String str) {
                this.d = str;
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
                String str = this.d;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final String toString() {
                return YU.a.h("Extras(deepLink=", this.d, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.h(dest, "dest");
                dest.writeString(this.d);
            }
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.shop.catalogue.intro.CatalogueIntroActivity$onCreate$2", f = "CatalogueIntroActivity.kt", l = {76}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.shop.catalogue.intro.CatalogueIntroActivity$onCreate$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: au.com.woolworths.feature.shop.catalogue.intro.CatalogueIntroActivity$onCreate$2$1, reason: invalid class name */
        final /* synthetic */ class AnonymousClass1 extends AdaptedFunctionReference implements Function2<CatalogueIntroContract.Actions, Continuation<? super Unit>, Object>, SuspendFunction {
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                CatalogueIntroActivity catalogueIntroActivity = (CatalogueIntroActivity) this.d;
                if (((CatalogueIntroContract.Actions) obj) instanceof CatalogueIntroContract.Actions.LaunchCatalogueStoreSelection) {
                    catalogueIntroActivity.C.a(null, null);
                    return Unit.f24250a;
                }
                int i = CatalogueIntroActivity.D;
                catalogueIntroActivity.getClass();
                throw new NoWhenBranchMatchedException();
            }
        }

        public AnonymousClass2(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return CatalogueIntroActivity.this.new AnonymousClass2(continuation);
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
                int i2 = CatalogueIntroActivity.D;
                CatalogueIntroActivity catalogueIntroActivity = CatalogueIntroActivity.this;
                FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass1(2, catalogueIntroActivity, CatalogueIntroActivity.class, "handleAction", "handleAction(Lau/com/woolworths/feature/shop/catalogue/intro/CatalogueIntroContract$Actions;)V", 4), FlowExtKt.a(((CatalogueIntroViewModel) catalogueIntroActivity.B.getD()).g, catalogueIntroActivity.getD(), Lifecycle.State.h));
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

    @Override // au.com.woolworths.feature.shop.catalogue.intro.Hilt_CatalogueIntroActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ActivityCatalogueIntroBinding activityCatalogueIntroBinding = (ActivityCatalogueIntroBinding) DataBindingUtil.d(this, R.layout.activity_catalogue_intro);
        this.A = activityCatalogueIntroBinding;
        if (activityCatalogueIntroBinding == null) {
            Intrinsics.p("activityCatalogueIntroBinding");
            throw null;
        }
        activityCatalogueIntroBinding.D(this);
        activityCatalogueIntroBinding.L((CatalogueIntroViewModel) this.B.getD());
        ActivityCatalogueIntroBinding activityCatalogueIntroBinding2 = this.A;
        if (activityCatalogueIntroBinding2 == null) {
            Intrinsics.p("activityCatalogueIntroBinding");
            throw null;
        }
        setSupportActionBar(activityCatalogueIntroBinding2.z);
        ActionBar supportActionBar = getSupportActionBar();
        Intrinsics.e(supportActionBar);
        supportActionBar.s(true);
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new AnonymousClass2(null), 3);
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        Callback.p(item);
        try {
            Intrinsics.h(item, "item");
            if (item.getItemId() == 16908332) {
                ActivityCompat.h(this);
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

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        String str;
        super.onResume();
        Companion.Extras extras = (Companion.Extras) this.z.getD();
        if (extras == null || (str = extras.d) == null) {
            AnalyticsManager analyticsManager = this.x;
            if (analyticsManager != null) {
                analyticsManager.a(CatalogueScreen.h);
                return;
            } else {
                Intrinsics.p("analyticsManager");
                throw null;
            }
        }
        AnalyticsManager analyticsManager2 = this.x;
        if (analyticsManager2 == null) {
            Intrinsics.p("analyticsManager");
            throw null;
        }
        CatalogueScreen catalogueScreen = CatalogueScreen.h;
        TrackingMetadata trackingMetadataA = TrackingMetadata.Companion.a(TrackableValue.h0, str);
        trackingMetadataA.b(TrackableValue.g0, Boolean.TRUE);
        analyticsManager2.e(catalogueScreen, trackingMetadataA);
    }
}
