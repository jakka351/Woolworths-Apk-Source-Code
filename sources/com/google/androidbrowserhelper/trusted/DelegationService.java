package com.google.androidbrowserhelper.trusted;

import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.browser.trusted.Token;
import androidx.browser.trusted.TrustedWebActivityCallbackRemote;
import androidx.browser.trusted.TrustedWebActivityService;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes6.dex */
public class DelegationService extends TrustedWebActivityService {
    public final ArrayList g;
    public SharedPreferencesTokenStore h;

    public DelegationService() {
        ArrayList arrayList = new ArrayList();
        this.g = arrayList;
        arrayList.add(new NotificationDelegationExtraCommandHandler());
    }

    @Override // androidx.browser.trusted.TrustedWebActivityService
    public final SharedPreferencesTokenStore b() {
        if (this.h == null) {
            this.h = new SharedPreferencesTokenStore(this);
            PackageManager packageManager = getPackageManager();
            if (packageManager.hasSystemFeature("org.chromium.arc")) {
                this.h.a(Token.a(packageManager, "org.chromium.arc.payment_app"));
            }
        }
        return this.h;
    }

    @Override // androidx.browser.trusted.TrustedWebActivityService
    public final Bundle c(String str, Bundle bundle, TrustedWebActivityCallbackRemote trustedWebActivityCallbackRemote) {
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            Bundle bundleA = ((ExtraCommandHandler) it.next()).a(this, str, bundle);
            if (bundleA.getBoolean("success")) {
                return bundleA;
            }
        }
        return Bundle.EMPTY;
    }
}
