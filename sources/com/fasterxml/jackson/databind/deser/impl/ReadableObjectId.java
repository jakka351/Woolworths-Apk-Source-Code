package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdResolver;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.deser.UnresolvedForwardReference;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes4.dex */
public class ReadableObjectId {

    /* renamed from: a, reason: collision with root package name */
    public Object f14252a;
    public final ObjectIdGenerator.IdKey b;
    public LinkedList c;
    public ObjectIdResolver d;

    public ReadableObjectId(ObjectIdGenerator.IdKey idKey) {
        this.b = idKey;
    }

    public final void a(Referring referring) {
        if (this.c == null) {
            this.c = new LinkedList();
        }
        this.c.add(referring);
    }

    public final void b(Object obj) {
        ObjectIdResolver objectIdResolver = this.d;
        ObjectIdGenerator.IdKey idKey = this.b;
        objectIdResolver.a(idKey, obj);
        this.f14252a = obj;
        Object obj2 = idKey.f;
        LinkedList linkedList = this.c;
        if (linkedList != null) {
            Iterator it = linkedList.iterator();
            this.c = null;
            while (it.hasNext()) {
                ((Referring) it.next()).a(obj2, obj);
            }
        }
    }

    public final String toString() {
        return String.valueOf(this.b);
    }

    public static abstract class Referring {

        /* renamed from: a, reason: collision with root package name */
        public final UnresolvedForwardReference f14253a;

        public Referring(UnresolvedForwardReference unresolvedForwardReference) {
            this.f14253a = unresolvedForwardReference;
        }

        public abstract void a(Object obj, Object obj2);

        public Referring(UnresolvedForwardReference unresolvedForwardReference, JavaType javaType) {
            this.f14253a = unresolvedForwardReference;
            javaType.getClass();
        }
    }
}
