package au.com.woolworths.feature.product.list.legacy;

import android.content.SharedPreferences;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.state.ToggleableState;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.featuretoggles.BaseFeature;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.android.onesite.modules.common.InlineErrorAction;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBanner;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerData;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.android.onesite.network.ServerErrorException;
import au.com.woolworths.base.shopapp.data.models.InfoSection;
import au.com.woolworths.base.shopapp.remoteconfig.ShopRemoteConfig;
import au.com.woolworths.feature.product.list.legacy.ProductListOptionsContract;
import au.com.woolworths.feature.product.list.legacy.analytics.ProductListOptionsActions;
import au.com.woolworths.feature.product.list.legacy.analytics.ProductListOptionsFiltersActions;
import au.com.woolworths.feature.product.list.legacy.analytics.SeeResultsClickSource;
import au.com.woolworths.feature.product.list.legacy.data.FilterInsetBannerData;
import au.com.woolworths.feature.product.list.legacy.data.FilterOptionsManager;
import au.com.woolworths.feature.product.list.legacy.data.ProductFilterSwitch;
import au.com.woolworths.feature.product.list.legacy.data.ProductListChip;
import au.com.woolworths.feature.product.list.legacy.data.ProductListData;
import au.com.woolworths.feature.product.list.legacy.data.ProductListOptions;
import au.com.woolworths.feature.product.list.legacy.data.SortOption;
import au.com.woolworths.feature.product.list.legacy.data.SortOptionKt;
import au.com.woolworths.feature.product.list.legacy.ui.DisplayModeClickListener;
import au.com.woolworths.feature.product.list.legacy.ui.FilterCardClickListener;
import au.com.woolworths.feature.product.list.legacy.ui.FilterInsetBannerClickListener;
import au.com.woolworths.feature.product.list.legacy.ui.FilterMenuItem;
import au.com.woolworths.feature.product.list.legacy.ui.FilterOption;
import au.com.woolworths.feature.product.list.legacy.ui.FilterOptionKt;
import au.com.woolworths.feature.product.list.legacy.ui.FilterOptionsClickListener;
import au.com.woolworths.feature.product.list.legacy.ui.MarketplaceSwitchListener;
import au.com.woolworths.feature.product.list.legacy.ui.ProductListOptionsItem;
import au.com.woolworths.feature.product.list.legacy.ui.ProductListOptionsSortOptionItem;
import au.com.woolworths.feature.product.list.legacy.ui.SortOptionsClickListener;
import au.com.woolworths.feature.product.list.legacy.ui.SortOptionsDisplayMode;
import com.medallia.digital.mobilesdk.l3;
import dagger.hilt.android.lifecycle.HiltViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import timber.log.Timber;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007:\u0002\b\t¨\u0006\n"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/ProductListOptionsViewModel;", "Landroidx/lifecycle/ViewModel;", "Lau/com/woolworths/feature/product/list/legacy/ui/SortOptionsClickListener;", "Lau/com/woolworths/feature/product/list/legacy/ui/FilterOptionsClickListener;", "Lau/com/woolworths/feature/product/list/legacy/ui/DisplayModeClickListener;", "Lau/com/woolworths/feature/product/list/legacy/ui/FilterInsetBannerClickListener;", "Lau/com/woolworths/feature/product/list/legacy/ui/FilterCardClickListener;", "Lau/com/woolworths/feature/product/list/legacy/ui/MarketplaceSwitchListener;", "SavedStateProductListOptions", "Companion", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ProductListOptionsViewModel extends ViewModel implements SortOptionsClickListener, FilterOptionsClickListener, DisplayModeClickListener, FilterInsetBannerClickListener, FilterCardClickListener, MarketplaceSwitchListener {
    public final FeatureToggleManager e;
    public final ProductListInteractor f;
    public final AnalyticsManager g;
    public final SavedStateHandle h;
    public final MutableStateFlow i;
    public final StateFlow j;
    public final SharedFlowImpl k;
    public final SharedFlow l;
    public final SharedFlowImpl m;
    public final SharedFlow n;
    public Activities.ProductList.Extras o;
    public ProductListOptions p;
    public final StateFlow q;
    public final Lazy r;
    public final Timber.Forest s;
    public final Lazy t;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/ProductListOptionsViewModel$Companion;", "", "", "MAX_SORT_OPTIONS_COLLAPSED", "I", "", "SAVED_PRODUCT_LIST_OPTIONS", "Ljava/lang/String;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Parcelize
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/ProductListOptionsViewModel$SavedStateProductListOptions;", "Landroid/os/Parcelable;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SavedStateProductListOptions implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<SavedStateProductListOptions> CREATOR = new Creator();
        public final List d;
        public final List e;
        public final List f;
        public final InsetBannerData g;
        public final ProductFilterSwitch h;
        public final int i;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SavedStateProductListOptions> {
            @Override // android.os.Parcelable.Creator
            public final SavedStateProductListOptions createFromParcel(Parcel parcel) {
                Intrinsics.h(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                int iE2 = 0;
                while (iE2 != i) {
                    iE2 = androidx.compose.ui.input.pointer.a.e(SortOption.CREATOR, parcel, arrayList, iE2, 1);
                }
                int i2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i2);
                int iE3 = 0;
                while (iE3 != i2) {
                    iE3 = androidx.compose.ui.input.pointer.a.e(SortOption.CREATOR, parcel, arrayList2, iE3, 1);
                }
                int i3 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i3);
                while (iE != i3) {
                    iE = androidx.compose.ui.input.pointer.a.e(FilterOption.CREATOR, parcel, arrayList3, iE, 1);
                }
                return new SavedStateProductListOptions(arrayList, arrayList2, arrayList3, (InsetBannerData) parcel.readParcelable(SavedStateProductListOptions.class.getClassLoader()), parcel.readInt() == 0 ? null : ProductFilterSwitch.CREATOR.createFromParcel(parcel), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final SavedStateProductListOptions[] newArray(int i) {
                return new SavedStateProductListOptions[i];
            }
        }

        public SavedStateProductListOptions(List unmodifiedSortOptions, List sortList, List filterList, InsetBannerData insetBannerData, ProductFilterSwitch productFilterSwitch, int i) {
            Intrinsics.h(unmodifiedSortOptions, "unmodifiedSortOptions");
            Intrinsics.h(sortList, "sortList");
            Intrinsics.h(filterList, "filterList");
            this.d = unmodifiedSortOptions;
            this.e = sortList;
            this.f = filterList;
            this.g = insetBannerData;
            this.h = productFilterSwitch;
            this.i = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SavedStateProductListOptions)) {
                return false;
            }
            SavedStateProductListOptions savedStateProductListOptions = (SavedStateProductListOptions) obj;
            return Intrinsics.c(this.d, savedStateProductListOptions.d) && Intrinsics.c(this.e, savedStateProductListOptions.e) && Intrinsics.c(this.f, savedStateProductListOptions.f) && Intrinsics.c(this.g, savedStateProductListOptions.g) && Intrinsics.c(this.h, savedStateProductListOptions.h) && this.i == savedStateProductListOptions.i;
        }

        public final int hashCode() {
            int iD = androidx.camera.core.impl.b.d(androidx.camera.core.impl.b.d(this.d.hashCode() * 31, 31, this.e), 31, this.f);
            InsetBannerData insetBannerData = this.g;
            int iHashCode = (iD + (insetBannerData == null ? 0 : insetBannerData.hashCode())) * 31;
            ProductFilterSwitch productFilterSwitch = this.h;
            return Integer.hashCode(this.i) + ((iHashCode + (productFilterSwitch != null ? productFilterSwitch.hashCode() : 0)) * 31);
        }

        public final String toString() {
            return "SavedStateProductListOptions(unmodifiedSortOptions=" + this.d + ", sortList=" + this.e + ", filterList=" + this.f + ", sortOptionsInsetBanner=" + this.g + ", marketplaceSwitch=" + this.h + ", productsCount=" + this.i + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.h(dest, "dest");
            Iterator itU = au.com.woolworths.android.onesite.a.u(this.d, dest);
            while (itU.hasNext()) {
                ((SortOption) itU.next()).writeToParcel(dest, i);
            }
            Iterator itU2 = au.com.woolworths.android.onesite.a.u(this.e, dest);
            while (itU2.hasNext()) {
                ((SortOption) itU2.next()).writeToParcel(dest, i);
            }
            Iterator itU3 = au.com.woolworths.android.onesite.a.u(this.f, dest);
            while (itU3.hasNext()) {
                ((FilterOption) itU3.next()).writeToParcel(dest, i);
            }
            dest.writeParcelable(this.g, i);
            ProductFilterSwitch productFilterSwitch = this.h;
            if (productFilterSwitch == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                productFilterSwitch.writeToParcel(dest, i);
            }
            dest.writeInt(this.i);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[SortOptionsDisplayMode.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                SortOptionsDisplayMode sortOptionsDisplayMode = SortOptionsDisplayMode.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public ProductListOptionsViewModel(FeatureToggleManager featureToggleManager, ProductListInteractor productListInteractor, AnalyticsManager analyticsManager, SavedStateHandle savedStateHandle) {
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        Intrinsics.h(productListInteractor, "productListInteractor");
        Intrinsics.h(analyticsManager, "analyticsManager");
        Intrinsics.h(savedStateHandle, "savedStateHandle");
        this.e = featureToggleManager;
        this.f = productListInteractor;
        this.g = analyticsManager;
        this.h = savedStateHandle;
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(new ProductListOptionsContract.ViewState(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, l3.b));
        this.i = mutableStateFlowA;
        this.j = FlowKt.b(mutableStateFlowA);
        BufferOverflow bufferOverflow = BufferOverflow.e;
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(0, 1, bufferOverflow, 1);
        this.k = sharedFlowImplB;
        this.l = FlowKt.a(sharedFlowImplB);
        SharedFlowImpl sharedFlowImplB2 = SharedFlowKt.b(0, 1, bufferOverflow, 1);
        this.m = sharedFlowImplB2;
        this.n = FlowKt.a(sharedFlowImplB2);
        final MutableStateFlow mutableStateFlow = productListInteractor.n;
        this.q = FlowKt.O(new Flow<List<? extends ProductListChip>>() { // from class: au.com.woolworths.feature.product.list.legacy.ProductListOptionsViewModel$special$$inlined$map$1

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: au.com.woolworths.feature.product.list.legacy.ProductListOptionsViewModel$special$$inlined$map$1$2, reason: invalid class name */
            public final class AnonymousClass2<T> implements FlowCollector {
                public final /* synthetic */ FlowCollector d;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @DebugMetadata(c = "au.com.woolworths.feature.product.list.legacy.ProductListOptionsViewModel$special$$inlined$map$1$2", f = "ProductListOptionsViewModel.kt", l = {50}, m = "emit")
                /* renamed from: au.com.woolworths.feature.product.list.legacy.ProductListOptionsViewModel$special$$inlined$map$1$2$1, reason: invalid class name */
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

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.d = flowCollector;
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
                        boolean r0 = r6 instanceof au.com.woolworths.feature.product.list.legacy.ProductListOptionsViewModel$special$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        au.com.woolworths.feature.product.list.legacy.ProductListOptionsViewModel$special$$inlined$map$1$2$1 r0 = (au.com.woolworths.feature.product.list.legacy.ProductListOptionsViewModel$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.q
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.q = r1
                        goto L18
                    L13:
                        au.com.woolworths.feature.product.list.legacy.ProductListOptionsViewModel$special$$inlined$map$1$2$1 r0 = new au.com.woolworths.feature.product.list.legacy.ProductListOptionsViewModel$special$$inlined$map$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.p
                        kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                        int r2 = r0.q
                        r3 = 1
                        if (r2 == 0) goto L2f
                        if (r2 != r3) goto L27
                        kotlin.ResultKt.b(r6)
                        goto L41
                    L27:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L2f:
                        kotlin.ResultKt.b(r6)
                        au.com.woolworths.feature.product.list.legacy.ProductListContract$ProductListFlow r5 = (au.com.woolworths.feature.product.list.legacy.ProductListContract.ProductListFlow) r5
                        java.util.List r5 = r5.b
                        r0.q = r3
                        kotlinx.coroutines.flow.FlowCollector r6 = r4.d
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L41
                        return r1
                    L41:
                        kotlin.Unit r5 = kotlin.Unit.f24250a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.product.list.legacy.ProductListOptionsViewModel$special$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = mutableStateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == CoroutineSingletons.d ? objCollect : Unit.f24250a;
            }
        }, ViewModelKt.a(this), SharingStarted.Companion.f24711a, EmptyList.d);
        final int i = 0;
        this.r = LazyKt.b(new Function0(this) { // from class: au.com.woolworths.feature.product.list.legacy.w
            public final /* synthetic */ ProductListOptionsViewModel e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() throws NumberFormatException {
                int i2;
                switch (i) {
                    case 0:
                        return Boolean.valueOf(this.e.e.c(BaseFeature.q));
                    default:
                        try {
                            i2 = Integer.parseInt(this.e.e.e(ShopRemoteConfig.k, false));
                        } catch (Exception unused) {
                            i2 = Integer.parseInt(ShopRemoteConfig.k.getDefaultValue());
                        }
                        return Integer.valueOf(i2);
                }
            }
        });
        Timber.Forest forest = Timber.f27013a;
        forest.s("ProductListOptionsViewModel");
        this.s = forest;
        final int i2 = 1;
        this.t = LazyKt.b(new Function0(this) { // from class: au.com.woolworths.feature.product.list.legacy.w
            public final /* synthetic */ ProductListOptionsViewModel e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() throws NumberFormatException {
                int i22;
                switch (i2) {
                    case 0:
                        return Boolean.valueOf(this.e.e.c(BaseFeature.q));
                    default:
                        try {
                            i22 = Integer.parseInt(this.e.e.e(ShopRemoteConfig.k, false));
                        } catch (Exception unused) {
                            i22 = Integer.parseInt(ShopRemoteConfig.k.getDefaultValue());
                        }
                        return Integer.valueOf(i22);
                }
            }
        });
        SavedStateProductListOptions savedStateProductListOptions = (SavedStateProductListOptions) savedStateHandle.a("SAVED_PRODUCT_LIST_OPTIONS");
        if (savedStateProductListOptions != null) {
            this.p = new ProductListOptions(savedStateProductListOptions.f, savedStateProductListOptions.e, savedStateProductListOptions.d, savedStateProductListOptions.g, savedStateProductListOptions.h, savedStateProductListOptions.i);
            productListInteractor.y(q6());
        }
        BuildersKt.c(ViewModelKt.a(this), null, null, new ProductListOptionsViewModel$initObserver$1(this, null), 3);
    }

    @Override // au.com.woolworths.feature.product.list.legacy.ui.SortOptionsClickListener
    public final void A() {
        MutableStateFlow mutableStateFlow;
        Object value;
        ProductListOptionsContract.ViewState viewState;
        SortOptionsDisplayMode sortOptionsDisplayMode;
        Object value2;
        do {
            mutableStateFlow = this.i;
            value = mutableStateFlow.getValue();
            viewState = (ProductListOptionsContract.ViewState) value;
            int iOrdinal = ((ProductListOptionsContract.ViewState) this.j.getValue()).b.ordinal();
            if (iOrdinal == 0) {
                sortOptionsDisplayMode = SortOptionsDisplayMode.e;
            } else {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                sortOptionsDisplayMode = SortOptionsDisplayMode.d;
            }
        } while (!mutableStateFlow.d(value, ProductListOptionsContract.ViewState.a(viewState, false, sortOptionsDisplayMode, null, null, null, null, false, null, 0, 4093)));
        List<Object> list = ((ProductListOptionsContract.ViewState) mutableStateFlow.getValue()).e;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(list, 10));
        for (Object objX6 : list) {
            if (objX6 instanceof ProductListOptionsItem.SortOptionsSection) {
                objX6 = x6();
            }
            arrayList.add(objX6);
        }
        do {
            value2 = mutableStateFlow.getValue();
        } while (!mutableStateFlow.d(value2, ProductListOptionsContract.ViewState.a((ProductListOptionsContract.ViewState) value2, false, null, null, null, arrayList, null, !A6(), null, 0, 3823)));
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A6() {
        /*
            Method dump skipped, instructions count: 234
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.product.list.legacy.ProductListOptionsViewModel.A6():boolean");
    }

    public final boolean B6() {
        return ((Boolean) this.r.getD()).booleanValue();
    }

    public final void C6(Exception exc) {
        TrackingMetadata trackingMetadataV6 = v6();
        trackingMetadataV6.b(TrackableValue.k0, "Unable to apply filters.");
        this.g.j(ProductListOptionsActions.l, trackingMetadataV6);
        boolean z = exc instanceof NoConnectivityException;
        SharedFlowImpl sharedFlowImpl = this.m;
        if (z) {
            sharedFlowImpl.f(new ProductListOptionsContract.Actions.ShowMessage(new ResText(com.woolworths.R.string.product_list_no_connection)));
        } else if (exc instanceof ServerErrorException) {
            sharedFlowImpl.f(new ProductListOptionsContract.Actions.ShowMessage(new ResText(com.woolworths.R.string.product_list_unable_apply_filters)));
        }
    }

    public final void D6() {
        ProductListInteractor productListInteractor;
        ProductListOptions productListOptionsQ6 = q6();
        List list = ((ProductListOptionsContract.ViewState) this.i.getValue()).f;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof FilterMenuItem) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.s(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            productListInteractor = this.f;
            if (!zHasNext) {
                break;
            }
            productListInteractor.C(((FilterMenuItem) it.next()).k, ToggleableState.e);
            arrayList2.add(Unit.f24250a);
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : list) {
            if (obj2 instanceof FilterMenuItem) {
                arrayList3.add(obj2);
            }
        }
        FilterMenuItem filterMenuItem = (FilterMenuItem) arrayList3.get(0);
        String strS = productListInteractor.s(filterMenuItem.k);
        TrackingMetadata trackingMetadataV6 = v6();
        trackingMetadataV6.b(TrackableValue.v0, strS);
        this.g.j(ProductListOptionsFiltersActions.e, trackingMetadataV6);
        productListInteractor.B(filterMenuItem.k);
        p6(productListOptionsQ6);
    }

    @Override // au.com.woolworths.feature.product.list.legacy.ui.MarketplaceSwitchListener
    public final void E() {
        InfoSection infoSection = this.f.u;
        if (infoSection != null) {
            this.g.j(ProductListOptionsActions.i, v6());
            this.m.f(new ProductListOptionsContract.Actions.LaunchMarketplaceHowItWorks(infoSection));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.ArrayList] */
    public final void E6() {
        List arrayList;
        List list;
        this.g.j(ProductListOptionsActions.j, v6());
        ProductListOptions productListOptionsQ6 = q6();
        ProductListInteractor productListInteractor = this.f;
        MutableStateFlow mutableStateFlow = productListInteractor.o;
        FilterOptionsManager filterOptionsManager = productListInteractor.r;
        for (FilterOption filterOption : filterOptionsManager.c) {
            List<FilterMenuItem> list2 = filterOption.f;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.s(list2, 10));
            for (FilterMenuItem filterMenuItem : list2) {
                ToggleableState toggleableState = ToggleableState.e;
                filterMenuItem.getClass();
                filterMenuItem.i = toggleableState;
                filterMenuItem.j = 0;
                arrayList2.add(Unit.f24250a);
            }
            filterOption.g = 0;
        }
        ArrayList arrayListA = FilterOptionKt.a(filterOptionsManager.c);
        ProductListOptions productListOptions = (ProductListOptions) mutableStateFlow.getValue();
        if (productListOptions == null || (list = productListOptions.f) == null) {
            arrayList = EmptyList.d;
        } else {
            List<SortOption> list3 = list;
            arrayList = new ArrayList(CollectionsKt.s(list3, 10));
            for (SortOption sortOption : list3) {
                sortOption.g = false;
                arrayList.add(sortOption);
            }
        }
        ProductListInteractor.F(productListInteractor, mutableStateFlow, arrayListA, arrayList, null, null, 0, null, 52);
        p6(productListOptionsQ6);
    }

    public final void F6(SeeResultsClickSource clickSource) {
        Intrinsics.h(clickSource, "clickSource");
        TrackingMetadata trackingMetadataV6 = v6();
        trackingMetadataV6.a(s6());
        this.g.j(clickSource.d, trackingMetadataV6);
        ProductsDisplayMode productsDisplayModeY6 = y6();
        if (productsDisplayModeY6 != null) {
            this.m.f(new ProductListOptionsContract.Actions.SeeResults(productsDisplayModeY6));
        }
    }

    public final void G6() {
        ProductListInteractor productListInteractor;
        ProductListOptions productListOptionsQ6 = q6();
        List list = ((ProductListOptionsContract.ViewState) this.i.getValue()).f;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof FilterMenuItem) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.s(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            productListInteractor = this.f;
            if (!zHasNext) {
                break;
            }
            productListInteractor.C(((FilterMenuItem) it.next()).k, ToggleableState.d);
            arrayList2.add(Unit.f24250a);
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : list) {
            if (obj2 instanceof FilterMenuItem) {
                arrayList3.add(obj2);
            }
        }
        FilterMenuItem filterMenuItem = (FilterMenuItem) arrayList3.get(0);
        String strS = productListInteractor.s(filterMenuItem.k);
        TrackingMetadata trackingMetadataV6 = v6();
        trackingMetadataV6.b(TrackableValue.v0, strS);
        this.g.j(ProductListOptionsFiltersActions.k, trackingMetadataV6);
        productListInteractor.B(filterMenuItem.k);
        p6(productListOptionsQ6);
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0172 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void H6(java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.product.list.legacy.ProductListOptionsViewModel.H6(java.lang.String):void");
    }

    @Override // au.com.woolworths.feature.product.list.legacy.ui.FilterOptionsClickListener
    public final void I(String filterOptionId) {
        Intrinsics.h(filterOptionId, "filterOptionId");
        this.m.f(new ProductListOptionsContract.Actions.LaunchFilterOptions(filterOptionId));
    }

    public final void I6() {
        MutableStateFlow mutableStateFlow;
        Object value;
        ProductListOptionsContract.ViewState viewState;
        boolean z;
        ProductListOptions productListOptions;
        ArrayList arrayList = new ArrayList();
        ProductListOptions productListOptions2 = this.p;
        if (productListOptions2 == null) {
            Intrinsics.p("productListOptions");
            throw null;
        }
        if (!productListOptions2.e.isEmpty()) {
            arrayList.add(new ProductListOptionsItem.Header(com.woolworths.R.string.product_list_sort_by));
            arrayList.add(x6());
        }
        ProductListOptions productListOptions3 = this.p;
        if (productListOptions3 == null) {
            Intrinsics.p("productListOptions");
            throw null;
        }
        InsetBannerData insetBannerData = productListOptions3.g;
        if (insetBannerData != null) {
            arrayList.add(new ProductListOptionsItem.SortOptionsInsetBanner(insetBannerData));
        }
        ProductListOptions productListOptions4 = this.p;
        if (productListOptions4 == null) {
            Intrinsics.p("productListOptions");
            throw null;
        }
        boolean zIsEmpty = productListOptions4.d.isEmpty();
        ProductListInteractor productListInteractor = this.f;
        if (!zIsEmpty) {
            arrayList.add(new ProductListOptionsItem.Header(com.woolworths.R.string.product_list_filter_by));
            ProductsListRepository productsListRepository = productListInteractor.f5328a;
            if (!productListInteractor.l.isEmpty() && productsListRepository.b.getInt("filter_card_count", 0) <= 3) {
                arrayList.add(ProductListOptionsItem.FilterCard.f5378a);
            }
            ProductListOptions productListOptions5 = this.p;
            if (productListOptions5 == null) {
                Intrinsics.p("productListOptions");
                throw null;
            }
            List<FilterOption> list = productListOptions5.d;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.s(list, 10));
            for (FilterOption filterOption : list) {
                arrayList2.add(new ProductListOptionsItem.FilterOptionItem(filterOption.d, filterOption.e, filterOption.g));
            }
            arrayList.addAll(arrayList2);
        }
        ProductListOptions productListOptions6 = this.p;
        if (productListOptions6 == null) {
            Intrinsics.p("productListOptions");
            throw null;
        }
        ProductFilterSwitch productFilterSwitch = productListOptions6.h;
        if (productFilterSwitch != null) {
            arrayList.add(new ProductListOptionsItem.MarketplaceSwitch(productFilterSwitch));
        }
        arrayList.add(new ProductListOptionsItem.Header(com.woolworths.R.string.product_list_view_options));
        String string = productListInteractor.f5328a.f5342a.getString("product_list_display_mode", null);
        if (string == null) {
            string = "GRID";
        }
        arrayList.add(new ProductListOptionsItem.DisplayMode(ProductsDisplayMode.valueOf(string)));
        do {
            mutableStateFlow = this.i;
            value = mutableStateFlow.getValue();
            viewState = (ProductListOptionsContract.ViewState) value;
            z = !A6();
            productListOptions = this.p;
            if (productListOptions == null) {
                Intrinsics.p("productListOptions");
                throw null;
            }
        } while (!mutableStateFlow.d(value, ProductListOptionsContract.ViewState.a(viewState, false, null, null, null, arrayList, null, z, null, productListOptions.i, 2799)));
    }

    @Override // au.com.woolworths.feature.product.list.legacy.ui.DisplayModeClickListener
    public final void Q1(ProductsDisplayMode displayMode) {
        Object value;
        Intrinsics.h(displayMode, "displayMode");
        ProductListInteractor productListInteractor = this.f;
        productListInteractor.getClass();
        SharedPreferences.Editor editorEdit = productListInteractor.f5328a.f5342a.edit();
        editorEdit.putString("product_list_display_mode", displayMode.name());
        editorEdit.apply();
        MutableStateFlow mutableStateFlow = this.i;
        List<Object> list = ((ProductListOptionsContract.ViewState) mutableStateFlow.getValue()).e;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(list, 10));
        for (Object displayMode2 : list) {
            if (displayMode2 instanceof ProductListOptionsItem.DisplayMode) {
                displayMode2 = new ProductListOptionsItem.DisplayMode(displayMode);
            }
            arrayList.add(displayMode2);
        }
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.d(value, ProductListOptionsContract.ViewState.a((ProductListOptionsContract.ViewState) value, false, null, null, null, arrayList, null, !A6(), null, 0, 3823)));
    }

    @Override // au.com.woolworths.feature.product.list.legacy.ui.FilterOptionsClickListener
    public final void V0(FilterMenuItem filterMenuItem, ToggleableState newState) {
        Intrinsics.h(filterMenuItem, "filterMenuItem");
        String str = filterMenuItem.k;
        Intrinsics.h(newState, "newState");
        if (newState == ToggleableState.f || filterMenuItem.i == newState) {
            return;
        }
        ProductListOptions productListOptionsQ6 = q6();
        String str2 = filterMenuItem.d;
        ProductListOptionsFiltersActions productListOptionsFiltersActions = newState == ToggleableState.d ? ProductListOptionsFiltersActions.h : ProductListOptionsFiltersActions.i;
        TrackingMetadata trackingMetadataV6 = v6();
        trackingMetadataV6.b(TrackableValue.v0, str2);
        this.g.j(productListOptionsFiltersActions, trackingMetadataV6);
        ProductListInteractor productListInteractor = this.f;
        productListInteractor.C(str, newState);
        productListInteractor.B(str);
        p6(productListOptionsQ6);
    }

    @Override // au.com.woolworths.feature.product.list.legacy.ui.MarketplaceSwitchListener
    public final void j(boolean z) {
        ProductFilterSwitch productFilterSwitch;
        this.g.j(z ? ProductListOptionsActions.h : ProductListOptionsActions.g, v6());
        ProductListInteractor productListInteractor = this.f;
        MutableStateFlow mutableStateFlow = productListInteractor.o;
        ProductListOptions productListOptions = (ProductListOptions) mutableStateFlow.getValue();
        ProductListInteractor.F(productListInteractor, mutableStateFlow, null, null, null, (productListOptions == null || (productFilterSwitch = productListOptions.h) == null) ? null : ProductFilterSwitch.a(productFilterSwitch, z), 0, null, 55);
        p6(q6());
    }

    @Override // au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerClickListener
    public final void onActionClicked(InsetBanner insetBanner) {
        Intrinsics.h(insetBanner, "insetBanner");
        InlineErrorAction e = insetBanner.getE();
        InlineErrorAction.Link link = e instanceof InlineErrorAction.Link ? (InlineErrorAction.Link) e : null;
        if (link == null) {
            throw new IllegalStateException("Action for filter InsetBanner must be LINK");
        }
        FilterInsetBannerData filterInsetBannerData = (FilterInsetBannerData) insetBanner;
        Text textA = filterInsetBannerData.h.a();
        if (textA != null) {
            TrackingMetadata trackingMetadataV6 = v6();
            trackingMetadataV6.b(TrackableValue.v0, filterInsetBannerData.i);
            trackingMetadataV6.b(TrackableValue.o0, textA);
            this.g.j(ProductListOptionsFiltersActions.g, trackingMetadataV6);
        }
        this.k.f(new ProductListOptionsContract.FilterOptionsActions.OpenUrl(link.e));
    }

    @Override // au.com.woolworths.feature.product.list.legacy.ui.SortOptionsClickListener
    public final void p(String sortByOptionId) {
        Intrinsics.h(sortByOptionId, "sortByOptionId");
        ProductListOptions productListOptions = this.p;
        if (productListOptions == null) {
            Intrinsics.p("productListOptions");
            throw null;
        }
        List<SortOption> list = productListOptions.e;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(list, 10));
        for (SortOption sortOption : list) {
            arrayList.add(SortOption.a(sortOption, Intrinsics.c(sortOption.d, sortByOptionId), 7));
        }
        ProductListInteractor productListInteractor = this.f;
        productListInteractor.getClass();
        ProductListInteractor.F(productListInteractor, productListInteractor.o, null, SortOptionKt.a(arrayList), null, null, 0, null, 61);
        p6(q6());
    }

    public final void p6(ProductListOptions productListOptions) {
        BuildersKt.c(ViewModelKt.a(this), null, null, new ProductListOptionsViewModel$applyOptionsAndRefresh$1(this, productListOptions, null), 3);
    }

    public final ProductListOptions q6() {
        ProductListOptions productListOptions = this.p;
        if (productListOptions == null) {
            Intrinsics.p("productListOptions");
            throw null;
        }
        ArrayList arrayListA = FilterOptionKt.a(productListOptions.d);
        ProductListOptions productListOptions2 = this.p;
        if (productListOptions2 == null) {
            Intrinsics.p("productListOptions");
            throw null;
        }
        ArrayList arrayListA2 = SortOptionKt.a(productListOptions2.e);
        ProductListOptions productListOptions3 = this.p;
        if (productListOptions3 == null) {
            Intrinsics.p("productListOptions");
            throw null;
        }
        return new ProductListOptions(arrayListA, arrayListA2, productListOptions3.f, productListOptions3.g, productListOptions3.h, productListOptions3.i);
    }

    public final String r6() {
        LinkedHashMap linkedHashMapP = this.f.p();
        if (linkedHashMapP.isEmpty()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : linkedHashMapP.entrySet()) {
            String str = (String) entry.getKey();
            sb.append(CollectionsKt.M((List) entry.getValue(), ", ", YU.a.g(str, ": "), " | ", null, 56));
        }
        String string = sb.toString();
        Intrinsics.g(string, "toString(...)");
        return StringsKt.N(string, " | ");
    }

    @Override // au.com.woolworths.feature.product.list.legacy.ui.FilterCardClickListener
    public final void s() {
        SharedPreferences sharedPreferences = this.f.f5328a.b;
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putInt("filter_card_count", sharedPreferences.getInt("filter_card_count", 0) + 3);
        editorEdit.apply();
        I6();
    }

    public final TrackingMetadata s6() {
        TrackingMetadata trackingMetadataV6 = v6();
        trackingMetadataV6.b(TrackableValue.o0, "See Filter Results");
        ProductsDisplayMode productsDisplayModeY6 = y6();
        if (productsDisplayModeY6 != null) {
            trackingMetadataV6.b(TrackableValue.Y1, ProductsDisplayModeKt.a(productsDisplayModeY6));
        }
        String strT = this.f.t();
        if (strT != null) {
            trackingMetadataV6.b(TrackableValue.V1, strT);
        }
        String strR6 = r6();
        if (strR6 != null) {
            trackingMetadataV6.b(TrackableValue.T1, strR6);
        }
        return trackingMetadataV6;
    }

    public final Object t6(Continuation continuation) {
        ProductListInteractor productListInteractor = this.f;
        LinkedHashMap linkedHashMapP = productListInteractor.p();
        Activities.ProductList.ExtraProductListSource extraProductListSourceW6 = w6();
        if (extraProductListSourceW6 instanceof Activities.ProductList.ExtrasBySearch) {
            Activities.ProductList.Extras extras = this.o;
            if (extras == null) {
                Intrinsics.p("pageExtras");
                throw null;
            }
            Activities.ProductList.ExtrasBySearch extrasBySearch = (Activities.ProductList.ExtrasBySearch) extraProductListSourceW6;
            return this.f.e(extras, extrasBySearch.getD(), extrasBySearch.e, B6(), (ContinuationImpl) continuation);
        }
        if (extraProductListSourceW6 instanceof Activities.ProductList.ExtrasByCategory) {
            Activities.ProductList.Extras extras2 = this.o;
            if (extras2 != null) {
                return productListInteractor.d(extras2, ((Activities.ProductList.ExtrasByCategory) extraProductListSourceW6).d, B6(), (ContinuationImpl) continuation);
            }
            Intrinsics.p("pageExtras");
            throw null;
        }
        if (extraProductListSourceW6 instanceof Activities.ProductList.ExtrasBySpecialsCategory) {
            Activities.ProductList.Extras extras3 = this.o;
            if (extras3 != null) {
                return productListInteractor.g(extras3, ((Activities.ProductList.ExtrasBySpecialsCategory) extraProductListSourceW6).d, B6(), (ContinuationImpl) continuation);
            }
            Intrinsics.p("pageExtras");
            throw null;
        }
        if (extraProductListSourceW6 instanceof Activities.ProductList.ExtrasByFacet) {
            Activities.ProductList.ExtrasByFacet extrasByFacet = (Activities.ProductList.ExtrasByFacet) extraProductListSourceW6;
            return productListInteractor.f5328a.d(extrasByFacet.d, extrasByFacet.e, extrasByFacet.f, extrasByFacet.g, extrasByFacet.h, productListInteractor.t(), linkedHashMapP, null, (ContinuationImpl) continuation);
        }
        if (extraProductListSourceW6 instanceof Activities.ProductList.ExtrasBySearchAlternative) {
            Activities.ProductList.Extras extras4 = this.o;
            if (extras4 != null) {
                Activities.ProductList.ExtrasBySearchAlternative extrasBySearchAlternative = (Activities.ProductList.ExtrasBySearchAlternative) extraProductListSourceW6;
                return productListInteractor.f(extras4, extrasBySearchAlternative.d, extrasBySearchAlternative.e, (ContinuationImpl) continuation);
            }
            Intrinsics.p("pageExtras");
            throw null;
        }
        if (extraProductListSourceW6 instanceof Activities.ProductList.ExtrasByProductGroup) {
            Activities.ProductList.Extras extras5 = this.o;
            if (extras5 == null) {
                Intrinsics.p("pageExtras");
                throw null;
            }
            Activities.ProductList.ExtrasByProductGroup extrasByProductGroup = (Activities.ProductList.ExtrasByProductGroup) extraProductListSourceW6;
            return this.f.c(extras5, extrasByProductGroup.d, extrasByProductGroup.e, B6(), extrasByProductGroup.f, (ContinuationImpl) continuation);
        }
        if ((extraProductListSourceW6 instanceof Activities.ProductList.ExtrasByBoostedOffers) || Intrinsics.c(extraProductListSourceW6, Activities.ProductList.ExtrasByHaveYouForgotten.d) || (extraProductListSourceW6 instanceof Activities.ProductList.ExtrasByPastShop) || (extraProductListSourceW6 instanceof Activities.ProductList.ExtrasByPriceFamily) || (extraProductListSourceW6 instanceof Activities.ProductList.ExtrasByProductIds) || (extraProductListSourceW6 instanceof Activities.ProductList.ExtrasByRecipe) || (extraProductListSourceW6 instanceof Activities.ProductList.ExtrasBySuggestedLists)) {
            throw new IllegalStateException(androidx.constraintlayout.core.state.a.e(extraProductListSourceW6.getClass(), "Product list of type ", " is unsupported"));
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b6, code lost:
    
        if (u6(r0, r3) == r4) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00bb A[Catch: ServerErrorException -> 0x0033, NoConnectivityException -> 0x0036, all -> 0x00b9, TryCatch #3 {NoConnectivityException -> 0x0036, ServerErrorException -> 0x0033, blocks: (B:12:0x002e, B:51:0x00be, B:21:0x0043, B:29:0x007b, B:31:0x0081, B:32:0x0093, B:34:0x0097, B:39:0x00a1, B:41:0x00a7, B:45:0x00ad, B:50:0x00bb, B:24:0x004f, B:26:0x006e), top: B:68:0x0028, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object u6(au.com.woolworths.android.onesite.navigation.Activities.ProductList.ExtraProductListSource r22, kotlin.coroutines.jvm.internal.ContinuationImpl r23) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.product.list.legacy.ProductListOptionsViewModel.u6(au.com.woolworths.android.onesite.navigation.Activities$ProductList$ExtraProductListSource, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final TrackingMetadata v6() {
        TrackingMetadata trackingMetadataA = TrackingMetadata.Companion.a(TrackableValue.X1, w6().getE().d);
        List list = (List) this.q.getValue();
        if (list != null && (!list.isEmpty())) {
            trackingMetadataA.b(TrackableValue.S1, CollectionsKt.M(list, ", ", null, null, new au.com.woolworths.feature.product.list.compose.filter.a(22), 30));
        }
        return trackingMetadataA;
    }

    public final Activities.ProductList.ExtraProductListSource w6() {
        Activities.ProductList.Extras extras = this.o;
        if (extras != null) {
            return extras.e;
        }
        Intrinsics.p("pageExtras");
        throw null;
    }

    public final ProductListOptionsItem.SortOptionsSection x6() {
        List listSubList;
        ProductListOptions productListOptions = this.p;
        ProductListOptionsSortOptionItem.SortOptionsToggleItem sortOptionsToggleItem = null;
        if (productListOptions == null) {
            Intrinsics.p("productListOptions");
            throw null;
        }
        int size = productListOptions.e.size();
        MutableStateFlow mutableStateFlow = this.i;
        if (size <= 8 || ((ProductListOptionsContract.ViewState) mutableStateFlow.getValue()).b != SortOptionsDisplayMode.e) {
            ProductListOptions productListOptions2 = this.p;
            if (productListOptions2 == null) {
                Intrinsics.p("productListOptions");
                throw null;
            }
            listSubList = productListOptions2.e;
        } else {
            ProductListOptions productListOptions3 = this.p;
            if (productListOptions3 == null) {
                Intrinsics.p("productListOptions");
                throw null;
            }
            listSubList = productListOptions3.e.subList(0, 7);
        }
        List list = listSubList;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new ProductListOptionsSortOptionItem.SortOptionItem((SortOption) it.next()));
        }
        ArrayList arrayListJ0 = CollectionsKt.J0(arrayList);
        ProductListOptions productListOptions4 = this.p;
        if (productListOptions4 == null) {
            Intrinsics.p("productListOptions");
            throw null;
        }
        if (productListOptions4.e.size() <= 8 || ((ProductListOptionsContract.ViewState) mutableStateFlow.getValue()).b != SortOptionsDisplayMode.d) {
            ProductListOptions productListOptions5 = this.p;
            if (productListOptions5 == null) {
                Intrinsics.p("productListOptions");
                throw null;
            }
            if (productListOptions5.e.size() > 8 && ((ProductListOptionsContract.ViewState) mutableStateFlow.getValue()).b == SortOptionsDisplayMode.e) {
                sortOptionsToggleItem = new ProductListOptionsSortOptionItem.SortOptionsToggleItem(com.woolworths.R.string.product_list_more_options);
            }
        } else {
            sortOptionsToggleItem = new ProductListOptionsSortOptionItem.SortOptionsToggleItem(com.woolworths.R.string.product_list_less_options);
        }
        if (sortOptionsToggleItem != null) {
            arrayListJ0.add(sortOptionsToggleItem);
        }
        return new ProductListOptionsItem.SortOptionsSection(arrayListJ0);
    }

    public final ProductsDisplayMode y6() {
        List list = ((ProductListOptionsContract.ViewState) this.j.getValue()).e;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof ProductListOptionsItem.DisplayMode) {
                arrayList.add(obj);
            }
        }
        ProductListOptionsItem.DisplayMode displayMode = (ProductListOptionsItem.DisplayMode) CollectionsKt.F(arrayList);
        if (displayMode != null) {
            return displayMode.f5377a;
        }
        return null;
    }

    public final void z6(ProductListData productListData) {
        Activities.ProductList.ExtraProductListSource extraProductListSourceW6 = w6();
        ProductListInteractor productListInteractor = this.f;
        LinkedHashMap linkedHashMapP = productListInteractor.p();
        if (extraProductListSourceW6 instanceof Activities.ProductList.ExtrasBySearch) {
            Activities.ProductList.Extras extras = this.o;
            if (extras == null) {
                Intrinsics.p("pageExtras");
                throw null;
            }
            Activities.ProductList.ExtrasBySearch extrasBySearch = (Activities.ProductList.ExtrasBySearch) extraProductListSourceW6;
            ProductListInteractor.l(this.f, extras, extrasBySearch.getD(), extrasBySearch.e, productListData, null, null, null, null, B6(), null, false, 2536);
            return;
        }
        if (extraProductListSourceW6 instanceof Activities.ProductList.ExtrasByCategory) {
            Activities.ProductList.Extras extras2 = this.o;
            if (extras2 == null) {
                Intrinsics.p("pageExtras");
                throw null;
            }
            ProductListInteractor.i(this.f, extras2, ((Activities.ProductList.ExtrasByCategory) extraProductListSourceW6).d, productListData, null, null, null, B6(), 48);
            return;
        }
        if (extraProductListSourceW6 instanceof Activities.ProductList.ExtrasBySpecialsCategory) {
            Activities.ProductList.Extras extras3 = this.o;
            if (extras3 == null) {
                Intrinsics.p("pageExtras");
                throw null;
            }
            Activities.ProductList.ExtrasBySpecialsCategory extrasBySpecialsCategory = (Activities.ProductList.ExtrasBySpecialsCategory) extraProductListSourceW6;
            this.f.o(extras3, extrasBySpecialsCategory.d, productListData, extrasBySpecialsCategory.e, null, linkedHashMapP, B6());
            return;
        }
        if (extraProductListSourceW6 instanceof Activities.ProductList.ExtrasByBoostedOffers) {
            ProductListInteractor.h(productListInteractor, ((Activities.ProductList.ExtrasByBoostedOffers) extraProductListSourceW6).d);
            return;
        }
        if (extraProductListSourceW6 instanceof Activities.ProductList.ExtrasByFacet) {
            Activities.ProductList.ExtrasByFacet extrasByFacet = (Activities.ProductList.ExtrasByFacet) extraProductListSourceW6;
            this.f.j(extrasByFacet.d, extrasByFacet.e, extrasByFacet.f, extrasByFacet.g, extrasByFacet.h, linkedHashMapP, productListData);
            return;
        }
        if (extraProductListSourceW6 instanceof Activities.ProductList.ExtrasBySearchAlternative) {
            Activities.ProductList.Extras extras4 = this.o;
            if (extras4 == null) {
                Intrinsics.p("pageExtras");
                throw null;
            }
            Activities.ProductList.ExtrasBySearchAlternative extrasBySearchAlternative = (Activities.ProductList.ExtrasBySearchAlternative) extraProductListSourceW6;
            ProductListInteractor.m(this.f, extras4, extrasBySearchAlternative.e, extrasBySearchAlternative.d, productListData, null, null, null, null, 232);
            return;
        }
        if (!(extraProductListSourceW6 instanceof Activities.ProductList.ExtrasByProductGroup)) {
            if (!Intrinsics.c(extraProductListSourceW6, Activities.ProductList.ExtrasByHaveYouForgotten.d) && !(extraProductListSourceW6 instanceof Activities.ProductList.ExtrasByPastShop) && !(extraProductListSourceW6 instanceof Activities.ProductList.ExtrasByPriceFamily) && !(extraProductListSourceW6 instanceof Activities.ProductList.ExtrasByProductIds) && !(extraProductListSourceW6 instanceof Activities.ProductList.ExtrasByRecipe) && !(extraProductListSourceW6 instanceof Activities.ProductList.ExtrasBySuggestedLists)) {
                throw new NoWhenBranchMatchedException();
            }
            this.s.e(androidx.constraintlayout.core.state.a.e(extraProductListSourceW6.getClass(), "Product list of type ", " is unsupported"), new Object[0]);
            return;
        }
        Activities.ProductList.Extras extras5 = this.o;
        if (extras5 == null) {
            Intrinsics.p("pageExtras");
            throw null;
        }
        Activities.ProductList.ExtrasByProductGroup extrasByProductGroup = (Activities.ProductList.ExtrasByProductGroup) extraProductListSourceW6;
        ProductListInteractor.k(this.f, extras5, extrasByProductGroup.d, false, extrasByProductGroup.e, B6(), extrasByProductGroup.f, null, productListData, null, null, null, 1792);
    }
}
