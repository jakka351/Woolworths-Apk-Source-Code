package com.fasterxml.jackson.annotation;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import java.util.HashMap;

/* loaded from: classes4.dex */
public class SimpleObjectIdResolver implements ObjectIdResolver {

    /* renamed from: a, reason: collision with root package name */
    public HashMap f14189a;

    @Override // com.fasterxml.jackson.annotation.ObjectIdResolver
    public final void a(ObjectIdGenerator.IdKey idKey, Object obj) {
        HashMap map = this.f14189a;
        if (map == null) {
            this.f14189a = new HashMap();
        } else {
            Object obj2 = map.get(idKey);
            if (obj2 != null) {
                if (obj2 == obj) {
                    return;
                }
                throw new IllegalStateException("Already had POJO for id (" + idKey.f.getClass().getName() + ") [" + idKey + "]");
            }
        }
        this.f14189a.put(idKey, obj);
    }

    @Override // com.fasterxml.jackson.annotation.ObjectIdResolver
    public final Object b(ObjectIdGenerator.IdKey idKey) {
        HashMap map = this.f14189a;
        if (map == null) {
            return null;
        }
        return map.get(idKey);
    }

    @Override // com.fasterxml.jackson.annotation.ObjectIdResolver
    public final SimpleObjectIdResolver c() {
        return new SimpleObjectIdResolver();
    }

    @Override // com.fasterxml.jackson.annotation.ObjectIdResolver
    public final boolean d(ObjectIdResolver objectIdResolver) {
        return objectIdResolver.getClass() == getClass();
    }
}
