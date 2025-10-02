package androidx.compose.ui;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/CombinedModifier;", "Landroidx/compose/ui/Modifier;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CombinedModifier implements Modifier {
    public final Modifier d;
    public final Modifier e;

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "acc", "element", "Landroidx/compose/ui/Modifier$Element;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.CombinedModifier$toString$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    final class AnonymousClass1 extends Lambda implements Function2<String, Modifier.Element, String> {
        public static final AnonymousClass1 h = new AnonymousClass1(2);

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            String str = (String) obj;
            Modifier.Element element = (Modifier.Element) obj2;
            if (str.length() == 0) {
                return element.toString();
            }
            return str + ", " + element;
        }
    }

    public CombinedModifier(Modifier modifier, Modifier modifier2) {
        this.d = modifier;
        this.e = modifier2;
    }

    @Override // androidx.compose.ui.Modifier
    public final boolean E(Function1 function1) {
        return this.d.E(function1) || this.e.E(function1);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof CombinedModifier)) {
            return false;
        }
        CombinedModifier combinedModifier = (CombinedModifier) obj;
        return Intrinsics.c(this.d, combinedModifier.d) && Intrinsics.c(this.e, combinedModifier.e);
    }

    public final int hashCode() {
        return (this.e.hashCode() * 31) + this.d.hashCode();
    }

    public final String toString() {
        return b.r(new StringBuilder("["), (String) w("", AnonymousClass1.h), ']');
    }

    @Override // androidx.compose.ui.Modifier
    public final Object w(Object obj, Function2 function2) {
        return this.e.w(this.d.w(obj, function2), function2);
    }

    @Override // androidx.compose.ui.Modifier
    public final boolean y(Function1 function1) {
        return this.d.y(function1) && this.e.y(function1);
    }
}
