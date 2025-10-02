package au.com.woolworths.feature.shop.storelocator.details;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.telephony.TelephonyManager;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.analytics.Screens;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.android.onesite.repository.LaunchManager;
import au.com.woolworths.android.onesite.utils.AndroidIntents;
import au.com.woolworths.design.wx.foundation.ThemeKt;
import au.com.woolworths.feature.shop.storelocator.details.StoreDetailsContract;
import au.com.woolworths.feature.shop.storelocator.details.StoreDetailsViewModel;
import au.com.woolworths.foundation.shop.storelocator.pickup.models.Store;
import com.woolworths.R;
import dagger.hilt.android.AndroidEntryPoint;
import dagger.hilt.android.lifecycle.HiltViewModelExtensions;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/storelocator/details/StoreDetailsActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "Companion", "Lau/com/woolworths/feature/shop/storelocator/details/StoreDetailsContract$ViewState;", "viewState", "storelocator_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SuppressLint
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class StoreDetailsActivity extends Hilt_StoreDetailsActivity {
    public static final /* synthetic */ int y = 0;
    public LaunchManager w;
    public final ViewModelLazy x = new ViewModelLazy(Reflection.f24268a.b(StoreDetailsViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.feature.shop.storelocator.details.StoreDetailsActivity$special$$inlined$assistedViewModels$1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.d.getViewModelStore();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.feature.shop.storelocator.details.StoreDetailsActivity$special$$inlined$assistedViewModels$2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.d.getDefaultViewModelProviderFactory();
        }
    }, new Function0<CreationExtras>() { // from class: au.com.woolworths.feature.shop.storelocator.details.StoreDetailsActivity$special$$inlined$assistedViewModels$3
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            CreationExtras defaultViewModelCreationExtras = this.d.getDefaultViewModelCreationExtras();
            final StoreDetailsActivity storeDetailsActivity = this;
            return HiltViewModelExtensions.a(defaultViewModelCreationExtras, new Function1<StoreDetailsViewModel.Factory, ViewModel>() { // from class: au.com.woolworths.feature.shop.storelocator.details.StoreDetailsActivity$special$$inlined$assistedViewModels$3.1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Bundle extras;
                    Activities.StoreDetails.Extras extras2;
                    StoreDetailsViewModel.Factory factory = (StoreDetailsViewModel.Factory) obj;
                    int i = StoreDetailsActivity.y;
                    Intent intent = storeDetailsActivity.getIntent();
                    if (intent == null || (extras = intent.getExtras()) == null || (extras2 = (Activities.StoreDetails.Extras) extras.getParcelable("EXTRA_STORE_DETAILS_DATA")) == null) {
                        throw new IllegalArgumentException("EXTRA_STORE_DETAILS_DATA Required!");
                    }
                    return factory.a(extras2.e);
                }
            });
        }
    });

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lau/com/woolworths/feature/shop/storelocator/details/StoreDetailsActivity$Companion;", "", "", "EXTRA_STORE", "Ljava/lang/String;", "", "REQUEST_CODE", "I", "Extras", "storelocator_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {

        @StabilityInferred
        @Parcelize
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/storelocator/details/StoreDetailsActivity$Companion$Extras;", "Landroid/os/Parcelable;", "storelocator_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Extras implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Extras> CREATOR = new Creator();
            public final Store d;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Extras> {
                @Override // android.os.Parcelable.Creator
                public final Extras createFromParcel(Parcel parcel) {
                    Intrinsics.h(parcel, "parcel");
                    return new Extras((Store) parcel.readParcelable(Extras.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Extras[] newArray(int i) {
                    return new Extras[i];
                }
            }

            public Extras(Store store) {
                this.d = store;
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
                Store store = this.d;
                if (store == null) {
                    return 0;
                }
                return store.hashCode();
            }

            public final String toString() {
                return "Extras(store=" + this.d + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.h(dest, "dest");
                dest.writeParcelable(this.d, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lau/com/woolworths/feature/shop/storelocator/details/StoreDetailsContract$ViewState;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.shop.storelocator.details.StoreDetailsActivity$onCreate$1", f = "StoreDetailsActivity.kt", l = {}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.shop.storelocator.details.StoreDetailsActivity$onCreate$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<StoreDetailsContract.ViewState, Continuation<? super Unit>, Object> {
        public /* synthetic */ Object p;

        public AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = StoreDetailsActivity.this.new AnonymousClass1(continuation);
            anonymousClass1.p = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((StoreDetailsContract.ViewState) obj, (Continuation) obj2);
            Unit unit = Unit.f24250a;
            anonymousClass1.invokeSuspend(unit);
            return unit;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            ResultKt.b(obj);
            StoreDetailsContract.ViewState viewState = (StoreDetailsContract.ViewState) this.p;
            StoreDetailsContract.ViewAction viewAction = viewState.i;
            if (viewAction != null) {
                boolean z = viewAction instanceof StoreDetailsContract.ViewAction.CallContactNumber;
                StoreDetailsActivity storeDetailsActivity = StoreDetailsActivity.this;
                if (z) {
                    String str = ((StoreDetailsContract.ViewAction.CallContactNumber) viewAction).f8136a;
                    int i = StoreDetailsActivity.y;
                    if (storeDetailsActivity.getPackageManager().hasSystemFeature("android.hardware.telephony") || ((TelephonyManager) storeDetailsActivity.getSystemService("phone")).getPhoneType() != 0) {
                        storeDetailsActivity.startActivity(AndroidIntents.a(str));
                    }
                } else if (viewAction instanceof StoreDetailsContract.ViewAction.ShowLocationInMap) {
                    String str2 = ((StoreDetailsContract.ViewAction.ShowLocationInMap) viewAction).f8139a;
                    int i2 = StoreDetailsActivity.y;
                    AndroidIntents.b(storeDetailsActivity, str2);
                } else if (viewAction instanceof StoreDetailsContract.ViewAction.ShopInStoreSelected) {
                    Store store = ((StoreDetailsContract.ViewAction.ShopInStoreSelected) viewAction).f8138a;
                    int i3 = StoreDetailsActivity.y;
                    Intent intent = new Intent();
                    intent.putExtra("EXTRA_STORE", store);
                    storeDetailsActivity.setResult(-1, intent);
                    storeDetailsActivity.finish();
                } else {
                    if (!viewAction.equals(StoreDetailsContract.ViewAction.FinishSetUpPickUpLocator.f8137a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int i4 = StoreDetailsActivity.y;
                    LaunchManager launchManager = storeDetailsActivity.w;
                    if (launchManager == null) {
                        Intrinsics.p("launchManager");
                        throw null;
                    }
                    LaunchManager.LaunchState launchStateD = launchManager.d();
                    LaunchManager.LaunchState launchState = LaunchManager.LaunchState.h;
                    if (launchStateD == launchState) {
                        storeDetailsActivity.setResult(-1);
                        storeDetailsActivity.finish();
                    } else {
                        LaunchManager launchManager2 = storeDetailsActivity.w;
                        if (launchManager2 == null) {
                            Intrinsics.p("launchManager");
                            throw null;
                        }
                        launchManager2.a(launchState);
                        storeDetailsActivity.setResult(-1, new Intent().putExtra("RESULT_MESSAGE_EXTRA", storeDetailsActivity.getString(R.string.store_details_updated_message)));
                        storeDetailsActivity.finish();
                    }
                }
                viewState.j.invoke(viewAction);
            }
            return Unit.f24250a;
        }
    }

    @Override // au.com.woolworths.feature.shop.storelocator.details.Hilt_StoreDetailsActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Bundle extras;
        Activities.StoreDetails.Extras extras2;
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent == null || (extras = intent.getExtras()) == null || (extras2 = (Activities.StoreDetails.Extras) extras.getParcelable("EXTRA_STORE_DETAILS_DATA")) == null) {
            throw new IllegalArgumentException("EXTRA_STORE_DETAILS_DATA Required!");
        }
        Activities.StoreDetails.ExtraLocationDetailsSource extraLocationDetailsSource = extras2.d;
        boolean z = extraLocationDetailsSource instanceof Activities.StoreDetails.ExtrasByData;
        ViewModelLazy viewModelLazy = this.x;
        if (z) {
            StoreDetailsViewModel storeDetailsViewModel = (StoreDetailsViewModel) viewModelLazy.getD();
            Activities.StoreDetails.ExtraLocationDetailsData extraLocationDetailsData = ((Activities.StoreDetails.ExtrasByData) extraLocationDetailsSource).d;
            Intrinsics.f(extraLocationDetailsData, "null cannot be cast to non-null type au.com.woolworths.foundation.shop.storelocator.pickup.models.Store");
            storeDetailsViewModel.q6((Store) extraLocationDetailsData);
        } else if (extraLocationDetailsSource instanceof Activities.StoreDetails.ExtrasByStoreNumber) {
            ((StoreDetailsViewModel) viewModelLazy.getD()).r6(((Activities.StoreDetails.ExtrasByStoreNumber) extraLocationDetailsSource).d);
        }
        FlowKt.E(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass1(null), FlowExtKt.a(((StoreDetailsViewModel) viewModelLazy.getD()).l, getD(), Lifecycle.State.h)), LifecycleOwnerKt.a(this));
        ComponentActivityKt.a(this, new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.storelocator.details.StoreDetailsActivity.onCreate.2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    int i = StoreDetailsActivity.y;
                    final StoreDetailsActivity storeDetailsActivity = StoreDetailsActivity.this;
                    final MutableState mutableStateA = androidx.lifecycle.compose.FlowExtKt.a(((StoreDetailsViewModel) storeDetailsActivity.x.getD()).l, composer);
                    ThemeKt.b(6, composer, ComposableLambdaKt.c(1719612132, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.storelocator.details.StoreDetailsActivity.onCreate.2.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                StoreDetailsContract.ViewState viewState = (StoreDetailsContract.ViewState) mutableStateA.getD();
                                composer2.o(5004770);
                                StoreDetailsActivity storeDetailsActivity2 = storeDetailsActivity;
                                boolean zI = composer2.I(storeDetailsActivity2);
                                Object objG = composer2.G();
                                if (zI || objG == Composer.Companion.f1624a) {
                                    objG = new StoreDetailsActivity$onCreate$2$1$1$1(0, storeDetailsActivity2, StoreDetailsActivity.class, "onBackPressed", "onBackPressed()V", 0);
                                    composer2.A(objG);
                                }
                                composer2.l();
                                StoreDetailsScreenKt.k(viewState, (Function0) ((KFunction) objG), composer2, 0);
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, -803578324));
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        StoreDetailsViewModel storeDetailsViewModel = (StoreDetailsViewModel) this.x.getD();
        Store store = ((StoreDetailsContract.ViewState) storeDetailsViewModel.k.getValue()).b;
        if (store != null) {
            AnalyticsManager analyticsManager = storeDetailsViewModel.g;
            Screens screens = Screens.s;
            TrackingMetadata trackingMetadataA = TrackingMetadata.Companion.a(TrackableValue.t3, store.d);
            trackingMetadataA.b(TrackableValue.x3, store.f);
            analyticsManager.e(screens, trackingMetadataA);
        }
    }
}
