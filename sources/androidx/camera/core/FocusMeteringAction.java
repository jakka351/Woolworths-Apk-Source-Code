package androidx.camera.core;

import androidx.annotation.RestrictTo;
import androidx.core.util.Preconditions;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class FocusMeteringAction {

    /* renamed from: a, reason: collision with root package name */
    public final List f401a;
    public final List b;
    public final List c;
    public final long d;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface MeteringMode {
    }

    public FocusMeteringAction(Builder builder) {
        this.f401a = Collections.unmodifiableList(builder.f402a);
        this.b = Collections.unmodifiableList(builder.b);
        this.c = Collections.unmodifiableList(builder.c);
        this.d = builder.d;
    }

    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f402a;
        public final ArrayList b;
        public final ArrayList c;
        public final long d;

        public Builder(MeteringPoint meteringPoint) {
            this.f402a = new ArrayList();
            this.b = new ArrayList();
            this.c = new ArrayList();
            this.d = 5000L;
            a(meteringPoint, 1);
        }

        public final void a(MeteringPoint meteringPoint, int i) {
            Preconditions.a("Invalid metering mode " + i, i >= 1 && i <= 7);
            if ((i & 1) != 0) {
                this.f402a.add(meteringPoint);
            }
            if ((i & 2) != 0) {
                this.b.add(meteringPoint);
            }
        }

        public final void b(int i) {
            if ((i & 1) != 0) {
                this.f402a.clear();
            }
            if ((i & 2) != 0) {
                this.b.clear();
            }
            if ((i & 4) != 0) {
                this.c.clear();
            }
        }

        public Builder(FocusMeteringAction focusMeteringAction) {
            ArrayList arrayList = new ArrayList();
            this.f402a = arrayList;
            ArrayList arrayList2 = new ArrayList();
            this.b = arrayList2;
            ArrayList arrayList3 = new ArrayList();
            this.c = arrayList3;
            this.d = 5000L;
            arrayList.addAll(focusMeteringAction.f401a);
            arrayList2.addAll(focusMeteringAction.b);
            arrayList3.addAll(focusMeteringAction.c);
            this.d = focusMeteringAction.d;
        }
    }
}
