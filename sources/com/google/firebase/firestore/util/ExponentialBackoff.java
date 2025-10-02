package com.google.firebase.firestore.util;

import com.google.firebase.firestore.util.AsyncQueue;
import java.util.Date;

/* loaded from: classes6.dex */
public class ExponentialBackoff {

    /* renamed from: a, reason: collision with root package name */
    public final AsyncQueue f15601a;
    public final AsyncQueue.TimerId b;
    public final long c;
    public final long d;
    public long e;
    public AsyncQueue.DelayedTask h;
    public long g = new Date().getTime();
    public long f = 0;

    public ExponentialBackoff(AsyncQueue asyncQueue, AsyncQueue.TimerId timerId, long j, long j2) {
        this.f15601a = asyncQueue;
        this.b = timerId;
        this.c = j;
        this.d = j2;
        this.e = j2;
    }
}
