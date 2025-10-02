package com.dynatrace.android.compose;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.state.ToggleableState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/dynatrace/android/compose/ToggleableInfo;", "", "agent.instrumentorAPI.compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ToggleableInfo {

    /* renamed from: a, reason: collision with root package name */
    public final ToggleableState f14153a;
    public final Role b;
    public final String c;

    public ToggleableInfo(ToggleableState state, Role role, String str) {
        Intrinsics.h(state, "state");
        this.f14153a = state;
        this.b = role;
        this.c = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ToggleableInfo(state=");
        sb.append(this.f14153a);
        sb.append(", role=");
        sb.append(this.b);
        sb.append(", sourceName='");
        return a.o(sb, this.c, "')");
    }
}
