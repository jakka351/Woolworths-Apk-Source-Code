package androidx.transition;

import android.util.Property;

/* loaded from: classes2.dex */
class PathProperty<T> extends Property<T, Float> {

    /* renamed from: a, reason: collision with root package name */
    public float f3788a;

    @Override // android.util.Property
    public final Float get(Object obj) {
        return Float.valueOf(this.f3788a);
    }

    @Override // android.util.Property
    public final void set(Object obj, Float f) {
        this.f3788a = f.floatValue();
        throw null;
    }
}
