package au.com.woolworths.shop.addtolist.add;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.analytics.supers.lists.AddToListAnalytics;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.analytics.RewardsOfferAction;
import au.com.woolworths.android.onesite.analytics.Screen;
import au.com.woolworths.android.onesite.models.text.PlainText;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.models.text.ResWithArgText;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.foundation.rewards.offers.model.RewardsOfferStatus;
import au.com.woolworths.product.analytics.ProductAnalyticsExtKt;
import au.com.woolworths.product.extensions.ProductCardExtKt;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.ProductQuantityHelper;
import au.com.woolworths.product.models.RewardsOfferInfo;
import au.com.woolworths.product.offers.ProductBoostInteractor;
import au.com.woolworths.product.offers.ProductsBoostViewListener;
import au.com.woolworths.product.offers.TrackableBoostMetadata;
import au.com.woolworths.product.quantityselector.QuantitySelectorActions;
import au.com.woolworths.shop.addtolist.add.AddToListBottomSheetContract;
import au.com.woolworths.shop.addtolist.edit.ListsAddListener;
import au.com.woolworths.shop.addtolist.models.AddToListProductParameters;
import au.com.woolworths.shop.addtolist.models.CopyFromListParameters;
import au.com.woolworths.shop.lists.data.ShoppingListInteractor;
import au.com.woolworths.shop.lists.data.ShoppingListItemInteractor;
import au.com.woolworths.shop.lists.data.model.ProductListItem;
import au.com.woolworths.shop.lists.data.model.ShoppingList;
import au.com.woolworths.views.horizontalselector.HorizontalSelectorViewAnalyticsListener;
import au.com.woolworths.views.horizontalselector.HorizontalSelectorViewListener;
import com.woolworths.R;
import dagger.hilt.android.lifecycle.HiltViewModel;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;

