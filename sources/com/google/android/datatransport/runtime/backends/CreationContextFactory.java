package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import com.google.android.datatransport.runtime.time.Clock;

/* loaded from: classes.dex */
class CreationContextFactory {

    /* renamed from: a, reason: collision with root package name */
    public final Context f14450a;
    public final Clock b;
    public final Clock c;

    public CreationContextFactory(Context context, Clock clock, Clock clock2) {
        this.f14450a = context;
        this.b = clock;
        this.c = clock2;
    }
}
