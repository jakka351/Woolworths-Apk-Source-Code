package au.com.woolworths.feature.product.list.compose.filter.child;

import android.content.Context;
import androidx.compose.material.ScaffoldState;
import androidx.compose.material.SnackbarHostState;
import au.com.woolworths.android.onesite.extensions.ContextExtKt;
import au.com.woolworths.feature.product.list.ProductListOptionsContract;
import au.com.woolworths.feature.product.list.ProductListOptionsViewModel;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.product.list.compose.filter.child.ProductListChildFilterScreenKt$ProductListChildFilterScreen$3$1", f = "ProductListChildFilterScreen.kt", l = {115, 123}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class ProductListChildFilterScreenKt$ProductListChildFilterScreen$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ ProductListOptionsViewModel q;
    public final /* synthetic */ ScaffoldState r;
    public final /* synthetic */ Context s;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lau/com/woolworths/feature/product/list/ProductListOptionsContract$Actions;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.product.list.compose.filter.child.ProductListChildFilterScreenKt$ProductListChildFilterScreen$3$1$1", f = "ProductListChildFilterScreen.kt", l = {117}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.product.list.compose.filter.child.ProductListChildFilterScreenKt$ProductListChildFilterScreen$3$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<ProductListOptionsContract.Actions, Continuation<? super Unit>, Object> {
        public int p;
        public /* synthetic */ Object q;
        public final /* synthetic */ ScaffoldState r;
        public final /* synthetic */ Context s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ScaffoldState scaffoldState, Context context, Continuation continuation) {
            super(2, continuation);
            this.r = scaffoldState;
            this.s = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.r, this.s, continuation);
            anonymousClass1.q = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((ProductListOptionsContract.Actions) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            if (i == 0) {
                ResultKt.b(obj);
                ProductListOptionsContract.Actions actions = (ProductListOptionsContract.Actions) this.q;
                if (actions instanceof ProductListOptionsContract.Actions.ShowMessage) {
                    SnackbarHostState snackbarHostState = this.r.f1319a;
                    String string = ((ProductListOptionsContract.Actions.ShowMessage) actions).f5256a.getText(this.s).toString();
                    this.p = 1;
                    if (SnackbarHostState.b(snackbarHostState, string, null, null, this, 6) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
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

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lau/com/woolworths/feature/product/list/ProductListOptionsContract$FilterOptionsActions;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.product.list.compose.filter.child.ProductListChildFilterScreenKt$ProductListChildFilterScreen$3$1$2", f = "ProductListChildFilterScreen.kt", l = {}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.product.list.compose.filter.child.ProductListChildFilterScreenKt$ProductListChildFilterScreen$3$1$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements Function2<ProductListOptionsContract.FilterOptionsActions, Continuation<? super Unit>, Object> {
        public /* synthetic */ Object p;
        public final /* synthetic */ Context q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Context context, Continuation continuation) {
            super(2, continuation);
            this.q = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.q, continuation);
            anonymousClass2.p = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass2 anonymousClass2 = (AnonymousClass2) create((ProductListOptionsContract.FilterOptionsActions) obj, (Continuation) obj2);
            Unit unit = Unit.f24250a;
            anonymousClass2.invokeSuspend(unit);
            return unit;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            ResultKt.b(obj);
            ProductListOptionsContract.FilterOptionsActions filterOptionsActions = (ProductListOptionsContract.FilterOptionsActions) this.p;
            if (!(filterOptionsActions instanceof ProductListOptionsContract.FilterOptionsActions.OpenUrl)) {
                throw new NoWhenBranchMatchedException();
            }
            ContextExtKt.e(this.q, ((ProductListOptionsContract.FilterOptionsActions.OpenUrl) filterOptionsActions).f5257a);
            return Unit.f24250a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductListChildFilterScreenKt$ProductListChildFilterScreen$3$1(ProductListOptionsViewModel productListOptionsViewModel, ScaffoldState scaffoldState, Context context, Continuation continuation) {
        super(2, continuation);
        this.q = productListOptionsViewModel;
        this.r = scaffoldState;
        this.s = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ProductListChildFilterScreenKt$ProductListChildFilterScreen$3$1(this.q, this.r, this.s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ProductListChildFilterScreenKt$ProductListChildFilterScreen$3$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt.h(r9, r1, r8) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r8.p
            r2 = 0
            android.content.Context r3 = r8.s
            au.com.woolworths.feature.product.list.ProductListOptionsViewModel r4 = r8.q
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L21
            if (r1 == r6) goto L1d
            if (r1 != r5) goto L15
            kotlin.ResultKt.b(r9)
            goto L46
        L15:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1d:
            kotlin.ResultKt.b(r9)
            goto L36
        L21:
            kotlin.ResultKt.b(r9)
            kotlinx.coroutines.flow.SharedFlow r9 = r4.n
            au.com.woolworths.feature.product.list.compose.filter.child.ProductListChildFilterScreenKt$ProductListChildFilterScreen$3$1$1 r1 = new au.com.woolworths.feature.product.list.compose.filter.child.ProductListChildFilterScreenKt$ProductListChildFilterScreen$3$1$1
            androidx.compose.material.ScaffoldState r7 = r8.r
            r1.<init>(r7, r3, r2)
            r8.p = r6
            java.lang.Object r9 = kotlinx.coroutines.flow.FlowKt.h(r9, r1, r8)
            if (r9 != r0) goto L36
            goto L45
        L36:
            kotlinx.coroutines.flow.SharedFlow r9 = r4.l
            au.com.woolworths.feature.product.list.compose.filter.child.ProductListChildFilterScreenKt$ProductListChildFilterScreen$3$1$2 r1 = new au.com.woolworths.feature.product.list.compose.filter.child.ProductListChildFilterScreenKt$ProductListChildFilterScreen$3$1$2
            r1.<init>(r3, r2)
            r8.p = r5
            java.lang.Object r9 = kotlinx.coroutines.flow.FlowKt.h(r9, r1, r8)
            if (r9 != r0) goto L46
        L45:
            return r0
        L46:
            kotlin.Unit r9 = kotlin.Unit.f24250a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.product.list.compose.filter.child.ProductListChildFilterScreenKt$ProductListChildFilterScreen$3$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
