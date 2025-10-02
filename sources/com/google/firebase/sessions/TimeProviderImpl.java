package com.google.firebase.sessions;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/google/firebase/sessions/TimeProviderImpl;", "Lcom/google/firebase/sessions/TimeProvider;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TimeProviderImpl implements TimeProvider {

    /* renamed from: a, reason: collision with root package name */
    public static final TimeProviderImpl f15829a = new TimeProviderImpl();

    @Override // com.google.firebase.sessions.TimeProvider
    public final Time a() {
        return new Time(System.currentTimeMillis());
    }
}
