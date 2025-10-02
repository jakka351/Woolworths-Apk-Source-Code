package au.com.woolworths.feature.product.list;

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
import au.com.woolworths.android.onesite.models.text.PlainText;
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
import au.com.woolworths.feature.product.list.ProductListOptionsContract;
import au.com.woolworths.feature.product.list.analytics.ProductListOptionsActions;
import au.com.woolworths.feature.product.list.analytics.ProductListOptionsFiltersActions;
import au.com.woolworths.feature.product.list.analytics.SeeResultsClickSource;
import au.com.woolworths.feature.product.list.data.FilterInsetBannerData;
import au.com.woolworths.feature.product.list.data.FilterOptionsManager;
import au.com.woolworths.feature.product.list.data.ProductFilterSwitch;
import au.com.woolworths.feature.product.list.data.ProductListChip;
import au.com.woolworths.feature.product.list.data.ProductListData;
import au.com.woolworths.feature.product.list.data.ProductListOptions;
import au.com.woolworths.feature.product.list.data.SortOption;
import au.com.woolworths.feature.product.list.data.SortOptionKt;
import au.com.woolworths.feature.product.list.ui.ChildFilterMenuState;
import au.com.woolworths.feature.product.list.ui.DisplayModeClickListener;
import au.com.woolworths.feature.product.list.ui.FilterCardClickListener;
import au.com.woolworths.feature.product.list.ui.FilterInsetBannerClickListener;
import au.com.woolworths.feature.product.list.ui.FilterMenuItem;
import au.com.woolworths.feature.product.list.ui.FilterOption;
import au.com.woolworths.feature.product.list.ui.FilterOptionKt;
import au.com.woolworths.feature.product.list.ui.FilterOptionsClickListener;
import au.com.woolworths.feature.product.list.ui.MarketplaceSwitchListener;
import au.com.woolworths.feature.product.list.ui.ProductListOptionsItem;
import au.com.woolworths.feature.product.list.ui.ProductListOptionsSortOptionItem;
import au.com.woolworths.feature.product.list.ui.SortOptionsClickListener;
import au.com.woolworths.feature.product.list.ui.SortOptionsDisplayMode;
import com.medallia.digital.mobilesdk.l3;
import dagger.hilt.android.lifecycle.HiltViewModel;
import java.util.ArrayList;
import java.util.Iterator;
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
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007:\u0002\b\t¨\u0006\n"}, d2 = {"Lau/com/woolworths/feature/product/list/ProductListOptionsViewModel;", "Landroidx/lifecycle/ViewModel;", "Lau/com/woolworths/feature/product/list/ui/SortOptionsClickListener;", "Lau/com/woolworths/feature/product/list/ui/FilterOptionsClickListener;", "Lau/com/woolworths/feature/product/list/ui/DisplayModeClickListener;", "Lau/com/woolworths/feature/product/list/ui/FilterInsetBannerClickListener;", "Lau/com/woolworths/feature/product/list/ui/FilterCardClickListener;", "Lau/com/woolworths/feature/product/list/ui/MarketplaceSwitchListener;", "SavedStateProductListOptions", "Companion", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lau/com/woolworths/feature/product/list/ProductListOptionsViewModel$Companion;", "", "", "MAX_SORT_OPTIONS_COLLAPSED", "I", "", "SAVED_PRODUCT_LIST_OPTIONS", "Ljava/lang/String;", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Parcelize
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/ProductListOptionsViewModel$SavedStateProductListOptions;", "Landroid/os/Parcelable;", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
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
        final MutableStateFlow mutableStateFlow = productListInteractor.l;
        this.q = FlowKt.O(new Flow<List<? extends ProductListChip>>() { // from class: au.com.woolworths.feature.product.list.ProductListOptionsViewModel$special$$inlined$map$1

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: au.com.woolworths.feature.product.list.ProductListOptionsViewModel$special$$inlined$map$1$2, reason: invalid class name */
            public final class AnonymousClass2<T> implements FlowCollector {
                public final /* synthetic */ FlowCollector d;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @DebugMetadata(c = "au.com.woolworths.feature.product.list.ProductListOptionsViewModel$special$$inlined$map$1$2", f = "ProductListOptionsViewModel.kt", l = {50}, m = "emit")
                /* renamed from: au.com.woolworths.feature.product.list.ProductListOptionsViewModel$special$$inlined$map$1$2$1, reason: invalid class name */
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
                        boolean r0 = r6 instanceof au.com.woolworths.feature.product.list.ProductListOptionsViewModel$special$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        au.com.woolworths.feature.product.list.ProductListOptionsViewModel$special$$inlined$map$1$2$1 r0 = (au.com.woolworths.feature.product.list.ProductListOptionsViewModel$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.q
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.q = r1
                        goto L18
                    L13:
                        au.com.woolworths.feature.product.list.ProductListOptionsViewModel$special$$inlined$map$1$2$1 r0 = new au.com.woolworths.feature.product.list.ProductListOptionsViewModel$special$$inlined$map$1$2$1
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
                        au.com.woolworths.feature.product.list.ProductListContract$ProductListFlow r5 = (au.com.woolworths.feature.product.list.ProductListContract.ProductListFlow) r5
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
                    throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.product.list.ProductListOptionsViewModel$special$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = mutableStateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == CoroutineSingletons.d ? objCollect : Unit.f24250a;
            }
        }, ViewModelKt.a(this), SharingStarted.Companion.f24711a, EmptyList.d);
        final int i = 0;
        this.r = LazyKt.b(new Function0(this) { // from class: au.com.woolworths.feature.product.list.a0
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
        this.t = LazyKt.b(new Function0(this) { // from class: au.com.woolworths.feature.product.list.a0
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
            productListInteractor.E(q6());
        }
        BuildersKt.c(ViewModelKt.a(this), null, null, new ProductListOptionsViewModel$initObserver$1(this, null), 3);
    }

    @Override // au.com.woolworths.feature.product.list.ui.SortOptionsClickListener
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
        for (Object objW6 : list) {
            if (objW6 instanceof ProductListOptionsItem.SortOptionsSection) {
                objW6 = w6();
            }
            arrayList.add(objW6);
        }
        do {
            value2 = mutableStateFlow.getValue();
        } while (!mutableStateFlow.d(value2, ProductListOptionsContract.ViewState.a((ProductListOptionsContract.ViewState) value2, false, null, null, null, arrayList, null, !z6(), null, 0, 3823)));
    }

    public final boolean A6() {
        return ((Boolean) this.r.getD()).booleanValue();
    }

    public final void B6(Exception exc) {
        TrackingMetadata trackingMetadataU6 = u6();
        trackingMetadataU6.b(TrackableValue.k0, "Unable to apply filters.");
        this.g.j(ProductListOptionsActions.l, trackingMetadataU6);
        boolean z = exc instanceof NoConnectivityException;
        SharedFlowImpl sharedFlowImpl = this.m;
        if (z) {
            sharedFlowImpl.f(new ProductListOptionsContract.Actions.ShowMessage(new ResText(com.woolworths.R.string.product_list_no_connection)));
        } else if (exc instanceof ServerErrorException) {
            sharedFlowImpl.f(new ProductListOptionsContract.Actions.ShowMessage(new ResText(com.woolworths.R.string.product_list_unable_apply_filters)));
        }
    }

    public final void C6() {
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
            productListInteractor.I(((FilterMenuItem) it.next()).k, ToggleableState.e);
            arrayList2.add(Unit.f24250a);
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : list) {
            if (obj2 instanceof FilterMenuItem) {
                arrayList3.add(obj2);
            }
        }
        FilterMenuItem filterMenuItem = (FilterMenuItem) arrayList3.get(0);
        String filterId = filterMenuItem.k;
        productListInteractor.getClass();
        Intrinsics.h(filterId, "filterId");
        String logicalParentKey = productListInteractor.p.getLogicalParentKey(filterId, false);
        TrackingMetadata trackingMetadataU6 = u6();
        trackingMetadataU6.b(TrackableValue.v0, logicalParentKey);
        this.g.j(ProductListOptionsFiltersActions.e, trackingMetadataU6);
        productListInteractor.H(filterMenuItem.k);
        p6(productListOptionsQ6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.ArrayList] */
    public final void D6() {
        List arrayList;
        List<SortOption> originalSortList;
        this.g.j(ProductListOptionsActions.j, u6());
        ProductListOptions productListOptionsQ6 = q6();
        ProductListInteractor productListInteractor = this.f;
        List<FilterOption> listRemoveAllAppliedFilters = productListInteractor.p.removeAllAppliedFilters();
        MutableStateFlow mutableStateFlow = productListInteractor.m;
        ArrayList arrayListA = FilterOptionKt.a(listRemoveAllAppliedFilters);
        ProductListOptions productListOptions = (ProductListOptions) mutableStateFlow.getValue();
        if (productListOptions == null || (originalSortList = productListOptions.getOriginalSortList()) == null) {
            arrayList = EmptyList.d;
        } else {
            List<SortOption> list = originalSortList;
            arrayList = new ArrayList(CollectionsKt.s(list, 10));
            for (SortOption sortOption : list) {
                sortOption.setApplied(false);
                arrayList.add(sortOption);
            }
        }
        ProductListInteractor.K(productListInteractor, mutableStateFlow, arrayListA, arrayList, null, null, 0, null, 52);
        p6(productListOptionsQ6);
    }

    @Override // au.com.woolworths.feature.product.list.ui.MarketplaceSwitchListener
    public final void E() {
        InfoSection infoSection = this.f.r;
        if (infoSection != null) {
            this.g.j(ProductListOptionsActions.i, u6());
            this.m.f(new ProductListOptionsContract.Actions.LaunchMarketplaceHowItWorks(infoSection));
        }
    }

    public final void E6(SeeResultsClickSource clickSource) {
        Intrinsics.h(clickSource, "clickSource");
        TrackingMetadata trackingMetadataU6 = u6();
        trackingMetadataU6.a(r6());
        this.g.j(clickSource.d, trackingMetadataU6);
        ProductsDisplayMode productsDisplayModeX6 = x6();
        if (productsDisplayModeX6 != null) {
            this.m.f(new ProductListOptionsContract.Actions.SeeResults(productsDisplayModeX6));
        }
    }

    public final void F6() {
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
            productListInteractor.I(((FilterMenuItem) it.next()).k, ToggleableState.d);
            arrayList2.add(Unit.f24250a);
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : list) {
            if (obj2 instanceof FilterMenuItem) {
                arrayList3.add(obj2);
            }
        }
        FilterMenuItem filterMenuItem = (FilterMenuItem) arrayList3.get(0);
        String filterId = filterMenuItem.k;
        productListInteractor.getClass();
        Intrinsics.h(filterId, "filterId");
        String logicalParentKey = productListInteractor.p.getLogicalParentKey(filterId, false);
        TrackingMetadata trackingMetadataU6 = u6();
        trackingMetadataU6.b(TrackableValue.v0, logicalParentKey);
        this.g.j(ProductListOptionsFiltersActions.k, trackingMetadataU6);
        productListInteractor.H(filterMenuItem.k);
        p6(productListOptionsQ6);
    }

    public final void G6(String str) {
        ChildFilterMenuState childFilterMenuState;
        String filterKey = str;
        Intrinsics.h(filterKey, "filterKey");
        ArrayList arrayList = new ArrayList();
        ProductListInteractor productListInteractor = this.f;
        productListInteractor.getClass();
        FilterOptionsManager filterOptionsManager = productListInteractor.p;
        FilterInsetBannerData insetBannerForFilter = filterOptionsManager.getInsetBannerForFilter(filterKey);
        if (insetBannerForFilter != null) {
            arrayList.add(insetBannerForFilter);
        }
        List<FilterMenuItem> immediateChildrenOf = filterOptionsManager.getImmediateChildrenOf(filterKey);
        ArrayList arrayList2 = new ArrayList(CollectionsKt.s(immediateChildrenOf, 10));
        Iterator<T> it = immediateChildrenOf.iterator();
        while (it.hasNext()) {
            arrayList2.add(FilterMenuItem.a((FilterMenuItem) it.next()));
        }
        arrayList.addAll(arrayList2);
        if (arrayList2.isEmpty()) {
            childFilterMenuState = ChildFilterMenuState.e;
        } else {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                ToggleableState toggleableState = ((FilterMenuItem) it2.next()).i;
                if (toggleableState == ToggleableState.d || toggleableState == ToggleableState.f) {
                    childFilterMenuState = ChildFilterMenuState.d;
                    break;
                }
            }
            childFilterMenuState = ChildFilterMenuState.e;
        }
        ChildFilterMenuState childFilterMenuState2 = childFilterMenuState;
        while (true) {
            MutableStateFlow mutableStateFlow = this.i;
            Object value = mutableStateFlow.getValue();
            ProductListOptionsContract.ViewState viewState = (ProductListOptionsContract.ViewState) value;
            String pageTitleOf = filterOptionsManager.getPageTitleOf(filterKey);
            Text resText = pageTitleOf == null ? new ResText(com.woolworths.R.string.product_list_filter) : new PlainText(pageTitleOf);
            List listG0 = CollectionsKt.G0(arrayList);
            ProductListOptions productListOptions = this.p;
            if (productListOptions == null) {
                Intrinsics.p("productListOptions");
                throw null;
            }
            if (mutableStateFlow.d(value, ProductListOptionsContract.ViewState.a(viewState, false, null, resText, filterKey, null, listG0, false, childFilterMenuState2, productListOptions.getProductsCount(), 2483))) {
                return;
            } else {
                filterKey = str;
            }
        }
    }

    public final void H6() {
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
        if (!productListOptions2.getSortList().isEmpty()) {
            arrayList.add(new ProductListOptionsItem.Header(com.woolworths.R.string.product_list_sort_by));
            arrayList.add(w6());
        }
        ProductListOptions productListOptions3 = this.p;
        if (productListOptions3 == null) {
            Intrinsics.p("productListOptions");
            throw null;
        }
        if (productListOptions3.getSortOptionsInsetBanner() != null) {
            ProductListOptions productListOptions4 = this.p;
            if (productListOptions4 == null) {
                Intrinsics.p("productListOptions");
                throw null;
            }
            InsetBannerData sortOptionsInsetBanner = productListOptions4.getSortOptionsInsetBanner();
            Intrinsics.e(sortOptionsInsetBanner);
            arrayList.add(new ProductListOptionsItem.SortOptionsInsetBanner(sortOptionsInsetBanner));
        }
        ProductListOptions productListOptions5 = this.p;
        if (productListOptions5 == null) {
            Intrinsics.p("productListOptions");
            throw null;
        }
        boolean zIsEmpty = productListOptions5.getFilterList().isEmpty();
        ProductListInteractor productListInteractor = this.f;
        if (!zIsEmpty) {
            arrayList.add(new ProductListOptionsItem.Header(com.woolworths.R.string.product_list_filter_by));
            ProductsListRepository productsListRepository = productListInteractor.f5251a;
            if (!productListInteractor.j.isEmpty() && productsListRepository.b.getInt("filter_card_count", 0) <= 3) {
                arrayList.add(ProductListOptionsItem.FilterCard.f5392a);
            }
            ProductListOptions productListOptions6 = this.p;
            if (productListOptions6 == null) {
                Intrinsics.p("productListOptions");
                throw null;
            }
            List<FilterOption> filterList = productListOptions6.getFilterList();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.s(filterList, 10));
            for (FilterOption filterOption : filterList) {
                arrayList2.add(new ProductListOptionsItem.FilterOptionItem(filterOption.d, filterOption.e, filterOption.g));
            }
            arrayList.addAll(arrayList2);
        }
        ProductListOptions productListOptions7 = this.p;
        if (productListOptions7 == null) {
            Intrinsics.p("productListOptions");
            throw null;
        }
        ProductFilterSwitch marketplaceProductsSwitch = productListOptions7.getMarketplaceProductsSwitch();
        if (marketplaceProductsSwitch != null) {
            arrayList.add(new ProductListOptionsItem.MarketplaceSwitch(marketplaceProductsSwitch));
        }
        arrayList.add(new ProductListOptionsItem.Header(com.woolworths.R.string.product_list_view_options));
        String string = productListInteractor.f5251a.f5265a.getString("product_list_display_mode", null);
        if (string == null) {
            string = "GRID";
        }
        arrayList.add(new ProductListOptionsItem.DisplayMode(ProductsDisplayMode.valueOf(string)));
        do {
            mutableStateFlow = this.i;
            value = mutableStateFlow.getValue();
            viewState = (ProductListOptionsContract.ViewState) value;
            z = !z6();
            productListOptions = this.p;
            if (productListOptions == null) {
                Intrinsics.p("productListOptions");
                throw null;
            }
        } while (!mutableStateFlow.d(value, ProductListOptionsContract.ViewState.a(viewState, false, null, null, null, arrayList, null, z, null, productListOptions.getProductsCount(), 2799)));
    }

    @Override // au.com.woolworths.feature.product.list.ui.FilterOptionsClickListener
    public final void I(String filterOptionId) {
        Intrinsics.h(filterOptionId, "filterOptionId");
        this.m.f(new ProductListOptionsContract.Actions.LaunchFilterOptions(filterOptionId));
    }

    @Override // au.com.woolworths.feature.product.list.ui.DisplayModeClickListener
    public final void Y1(ProductsDisplayMode displayMode) {
        Object value;
        Intrinsics.h(displayMode, "displayMode");
        ProductListInteractor productListInteractor = this.f;
        productListInteractor.getClass();
        SharedPreferences.Editor editorEdit = productListInteractor.f5251a.f5265a.edit();
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
        } while (!mutableStateFlow.d(value, ProductListOptionsContract.ViewState.a((ProductListOptionsContract.ViewState) value, false, null, null, null, arrayList, null, !z6(), null, 0, 3823)));
    }

    @Override // au.com.woolworths.feature.product.list.ui.MarketplaceSwitchListener
    public final void j(boolean z) {
        ProductFilterSwitch marketplaceProductsSwitch;
        this.g.j(z ? ProductListOptionsActions.h : ProductListOptionsActions.g, u6());
        ProductListInteractor productListInteractor = this.f;
        MutableStateFlow mutableStateFlow = productListInteractor.m;
        ProductListOptions productListOptions = (ProductListOptions) mutableStateFlow.getValue();
        ProductListInteractor.K(productListInteractor, mutableStateFlow, null, null, null, (productListOptions == null || (marketplaceProductsSwitch = productListOptions.getMarketplaceProductsSwitch()) == null) ? null : ProductFilterSwitch.copy$default(marketplaceProductsSwitch, null, null, null, z, null, 23, null), 0, null, 55);
        p6(q6());
    }

    @Override // au.com.woolworths.feature.product.list.ui.FilterOptionsClickListener
    public final void j4(FilterMenuItem filterMenuItem, ToggleableState newState) {
        Intrinsics.h(filterMenuItem, "filterMenuItem");
        String str = filterMenuItem.k;
        Intrinsics.h(newState, "newState");
        if (newState == ToggleableState.f || filterMenuItem.i == newState) {
            return;
        }
        ProductListOptions productListOptionsQ6 = q6();
        String str2 = filterMenuItem.d;
        ProductListOptionsFiltersActions productListOptionsFiltersActions = newState == ToggleableState.d ? ProductListOptionsFiltersActions.h : ProductListOptionsFiltersActions.i;
        TrackingMetadata trackingMetadataU6 = u6();
        trackingMetadataU6.b(TrackableValue.v0, str2);
        this.g.j(productListOptionsFiltersActions, trackingMetadataU6);
        ProductListInteractor productListInteractor = this.f;
        productListInteractor.I(str, newState);
        productListInteractor.H(str);
        p6(productListOptionsQ6);
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
        Text textA = filterInsetBannerData.getE().a();
        if (textA != null) {
            TrackingMetadata trackingMetadataU6 = u6();
            trackingMetadataU6.b(TrackableValue.v0, filterInsetBannerData.getFilterPageKey());
            trackingMetadataU6.b(TrackableValue.o0, textA);
            this.g.j(ProductListOptionsFiltersActions.g, trackingMetadataU6);
        }
        this.k.f(new ProductListOptionsContract.FilterOptionsActions.OpenUrl(link.e));
    }

    @Override // au.com.woolworths.feature.product.list.ui.SortOptionsClickListener
    public final void p(String sortByOptionId) {
        Intrinsics.h(sortByOptionId, "sortByOptionId");
        ProductListOptions productListOptions = this.p;
        if (productListOptions == null) {
            Intrinsics.p("productListOptions");
            throw null;
        }
        List<SortOption> sortList = productListOptions.getSortList();
        ArrayList arrayList = new ArrayList(CollectionsKt.s(sortList, 10));
        for (SortOption sortOption : sortList) {
            arrayList.add(SortOption.copy$default(sortOption, null, null, null, Intrinsics.c(sortOption.getId(), sortByOptionId), 7, null));
        }
        ProductListInteractor productListInteractor = this.f;
        productListInteractor.getClass();
        ProductListInteractor.K(productListInteractor, productListInteractor.m, null, SortOptionKt.deepCopy(arrayList), null, null, 0, null, 61);
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
        ArrayList arrayListA = FilterOptionKt.a(productListOptions.getFilterList());
        ProductListOptions productListOptions2 = this.p;
        if (productListOptions2 == null) {
            Intrinsics.p("productListOptions");
            throw null;
        }
        List<SortOption> listDeepCopy = SortOptionKt.deepCopy(productListOptions2.getSortList());
        ProductListOptions productListOptions3 = this.p;
        if (productListOptions3 == null) {
            Intrinsics.p("productListOptions");
            throw null;
        }
        List<SortOption> originalSortList = productListOptions3.getOriginalSortList();
        ProductListOptions productListOptions4 = this.p;
        if (productListOptions4 == null) {
            Intrinsics.p("productListOptions");
            throw null;
        }
        ProductFilterSwitch marketplaceProductsSwitch = productListOptions4.getMarketplaceProductsSwitch();
        ProductListOptions productListOptions5 = this.p;
        if (productListOptions5 == null) {
            Intrinsics.p("productListOptions");
            throw null;
        }
        int productsCount = productListOptions5.getProductsCount();
        ProductListOptions productListOptions6 = this.p;
        if (productListOptions6 != null) {
            return new ProductListOptions(arrayListA, listDeepCopy, originalSortList, productListOptions6.getSortOptionsInsetBanner(), marketplaceProductsSwitch, productsCount);
        }
        Intrinsics.p("productListOptions");
        throw null;
    }

    public final TrackingMetadata r6() {
        String strN;
        TrackingMetadata trackingMetadataU6 = u6();
        trackingMetadataU6.b(TrackableValue.o0, "See Filter Results");
        ProductsDisplayMode productsDisplayModeX6 = x6();
        if (productsDisplayModeX6 != null) {
            trackingMetadataU6.b(TrackableValue.Y1, ProductsDisplayModeKt.a(productsDisplayModeX6));
        }
        ProductListInteractor productListInteractor = this.f;
        String strA = productListInteractor.A();
        if (strA != null) {
            trackingMetadataU6.b(TrackableValue.V1, strA);
        }
        Map<String, List<String>> appliedFilters = productListInteractor.p.getAppliedFilters();
        if (appliedFilters.isEmpty()) {
            strN = null;
        } else {
            StringBuilder sb = new StringBuilder();
            for (Map.Entry<String, List<String>> entry : appliedFilters.entrySet()) {
                String key = entry.getKey();
                sb.append(CollectionsKt.M(entry.getValue(), ", ", YU.a.g(key, ": "), " | ", null, 56));
            }
            String string = sb.toString();
            Intrinsics.g(string, "toString(...)");
            strN = StringsKt.N(string, " | ");
        }
        if (strN != null) {
            trackingMetadataU6.b(TrackableValue.T1, strN);
        }
        return trackingMetadataU6;
    }

    @Override // au.com.woolworths.feature.product.list.ui.FilterCardClickListener
    public final void s() {
        SharedPreferences sharedPreferences = this.f.f5251a.b;
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putInt("filter_card_count", sharedPreferences.getInt("filter_card_count", 0) + 3);
        editorEdit.apply();
        H6();
    }

    public final Object s6(Continuation continuation) {
        ProductListInteractor productListInteractor = this.f;
        Map<String, List<String>> appliedFilters = productListInteractor.p.getAppliedFilters();
        Activities.ProductList.ExtraProductListSource extraProductListSourceV6 = v6();
        if (extraProductListSourceV6 instanceof Activities.ProductList.ExtrasBySearch) {
            Activities.ProductList.Extras extras = this.o;
            if (extras == null) {
                Intrinsics.p("pageExtras");
                throw null;
            }
            Activities.ProductList.ExtrasBySearch extrasBySearch = (Activities.ProductList.ExtrasBySearch) extraProductListSourceV6;
            return this.f.d(extras, extrasBySearch.getD(), extrasBySearch.e, A6(), (ContinuationImpl) continuation);
        }
        if (extraProductListSourceV6 instanceof Activities.ProductList.ExtrasByCategory) {
            Activities.ProductList.Extras extras2 = this.o;
            if (extras2 != null) {
                return productListInteractor.c(extras2, ((Activities.ProductList.ExtrasByCategory) extraProductListSourceV6).d, A6(), (ContinuationImpl) continuation);
            }
            Intrinsics.p("pageExtras");
            throw null;
        }
        if (extraProductListSourceV6 instanceof Activities.ProductList.ExtrasBySpecialsCategory) {
            Activities.ProductList.Extras extras3 = this.o;
            if (extras3 != null) {
                return productListInteractor.f(extras3, ((Activities.ProductList.ExtrasBySpecialsCategory) extraProductListSourceV6).d, A6(), (ContinuationImpl) continuation);
            }
            Intrinsics.p("pageExtras");
            throw null;
        }
        if (extraProductListSourceV6 instanceof Activities.ProductList.ExtrasByFacet) {
            Activities.ProductList.ExtrasByFacet extrasByFacet = (Activities.ProductList.ExtrasByFacet) extraProductListSourceV6;
            return productListInteractor.f5251a.d(extrasByFacet.d, extrasByFacet.e, extrasByFacet.f, extrasByFacet.g, extrasByFacet.h, productListInteractor.A(), appliedFilters, null, (ContinuationImpl) continuation);
        }
        if (extraProductListSourceV6 instanceof Activities.ProductList.ExtrasBySearchAlternative) {
            Activities.ProductList.Extras extras4 = this.o;
            if (extras4 != null) {
                Activities.ProductList.ExtrasBySearchAlternative extrasBySearchAlternative = (Activities.ProductList.ExtrasBySearchAlternative) extraProductListSourceV6;
                return productListInteractor.e(extras4, extrasBySearchAlternative.d, extrasBySearchAlternative.e, (ContinuationImpl) continuation);
            }
            Intrinsics.p("pageExtras");
            throw null;
        }
        if (extraProductListSourceV6 instanceof Activities.ProductList.ExtrasByProductGroup) {
            Activities.ProductList.Extras extras5 = this.o;
            if (extras5 == null) {
                Intrinsics.p("pageExtras");
                throw null;
            }
            Activities.ProductList.ExtrasByProductGroup extrasByProductGroup = (Activities.ProductList.ExtrasByProductGroup) extraProductListSourceV6;
            return this.f.b(extras5, extrasByProductGroup.d, extrasByProductGroup.e, A6(), extrasByProductGroup.f, (ContinuationImpl) continuation);
        }
        if ((extraProductListSourceV6 instanceof Activities.ProductList.ExtrasByBoostedOffers) || Intrinsics.c(extraProductListSourceV6, Activities.ProductList.ExtrasByHaveYouForgotten.d) || (extraProductListSourceV6 instanceof Activities.ProductList.ExtrasByPastShop) || (extraProductListSourceV6 instanceof Activities.ProductList.ExtrasByPriceFamily) || (extraProductListSourceV6 instanceof Activities.ProductList.ExtrasByProductIds) || (extraProductListSourceV6 instanceof Activities.ProductList.ExtrasByRecipe) || (extraProductListSourceV6 instanceof Activities.ProductList.ExtrasBySuggestedLists)) {
            throw new IllegalStateException(androidx.constraintlayout.core.state.a.e(extraProductListSourceV6.getClass(), "Product list of type ", " is unsupported"));
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ba, code lost:
    
        if (t6(r0, r3) == r4) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00bf A[Catch: ServerErrorException -> 0x0033, NoConnectivityException -> 0x0036, all -> 0x00bd, TryCatch #3 {NoConnectivityException -> 0x0036, ServerErrorException -> 0x0033, blocks: (B:12:0x002e, B:51:0x00c2, B:21:0x0043, B:29:0x007b, B:31:0x0083, B:32:0x0095, B:34:0x009b, B:39:0x00a5, B:41:0x00ab, B:45:0x00b1, B:50:0x00bf, B:24:0x004f, B:26:0x006e), top: B:68:0x0028, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object t6(au.com.woolworths.android.onesite.navigation.Activities.ProductList.ExtraProductListSource r22, kotlin.coroutines.jvm.internal.ContinuationImpl r23) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.product.list.ProductListOptionsViewModel.t6(au.com.woolworths.android.onesite.navigation.Activities$ProductList$ExtraProductListSource, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final TrackingMetadata u6() {
        TrackingMetadata trackingMetadataA = TrackingMetadata.Companion.a(TrackableValue.X1, v6().getE().d);
        List list = (List) this.q.getValue();
        if (list != null && (!list.isEmpty())) {
            trackingMetadataA.b(TrackableValue.S1, CollectionsKt.M(list, ", ", null, null, new au.com.woolworths.design.core.ui.component.stable.corerow.c(28), 30));
        }
        return trackingMetadataA;
    }

    public final Activities.ProductList.ExtraProductListSource v6() {
        Activities.ProductList.Extras extras = this.o;
        if (extras != null) {
            return extras.e;
        }
        Intrinsics.p("pageExtras");
        throw null;
    }

    public final ProductListOptionsItem.SortOptionsSection w6() {
        List<SortOption> sortList;
        ProductListOptions productListOptions = this.p;
        ProductListOptionsSortOptionItem.SortOptionsToggleItem sortOptionsToggleItem = null;
        if (productListOptions == null) {
            Intrinsics.p("productListOptions");
            throw null;
        }
        int size = productListOptions.getSortList().size();
        MutableStateFlow mutableStateFlow = this.i;
        if (size <= 8 || ((ProductListOptionsContract.ViewState) mutableStateFlow.getValue()).b != SortOptionsDisplayMode.e) {
            ProductListOptions productListOptions2 = this.p;
            if (productListOptions2 == null) {
                Intrinsics.p("productListOptions");
                throw null;
            }
            sortList = productListOptions2.getSortList();
        } else {
            ProductListOptions productListOptions3 = this.p;
            if (productListOptions3 == null) {
                Intrinsics.p("productListOptions");
                throw null;
            }
            sortList = productListOptions3.getSortList().subList(0, 7);
        }
        List<SortOption> list = sortList;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new ProductListOptionsSortOptionItem.SortOptionItem((SortOption) it.next()));
        }
        ArrayList arrayListJ0 = CollectionsKt.J0(arrayList);
        ProductListOptions productListOptions4 = this.p;
        if (productListOptions4 == null) {
            Intrinsics.p("productListOptions");
            throw null;
        }
        if (productListOptions4.getSortList().size() <= 8 || ((ProductListOptionsContract.ViewState) mutableStateFlow.getValue()).b != SortOptionsDisplayMode.d) {
            ProductListOptions productListOptions5 = this.p;
            if (productListOptions5 == null) {
                Intrinsics.p("productListOptions");
                throw null;
            }
            if (productListOptions5.getSortList().size() > 8 && ((ProductListOptionsContract.ViewState) mutableStateFlow.getValue()).b == SortOptionsDisplayMode.e) {
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

    public final ProductsDisplayMode x6() {
        List list = ((ProductListOptionsContract.ViewState) this.j.getValue()).e;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof ProductListOptionsItem.DisplayMode) {
                arrayList.add(obj);
            }
        }
        ProductListOptionsItem.DisplayMode displayMode = (ProductListOptionsItem.DisplayMode) CollectionsKt.F(arrayList);
        if (displayMode != null) {
            return displayMode.f5391a;
        }
        return null;
    }

    public final void y6(ProductListData productListData) {
        Activities.ProductList.ExtraProductListSource extraProductListSourceV6 = v6();
        Map<String, List<String>> appliedFilters = this.f.p.getAppliedFilters();
        if (extraProductListSourceV6 instanceof Activities.ProductList.ExtrasBySearch) {
            BuildersKt.c(ViewModelKt.a(this), null, null, new ProductListOptionsViewModel$initProductListPagination$1(this, (Activities.ProductList.ExtrasBySearch) extraProductListSourceV6, productListData, null), 3);
            return;
        }
        if (extraProductListSourceV6 instanceof Activities.ProductList.ExtrasByCategory) {
            BuildersKt.c(ViewModelKt.a(this), null, null, new ProductListOptionsViewModel$initProductListPagination$2(this, (Activities.ProductList.ExtrasByCategory) extraProductListSourceV6, productListData, null), 3);
            return;
        }
        if (extraProductListSourceV6 instanceof Activities.ProductList.ExtrasBySpecialsCategory) {
            BuildersKt.c(ViewModelKt.a(this), null, null, new ProductListOptionsViewModel$initProductListPagination$3(this, (Activities.ProductList.ExtrasBySpecialsCategory) extraProductListSourceV6, productListData, appliedFilters, null), 3);
            return;
        }
        if (extraProductListSourceV6 instanceof Activities.ProductList.ExtrasByBoostedOffers) {
            BuildersKt.c(ViewModelKt.a(this), null, null, new ProductListOptionsViewModel$initProductListPagination$4(this, (Activities.ProductList.ExtrasByBoostedOffers) extraProductListSourceV6, null), 3);
            return;
        }
        if (extraProductListSourceV6 instanceof Activities.ProductList.ExtrasByFacet) {
            BuildersKt.c(ViewModelKt.a(this), null, null, new ProductListOptionsViewModel$initProductListPagination$5(this, (Activities.ProductList.ExtrasByFacet) extraProductListSourceV6, appliedFilters, productListData, null), 3);
            return;
        }
        if (extraProductListSourceV6 instanceof Activities.ProductList.ExtrasBySearchAlternative) {
            BuildersKt.c(ViewModelKt.a(this), null, null, new ProductListOptionsViewModel$initProductListPagination$6(this, (Activities.ProductList.ExtrasBySearchAlternative) extraProductListSourceV6, productListData, null), 3);
            return;
        }
        if (extraProductListSourceV6 instanceof Activities.ProductList.ExtrasByProductGroup) {
            BuildersKt.c(ViewModelKt.a(this), null, null, new ProductListOptionsViewModel$initProductListPagination$7(this, (Activities.ProductList.ExtrasByProductGroup) extraProductListSourceV6, productListData, null), 3);
            return;
        }
        if (!Intrinsics.c(extraProductListSourceV6, Activities.ProductList.ExtrasByHaveYouForgotten.d) && !(extraProductListSourceV6 instanceof Activities.ProductList.ExtrasByPastShop) && !(extraProductListSourceV6 instanceof Activities.ProductList.ExtrasByPriceFamily) && !(extraProductListSourceV6 instanceof Activities.ProductList.ExtrasByProductIds) && !(extraProductListSourceV6 instanceof Activities.ProductList.ExtrasByRecipe) && !(extraProductListSourceV6 instanceof Activities.ProductList.ExtrasBySuggestedLists)) {
            throw new NoWhenBranchMatchedException();
        }
        this.s.e(androidx.constraintlayout.core.state.a.e(extraProductListSourceV6.getClass(), "Product list of type ", " is unsupported"), new Object[0]);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean z6() {
        /*
            r10 = this;
            au.com.woolworths.feature.product.list.ProductListInteractor r0 = r10.f
            au.com.woolworths.feature.product.list.data.FilterOptionsManager r0 = r0.p
            boolean r0 = r0.hasAppliedFilters()
            r1 = 0
            if (r0 != 0) goto Lcc
            au.com.woolworths.feature.product.list.data.ProductListOptions r0 = r10.p
            java.lang.String r2 = "productListOptions"
            r3 = 0
            if (r0 == 0) goto Lc8
            java.util.List r0 = r0.getOriginalSortList()
            int r0 = r0.size()
            au.com.woolworths.feature.product.list.data.ProductListOptions r4 = r10.p
            if (r4 == 0) goto Lc4
            java.util.List r4 = r4.getSortList()
            int r4 = r4.size()
            if (r0 != r4) goto Lcc
            au.com.woolworths.feature.product.list.data.ProductListOptions r0 = r10.p
            if (r0 == 0) goto Lc0
            java.util.List r0 = r0.getOriginalSortList()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 10
            int r5 = kotlin.collections.CollectionsKt.s(r0, r5)
            r4.<init>(r5)
            java.util.Iterator r0 = r0.iterator()
            r5 = r1
        L42:
            boolean r6 = r0.hasNext()
            r7 = 1
            if (r6 == 0) goto L7e
            java.lang.Object r6 = r0.next()
            int r8 = r5 + 1
            if (r5 < 0) goto L7a
            au.com.woolworths.feature.product.list.data.SortOption r6 = (au.com.woolworths.feature.product.list.data.SortOption) r6
            boolean r6 = r6.isApplied()
            au.com.woolworths.feature.product.list.data.ProductListOptions r9 = r10.p
            if (r9 == 0) goto L76
            java.util.List r9 = r9.getSortList()
            java.lang.Object r5 = r9.get(r5)
            au.com.woolworths.feature.product.list.data.SortOption r5 = (au.com.woolworths.feature.product.list.data.SortOption) r5
            boolean r5 = r5.isApplied()
            if (r6 != r5) goto L6c
            goto L6d
        L6c:
            r7 = r1
        L6d:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r7)
            r4.add(r5)
            r5 = r8
            goto L42
        L76:
            kotlin.jvm.internal.Intrinsics.p(r2)
            throw r3
        L7a:
            kotlin.collections.CollectionsKt.z0()
            throw r3
        L7e:
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L85
            goto L9c
        L85:
            java.util.Iterator r0 = r4.iterator()
        L89:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L9c
            java.lang.Object r4 = r0.next()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 != 0) goto L89
            goto Lcc
        L9c:
            au.com.woolworths.feature.product.list.data.ProductListOptions r0 = r10.p
            if (r0 == 0) goto Lbc
            au.com.woolworths.feature.product.list.data.ProductFilterSwitch r0 = r0.getMarketplaceProductsSwitch()
            if (r0 == 0) goto Lbb
            au.com.woolworths.feature.product.list.data.ProductListOptions r0 = r10.p
            if (r0 == 0) goto Lb7
            au.com.woolworths.feature.product.list.data.ProductFilterSwitch r0 = r0.getMarketplaceProductsSwitch()
            if (r0 == 0) goto Lcc
            boolean r0 = r0.getValue()
            if (r0 != r7) goto Lcc
            goto Lbb
        Lb7:
            kotlin.jvm.internal.Intrinsics.p(r2)
            throw r3
        Lbb:
            return r7
        Lbc:
            kotlin.jvm.internal.Intrinsics.p(r2)
            throw r3
        Lc0:
            kotlin.jvm.internal.Intrinsics.p(r2)
            throw r3
        Lc4:
            kotlin.jvm.internal.Intrinsics.p(r2)
            throw r3
        Lc8:
            kotlin.jvm.internal.Intrinsics.p(r2)
            throw r3
        Lcc:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.product.list.ProductListOptionsViewModel.z6():boolean");
    }
}
