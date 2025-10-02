package au.com.woolworths.shop.checkout.ui.substitution;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final /* synthetic */ class SubstitutionActivity$onCreate$2$1$5$1 extends FunctionReferenceImpl implements Function0<Unit> {
    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        m();
        return Unit.f24250a;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m() {
        /*
            r7 = this;
            java.lang.Object r0 = r7.receiver
            au.com.woolworths.shop.checkout.ui.substitution.SubstitutionViewModel r0 = (au.com.woolworths.shop.checkout.ui.substitution.SubstitutionViewModel) r0
            kotlinx.coroutines.flow.StateFlow r1 = r0.k
            java.lang.Object r1 = r1.getValue()
            au.com.woolworths.shop.checkout.ui.substitution.SubstitutionContract$ViewState r1 = (au.com.woolworths.shop.checkout.ui.substitution.SubstitutionContract.ViewState) r1
            boolean r2 = r1 instanceof au.com.woolworths.shop.checkout.ui.substitution.SubstitutionContract.ViewState.Content
            if (r2 == 0) goto La5
            au.com.woolworths.shop.checkout.ui.substitution.SubstitutionContract$ViewState$Content r1 = (au.com.woolworths.shop.checkout.ui.substitution.SubstitutionContract.ViewState.Content) r1
            java.lang.String r2 = r1.b
            au.com.woolworths.shop.checkout.domain.model.substitution.SubstitutionPreference r3 = r1.f10815a
            au.com.woolworths.shop.checkout.domain.model.substitution.SubstitutionPreferenceOptionsSection r3 = r3.c
            java.util.List r3 = r3.c
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
        L20:
            boolean r4 = r3.hasNext()
            r5 = 0
            if (r4 == 0) goto L37
            java.lang.Object r4 = r3.next()
            r6 = r4
            au.com.woolworths.shop.checkout.domain.model.substitution.SubstitutionPreferenceOption r6 = (au.com.woolworths.shop.checkout.domain.model.substitution.SubstitutionPreferenceOption) r6
            java.lang.String r6 = r6.f10666a
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto L20
            goto L38
        L37:
            r4 = r5
        L38:
            au.com.woolworths.shop.checkout.domain.model.substitution.SubstitutionPreferenceOption r4 = (au.com.woolworths.shop.checkout.domain.model.substitution.SubstitutionPreferenceOption) r4
            r2 = 0
            if (r4 == 0) goto L40
            boolean r3 = r4.f
            goto L41
        L40:
            r3 = r2
        L41:
            if (r3 == 0) goto L98
            java.util.Map r1 = r1.d
            java.util.Collection r1 = r1.values()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            boolean r3 = r1 instanceof java.util.Collection
            r4 = 1
            if (r3 == 0) goto L5b
            r3 = r1
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L5b
        L59:
            r2 = r4
            goto L71
        L5b:
            java.util.Iterator r1 = r1.iterator()
        L5f:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L59
            java.lang.Object r3 = r1.next()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L5f
        L71:
            if (r2 == 0) goto L98
            au.com.woolworths.android.onesite.analytics.AnalyticsManager r1 = r0.g
            au.com.woolworths.analytics.supers.substitution.CheckoutSubstitutionAnalytics$SubstitutionPreference$Action$Companion r2 = au.com.woolworths.analytics.supers.substitution.CheckoutSubstitutionAnalytics.SubstitutionPreference.Action.d
            java.lang.String r3 = r0.m
            if (r3 == 0) goto L92
            java.util.List r3 = kotlin.collections.CollectionsKt.Q(r3)
            r2.getClass()
            au.com.woolworths.analytics.supers.substitution.CheckoutSubstitutionAnalytics$SubstitutionPreference$Action$Companion$saveWithNoSelection$1 r2 = new au.com.woolworths.analytics.supers.substitution.CheckoutSubstitutionAnalytics$SubstitutionPreference$Action$Companion$saveWithNoSelection$1
            r2.<init>(r3)
            r1.g(r2)
            kotlinx.coroutines.flow.SharedFlowImpl r0 = r0.h
            au.com.woolworths.shop.checkout.ui.substitution.SubstitutionContract$Action$ShowNoProductSelected r1 = au.com.woolworths.shop.checkout.ui.substitution.SubstitutionContract.Action.ShowNoProductSelected.f10813a
            r0.f(r1)
            return
        L92:
            java.lang.String r0 = "productId"
            kotlin.jvm.internal.Intrinsics.p(r0)
            throw r5
        L98:
            androidx.lifecycle.viewmodel.internal.CloseableCoroutineScope r1 = androidx.lifecycle.ViewModelKt.a(r0)
            au.com.woolworths.shop.checkout.ui.substitution.SubstitutionViewModel$performSave$1 r2 = new au.com.woolworths.shop.checkout.ui.substitution.SubstitutionViewModel$performSave$1
            r2.<init>(r0, r5)
            r0 = 3
            kotlinx.coroutines.BuildersKt.c(r1, r5, r5, r2, r0)
        La5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.checkout.ui.substitution.SubstitutionActivity$onCreate$2$1$5$1.m():void");
    }
}
