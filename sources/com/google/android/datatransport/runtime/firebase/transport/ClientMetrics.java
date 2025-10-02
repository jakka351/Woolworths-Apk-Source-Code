package com.google.android.datatransport.runtime.firebase.transport;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class ClientMetrics {
    public static final /* synthetic */ int e = 0;

    /* renamed from: a, reason: collision with root package name */
    public final TimeWindow f14457a;
    public final List b;
    public final GlobalMetrics c;
    public final String d;

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public TimeWindow f14458a = null;
        public final ArrayList b = new ArrayList();
        public GlobalMetrics c = null;
        public String d = "";
    }

    static {
        Collections.unmodifiableList(new Builder().b);
    }

    public ClientMetrics(TimeWindow timeWindow, List list, GlobalMetrics globalMetrics, String str) {
        this.f14457a = timeWindow;
        this.b = list;
        this.c = globalMetrics;
        this.d = str;
    }
}
