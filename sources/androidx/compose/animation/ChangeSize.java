package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Immutable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/animation/ChangeSize;", "", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ChangeSize {

    /* renamed from: a, reason: collision with root package name */
    public final Alignment f718a;
    public final Function1 b;
    public final FiniteAnimationSpec c;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "Landroidx/compose/ui/unit/IntSize;", "it", "invoke-mzRDjE0", "(J)J"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: androidx.compose.animation.ChangeSize$1, reason: invalid class name */
    final class AnonymousClass1 extends Lambda implements Function1<IntSize, IntSize> {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            long j = ((IntSize) obj).f2202a;
            long j2 = 0;
            return new IntSize((j2 & 4294967295L) | (j2 << 32));
        }
    }

    public ChangeSize(FiniteAnimationSpec finiteAnimationSpec, Alignment alignment, Function1 function1) {
        this.f718a = alignment;
        this.b = function1;
        this.c = finiteAnimationSpec;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChangeSize)) {
            return false;
        }
        ChangeSize changeSize = (ChangeSize) obj;
        return Intrinsics.c(this.f718a, changeSize.f718a) && this.b.equals(changeSize.b) && Intrinsics.c(this.c, changeSize.c);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + ((this.c.hashCode() + ((this.b.hashCode() + (this.f718a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ChangeSize(alignment=" + this.f718a + ", size=" + this.b + ", animationSpec=" + this.c + ", clip=true)";
    }
}
