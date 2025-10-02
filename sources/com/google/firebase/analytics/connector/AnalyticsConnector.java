package com.google.firebase.analytics.connector;

import android.os.Bundle;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes.dex */
public interface AnalyticsConnector {

    @KeepForSdk
    public interface AnalyticsConnectorHandle {
    }

    @KeepForSdk
    public interface AnalyticsConnectorListener {
        void a(int i, Bundle bundle);
    }

    @KeepForSdk
    /* loaded from: classes6.dex */
    public static class ConditionalUserProperty {

        /* renamed from: a, reason: collision with root package name */
        public String f15181a;
        public String b;
        public Object c;
        public String d;
        public long e;
        public String f;
        public Bundle g;
        public String h;
        public Bundle i;
        public long j;
        public String k;
        public Bundle l;
        public long m;
        public boolean n;
        public long o;
    }

    void a(String str, String str2, Bundle bundle);

    void b(String str);

    AnalyticsConnectorHandle c(String str, AnalyticsConnectorListener analyticsConnectorListener);

    void d(ConditionalUserProperty conditionalUserProperty);

    ArrayList e();

    void f(String str);

    Map g(boolean z);

    int h();
}
