package au.com.woolworths.feature.shop.myorders.details.yourgroceries;

import au.com.woolworths.feature.shop.myorders.details.yourgroceries.YourGroceriesContract;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.myorders.details.yourgroceries.YourGroceriesViewModel$rateSubstitution$1", f = "YourGroceriesViewModel.kt", l = {199, 208}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes3.dex */
final class YourGroceriesViewModel$rateSubstitution$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public MutableStateFlow p;
    public YourGroceriesViewModel q;
    public Object r;
    public YourGroceriesContract.ViewState s;
    public int t;
    public final /* synthetic */ YourGroceriesViewModel u;
    public final /* synthetic */ String v;
    public final /* synthetic */ boolean w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YourGroceriesViewModel$rateSubstitution$1(YourGroceriesViewModel yourGroceriesViewModel, String str, boolean z, Continuation continuation) {
        super(2, continuation);
        this.u = yourGroceriesViewModel;
        this.v = str;
        this.w = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new YourGroceriesViewModel$rateSubstitution$1(this.u, this.v, this.w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((YourGroceriesViewModel$rateSubstitution$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003b, code lost:
    
        if (r15.a(r1, r4, r2, r14) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
    
        if (r15 != r0) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005b, code lost:
    
        return r0;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0059 -> B:7:0x001d). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r14.t
            boolean r2 = r14.w
            r3 = 2
            java.lang.String r4 = r14.v
            r5 = 1
            au.com.woolworths.feature.shop.myorders.details.yourgroceries.YourGroceriesViewModel r6 = r14.u
            if (r1 == 0) goto L2e
            if (r1 == r5) goto L2a
            if (r1 != r3) goto L22
            au.com.woolworths.feature.shop.myorders.details.yourgroceries.YourGroceriesContract$ViewState r1 = r14.s
            java.lang.Object r5 = r14.r
            au.com.woolworths.feature.shop.myorders.details.yourgroceries.YourGroceriesViewModel r7 = r14.q
            kotlinx.coroutines.flow.MutableStateFlow r8 = r14.p
            kotlin.ResultKt.b(r15)
        L1d:
            r13 = r7
            r7 = r1
            r1 = r13
            r13 = r8
            goto L5c
        L22:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L2a:
            kotlin.ResultKt.b(r15)
            goto L3e
        L2e:
            kotlin.ResultKt.b(r15)
            au.com.woolworths.feature.shop.myorders.details.substitutionrating.SubstitutionRatingRepository r15 = r6.h
            java.lang.String r1 = r6.e
            r14.t = r5
            java.lang.Object r15 = r15.a(r1, r4, r2, r14)
            if (r15 != r0) goto L3e
            goto L5b
        L3e:
            kotlinx.coroutines.flow.MutableStateFlow r15 = r6.j
            r8 = r15
            r7 = r6
        L42:
            java.lang.Object r5 = r8.getValue()
            r1 = r5
            au.com.woolworths.feature.shop.myorders.details.yourgroceries.YourGroceriesContract$ViewState r1 = (au.com.woolworths.feature.shop.myorders.details.yourgroceries.YourGroceriesContract.ViewState) r1
            java.util.List r15 = r1.b
            r14.p = r8
            r14.q = r7
            r14.r = r5
            r14.s = r1
            r14.t = r3
            java.lang.Object r15 = r7.t6(r15, r14)
            if (r15 != r0) goto L1d
        L5b:
            return r0
        L5c:
            r11 = r15
            java.util.Map r11 = (java.util.Map) r11
            r12 = 31
            r8 = 0
            r9 = 0
            r10 = 0
            au.com.woolworths.feature.shop.myorders.details.yourgroceries.YourGroceriesContract$ViewState r15 = au.com.woolworths.feature.shop.myorders.details.yourgroceries.YourGroceriesContract.ViewState.a(r7, r8, r9, r10, r11, r12)
            boolean r15 = r13.d(r5, r15)
            if (r15 == 0) goto L9f
            kotlinx.coroutines.flow.SharedFlowImpl r15 = r6.l
            au.com.woolworths.android.onesite.analytics.AnalyticsManager r0 = r6.f
            au.com.woolworths.feature.shop.myorders.details.yourgroceries.YourGroceriesContract$Action$ShowRatingSuccess r1 = au.com.woolworths.feature.shop.myorders.details.yourgroceries.YourGroceriesContract.Action.ShowRatingSuccess.f7815a
            r15.f(r1)
            java.lang.String r15 = "productID"
            if (r2 == 0) goto L8c
            au.com.woolworths.analytics.supers.orderdetails.YourGroceriesAnalytics$YourGroceries$Action$Companion r1 = au.com.woolworths.analytics.supers.orderdetails.YourGroceriesAnalytics.YourGroceries.Action.d
            r1.getClass()
            kotlin.jvm.internal.Intrinsics.h(r4, r15)
            au.com.woolworths.analytics.supers.orderdetails.YourGroceriesAnalytics$YourGroceries$Action$Companion$rateSubstituteUpClick$1 r15 = new au.com.woolworths.analytics.supers.orderdetails.YourGroceriesAnalytics$YourGroceries$Action$Companion$rateSubstituteUpClick$1
            r15.<init>(r4)
            r0.g(r15)
            goto L9c
        L8c:
            au.com.woolworths.analytics.supers.orderdetails.YourGroceriesAnalytics$YourGroceries$Action$Companion r1 = au.com.woolworths.analytics.supers.orderdetails.YourGroceriesAnalytics.YourGroceries.Action.d
            r1.getClass()
            kotlin.jvm.internal.Intrinsics.h(r4, r15)
            au.com.woolworths.analytics.supers.orderdetails.YourGroceriesAnalytics$YourGroceries$Action$Companion$rateSubstituteDownClick$1 r15 = new au.com.woolworths.analytics.supers.orderdetails.YourGroceriesAnalytics$YourGroceries$Action$Companion$rateSubstituteDownClick$1
            r15.<init>(r4)
            r0.g(r15)
        L9c:
            kotlin.Unit r15 = kotlin.Unit.f24250a
            return r15
        L9f:
            r7 = r1
            r8 = r13
            goto L42
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.myorders.details.yourgroceries.YourGroceriesViewModel$rateSubstitution$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
