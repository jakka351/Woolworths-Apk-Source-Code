package com.dynatrace.android.compose.pullrefresh;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/dynatrace/android/compose/pullrefresh/PullRefreshInfo;", "", "agent.instrumentorAPI.compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PullRefreshInfo {

    /* renamed from: a, reason: collision with root package name */
    public final Function0 f14154a;

    public PullRefreshInfo(Function0 onRefresh) {
        Intrinsics.h(onRefresh, "onRefresh");
        this.f14154a = onRefresh;
    }

    public final String toString() {
        return "PullRefreshInfo{, function=" + this.f14154a.getClass().getName() + '}';
    }
}
