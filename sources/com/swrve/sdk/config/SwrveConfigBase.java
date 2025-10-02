package com.swrve.sdk.config;

import YU.a;
import android.graphics.Color;
import com.swrve.sdk.SwrveInitMode;
import com.swrve.sdk.SwrveNotificationConfig;
import java.net.URL;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class SwrveConfigBase {
    public final ArrayList d;
    public SwrveNotificationConfig f;
    public final SwrveInAppMessageConfig g;
    public SwrveEmbeddedMessageConfig h;
    public final SwrveInitMode i;
    public final boolean j;

    /* renamed from: a, reason: collision with root package name */
    public URL f19078a = null;
    public URL b = null;
    public URL c = null;
    public boolean e = true;

    public SwrveConfigBase() {
        int iArgb = Color.argb(100, 0, 0, 0);
        SwrveInAppMessageConfig swrveInAppMessageConfig = new SwrveInAppMessageConfig();
        swrveInAppMessageConfig.f19080a = iArgb;
        swrveInAppMessageConfig.b = -16777216;
        swrveInAppMessageConfig.c = 5000L;
        this.g = swrveInAppMessageConfig;
        this.h = null;
        this.i = SwrveInitMode.d;
        this.j = true;
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        arrayList.add("Calypso AppCrawler");
    }

    public final void a(int i) {
        this.f19078a = new URL(a.e(i, "https://", ".api.swrve.com"));
        this.b = new URL(a.e(i, "https://", ".content.swrve.com"));
        this.c = new URL(a.e(i, "https://", ".identity.swrve.com"));
    }
}
