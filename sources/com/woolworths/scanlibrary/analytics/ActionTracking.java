package com.woolworths.scanlibrary.analytics;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0017\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/analytics/ActionTracking;", "", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public class ActionTracking {

    /* renamed from: a, reason: collision with root package name */
    public final String f21135a;
    public final Map b;

    public ActionTracking(String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f21135a = str;
        this.b = linkedHashMap;
    }

    public final void a(String str, Object value) {
        Intrinsics.h(value, "value");
        this.b.put(str, value);
    }
}
