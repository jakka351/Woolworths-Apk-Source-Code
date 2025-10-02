package com.google.firebase.analytics;

import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/google/firebase/analytics/ParametersBuilder;", "", "java.com.google.android.gmscore.integ.client.measurement_api_measurement_api"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ParametersBuilder {

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f15180a = new Bundle();

    /* renamed from: a, reason: from getter */
    public final Bundle getF15180a() {
        return this.f15180a;
    }

    public final void b(String str, String value) {
        Intrinsics.h(value, "value");
        this.f15180a.putString(str, value);
    }
}
