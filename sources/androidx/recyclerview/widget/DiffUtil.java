package androidx.recyclerview.widget;

import androidx.camera.core.impl.b;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class DiffUtil {

    /* renamed from: a, reason: collision with root package name */
    public static final Comparator f3657a = new AnonymousClass1();

    /* renamed from: androidx.recyclerview.widget.DiffUtil$1, reason: invalid class name */
    public class AnonymousClass1 implements Comparator<Diagonal> {
        @Override // java.util.Comparator
        public final int compare(Diagonal diagonal, Diagonal diagonal2) {
            return diagonal.f3659a - diagonal2.f3659a;
        }
    }

    public static abstract class Callback {
        public abstract boolean a(int i, int i2);

        public abstract boolean b(int i, int i2);

        public Object c(int i, int i2) {
            return null;
        }

        public abstract int d();

        public abstract int e();
    }

    public static class CenteredArray {

        /* renamed from: a, reason: collision with root package name */
        public final int[] f3658a;
        public final int b;

        public CenteredArray(int i) {
            int[] iArr = new int[i];
            this.f3658a = iArr;
            this.b = iArr.length / 2;
        }

        public final int a(int i) {
            return this.f3658a[i + this.b];
        }
    }

    public static class Diagonal {

        /* renamed from: a, reason: collision with root package name */
        public final int f3659a;
        public final int b;
        public final int c;

        public Diagonal(int i, int i2, int i3) {
            this.f3659a = i;
            this.b = i2;
            this.c = i3;
        }
    }

    public static class DiffResult {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f3660a;
        public final int[] b;
        public final int[] c;
        public final Callback d;
        public final int e;
        public final int f;
        public final boolean g;

        public DiffResult(Callback callback, ArrayList arrayList, int[] iArr, int[] iArr2, boolean z) {
            int i;
            Diagonal diagonal;
            int i2;
            this.f3660a = arrayList;
            this.b = iArr;
            this.c = iArr2;
            Arrays.fill(iArr, 0);
            Arrays.fill(iArr2, 0);
            this.d = callback;
            int iE = callback.e();
            this.e = iE;
            int iD = callback.d();
            this.f = iD;
            this.g = z;
            Diagonal diagonal2 = arrayList.isEmpty() ? null : (Diagonal) arrayList.get(0);
            if (diagonal2 == null || diagonal2.f3659a != 0 || diagonal2.b != 0) {
                arrayList.add(0, new Diagonal(0, 0, 0));
            }
            arrayList.add(new Diagonal(iE, iD, 0));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Diagonal diagonal3 = (Diagonal) it.next();
                for (int i3 = 0; i3 < diagonal3.c; i3++) {
                    int i4 = diagonal3.f3659a + i3;
                    int i5 = diagonal3.b + i3;
                    int i6 = callback.a(i4, i5) ? 1 : 2;
                    iArr[i4] = (i5 << 4) | i6;
                    iArr2[i5] = (i4 << 4) | i6;
                }
            }
            if (this.g) {
                Iterator it2 = arrayList.iterator();
                int i7 = 0;
                while (it2.hasNext()) {
                    Diagonal diagonal4 = (Diagonal) it2.next();
                    while (true) {
                        i = diagonal4.f3659a;
                        if (i7 < i) {
                            if (iArr[i7] == 0) {
                                int size = arrayList.size();
                                int i8 = 0;
                                int i9 = 0;
                                while (true) {
                                    if (i8 < size) {
                                        diagonal = (Diagonal) arrayList.get(i8);
                                        while (true) {
                                            i2 = diagonal.b;
                                            if (i9 < i2) {
                                                if (iArr2[i9] == 0 && callback.b(i7, i9)) {
                                                    int i10 = callback.a(i7, i9) ? 8 : 4;
                                                    iArr[i7] = (i9 << 4) | i10;
                                                    iArr2[i9] = i10 | (i7 << 4);
                                                } else {
                                                    i9++;
                                                }
                                            }
                                        }
                                    }
                                    i9 = diagonal.c + i2;
                                    i8++;
                                }
                            }
                            i7++;
                        }
                    }
                    i7 = diagonal4.c + i;
                }
            }
        }

        public static PostponedUpdate c(ArrayDeque arrayDeque, int i, boolean z) {
            PostponedUpdate postponedUpdate;
            Iterator it = arrayDeque.iterator();
            while (true) {
                if (!it.hasNext()) {
                    postponedUpdate = null;
                    break;
                }
                postponedUpdate = (PostponedUpdate) it.next();
                if (postponedUpdate.f3661a == i && postponedUpdate.c == z) {
                    it.remove();
                    break;
                }
            }
            while (it.hasNext()) {
                PostponedUpdate postponedUpdate2 = (PostponedUpdate) it.next();
                if (z) {
                    postponedUpdate2.b--;
                } else {
                    postponedUpdate2.b++;
                }
            }
            return postponedUpdate;
        }

        public final int a(int i) {
            int i2 = this.e;
            if (i < 0 || i >= i2) {
                throw new IndexOutOfBoundsException(b.i(i, i2, "Index out of bounds - passed position = ", ", old list size = "));
            }
            int i3 = this.b[i];
            if ((i3 & 15) == 0) {
                return -1;
            }
            return i3 >> 4;
        }

        public final void b(ListUpdateCallback listUpdateCallback) {
            int[] iArr;
            Callback callback;
            int i;
            int i2;
            ArrayList arrayList;
            DiffResult diffResult = this;
            BatchingListUpdateCallback batchingListUpdateCallback = listUpdateCallback instanceof BatchingListUpdateCallback ? (BatchingListUpdateCallback) listUpdateCallback : new BatchingListUpdateCallback(listUpdateCallback);
            ArrayDeque arrayDeque = new ArrayDeque();
            ArrayList arrayList2 = diffResult.f3660a;
            boolean z = true;
            int size = arrayList2.size() - 1;
            int i3 = diffResult.e;
            int i4 = diffResult.f;
            int i5 = i3;
            while (size >= 0) {
                Diagonal diagonal = (Diagonal) arrayList2.get(size);
                int i6 = diagonal.f3659a;
                int i7 = diagonal.c;
                int i8 = i6 + i7;
                int i9 = diagonal.b;
                int i10 = i9 + i7;
                while (true) {
                    iArr = diffResult.b;
                    callback = diffResult.d;
                    boolean z2 = z;
                    i = 0;
                    if (i5 <= i8) {
                        break;
                    }
                    i5--;
                    int i11 = iArr[i5];
                    if ((i11 & 12) != 0) {
                        arrayList = arrayList2;
                        int i12 = i11 >> 4;
                        PostponedUpdate postponedUpdateC = c(arrayDeque, i12, false);
                        if (postponedUpdateC != null) {
                            int i13 = (i3 - postponedUpdateC.b) - 1;
                            batchingListUpdateCallback.c(i5, i13);
                            if ((i11 & 4) != 0) {
                                batchingListUpdateCallback.a(i13, z2 ? 1 : 0, callback.c(i5, i12));
                            }
                        } else {
                            arrayDeque.add(new PostponedUpdate(i5, (i3 - i5) - (z2 ? 1 : 0), z2));
                        }
                    } else {
                        arrayList = arrayList2;
                        batchingListUpdateCallback.b(i5, z2 ? 1 : 0);
                        i3--;
                    }
                    arrayList2 = arrayList;
                    z = true;
                }
                ArrayList arrayList3 = arrayList2;
                while (i4 > i10) {
                    i4--;
                    int i14 = diffResult.c[i4];
                    if ((i14 & 12) != 0) {
                        int i15 = i14 >> 4;
                        PostponedUpdate postponedUpdateC2 = c(arrayDeque, i15, true);
                        if (postponedUpdateC2 == null) {
                            arrayDeque.add(new PostponedUpdate(i4, i3 - i5, false));
                            i2 = 0;
                        } else {
                            i2 = 0;
                            batchingListUpdateCallback.c((i3 - postponedUpdateC2.b) - 1, i5);
                            if ((i14 & 4) != 0) {
                                batchingListUpdateCallback.a(i5, 1, callback.c(i15, i4));
                            }
                        }
                    } else {
                        i2 = i;
                        batchingListUpdateCallback.d(i5, 1);
                        i3++;
                    }
                    diffResult = this;
                    i = i2;
                }
                int i16 = i9;
                int i17 = i6;
                while (i < i7) {
                    if ((iArr[i17] & 15) == 2) {
                        batchingListUpdateCallback.a(i17, 1, callback.c(i17, i16));
                    }
                    i17++;
                    i16++;
                    i++;
                }
                size--;
                diffResult = this;
                z = true;
                i4 = i9;
                i5 = i6;
                arrayList2 = arrayList3;
            }
            batchingListUpdateCallback.e();
        }
    }

    public static abstract class ItemCallback<T> {
        public abstract boolean a(Object obj, Object obj2);

        public abstract boolean b(Object obj, Object obj2);

        public Object c(Object obj, Object obj2) {
            return null;
        }
    }

    public static class PostponedUpdate {

        /* renamed from: a, reason: collision with root package name */
        public final int f3661a;
        public int b;
        public final boolean c;

        public PostponedUpdate(int i, int i2, boolean z) {
            this.f3661a = i;
            this.b = i2;
            this.c = z;
        }
    }

    public static class Range {

        /* renamed from: a, reason: collision with root package name */
        public int f3662a;
        public int b;
        public int c;
        public int d;

        public final int a() {
            return this.d - this.c;
        }

        public final int b() {
            return this.b - this.f3662a;
        }
    }

    public static class Snake {

        /* renamed from: a, reason: collision with root package name */
        public int f3663a;
        public int b;
        public int c;
        public int d;
        public boolean e;

        public final int a() {
            return Math.min(this.c - this.f3663a, this.d - this.b);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00e1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0137  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static androidx.recyclerview.widget.DiffUtil.DiffResult a(androidx.recyclerview.widget.DiffUtil.Callback r26, boolean r27) {
        /*
            Method dump skipped, instructions count: 713
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.DiffUtil.a(androidx.recyclerview.widget.DiffUtil$Callback, boolean):androidx.recyclerview.widget.DiffUtil$DiffResult");
    }
}