@HiltViewModel
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0001\u0007¨\u0006\b"}, d2 = {"Lau/com/woolworths/shop/addtolist/add/AddToListBottomSheetViewModel;", "Landroidx/lifecycle/ViewModel;", "Lau/com/woolworths/views/horizontalselector/HorizontalSelectorViewListener;", "Lau/com/woolworths/views/horizontalselector/HorizontalSelectorViewAnalyticsListener;", "Lau/com/woolworths/shop/addtolist/add/ListItemClickListener;", "Lau/com/woolworths/shop/addtolist/edit/ListsAddListener;", "Lau/com/woolworths/product/offers/ProductsBoostViewListener;", "Companion", "shop-add-to-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class AddToListBottomSheetViewModel extends ViewModel implements HorizontalSelectorViewListener, HorizontalSelectorViewAnalyticsListener, ListItemClickListener, ListsAddListener, ProductsBoostViewListener {
    public final ShoppingListInteractor e;
    public final ShoppingListItemInteractor f;
    public final ProductBoostInteractor g;
    public final AnalyticsManager h;
    public final MutableLiveData i;
    public final SharedFlowImpl j;
    public final MutableLiveData k;
    public final Flow l;
    public String m;
    public Screen n;
    public TrackingMetadata o;
    public CopyFromListParameters p;
    public CoroutineScope q;
    public List r;
    public ProductListItem s;
    public int t;
    public boolean u;
    public boolean v;
    public String w;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/addtolist/add/AddToListBottomSheetViewModel$Companion;", "", "shop-add-to-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public static AddToListProductParameters a(AddToListProductParameters addToListProductParameters, List list) {
            Object next;
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.c(((ProductCard) next).getProductId(), addToListProductParameters.d.getProductId())) {
                    break;
                }
            }
            ProductCard productCard = (ProductCard) next;
            return productCard == null ? addToListProductParameters : AddToListProductParameters.a(addToListProductParameters, ProductAnalyticsExtKt.k(ProductAnalyticsExtKt.j(addToListProductParameters.d, productCard.getRewardsOfferInfo()), RewardsOfferAction.f), null, 30);
        }
    }

    public AddToListBottomSheetViewModel(ShoppingListInteractor shoppingListInteractor, ShoppingListItemInteractor shoppingListItemInteractor, ProductBoostInteractor productBoostInteractor, AnalyticsManager analyticsManager) {
        Intrinsics.h(shoppingListInteractor, "shoppingListInteractor");
        Intrinsics.h(shoppingListItemInteractor, "shoppingListItemInteractor");
        Intrinsics.h(productBoostInteractor, "productBoostInteractor");
        Intrinsics.h(analyticsManager, "analyticsManager");
        this.e = shoppingListInteractor;
        this.f = shoppingListItemInteractor;
        this.g = productBoostInteractor;
        this.h = analyticsManager;
        MutableLiveData mutableLiveData = new MutableLiveData();
        this.i = mutableLiveData;
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(0, 1, BufferOverflow.e, 1);
        this.j = sharedFlowImplB;
        this.k = mutableLiveData;
        this.l = FlowKt.a(sharedFlowImplB);
        this.r = EmptyList.d;
    }

    public static void E6(AddToListBottomSheetViewModel addToListBottomSheetViewModel, MutableLiveData mutableLiveData, Text text, List list, int i, int i2, String str, boolean z, String str2, AddToListMode addToListMode, int i3) {
        boolean z2;
        String str3;
        AddToListMode addToListMode2;
        AddToListMode addToListMode3;
        List list2;
        AddToListBottomSheetContract.ViewState viewState;
        if ((i3 & 1) != 0 && ((viewState = (AddToListBottomSheetContract.ViewState) mutableLiveData.e()) == null || (text = viewState.f10113a) == null)) {
            text = new PlainText("");
        }
        Text text2 = text;
        if ((i3 & 2) != 0) {
            AddToListBottomSheetContract.ViewState viewState2 = (AddToListBottomSheetContract.ViewState) mutableLiveData.e();
            if (viewState2 == null || (list2 = viewState2.b) == null) {
                list2 = EmptyList.d;
            }
            list = list2;
        }
        List list3 = list;
        if ((i3 & 4) != 0) {
            AddToListBottomSheetContract.ViewState viewState3 = (AddToListBottomSheetContract.ViewState) mutableLiveData.e();
            i = viewState3 != null ? viewState3.c : 0;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            AddToListBottomSheetContract.ViewState viewState4 = (AddToListBottomSheetContract.ViewState) mutableLiveData.e();
            i2 = viewState4 != null ? viewState4.d : 0;
        }
        int i5 = i2;
        if ((i3 & 16) != 0) {
            AddToListBottomSheetContract.ViewState viewState5 = (AddToListBottomSheetContract.ViewState) mutableLiveData.e();
            str = viewState5 != null ? viewState5.e : null;
        }
        String str4 = str;
        if ((i3 & 32) != 0) {
            AddToListBottomSheetContract.ViewState viewState6 = (AddToListBottomSheetContract.ViewState) mutableLiveData.e();
            z2 = viewState6 != null ? viewState6.f : false;
        } else {
            z2 = z;
        }
        if ((i3 & 64) != 0) {
            AddToListBottomSheetContract.ViewState viewState7 = (AddToListBottomSheetContract.ViewState) mutableLiveData.e();
            str3 = viewState7 != null ? viewState7.g : null;
        } else {
            str3 = str2;
        }
        if ((i3 & 128) != 0) {
            AddToListBottomSheetContract.ViewState viewState8 = (AddToListBottomSheetContract.ViewState) mutableLiveData.e();
            if (viewState8 == null || (addToListMode3 = viewState8.h) == null) {
                addToListMode3 = AddToListMode.d;
            }
            addToListMode2 = addToListMode3;
        } else {
            addToListMode2 = addToListMode;
        }
        mutableLiveData.m(new AddToListBottomSheetContract.ViewState(text2, list3, i4, i5, str4, z2, str3, addToListMode2));
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object p6(au.com.woolworths.shop.addtolist.add.AddToListBottomSheetViewModel r10, float r11, au.com.woolworths.shop.lists.data.model.ShoppingList r12, kotlin.coroutines.jvm.internal.ContinuationImpl r13) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.addtolist.add.AddToListBottomSheetViewModel.p6(au.com.woolworths.shop.addtolist.add.AddToListBottomSheetViewModel, float, au.com.woolworths.shop.lists.data.model.ShoppingList, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void A6() {
        ProductListItem productListItem = this.s;
        if (productListItem != null) {
            BuildersKt.c(ViewModelKt.a(this), null, null, new AddToListBottomSheetViewModel$onRemoveClicked$1$1(this, productListItem, null), 3);
        }
    }

    public final void B6() {
        ProductListItem productListItem = this.s;
        if (productListItem != null) {
            float fL = ProductCardExtKt.l(w6(), this.t);
            this.h.g((Event) new AddToListAnalytics.AddToList(v6().getD(), v6().getE()).h.b.getD());
            BuildersKt.c(ViewModelKt.a(this), null, null, new AddToListBottomSheetViewModel$onUpdateClicked$1$1(this, productListItem, fL, null), 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object C6(au.com.woolworths.shop.lists.data.model.ShoppingList r10, au.com.woolworths.shop.addtolist.models.AddToListProductParameters r11, kotlin.coroutines.jvm.internal.ContinuationImpl r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof au.com.woolworths.shop.addtolist.add.AddToListBottomSheetViewModel$singleAddToList$1
            if (r0 == 0) goto L13
            r0 = r12
            au.com.woolworths.shop.addtolist.add.AddToListBottomSheetViewModel$singleAddToList$1 r0 = (au.com.woolworths.shop.addtolist.add.AddToListBottomSheetViewModel$singleAddToList$1) r0
            int r1 = r0.t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.t = r1
            goto L18
        L13:
            au.com.woolworths.shop.addtolist.add.AddToListBottomSheetViewModel$singleAddToList$1 r0 = new au.com.woolworths.shop.addtolist.add.AddToListBottomSheetViewModel$singleAddToList$1
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.r
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.t
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            au.com.woolworths.shop.addtolist.models.AddToListProductParameters r11 = r0.q
            au.com.woolworths.shop.lists.data.model.ShoppingList r10 = r0.p
            kotlin.ResultKt.b(r12)
            goto L54
        L2b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L33:
            kotlin.ResultKt.b(r12)
            java.lang.Float r12 = r11.f
            au.com.woolworths.product.models.ProductCard r2 = r11.d
            if (r12 == 0) goto L41
            float r12 = r12.floatValue()
            goto L47
        L41:
            int r12 = r9.t
            float r12 = au.com.woolworths.product.extensions.ProductCardExtKt.l(r2, r12)
        L47:
            r0.p = r10
            r0.q = r11
            r0.t = r3
            java.lang.Object r12 = r9.r6(r10, r2, r12, r0)
            if (r12 != r1) goto L54
            return r1
        L54:
            au.com.woolworths.shop.addtolist.add.AddToListBottomSheetContract$Actions$AddToListSuccess r12 = new au.com.woolworths.shop.addtolist.add.AddToListBottomSheetContract$Actions$AddToListSuccess
            au.com.woolworths.shop.addtolist.models.ListChangeEvent$AddToListSuccessEvent r0 = new au.com.woolworths.shop.addtolist.models.ListChangeEvent$AddToListSuccessEvent
            java.lang.String r1 = r10.getId()
            java.lang.String r2 = r10.getTitle()
            int r10 = r9.t
            java.lang.String r3 = r9.x6(r10)
            au.com.woolworths.product.models.ProductCard r10 = r11.d
            java.util.List r5 = kotlin.collections.CollectionsKt.Q(r10)
            au.com.woolworths.shop.addtolist.models.BoostResult r6 = r11.g
            boolean r7 = r11.h
            r8 = 8
            r4 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r12.<init>(r0)
            r9.u6(r12)
            kotlin.Unit r10 = kotlin.Unit.f24250a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.addtolist.add.AddToListBottomSheetViewModel.C6(au.com.woolworths.shop.lists.data.model.ShoppingList, au.com.woolworths.shop.addtolist.models.AddToListProductParameters, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void D6(AddToListBottomSheetActions addToListBottomSheetActions) {
        TrackingMetadata trackingMetadata = this.o;
        AnalyticsManager analyticsManager = this.h;
        if (trackingMetadata != null) {
            analyticsManager.j(addToListBottomSheetActions, trackingMetadata);
        } else {
            analyticsManager.c(addToListBottomSheetActions);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object F6(au.com.woolworths.shop.addtolist.models.AddToListProductParameters r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof au.com.woolworths.shop.addtolist.add.AddToListBottomSheetViewModel$withBoostedProductOffer$1
            if (r0 == 0) goto L13
            r0 = r6
            au.com.woolworths.shop.addtolist.add.AddToListBottomSheetViewModel$withBoostedProductOffer$1 r0 = (au.com.woolworths.shop.addtolist.add.AddToListBottomSheetViewModel$withBoostedProductOffer$1) r0
            int r1 = r0.s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s = r1
            goto L18
        L13:
            au.com.woolworths.shop.addtolist.add.AddToListBottomSheetViewModel$withBoostedProductOffer$1 r0 = new au.com.woolworths.shop.addtolist.add.AddToListBottomSheetViewModel$withBoostedProductOffer$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.s
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            au.com.woolworths.shop.addtolist.models.AddToListProductParameters r5 = r0.p
            kotlin.ResultKt.b(r6)
            goto L45
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.ResultKt.b(r6)
            au.com.woolworths.product.models.ProductCard r6 = r5.d
            java.util.List r6 = kotlin.collections.CollectionsKt.Q(r6)
            r0.p = r5
            r0.s = r3
            java.lang.Object r6 = r4.t6(r6, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            au.com.woolworths.product.offers.ProductBoostResult r6 = (au.com.woolworths.product.offers.ProductBoostResult) r6
            if (r6 == 0) goto L70
            boolean r0 = r6 instanceof au.com.woolworths.product.offers.ProductBoostResult.Failure
            r1 = 23
            r2 = 0
            if (r0 == 0) goto L57
            au.com.woolworths.shop.addtolist.models.BoostResult r6 = au.com.woolworths.shop.addtolist.models.BoostResult.e
            au.com.woolworths.shop.addtolist.models.AddToListProductParameters r5 = au.com.woolworths.shop.addtolist.models.AddToListProductParameters.a(r5, r2, r6, r1)
            return r5
        L57:
            boolean r0 = r6 instanceof au.com.woolworths.product.offers.ProductBoostResult.Success
            if (r0 == 0) goto L6a
            au.com.woolworths.shop.addtolist.models.BoostResult r0 = au.com.woolworths.shop.addtolist.models.BoostResult.d
            au.com.woolworths.shop.addtolist.models.AddToListProductParameters r5 = au.com.woolworths.shop.addtolist.models.AddToListProductParameters.a(r5, r2, r0, r1)
            au.com.woolworths.product.offers.ProductBoostResult$Success r6 = (au.com.woolworths.product.offers.ProductBoostResult.Success) r6
            java.lang.Object r6 = r6.c
            au.com.woolworths.shop.addtolist.models.AddToListProductParameters r5 = au.com.woolworths.shop.addtolist.add.AddToListBottomSheetViewModel.Companion.a(r5, r6)
            return r5
        L6a:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        L70:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.addtolist.add.AddToListBottomSheetViewModel.F6(au.com.woolworths.shop.addtolist.models.AddToListProductParameters, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object G6(java.util.List r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof au.com.woolworths.shop.addtolist.add.AddToListBottomSheetViewModel$withBoostedProductOffers$1
            if (r0 == 0) goto L13
            r0 = r8
            au.com.woolworths.shop.addtolist.add.AddToListBottomSheetViewModel$withBoostedProductOffers$1 r0 = (au.com.woolworths.shop.addtolist.add.AddToListBottomSheetViewModel$withBoostedProductOffers$1) r0
            int r1 = r0.s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s = r1
            goto L18
        L13:
            au.com.woolworths.shop.addtolist.add.AddToListBottomSheetViewModel$withBoostedProductOffers$1 r0 = new au.com.woolworths.shop.addtolist.add.AddToListBottomSheetViewModel$withBoostedProductOffers$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.s
            r3 = 10
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            java.util.List r7 = r0.p
            java.util.List r7 = (java.util.List) r7
            kotlin.ResultKt.b(r8)
            goto L68
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            kotlin.ResultKt.b(r8)
            r8 = r7
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r2 = new java.util.ArrayList
            int r5 = kotlin.collections.CollectionsKt.s(r8, r3)
            r2.<init>(r5)
            java.util.Iterator r8 = r8.iterator()
        L48:
            boolean r5 = r8.hasNext()
            if (r5 == 0) goto L5a
            java.lang.Object r5 = r8.next()
            au.com.woolworths.shop.addtolist.models.AddToListProductParameters r5 = (au.com.woolworths.shop.addtolist.models.AddToListProductParameters) r5
            au.com.woolworths.product.models.ProductCard r5 = r5.d
            r2.add(r5)
            goto L48
        L5a:
            r8 = r7
            java.util.List r8 = (java.util.List) r8
            r0.p = r8
            r0.s = r4
            java.lang.Object r8 = r6.t6(r2, r0)
            if (r8 != r1) goto L68
            return r1
        L68:
            au.com.woolworths.product.offers.ProductBoostResult r8 = (au.com.woolworths.product.offers.ProductBoostResult) r8
            if (r8 == 0) goto La4
            boolean r0 = r8 instanceof au.com.woolworths.product.offers.ProductBoostResult.Failure
            if (r0 == 0) goto L71
            goto La4
        L71:
            boolean r0 = r8 instanceof au.com.woolworths.product.offers.ProductBoostResult.Success
            if (r0 == 0) goto L9e
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = kotlin.collections.CollectionsKt.s(r7, r3)
            r0.<init>(r1)
            java.util.Iterator r7 = r7.iterator()
        L84:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L9d
            java.lang.Object r1 = r7.next()
            au.com.woolworths.shop.addtolist.models.AddToListProductParameters r1 = (au.com.woolworths.shop.addtolist.models.AddToListProductParameters) r1
            r2 = r8
            au.com.woolworths.product.offers.ProductBoostResult$Success r2 = (au.com.woolworths.product.offers.ProductBoostResult.Success) r2
            java.lang.Object r2 = r2.c
            au.com.woolworths.shop.addtolist.models.AddToListProductParameters r1 = au.com.woolworths.shop.addtolist.add.AddToListBottomSheetViewModel.Companion.a(r1, r2)
            r0.add(r1)
            goto L84
        L9d:
            return r0
        L9e:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        La4:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.addtolist.add.AddToListBottomSheetViewModel.G6(java.util.List, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // au.com.woolworths.shop.addtolist.edit.ListsAddListener
    public final void H2() {
        BuildersKt.c(ViewModelKt.a(this), null, null, new AddToListBottomSheetViewModel$onCreateShoppingListClicked$1(this, null), 3);
    }

    @Override // au.com.woolworths.views.horizontalselector.HorizontalSelectorViewAnalyticsListener
    public final void Q5() {
        TrackingMetadata trackingMetadata = this.o;
        AnalyticsManager analyticsManager = this.h;
        if (trackingMetadata != null) {
            analyticsManager.j(new QuantitySelectorActions.CarouselClick(v6()), trackingMetadata);
        } else {
            analyticsManager.c(new QuantitySelectorActions.CarouselClick(v6()));
        }
    }

    @Override // au.com.woolworths.shop.addtolist.add.ListItemClickListener
    public final void V1(ShoppingList shoppingList, int i) {
        Intrinsics.h(shoppingList, "shoppingList");
        BuildersKt.c(ViewModelKt.a(this), null, null, new AddToListBottomSheetViewModel$onItemClick$1(this, shoppingList, i, null), 3);
    }

    @Override // au.com.woolworths.product.offers.ProductsBoostViewListener
    public final void d() {
        this.u = false;
    }

    @Override // au.com.woolworths.views.horizontalselector.HorizontalSelectorViewAnalyticsListener
    public final void d5() {
        this.h.c(new QuantitySelectorActions.CarouselSwipe(v6()));
    }

    @Override // au.com.woolworths.views.horizontalselector.HorizontalSelectorViewListener
    public final int f5() {
        AddToListBottomSheetContract.ViewState viewState = (AddToListBottomSheetContract.ViewState) this.i.e();
        if (viewState != null) {
            return viewState.d;
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d2, code lost:
    
        if (z6(r1, (java.util.List) r3, r12) == r13) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object q6(au.com.woolworths.shop.lists.data.model.ShoppingList r18, java.util.List r19, kotlin.coroutines.jvm.internal.ContinuationImpl r20) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.addtolist.add.AddToListBottomSheetViewModel.q6(au.com.woolworths.shop.lists.data.model.ShoppingList, java.util.List, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0069, code lost:
    
        if (r3.g(r7, r8, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r6(au.com.woolworths.shop.lists.data.model.ShoppingList r7, au.com.woolworths.product.models.ProductCard r8, float r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof au.com.woolworths.shop.addtolist.add.AddToListBottomSheetViewModel$addOrUpdateProductWithQuantity$1
            if (r0 == 0) goto L13
            r0 = r10
            au.com.woolworths.shop.addtolist.add.AddToListBottomSheetViewModel$addOrUpdateProductWithQuantity$1 r0 = (au.com.woolworths.shop.addtolist.add.AddToListBottomSheetViewModel$addOrUpdateProductWithQuantity$1) r0
            int r1 = r0.t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.t = r1
            goto L18
        L13:
            au.com.woolworths.shop.addtolist.add.AddToListBottomSheetViewModel$addOrUpdateProductWithQuantity$1 r0 = new au.com.woolworths.shop.addtolist.add.AddToListBottomSheetViewModel$addOrUpdateProductWithQuantity$1
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.r
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.t
            au.com.woolworths.shop.lists.data.ShoppingListItemInteractor r3 = r6.f
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3c
            if (r2 == r5) goto L34
            if (r2 != r4) goto L2c
            kotlin.ResultKt.b(r10)
            goto L6c
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            au.com.woolworths.product.models.ProductCard r8 = r0.q
            au.com.woolworths.shop.lists.data.model.ShoppingList r7 = r0.p
            kotlin.ResultKt.b(r10)
            goto L50
        L3c:
            kotlin.ResultKt.b(r10)
            java.lang.String r10 = r7.getId()
            r0.p = r7
            r0.q = r8
            r0.t = r5
            java.lang.Object r9 = r3.a(r10, r8, r9, r0)
            if (r9 != r1) goto L50
            goto L6b
        L50:
            java.lang.String r7 = r7.getId()
            au.com.woolworths.product.models.ProductId$Companion r9 = au.com.woolworths.product.models.ProductId.INSTANCE
            java.lang.String r8 = r8.getProductId()
            au.com.woolworths.product.models.ProductId r8 = r9.create(r8)
            r9 = 0
            r0.p = r9
            r0.q = r9
            r0.t = r4
            java.lang.Object r7 = r3.g(r7, r8, r0)
            if (r7 != r1) goto L6c
        L6b:
            return r1
        L6c:
            kotlin.Unit r7 = kotlin.Unit.f24250a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.addtolist.add.AddToListBottomSheetViewModel.r6(au.com.woolworths.shop.lists.data.model.ShoppingList, au.com.woolworths.product.models.ProductCard, float, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // au.com.woolworths.views.horizontalselector.HorizontalSelectorViewListener
    public final void s4() {
        this.j.f(AddToListBottomSheetContract.Actions.QuantityCarouselAccessibilityClicked.f10109a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b6, code lost:
    
        if (C6(r1, (au.com.woolworths.shop.addtolist.models.AddToListProductParameters) r3, r12) == r13) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object s6(au.com.woolworths.shop.lists.data.model.ShoppingList r19, int r20, au.com.woolworths.shop.addtolist.models.AddToListProductParameters r21, kotlin.coroutines.jvm.internal.ContinuationImpl r22) {
        /*
            Method dump skipped, instructions count: 202
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.addtolist.add.AddToListBottomSheetViewModel.s6(au.com.woolworths.shop.lists.data.model.ShoppingList, int, au.com.woolworths.shop.addtolist.models.AddToListProductParameters, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final Object t6(List list, ContinuationImpl continuationImpl) {
        List list2 = list;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                RewardsOfferInfo rewardsOfferInfo = ((ProductCard) it.next()).getRewardsOfferInfo();
                if ((rewardsOfferInfo != null ? rewardsOfferInfo.getN() : null) == RewardsOfferStatus.NOT_ACTIVATED) {
                    if (this.v) {
                        this.u = true;
                    }
                    this.j.f(AddToListBottomSheetContract.Actions.DisplayOverlayView.f10107a);
                    TrackableBoostMetadata trackableBoostMetadata = new TrackableBoostMetadata(v6(), this.o);
                    CoroutineScope coroutineScope = this.q;
                    if (coroutineScope != null) {
                        return BuildersKt.f(coroutineScope.getE(), new AddToListBottomSheetViewModel$boostProductOffers$2(this, list, trackableBoostMetadata, null), continuationImpl);
                    }
                    Intrinsics.p("hostCoroutineScope");
                    throw null;
                }
            }
        }
        return null;
    }

    public final void u6(AddToListBottomSheetContract.Actions actions) {
        BuildersKt.c(ViewModelKt.a(this), null, null, new AddToListBottomSheetViewModel$dismissBottomSheet$1(this, actions, null), 3);
    }

    public final Screen v6() {
        Screen screen = this.n;
        if (screen != null) {
            return screen;
        }
        Intrinsics.p("hostScreen");
        throw null;
    }

    public final ProductCard w6() {
        return ((AddToListProductParameters) CollectionsKt.D(this.r)).d;
    }

    @Override // au.com.woolworths.views.horizontalselector.HorizontalSelectorViewListener
    public final int x4() {
        AddToListBottomSheetContract.ViewState viewState = (AddToListBottomSheetContract.ViewState) this.i.e();
        if (viewState != null) {
            return viewState.d;
        }
        return 0;
    }

    public final String x6(int i) {
        return ProductQuantityHelper.INSTANCE.getQuantityLabel(i, w6().getProductShoppingList().getIncrement(), w6().getProductShoppingList().getUnitLabel());
    }

    public final Text y6() {
        if (this.m == null) {
            AddToListBottomSheetContract.ViewState viewState = (AddToListBottomSheetContract.ViewState) this.k.e();
            return (viewState == null || viewState.e == null) ? new ResWithArgText(R.string.bottom_sheet_save_to_list, x6(this.t)) : new ResText(R.string.bottom_sheet_copy_to_list);
        }
        String str = this.m;
        Intrinsics.e(str);
        return new PlainText(str);
    }

    @Override // au.com.woolworths.views.horizontalselector.HorizontalSelectorViewListener
    public final void z2(int i) {
        this.t = i;
        MutableLiveData mutableLiveData = this.i;
        E6(this, mutableLiveData, null, null, i, 0, null, false, null, null, 251);
        E6(this, mutableLiveData, y6(), null, 0, 0, null, false, null, null, 254);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object z6(au.com.woolworths.shop.lists.data.model.ShoppingList r11, java.util.List r12, kotlin.coroutines.jvm.internal.ContinuationImpl r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof au.com.woolworths.shop.addtolist.add.AddToListBottomSheetViewModel$multipleAddToList$1
            if (r0 == 0) goto L13
            r0 = r13
            au.com.woolworths.shop.addtolist.add.AddToListBottomSheetViewModel$multipleAddToList$1 r0 = (au.com.woolworths.shop.addtolist.add.AddToListBottomSheetViewModel$multipleAddToList$1) r0
            int r1 = r0.u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.u = r1
            goto L18
        L13:
            au.com.woolworths.shop.addtolist.add.AddToListBottomSheetViewModel$multipleAddToList$1 r0 = new au.com.woolworths.shop.addtolist.add.AddToListBottomSheetViewModel$multipleAddToList$1
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.s
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.u
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.util.Iterator r11 = r0.r
            java.util.List r12 = r0.q
            java.util.List r12 = (java.util.List) r12
            au.com.woolworths.shop.lists.data.model.ShoppingList r2 = r0.p
            kotlin.ResultKt.b(r13)
            r13 = r12
            r12 = r2
            goto L47
        L31:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L39:
            kotlin.ResultKt.b(r13)
            r13 = r12
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.util.Iterator r13 = r13.iterator()
            r9 = r12
            r12 = r11
            r11 = r13
            r13 = r9
        L47:
            boolean r2 = r11.hasNext()
            if (r2 == 0) goto L77
            java.lang.Object r2 = r11.next()
            au.com.woolworths.shop.addtolist.models.AddToListProductParameters r2 = (au.com.woolworths.shop.addtolist.models.AddToListProductParameters) r2
            au.com.woolworths.product.models.ProductCard r4 = r2.d
            java.lang.Float r2 = r2.f
            if (r2 == 0) goto L6f
            float r2 = r2.floatValue()
            r0.p = r12
            r5 = r13
            java.util.List r5 = (java.util.List) r5
            r0.q = r5
            r0.r = r11
            r0.u = r3
            java.lang.Object r2 = r10.r6(r12, r4, r2, r0)
            if (r2 != r1) goto L47
            return r1
        L6f:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "Quantity should not be null when passing multiple products to be added"
            r11.<init>(r12)
            throw r11
        L77:
            java.lang.String r1 = r12.getId()
            java.lang.String r2 = r12.getTitle()
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.util.ArrayList r5 = new java.util.ArrayList
            r11 = 10
            int r11 = kotlin.collections.CollectionsKt.s(r13, r11)
            r5.<init>(r11)
            java.util.Iterator r11 = r13.iterator()
        L90:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto La2
            java.lang.Object r12 = r11.next()
            au.com.woolworths.shop.addtolist.models.AddToListProductParameters r12 = (au.com.woolworths.shop.addtolist.models.AddToListProductParameters) r12
            au.com.woolworths.product.models.ProductCard r12 = r12.d
            r5.add(r12)
            goto L90
        La2:
            au.com.woolworths.shop.addtolist.models.ListChangeEvent$AddToListSuccessEvent r0 = new au.com.woolworths.shop.addtolist.models.ListChangeEvent$AddToListSuccessEvent
            r4 = 0
            r7 = 0
            r3 = 0
            r6 = 0
            r8 = 108(0x6c, float:1.51E-43)
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            au.com.woolworths.shop.addtolist.add.AddToListBottomSheetContract$Actions$AddToListSuccess r11 = new au.com.woolworths.shop.addtolist.add.AddToListBottomSheetContract$Actions$AddToListSuccess
            r11.<init>(r0)
            r10.u6(r11)
            kotlin.Unit r11 = kotlin.Unit.f24250a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.addtolist.add.AddToListBottomSheetViewModel.z6(au.com.woolworths.shop.lists.data.model.ShoppingList, java.util.List, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
