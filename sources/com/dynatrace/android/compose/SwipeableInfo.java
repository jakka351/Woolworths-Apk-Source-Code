package com.dynatrace.android.compose;

import androidx.compose.material.SwipeableState;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/dynatrace/android/compose/SwipeableInfo;", "", "agent.instrumentorAPI.compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SwipeableInfo {

    /* renamed from: a, reason: collision with root package name */
    public final Object f14151a;
    public final Object b;
    public final SwipeableState c;

    public SwipeableInfo(Object obj, Object obj2, SwipeableState swipeableState) {
        this.f14151a = obj;
        this.b = obj2;
        this.c = swipeableState;
    }

    public final String a() {
        return this.c.getClass().getName();
    }

    public final String toString() {
        return "SwipeableInfo{fromState=" + String.valueOf(this.f14151a) + ", toState=" + String.valueOf(this.b) + ", source=" + a() + '}';
    }
}
