package com.braintreepayments.api;

/* loaded from: classes4.dex */
public class BrowserSwitchClient {

    /* renamed from: a, reason: collision with root package name */
    public final BrowserSwitchInspector f13708a;
    public final BrowserSwitchPersistentStore b;
    public final ChromeCustomTabsInternalClient c;

    public BrowserSwitchClient() {
        BrowserSwitchInspector browserSwitchInspector = new BrowserSwitchInspector();
        ChromeCustomTabsInternalClient chromeCustomTabsInternalClient = new ChromeCustomTabsInternalClient();
        this.f13708a = browserSwitchInspector;
        this.b = BrowserSwitchPersistentStore.f13710a;
        this.c = chromeCustomTabsInternalClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(au.com.woolworths.android.onesite.modules.checkout.paypal.BraintreeResultActivity r5, com.braintreepayments.api.BrowserSwitchOptions r6) {
        /*
            r4 = this;
            android.content.Context r0 = r5.getApplicationContext()
            int r1 = r6.b
            java.lang.String r2 = r6.d
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r3) goto L55
            if (r2 != 0) goto L1a
            android.net.Uri r6 = r6.e
            if (r6 != 0) goto L1a
            r6 = 2132017822(0x7f14029e, float:1.9673933E38)
            java.lang.String r5 = r5.getString(r6)
            goto L5c
        L1a:
            if (r2 == 0) goto L53
            com.braintreepayments.api.BrowserSwitchInspector r6 = r4.f13708a
            r6.getClass()
            java.lang.String r6 = "://"
            java.lang.String r6 = r2.concat(r6)
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r2 = "android.intent.action.VIEW"
            android.net.Uri r6 = android.net.Uri.parse(r6)
            r1.<init>(r2, r6)
            java.lang.String r6 = "android.intent.category.DEFAULT"
            r1.addCategory(r6)
            java.lang.String r6 = "android.intent.category.BROWSABLE"
            r1.addCategory(r6)
            android.content.pm.PackageManager r6 = r0.getPackageManager()
            r0 = 0
            java.util.List r6 = r6.queryIntentActivities(r1, r0)
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L53
            r6 = 2132017826(0x7f1402a2, float:1.9673941E38)
            java.lang.String r5 = r5.getString(r6)
            goto L5c
        L53:
            r5 = 0
            goto L5c
        L55:
            r6 = 2132017829(0x7f1402a5, float:1.9673947E38)
            java.lang.String r5 = r5.getString(r6)
        L5c:
            if (r5 != 0) goto L5f
            return
        L5f:
            com.braintreepayments.api.BrowserSwitchException r6 = new com.braintreepayments.api.BrowserSwitchException
            r6.<init>(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braintreepayments.api.BrowserSwitchClient.a(au.com.woolworths.android.onesite.modules.checkout.paypal.BraintreeResultActivity, com.braintreepayments.api.BrowserSwitchOptions):void");
    }
}
