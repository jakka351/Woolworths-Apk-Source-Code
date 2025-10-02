package com.woolworths.scanlibrary.ui.scanner.delegate;

import android.content.ComponentCallbacks2;
import androidx.compose.runtime.internal.StabilityInferred;
import com.woolworths.scanlibrary.di.component.SnGAppProvider;
import com.woolworths.scanlibrary.domain.login.UserManager;
import com.woolworths.scanlibrary.ui.scanner.ScannerActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/scanner/delegate/InjectionDelegateImpl;", "Lcom/woolworths/scanlibrary/ui/scanner/delegate/InjectionDelegate;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class InjectionDelegateImpl implements InjectionDelegate {
    public ScannerActivity d;

    public final UserManager a() {
        ScannerActivity scannerActivity = this.d;
        if (scannerActivity == null) {
            Intrinsics.p("activity");
            throw null;
        }
        ComponentCallbacks2 application = scannerActivity.getApplication();
        Intrinsics.f(application, "null cannot be cast to non-null type com.woolworths.scanlibrary.di.component.SnGAppProvider");
        return ((SnGAppProvider) application).d();
    }
}
