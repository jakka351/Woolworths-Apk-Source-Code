package au.com.woolworths.feature.shop.catalogue.listing.promotion;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.paging.CachedPagingDataKt;
import androidx.paging.Pager;
import androidx.paging.PagingConfig;
import au.com.woolworths.android.onesite.deeplink.h;
import au.com.woolworths.design.wx.foundation.ThemeKt;
import au.com.woolworths.feature.rewards.offers.detail.composable.f;
import au.com.woolworths.feature.shop.catalogue.listing.promotion.PromotionListingContract;
import au.com.woolworths.feature.shop.catalogue.listing.promotion.PromotionListingInteractor;
import au.com.woolworths.feature.shop.catalogue.listing.promotion.ui.PromotionListingScreenKt;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.parcelize.Parcelize;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\b²\u0006\f\u0010\u0007\u001a\u00020\u00068\nX\u008a\u0084\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/listing/promotion/PromotionListingActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Extra", "Companion", "Lau/com/woolworths/feature/shop/catalogue/listing/promotion/PromotionListingContract$ViewState;", "viewState", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class PromotionListingActivity extends Hilt_PromotionListingActivity {
    public static final /* synthetic */ int z = 0;
    public final ViewModelLazy x = new ViewModelLazy(Reflection.f24268a.b(PromotionListingViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.feature.shop.catalogue.listing.promotion.PromotionListingActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getViewModelStore();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.feature.shop.catalogue.listing.promotion.PromotionListingActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelProviderFactory();
        }
    }, new Function0<CreationExtras>() { // from class: au.com.woolworths.feature.shop.catalogue.listing.promotion.PromotionListingActivity$special$$inlined$viewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelCreationExtras();
        }
    });
    public final Lazy y = LazyKt.b(new f(this, 14));

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/listing/promotion/PromotionListingActivity$Companion;", "", "", "EXTRA_PROMOTION_LISTING", "Ljava/lang/String;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Parcelize
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/listing/promotion/PromotionListingActivity$Extra;", "Landroid/os/Parcelable;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Extra implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Extra> CREATOR = new Creator();
        public final String d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Extra> {
            @Override // android.os.Parcelable.Creator
            public final Extra createFromParcel(Parcel parcel) {
                Intrinsics.h(parcel, "parcel");
                return new Extra(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Extra[] newArray(int i) {
                return new Extra[i];
            }
        }

        public Extra(String promotionId) {
            Intrinsics.h(promotionId, "promotionId");
            this.d = promotionId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Extra) && Intrinsics.c(this.d, ((Extra) obj).d);
        }

        public final int hashCode() {
            return this.d.hashCode();
        }

        public final String toString() {
            return YU.a.h("Extra(promotionId=", this.d, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.h(dest, "dest");
            dest.writeString(this.d);
        }
    }

    @Override // au.com.woolworths.feature.shop.catalogue.listing.promotion.Hilt_PromotionListingActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        WindowCompat.b(getWindow(), false);
        getWindow().setStatusBarColor(0);
        ComponentActivityKt.a(this, new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.catalogue.listing.promotion.PromotionListingActivity.onCreate.1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    int i = PromotionListingActivity.z;
                    final PromotionListingActivity promotionListingActivity = PromotionListingActivity.this;
                    final MutableState mutableStateA = FlowExtKt.a(((PromotionListingViewModel) promotionListingActivity.x.getD()).f, composer);
                    new WindowInsetsControllerCompat(promotionListingActivity.getWindow(), (View) composer.x(AndroidCompositionLocals_androidKt.f)).e(false);
                    ThemeKt.b(6, composer, ComposableLambdaKt.c(1655483497, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.catalogue.listing.promotion.PromotionListingActivity.onCreate.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                PromotionListingContract.ViewState viewState = (PromotionListingContract.ViewState) mutableStateA.getD();
                                composer2.o(5004770);
                                PromotionListingActivity promotionListingActivity2 = promotionListingActivity;
                                boolean zI = composer2.I(promotionListingActivity2);
                                Object objG = composer2.G();
                                Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                                if (zI || objG == composer$Companion$Empty$1) {
                                    PromotionListingActivity$onCreate$1$1$1$1 promotionListingActivity$onCreate$1$1$1$1 = new PromotionListingActivity$onCreate$1$1$1$1(0, promotionListingActivity2, PromotionListingActivity.class, "finish", "finish()V", 0);
                                    composer2.A(promotionListingActivity$onCreate$1$1$1$1);
                                    objG = promotionListingActivity$onCreate$1$1$1$1;
                                }
                                composer2.l();
                                Function0 function0 = (Function0) ((KFunction) objG);
                                composer2.o(1849434622);
                                Object objG2 = composer2.G();
                                if (objG2 == composer$Companion$Empty$1) {
                                    objG2 = new h(20);
                                    composer2.A(objG2);
                                }
                                Function0 function02 = (Function0) objG2;
                                composer2.l();
                                int i2 = PromotionListingActivity.z;
                                PromotionListingViewModel promotionListingViewModel = (PromotionListingViewModel) promotionListingActivity2.x.getD();
                                composer2.o(5004770);
                                boolean zI2 = composer2.I(promotionListingViewModel);
                                Object objG3 = composer2.G();
                                if (zI2 || objG3 == composer$Companion$Empty$1) {
                                    PromotionListingActivity$onCreate$1$1$3$1 promotionListingActivity$onCreate$1$1$3$1 = new PromotionListingActivity$onCreate$1$1$3$1(1, promotionListingViewModel, PromotionListingViewModel.class, "onPromotionClick", "onPromotionClick(Lau/com/woolworths/product/models/ProductCard;)V", 0);
                                    composer2.A(promotionListingActivity$onCreate$1$1$3$1);
                                    objG3 = promotionListingActivity$onCreate$1$1$3$1;
                                }
                                composer2.l();
                                PromotionListingScreenKt.e(viewState, function0, function02, (Function1) ((KFunction) objG3), composer2, KyberEngine.KyberPolyBytes);
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, 553420833));
        ViewModelLazy viewModelLazy = this.x;
        FlowKt.E(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new PromotionListingActivity$collectActions$1(2, this, PromotionListingActivity.class, "handleAction", "handleAction(Lau/com/woolworths/feature/shop/catalogue/listing/promotion/PromotionListingContract$Action;)V", 4), androidx.lifecycle.FlowExtKt.a(((PromotionListingViewModel) viewModelLazy.getD()).h, getD(), Lifecycle.State.g)), LifecycleOwnerKt.a(this));
        PromotionListingViewModel promotionListingViewModel = (PromotionListingViewModel) viewModelLazy.getD();
        final String promotionId = ((Extra) this.y.getD()).d;
        Intrinsics.h(promotionId, "promotionId");
        final PromotionListingInteractor promotionListingInteractor = promotionListingViewModel.e;
        promotionListingInteractor.getClass();
        promotionListingInteractor.d.f(null);
        Flow flowA = CachedPagingDataKt.a(new Pager(new PagingConfig(20, 0, 0, 58, false), new Function0() { // from class: au.com.woolworths.feature.shop.catalogue.listing.promotion.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                PromotionListingInteractor promotionListingInteractor2 = promotionListingInteractor;
                PromotionListingInteractor.ListingPagingSource listingPagingSource = new PromotionListingInteractor.ListingPagingSource(promotionListingInteractor2, promotionId);
                promotionListingInteractor2.getClass();
                return listingPagingSource;
            }
        }).f3571a, ViewModelKt.a(promotionListingViewModel));
        MutableStateFlow mutableStateFlow = promotionListingViewModel.f;
        mutableStateFlow.f(PromotionListingContract.ViewState.a((PromotionListingContract.ViewState) mutableStateFlow.getValue(), null, null, flowA, 7));
    }
}
