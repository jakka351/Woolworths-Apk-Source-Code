package androidx.media3.common;

import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Util;
import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public final class Tracks {
    public static final Tracks b = new Tracks(ImmutableList.t());

    /* renamed from: a, reason: collision with root package name */
    public final ImmutableList f2884a;

    public static final class Group {

        /* renamed from: a, reason: collision with root package name */
        public final int f2885a;
        public final TrackGroup b;
        public final boolean c;
        public final int[] d;
        public final boolean[] e;

        static {
            Util.E(0);
            Util.E(1);
            Util.E(3);
            Util.E(4);
        }

        public Group(TrackGroup trackGroup, boolean z, int[] iArr, boolean[] zArr) {
            int i = trackGroup.f2879a;
            this.f2885a = i;
            boolean z2 = false;
            Assertions.b(i == iArr.length && i == zArr.length);
            this.b = trackGroup;
            if (z && i > 1) {
                z2 = true;
            }
            this.c = z2;
            this.d = (int[]) iArr.clone();
            this.e = (boolean[]) zArr.clone();
        }

        public final Format a(int i) {
            return this.b.d[i];
        }

        public final boolean b(int i) {
            return this.d[i] == 4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && Group.class == obj.getClass()) {
                Group group = (Group) obj;
                if (this.c == group.c && this.b.equals(group.b) && Arrays.equals(this.d, group.d) && Arrays.equals(this.e, group.e)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Arrays.hashCode(this.e) + ((Arrays.hashCode(this.d) + (((this.b.hashCode() * 31) + (this.c ? 1 : 0)) * 31)) * 31);
        }
    }

    static {
        Util.E(0);
    }

    public Tracks(List list) {
        this.f2884a = ImmutableList.o(list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean a(int i) {
        int i2 = 0;
        while (true) {
            ImmutableList immutableList = this.f2884a;
            if (i2 >= immutableList.size()) {
                return false;
            }
            Group group = (Group) immutableList.get(i2);
            boolean[] zArr = group.e;
            int length = zArr.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    break;
                }
                if (!zArr[i3]) {
                    i3++;
                } else if (group.b.c == i) {
                    return true;
                }
            }
            i2++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Tracks.class != obj.getClass()) {
            return false;
        }
        return this.f2884a.equals(((Tracks) obj).f2884a);
    }

    public final int hashCode() {
        return this.f2884a.hashCode();
    }
}
