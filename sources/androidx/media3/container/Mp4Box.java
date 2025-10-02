package androidx.media3.container;

import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import java.util.ArrayList;
import java.util.Arrays;

@UnstableApi
/* loaded from: classes2.dex */
public abstract class Mp4Box {

    /* renamed from: a, reason: collision with root package name */
    public final int f2931a;

    public static final class ContainerBox extends Mp4Box {
        public final long b;
        public final ArrayList c;
        public final ArrayList d;

        public ContainerBox(int i, long j) {
            super(i);
            this.b = j;
            this.c = new ArrayList();
            this.d = new ArrayList();
        }

        public final ContainerBox b(int i) {
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ContainerBox containerBox = (ContainerBox) arrayList.get(i2);
                if (containerBox.f2931a == i) {
                    return containerBox;
                }
            }
            return null;
        }

        public final LeafBox c(int i) {
            ArrayList arrayList = this.c;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                LeafBox leafBox = (LeafBox) arrayList.get(i2);
                if (leafBox.f2931a == i) {
                    return leafBox;
                }
            }
            return null;
        }

        @Override // androidx.media3.container.Mp4Box
        public final String toString() {
            return Mp4Box.a(this.f2931a) + " leaves: " + Arrays.toString(this.c.toArray()) + " containers: " + Arrays.toString(this.d.toArray());
        }
    }

    public static final class LeafBox extends Mp4Box {
        public final ParsableByteArray b;

        public LeafBox(int i, ParsableByteArray parsableByteArray) {
            super(i);
            this.b = parsableByteArray;
        }
    }

    public Mp4Box(int i) {
        this.f2931a = i;
    }

    public static String a(int i) {
        return "" + ((char) ((i >> 24) & 255)) + ((char) ((i >> 16) & 255)) + ((char) ((i >> 8) & 255)) + ((char) (i & 255));
    }

    public String toString() {
        return a(this.f2931a);
    }
}
