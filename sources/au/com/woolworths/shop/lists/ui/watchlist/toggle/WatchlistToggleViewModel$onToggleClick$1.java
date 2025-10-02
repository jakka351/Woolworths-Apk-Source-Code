package au.com.woolworths.shop.lists.ui.watchlist.toggle;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.lists.ui.watchlist.toggle.WatchlistToggleViewModel$onToggleClick$1", f = "WatchlistToggleViewModel.kt", l = {123, 142}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class WatchlistToggleViewModel$onToggleClick$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ WatchlistToggleViewModel q;
    public final /* synthetic */ boolean r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WatchlistToggleViewModel$onToggleClick$1(WatchlistToggleViewModel watchlistToggleViewModel, boolean z, Continuation continuation) {
        super(2, continuation);
        this.q = watchlistToggleViewModel;
        this.r = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WatchlistToggleViewModel$onToggleClick$1(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((WatchlistToggleViewModel$onToggleClick$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006b, code lost:
    
        if (r1.emit(r2, r11) == r0) goto L21;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r11.p
            boolean r2 = r11.r
            r3 = 2
            r4 = 1
            au.com.woolworths.shop.lists.ui.watchlist.toggle.WatchlistToggleViewModel r5 = r11.q
            if (r1 == 0) goto L20
            if (r1 == r4) goto L1c
            if (r1 != r3) goto L14
            kotlin.ResultKt.b(r12)
            goto L6e
        L14:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L1c:
            kotlin.ResultKt.b(r12)
            goto L35
        L20:
            kotlin.ResultKt.b(r12)
            kotlinx.coroutines.flow.MutableStateFlow r6 = r5.k
            r9 = 1
            r10 = 3
            r7 = 0
            r8 = 0
            au.com.woolworths.shop.lists.ui.watchlist.toggle.WatchlistToggleViewModel.r6(r5, r6, r7, r8, r9, r10)
            r11.p = r4
            java.lang.Object r12 = au.com.woolworths.shop.lists.ui.watchlist.toggle.WatchlistToggleViewModel.p6(r5, r2, r11)
            if (r12 != r0) goto L35
            goto L6d
        L35:
            au.com.woolworths.feature.shop.notification.preferences.models.PreferencesData r12 = (au.com.woolworths.feature.shop.notification.preferences.models.PreferencesData) r12
            kotlinx.coroutines.flow.MutableStateFlow r6 = r5.k
            r9 = 0
            r10 = 3
            r7 = 0
            r8 = 0
            au.com.woolworths.shop.lists.ui.watchlist.toggle.WatchlistToggleViewModel.r6(r5, r6, r7, r8, r9, r10)
            if (r12 != 0) goto L55
            au.com.woolworths.android.onesite.analytics.AnalyticsManager r12 = r5.i
            au.com.woolworths.analytics.supers.lists.WatchlistAnalytics$List$Action$Companion r1 = au.com.woolworths.analytics.supers.lists.WatchlistAnalytics.List.Action.d
            r1.getClass()
            au.com.woolworths.analytics.supers.lists.WatchlistAnalytics$List$Action$Companion$toggleErrorSnackbar$1 r1 = new au.com.woolworths.analytics.supers.lists.WatchlistAnalytics$List$Action$Companion$toggleErrorSnackbar$1
            r1.<init>()
            r12.g(r1)
            r12 = 2132019335(0x7f140887, float:1.9677002E38)
            goto L5e
        L55:
            if (r2 == 0) goto L5b
            r12 = 2132019337(0x7f140889, float:1.9677006E38)
            goto L5e
        L5b:
            r12 = 2132019336(0x7f140888, float:1.9677004E38)
        L5e:
            kotlinx.coroutines.flow.SharedFlowImpl r1 = r5.l
            au.com.woolworths.android.onesite.models.text.ResText r2 = new au.com.woolworths.android.onesite.models.text.ResText
            r2.<init>(r12)
            r11.p = r3
            java.lang.Object r12 = r1.emit(r2, r11)
            if (r12 != r0) goto L6e
        L6d:
            return r0
        L6e:
            kotlin.Unit r12 = kotlin.Unit.f24250a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.lists.ui.watchlist.toggle.WatchlistToggleViewModel$onToggleClick$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
