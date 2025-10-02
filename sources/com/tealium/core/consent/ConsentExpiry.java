package com.tealium.core.consent;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tealium/core/consent/ConsentExpiry;", "", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final /* data */ class ConsentExpiry {

    /* renamed from: a, reason: collision with root package name */
    public final long f19140a;

    public ConsentExpiry(long j) {
        TimeUnit unit = TimeUnit.DAYS;
        Intrinsics.h(unit, "unit");
        this.f19140a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConsentExpiry) || this.f19140a != ((ConsentExpiry) obj).f19140a) {
            return false;
        }
        TimeUnit timeUnit = TimeUnit.DAYS;
        return true;
    }

    public final int hashCode() {
        return TimeUnit.DAYS.hashCode() + (Long.hashCode(this.f19140a) * 31);
    }

    public final String toString() {
        return "ConsentExpiry(time=" + this.f19140a + ", unit=" + TimeUnit.DAYS + ")";
    }
}
