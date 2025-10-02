package com.fasterxml.jackson.databind.introspect;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: classes4.dex */
public final class AnnotatedMethodMap implements Iterable<AnnotatedMethod> {
    public LinkedHashMap d;

    @Override // java.lang.Iterable
    public final Iterator<AnnotatedMethod> iterator() {
        LinkedHashMap linkedHashMap = this.d;
        return linkedHashMap == null ? Collections.emptyIterator() : linkedHashMap.values().iterator();
    }
}
