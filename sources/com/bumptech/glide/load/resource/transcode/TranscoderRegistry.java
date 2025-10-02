package com.bumptech.glide.load.resource.transcode;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class TranscoderRegistry {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f13948a = new ArrayList();

    public static final class Entry<Z, R> {

        /* renamed from: a, reason: collision with root package name */
        public final Class f13949a;
        public final Class b;
        public final ResourceTranscoder c;

        public Entry(Class cls, Class cls2, ResourceTranscoder resourceTranscoder) {
            this.f13949a = cls;
            this.b = cls2;
            this.c = resourceTranscoder;
        }
    }

    public final synchronized ResourceTranscoder a(Class cls, Class cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return UnitTranscoder.f13950a;
        }
        Iterator it = this.f13948a.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            if (entry.f13949a.isAssignableFrom(cls) && cls2.isAssignableFrom(entry.b)) {
                return entry.c;
            }
        }
        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls + " to " + cls2);
    }

    public final synchronized ArrayList b(Class cls, Class cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        Iterator it = this.f13948a.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            if ((entry.f13949a.isAssignableFrom(cls) && cls2.isAssignableFrom(entry.b)) && !arrayList.contains(entry.b)) {
                arrayList.add(entry.b);
            }
        }
        return arrayList;
    }

    public final synchronized void c(Class cls, Class cls2, ResourceTranscoder resourceTranscoder) {
        this.f13948a.add(new Entry(cls, cls2, resourceTranscoder));
    }
}
