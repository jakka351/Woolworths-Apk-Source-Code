package com.fasterxml.jackson.databind.util.internal;

import com.fasterxml.jackson.databind.util.internal.Linked;
import com.fasterxml.jackson.databind.util.internal.PrivateMaxEntriesMap;

/* loaded from: classes4.dex */
interface Linked<T extends Linked<T>> {
    PrivateMaxEntriesMap.Node a();

    PrivateMaxEntriesMap.Node b();

    void c(Linked linked);

    void d(Linked linked);
}
