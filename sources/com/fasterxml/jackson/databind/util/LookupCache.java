package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.databind.JavaType;

/* loaded from: classes4.dex */
public interface LookupCache<K, V> {
    Object a(Object obj, JavaType javaType);

    Object get(Object obj);
}
