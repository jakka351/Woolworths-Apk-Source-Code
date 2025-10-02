package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/SuspendPointerInputElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNodeImpl;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SuspendPointerInputElement extends ModifierNodeElement<SuspendingPointerInputModifierNodeImpl> {
    public final Object d;
    public final Object e;
    public final Object[] f;
    public final PointerInputEventHandler g;

    public SuspendPointerInputElement(Object obj, Object obj2, Object[] objArr, PointerInputEventHandler pointerInputEventHandler, int i) {
        obj = (i & 1) != 0 ? null : obj;
        obj2 = (i & 2) != 0 ? null : obj2;
        objArr = (i & 4) != 0 ? null : objArr;
        this.d = obj;
        this.e = obj2;
        this.f = objArr;
        this.g = pointerInputEventHandler;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        return new SuspendingPointerInputModifierNodeImpl(this.d, this.e, this.f, this.g);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        SuspendingPointerInputModifierNodeImpl suspendingPointerInputModifierNodeImpl = (SuspendingPointerInputModifierNodeImpl) node;
        Object obj = suspendingPointerInputModifierNodeImpl.r;
        Object obj2 = this.d;
        boolean z = !Intrinsics.c(obj, obj2);
        suspendingPointerInputModifierNodeImpl.r = obj2;
        Object obj3 = suspendingPointerInputModifierNodeImpl.s;
        Object obj4 = this.e;
        if (!Intrinsics.c(obj3, obj4)) {
            z = true;
        }
        suspendingPointerInputModifierNodeImpl.s = obj4;
        Object[] objArr = suspendingPointerInputModifierNodeImpl.t;
        Object[] objArr2 = this.f;
        if (objArr != null && objArr2 == null) {
            z = true;
        }
        if (objArr == null && objArr2 != null) {
            z = true;
        }
        if (objArr != null && objArr2 != null && !Arrays.equals(objArr2, objArr)) {
            z = true;
        }
        suspendingPointerInputModifierNodeImpl.t = objArr2;
        Class<?> cls = suspendingPointerInputModifierNodeImpl.v.getClass();
        PointerInputEventHandler pointerInputEventHandler = this.g;
        if (cls == pointerInputEventHandler.getClass() ? z : true) {
            suspendingPointerInputModifierNodeImpl.v1();
        }
        suspendingPointerInputModifierNodeImpl.v = pointerInputEventHandler;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuspendPointerInputElement)) {
            return false;
        }
        SuspendPointerInputElement suspendPointerInputElement = (SuspendPointerInputElement) obj;
        Object[] objArr = suspendPointerInputElement.f;
        if (!Intrinsics.c(this.d, suspendPointerInputElement.d) || !Intrinsics.c(this.e, suspendPointerInputElement.e)) {
            return false;
        }
        Object[] objArr2 = this.f;
        if (objArr2 != null) {
            if (objArr == null || !Arrays.equals(objArr2, objArr)) {
                return false;
            }
        } else if (objArr != null) {
            return false;
        }
        return this.g == suspendPointerInputElement.g;
    }

    public final int hashCode() {
        Object obj = this.d;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.e;
        int iHashCode2 = (iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31;
        Object[] objArr = this.f;
        return this.g.hashCode() + ((iHashCode2 + (objArr != null ? Arrays.hashCode(objArr) : 0)) * 31);
    }
}
