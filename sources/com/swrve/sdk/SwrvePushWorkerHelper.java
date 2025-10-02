package com.swrve.sdk;

import android.app.Application;
import androidx.work.Data;
import java.util.Map;

/* loaded from: classes6.dex */
public class SwrvePushWorkerHelper {

    /* renamed from: a, reason: collision with root package name */
    public final Map f19073a;
    public boolean b;

    public SwrvePushWorkerHelper(Application application, Map map) {
        this.f19073a = map;
    }

    public final Data a() {
        Data.Builder builder = new Data.Builder();
        Map map = this.f19073a;
        if (map != null) {
            for (String str : map.keySet()) {
                builder.d(str, (String) this.f19073a.get(str));
                String str2 = (String) this.f19073a.get(str);
                if (SwrveHelper.o(str) && SwrveHelper.o(str2) && (str.equalsIgnoreCase("_p") || str.equalsIgnoreCase("_sp"))) {
                    this.b = true;
                }
            }
        }
        return builder.a();
    }
}
