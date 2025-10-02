package com.swrve.sdk;

import android.app.Application;
import com.swrve.sdk.SwrveBaseEmpty;
import com.swrve.sdk.config.SwrveConfig;
import java.lang.ref.WeakReference;

/* loaded from: classes6.dex */
public class SwrveEmpty extends SwrveBaseEmpty<ISwrve, SwrveConfig> implements ISwrve {
    public SwrveEmpty(Application application, String str) {
        new WeakReference(application.getApplicationContext());
        this.d = str;
        this.e = new SwrveBaseEmpty.SwrveConfigBaseImp();
        SwrveCommon.f19047a = this;
        this.f = null;
        this.f = application.getCacheDir();
    }

    @Override // com.swrve.sdk.ISwrve
    public final void j(String str) {
    }
}
