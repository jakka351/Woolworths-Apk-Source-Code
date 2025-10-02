package au.com.woolworths.feature.shop.catalogue.storeselector;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
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
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui.l;
import au.com.woolworths.feature.shop.catalogue.CatalogueScreen;
import au.com.woolworths.feature.shop.catalogue.databinding.ActivityCatalogueStoreSelectorBinding;
import au.com.woolworths.feature.shop.catalogue.models.CatalogueStoreInfo;
import au.com.woolworths.feature.shop.catalogue.storeselector.CatalogueStoreSelectorContract;
import com.dynatrace.android.callback.Callback;
import com.woolworths.R;
import com.xwray.groupie.GroupAdapter;
import com.xwray.groupie.Section;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/storeselector/CatalogueStoreSelectorActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class CatalogueStoreSelectorActivity extends Hilt_CatalogueStoreSelectorActivity {
    public static final /* synthetic */ int C = 0;
    public AnalyticsManager x;
    public ActivityCatalogueStoreSelectorBinding y;
    public final ViewModelLazy z = new ViewModelLazy(Reflection.f24268a.b(CatalogueStoreSelectorViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.feature.shop.catalogue.storeselector.CatalogueStoreSelectorActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getViewModelStore();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.feature.shop.catalogue.storeselector.CatalogueStoreSelectorActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelProviderFactory();
        }
    }, new Function0<CreationExtras>() { // from class: au.com.woolworths.feature.shop.catalogue.storeselector.CatalogueStoreSelectorActivity$special$$inlined$viewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelCreationExtras();
        }
    });
    public final GroupAdapter A = new GroupAdapter();
    public final Section B = new Section();

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[CatalogueStoreSelectorContract.PageState.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                CatalogueStoreSelectorContract.PageState pageState = CatalogueStoreSelectorContract.PageState.d;
                iArr[3] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                CatalogueStoreSelectorContract.PageState pageState2 = CatalogueStoreSelectorContract.PageState.d;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                CatalogueStoreSelectorContract.PageState pageState3 = CatalogueStoreSelectorContract.PageState.d;
                iArr[1] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.shop.catalogue.storeselector.CatalogueStoreSelectorActivity$onCreate$2", f = "CatalogueStoreSelectorActivity.kt", l = {57}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.shop.catalogue.storeselector.CatalogueStoreSelectorActivity$onCreate$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: au.com.woolworths.feature.shop.catalogue.storeselector.CatalogueStoreSelectorActivity$onCreate$2$1, reason: invalid class name */
        final /* synthetic */ class AnonymousClass1 extends AdaptedFunctionReference implements Function2<CatalogueStoreSelectorContract.Actions, Continuation<? super Unit>, Object>, SuspendFunction {
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                CatalogueStoreSelectorContract.Actions actions = (CatalogueStoreSelectorContract.Actions) obj;
                CatalogueStoreSelectorActivity catalogueStoreSelectorActivity = (CatalogueStoreSelectorActivity) this.d;
                int i = CatalogueStoreSelectorActivity.C;
                catalogueStoreSelectorActivity.getClass();
                if (!(actions instanceof CatalogueStoreSelectorContract.Actions.PickStoreForCatalogue)) {
                    throw new NoWhenBranchMatchedException();
                }
                CatalogueStoreInfo storeInfo = ((CatalogueStoreSelectorContract.Actions.PickStoreForCatalogue) actions).f6950a;
                Intrinsics.h(storeInfo, "storeInfo");
                Intent intentPutExtra = new Intent().putExtra("extra_store_info", storeInfo);
                Intrinsics.g(intentPutExtra, "putExtra(...)");
                catalogueStoreSelectorActivity.setResult(-1, intentPutExtra);
                catalogueStoreSelectorActivity.finish();
                return Unit.f24250a;
            }
        }

        public AnonymousClass2(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return CatalogueStoreSelectorActivity.this.new AnonymousClass2(continuation);
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
                int i2 = CatalogueStoreSelectorActivity.C;
                CatalogueStoreSelectorActivity catalogueStoreSelectorActivity = CatalogueStoreSelectorActivity.this;
                FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass1(2, catalogueStoreSelectorActivity, CatalogueStoreSelectorActivity.class, "handleAction", "handleAction(Lau/com/woolworths/feature/shop/catalogue/storeselector/CatalogueStoreSelectorContract$Actions;)V", 4), FlowExtKt.a(((CatalogueStoreSelectorViewModel) catalogueStoreSelectorActivity.z.getD()).i, catalogueStoreSelectorActivity.getD(), Lifecycle.State.h));
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

    @Override // au.com.woolworths.feature.shop.catalogue.storeselector.Hilt_CatalogueStoreSelectorActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ActivityCatalogueStoreSelectorBinding activityCatalogueStoreSelectorBinding = (ActivityCatalogueStoreSelectorBinding) DataBindingUtil.d(this, R.layout.activity_catalogue_store_selector);
        this.y = activityCatalogueStoreSelectorBinding;
        if (activityCatalogueStoreSelectorBinding == null) {
            Intrinsics.p("activityBinding");
            throw null;
        }
        activityCatalogueStoreSelectorBinding.D(this);
        ViewModelLazy viewModelLazy = this.z;
        activityCatalogueStoreSelectorBinding.L((CatalogueStoreSelectorViewModel) viewModelLazy.getD());
        ActivityCatalogueStoreSelectorBinding activityCatalogueStoreSelectorBinding2 = this.y;
        if (activityCatalogueStoreSelectorBinding2 == null) {
            Intrinsics.p("activityBinding");
            throw null;
        }
        setSupportActionBar(activityCatalogueStoreSelectorBinding2.B.A);
        ActionBar supportActionBar = getSupportActionBar();
        Intrinsics.e(supportActionBar);
        supportActionBar.s(true);
        ActivityCatalogueStoreSelectorBinding activityCatalogueStoreSelectorBinding3 = this.y;
        if (activityCatalogueStoreSelectorBinding3 == null) {
            Intrinsics.p("activityBinding");
            throw null;
        }
        activityCatalogueStoreSelectorBinding3.B.z.requestFocus();
        Section section = this.B;
        GroupAdapter groupAdapter = this.A;
        groupAdapter.G(section);
        ActivityCatalogueStoreSelectorBinding activityCatalogueStoreSelectorBinding4 = this.y;
        if (activityCatalogueStoreSelectorBinding4 == null) {
            Intrinsics.p("activityBinding");
            throw null;
        }
        RecyclerView recyclerView = activityCatalogueStoreSelectorBinding4.A;
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(groupAdapter);
        ((CatalogueStoreSelectorViewModel) viewModelLazy.getD()).g.f(this, new CatalogueStoreSelectorActivity$sam$androidx_lifecycle_Observer$0(new l(this, 18)));
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new AnonymousClass2(null), 3);
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

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        AnalyticsManager analyticsManager = this.x;
        if (analyticsManager != null) {
            analyticsManager.a(CatalogueScreen.j);
        } else {
            Intrinsics.p("analyticsManager");
            throw null;
        }
    }
}
