package androidx.compose.material3;

import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotMutableIntStateImpl;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/material3/TimePickerStateImpl;", "Landroidx/compose/material3/TimePickerState;", "Companion", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class TimePickerStateImpl implements TimePickerState {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1524a;
    public final MutableState b;
    public final MutableState c;
    public final MutableIntState d;
    public final MutableIntState e;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material3/TimePickerStateImpl$Companion;", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
    }

    public TimePickerStateImpl(int i, int i2, boolean z) {
        if (i < 0 || i >= 24) {
            throw new IllegalArgumentException("initialHour should in [0..23] range");
        }
        if (i2 < 0 || i2 >= 60) {
            throw new IllegalArgumentException("initialMinute should be in [0..59] range");
        }
        this.f1524a = z;
        this.b = SnapshotStateKt.f(new TimePickerSelectionMode(0));
        this.c = SnapshotStateKt.f(Boolean.valueOf(i >= 12));
        this.d = SnapshotIntStateKt.a(i % 12);
        this.e = SnapshotIntStateKt.a(i2);
    }

    @Override // androidx.compose.material3.TimePickerState
    public final int a() {
        return ((SnapshotMutableIntStateImpl) this.d).d() + (b() ? 12 : 0);
    }

    @Override // androidx.compose.material3.TimePickerState
    public final boolean b() {
        return ((Boolean) ((SnapshotMutableStateImpl) this.c).getD()).booleanValue();
    }

    @Override // androidx.compose.material3.TimePickerState
    public final void c(boolean z) {
        ((SnapshotMutableStateImpl) this.c).setValue(Boolean.valueOf(z));
    }

    @Override // androidx.compose.material3.TimePickerState
    public final void d(int i) {
        ((SnapshotMutableStateImpl) this.b).setValue(new TimePickerSelectionMode(i));
    }

    @Override // androidx.compose.material3.TimePickerState
    public final int e() {
        return ((TimePickerSelectionMode) ((SnapshotMutableStateImpl) this.b).getD()).f1523a;
    }

    @Override // androidx.compose.material3.TimePickerState
    public final int f() {
        return ((SnapshotMutableIntStateImpl) this.e).d();
    }

    @Override // androidx.compose.material3.TimePickerState
    /* renamed from: g, reason: from getter */
    public final boolean getF1524a() {
        return this.f1524a;
    }
}
