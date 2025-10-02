package com.bumptech.glide.provider;

import com.bumptech.glide.load.Encoder;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class EncoderRegistry {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f13961a = new ArrayList();

    public static final class Entry<T> {

        /* renamed from: a, reason: collision with root package name */
        public final Class f13962a;
        public final Encoder b;

        public Entry(Class cls, Encoder encoder) {
            this.f13962a = cls;
            this.b = encoder;
        }
    }

    public final synchronized void a(Class cls, Encoder encoder) {
        this.f13961a.add(new Entry(cls, encoder));
    }

    public final synchronized Encoder b(Class cls) {
        Iterator it = this.f13961a.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            if (entry.f13962a.isAssignableFrom(cls)) {
                return entry.b;
            }
        }
        return null;
    }
}
