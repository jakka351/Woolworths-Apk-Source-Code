package androidx.media3.common;

import android.util.SparseBooleanArray;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;

@UnstableApi
/* loaded from: classes2.dex */
public final class FlagSet {

    /* renamed from: a, reason: collision with root package name */
    public final SparseBooleanArray f2852a;

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public final SparseBooleanArray f2853a = new SparseBooleanArray();
        public boolean b;

        public final void a(int i) {
            Assertions.f(!this.b);
            this.f2853a.append(i, true);
        }

        public final FlagSet b() {
            Assertions.f(!this.b);
            this.b = true;
            return new FlagSet(this.f2853a);
        }
    }

    public FlagSet(SparseBooleanArray sparseBooleanArray) {
        this.f2852a = sparseBooleanArray;
    }

    public final int a(int i) {
        SparseBooleanArray sparseBooleanArray = this.f2852a;
        Assertions.c(i, sparseBooleanArray.size());
        return sparseBooleanArray.keyAt(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FlagSet)) {
            return false;
        }
        FlagSet flagSet = (FlagSet) obj;
        SparseBooleanArray sparseBooleanArray = flagSet.f2852a;
        int i = Util.f2928a;
        SparseBooleanArray sparseBooleanArray2 = this.f2852a;
        if (i >= 24) {
            return sparseBooleanArray2.equals(sparseBooleanArray);
        }
        if (sparseBooleanArray2.size() != sparseBooleanArray.size()) {
            return false;
        }
        for (int i2 = 0; i2 < sparseBooleanArray2.size(); i2++) {
            if (a(i2) != flagSet.a(i2)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = Util.f2928a;
        SparseBooleanArray sparseBooleanArray = this.f2852a;
        if (i >= 24) {
            return sparseBooleanArray.hashCode();
        }
        int size = sparseBooleanArray.size();
        for (int i2 = 0; i2 < sparseBooleanArray.size(); i2++) {
            size = (size * 31) + a(i2);
        }
        return size;
    }
}
