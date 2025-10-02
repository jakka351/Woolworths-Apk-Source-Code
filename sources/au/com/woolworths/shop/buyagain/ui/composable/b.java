package au.com.woolworths.shop.buyagain.ui.composable;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.shop.buyagain.domain.BuyAgainProductList;
import au.com.woolworths.shop.product.details.ProductDetailsActivity$setViewContent$1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Function1 {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ List e;
    public final /* synthetic */ Function1 f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ Function2 i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ boolean k;
    public final /* synthetic */ Function1 l;
    public final /* synthetic */ Function1 m;
    public final /* synthetic */ Function1 n;
    public final /* synthetic */ Function1 o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ Function u;

    public /* synthetic */ b(List list, Function1 function1, Function0 function0, boolean z, boolean z2, PagerState pagerState, Function2 function2, ProductDetailsActivity$setViewContent$1.AnonymousClass1.AnonymousClass2 anonymousClass2, boolean z3, boolean z4, List list2, LazyListState lazyListState, Function1 function12, Function1 function13, Function0 function02, Function1 function14, Function1 function15) {
        this.e = list;
        this.f = function1;
        this.p = function0;
        this.g = z;
        this.h = z2;
        this.q = pagerState;
        this.i = function2;
        this.r = anonymousClass2;
        this.j = z3;
        this.k = z4;
        this.s = list2;
        this.t = lazyListState;
        this.l = function12;
        this.m = function13;
        this.u = function02;
        this.n = function14;
        this.o = function15;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                BuyAgainProductList buyAgainProductList = (BuyAgainProductList) this.p;
                final Map map = (Map) this.q;
                final Set set = (Set) this.t;
                final Function2 function2 = (Function2) this.u;
                final Function1 function1 = (Function1) this.r;
                final Function1 function12 = (Function1) this.s;
                LazyListScope LazyColumn = (LazyListScope) obj;
                Intrinsics.h(LazyColumn, "$this$LazyColumn");
                if (this.g) {
                    for (int i = 0; i < 11; i++) {
                        LazyListScope.i(LazyColumn, null, null, ComposableSingletons$BuyAgainScreenContentKt.f10279a, 3);
                    }
                } else {
                    List list = buyAgainProductList.c.f10259a;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : list) {
                        if (obj2 instanceof ProductCard) {
                            arrayList.add(obj2);
                        }
                    }
                    HashSet hashSet = new HashSet();
                    final ArrayList arrayList2 = new ArrayList();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        if (hashSet.add(((ProductCard) next).getProductId())) {
                            arrayList2.add(next);
                        }
                    }
                    final au.com.woolworths.shop.aem.components.ui.merchcard.a aVar = new au.com.woolworths.shop.aem.components.ui.merchcard.a(18);
                    int size = arrayList2.size();
                    Function1<Integer, Object> function13 = new Function1<Integer, Object>() { // from class: au.com.woolworths.shop.buyagain.ui.composable.BuyAgainScreenContentKt$BuyAgainScreenContent$lambda$34$lambda$31$lambda$30$lambda$29$$inlined$items$default$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            return aVar.invoke(arrayList2.get(((Number) obj3).intValue()));
                        }
                    };
                    Function1<Integer, Object> function14 = new Function1<Integer, Object>() { // from class: au.com.woolworths.shop.buyagain.ui.composable.BuyAgainScreenContentKt$BuyAgainScreenContent$lambda$34$lambda$31$lambda$30$lambda$29$$inlined$items$default$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            arrayList2.get(((Number) obj3).intValue());
                            return null;
                        }
                    };
                    final Function1 function15 = this.f;
                    final List list2 = this.e;
                    final boolean z = this.h;
                    final boolean z2 = this.j;
                    final Function1 function16 = this.l;
                    final Function2 function22 = this.i;
                    final Function1 function17 = this.m;
                    final Function1 function18 = this.n;
                    final Function1 function19 = this.o;
                    final boolean z3 = this.k;
                    LazyColumn.b(size, function13, function14, new ComposableLambdaImpl(new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.buyagain.ui.composable.BuyAgainScreenContentKt$BuyAgainScreenContent$lambda$34$lambda$31$lambda$30$lambda$29$$inlined$items$default$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(4);
                        }

                        /* JADX WARN: Removed duplicated region for block: B:25:0x006b A[PHI: r1
  0x006b: PHI (r1v31 java.lang.Double) = (r1v13 java.lang.Double), (r1v16 java.lang.Double) binds: [B:24:0x0069, B:30:0x007c] A[DONT_GENERATE, DONT_INLINE]] */
                        @Override // kotlin.jvm.functions.Function4
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final java.lang.Object invoke(java.lang.Object r29, java.lang.Object r30, java.lang.Object r31, java.lang.Object r32) {
                            /*
                                Method dump skipped, instructions count: 546
                                To view this dump change 'Code comments level' option to 'DEBUG'
                            */
                            throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.buyagain.ui.composable.BuyAgainScreenContentKt$BuyAgainScreenContent$lambda$34$lambda$31$lambda$30$lambda$29$$inlined$items$default$4.invoke(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
                        }
                    }, true, -632812321));
                }
                break;
            default:
                final Function0 function0 = (Function0) this.p;
                final PagerState pagerState = (PagerState) this.q;
                final ProductDetailsActivity$setViewContent$1.AnonymousClass1.AnonymousClass2 anonymousClass2 = (ProductDetailsActivity$setViewContent$1.AnonymousClass1.AnonymousClass2) this.r;
                final List list3 = (List) this.s;
                final LazyListState lazyListState = (LazyListState) this.t;
                final Function0 function02 = (Function0) this.u;
                LazyListScope LazyColumn2 = (LazyListScope) obj;
                Intrinsics.h(LazyColumn2, "$this$LazyColumn");
                final List list4 = this.e;
                if (!list4.isEmpty()) {
                    int size2 = list4.size();
                    Function1<Integer, Object> function110 = new Function1<Integer, Object>() { // from class: au.com.woolworths.shop.product.details.ui.ProductDetailsScreenKt$ProductDetailsUIContent$lambda$32$lambda$27$lambda$26$$inlined$itemsIndexed$default$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            list4.get(((Number) obj3).intValue());
                            return null;
                        }
                    };
                    final Function1 function111 = this.f;
                    final boolean z4 = this.g;
                    final boolean z5 = this.h;
                    final Function2 function23 = this.i;
                    final boolean z6 = this.j;
                    final boolean z7 = this.k;
                    final Function1 function112 = this.l;
                    final Function1 function113 = this.m;
                    final Function1 function114 = this.n;
                    final Function1 function115 = this.o;
                    LazyColumn2.b(size2, null, function110, new ComposableLambdaImpl(new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.product.details.ui.ProductDetailsScreenKt$ProductDetailsUIContent$lambda$32$lambda$27$lambda$26$$inlined$itemsIndexed$default$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(4);
                        }

                        /*  JADX ERROR: Type inference failed
                            jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
                            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
                            */
                        @Override // kotlin.jvm.functions.Function4
                        public final java.lang.Object invoke(java.lang.Object r25, java.lang.Object r26, java.lang.Object r27, java.lang.Object r28) {
                            /*
                                Method dump skipped, instructions count: 1156
                                To view this dump change 'Code comments level' option to 'DEBUG'
                            */
                            throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.product.details.ui.ProductDetailsScreenKt$ProductDetailsUIContent$lambda$32$lambda$27$lambda$26$$inlined$itemsIndexed$default$3.invoke(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
                        }
                    }, true, -1091073711));
                }
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ b(boolean z, BuyAgainProductList buyAgainProductList, Map map, Function1 function1, Set set, List list, boolean z2, boolean z3, Function1 function12, Function2 function2, Function2 function22, Function1 function13, Function1 function14, Function1 function15, Function1 function16, boolean z4, Function1 function17) {
        this.g = z;
        this.p = buyAgainProductList;
        this.q = map;
        this.f = function1;
        this.t = set;
        this.e = list;
        this.h = z2;
        this.j = z3;
        this.l = function12;
        this.i = function2;
        this.u = function22;
        this.m = function13;
        this.n = function14;
        this.o = function15;
        this.r = function16;
        this.k = z4;
        this.s = function17;
    }
}
