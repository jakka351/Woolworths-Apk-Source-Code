package com.google.common.cache;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.cache.LocalCache;

@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* loaded from: classes6.dex */
interface ReferenceEntry<K, V> {
    ReferenceEntry a();

    LocalCache.ValueReference b();

    int c();

    void d(ReferenceEntry referenceEntry);

    ReferenceEntry e();

    void f(LocalCache.ValueReference valueReference);

    Object getKey();

    long l();

    void m(long j);

    void n(long j);

    ReferenceEntry o();

    ReferenceEntry p();

    ReferenceEntry q();

    long r();

    void s(ReferenceEntry referenceEntry);

    void t(ReferenceEntry referenceEntry);

    void u(ReferenceEntry referenceEntry);
}
