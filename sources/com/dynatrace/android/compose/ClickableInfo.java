package com.dynatrace.android.compose;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.semantics.Role;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/dynatrace/android/compose/ClickableInfo;", "", "agent.instrumentorAPI.compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ClickableInfo {

    /* renamed from: a, reason: collision with root package name */
    public final Role f14148a;
    public final Function0 b;

    public ClickableInfo(Role role, Function0 function) {
        Intrinsics.h(function, "function");
        this.f14148a = role;
        this.b = function;
    }

    public final String toString() {
        return "ClickableInfo{interactionType='click', role=" + this.f14148a + ", function=" + this.b.getClass().getName() + '}';
    }
}
