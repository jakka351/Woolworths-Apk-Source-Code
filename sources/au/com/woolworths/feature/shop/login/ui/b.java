package au.com.woolworths.feature.shop.login.ui;

import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ b(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke(java.lang.Object r4, java.lang.Object r5) {
        /*
            r3 = this;
            int r0 = r3.d
            switch(r0) {
                case 0: goto L6b;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r3.e
            kotlinx.coroutines.flow.internal.SafeCollector r0 = (kotlinx.coroutines.flow.internal.SafeCollector) r0
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r1 = r4.intValue()
            kotlin.coroutines.CoroutineContext$Element r5 = (kotlin.coroutines.CoroutineContext.Element) r5
            kotlin.coroutines.CoroutineContext$Key r4 = r5.getD()
            kotlin.coroutines.CoroutineContext r0 = r0.q
            kotlin.coroutines.CoroutineContext$Element r0 = r0.get(r4)
            kotlinx.coroutines.Job$Key r2 = kotlinx.coroutines.Job.Key.d
            if (r4 == r2) goto L27
            if (r5 == r0) goto L24
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L3a
        L24:
            int r1 = r1 + 1
            goto L3a
        L27:
            kotlinx.coroutines.Job r0 = (kotlinx.coroutines.Job) r0
            kotlinx.coroutines.Job r5 = (kotlinx.coroutines.Job) r5
        L2b:
            if (r5 != 0) goto L2f
            r5 = 0
            goto L36
        L2f:
            if (r5 != r0) goto L32
            goto L36
        L32:
            boolean r4 = r5 instanceof kotlinx.coroutines.internal.ScopeCoroutine
            if (r4 != 0) goto L64
        L36:
            if (r5 != r0) goto L3f
            if (r0 != 0) goto L24
        L3a:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            return r4
        L3f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of "
            r1.<init>(r2)
            r1.append(r5)
            java.lang.String r5 = ", expected child of "
            r1.append(r5)
            r1.append(r0)
            java.lang.String r5 = ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'"
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L64:
            kotlinx.coroutines.internal.ScopeCoroutine r5 = (kotlinx.coroutines.internal.ScopeCoroutine) r5
            kotlinx.coroutines.Job r5 = r5.getParent()
            goto L2b
        L6b:
            java.lang.Object r0 = r3.e
            au.com.woolworths.feature.shop.login.LoginViewModel r0 = (au.com.woolworths.feature.shop.login.LoginViewModel) r0
            au.com.woolworths.feature.shop.login.LoginFullPageErrorState r4 = (au.com.woolworths.feature.shop.login.LoginFullPageErrorState) r4
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r1 = "errorState"
            kotlin.jvm.internal.Intrinsics.h(r4, r1)
            java.lang.String r1 = "errorDesc"
            kotlin.jvm.internal.Intrinsics.h(r5, r1)
            r0.getClass()
            boolean r1 = r4 instanceof au.com.woolworths.feature.shop.login.ConnectionErrorState
            if (r1 == 0) goto L87
            java.lang.String r4 = "login failed - network error"
            goto L90
        L87:
            boolean r4 = r4 instanceof au.com.woolworths.feature.shop.login.LoginErrorState
            if (r4 == 0) goto L8e
            java.lang.String r4 = "login failed"
            goto L90
        L8e:
            java.lang.String r4 = "login failed - server error"
        L90:
            au.com.woolworths.android.onesite.analytics.AnalyticsManager r0 = r0.i
            au.com.woolworths.analytics.supers.login.LoginAnalytics$LoginWebview$Action$Companion r1 = au.com.woolworths.analytics.supers.login.LoginAnalytics.LoginWebview.Action.d
            r1.getClass()
            au.com.woolworths.analytics.supers.login.LoginAnalytics$LoginWebview$Action$Companion$loginError$1 r4 = au.com.woolworths.analytics.supers.login.LoginAnalytics.LoginWebview.Action.Companion.a(r4, r5)
            r0.g(r4)
            kotlin.Unit r4 = kotlin.Unit.f24250a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.login.ui.b.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
