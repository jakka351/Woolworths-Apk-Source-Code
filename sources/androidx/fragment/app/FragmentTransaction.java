package androidx.fragment.app;

import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.lifecycle.Lifecycle;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class FragmentTransaction {
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public String i;
    public int j;
    public CharSequence k;
    public int l;
    public CharSequence m;
    public ArrayList n;
    public ArrayList o;
    public ArrayList q;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f2759a = new ArrayList();
    public boolean h = true;
    public boolean p = false;

    public final void b(Op op) {
        this.f2759a.add(op);
        op.d = this.b;
        op.e = this.c;
        op.f = this.d;
        op.g = this.e;
    }

    public final void c(String str) {
        if (!this.h) {
            throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
        }
        this.g = true;
        this.i = str;
    }

    public abstract int d();

    public abstract int e();

    public abstract void f();

    public void g(int i, Fragment fragment2, String str, int i2) {
        String str2 = fragment2.mPreviousWho;
        if (str2 != null) {
            FragmentStrictMode.c(fragment2, str2);
        }
        Class<?> cls = fragment2.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = fragment2.mTag;
            if (str3 != null && !str.equals(str3)) {
                StringBuilder sb = new StringBuilder("Can't change tag of fragment ");
                sb.append(fragment2);
                sb.append(": was ");
                throw new IllegalStateException(YU.a.p(sb, fragment2.mTag, " now ", str));
            }
            fragment2.mTag = str;
        }
        if (i != 0) {
            if (i == -1) {
                throw new IllegalArgumentException("Can't add fragment " + fragment2 + " with tag " + str + " to container view with no id");
            }
            int i3 = fragment2.mFragmentId;
            if (i3 != 0 && i3 != i) {
                throw new IllegalStateException("Can't change container ID of fragment " + fragment2 + ": was " + fragment2.mFragmentId + " now " + i);
            }
            fragment2.mFragmentId = i;
            fragment2.mContainerId = i;
        }
        b(new Op(fragment2, i2));
    }

    public abstract boolean h();

    public void i(Fragment fragment2) {
        b(new Op(fragment2, 3));
    }

    public final void j(int i, Fragment fragment2, String str) {
        if (i == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        g(i, fragment2, str, 2);
    }

    public final void k(int i, int i2, int i3, int i4) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    public void l(Fragment fragment2, Lifecycle.State state) {
        b(new Op(fragment2, state));
    }

    public void m(Fragment fragment2) {
        b(new Op(fragment2, 8));
    }

    /* loaded from: classes2.dex */
    public static final class Op {

        /* renamed from: a, reason: collision with root package name */
        public int f2760a;
        public Fragment b;
        public boolean c;
        public int d;
        public int e;
        public int f;
        public int g;
        public Lifecycle.State h;
        public Lifecycle.State i;

        public Op(Fragment fragment2, int i) {
            this.f2760a = i;
            this.b = fragment2;
            this.c = false;
            Lifecycle.State state = Lifecycle.State.h;
            this.h = state;
            this.i = state;
        }

        public Op(Fragment fragment2, int i, int i2) {
            this.f2760a = i;
            this.b = fragment2;
            this.c = true;
            Lifecycle.State state = Lifecycle.State.h;
            this.h = state;
            this.i = state;
        }

        public Op(Fragment fragment2, Lifecycle.State state) {
            this.f2760a = 10;
            this.b = fragment2;
            this.c = false;
            this.h = fragment2.mMaxState;
            this.i = state;
        }

        public Op(Op op) {
            this.f2760a = op.f2760a;
            this.b = op.b;
            this.c = op.c;
            this.d = op.d;
            this.e = op.e;
            this.f = op.f;
            this.g = op.g;
            this.h = op.h;
            this.i = op.i;
        }
    }
}
