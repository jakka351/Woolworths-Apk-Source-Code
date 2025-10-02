package com.fasterxml.jackson.core.io;

import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.URI;
import java.net.URL;
import java.util.Objects;

/* loaded from: classes4.dex */
public class ContentReference implements Serializable {
    public static final ContentReference h = new ContentReference(-1, -1, null, false);
    public final transient Object d;
    public final int e;
    public final int f;
    public final boolean g;

    public ContentReference(int i, int i2, Object obj, boolean z) {
        this.g = z;
        this.d = obj;
        this.e = i;
        this.f = i2;
    }

    public static void a(int i, int[] iArr) {
        int i2 = iArr[0];
        if (i2 < 0) {
            i2 = 0;
        } else if (i2 >= i) {
            i2 = i;
        }
        iArr[0] = i2;
        int i3 = iArr[1];
        int i4 = i - i2;
        if (i3 < 0 || i3 > i4) {
            iArr[1] = i4;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof ContentReference)) {
            return false;
        }
        ContentReference contentReference = (ContentReference) obj;
        if (this.e != contentReference.e || this.f != contentReference.f) {
            return false;
        }
        Object obj2 = contentReference.d;
        Object obj3 = this.d;
        if (obj3 == null) {
            return obj2 == null;
        }
        if (obj2 == null) {
            return false;
        }
        return ((obj3 instanceof File) || (obj3 instanceof URL) || (obj3 instanceof URI)) ? obj3.equals(obj2) : obj3 == obj2;
    }

    public final int hashCode() {
        return Objects.hashCode(this.d);
    }

    public Object readResolve() {
        return h;
    }
}
