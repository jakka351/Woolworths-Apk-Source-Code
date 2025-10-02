package io.branch.referral;

import android.app.Application;
import com.dynatrace.android.callback.Callback;

/* loaded from: classes7.dex */
public class BranchApp extends Application {
    @Override // android.app.Application
    public final void onCreate() {
        Callback.i(this);
        super.onCreate();
        Branch.f(this);
    }
}
