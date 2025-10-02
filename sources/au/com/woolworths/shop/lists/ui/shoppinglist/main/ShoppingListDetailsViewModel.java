package au.com.woolworths.shop.lists.ui.shoppinglist.main;

import android.app.Application;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.analytics.supers.lists.WatchlistAnalytics;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.extensions.SharedPreferenceExtKt$boolean$$inlined$delegate$1;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.models.text.PluralResText;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.models.text.ResWithArgText;
import au.com.woolworths.android.onesite.modules.customviews.statefulbutton.StatefulButtonState;
import au.com.woolworths.android.onesite.products.models.ScanNGoCartProductInfo;
import au.com.woolworths.android.onesite.rxutils.Result;
import au.com.woolworths.base.shopapp.TrolleyInteractor;
import au.com.woolworths.foundation.shop.instore.navigation.AnalyticsManagerExtKt;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.ProductTrolleyDataKt;
import au.com.woolworths.product.offers.ProductBoostInteractor;
import au.com.woolworths.product.offers.ProductBoostResult;
import au.com.woolworths.shop.graphql.type.AlternativeProductsMode;
import au.com.woolworths.shop.graphql.type.ProductItemInput;
import au.com.woolworths.shop.lists.data.ShoppingListInteractor;
import au.com.woolworths.shop.lists.data.ShoppingListItemInteractor;
import au.com.woolworths.shop.lists.data.ShoppingListSyncInteractor;
import au.com.woolworths.shop.lists.data.WatchlistInteractor;
import au.com.woolworths.shop.lists.data.model.ShoppingList;
import au.com.woolworths.shop.lists.data.prefs.ShoppingListsRepository;
import au.com.woolworths.shop.lists.data.prefs.SortBy;
import au.com.woolworths.shop.lists.data.prefs.SortDirection;
import au.com.woolworths.shop.lists.data.utils.ListsInMemoryRepository;
import au.com.woolworths.shop.lists.ui.ListDetailsAnalyticsParams;
import au.com.woolworths.shop.lists.ui.ListScreen;
import au.com.woolworths.shop.lists.ui.details.interactor.ListDetailsInteractor;
import au.com.woolworths.shop.lists.ui.details.interactor.ListDetailsResult;
import au.com.woolworths.shop.lists.ui.details.models.ListDetailsProductAction;
import au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract;
import au.com.woolworths.shop.lists.ui.shoppinglist.models.ProductItemUiModel;
import au.com.woolworths.shop.lists.ui.shoppinglist.models.ProductMenuItem;
import au.com.woolworths.shop.lists.ui.shoppinglist.models.ShoppingListDetailsUiModel;
import au.com.woolworths.shop.lists.ui.shoppinglist.models.ShoppingListItemUiModel;
import au.com.woolworths.shop.lists.ui.shoppinglist.models.TextItemUiModel;
import au.com.woolworths.shop.lists.ui.shoppinglist.sort.SortByViewListener;
import au.com.woolworths.shop.lists.ui.shoppinglist.utils.ShoppingListsExtKt;
import au.com.woolworths.shop.lists.ui.utils.ListsUtils;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import com.medallia.digital.mobilesdk.l3;
import com.woolworths.R;
import dagger.hilt.android.lifecycle.HiltViewModel;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.KotlinNothingValueException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$IShoppingListDetailsViewModel;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/sort/SortByViewListener;", "Companion", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ShoppingListDetailsViewModel extends AndroidViewModel implements ShoppingListDetailsContract.IShoppingListDetailsViewModel, SortByViewListener {
    public final Lazy A;
    public String B;
    public final ShoppingListInteractor f;
    public final ShoppingListItemInteractor g;
    public final ShoppingListsRepository h;
    public final ShoppingListSyncInteractor i;
    public final TrolleyInteractor j;
    public final ProductBoostInteractor k;
    public final ListsInMemoryRepository l;
    public final ListsUtils m;
    public final BoostExt n;
    public final ProductItemState o;
    public final ListDetailsInteractor p;
    public final AnalyticsManager q;
    public final WatchlistInteractor r;
    public final FeatureToggleManager s;
    public String t;
    public boolean u;
    public boolean v;
    public final MutableStateFlow w;
    public final SharedFlowImpl x;
    public final StateFlow y;
    public final Flow z;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsViewModel$1", f = "ShoppingListDetailsViewModel.kt", l = {146}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsViewModel$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        public AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return ShoppingListDetailsViewModel.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
            return CoroutineSingletons.d;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            if (i == 0) {
                ResultKt.b(obj);
                final ShoppingListDetailsViewModel shoppingListDetailsViewModel = ShoppingListDetailsViewModel.this;
                StateFlow p = shoppingListDetailsViewModel.j.getP();
                FlowCollector flowCollector = new FlowCollector() { // from class: au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsViewModel.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(Object obj2, Continuation continuation) {
                        ShoppingListDetailsViewModel shoppingListDetailsViewModel2 = shoppingListDetailsViewModel;
                        ShoppingListDetailsViewModel.y6(shoppingListDetailsViewModel2, shoppingListDetailsViewModel2.w, (Result) obj2, null, null, false, false, false, null, null, null, null, null, null, 4094);
                        return Unit.f24250a;
                    }
                };
                this.p = 1;
                if (p.collect(flowCollector, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsViewModel$2", f = "ShoppingListDetailsViewModel.kt", l = {154}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsViewModel$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        public AnonymousClass2(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return ShoppingListDetailsViewModel.this.new AnonymousClass2(continuation);
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
                final ShoppingListDetailsViewModel shoppingListDetailsViewModel = ShoppingListDetailsViewModel.this;
                final SharedFlowImpl b = shoppingListDetailsViewModel.p.getB();
                Flow<ListDetailsResult> flow = new Flow<ListDetailsResult>() { // from class: au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsViewModel$2$invokeSuspend$$inlined$filter$1

                    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                    @SourceDebugExtension
                    /* renamed from: au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsViewModel$2$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                    public final class AnonymousClass2<T> implements FlowCollector {
                        public final /* synthetic */ FlowCollector d;
                        public final /* synthetic */ ShoppingListDetailsViewModel e;

                        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                        @DebugMetadata(c = "au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsViewModel$2$invokeSuspend$$inlined$filter$1$2", f = "ShoppingListDetailsViewModel.kt", l = {50}, m = "emit")
                        /* renamed from: au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsViewModel$2$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
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

                        public AnonymousClass2(FlowCollector flowCollector, ShoppingListDetailsViewModel shoppingListDetailsViewModel) {
                            this.d = flowCollector;
                            this.e = shoppingListDetailsViewModel;
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
                                boolean r0 = r6 instanceof au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsViewModel$2$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                                if (r0 == 0) goto L13
                                r0 = r6
                                au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsViewModel$2$invokeSuspend$$inlined$filter$1$2$1 r0 = (au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsViewModel$2$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                                int r1 = r0.q
                                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                r3 = r1 & r2
                                if (r3 == 0) goto L13
                                int r1 = r1 - r2
                                r0.q = r1
                                goto L18
                            L13:
                                au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsViewModel$2$invokeSuspend$$inlined$filter$1$2$1 r0 = new au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsViewModel$2$invokeSuspend$$inlined$filter$1$2$1
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
                                au.com.woolworths.shop.lists.ui.details.interactor.ListDetailsResult r6 = (au.com.woolworths.shop.lists.ui.details.interactor.ListDetailsResult) r6
                                au.com.woolworths.shop.lists.ui.details.interactor.ListDetailsInput r6 = r6.f12305a
                                java.lang.String r6 = r6.f12302a
                                au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsViewModel r2 = r4.e
                                au.com.woolworths.shop.lists.data.utils.ListsInMemoryRepository r2 = r2.l
                                java.lang.String r2 = r2.d()
                                boolean r6 = kotlin.jvm.internal.Intrinsics.c(r6, r2)
                                if (r6 == 0) goto L52
                                r0.q = r3
                                kotlinx.coroutines.flow.FlowCollector r6 = r4.d
                                java.lang.Object r5 = r6.emit(r5, r0)
                                if (r5 != r1) goto L52
                                return r1
                            L52:
                                kotlin.Unit r5 = kotlin.Unit.f24250a
                                return r5
                            */
                            throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsViewModel$2$invokeSuspend$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                        }
                    }

                    @Override // kotlinx.coroutines.flow.Flow
                    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                        Object objCollect = b.collect(new AnonymousClass2(flowCollector, shoppingListDetailsViewModel), continuation);
                        return objCollect == CoroutineSingletons.d ? objCollect : Unit.f24250a;
                    }
                };
                FlowCollector flowCollector = new FlowCollector() { // from class: au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsViewModel.2.2
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(Object obj2, Continuation continuation) {
                        ShoppingListDetailsViewModel shoppingListDetailsViewModel2 = shoppingListDetailsViewModel;
                        ShoppingListDetailsViewModel.y6(shoppingListDetailsViewModel2, shoppingListDetailsViewModel2.w, null, null, null, false, false, false, null, null, null, null, (ListDetailsResult) obj2, null, 3071);
                        return Unit.f24250a;
                    }
                };
                this.p = 1;
                if (flow.collect(flowCollector, this) == coroutineSingletons) {
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

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsViewModel$3", f = "ShoppingListDetailsViewModel.kt", l = {171}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsViewModel$3, reason: invalid class name */
    final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", lqlqqlq.m006Dm006Dm006Dm, "Lau/com/woolworths/product/offers/ProductBoostResult;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsViewModel$3$1", f = "ShoppingListDetailsViewModel.kt", l = {}, m = "invokeSuspend")
        /* renamed from: au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsViewModel$3$1, reason: invalid class name */
        final class AnonymousClass1 extends SuspendLambda implements Function2<ProductBoostResult, Continuation<? super Unit>, Object> {
            public /* synthetic */ Object p;
            public final /* synthetic */ ShoppingListDetailsViewModel q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(ShoppingListDetailsViewModel shoppingListDetailsViewModel, Continuation continuation) {
                super(2, continuation);
                this.q = shoppingListDetailsViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.q, continuation);
                anonymousClass1.p = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((ProductBoostResult) obj, (Continuation) obj2);
                Unit unit = Unit.f24250a;
                anonymousClass1.invokeSuspend(unit);
                return unit;
            }

            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, java.util.List] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                ResultKt.b(obj);
                ProductBoostResult productBoostResult = (ProductBoostResult) this.p;
                if (productBoostResult instanceof ProductBoostResult.Success) {
                    ProductBoostResult.Success success = (ProductBoostResult.Success) productBoostResult;
                    if (success.d) {
                        ShoppingListDetailsViewModel shoppingListDetailsViewModel = this.q;
                        ShoppingListDetailsViewModel.y6(shoppingListDetailsViewModel, shoppingListDetailsViewModel.w, null, null, null, false, false, false, success.c, Boolean.TRUE, null, null, null, null, 3903);
                    }
                }
                return Unit.f24250a;
            }
        }

        public AnonymousClass3(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return ShoppingListDetailsViewModel.this.new AnonymousClass3(continuation);
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
                ShoppingListDetailsViewModel shoppingListDetailsViewModel = ShoppingListDetailsViewModel.this;
                FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass1(shoppingListDetailsViewModel, null), shoppingListDetailsViewModel.k.d);
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

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsViewModel$4", f = "ShoppingListDetailsViewModel.kt", l = {177}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsViewModel$4, reason: invalid class name */
    final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        public AnonymousClass4(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return ShoppingListDetailsViewModel.this.new AnonymousClass4(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass4) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            if (i == 0) {
                ResultKt.b(obj);
                final ShoppingListDetailsViewModel shoppingListDetailsViewModel = ShoppingListDetailsViewModel.this;
                final Flow flow = shoppingListDetailsViewModel.f.b;
                Flow flowR = FlowKt.r(new Flow<Integer>() { // from class: au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsViewModel$4$invokeSuspend$$inlined$map$1

                    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                    @SourceDebugExtension
                    /* renamed from: au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsViewModel$4$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                    public final class AnonymousClass2<T> implements FlowCollector {
                        public final /* synthetic */ FlowCollector d;

                        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                        @DebugMetadata(c = "au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsViewModel$4$invokeSuspend$$inlined$map$1$2", f = "ShoppingListDetailsViewModel.kt", l = {50}, m = "emit")
                        /* renamed from: au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsViewModel$4$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                boolean r0 = r6 instanceof au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsViewModel$4$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1
                                if (r0 == 0) goto L13
                                r0 = r6
                                au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsViewModel$4$invokeSuspend$$inlined$map$1$2$1 r0 = (au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsViewModel$4$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                                int r1 = r0.q
                                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                r3 = r1 & r2
                                if (r3 == 0) goto L13
                                int r1 = r1 - r2
                                r0.q = r1
                                goto L18
                            L13:
                                au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsViewModel$4$invokeSuspend$$inlined$map$1$2$1 r0 = new au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsViewModel$4$invokeSuspend$$inlined$map$1$2$1
                                r0.<init>(r6)
                            L18:
                                java.lang.Object r6 = r0.p
                                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                                int r2 = r0.q
                                r3 = 1
                                if (r2 == 0) goto L2f
                                if (r2 != r3) goto L27
                                kotlin.ResultKt.b(r6)
                                goto L48
                            L27:
                                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                                r5.<init>(r6)
                                throw r5
                            L2f:
                                kotlin.ResultKt.b(r6)
                                java.util.List r5 = (java.util.List) r5
                                int r5 = r5.size()
                                java.lang.Integer r6 = new java.lang.Integer
                                r6.<init>(r5)
                                r0.q = r3
                                kotlinx.coroutines.flow.FlowCollector r5 = r4.d
                                java.lang.Object r5 = r5.emit(r6, r0)
                                if (r5 != r1) goto L48
                                return r1
                            L48:
                                kotlin.Unit r5 = kotlin.Unit.f24250a
                                return r5
                            */
                            throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsViewModel$4$invokeSuspend$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                        }
                    }

                    @Override // kotlinx.coroutines.flow.Flow
                    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                        Object objCollect = flow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == CoroutineSingletons.d ? objCollect : Unit.f24250a;
                    }
                });
                FlowCollector flowCollector = new FlowCollector() { // from class: au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsViewModel.4.2
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(Object obj2, Continuation continuation) {
                        int iIntValue = ((Number) obj2).intValue();
                        ShoppingListDetailsViewModel shoppingListDetailsViewModel2 = shoppingListDetailsViewModel;
                        ShoppingListDetailsViewModel.y6(shoppingListDetailsViewModel2, shoppingListDetailsViewModel2.w, null, null, null, false, false, iIntValue > 1, null, null, null, null, null, null, 4063);
                        return Unit.f24250a;
                    }
                };
                this.p = 1;
                if (flowR.collect(flowCollector, this) == coroutineSingletons) {
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

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\b\n\u0010\u0007¨\u0006\u000b"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsViewModel$Companion;", "", "", "BOOST_ALL_REQUEST_TAG", "Ljava/lang/String;", "", "BOOSTING_ANIM_DURATION_MS", "J", "WATCHLIST_PRODUCT_SOURCE", "TEXT_SHIMMER_DURATION", "TEXT_FADE_DURATION", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingListDetailsViewModel(Application application, ShoppingListInteractor shoppingListInteractor, ShoppingListItemInteractor shoppingListItemInteractor, ShoppingListsRepository shoppingListsRepository, ShoppingListSyncInteractor shoppingListSyncInteractor, TrolleyInteractor trolleyInteractor, ProductBoostInteractor productBoostInteractor, ListsInMemoryRepository listsInMemoryRepository, ListsUtils listsUtils, BoostExt boostExt, ProductItemState productItemState, ListDetailsInteractor listDetailsInteractor, AnalyticsManager analyticsManager, WatchlistInteractor watchlistInteractor, FeatureToggleManager featureToggleManager) {
        super(application);
        Intrinsics.h(shoppingListInteractor, "shoppingListInteractor");
        Intrinsics.h(shoppingListItemInteractor, "shoppingListItemInteractor");
        Intrinsics.h(shoppingListsRepository, "shoppingListsRepository");
        Intrinsics.h(shoppingListSyncInteractor, "shoppingListSyncInteractor");
        Intrinsics.h(trolleyInteractor, "trolleyInteractor");
        Intrinsics.h(productBoostInteractor, "productBoostInteractor");
        Intrinsics.h(listsInMemoryRepository, "listsInMemoryRepository");
        Intrinsics.h(listsUtils, "listsUtils");
        Intrinsics.h(productItemState, "productItemState");
        Intrinsics.h(listDetailsInteractor, "listDetailsInteractor");
        Intrinsics.h(analyticsManager, "analyticsManager");
        Intrinsics.h(watchlistInteractor, "watchlistInteractor");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        this.f = shoppingListInteractor;
        this.g = shoppingListItemInteractor;
        this.h = shoppingListsRepository;
        this.i = shoppingListSyncInteractor;
        this.j = trolleyInteractor;
        this.k = productBoostInteractor;
        this.l = listsInMemoryRepository;
        this.m = listsUtils;
        this.n = boostExt;
        this.o = productItemState;
        this.p = listDetailsInteractor;
        this.q = analyticsManager;
        this.r = watchlistInteractor;
        this.s = featureToggleManager;
        BoostAllBannerState boostAllBannerState = BoostAllBannerState.f;
        ResText resText = new ResText(R.string.shop_lists_scan_an_item);
        EmptyList emptyList = EmptyList.d;
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(new ShoppingListDetailsContract.ViewState(null, null, null, false, false, false, emptyList, boostAllBannerState, resText, false, emptyList));
        this.w = mutableStateFlowA;
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(0, 1, BufferOverflow.e, 1);
        this.x = sharedFlowImplB;
        this.y = mutableStateFlowA;
        this.z = FlowKt.a(sharedFlowImplB);
        this.A = LazyKt.b(new au.com.woolworths.shop.cart.ui.c(this, 24));
        this.B = "";
        BuildersKt.c(ViewModelKt.a(this), null, null, new AnonymousClass1(null), 3);
        BuildersKt.c(ViewModelKt.a(this), null, null, new AnonymousClass2(null), 3);
        BuildersKt.c(ViewModelKt.a(this), null, null, new AnonymousClass3(null), 3);
        BuildersKt.c(ViewModelKt.a(this), null, null, new AnonymousClass4(null), 3);
    }

    public static final Object q6(ShoppingListDetailsViewModel shoppingListDetailsViewModel, List list, SuspendLambda suspendLambda) {
        List<ProductItemUiModel> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(list2, 10));
        for (ProductItemUiModel productItemUiModelA : list2) {
            if (shoppingListDetailsViewModel.H5()) {
                ProductCard productCard = productItemUiModelA.i;
                productItemUiModelA = ProductItemUiModel.a(productItemUiModelA, false, productCard != null ? productCard.copy(((-33554433) & 1) != 0 ? productCard.productId : null, ((-33554433) & 2) != 0 ? productCard.name : null, ((-33554433) & 4) != 0 ? productCard.productImage : null, ((-33554433) & 8) != 0 ? productCard.badgeImage : null, ((-33554433) & 16) != 0 ? productCard.price : null, ((-33554433) & 32) != 0 ? productCard.unitOfMeasureLabel : null, ((-33554433) & 64) != 0 ? productCard.promotionValue : null, ((-33554433) & 128) != 0 ? productCard.promotionType : null, ((-33554433) & 256) != 0 ? productCard.unitPriceDescription : null, ((-33554433) & 512) != 0 ? productCard.isAvailable : false, ((-33554433) & 1024) != 0 ? productCard.isNew : false, ((-33554433) & 2048) != 0 ? productCard.wasPrice : null, ((-33554433) & 4096) != 0 ? productCard.multiBuyPrice : null, ((-33554433) & 8192) != 0 ? productCard.multiBuyUnitPrice : null, ((-33554433) & 16384) != 0 ? productCard.purchaseWarning : null, ((-33554433) & 32768) != 0 ? productCard.trolley : null, ((-33554433) & 65536) != 0 ? productCard.trolleys : null, ((-33554433) & 131072) != 0 ? productCard.productShoppingList : null, ((-33554433) & 262144) != 0 ? productCard.inStoreDetails : null, ((-33554433) & 524288) != 0 ? productCard.purchaseRestriction : null, ((-33554433) & 1048576) != 0 ? productCard.inlineLabels : null, ((-33554433) & 2097152) != 0 ? productCard.promotionInfo : null, ((-33554433) & 4194304) != 0 ? productCard.adId : null, ((-33554433) & 8388608) != 0 ? productCard.source : "watchlist", ((-33554433) & 16777216) != 0 ? productCard.marketplace : null, ((-33554433) & 33554432) != 0 ? productCard.rewardsOfferInfo : null, ((-33554433) & 67108864) != 0 ? productCard.disclaimer : null, ((-33554433) & 134217728) != 0 ? productCard.tagLabel : null, ((-33554433) & 268435456) != 0 ? productCard.inStoreAvailabilityInfo : null, ((-33554433) & 536870912) != 0 ? productCard.productVarieties : null, ((-33554433) & 1073741824) != 0 ? productCard.categories : null, ((-33554433) & Integer.MIN_VALUE) != 0 ? productCard.isTobacco : false, (255 & 1) != 0 ? productCard.multiBuyPriceInfo : null, (255 & 2) != 0 ? productCard.memberPriceInfo : null, (255 & 4) != 0 ? productCard.cartProductInfo : null, (255 & 8) != 0 ? productCard.inStoreLocation : null, (255 & 16) != 0 ? productCard.productCardAnalytics : null, (255 & 32) != 0 ? productCard.impressionAnalyticsData : null, (255 & 64) != 0 ? productCard.productCardAction : null, (255 & 128) != 0 ? productCard.pricingFootnoteMd : null) : null, false, false, false, false, false, null, null, 65279);
            }
            arrayList.add(productItemUiModelA);
        }
        Object objV6 = shoppingListDetailsViewModel.v6(arrayList, suspendLambda);
        return objV6 == CoroutineSingletons.d ? objV6 : Unit.f24250a;
    }

    public static final void r6(ShoppingListDetailsViewModel shoppingListDetailsViewModel, List list) {
        SharedFlowImpl sharedFlowImpl = shoppingListDetailsViewModel.x;
        ListsInMemoryRepository listsInMemoryRepository = shoppingListDetailsViewModel.l;
        if (listsInMemoryRepository.f() && listsInMemoryRepository.e.h) {
            List<ScanNGoCartProductInfo> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.s(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((ScanNGoCartProductInfo) it.next()).e);
            }
            ShoppingListDetailsContract.ListState listState = ((ShoppingListDetailsContract.ViewState) shoppingListDetailsViewModel.y.getValue()).c;
            if (listState != null) {
                int i = 0;
                for (ProductItemUiModel productItemUiModel : listState.b) {
                    String value = productItemUiModel.g.getValue();
                    if (arrayList.contains(value)) {
                        for (ScanNGoCartProductInfo scanNGoCartProductInfo : list2) {
                            if (Intrinsics.c(scanNGoCartProductInfo.e, value)) {
                                int i2 = scanNGoCartProductInfo.d;
                                if (i2 == 0 || i2 >= productItemUiModel.h) {
                                    shoppingListDetailsViewModel.z6(productItemUiModel, true, false);
                                    i++;
                                }
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                }
                if (i > 0) {
                    sharedFlowImpl.f(new ShoppingListDetailsContract.Actions.ShowCheckProductItemsSnackbar(new PluralResText(R.plurals.shop_lists_product_moved_to_checked_list, i), null, new au.com.woolworths.android.onesite.deeplink.h(20), i));
                    ShoppingListsRepository shoppingListsRepository = shoppingListDetailsViewModel.h;
                    if (listsInMemoryRepository.e()) {
                        SharedPreferenceExtKt$boolean$$inlined$delegate$1 sharedPreferenceExtKt$boolean$$inlined$delegate$1 = shoppingListsRepository.g;
                        KProperty[] kPropertyArr = ShoppingListsRepository.j;
                        if (((Boolean) sharedPreferenceExtKt$boolean$$inlined$delegate$1.getValue(shoppingListsRepository, kPropertyArr[5])).booleanValue()) {
                            return;
                        }
                        shoppingListsRepository.g.setValue(shoppingListsRepository, kPropertyArr[5], Boolean.TRUE);
                        sharedFlowImpl.f(new ShoppingListDetailsContract.Actions.ShowSngCheckOffDialog(new ResText(R.string.shop_lists_check_off_dialog_title), new ResText(R.string.shop_lists_check_off_dialog_message)));
                    }
                }
            }
        }
    }

    public static final void s6(ShoppingListDetailsViewModel shoppingListDetailsViewModel) {
        String title;
        ShoppingList shoppingList;
        ShoppingListDetailsUiModel shoppingListDetailsUiModel = ((ShoppingListDetailsContract.ViewState) shoppingListDetailsViewModel.y.getValue()).f12428a;
        if (shoppingListDetailsUiModel == null || (shoppingList = shoppingListDetailsUiModel.f12434a) == null || (title = shoppingList.getTitle()) == null) {
            title = "List";
        }
        shoppingListDetailsViewModel.x.f(new ShoppingListDetailsContract.Actions.CloseScreen(new ResWithArgText(R.string.shop_lists_list_removed, title), true));
    }

    public static final void t6(ShoppingListDetailsViewModel shoppingListDetailsViewModel) {
        if (((ShoppingListDetailsContract.ViewState) shoppingListDetailsViewModel.y.getValue()).k.isEmpty()) {
            return;
        }
        BuildersKt.c(ViewModelKt.a(shoppingListDetailsViewModel), null, null, new ShoppingListDetailsViewModel$resetUpdatedItemIds$1(shoppingListDetailsViewModel, null), 3);
    }

    public static final void u6(ShoppingListDetailsViewModel shoppingListDetailsViewModel) {
        SharedFlowImpl sharedFlowImpl = shoppingListDetailsViewModel.x;
        ShoppingListsRepository shoppingListsRepository = shoppingListDetailsViewModel.h;
        ShoppingListDetailsContract.ListState listState = ((ShoppingListDetailsContract.ViewState) shoppingListDetailsViewModel.y.getValue()).c;
        if (listState == null || listState.b.isEmpty()) {
            return;
        }
        if (shoppingListDetailsViewModel.H5()) {
            SharedPreferenceExtKt$boolean$$inlined$delegate$1 sharedPreferenceExtKt$boolean$$inlined$delegate$1 = shoppingListsRepository.e;
            KProperty[] kPropertyArr = ShoppingListsRepository.j;
            if (((Boolean) sharedPreferenceExtKt$boolean$$inlined$delegate$1.getValue(shoppingListsRepository, kPropertyArr[3])).booleanValue()) {
                return;
            }
            shoppingListsRepository.e.setValue(shoppingListsRepository, kPropertyArr[3], Boolean.TRUE);
            sharedFlowImpl.f(new ShoppingListDetailsContract.Actions.DisplayProductCoachMark(new ResText(R.string.shop_lists_product_hint_header), new ResText(R.string.shop_watchlist_product_hint_body), new ResText(R.string.shop_lists_hint_gotit)));
            return;
        }
        SharedPreferenceExtKt$boolean$$inlined$delegate$1 sharedPreferenceExtKt$boolean$$inlined$delegate$12 = shoppingListsRepository.d;
        SharedPreferenceExtKt$boolean$$inlined$delegate$1 sharedPreferenceExtKt$boolean$$inlined$delegate$13 = shoppingListsRepository.f;
        KProperty[] kPropertyArr2 = ShoppingListsRepository.j;
        if (((Boolean) sharedPreferenceExtKt$boolean$$inlined$delegate$12.getValue(shoppingListsRepository, kPropertyArr2[2])).booleanValue()) {
            if (((Boolean) sharedPreferenceExtKt$boolean$$inlined$delegate$13.getValue(shoppingListsRepository, kPropertyArr2[4])).booleanValue()) {
                return;
            }
            sharedPreferenceExtKt$boolean$$inlined$delegate$13.setValue(shoppingListsRepository, kPropertyArr2[4], Boolean.TRUE);
            sharedFlowImpl.f(new ShoppingListDetailsContract.Actions.DisplaySortByCoachMark(new ResText(R.string.shop_lists_sort_by_category_hint_header), new ResText(R.string.shop_lists_sort_by_category_hint_body), new ResText(R.string.shop_lists_hint_gotit)));
            return;
        }
        SharedPreferenceExtKt$boolean$$inlined$delegate$1 sharedPreferenceExtKt$boolean$$inlined$delegate$14 = shoppingListsRepository.d;
        KProperty kProperty = kPropertyArr2[2];
        Boolean bool = Boolean.TRUE;
        sharedPreferenceExtKt$boolean$$inlined$delegate$14.setValue(shoppingListsRepository, kProperty, bool);
        sharedPreferenceExtKt$boolean$$inlined$delegate$13.setValue(shoppingListsRepository, kPropertyArr2[4], bool);
        sharedFlowImpl.f(new ShoppingListDetailsContract.Actions.DisplayProductCoachMark(new ResText(R.string.shop_lists_product_hint_header), new ResText(R.string.shop_lists_product_hint_body), new ResText(R.string.shop_lists_hint_gotit)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v19, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r3v20, types: [java.util.ArrayList] */
    public static void y6(ShoppingListDetailsViewModel shoppingListDetailsViewModel, MutableStateFlow mutableStateFlow, Result result, ShoppingListDetailsUiModel shoppingListDetailsUiModel, TextItemUiModel textItemUiModel, boolean z, boolean z2, boolean z3, List list, Boolean bool, StatefulButtonState statefulButtonState, ResText resText, ListDetailsResult listDetailsResult, List list2, int i) {
        List list3;
        boolean z4;
        boolean z5;
        ShoppingListDetailsUiModel shoppingListDetailsUiModel2;
        ShoppingListDetailsUiModel shoppingListDetailsUiModelA;
        ShoppingListDetailsUiModel shoppingListDetailsUiModel3;
        TextItemUiModel textItemUiModel2;
        boolean z6;
        List list4;
        ShoppingListDetailsContract.ListState listState;
        BoostAllBannerState boostAllBannerStateA;
        List list5;
        ?? arrayList;
        Iterator it;
        String productId;
        ProductCard productCard;
        Result result2 = (i & 1) != 0 ? null : result;
        ShoppingListDetailsUiModel shoppingListDetailsUiModel4 = (i & 2) != 0 ? ((ShoppingListDetailsContract.ViewState) mutableStateFlow.getValue()).f12428a : shoppingListDetailsUiModel;
        TextItemUiModel textItemUiModel3 = (i & 4) != 0 ? ((ShoppingListDetailsContract.ViewState) mutableStateFlow.getValue()).b : textItemUiModel;
        boolean z7 = (i & 8) != 0 ? ((ShoppingListDetailsContract.ViewState) mutableStateFlow.getValue()).d : z;
        boolean z8 = (i & 16) != 0 ? ((ShoppingListDetailsContract.ViewState) mutableStateFlow.getValue()).e : z2;
        boolean z9 = (i & 32) != 0 ? ((ShoppingListDetailsContract.ViewState) mutableStateFlow.getValue()).f : z3;
        List list6 = (i & 64) != 0 ? ((ShoppingListDetailsContract.ViewState) mutableStateFlow.getValue()).g : list;
        Boolean bool2 = (i & 128) != 0 ? null : bool;
        StatefulButtonState statefulButtonState2 = (i & 256) != 0 ? null : statefulButtonState;
        ResText resText2 = (i & 512) != 0 ? ((ShoppingListDetailsContract.ViewState) mutableStateFlow.getValue()).i : resText;
        ListDetailsResult listDetailsResult2 = (i & 1024) != 0 ? null : listDetailsResult;
        List list7 = (i & 2048) != 0 ? ((ShoppingListDetailsContract.ViewState) mutableStateFlow.getValue()).k : list2;
        shoppingListDetailsViewModel.getClass();
        if (shoppingListDetailsUiModel4 != null) {
            List<ProductItemUiModel> list8 = shoppingListDetailsUiModel4.b;
            list3 = list7;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.s(list8, 10));
            for (ProductItemUiModel productItemUiModel : list8) {
                ProductCard productCardCopy = productItemUiModel.i;
                if (productCardCopy != null) {
                    if (productCardCopy.getTrolley() == null) {
                        productCardCopy = productCardCopy.copy(((-33554433) & 1) != 0 ? productCardCopy.productId : null, ((-33554433) & 2) != 0 ? productCardCopy.name : null, ((-33554433) & 4) != 0 ? productCardCopy.productImage : null, ((-33554433) & 8) != 0 ? productCardCopy.badgeImage : null, ((-33554433) & 16) != 0 ? productCardCopy.price : null, ((-33554433) & 32) != 0 ? productCardCopy.unitOfMeasureLabel : null, ((-33554433) & 64) != 0 ? productCardCopy.promotionValue : null, ((-33554433) & 128) != 0 ? productCardCopy.promotionType : null, ((-33554433) & 256) != 0 ? productCardCopy.unitPriceDescription : null, ((-33554433) & 512) != 0 ? productCardCopy.isAvailable : false, ((-33554433) & 1024) != 0 ? productCardCopy.isNew : false, ((-33554433) & 2048) != 0 ? productCardCopy.wasPrice : null, ((-33554433) & 4096) != 0 ? productCardCopy.multiBuyPrice : null, ((-33554433) & 8192) != 0 ? productCardCopy.multiBuyUnitPrice : null, ((-33554433) & 16384) != 0 ? productCardCopy.purchaseWarning : null, ((-33554433) & 32768) != 0 ? productCardCopy.trolley : ProductTrolleyDataKt.defaultProductTrolleyData(), ((-33554433) & 65536) != 0 ? productCardCopy.trolleys : null, ((-33554433) & 131072) != 0 ? productCardCopy.productShoppingList : null, ((-33554433) & 262144) != 0 ? productCardCopy.inStoreDetails : null, ((-33554433) & 524288) != 0 ? productCardCopy.purchaseRestriction : null, ((-33554433) & 1048576) != 0 ? productCardCopy.inlineLabels : null, ((-33554433) & 2097152) != 0 ? productCardCopy.promotionInfo : null, ((-33554433) & 4194304) != 0 ? productCardCopy.adId : null, ((-33554433) & 8388608) != 0 ? productCardCopy.source : null, ((-33554433) & 16777216) != 0 ? productCardCopy.marketplace : null, ((-33554433) & 33554432) != 0 ? productCardCopy.rewardsOfferInfo : null, ((-33554433) & 67108864) != 0 ? productCardCopy.disclaimer : null, ((-33554433) & 134217728) != 0 ? productCardCopy.tagLabel : null, ((-33554433) & 268435456) != 0 ? productCardCopy.inStoreAvailabilityInfo : null, ((-33554433) & 536870912) != 0 ? productCardCopy.productVarieties : null, ((-33554433) & 1073741824) != 0 ? productCardCopy.categories : null, ((-33554433) & Integer.MIN_VALUE) != 0 ? productCardCopy.isTobacco : false, (255 & 1) != 0 ? productCardCopy.multiBuyPriceInfo : null, (255 & 2) != 0 ? productCardCopy.memberPriceInfo : null, (255 & 4) != 0 ? productCardCopy.cartProductInfo : null, (255 & 8) != 0 ? productCardCopy.inStoreLocation : null, (255 & 16) != 0 ? productCardCopy.productCardAnalytics : null, (255 & 32) != 0 ? productCardCopy.impressionAnalyticsData : null, (255 & 64) != 0 ? productCardCopy.productCardAction : null, (255 & 128) != 0 ? productCardCopy.pricingFootnoteMd : null);
                    }
                    productCard = productCardCopy;
                } else {
                    productCard = null;
                }
                arrayList2.add(ProductItemUiModel.a(productItemUiModel, false, productCard, false, false, false, false, false, null, null, 65279));
            }
            int i2 = 5;
            ShoppingListDetailsUiModel shoppingListDetailsUiModelH = ShoppingListsExtKt.h(ShoppingListsExtKt.g(ShoppingListDetailsUiModel.a(shoppingListDetailsUiModel4, arrayList2, null, 5), shoppingListDetailsViewModel.j, result2, ViewModelKt.a(shoppingListDetailsViewModel).d), ViewModelKt.a(shoppingListDetailsViewModel), shoppingListDetailsViewModel.g, list6);
            if (listDetailsResult2 == null) {
                z4 = z7;
                z5 = z8;
            } else {
                List list9 = shoppingListDetailsUiModelH.b;
                ArrayList arrayList3 = new ArrayList(CollectionsKt.s(list9, 10));
                Iterator it2 = list9.iterator();
                while (it2.hasNext()) {
                    ProductItemUiModel productItemUiModelA = (ProductItemUiModel) it2.next();
                    Intrinsics.h(productItemUiModelA, "<this>");
                    ProductCard productCard2 = productItemUiModelA.i;
                    List list10 = listDetailsResult2.f12305a.b;
                    Iterator it3 = it2;
                    boolean z10 = z7;
                    boolean z11 = z8;
                    ArrayList arrayList4 = new ArrayList(CollectionsKt.s(list10, 10));
                    Iterator it4 = list10.iterator();
                    while (it4.hasNext()) {
                        arrayList4.add(((ProductItemInput) it4.next()).f11748a);
                    }
                    if (CollectionsKt.t(arrayList4, productCard2 != null ? productCard2.getProductId() : null)) {
                        List list11 = listDetailsResult2.b.b;
                        if (list11 != null) {
                            arrayList = new ArrayList();
                            for (Iterator it5 = list11.iterator(); it5.hasNext(); it5 = it) {
                                Object next = it5.next();
                                String str = ((ListDetailsProductAction) next).f12308a;
                                if (productCard2 != null) {
                                    it = it5;
                                    productId = productCard2.getProductId();
                                } else {
                                    it = it5;
                                    productId = null;
                                }
                                if (str.equals(productId)) {
                                    arrayList.add(next);
                                }
                            }
                        } else {
                            arrayList = 0;
                        }
                        if (arrayList == 0) {
                            arrayList = EmptyList.d;
                        }
                        Iterable<ListDetailsProductAction> iterable = (Iterable) arrayList;
                        ArrayList arrayList5 = new ArrayList(CollectionsKt.s(iterable, 10));
                        for (ListDetailsProductAction listDetailsProductAction : iterable) {
                            arrayList5.add(new ProductMenuItem(listDetailsProductAction.b, listDetailsProductAction.c));
                        }
                        productItemUiModelA = ProductItemUiModel.a(productItemUiModelA, false, null, false, false, false, false, false, null, arrayList5, 32767);
                    }
                    arrayList3.add(productItemUiModelA);
                    it2 = it3;
                    z7 = z10;
                    z8 = z11;
                    i2 = 5;
                }
                z4 = z7;
                z5 = z8;
                shoppingListDetailsUiModelH = ShoppingListDetailsUiModel.a(shoppingListDetailsUiModelH, arrayList3, null, i2);
            }
            if (textItemUiModel3 == null) {
                shoppingListDetailsUiModelA = shoppingListDetailsUiModelH;
                shoppingListDetailsUiModel2 = null;
            } else {
                List<TextItemUiModel> list12 = shoppingListDetailsUiModelH.c;
                ArrayList arrayList6 = new ArrayList(CollectionsKt.s(list12, 10));
                for (TextItemUiModel textItemUiModelA : list12) {
                    if (Intrinsics.c(textItemUiModelA.f12435a, textItemUiModel3.f12435a)) {
                        textItemUiModelA = TextItemUiModel.a(textItemUiModelA, textItemUiModel3.g, 63);
                    }
                    arrayList6.add(textItemUiModelA);
                }
                shoppingListDetailsUiModel2 = null;
                shoppingListDetailsUiModelA = ShoppingListDetailsUiModel.a(shoppingListDetailsUiModelH, null, arrayList6, 3);
            }
        } else {
            list3 = list7;
            z4 = z7;
            z5 = z8;
            shoppingListDetailsUiModel2 = null;
            shoppingListDetailsUiModelA = null;
        }
        if (shoppingListDetailsUiModelA != null) {
            ProductItemState productItemState = shoppingListDetailsViewModel.o;
            productItemState.getClass();
            ShoppingList shoppingList = shoppingListDetailsUiModelA.f12434a;
            List list13 = shoppingListDetailsUiModelA.b;
            ArrayList arrayList7 = new ArrayList(CollectionsKt.s(list13, 10));
            Iterator it6 = list13.iterator();
            while (it6.hasNext()) {
                arrayList7.add(productItemState.g((ProductItemUiModel) it6.next()));
            }
            shoppingListDetailsUiModel3 = new ShoppingListDetailsUiModel(shoppingList, arrayList7, shoppingListDetailsUiModelA.c);
        } else {
            shoppingListDetailsUiModel3 = shoppingListDetailsUiModel2;
        }
        if (shoppingListDetailsUiModel3 != null) {
            List list14 = shoppingListDetailsUiModel3.c;
            ListsUtils listsUtils = shoppingListDetailsViewModel.m;
            SortBy sortByD = listsUtils.d();
            SortDirection sortDirectionE = listsUtils.e();
            final au.com.woolworths.shop.lists.ui.shoppinglist.compose.a aVar = new au.com.woolworths.shop.lists.ui.shoppinglist.compose.a(9);
            final au.com.woolworths.shop.lists.ui.shoppinglist.compose.a aVar2 = new au.com.woolworths.shop.lists.ui.shoppinglist.compose.a(10);
            List list15 = shoppingListDetailsUiModel3.b;
            List list16 = list14;
            ArrayList arrayList8 = new ArrayList();
            Iterator it7 = list16.iterator();
            while (true) {
                list5 = list16;
                if (!it7.hasNext()) {
                    break;
                }
                TextItemUiModel textItemUiModel4 = textItemUiModel3;
                Object next2 = it7.next();
                boolean z12 = z9;
                ShoppingListItemUiModel item = (ShoppingListItemUiModel) next2;
                Intrinsics.h(item, "item");
                if (!item.getE() && item.getF()) {
                    arrayList8.add(next2);
                }
                list16 = list5;
                z9 = z12;
                textItemUiModel3 = textItemUiModel4;
            }
            textItemUiModel2 = textItemUiModel3;
            z6 = z9;
            List listU0 = CollectionsKt.u0(new Comparator() { // from class: au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsViewModel$sortAndFilterItems$$inlined$sortedByDescending$1
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    au.com.woolworths.shop.lists.ui.shoppinglist.compose.a aVar3 = aVar;
                    return ComparisonsKt.a((Comparable) aVar3.invoke(obj2), (Comparable) aVar3.invoke(obj));
                }
            }, arrayList8);
            List list17 = list15;
            ArrayList arrayList9 = new ArrayList();
            for (Object obj : list17) {
                ShoppingListItemUiModel item2 = (ShoppingListItemUiModel) obj;
                Intrinsics.h(item2, "item");
                if (!item2.getE() && item2.getF()) {
                    arrayList9.add(obj);
                }
            }
            List listF = ShoppingListsExtKt.f(arrayList9, sortByD, sortDirectionE);
            ArrayList arrayList10 = new ArrayList();
            for (Object obj2 : list5) {
                List list18 = list6;
                ShoppingListItemUiModel item3 = (ShoppingListItemUiModel) obj2;
                Intrinsics.h(item3, "item");
                if (item3.getE() && item3.getF()) {
                    arrayList10.add(obj2);
                }
                list6 = list18;
            }
            list4 = list6;
            List listU02 = CollectionsKt.u0(new Comparator() { // from class: au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsViewModel$sortAndFilterItems$$inlined$sortedByDescending$2
                @Override // java.util.Comparator
                public final int compare(Object obj3, Object obj4) {
                    au.com.woolworths.shop.lists.ui.shoppinglist.compose.a aVar3 = aVar2;
                    return ComparisonsKt.a((Comparable) aVar3.invoke(obj4), (Comparable) aVar3.invoke(obj3));
                }
            }, arrayList10);
            ArrayList arrayList11 = new ArrayList();
            for (Object obj3 : list17) {
                ShoppingListItemUiModel item4 = (ShoppingListItemUiModel) obj3;
                Intrinsics.h(item4, "item");
                if (item4.getE() && item4.getF()) {
                    arrayList11.add(obj3);
                }
            }
            listState = new ShoppingListDetailsContract.ListState(listU0, listF, listU02, ShoppingListsExtKt.f(arrayList11, sortByD, sortDirectionE));
        } else {
            textItemUiModel2 = textItemUiModel3;
            z6 = z9;
            list4 = list6;
            listState = ((ShoppingListDetailsContract.ViewState) mutableStateFlow.getValue()).c;
        }
        BoostExt boostExt = shoppingListDetailsViewModel.n;
        BoostAllBannerState previousState = ((ShoppingListDetailsContract.ViewState) mutableStateFlow.getValue()).h;
        boostExt.getClass();
        Intrinsics.h(previousState, "previousState");
        boolean zBooleanValue = previousState.d;
        int size = BoostExt.b(shoppingListDetailsUiModel3).size();
        boolean z13 = false;
        if (size > 0) {
            PluralResText pluralResText = new PluralResText(R.plurals.shop_lists_boost_all_message, size);
            PluralResText pluralResText2 = new PluralResText(R.plurals.shop_lists_boost_all_button_text, size);
            if (statefulButtonState2 == null) {
                statefulButtonState2 = previousState.e;
            }
            boostAllBannerStateA = new BoostAllBannerState(true, pluralResText, pluralResText2, false, statefulButtonState2);
        } else {
            if (previousState.f12374a) {
                if (bool2 != null) {
                    zBooleanValue = bool2.booleanValue();
                }
            } else if (Intrinsics.c(bool2, Boolean.FALSE)) {
                zBooleanValue = false;
            }
            boostAllBannerStateA = BoostAllBannerState.a(previousState, zBooleanValue, 22);
        }
        if (shoppingListDetailsUiModel3 != null) {
            List list19 = shoppingListDetailsUiModel3.b;
            ArrayList arrayList12 = new ArrayList(CollectionsKt.s(list19, 10));
            Iterator it8 = list19.iterator();
            while (it8.hasNext()) {
                arrayList12.add(((ProductItemUiModel) it8.next()).i);
            }
            if (!arrayList12.isEmpty()) {
                Iterator it9 = arrayList12.iterator();
                while (true) {
                    if (!it9.hasNext()) {
                        break;
                    }
                    ProductCard productCard3 = (ProductCard) it9.next();
                    if (productCard3 != null && productCard3.isTobacco()) {
                        z13 = true;
                        break;
                    }
                }
            }
        }
        mutableStateFlow.setValue(new ShoppingListDetailsContract.ViewState(shoppingListDetailsUiModel3, textItemUiModel2, listState, z4, z5, z6, list4, boostAllBannerStateA, resText2, z13, list3));
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract.IShoppingListDetailsViewModel
    public final void A5() {
        this.x.f(new ShoppingListDetailsContract.Actions.LaunchProductSearch(this.B, x6()));
        this.B = "";
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract.IShoppingListDetailsViewModel
    public final void B(ProductItemUiModel uiModel) {
        Intrinsics.h(uiModel, "uiModel");
        this.x.f(new ShoppingListDetailsContract.Actions.ViewSimilarItems(x6(), uiModel.g, AlternativeProductsMode.g));
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract.IShoppingListDetailsViewModel
    public final void C(View view, ProductItemUiModel uiModel) {
        Intrinsics.h(uiModel, "uiModel");
        BuildersKt.c(ViewModelKt.a(this), null, null, new ShoppingListDetailsViewModel$onProductOptionsMenuButtonClick$1(this, uiModel, view, null), 3);
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract.IShoppingListDetailsViewModel
    public final void C5(TextItemUiModel uiModel, boolean z) {
        Intrinsics.h(uiModel, "uiModel");
        z6(uiModel, z, true);
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract.IShoppingListDetailsViewModel
    public final void D(String listId, boolean z) {
        Intrinsics.h(listId, "listId");
        if (z) {
            BuildersKt.c(ViewModelKt.a(this), null, null, new ShoppingListDetailsViewModel$deleteList$1(this, listId, null), 3);
        }
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract.IShoppingListDetailsViewModel
    public final CoroutineScope D1() {
        return ViewModelKt.a(this);
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract.IShoppingListDetailsViewModel
    public final void F(ProductItemUiModel uiModel) {
        Intrinsics.h(uiModel, "uiModel");
        BuildersKt.c(ViewModelKt.a(this), null, null, new ShoppingListDetailsViewModel$onProductQuantityClick$1(this, uiModel, null), 3);
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract.IShoppingListDetailsViewModel
    /* renamed from: G, reason: from getter */
    public final StateFlow getY() {
        return this.y;
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract.IShoppingListDetailsViewModel
    public final void G1() {
        BuildersKt.c(ViewModelKt.a(this), null, null, new ShoppingListDetailsViewModel$onBoostAllClicked$1(this, null), 3);
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract.IShoppingListDetailsViewModel
    public final void H() {
        boolean zC = this.r.c();
        SharedFlowImpl sharedFlowImpl = this.x;
        if (zC) {
            sharedFlowImpl.f(ShoppingListDetailsContract.Actions.LaunchSnapAListGuestOnboardingScreen.f12403a);
        } else {
            sharedFlowImpl.f(ShoppingListDetailsContract.Actions.ShowSnapAListBottomSheet.f12422a);
        }
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract.IShoppingListDetailsViewModel
    public final boolean H5() {
        return Intrinsics.c(this.r.b(), x6());
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract.IShoppingListDetailsViewModel
    public final ShoppingListProductItemState I0() {
        return this.o;
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract.IShoppingListDetailsViewModel
    public final void I2(ShoppingListItemUiModel deletedItemUiModel) {
        Intrinsics.h(deletedItemUiModel, "deletedItemUiModel");
        boolean z = deletedItemUiModel instanceof ProductItemUiModel;
        ShoppingListItemInteractor shoppingListItemInteractor = this.g;
        if (z) {
            ProductItemUiModel productItemUiModel = (ProductItemUiModel) deletedItemUiModel;
            shoppingListItemInteractor.d(productItemUiModel.b, productItemUiModel.g);
        } else {
            if (!(deletedItemUiModel instanceof TextItemUiModel)) {
                throw new NoWhenBranchMatchedException();
            }
            String id = ((TextItemUiModel) deletedItemUiModel).f12435a;
            shoppingListItemInteractor.getClass();
            Intrinsics.h(id, "id");
            shoppingListItemInteractor.b.i(id);
        }
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract.IShoppingListDetailsViewModel
    public final void J() {
        if (!w6()) {
            this.x.f(ShoppingListDetailsContract.Actions.DismissSoftKeyboard.f12388a);
        } else {
            y6(this, this.w, null, null, new TextItemUiModel((String) null, x6(), 0L, 0L, false, "", 61), false, false, false, null, null, null, null, null, null, 4091);
        }
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract.IShoppingListDetailsViewModel
    public final void J4(ProductCard product) {
        Intrinsics.h(product, "product");
        this.x.f(new ShoppingListDetailsContract.Actions.LaunchProductDetailActivity(product));
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract.IShoppingListDetailsViewModel
    public final void K() {
        y6(this, this.w, null, null, new TextItemUiModel((String) null, x6(), 0L, 0L, false, "", 61), false, false, false, null, null, null, null, null, null, 4091);
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract.IShoppingListDetailsViewModel
    public final void L() {
        this.q.g(WatchlistAnalytics.List.Action.g);
        this.x.f(new ShoppingListDetailsContract.Actions.LaunchDeepLink());
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract.IShoppingListDetailsViewModel
    public final void L2(ProductItemUiModel uiModel, boolean z) {
        Intrinsics.h(uiModel, "uiModel");
        z6(uiModel, z, true);
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract.IShoppingListDetailsViewModel
    public final void M(ProductCard product) {
        Intrinsics.h(product, "product");
        ListScreen listScreenS0 = S0();
        AnalyticsManagerExtKt.a(this.q, ((ListScreen.ListDetails) listScreenS0).f, null, listScreenS0.d, product);
        this.x.f(new ShoppingListDetailsContract.Actions.LaunchInStoreMapActivity(product));
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract.IShoppingListDetailsViewModel
    public final void O1(ProductItemUiModel uiModel) {
        Intrinsics.h(uiModel, "uiModel");
        if (this.l.g()) {
            this.x.f(ShoppingListDetailsContract.Actions.ShowAddToCartWarning.f12413a);
        } else {
            BuildersKt.c(ViewModelKt.a(this), null, null, new ShoppingListDetailsViewModel$addProductToCart$1(this, uiModel, null), 3);
        }
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract.IShoppingListDetailsViewModel
    public final void P0() {
        ShoppingList shoppingList;
        ShoppingListDetailsUiModel shoppingListDetailsUiModel = ((ShoppingListDetailsContract.ViewState) this.y.getValue()).f12428a;
        if (shoppingListDetailsUiModel == null || (shoppingList = shoppingListDetailsUiModel.f12434a) == null) {
            return;
        }
        this.x.f(new ShoppingListDetailsContract.Actions.LaunchListOptionsMenu(shoppingList));
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract.IShoppingListDetailsViewModel
    public final void P5() {
        this.x.f(ShoppingListDetailsContract.Actions.LaunchSngSettings.f12406a);
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract.IShoppingListDetailsViewModel
    public final void R1(boolean z) {
        y6(this, this.w, null, null, null, z, false, false, null, null, null, null, null, null, 4087);
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract.IShoppingListDetailsViewModel
    public final ListScreen S0() {
        return new ListScreen.ListDetails(u0());
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract.IShoppingListDetailsViewModel
    public final void T5(boolean z) {
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract.IShoppingListDetailsViewModel
    public final void V2() {
        this.x.f(ShoppingListDetailsContract.Actions.LaunchSngCart.f12404a);
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract.IShoppingListDetailsViewModel
    public final void V5() {
        this.x.f(new ShoppingListDetailsContract.Actions.ShowSnackbar(new ResText(R.string.shop_lists_delete_item_message)));
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract.IShoppingListDetailsViewModel
    public final void W() {
        if (this.l.g()) {
            this.x.f(ShoppingListDetailsContract.Actions.ShowAddToCartWarning.f12413a);
        } else {
            BuildersKt.c(ViewModelKt.a(this), null, null, new ShoppingListDetailsViewModel$onAddAllToCartClick$1(this, null), 3);
        }
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract.IShoppingListDetailsViewModel
    public final void W0(ShoppingListItemUiModel uiModel) {
        Intrinsics.h(uiModel, "uiModel");
        BuildersKt.c(ViewModelKt.a(this), null, null, new ShoppingListDetailsViewModel$deleteShoppingListItem$1(uiModel, this, null), 3);
        this.x.f(new ShoppingListDetailsContract.Actions.OnListItemSoftDeleted(uiModel));
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract.IShoppingListDetailsViewModel
    public final void X() {
        StateFlow stateFlow = this.y;
        ShoppingListDetailsContract.ListState listState = ((ShoppingListDetailsContract.ViewState) stateFlow.getValue()).c;
        if (listState != null) {
            Iterator it = listState.c.iterator();
            while (it.hasNext()) {
                z6((TextItemUiModel) it.next(), false, true);
            }
        }
        ShoppingListDetailsContract.ListState listState2 = ((ShoppingListDetailsContract.ViewState) stateFlow.getValue()).c;
        if (listState2 != null) {
            Iterator it2 = listState2.d.iterator();
            while (it2.hasNext()) {
                z6((ProductItemUiModel) it2.next(), false, true);
            }
        }
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract.IShoppingListDetailsViewModel
    public final void Y2() {
        ShoppingListsRepository shoppingListsRepository = this.h;
        shoppingListsRepository.f.setValue(shoppingListsRepository, ShoppingListsRepository.j[4], Boolean.TRUE);
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract.IShoppingListDetailsViewModel
    public final void Z1() {
        w6();
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract.IShoppingListDetailsViewModel
    public final void b() {
        this.x.f(!this.l.e() ? ShoppingListDetailsContract.Actions.LaunchSearchActivity.f12402a : ShoppingListDetailsContract.Actions.LaunchSngSearchActivity.f12405a);
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract.IShoppingListDetailsViewModel
    public final void b0(String listId, boolean z) {
        Intrinsics.h(listId, "listId");
        this.t = listId;
        this.v = z;
        c5();
        BuildersKt.c(ViewModelKt.a(this), null, null, new ShoppingListDetailsViewModel$addViewStateSource$1(this, listId, null), 3);
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract.IShoppingListDetailsViewModel
    public final void b1(TextItemUiModel uiModel, String text) {
        Intrinsics.h(uiModel, "uiModel");
        Intrinsics.h(text, "text");
        if (Intrinsics.c(uiModel.g, text)) {
            return;
        }
        y6(this, this.w, null, null, TextItemUiModel.a(uiModel, text, 63), false, false, false, null, null, null, null, null, null, 4091);
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract.IShoppingListDetailsViewModel
    public final void b6(ShoppingListItemUiModel shoppingListItemUiModel) {
        z6(shoppingListItemUiModel, true, true);
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract.IShoppingListDetailsViewModel
    public final void c0() {
        ShoppingList shoppingList;
        ShoppingListDetailsUiModel shoppingListDetailsUiModel = ((ShoppingListDetailsContract.ViewState) this.y.getValue()).f12428a;
        if (shoppingListDetailsUiModel == null || (shoppingList = shoppingListDetailsUiModel.f12434a) == null) {
            return;
        }
        this.x.f(new ShoppingListDetailsContract.Actions.LaunchDeleteListConfirmation(shoppingList));
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract.IShoppingListDetailsViewModel
    public final void c5() {
        MutableStateFlow mutableStateFlow;
        ListsInMemoryRepository listsInMemoryRepository = this.l;
        boolean zF = listsInMemoryRepository.f();
        MutableStateFlow mutableStateFlow2 = this.w;
        if (zF) {
            ResText resText = listsInMemoryRepository.e.f.isEmpty() ? new ResText(R.string.shop_lists_scan_an_item) : new ResText(R.string.shop_lists_scan_next_item);
            mutableStateFlow = mutableStateFlow2;
            y6(this, mutableStateFlow, null, null, null, false, false, false, null, null, null, resText, null, null, 3583);
        } else {
            mutableStateFlow = mutableStateFlow2;
        }
        y6(this, mutableStateFlow, null, null, null, false, true, false, null, null, null, null, null, null, 4079);
        BuildersKt.c(ViewModelKt.a(this), null, null, new ShoppingListDetailsViewModel$refreshList$1(this, null), 3);
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract.IShoppingListDetailsViewModel
    /* renamed from: d0, reason: from getter */
    public final Flow getZ() {
        return this.z;
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract.IShoppingListDetailsViewModel
    public final void e(ProductCard product) {
        Intrinsics.h(product, "product");
        this.x.f(new ShoppingListDetailsContract.Actions.LaunchAvailabilityMessageBottomSheet(product));
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract.IShoppingListDetailsViewModel
    public final void e0(ShoppingListItemUiModel deletedItemModel) {
        Intrinsics.h(deletedItemModel, "deletedItemModel");
        BuildersKt.c(ViewModelKt.a(this), null, null, new ShoppingListDetailsViewModel$onUndoDeleteItem$1(deletedItemModel, this, null), 3);
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.sort.SortByViewListener
    public final void h0() {
        this.x.f(new ShoppingListDetailsContract.Actions.LaunchMagicMatchScreen(x6()));
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract.IShoppingListDetailsViewModel
    public final void i(String listId, boolean z) {
        Intrinsics.h(listId, "listId");
        if (z) {
            BuildersKt.c(ViewModelKt.a(this), null, null, new ShoppingListDetailsViewModel$removeAllItems$1(this, listId, null), 3);
        }
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract.IShoppingListDetailsViewModel
    public final void k(TextItemUiModel uiModel, boolean z) {
        Intrinsics.h(uiModel, "uiModel");
        if (z) {
            this.B = uiModel.g;
            y6(this, this.w, null, null, uiModel, false, false, false, null, null, null, null, null, null, 4091);
        }
        this.x.f(new ShoppingListDetailsContract.Actions.TextItemFocusChanged(uiModel, z));
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract.IShoppingListDetailsViewModel
    public final void l(String str) {
        b();
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract.IShoppingListDetailsViewModel
    public final void l3() {
        if (this.l.e()) {
            this.x.f(ShoppingListDetailsContract.Actions.ListChangeRequest.f12408a);
        }
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract.IShoppingListDetailsViewModel
    public final void n(TextItemUiModel uiModel) {
        Intrinsics.h(uiModel, "uiModel");
        y6(this, this.w, null, null, TextItemUiModel.a(uiModel, "", 63), false, false, false, null, null, null, null, null, null, 4091);
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract.IShoppingListDetailsViewModel
    public final void n5(ProductItemUiModel uiModel) {
        Intrinsics.h(uiModel, "uiModel");
        this.x.f(new ShoppingListDetailsContract.Actions.ViewSimilarItems(x6(), uiModel.g, AlternativeProductsMode.f));
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract.IShoppingListDetailsViewModel
    public final void o() {
        this.x.f(ShoppingListDetailsContract.Actions.ShowUncheckCheckedItemsDialog.f12424a);
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.sort.SortByViewListener
    public final void o1() {
        ShoppingListDetailsViewModel shoppingListDetailsViewModel;
        w6();
        MutableStateFlow mutableStateFlow = this.w;
        if (((ShoppingListDetailsContract.ViewState) mutableStateFlow.getValue()).f12428a != null) {
            shoppingListDetailsViewModel = this;
            y6(shoppingListDetailsViewModel, mutableStateFlow, null, null, null, false, false, false, null, null, null, null, null, null, l3.b);
        } else {
            shoppingListDetailsViewModel = this;
        }
        shoppingListDetailsViewModel.x.f(ShoppingListDetailsContract.Actions.ScrollToTop.f12411a);
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract.IShoppingListDetailsViewModel
    public final void o4(List list) {
        Intrinsics.h(list, "list");
        BuildersKt.c(ViewModelKt.a(this), null, null, new ShoppingListDetailsViewModel$addNewTextItems$1(this, list, null), 3);
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract.IShoppingListDetailsViewModel
    public final void p5() {
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract.IShoppingListDetailsViewModel
    public final void q2() {
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract.IShoppingListDetailsViewModel
    public final void s1() {
        ShoppingList shoppingList;
        ShoppingListDetailsUiModel shoppingListDetailsUiModel = ((ShoppingListDetailsContract.ViewState) this.y.getValue()).f12428a;
        if (shoppingListDetailsUiModel == null || (shoppingList = shoppingListDetailsUiModel.f12434a) == null) {
            return;
        }
        this.x.f(new ShoppingListDetailsContract.Actions.LaunchRemoveAllConfirmation(shoppingList));
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract.IShoppingListDetailsViewModel
    public final void s3(ShoppingListItemUiModel uiModel) {
        Intrinsics.h(uiModel, "uiModel");
        if (uiModel instanceof ProductItemUiModel) {
            L2(ProductItemUiModel.a((ProductItemUiModel) uiModel, false, null, false, false, false, false, false, null, null, 65519), false);
        } else {
            if (!(uiModel instanceof TextItemUiModel)) {
                throw new NoWhenBranchMatchedException();
            }
            C5(TextItemUiModel.a((TextItemUiModel) uiModel, null, 111), false);
        }
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract.IShoppingListDetailsViewModel
    public final void t0() {
        TextItemUiModel textItemUiModel = ((ShoppingListDetailsContract.ViewState) this.y.getValue()).b;
        if (textItemUiModel != null) {
            String str = textItemUiModel.g;
            if (StringsKt.D(str)) {
                return;
            }
            this.B = str;
        }
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract.IShoppingListDetailsViewModel
    public final void t1() {
        this.x.f(ShoppingListDetailsContract.Actions.DisplayScanner.f12390a);
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract.IShoppingListDetailsViewModel
    public final void t3() {
        y6(this, this.w, null, null, null, false, false, false, null, Boolean.FALSE, StatefulButtonState.d, null, null, null, 3711);
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract.IShoppingListDetailsViewModel
    public final void u(String searchTerm) {
        Intrinsics.h(searchTerm, "searchTerm");
        this.x.f(new ShoppingListDetailsContract.Actions.LaunchProductSearch(searchTerm, x6()));
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract.IShoppingListDetailsViewModel
    public final ListDetailsAnalyticsParams u0() {
        return (ListDetailsAnalyticsParams) this.A.getD();
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract.IShoppingListDetailsViewModel
    public final void v(ProductItemUiModel uiModel) {
        Intrinsics.h(uiModel, "uiModel");
        BuildersKt.c(ViewModelKt.a(this), null, null, new ShoppingListDetailsViewModel$onCopyToListClick$1(this, uiModel, null), 3);
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract.IShoppingListDetailsViewModel
    public final void v5() {
        List list;
        List list2;
        StateFlow stateFlow = this.y;
        ShoppingListDetailsContract.ListState listState = ((ShoppingListDetailsContract.ViewState) stateFlow.getValue()).c;
        if (listState != null && (list2 = listState.c) != null) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                I2((TextItemUiModel) it.next());
            }
        }
        ShoppingListDetailsContract.ListState listState2 = ((ShoppingListDetailsContract.ViewState) stateFlow.getValue()).c;
        if (listState2 != null && (list = listState2.d) != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                I2((ProductItemUiModel) it2.next());
            }
        }
        V5();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object v6(java.util.ArrayList r18, kotlin.coroutines.jvm.internal.ContinuationImpl r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            boolean r3 = r2 instanceof au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsViewModel$addAndBoostProductsGraphQl$1
            if (r3 == 0) goto L19
            r3 = r2
            au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsViewModel$addAndBoostProductsGraphQl$1 r3 = (au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsViewModel$addAndBoostProductsGraphQl$1) r3
            int r4 = r3.s
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.s = r4
            goto L1e
        L19:
            au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsViewModel$addAndBoostProductsGraphQl$1 r3 = new au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsViewModel$addAndBoostProductsGraphQl$1
            r3.<init>(r0, r2)
        L1e:
            java.lang.Object r2 = r3.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r4 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r5 = r3.s
            r6 = 1
            if (r5 == 0) goto L38
            if (r5 != r6) goto L30
            java.util.ArrayList r1 = r3.p
            kotlin.ResultKt.b(r2)
        L2e:
            r15 = r1
            goto L48
        L30:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L38:
            kotlin.ResultKt.b(r2)
            r3.p = r1
            r3.s = r6
            au.com.woolworths.shop.lists.ui.shoppinglist.main.BoostExt r2 = r0.n
            java.lang.Object r2 = r2.a(r1, r3)
            if (r2 != r4) goto L2e
            return r4
        L48:
            r1 = r2
            au.com.woolworths.shop.lists.ui.shoppinglist.main.BoostProductsGraphQl r1 = (au.com.woolworths.shop.lists.ui.shoppinglist.main.BoostProductsGraphQl) r1
            java.util.ArrayList r8 = r1.f12376a
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            r13 = 0
            r14 = 3903(0xf3f, float:5.469E-42)
            r2 = r1
            kotlinx.coroutines.flow.MutableStateFlow r1 = r0.w
            r3 = r2
            r2 = 0
            r4 = r3
            r3 = 0
            r5 = r4
            r4 = 0
            r6 = r5
            r5 = 0
            r7 = r6
            r6 = 0
            r10 = r7
            r7 = 0
            r11 = r10
            r10 = 0
            r12 = r11
            r11 = 0
            r16 = r12
            r12 = 0
            r18 = r15
            r15 = r16
            y6(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract$Actions$ShowAddToCartResultSnackbar r1 = new au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract$Actions$ShowAddToCartResultSnackbar
            au.com.woolworths.shop.lists.ui.shoppinglist.utils.TrolleyResultWithMessage r2 = r15.b
            au.com.woolworths.android.onesite.models.text.Text r3 = r2.b
            java.util.ArrayList r4 = r15.c
            r5 = r18
            r1.<init>(r3, r2, r5, r4)
            kotlinx.coroutines.flow.SharedFlowImpl r2 = r0.x
            r2.f(r1)
            kotlin.Unit r1 = kotlin.Unit.f24250a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsViewModel.v6(java.util.ArrayList, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract.IShoppingListDetailsViewModel
    public final void w0(ShoppingList shoppingList) {
        Intrinsics.h(shoppingList, "shoppingList");
        BuildersKt.c(ViewModelKt.a(this), null, null, new ShoppingListDetailsViewModel$onDuplicateShoppingListClicked$1(this, shoppingList, null), 3);
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract.IShoppingListDetailsViewModel
    public final void w2() {
        this.x.f(new ShoppingListDetailsContract.Actions.LaunchEditList(x6()));
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract.IShoppingListDetailsViewModel
    public final void w4(ProductItemUiModel uiModel) {
        Intrinsics.h(uiModel, "uiModel");
        if (this.r.c()) {
            this.x.f(ShoppingListDetailsContract.Actions.LaunchWatchlistGuestOnboardingScreen.f12407a);
        } else {
            BuildersKt.c(ViewModelKt.a(this), null, null, new ShoppingListDetailsViewModel$onCopyToWatchlist$1(this, uiModel, null), 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean w6() {
        /*
            r16 = this;
            r0 = r16
            kotlinx.coroutines.flow.StateFlow r1 = r0.y
            java.lang.Object r2 = r1.getValue()
            au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract$ViewState r2 = (au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract.ViewState) r2
            au.com.woolworths.shop.lists.ui.shoppinglist.models.TextItemUiModel r2 = r2.b
            r3 = 0
            if (r2 == 0) goto Lac
            java.lang.String r4 = r2.f12435a
            java.lang.String r5 = r2.g
            boolean r6 = kotlin.text.StringsKt.D(r5)
            r7 = 3
            kotlinx.coroutines.flow.SharedFlowImpl r8 = r0.x
            r9 = 0
            if (r6 != 0) goto L7c
            r0.t0()
            java.lang.Object r1 = r1.getValue()
            au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract$ViewState r1 = (au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract.ViewState) r1
            au.com.woolworths.shop.lists.ui.shoppinglist.models.ShoppingListDetailsUiModel r1 = r1.f12428a
            if (r1 == 0) goto L6d
            java.util.List r1 = r1.c
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            boolean r3 = r1 instanceof java.util.Collection
            if (r3 == 0) goto L3c
            r3 = r1
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L3c
            goto L6d
        L3c:
            java.util.Iterator r1 = r1.iterator()
        L40:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L6d
            java.lang.Object r3 = r1.next()
            au.com.woolworths.shop.lists.ui.shoppinglist.models.TextItemUiModel r3 = (au.com.woolworths.shop.lists.ui.shoppinglist.models.TextItemUiModel) r3
            java.lang.String r6 = r3.f12435a
            boolean r6 = kotlin.jvm.internal.Intrinsics.c(r6, r4)
            if (r6 != 0) goto L40
            java.lang.String r3 = r3.g
            boolean r3 = kotlin.jvm.internal.Intrinsics.c(r3, r5)
            if (r3 == 0) goto L40
            au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract$Actions$ShowSnackbar r1 = new au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract$Actions$ShowSnackbar
            au.com.woolworths.android.onesite.models.text.ResText r2 = new au.com.woolworths.android.onesite.models.text.ResText
            r3 = 2132019207(0x7f140807, float:1.9676742E38)
            r2.<init>(r3)
            r1.<init>(r2)
            r8.f(r1)
            goto L79
        L6d:
            androidx.lifecycle.viewmodel.internal.CloseableCoroutineScope r1 = androidx.lifecycle.ViewModelKt.a(r0)
            au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsViewModel$addOrUpdateTextItem$1 r3 = new au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsViewModel$addOrUpdateTextItem$1
            r3.<init>(r0, r2, r9)
            kotlinx.coroutines.BuildersKt.c(r1, r9, r9, r3, r7)
        L79:
            r3 = 1
        L7a:
            r15 = r3
            goto L98
        L7c:
            int r1 = r4.length()
            if (r1 != 0) goto L83
            goto L7a
        L83:
            androidx.lifecycle.viewmodel.internal.CloseableCoroutineScope r1 = androidx.lifecycle.ViewModelKt.a(r0)
            au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsViewModel$deleteShoppingListItem$1 r4 = new au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsViewModel$deleteShoppingListItem$1
            r4.<init>(r2, r0, r9)
            kotlinx.coroutines.BuildersKt.c(r1, r9, r9, r4, r7)
            au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract$Actions$OnListItemSoftDeleted r1 = new au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract$Actions$OnListItemSoftDeleted
            r1.<init>(r2)
            r8.f(r1)
            goto L7a
        L98:
            r13 = 0
            r14 = 4091(0xffb, float:5.733E-42)
            kotlinx.coroutines.flow.MutableStateFlow r1 = r0.w
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            y6(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r15
        Lac:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsViewModel.w6():boolean");
    }

    public final String x6() {
        String str = this.t;
        if (str != null) {
            return str;
        }
        Intrinsics.p("listId");
        throw null;
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract.IShoppingListDetailsViewModel
    public final void y() {
        this.x.f(ShoppingListDetailsContract.Actions.ShowDeleteCheckedItemsDialog.f12416a);
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract.IShoppingListDetailsViewModel
    public final void y4(ShoppingListItemUiModel deletedItemUiModel) {
        Intrinsics.h(deletedItemUiModel, "deletedItemUiModel");
        this.x.f(new ShoppingListDetailsContract.Actions.ShowItemDeletedSnackbar(deletedItemUiModel));
    }

    public final void z6(ShoppingListItemUiModel shoppingListItemUiModel, boolean z, boolean z2) {
        if (shoppingListItemUiModel.getE() != z) {
            if ((shoppingListItemUiModel instanceof TextItemUiModel) && ((TextItemUiModel) shoppingListItemUiModel).f12435a.length() == 0) {
                return;
            }
            BuildersKt.c(ViewModelKt.a(this), null, null, new ShoppingListDetailsViewModel$updateCheckedStatus$1(shoppingListItemUiModel, this, z, z2, null), 3);
        }
    }
}
