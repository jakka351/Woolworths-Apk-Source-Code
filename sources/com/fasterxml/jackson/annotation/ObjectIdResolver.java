package com.fasterxml.jackson.annotation;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;

/* loaded from: classes4.dex */
public interface ObjectIdResolver {
    void a(ObjectIdGenerator.IdKey idKey, Object obj);

    Object b(ObjectIdGenerator.IdKey idKey);

    SimpleObjectIdResolver c();

    boolean d(ObjectIdResolver objectIdResolver);
}
