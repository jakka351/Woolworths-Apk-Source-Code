package com.google.firebase.crashlytics;

import com.google.firebase.crashlytics.CustomKeysAndValues;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/google/firebase/crashlytics/KeyValueBuilder;", "", "com.google.firebase-firebase-crashlytics"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class KeyValueBuilder {

    /* renamed from: a, reason: collision with root package name */
    public final CustomKeysAndValues.Builder f15253a;

    public KeyValueBuilder() {
        CustomKeysAndValues.Builder builder = new CustomKeysAndValues.Builder();
        builder.f15251a = new HashMap();
        this.f15253a = builder;
    }

    public final CustomKeysAndValues a() {
        CustomKeysAndValues.Builder builder = this.f15253a;
        builder.getClass();
        return new CustomKeysAndValues(builder);
    }

    public final void b(String str, String value) {
        Intrinsics.h(value, "value");
        this.f15253a.f15251a.put(str, value);
    }
}
