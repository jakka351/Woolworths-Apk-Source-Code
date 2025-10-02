package com.bumptech.glide.provider;

import com.bumptech.glide.load.ResourceEncoder;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class ResourceEncoderRegistry {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f13968a = new ArrayList();

    public static final class Entry<T> {

        /* renamed from: a, reason: collision with root package name */
        public final Class f13969a;
        public final ResourceEncoder b;

        public Entry(Class cls, ResourceEncoder resourceEncoder) {
            this.f13969a = cls;
            this.b = resourceEncoder;
        }
    }

    public final synchronized void a(Class cls, ResourceEncoder resourceEncoder) {
        this.f13968a.add(new Entry(cls, resourceEncoder));
    }

    public final synchronized ResourceEncoder b(Class cls) {
        int size = this.f13968a.size();
        for (int i = 0; i < size; i++) {
            Entry entry = (Entry) this.f13968a.get(i);
            if (entry.f13969a.isAssignableFrom(cls)) {
                return entry.b;
            }
        }
        return null;
    }
}
