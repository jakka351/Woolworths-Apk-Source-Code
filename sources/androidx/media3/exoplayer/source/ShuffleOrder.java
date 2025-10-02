package androidx.media3.exoplayer.source;

import androidx.media3.common.util.UnstableApi;
import java.util.Arrays;
import java.util.Random;

@UnstableApi
/* loaded from: classes2.dex */
public interface ShuffleOrder {

    public static class DefaultShuffleOrder implements ShuffleOrder {

        /* renamed from: a, reason: collision with root package name */
        public final Random f3143a;
        public final int[] b;
        public final int[] c;

        public DefaultShuffleOrder() {
            this(new Random());
        }

        @Override // androidx.media3.exoplayer.source.ShuffleOrder
        public final int a(int i) {
            int i2 = this.c[i] - 1;
            if (i2 >= 0) {
                return this.b[i2];
            }
            return -1;
        }

        @Override // androidx.media3.exoplayer.source.ShuffleOrder
        public final int b(int i) {
            int i2 = this.c[i] + 1;
            int[] iArr = this.b;
            if (i2 < iArr.length) {
                return iArr[i2];
            }
            return -1;
        }

        @Override // androidx.media3.exoplayer.source.ShuffleOrder
        public final int c() {
            int[] iArr = this.b;
            if (iArr.length > 0) {
                return iArr[iArr.length - 1];
            }
            return -1;
        }

        @Override // androidx.media3.exoplayer.source.ShuffleOrder
        public final ShuffleOrder d() {
            return new DefaultShuffleOrder(new Random(this.f3143a.nextLong()));
        }

        @Override // androidx.media3.exoplayer.source.ShuffleOrder
        public final int e() {
            int[] iArr = this.b;
            if (iArr.length > 0) {
                return iArr[0];
            }
            return -1;
        }

        @Override // androidx.media3.exoplayer.source.ShuffleOrder
        public final ShuffleOrder f(int i) {
            int[] iArr = this.b;
            int[] iArr2 = new int[iArr.length - i];
            int i2 = 0;
            for (int i3 = 0; i3 < iArr.length; i3++) {
                int i4 = iArr[i3];
                if (i4 < 0 || i4 >= i) {
                    int i5 = i3 - i2;
                    if (i4 >= 0) {
                        i4 -= i;
                    }
                    iArr2[i5] = i4;
                } else {
                    i2++;
                }
            }
            return new DefaultShuffleOrder(iArr2, new Random(this.f3143a.nextLong()));
        }

        @Override // androidx.media3.exoplayer.source.ShuffleOrder
        public final ShuffleOrder g(int i) {
            int[] iArr;
            Random random;
            int[] iArr2 = new int[i];
            int[] iArr3 = new int[i];
            int i2 = 0;
            while (true) {
                iArr = this.b;
                random = this.f3143a;
                if (i2 >= i) {
                    break;
                }
                iArr2[i2] = random.nextInt(iArr.length + 1);
                int i3 = i2 + 1;
                int iNextInt = random.nextInt(i3);
                iArr3[i2] = iArr3[iNextInt];
                iArr3[iNextInt] = i2;
                i2 = i3;
            }
            Arrays.sort(iArr2);
            int[] iArr4 = new int[iArr.length + i];
            int i4 = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < iArr.length + i; i6++) {
                if (i4 >= i || i5 != iArr2[i4]) {
                    int i7 = i5 + 1;
                    int i8 = iArr[i5];
                    iArr4[i6] = i8;
                    if (i8 >= 0) {
                        iArr4[i6] = i8 + i;
                    }
                    i5 = i7;
                } else {
                    iArr4[i6] = iArr3[i4];
                    i4++;
                }
            }
            return new DefaultShuffleOrder(iArr4, new Random(random.nextLong()));
        }

        @Override // androidx.media3.exoplayer.source.ShuffleOrder
        public final int getLength() {
            return this.b.length;
        }

        public DefaultShuffleOrder(int[] iArr, Random random) {
            this.b = iArr;
            this.f3143a = random;
            this.c = new int[iArr.length];
            for (int i = 0; i < iArr.length; i++) {
                this.c[iArr[i]] = i;
            }
        }

        public DefaultShuffleOrder(Random random) {
            this(new int[0], random);
        }
    }

    public static final class UnshuffledShuffleOrder implements ShuffleOrder {

        /* renamed from: a, reason: collision with root package name */
        public final int f3144a;

        public UnshuffledShuffleOrder(int i) {
            this.f3144a = i;
        }

        @Override // androidx.media3.exoplayer.source.ShuffleOrder
        public final int a(int i) {
            int i2 = i - 1;
            if (i2 >= 0) {
                return i2;
            }
            return -1;
        }

        @Override // androidx.media3.exoplayer.source.ShuffleOrder
        public final int b(int i) {
            int i2 = i + 1;
            if (i2 < this.f3144a) {
                return i2;
            }
            return -1;
        }

        @Override // androidx.media3.exoplayer.source.ShuffleOrder
        public final int c() {
            int i = this.f3144a;
            if (i > 0) {
                return i - 1;
            }
            return -1;
        }

        @Override // androidx.media3.exoplayer.source.ShuffleOrder
        public final ShuffleOrder d() {
            return new UnshuffledShuffleOrder(0);
        }

        @Override // androidx.media3.exoplayer.source.ShuffleOrder
        public final int e() {
            return this.f3144a > 0 ? 0 : -1;
        }

        @Override // androidx.media3.exoplayer.source.ShuffleOrder
        public final ShuffleOrder f(int i) {
            return new UnshuffledShuffleOrder(this.f3144a - i);
        }

        @Override // androidx.media3.exoplayer.source.ShuffleOrder
        public final ShuffleOrder g(int i) {
            return new UnshuffledShuffleOrder(this.f3144a + i);
        }

        @Override // androidx.media3.exoplayer.source.ShuffleOrder
        public final int getLength() {
            return this.f3144a;
        }
    }

    int a(int i);

    int b(int i);

    int c();

    ShuffleOrder d();

    int e();

    ShuffleOrder f(int i);

    ShuffleOrder g(int i);

    int getLength();
}
