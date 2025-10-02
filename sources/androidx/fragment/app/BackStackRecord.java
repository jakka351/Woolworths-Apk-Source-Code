package androidx.fragment.app;

import android.util.Log;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Lifecycle;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class BackStackRecord extends FragmentTransaction implements FragmentManager.BackStackEntry, FragmentManager.OpGenerator {
    public final FragmentManager r;
    public boolean s;
    public int t;
    public boolean u;

    public BackStackRecord(FragmentManager fragmentManager) {
        fragmentManager.M();
        FragmentHostCallback fragmentHostCallback = fragmentManager.x;
        if (fragmentHostCallback != null) {
            fragmentHostCallback.e.getClassLoader();
        }
        this.t = -1;
        this.u = false;
        this.r = fragmentManager;
    }

    @Override // androidx.fragment.app.FragmentManager.OpGenerator
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (FragmentManager.Q(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.g) {
            return true;
        }
        this.r.d.add(this);
        return true;
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public final int d() {
        return p(false, true);
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public final int e() {
        return p(true, true);
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public final void f() {
        if (this.g) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.h = false;
        this.r.C(this, false);
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public final void g(int i, Fragment fragment2, String str, int i2) {
        super.g(i, fragment2, str, i2);
        fragment2.mFragmentManager = this.r;
    }

    @Override // androidx.fragment.app.FragmentManager.BackStackEntry
    public final int getId() {
        return this.t;
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public final boolean h() {
        return this.f2759a.isEmpty();
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public final void i(Fragment fragment2) {
        FragmentManager fragmentManager = fragment2.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.r) {
            super.i(fragment2);
            return;
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment2.toString() + " is already attached to a FragmentManager.");
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public final void l(Fragment fragment2, Lifecycle.State state) {
        FragmentManager fragmentManager = fragment2.mFragmentManager;
        FragmentManager fragmentManager2 = this.r;
        if (fragmentManager != fragmentManager2) {
            throw new IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager " + fragmentManager2);
        }
        if (state == Lifecycle.State.e && fragment2.mState > -1) {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + state + " after the Fragment has been created");
        }
        if (state != Lifecycle.State.d) {
            super.l(fragment2, state);
            return;
        }
        throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + state + ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public final void m(Fragment fragment2) {
        FragmentManager fragmentManager = fragment2.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.r) {
            super.m(fragment2);
            return;
        }
        throw new IllegalStateException("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment " + fragment2.toString() + " is already attached to a FragmentManager.");
    }

    public final void n(int i) {
        if (this.g) {
            if (FragmentManager.Q(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            ArrayList arrayList = this.f2759a;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                FragmentTransaction.Op op = (FragmentTransaction.Op) arrayList.get(i2);
                Fragment fragment2 = op.b;
                if (fragment2 != null) {
                    fragment2.mBackStackNesting += i;
                    if (FragmentManager.Q(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + op.b + " to " + op.b.mBackStackNesting);
                    }
                }
            }
        }
    }

    public final void o() {
        ArrayList arrayList = this.f2759a;
        int size = arrayList.size() - 1;
        while (size >= 0) {
            FragmentTransaction.Op op = (FragmentTransaction.Op) arrayList.get(size);
            if (op.c) {
                if (op.f2760a == 8) {
                    op.c = false;
                    arrayList.remove(size - 1);
                    size--;
                } else {
                    int i = op.b.mContainerId;
                    op.f2760a = 2;
                    op.c = false;
                    for (int i2 = size - 1; i2 >= 0; i2--) {
                        FragmentTransaction.Op op2 = (FragmentTransaction.Op) arrayList.get(i2);
                        if (op2.c && op2.b.mContainerId == i) {
                            arrayList.remove(i2);
                            size--;
                        }
                    }
                }
            }
            size--;
        }
    }

    public final int p(boolean z, boolean z2) {
        if (this.s) {
            throw new IllegalStateException("commit already called");
        }
        if (FragmentManager.Q(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new LogWriter());
            q("  ", printWriter, true);
            printWriter.close();
        }
        this.s = true;
        boolean z3 = this.g;
        FragmentManager fragmentManager = this.r;
        if (z3) {
            this.t = fragmentManager.k.getAndIncrement();
        } else {
            this.t = -1;
        }
        if (z2) {
            fragmentManager.z(this, z);
        }
        return this.t;
    }

    public final void q(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.i);
            printWriter.print(" mIndex=");
            printWriter.print(this.t);
            printWriter.print(" mCommitted=");
            printWriter.println(this.s);
            if (this.f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f));
            }
            if (this.b != 0 || this.c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.c));
            }
            if (this.d != 0 || this.e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.e));
            }
            if (this.j != 0 || this.k != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.j));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.k);
            }
            if (this.l != 0 || this.m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.l));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.m);
            }
        }
        ArrayList arrayList = this.f2759a;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            FragmentTransaction.Op op = (FragmentTransaction.Op) arrayList.get(i);
            switch (op.f2760a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + op.f2760a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(op.b);
            if (z) {
                if (op.d != 0 || op.e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(op.d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(op.e));
                }
                if (op.f != 0 || op.g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(op.f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(op.g));
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sbO = androidx.constraintlayout.core.state.a.o(128, "BackStackEntry{");
        sbO.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.t >= 0) {
            sbO.append(" #");
            sbO.append(this.t);
        }
        if (this.i != null) {
            sbO.append(" ");
            sbO.append(this.i);
        }
        sbO.append("}");
        return sbO.toString();
    }

    public BackStackRecord(BackStackRecord backStackRecord) {
        backStackRecord.r.M();
        FragmentHostCallback fragmentHostCallback = backStackRecord.r.x;
        if (fragmentHostCallback != null) {
            fragmentHostCallback.e.getClassLoader();
        }
        Iterator it = backStackRecord.f2759a.iterator();
        while (it.hasNext()) {
            this.f2759a.add(new FragmentTransaction.Op((FragmentTransaction.Op) it.next()));
        }
        this.b = backStackRecord.b;
        this.c = backStackRecord.c;
        this.d = backStackRecord.d;
        this.e = backStackRecord.e;
        this.f = backStackRecord.f;
        this.g = backStackRecord.g;
        this.h = backStackRecord.h;
        this.i = backStackRecord.i;
        this.l = backStackRecord.l;
        this.m = backStackRecord.m;
        this.j = backStackRecord.j;
        this.k = backStackRecord.k;
        if (backStackRecord.n != null) {
            ArrayList arrayList = new ArrayList();
            this.n = arrayList;
            arrayList.addAll(backStackRecord.n);
        }
        if (backStackRecord.o != null) {
            ArrayList arrayList2 = new ArrayList();
            this.o = arrayList2;
            arrayList2.addAll(backStackRecord.o);
        }
        this.p = backStackRecord.p;
        this.t = -1;
        this.u = false;
        this.r = backStackRecord.r;
        this.s = backStackRecord.s;
        this.t = backStackRecord.t;
        this.u = backStackRecord.u;
    }
}
