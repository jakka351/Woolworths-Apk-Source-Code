package au.com.woolworths.feature.product.list.legacy;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.utils.Extensions;
import au.com.woolworths.base.shopapp.customviews.SimpleCoachMarkSettings;
import au.com.woolworths.base.shopapp.customviews.SimpleCoachMarkSettingsKt;
import au.com.woolworths.feature.product.list.legacy.data.IngredientCardApiData;
import au.com.woolworths.feature.product.list.legacy.databinding.FragmentProductListLegacyBinding;
import au.com.woolworths.pagingutils.KeyedPageData;
import au.com.woolworths.pagingutils.PageData;
import com.airbnb.epoxy.EpoxyRecyclerView;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinNothingValueException;
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
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import timber.log.Timber;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.product.list.legacy.ProductListFragment$initializeViewStateObservable$1$3", f = "ProductListFragment.kt", l = {527}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class ProductListFragment$initializeViewStateObservable$1$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ ProductListViewModel q;
    public final /* synthetic */ ProductListFragment r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductListFragment$initializeViewStateObservable$1$3(ProductListViewModel productListViewModel, ProductListFragment productListFragment, Continuation continuation) {
        super(2, continuation);
        this.q = productListViewModel;
        this.r = productListFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ProductListFragment$initializeViewStateObservable$1$3(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((ProductListFragment$initializeViewStateObservable$1$3) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        return CoroutineSingletons.d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            StateFlow stateFlow = this.q.E;
            final ProductListFragment productListFragment = this.r;
            FlowCollector flowCollector = new FlowCollector() { // from class: au.com.woolworths.feature.product.list.legacy.ProductListFragment$initializeViewStateObservable$1$3.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) {
                    PageData pageData;
                    List c;
                    KeyedPageData keyedPageData = (KeyedPageData) obj2;
                    final ProductListFragment productListFragment2 = productListFragment;
                    productListFragment2.q2(keyedPageData);
                    ProductListInteractor productListInteractor = productListFragment2.n;
                    if (productListInteractor == null) {
                        Intrinsics.p("productListInteractor");
                        throw null;
                    }
                    int i2 = 0;
                    if (!productListInteractor.f5328a.f5342a.getBoolean("is_swap_coach_mark_seen", false) && keyedPageData != null && (pageData = keyedPageData.b) != null && (c = pageData.getC()) != null) {
                        Iterator it = c.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                i2 = -1;
                                break;
                            }
                            Object next = it.next();
                            IngredientCardApiData ingredientCardApiData = next instanceof IngredientCardApiData ? (IngredientCardApiData) next : null;
                            if ((ingredientCardApiData != null ? ingredientCardApiData.e : null) != null) {
                                break;
                            }
                            i2++;
                        }
                        Integer numValueOf = Integer.valueOf(i2);
                        if (i2 < 0) {
                            numValueOf = null;
                        }
                        if (numValueOf != null) {
                            final int iIntValue = numValueOf.intValue();
                            FragmentProductListLegacyBinding fragmentProductListLegacyBinding = productListFragment2.i;
                            if (fragmentProductListLegacyBinding == null) {
                                Intrinsics.p("fragmentProductListBinding");
                                throw null;
                            }
                            final EpoxyRecyclerView recyclerView = fragmentProductListLegacyBinding.D;
                            Intrinsics.g(recyclerView, "recyclerView");
                            recyclerView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: au.com.woolworths.feature.product.list.legacy.ProductListFragment$showCoachMarkForIngredientSwapProduct$lambda$31$$inlined$doOnNextLayout$1
                                @Override // android.view.View.OnLayoutChangeListener
                                public final void onLayoutChange(View view, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
                                    view.removeOnLayoutChangeListener(this);
                                    final EpoxyRecyclerView epoxyRecyclerView = recyclerView;
                                    RecyclerView.LayoutManager layoutManager = epoxyRecyclerView.getLayoutManager();
                                    final LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                                    if (linearLayoutManager == null) {
                                        return;
                                    }
                                    linearLayoutManager.s1(iIntValue, 0);
                                    final ProductListFragment productListFragment3 = productListFragment2;
                                    epoxyRecyclerView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: au.com.woolworths.feature.product.list.legacy.ProductListFragment$showCoachMarkForIngredientSwapProduct$lambda$31$lambda$30$$inlined$doOnNextLayout$1
                                        @Override // android.view.View.OnLayoutChangeListener
                                        public final void onLayoutChange(View view2, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                                            view2.removeOnLayoutChangeListener(this);
                                            View viewY = linearLayoutManager.y(0);
                                            ViewGroup viewGroup = viewY instanceof ViewGroup ? (ViewGroup) viewY : null;
                                            ViewGroup viewGroup2 = viewGroup != null ? (ViewGroup) viewGroup.findViewById(com.woolworths.R.id.ingredient_content) : null;
                                            View viewFindViewById = viewGroup2 != null ? viewGroup2.findViewById(com.woolworths.R.id.swap_button) : null;
                                            if (viewGroup2 == null || viewFindViewById == null) {
                                                Timber.f27013a.n("Coachmark not shown since view does not exist", new NullPointerException("Couldnt find view for ingredient_content, check layout?"), new Object[0]);
                                                return;
                                            }
                                            int width = (viewGroup2.getWidth() / 2) - (viewFindViewById.getWidth() / 2);
                                            final ProductListFragment productListFragment4 = productListFragment3;
                                            FragmentActivity fragmentActivityRequireActivity = productListFragment4.requireActivity();
                                            Intrinsics.g(fragmentActivityRequireActivity, "requireActivity(...)");
                                            ResText resText = new ResText(com.woolworths.R.string.product_list_swap_ingredient_coach_mark_message);
                                            ResText resText2 = new ResText(com.woolworths.R.string.product_list_swap_ingredient_coach_mark_cta);
                                            Context contextRequireContext = productListFragment4.requireContext();
                                            Intrinsics.g(contextRequireContext, "requireContext(...)");
                                            SimpleCoachMarkSettingsKt.a(fragmentActivityRequireActivity, epoxyRecyclerView, viewGroup2, new SimpleCoachMarkSettings(null, resText, resText2, Integer.valueOf(Extensions.a(android.R.attr.textColorPrimary, contextRequireContext)), 1.0f, null, 880), null, ProductListFragment$showCoachMarkForIngredientSwapProduct$3$1$1$1.d, new Function0<Unit>() { // from class: au.com.woolworths.feature.product.list.legacy.ProductListFragment$showCoachMarkForIngredientSwapProduct$3$1$1$2
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    ProductListInteractor productListInteractor2 = productListFragment4.n;
                                                    if (productListInteractor2 != null) {
                                                        androidx.constraintlayout.core.state.a.v(productListInteractor2.f5328a.f5342a, "is_swap_coach_mark_seen", true);
                                                        return Unit.f24250a;
                                                    }
                                                    Intrinsics.p("productListInteractor");
                                                    throw null;
                                                }
                                            }, width, 0, 392);
                                        }
                                    });
                                }
                            });
                        }
                    }
                    return Unit.f24250a;
                }
            };
            this.p = 1;
            if (stateFlow.collect(flowCollector, this) == coroutineSingletons) {
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
