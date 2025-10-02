package com.google.firebase.perf.transport;

import com.google.android.datatransport.Transport;
import com.google.firebase.inject.Provider;
import com.google.firebase.perf.logging.AndroidLogger;

/* loaded from: classes.dex */
final class FlgTransport {
    public static final AndroidLogger d = AndroidLogger.e();

    /* renamed from: a, reason: collision with root package name */
    public final String f15716a;
    public final Provider b;
    public Transport c;

    public FlgTransport(Provider provider, String str) {
        this.f15716a = str;
        this.b = provider;
    }
}
