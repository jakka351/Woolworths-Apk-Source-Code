package com.google.firebase.perf.util;

import android.os.Bundle;
import com.google.firebase.perf.logging.AndroidLogger;

/* loaded from: classes.dex */
public final class ImmutableBundle {
    public static final AndroidLogger b = AndroidLogger.e();

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f15720a;

    public ImmutableBundle() {
        this(new Bundle());
    }

    public ImmutableBundle(Bundle bundle) {
        this.f15720a = (Bundle) bundle.clone();
    }
}
