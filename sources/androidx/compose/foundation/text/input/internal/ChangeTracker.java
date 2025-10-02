package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/input/internal/ChangeTracker;", "Landroidx/compose/foundation/text/input/TextFieldBuffer$ChangeList;", "Change", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class ChangeTracker implements TextFieldBuffer.ChangeList {

    /* renamed from: a, reason: collision with root package name */
    public MutableVector f1152a = new MutableVector(new Change[16], 0);
    public MutableVector b = new MutableVector(new Change[16], 0);

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/input/internal/ChangeTracker$Change;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Change {

        /* renamed from: a, reason: collision with root package name */
        public int f1153a;
        public int b;
        public int c;
        public int d;

        public Change(int i, int i2, int i3, int i4) {
            this.f1153a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Change)) {
                return false;
            }
            Change change = (Change) obj;
            return this.f1153a == change.f1153a && this.b == change.b && this.c == change.c && this.d == change.d;
        }

        public final int hashCode() {
            return Integer.hashCode(this.d) + androidx.camera.core.impl.b.a(this.c, androidx.camera.core.impl.b.a(this.b, Integer.hashCode(this.f1153a) * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Change(preStart=");
            sb.append(this.f1153a);
            sb.append(", preEnd=");
            sb.append(this.b);
            sb.append(", originalStart=");
            sb.append(this.c);
            sb.append(", originalEnd=");
            return YU.a.l(sb, this.d, ')');
        }
    }

    public ChangeTracker(ChangeTracker changeTracker) {
        MutableVector mutableVector;
        if (changeTracker == null || (mutableVector = changeTracker.f1152a) == null) {
            return;
        }
        Object[] objArr = mutableVector.d;
        int i = mutableVector.f;
        for (int i2 = 0; i2 < i; i2++) {
            Change change = (Change) objArr[i2];
            this.f1152a.c(new Change(change.f1153a, change.b, change.c, change.d));
        }
    }

    public final void a(Change change, int i, int i2, int i3) {
        int i4;
        MutableVector mutableVector = this.b;
        int i5 = mutableVector.f;
        if (i5 == 0) {
            i4 = 0;
        } else {
            if (i5 == 0) {
                throw new NoSuchElementException("MutableVector is empty.");
            }
            Change change2 = (Change) mutableVector.d[i5 - 1];
            i4 = change2.b - change2.d;
        }
        if (change == null) {
            int i6 = i - i4;
            change = new Change(i, i2 + i3, i6, (i2 - i) + i6);
        } else {
            if (change.f1153a > i) {
                change.f1153a = i;
                change.c = i;
            }
            int i7 = change.b;
            if (i2 > i7) {
                int i8 = i7 - change.d;
                change.b = i2;
                change.d = i2 - i8;
            }
            change.b += i3;
        }
        mutableVector.c(change);
    }

    public final void b(int i, int i2, int i3) {
        int i4;
        if (i == i2 && i3 == 0) {
            return;
        }
        int iMin = Math.min(i, i2);
        int iMax = Math.max(i, i2);
        int i5 = i3 - (iMax - iMin);
        int i6 = 0;
        Change change = null;
        boolean z = false;
        while (true) {
            MutableVector mutableVector = this.f1152a;
            if (i6 >= mutableVector.f) {
                break;
            }
            Change change2 = (Change) mutableVector.d[i6];
            int i7 = change2.f1153a;
            if ((iMin > i7 || i7 > iMax) && ((iMin > (i4 = change2.b) || i4 > iMax) && ((iMin > i4 || i7 > iMin) && (iMax > i4 || i7 > iMax)))) {
                if (i7 > iMax && !z) {
                    a(change, iMin, iMax, i5);
                    z = true;
                }
                if (z) {
                    change2.f1153a += i5;
                    change2.b += i5;
                }
                this.b.c(change2);
            } else if (change == null) {
                change = change2;
            } else {
                change.b = change2.b;
                change.d = change2.d;
            }
            i6++;
        }
        if (!z) {
            a(change, iMin, iMax, i5);
        }
        MutableVector mutableVector2 = this.f1152a;
        this.f1152a = this.b;
        this.b = mutableVector2;
        mutableVector2.h();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChangeList(changes=[");
        MutableVector mutableVector = this.f1152a;
        Object[] objArr = mutableVector.d;
        int i = mutableVector.f;
        for (int i2 = 0; i2 < i; i2++) {
            Change change = (Change) objArr[i2];
            sb.append("(" + change.c + ',' + change.d + ")->(" + change.f1153a + ',' + change.b + ')');
            if (i2 < this.f1152a.f - 1) {
                sb.append(", ");
            }
        }
        sb.append("])");
        String string = sb.toString();
        Intrinsics.g(string, "toString(...)");
        return string;
    }
}
