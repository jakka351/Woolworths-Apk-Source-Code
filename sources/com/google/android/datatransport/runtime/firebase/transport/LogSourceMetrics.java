package com.google.android.datatransport.runtime.firebase.transport;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class LogSourceMetrics {
    public static final /* synthetic */ int c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final String f14462a;
    public final List b;

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public String f14463a = "";
        public List b = new ArrayList();

        public final LogSourceMetrics a() {
            return new LogSourceMetrics(this.f14463a, Collections.unmodifiableList(this.b));
        }
    }

    static {
        new Builder().a();
    }

    public LogSourceMetrics(String str, List list) {
        this.f14462a = str;
        this.b = list;
    }

    public final List a() {
        return this.b;
    }

    public final String b() {
        return this.f14462a;
    }
}
