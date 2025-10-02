package androidx.compose.runtime.changelist;

import androidx.compose.runtime.Anchor;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.IntStack;
import androidx.compose.runtime.SlotReader;
import androidx.compose.runtime.changelist.Operation;
import androidx.compose.runtime.changelist.Operations;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/changelist/ComposerChangeListWriter;", "", "Companion", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class ComposerChangeListWriter {

    /* renamed from: a, reason: collision with root package name */
    public final ComposerImpl f1673a;
    public ChangeList b;
    public boolean c;
    public int f;
    public int g;
    public int l;
    public final IntStack d = new IntStack();
    public boolean e = true;
    public final ArrayList h = new ArrayList();
    public int i = -1;
    public int j = -1;
    public int k = -1;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/runtime/changelist/ComposerChangeListWriter$Companion;", "", "", "invalidGroupLocation", "I", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
    }

    public ComposerChangeListWriter(ComposerImpl composerImpl, ChangeList changeList) {
        this.f1673a = composerImpl;
        this.b = changeList;
    }

    public final void a() {
        c();
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty()) {
            this.g++;
        } else {
            arrayList.remove(arrayList.size() - 1);
        }
    }

    public final void b() {
        int i = this.g;
        if (i > 0) {
            Operations operations = this.b.f1672a;
            operations.g(Operation.Ups.c);
            operations.c[operations.d - operations.f1676a[operations.b - 1].f1675a] = i;
            this.g = 0;
        }
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty()) {
            return;
        }
        ChangeList changeList = this.b;
        int size = arrayList.size();
        Object[] objArr = new Object[size];
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i2] = arrayList.get(i2);
        }
        changeList.getClass();
        if (size != 0) {
            Operations operations2 = changeList.f1672a;
            operations2.g(Operation.Downs.c);
            Operations.WriteScope.a(operations2, 0, objArr);
        }
        arrayList.clear();
    }

    public final void c() {
        int i = this.l;
        if (i > 0) {
            int i2 = this.i;
            if (i2 >= 0) {
                b();
                Operations operations = this.b.f1672a;
                operations.g(Operation.RemoveNode.c);
                int i3 = operations.d - operations.f1676a[operations.b - 1].f1675a;
                int[] iArr = operations.c;
                iArr[i3] = i2;
                iArr[i3 + 1] = i;
                this.i = -1;
            } else {
                int i4 = this.k;
                int i5 = this.j;
                b();
                Operations operations2 = this.b.f1672a;
                operations2.g(Operation.MoveNode.c);
                int i6 = operations2.d - operations2.f1676a[operations2.b - 1].f1675a;
                int[] iArr2 = operations2.c;
                iArr2[i6 + 1] = i4;
                iArr2[i6] = i5;
                iArr2[i6 + 2] = i;
                this.j = -1;
                this.k = -1;
            }
            this.l = 0;
        }
    }

    public final void d(boolean z) {
        ComposerImpl composerImpl = this.f1673a;
        int i = z ? composerImpl.F.i : composerImpl.F.g;
        int i2 = i - this.f;
        if (i2 < 0) {
            ComposerKt.c("Tried to seek backward");
        }
        if (i2 > 0) {
            Operations operations = this.b.f1672a;
            operations.g(Operation.AdvanceSlotsBy.c);
            operations.c[operations.d - operations.f1676a[operations.b - 1].f1675a] = i2;
            this.f = i;
        }
    }

    public final void e() {
        SlotReader slotReader = this.f1673a.F;
        if (slotReader.c > 0) {
            int i = slotReader.i;
            IntStack intStack = this.d;
            if (intStack.a(-2) != i) {
                if (!this.c && this.e) {
                    d(false);
                    this.b.f1672a.g(Operation.EnsureRootGroupStarted.c);
                    this.c = true;
                }
                if (i > 0) {
                    Anchor anchorA = slotReader.a(i);
                    intStack.c(i);
                    d(false);
                    Operations operations = this.b.f1672a;
                    operations.g(Operation.EnsureGroupStarted.c);
                    Operations.WriteScope.a(operations, 0, anchorA);
                    this.c = true;
                }
            }
        }
    }

    public final void f(int i, int i2) {
        if (i2 > 0) {
            if (!(i >= 0)) {
                ComposerKt.c("Invalid remove index " + i);
            }
            if (this.i == i) {
                this.l += i2;
                return;
            }
            c();
            this.i = i;
            this.l = i2;
        }
    }
}
