package au.com.woolworths.shop.ratings.and.reviews.submitreviews;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.ratings.and.reviews.submitreviews.SubmitReviewViewModel$onSubmitButtonClicked$1", f = "SubmitReviewViewModel.kt", l = {318, 336}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes4.dex */
final class SubmitReviewViewModel$onSubmitButtonClicked$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ Integer q;
    public final /* synthetic */ String r;
    public final /* synthetic */ String s;
    public final /* synthetic */ String t;
    public final /* synthetic */ Boolean u;
    public final /* synthetic */ SubmitReviewViewModel v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubmitReviewViewModel$onSubmitButtonClicked$1(Integer num, String str, String str2, String str3, Boolean bool, SubmitReviewViewModel submitReviewViewModel, Continuation continuation) {
        super(2, continuation);
        this.q = num;
        this.r = str;
        this.s = str2;
        this.t = str3;
        this.u = bool;
        this.v = submitReviewViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SubmitReviewViewModel$onSubmitButtonClicked$1(this.q, this.r, this.s, this.t, this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((SubmitReviewViewModel$onSubmitButtonClicked$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0069, code lost:
    
        if (r4.r6(r14) == r0) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006c A[Catch: ServerErrorException -> 0x0070, NoConnectivityException -> 0x0074, TRY_LEAVE, TryCatch #2 {NoConnectivityException -> 0x0074, ServerErrorException -> 0x0070, blocks: (B:6:0x000e, B:10:0x001b, B:26:0x005a, B:28:0x005f, B:30:0x0063, B:33:0x006c, B:13:0x0022, B:15:0x0027, B:17:0x002b, B:19:0x002f, B:23:0x0037), top: B:39:0x0008 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) throws java.lang.Exception {
        /*
            r14 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r14.p
            r2 = 2
            r3 = 1
            au.com.woolworths.shop.ratings.and.reviews.submitreviews.SubmitReviewViewModel r4 = r14.v
            if (r1 == 0) goto L1f
            if (r1 == r3) goto L1b
            if (r1 != r2) goto L13
            kotlin.ResultKt.b(r15)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L70 au.com.woolworths.android.onesite.network.NoConnectivityException -> L74
            goto L95
        L13:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L1b:
            kotlin.ResultKt.b(r15)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L70 au.com.woolworths.android.onesite.network.NoConnectivityException -> L74
            goto L5a
        L1f:
            kotlin.ResultKt.b(r15)
            java.lang.Integer r15 = r14.q     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L70 au.com.woolworths.android.onesite.network.NoConnectivityException -> L74
            r1 = 0
            if (r15 == 0) goto L5d
            java.lang.String r5 = r14.r     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L70 au.com.woolworths.android.onesite.network.NoConnectivityException -> L74
            if (r5 == 0) goto L5d
            java.lang.String r5 = r14.s     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L70 au.com.woolworths.android.onesite.network.NoConnectivityException -> L74
            if (r5 == 0) goto L5d
            java.lang.String r5 = r14.t     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L70 au.com.woolworths.android.onesite.network.NoConnectivityException -> L74
            if (r5 == 0) goto L5d
            java.lang.Boolean r5 = r14.u
            if (r5 == 0) goto L5d
            au.com.woolworths.shop.ratings.and.reviews.submitreviews.SubmitReviewInteractor r1 = r4.g     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L70 au.com.woolworths.android.onesite.network.NoConnectivityException -> L74
            au.com.woolworths.shop.graphql.type.SubmitProductReviewInput r6 = new au.com.woolworths.shop.graphql.type.SubmitProductReviewInput     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L70 au.com.woolworths.android.onesite.network.NoConnectivityException -> L74
            java.lang.String r7 = r4.e     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L70 au.com.woolworths.android.onesite.network.NoConnectivityException -> L74
            int r15 = r15.intValue()     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L70 au.com.woolworths.android.onesite.network.NoConnectivityException -> L74
            double r8 = (double) r15     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L70 au.com.woolworths.android.onesite.network.NoConnectivityException -> L74
            java.lang.String r10 = r14.r     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L70 au.com.woolworths.android.onesite.network.NoConnectivityException -> L74
            java.lang.String r11 = r14.s     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L70 au.com.woolworths.android.onesite.network.NoConnectivityException -> L74
            java.lang.String r12 = r14.t     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L70 au.com.woolworths.android.onesite.network.NoConnectivityException -> L74
            boolean r13 = r5.booleanValue()     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L70 au.com.woolworths.android.onesite.network.NoConnectivityException -> L74
            r6.<init>(r7, r8, r10, r11, r12, r13)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L70 au.com.woolworths.android.onesite.network.NoConnectivityException -> L74
            r14.p = r3     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L70 au.com.woolworths.android.onesite.network.NoConnectivityException -> L74
            au.com.woolworths.shop.ratings.and.reviews.submitreviews.SubmitReviewRepository r15 = r1.f12776a     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L70 au.com.woolworths.android.onesite.network.NoConnectivityException -> L74
            java.lang.Object r15 = r15.a(r6, r14)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L70 au.com.woolworths.android.onesite.network.NoConnectivityException -> L74
            if (r15 != r0) goto L5a
            goto L6b
        L5a:
            r1 = r15
            au.com.woolworths.shop.ratings.and.reviews.data.SubmitReviewResponse r1 = (au.com.woolworths.shop.ratings.and.reviews.data.SubmitReviewResponse) r1     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L70 au.com.woolworths.android.onesite.network.NoConnectivityException -> L74
        L5d:
            if (r1 == 0) goto L6c
            boolean r15 = r1.f12734a     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L70 au.com.woolworths.android.onesite.network.NoConnectivityException -> L74
            if (r15 != r3) goto L6c
            r14.p = r2     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L70 au.com.woolworths.android.onesite.network.NoConnectivityException -> L74
            java.lang.Object r15 = r4.r6(r14)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L70 au.com.woolworths.android.onesite.network.NoConnectivityException -> L74
            if (r15 != r0) goto L95
        L6b:
            return r0
        L6c:
            au.com.woolworths.shop.ratings.and.reviews.submitreviews.SubmitReviewViewModel.p6(r4)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L70 au.com.woolworths.android.onesite.network.NoConnectivityException -> L74
            goto L95
        L70:
            au.com.woolworths.shop.ratings.and.reviews.submitreviews.SubmitReviewViewModel.p6(r4)
            goto L95
        L74:
            kotlinx.coroutines.flow.MutableStateFlow r15 = r4.j
            java.lang.Object r0 = r15.getValue()
            au.com.woolworths.shop.ratings.and.reviews.submitreviews.SubmitReviewContract$ViewState r0 = (au.com.woolworths.shop.ratings.and.reviews.submitreviews.SubmitReviewContract.ViewState) r0
            au.com.woolworths.shop.ratings.and.reviews.submitreviews.SubmitReviewContract$ViewState$Failure r0 = new au.com.woolworths.shop.ratings.and.reviews.submitreviews.SubmitReviewContract$ViewState$Failure
            au.com.woolworths.android.onesite.models.text.ResText r1 = new au.com.woolworths.android.onesite.models.text.ResText
            r2 = 2132019787(0x7f140a4b, float:1.9677919E38)
            r1.<init>(r2)
            au.com.woolworths.shop.ratings.and.reviews.submitreviews.a r2 = new au.com.woolworths.shop.ratings.and.reviews.submitreviews.a
            r3 = 3
            r2.<init>(r4, r3)
            r3 = 4
            au.com.woolworths.foundation.ui.fullpagemessage.legacy.FullPageMessage$Error$ConnectionError r4 = au.com.woolworths.foundation.ui.fullpagemessage.legacy.FullPageMessage.Error.ConnectionError.f8919a
            r0.<init>(r4, r1, r2, r3)
            r15.setValue(r0)
        L95:
            kotlin.Unit r15 = kotlin.Unit.f24250a
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.ratings.and.reviews.submitreviews.SubmitReviewViewModel$onSubmitButtonClicked$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
