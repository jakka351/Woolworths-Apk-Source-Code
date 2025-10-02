package au.com.woolworths.feature.shop.catalogue.listing.category;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.paging.PagingSource;
import androidx.paging.PagingState;
import au.com.woolworths.android.onesite.coroutineutils.DispatcherProvider;
import au.com.woolworths.android.onesite.models.TrolleyResult;
import au.com.woolworths.android.onesite.rxutils.Result;
import au.com.woolworths.base.shopapp.TrolleyInteractor;
import au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor;
import au.com.woolworths.product.productbottomsheet.ProductListFeedTrolleyUpdater;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/listing/category/CategoryListingInteractor;", "", "ListingPagingSource", "Companion", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class CategoryListingInteractor {

    /* renamed from: a, reason: collision with root package name */
    public final CategoryListingRepository f6870a;
    public final CollectionModeInteractor b;
    public final ArrayList c;
    public PagingSource d;
    public Integer e;
    public final MutableStateFlow f;
    public final MutableStateFlow g;

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lau/com/woolworths/android/onesite/rxutils/Result;", "Lau/com/woolworths/android/onesite/models/TrolleyResult;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.shop.catalogue.listing.category.CategoryListingInteractor$2", f = "CategoryListingInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.shop.catalogue.listing.category.CategoryListingInteractor$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements Function2<Result<? extends TrolleyResult>, Continuation<? super Unit>, Object> {
        public /* synthetic */ Object p;

        public AnonymousClass2(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass2 anonymousClass2 = CategoryListingInteractor.this.new AnonymousClass2(continuation);
            anonymousClass2.p = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass2 anonymousClass2 = (AnonymousClass2) create((Result) obj, (Continuation) obj2);
            Unit unit = Unit.f24250a;
            anonymousClass2.invokeSuspend(unit);
            return unit;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            ResultKt.b(obj);
            TrolleyResult trolleyResult = (TrolleyResult) ((Result) this.p).f4591a;
            CategoryListingInteractor categoryListingInteractor = CategoryListingInteractor.this;
            ArrayList arrayList = categoryListingInteractor.c;
            if (trolleyResult != null) {
                Iterator it = ProductListFeedTrolleyUpdater.b(arrayList, trolleyResult).iterator();
                int i = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    int i2 = i + 1;
                    if (i < 0) {
                        CollectionsKt.z0();
                        throw null;
                    }
                    arrayList.set(i, next);
                    i = i2;
                }
                PagingSource pagingSource = categoryListingInteractor.d;
                if (pagingSource != null) {
                    pagingSource.c();
                }
            }
            return Unit.f24250a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/listing/category/CategoryListingInteractor$Companion;", "", "", "PAGE_FETCH_SIZE", "I", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0000\n\u0000\b\u0082\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/listing/category/CategoryListingInteractor$ListingPagingSource;", "Landroidx/paging/PagingSource;", "", "", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public final class ListingPagingSource extends PagingSource<Integer, Object> {
        public final String b;
        public final /* synthetic */ CategoryListingInteractor c;

        public ListingPagingSource(CategoryListingInteractor categoryListingInteractor, String categoryId) {
            Intrinsics.h(categoryId, "categoryId");
            this.c = categoryListingInteractor;
            this.b = categoryId;
        }

        @Override // androidx.paging.PagingSource
        public final Object b(PagingState pagingState) {
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
        @Override // androidx.paging.PagingSource
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object d(androidx.paging.PagingSource.LoadParams r12, kotlin.coroutines.jvm.internal.ContinuationImpl r13) throws java.lang.Exception {
            /*
                Method dump skipped, instructions count: 227
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.catalogue.listing.category.CategoryListingInteractor.ListingPagingSource.d(androidx.paging.PagingSource$LoadParams, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
        }
    }

    public CategoryListingInteractor(CategoryListingRepository categoryListingRepository, CollectionModeInteractor collectionModeInteractor, TrolleyInteractor trolleyInteractor, DispatcherProvider dispatcherProvider) {
        Intrinsics.h(collectionModeInteractor, "collectionModeInteractor");
        Intrinsics.h(trolleyInteractor, "trolleyInteractor");
        Intrinsics.h(dispatcherProvider, "dispatcherProvider");
        this.f6870a = categoryListingRepository;
        this.b = collectionModeInteractor;
        this.c = new ArrayList();
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        ContextScope contextScopeA = CoroutineScopeKt.a(DefaultIoScheduler.f);
        this.f = StateFlowKt.a(null);
        this.g = StateFlowKt.a(null);
        final StateFlow stateFlowV = trolleyInteractor.v();
        FlowKt.E(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass2(null), new Flow<Result<? extends TrolleyResult>>() { // from class: au.com.woolworths.feature.shop.catalogue.listing.category.CategoryListingInteractor$special$$inlined$filter$1

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: au.com.woolworths.feature.shop.catalogue.listing.category.CategoryListingInteractor$special$$inlined$filter$1$2, reason: invalid class name */
            public final class AnonymousClass2<T> implements FlowCollector {
                public final /* synthetic */ FlowCollector d;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @DebugMetadata(c = "au.com.woolworths.feature.shop.catalogue.listing.category.CategoryListingInteractor$special$$inlined$filter$1$2", f = "CategoryListingInteractor.kt", l = {50}, m = "emit")
                /* renamed from: au.com.woolworths.feature.shop.catalogue.listing.category.CategoryListingInteractor$special$$inlined$filter$1$2$1, reason: invalid class name */
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
                        boolean r0 = r6 instanceof au.com.woolworths.feature.shop.catalogue.listing.category.CategoryListingInteractor$special$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        au.com.woolworths.feature.shop.catalogue.listing.category.CategoryListingInteractor$special$$inlined$filter$1$2$1 r0 = (au.com.woolworths.feature.shop.catalogue.listing.category.CategoryListingInteractor$special$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.q
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.q = r1
                        goto L18
                    L13:
                        au.com.woolworths.feature.shop.catalogue.listing.category.CategoryListingInteractor$special$$inlined$filter$1$2$1 r0 = new au.com.woolworths.feature.shop.catalogue.listing.category.CategoryListingInteractor$special$$inlined$filter$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.p
                        kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                        int r2 = r0.q
                        r3 = 1
                        if (r2 == 0) goto L2f
                        if (r2 != r3) goto L27
                        kotlin.ResultKt.b(r6)
                        goto L46
                    L27:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L2f:
                        kotlin.ResultKt.b(r6)
                        r6 = r5
                        au.com.woolworths.android.onesite.rxutils.Result r6 = (au.com.woolworths.android.onesite.rxutils.Result) r6
                        boolean r6 = r6.b()
                        if (r6 == 0) goto L46
                        r0.q = r3
                        kotlinx.coroutines.flow.FlowCollector r6 = r4.d
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L46
                        return r1
                    L46:
                        kotlin.Unit r5 = kotlin.Unit.f24250a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.catalogue.listing.category.CategoryListingInteractor$special$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = stateFlowV.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == CoroutineSingletons.d ? objCollect : Unit.f24250a;
            }
        }), contextScopeA);
    }
}
