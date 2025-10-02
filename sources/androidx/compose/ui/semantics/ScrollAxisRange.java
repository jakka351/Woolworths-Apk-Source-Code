package androidx.compose.ui.semantics;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/semantics/ScrollAxisRange;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ScrollAxisRange {

    /* renamed from: a, reason: collision with root package name */
    public final Lambda f2015a;
    public final Lambda b;
    public final boolean c;

    /* JADX WARN: Multi-variable type inference failed */
    public ScrollAxisRange(Function0 function0, Function0 function02, boolean z) {
        this.f2015a = (Lambda) function0;
        this.b = (Lambda) function02;
        this.c = z;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.Lambda] */
    /* JADX WARN: Type inference failed for: r1v6, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.Lambda] */
    public final String toString() {
        StringBuilder sb = new StringBuilder("ScrollAxisRange(value=");
        sb.append(((Number) this.f2015a.invoke()).floatValue());
        sb.append(", maxValue=");
        sb.append(((Number) this.b.invoke()).floatValue());
        sb.append(", reverseScrolling=");
        return b.s(sb, this.c, ')');
    }
}
