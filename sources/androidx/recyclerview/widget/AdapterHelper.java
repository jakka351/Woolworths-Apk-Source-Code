package androidx.recyclerview.widget;

import android.support.v4.media.session.a;
import androidx.core.util.Pools;
import androidx.recyclerview.widget.OpReorderer;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* loaded from: classes2.dex */
final class AdapterHelper implements OpReorderer.Callback {
    public final RecyclerView.AnonymousClass7 d;

    /* renamed from: a, reason: collision with root package name */
    public final Pools.SimplePool f3647a = new Pools.SimplePool(30);
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public int f = 0;
    public final OpReorderer e = new OpReorderer(this);

    public interface Callback {
    }

    public static final class UpdateOp {

        /* renamed from: a, reason: collision with root package name */
        public int f3648a;
        public int b;
        public Object c;
        public int d;

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (!(obj instanceof UpdateOp)) {
                    return false;
                }
                UpdateOp updateOp = (UpdateOp) obj;
                int i = this.f3648a;
                if (i != updateOp.f3648a) {
                    return false;
                }
                if (i != 8 || Math.abs(this.d - this.b) != 1 || this.d != updateOp.b || this.b != updateOp.d) {
                    if (this.d != updateOp.d || this.b != updateOp.b) {
                        return false;
                    }
                    Object obj2 = this.c;
                    if (obj2 != null) {
                        if (!obj2.equals(updateOp.c)) {
                            return false;
                        }
                    } else if (updateOp.c != null) {
                        return false;
                    }
                }
            }
            return true;
        }

        public final int hashCode() {
            return (((this.f3648a * 31) + this.b) * 31) + this.d;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append("[");
            int i = this.f3648a;
            sb.append(i != 1 ? i != 2 ? i != 4 ? i != 8 ? "??" : "mv" : "up" : "rm" : "add");
            sb.append(",s:");
            sb.append(this.b);
            sb.append("c:");
            sb.append(this.d);
            sb.append(",p:");
            return a.o(this.c, "]", sb);
        }
    }

    public AdapterHelper(RecyclerView.AnonymousClass7 anonymousClass7) {
        this.d = anonymousClass7;
    }

    public final boolean a(int i) {
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            UpdateOp updateOp = (UpdateOp) arrayList.get(i2);
            int i3 = updateOp.f3648a;
            if (i3 != 8) {
                if (i3 == 1) {
                    int i4 = updateOp.b;
                    int i5 = updateOp.d + i4;
                    while (i4 < i5) {
                        if (f(i4, i2 + 1) == i) {
                            return true;
                        }
                        i4++;
                    }
                } else {
                    continue;
                }
            } else {
                if (f(updateOp.d, i2 + 1) == i) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void b() {
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            this.d.a((UpdateOp) arrayList.get(i));
        }
        k(arrayList);
        this.f = 0;
    }

    public final void c() {
        b();
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            UpdateOp updateOp = (UpdateOp) arrayList.get(i);
            int i2 = updateOp.f3648a;
            RecyclerView.AnonymousClass7 anonymousClass7 = this.d;
            if (i2 == 1) {
                anonymousClass7.a(updateOp);
                anonymousClass7.d(updateOp.b, updateOp.d);
            } else if (i2 == 2) {
                anonymousClass7.a(updateOp);
                anonymousClass7.f(updateOp.b, updateOp.d);
            } else if (i2 == 4) {
                anonymousClass7.a(updateOp);
                anonymousClass7.c(updateOp.b, updateOp.d, updateOp.c);
            } else if (i2 == 8) {
                anonymousClass7.a(updateOp);
                anonymousClass7.e(updateOp.b, updateOp.d);
            }
        }
        k(arrayList);
        this.f = 0;
    }

    public final void d(UpdateOp updateOp) {
        int i;
        Pools.SimplePool simplePool;
        int i2 = updateOp.f3648a;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iL = l(updateOp.b, i2);
        int i3 = updateOp.b;
        int i4 = updateOp.f3648a;
        if (i4 == 2) {
            i = 0;
        } else {
            if (i4 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + updateOp);
            }
            i = 1;
        }
        int i5 = 1;
        int i6 = 1;
        while (true) {
            int i7 = updateOp.d;
            simplePool = this.f3647a;
            if (i5 >= i7) {
                break;
            }
            int iL2 = l((i * i5) + updateOp.b, updateOp.f3648a);
            int i8 = updateOp.f3648a;
            if (i8 == 2 ? iL2 != iL : !(i8 == 4 && iL2 == iL + 1)) {
                UpdateOp updateOpH = h(i8, iL, i6, updateOp.c);
                e(updateOpH, i3);
                updateOpH.c = null;
                simplePool.b(updateOpH);
                if (updateOp.f3648a == 4) {
                    i3 += i6;
                }
                i6 = 1;
                iL = iL2;
            } else {
                i6++;
            }
            i5++;
        }
        Object obj = updateOp.c;
        updateOp.c = null;
        simplePool.b(updateOp);
        if (i6 > 0) {
            UpdateOp updateOpH2 = h(updateOp.f3648a, iL, i6, obj);
            e(updateOpH2, i3);
            updateOpH2.c = null;
            simplePool.b(updateOpH2);
        }
    }

    public final void e(UpdateOp updateOp, int i) {
        RecyclerView.AnonymousClass7 anonymousClass7 = this.d;
        anonymousClass7.a(updateOp);
        int i2 = updateOp.f3648a;
        if (i2 == 2) {
            anonymousClass7.f(i, updateOp.d);
        } else {
            if (i2 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            anonymousClass7.c(i, updateOp.d, updateOp.c);
        }
    }

    public final int f(int i, int i2) {
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        while (i2 < size) {
            UpdateOp updateOp = (UpdateOp) arrayList.get(i2);
            int i3 = updateOp.f3648a;
            if (i3 == 8) {
                int i4 = updateOp.b;
                if (i4 == i) {
                    i = updateOp.d;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (updateOp.d <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = updateOp.b;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = updateOp.d;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += updateOp.d;
                }
            }
            i2++;
        }
        return i;
    }

    public final boolean g() {
        return this.b.size() > 0;
    }

    public final UpdateOp h(int i, int i2, int i3, Object obj) {
        UpdateOp updateOp = (UpdateOp) this.f3647a.a();
        if (updateOp != null) {
            updateOp.f3648a = i;
            updateOp.b = i2;
            updateOp.d = i3;
            updateOp.c = obj;
            return updateOp;
        }
        UpdateOp updateOp2 = new UpdateOp();
        updateOp2.f3648a = i;
        updateOp2.b = i2;
        updateOp2.d = i3;
        updateOp2.c = obj;
        return updateOp2;
    }

    public final void i(UpdateOp updateOp) {
        this.c.add(updateOp);
        int i = updateOp.f3648a;
        RecyclerView.AnonymousClass7 anonymousClass7 = this.d;
        if (i == 1) {
            anonymousClass7.d(updateOp.b, updateOp.d);
            return;
        }
        if (i == 2) {
            int i2 = updateOp.b;
            int i3 = updateOp.d;
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.X(i2, i3, false);
            recyclerView.o0 = true;
            return;
        }
        if (i == 4) {
            anonymousClass7.c(updateOp.b, updateOp.d, updateOp.c);
        } else if (i == 8) {
            anonymousClass7.e(updateOp.b, updateOp.d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + updateOp);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:186:0x009f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0121 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0114 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0007 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j() {
        /*
            Method dump skipped, instructions count: 690
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.AdapterHelper.j():void");
    }

    public final void k(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            UpdateOp updateOp = (UpdateOp) arrayList.get(i);
            updateOp.c = null;
            this.f3647a.b(updateOp);
        }
        arrayList.clear();
    }

    public final int l(int i, int i2) {
        int i3;
        int i4;
        ArrayList arrayList = this.c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            UpdateOp updateOp = (UpdateOp) arrayList.get(size);
            int i5 = updateOp.f3648a;
            if (i5 == 8) {
                int i6 = updateOp.b;
                int i7 = updateOp.d;
                if (i6 < i7) {
                    i4 = i6;
                    i3 = i7;
                } else {
                    i3 = i6;
                    i4 = i7;
                }
                if (i < i4 || i > i3) {
                    if (i < i6) {
                        if (i2 == 1) {
                            updateOp.b = i6 + 1;
                            updateOp.d = i7 + 1;
                        } else if (i2 == 2) {
                            updateOp.b = i6 - 1;
                            updateOp.d = i7 - 1;
                        }
                    }
                } else if (i4 == i6) {
                    if (i2 == 1) {
                        updateOp.d = i7 + 1;
                    } else if (i2 == 2) {
                        updateOp.d = i7 - 1;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        updateOp.b = i6 + 1;
                    } else if (i2 == 2) {
                        updateOp.b = i6 - 1;
                    }
                    i--;
                }
            } else {
                int i8 = updateOp.b;
                if (i8 <= i) {
                    if (i5 == 1) {
                        i -= updateOp.d;
                    } else if (i5 == 2) {
                        i += updateOp.d;
                    }
                } else if (i2 == 1) {
                    updateOp.b = i8 + 1;
                } else if (i2 == 2) {
                    updateOp.b = i8 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            UpdateOp updateOp2 = (UpdateOp) arrayList.get(size2);
            int i9 = updateOp2.f3648a;
            Pools.SimplePool simplePool = this.f3647a;
            if (i9 == 8) {
                int i10 = updateOp2.d;
                if (i10 == updateOp2.b || i10 < 0) {
                    arrayList.remove(size2);
                    updateOp2.c = null;
                    simplePool.b(updateOp2);
                }
            } else if (updateOp2.d <= 0) {
                arrayList.remove(size2);
                updateOp2.c = null;
                simplePool.b(updateOp2);
            }
        }
        return i;
    }
}
