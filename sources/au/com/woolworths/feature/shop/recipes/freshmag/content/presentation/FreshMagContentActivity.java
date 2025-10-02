package au.com.woolworths.feature.shop.recipes.freshmag.content.presentation;

import YU.a;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.activity.compose.ComponentActivityKt;
import androidx.appcompat.app.ActionBar;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.IntentCompat;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.viewpager.widget.ViewPager;
import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.android.onesite.navigation.ActivityNavigatorKt;
import au.com.woolworths.android.onesite.navigation.ApplicationType;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.feature.shop.recipes.databinding.ActivityFreshmagContentBinding;
import au.com.woolworths.feature.shop.recipes.freshmag.FreshMagScreen;
import au.com.woolworths.feature.shop.recipes.freshmag.content.domain.FreshMagContentViewModel;
import au.com.woolworths.feature.shop.recipes.freshmag.content.domain.Link;
import au.com.woolworths.feature.shop.recipes.freshmag.content.presentation.FreshMagContentActivity;
import au.com.woolworths.feature.shop.recipes.freshmag.content.presentation.FreshMagContentContract;
import au.com.woolworths.feature.shop.recipes.freshmag.content.presentation.clickablerect.OnItemClickListener;
import au.com.woolworths.feature.shop.recipes.freshmag.content.presentation.zoomablepage.ZoomablePagerAdapter;
import au.com.woolworths.feature.shop.recipes.freshmag.content.ui.FreshMagContentScreenKt;
import au.com.woolworths.shop.cart.ui.CartBadgeActionView;
import com.dynatrace.android.callback.Callback;
import com.woolworths.R;
import dagger.hilt.android.AndroidEntryPoint;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/feature/shop/recipes/freshmag/content/presentation/FreshMagContentActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Extras", "Companion", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class FreshMagContentActivity extends Hilt_FreshMagContentActivity {
    public static final /* synthetic */ int D = 0;
    public CartBadgeActionView A;
    public final ViewModelLazy B = new ViewModelLazy(Reflection.f24268a.b(FreshMagContentViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.feature.shop.recipes.freshmag.content.presentation.FreshMagContentActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getViewModelStore();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.feature.shop.recipes.freshmag.content.presentation.FreshMagContentActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelProviderFactory();
        }
    }, new Function0<CreationExtras>() { // from class: au.com.woolworths.feature.shop.recipes.freshmag.content.presentation.FreshMagContentActivity$special$$inlined$viewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelCreationExtras();
        }
    });
    public final Lazy C = LazyKt.b(new Function0<Extras>() { // from class: au.com.woolworths.feature.shop.recipes.freshmag.content.presentation.FreshMagContentActivity$special$$inlined$extraOrThrow$1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Parcelable parcelable = (Parcelable) IntentCompat.a(this.d.getIntent(), "extra_magazine_id", FreshMagContentActivity.Extras.class);
            if (parcelable != null) {
                return parcelable;
            }
            throw new IllegalArgumentException("Value for extra_magazine_id must be provided and not null.");
        }
    });
    public FeatureToggleManager x;
    public ActivityFreshmagContentBinding y;
    public ZoomablePagerAdapter z;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/shop/recipes/freshmag/content/presentation/FreshMagContentActivity$Companion;", "", "", "EXTRA_MAGAZINE_ID", "Ljava/lang/String;", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public static void a(Context context, String magazineId) {
            Intrinsics.h(magazineId, "magazineId");
            Extras extras = new Extras(magazineId);
            Intent intent = new Intent(context, (Class<?>) FreshMagContentActivity.class);
            intent.putExtra("extra_magazine_id", extras);
            context.startActivity(intent);
        }
    }

    @StabilityInferred
    @Parcelize
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/recipes/freshmag/content/presentation/FreshMagContentActivity$Extras;", "Landroid/os/Parcelable;", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
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

        public Extras(String magazineId) {
            Intrinsics.h(magazineId, "magazineId");
            this.d = magazineId;
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
            return a.h("Extras(magazineId=", this.d, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.h(dest, "dest");
            dest.writeString(this.d);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.shop.recipes.freshmag.content.presentation.FreshMagContentActivity$onCreate$5", f = "FreshMagContentActivity.kt", l = {128}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: au.com.woolworths.feature.shop.recipes.freshmag.content.presentation.FreshMagContentActivity$onCreate$5, reason: invalid class name */
    final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: au.com.woolworths.feature.shop.recipes.freshmag.content.presentation.FreshMagContentActivity$onCreate$5$2, reason: invalid class name */
        final /* synthetic */ class AnonymousClass2 extends AdaptedFunctionReference implements Function2<FreshMagContentContract.Action, Continuation<? super Unit>, Object>, SuspendFunction {
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                FreshMagContentContract.Action action = (FreshMagContentContract.Action) obj;
                FreshMagContentActivity freshMagContentActivity = (FreshMagContentActivity) this.d;
                if (action instanceof FreshMagContentContract.Action.SeekPage) {
                    FreshMagContentContract.Action.SeekPage seekPage = (FreshMagContentContract.Action.SeekPage) action;
                    ActivityFreshmagContentBinding activityFreshmagContentBinding = freshMagContentActivity.y;
                    if (activityFreshmagContentBinding == null) {
                        Intrinsics.p("activityBinding");
                        throw null;
                    }
                    activityFreshmagContentBinding.A.setProgress(seekPage.f8039a, true);
                } else {
                    int i = FreshMagContentActivity.D;
                    freshMagContentActivity.getClass();
                    if (!(action instanceof FreshMagContentContract.Action.LaunchCart)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    freshMagContentActivity.startActivity(ActivityNavigatorKt.a(Activities.Cart.f4454a, ApplicationType.e));
                }
                return Unit.f24250a;
            }
        }

        public AnonymousClass5(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return FreshMagContentActivity.this.new AnonymousClass5(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass5) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            if (i == 0) {
                ResultKt.b(obj);
                int i2 = FreshMagContentActivity.D;
                final FreshMagContentActivity freshMagContentActivity = FreshMagContentActivity.this;
                final Flow flow = freshMagContentActivity.O4().m;
                FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass2(2, freshMagContentActivity, FreshMagContentActivity.class, "handleAction", "handleAction(Lau/com/woolworths/feature/shop/recipes/freshmag/content/presentation/FreshMagContentContract$Action;)V", 4), new Flow<FreshMagContentContract.Action>() { // from class: au.com.woolworths.feature.shop.recipes.freshmag.content.presentation.FreshMagContentActivity$onCreate$5$invokeSuspend$$inlined$filter$1

                    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                    @SourceDebugExtension
                    /* renamed from: au.com.woolworths.feature.shop.recipes.freshmag.content.presentation.FreshMagContentActivity$onCreate$5$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                    public final class AnonymousClass2<T> implements FlowCollector {
                        public final /* synthetic */ FlowCollector d;
                        public final /* synthetic */ FreshMagContentActivity e;

                        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                        @DebugMetadata(c = "au.com.woolworths.feature.shop.recipes.freshmag.content.presentation.FreshMagContentActivity$onCreate$5$invokeSuspend$$inlined$filter$1$2", f = "FreshMagContentActivity.kt", l = {50}, m = "emit")
                        /* renamed from: au.com.woolworths.feature.shop.recipes.freshmag.content.presentation.FreshMagContentActivity$onCreate$5$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                        public final class AnonymousClass1 extends ContinuationImpl {
                            public /* synthetic */ Object p;
                            public int q;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) {
                                this.p = obj;
                                this.q |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector, FreshMagContentActivity freshMagContentActivity) {
                            this.d = flowCollector;
                            this.e = freshMagContentActivity;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
                            /*
                                r4 = this;
                                boolean r0 = r6 instanceof au.com.woolworths.feature.shop.recipes.freshmag.content.presentation.FreshMagContentActivity$onCreate$5$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                                if (r0 == 0) goto L13
                                r0 = r6
                                au.com.woolworths.feature.shop.recipes.freshmag.content.presentation.FreshMagContentActivity$onCreate$5$invokeSuspend$$inlined$filter$1$2$1 r0 = (au.com.woolworths.feature.shop.recipes.freshmag.content.presentation.FreshMagContentActivity$onCreate$5$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                                int r1 = r0.q
                                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                r3 = r1 & r2
                                if (r3 == 0) goto L13
                                int r1 = r1 - r2
                                r0.q = r1
                                goto L18
                            L13:
                                au.com.woolworths.feature.shop.recipes.freshmag.content.presentation.FreshMagContentActivity$onCreate$5$invokeSuspend$$inlined$filter$1$2$1 r0 = new au.com.woolworths.feature.shop.recipes.freshmag.content.presentation.FreshMagContentActivity$onCreate$5$invokeSuspend$$inlined$filter$1$2$1
                                r0.<init>(r6)
                            L18:
                                java.lang.Object r6 = r0.p
                                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                                int r2 = r0.q
                                r3 = 1
                                if (r2 == 0) goto L2f
                                if (r2 != r3) goto L27
                                kotlin.ResultKt.b(r6)
                                goto L52
                            L27:
                                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                                r5.<init>(r6)
                                throw r5
                            L2f:
                                kotlin.ResultKt.b(r6)
                                r6 = r5
                                au.com.woolworths.feature.shop.recipes.freshmag.content.presentation.FreshMagContentContract$Action r6 = (au.com.woolworths.feature.shop.recipes.freshmag.content.presentation.FreshMagContentContract.Action) r6
                                au.com.woolworths.feature.shop.recipes.freshmag.content.presentation.FreshMagContentActivity r6 = r4.e
                                androidx.lifecycle.Lifecycle r6 = r6.getD()
                                androidx.lifecycle.Lifecycle$State r6 = r6.getD()
                                androidx.lifecycle.Lifecycle$State r2 = androidx.lifecycle.Lifecycle.State.h
                                int r6 = r6.compareTo(r2)
                                if (r6 < 0) goto L52
                                r0.q = r3
                                kotlinx.coroutines.flow.FlowCollector r6 = r4.d
                                java.lang.Object r5 = r6.emit(r5, r0)
                                if (r5 != r1) goto L52
                                return r1
                            L52:
                                kotlin.Unit r5 = kotlin.Unit.f24250a
                                return r5
                            */
                            throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.recipes.freshmag.content.presentation.FreshMagContentActivity$onCreate$5$invokeSuspend$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                        }
                    }

                    @Override // kotlinx.coroutines.flow.Flow
                    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                        Object objCollect = flow.collect(new AnonymousClass2(flowCollector, freshMagContentActivity), continuation);
                        return objCollect == CoroutineSingletons.d ? objCollect : Unit.f24250a;
                    }
                });
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

    public final FreshMagContentViewModel O4() {
        return (FreshMagContentViewModel) this.B.getD();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [au.com.woolworths.feature.shop.recipes.freshmag.content.presentation.FreshMagContentActivity$onCreate$2] */
    @Override // au.com.woolworths.feature.shop.recipes.freshmag.content.presentation.Hilt_FreshMagContentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws Resources.NotFoundException {
        super.onCreate(bundle);
        if (((Boolean) O4().n.getD()).booleanValue()) {
            ComponentActivityKt.a(this, new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.recipes.freshmag.content.presentation.FreshMagContentActivity.onCreate.1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                        composer.j();
                    } else {
                        final FreshMagContentActivity freshMagContentActivity = FreshMagContentActivity.this;
                        CoreThemeKt.c(6, composer, ComposableLambdaKt.c(-1119211525, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.recipes.freshmag.content.presentation.FreshMagContentActivity.onCreate.1.1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                Composer composer2 = (Composer) obj3;
                                if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                    composer2.j();
                                } else {
                                    int i = FreshMagContentActivity.D;
                                    FreshMagContentActivity freshMagContentActivity2 = freshMagContentActivity;
                                    String str = ((Extras) freshMagContentActivity2.C.getD()).d;
                                    FreshMagContentViewModel freshMagContentViewModelO4 = freshMagContentActivity2.O4();
                                    composer2.o(5004770);
                                    boolean zI = composer2.I(freshMagContentActivity2);
                                    Object objG = composer2.G();
                                    if (zI || objG == Composer.Companion.f1624a) {
                                        FreshMagContentActivity$onCreate$1$1$1$1 freshMagContentActivity$onCreate$1$1$1$1 = new FreshMagContentActivity$onCreate$1$1$1$1(0, freshMagContentActivity2, FreshMagContentActivity.class, "finish", "finish()V", 0);
                                        composer2.A(freshMagContentActivity$onCreate$1$1$1$1);
                                        objG = freshMagContentActivity$onCreate$1$1$1$1;
                                    }
                                    composer2.l();
                                    FreshMagContentScreenKt.b(str, freshMagContentViewModelO4, (Function0) ((KFunction) objG), composer2, 0);
                                }
                                return Unit.f24250a;
                            }
                        }, composer));
                    }
                    return Unit.f24250a;
                }
            }, true, 1467552983));
        } else {
            this.y = (ActivityFreshmagContentBinding) DataBindingUtil.d(this, R.layout.activity_freshmag_content);
            this.z = new ZoomablePagerAdapter(new OnItemClickListener() { // from class: au.com.woolworths.feature.shop.recipes.freshmag.content.presentation.FreshMagContentActivity.onCreate.2
                @Override // au.com.woolworths.feature.shop.recipes.freshmag.content.presentation.clickablerect.OnItemClickListener
                public final void a(String str) {
                    Integer numI0;
                    int i = FreshMagContentActivity.D;
                    FreshMagContentViewModel freshMagContentViewModelO4 = FreshMagContentActivity.this.O4();
                    List listT = StringsKt.T(str, new String[]{"#/?page="}, 6);
                    Link.Internal internal = null;
                    if (listT.size() >= 2 && (numI0 = StringsKt.i0((String) listT.get(1))) != null) {
                        internal = new Link.Internal(numI0.intValue() - 1);
                    }
                    if (internal == null) {
                        return;
                    }
                    freshMagContentViewModelO4.l.f(new FreshMagContentContract.Action.SeekPage(internal.f8033a));
                }
            });
            final ActivityFreshmagContentBinding activityFreshmagContentBinding = this.y;
            if (activityFreshmagContentBinding == null) {
                Intrinsics.p("activityBinding");
                throw null;
            }
            ViewPager viewPager = activityFreshmagContentBinding.B;
            activityFreshmagContentBinding.O(O4());
            ZoomablePagerAdapter zoomablePagerAdapter = this.z;
            if (zoomablePagerAdapter == null) {
                Intrinsics.p("adapter");
                throw null;
            }
            viewPager.setAdapter(zoomablePagerAdapter);
            viewPager.b(new ViewPager.OnPageChangeListener() { // from class: au.com.woolworths.feature.shop.recipes.freshmag.content.presentation.FreshMagContentActivity$onCreate$3$1
                @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
                public final void a(int i) {
                    Callback.r();
                    try {
                        activityFreshmagContentBinding.A.setProgress(i);
                    } finally {
                        Callback.s();
                    }
                }

                @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
                public final void b(int i) {
                }

                @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
                public final void c(float f, int i, int i2) {
                }
            });
            ActivityFreshmagContentBinding activityFreshmagContentBinding2 = this.y;
            if (activityFreshmagContentBinding2 == null) {
                Intrinsics.p("activityBinding");
                throw null;
            }
            setSupportActionBar(activityFreshmagContentBinding2.D);
            ActionBar supportActionBar = getSupportActionBar();
            if (supportActionBar == null) {
                throw new IllegalStateException("Required value was null.");
            }
            supportActionBar.s(true);
            O4().k.f(this, new FreshMagContentActivity$sam$androidx_lifecycle_Observer$0(new au.com.woolworths.feature.shop.instore.navigation.map.utils.a(this, 11)));
            BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new AnonymousClass5(null), 3);
        }
        O4().q6(((Extras) this.C.getD()).d);
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        Intrinsics.h(menu, "menu");
        getMenuInflater().inflate(R.menu.menu_cart_only, menu);
        MenuItem menuItemFindItem = menu.findItem(R.id.cart_item);
        View actionView = menuItemFindItem != null ? menuItemFindItem.getActionView() : null;
        Intrinsics.f(actionView, "null cannot be cast to non-null type au.com.woolworths.shop.cart.ui.CartBadgeActionView");
        CartBadgeActionView cartBadgeActionView = (CartBadgeActionView) actionView;
        cartBadgeActionView.setAnalyticsScreen(FreshMagScreen.d);
        cartBadgeActionView.setVisibility(8);
        this.A = cartBadgeActionView;
        return super.onCreateOptionsMenu(menu);
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
        FreshMagContentViewModel freshMagContentViewModelO4 = O4();
        String magazineId = ((Extras) this.C.getD()).d;
        Intrinsics.h(magazineId, "magazineId");
        freshMagContentViewModelO4.f.e(FreshMagScreen.d, TrackingMetadata.Companion.a(TrackableValue.I0, magazineId));
    }
}
