package au.com.woolworths.feature.shop.myorders.orders.list;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.myorders.orders.list.OrdersListViewModel$fetchOrders$1", f = "OrdersListViewModel.kt", l = {75, 76}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class OrdersListViewModel$fetchOrders$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ OrdersListViewModel q;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[OrdersTab.values().length];
            try {
                iArr[OrdersTab.g.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OrdersTab.f.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OrdersTab.e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrdersListViewModel$fetchOrders$1(OrdersListViewModel ordersListViewModel, Continuation continuation) {
        super(2, continuation);
        this.q = ordersListViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrdersListViewModel$fetchOrders$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((OrdersListViewModel$fetchOrders$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0059, code lost:
    
        if (r13 == r2) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006b, code lost:
    
        if (r13 == r2) goto L26;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            au.com.woolworths.feature.shop.myorders.orders.list.OrdersListViewModel r0 = r12.q
            androidx.lifecycle.MutableLiveData r1 = r0.h
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r3 = r12.p
            r4 = 0
            r5 = 0
            java.lang.String r6 = "OrdersListViewModel"
            java.lang.String r7 = "ordersTab"
            r8 = 2
            r9 = 1
            if (r3 == 0) goto L26
            if (r3 == r9) goto L22
            if (r3 != r8) goto L1a
            kotlin.ResultKt.b(r13)
            goto L6e
        L1a:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L22:
            kotlin.ResultKt.b(r13)
            goto L5c
        L26:
            kotlin.ResultKt.b(r13)
            timber.log.Timber$Forest r13 = timber.log.Timber.f27013a
            r13.s(r6)
            au.com.woolworths.feature.shop.myorders.orders.list.OrdersTab r3 = r0.g
            if (r3 == 0) goto Lae
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "Fetching: "
            r10.<init>(r11)
            r10.append(r3)
            java.lang.String r3 = r10.toString()
            java.lang.Object[] r10 = new java.lang.Object[r5]
            r13.m(r3, r10)
            au.com.woolworths.feature.shop.myorders.orders.list.OrdersTab r13 = r0.g
            if (r13 == 0) goto Laa
            int r13 = r13.ordinal()
            if (r13 == 0) goto La2
            if (r13 == r9) goto L65
            if (r13 != r8) goto L5f
            r12.p = r9
            java.lang.Object r13 = r0.t6(r9, r12)
            if (r13 != r2) goto L5c
            goto L6d
        L5c:
            au.com.woolworths.feature.shop.myorders.orders.list.OrderListContract$ViewState r13 = (au.com.woolworths.feature.shop.myorders.orders.list.OrderListContract.ViewState) r13
            goto L70
        L5f:
            kotlin.NoWhenBranchMatchedException r13 = new kotlin.NoWhenBranchMatchedException
            r13.<init>()
            throw r13
        L65:
            r12.p = r8
            java.lang.Object r13 = au.com.woolworths.feature.shop.myorders.orders.list.OrdersListViewModel.p6(r0, r12)
            if (r13 != r2) goto L6e
        L6d:
            return r2
        L6e:
            au.com.woolworths.feature.shop.myorders.orders.list.OrderListContract$ViewState r13 = (au.com.woolworths.feature.shop.myorders.orders.list.OrderListContract.ViewState) r13
        L70:
            r1.m(r13)
            timber.log.Timber$Forest r13 = timber.log.Timber.f27013a
            r13.s(r6)
            au.com.woolworths.feature.shop.myorders.orders.list.OrdersTab r0 = r0.g
            if (r0 == 0) goto L9e
            java.lang.Object r1 = r1.e()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Fetch Completed: "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = " "
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            java.lang.Object[] r1 = new java.lang.Object[r5]
            r13.m(r0, r1)
            kotlin.Unit r13 = kotlin.Unit.f24250a
            return r13
        L9e:
            kotlin.jvm.internal.Intrinsics.p(r7)
            throw r4
        La2:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "Shouldn't fetch guest users"
            r13.<init>(r0)
            throw r13
        Laa:
            kotlin.jvm.internal.Intrinsics.p(r7)
            throw r4
        Lae:
            kotlin.jvm.internal.Intrinsics.p(r7)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.myorders.orders.list.OrdersListViewModel$fetchOrders$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
