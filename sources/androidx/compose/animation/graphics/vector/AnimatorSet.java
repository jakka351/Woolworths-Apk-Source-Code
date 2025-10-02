package androidx.compose.animation.graphics.vector;

import androidx.collection.MutableScatterMap;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/animation/graphics/vector/AnimatorSet;", "Landroidx/compose/animation/graphics/vector/Animator;", "animation-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final /* data */ class AnimatorSet extends Animator {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f810a;
    public final Ordering b;
    public final int c;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[Ordering.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Ordering ordering = Ordering.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public AnimatorSet(ArrayList arrayList, Ordering ordering) {
        Object obj;
        this.f810a = arrayList;
        this.b = ordering;
        int iOrdinal = ordering.ordinal();
        int c = 0;
        int i = 1;
        if (iOrdinal == 0) {
            if (arrayList.isEmpty()) {
                obj = null;
            } else {
                Object obj2 = arrayList.get(0);
                int c2 = ((Animator) obj2).getF();
                int I = CollectionsKt.I(arrayList);
                if (1 <= I) {
                    while (true) {
                        Object obj3 = arrayList.get(i);
                        int c3 = ((Animator) obj3).getF();
                        if (c2 < c3) {
                            obj2 = obj3;
                            c2 = c3;
                        }
                        if (i == I) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                obj = obj2;
            }
            Animator animator = (Animator) obj;
            if (animator != null) {
                c = animator.getF();
            }
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            int size = arrayList.size();
            int c4 = 0;
            while (c < size) {
                c4 += ((Animator) arrayList.get(c)).getF();
                c++;
            }
            c = c4;
        }
        this.c = c;
    }

    @Override // androidx.compose.animation.graphics.vector.Animator
    public final void b(MutableScatterMap mutableScatterMap, int i, int i2) {
        int iOrdinal = this.b.ordinal();
        int i3 = 0;
        ArrayList arrayList = this.f810a;
        if (iOrdinal == 0) {
            int size = arrayList.size();
            while (i3 < size) {
                ((Animator) arrayList.get(i3)).b(mutableScatterMap, i, i2);
                i3++;
            }
            return;
        }
        if (iOrdinal != 1) {
            return;
        }
        int size2 = arrayList.size();
        while (i3 < size2) {
            Animator animator = (Animator) arrayList.get(i3);
            animator.b(mutableScatterMap, i, i2);
            i2 += animator.getF();
            i3++;
        }
    }

    @Override // androidx.compose.animation.graphics.vector.Animator
    /* renamed from: c, reason: from getter */
    public final int getF() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnimatorSet)) {
            return false;
        }
        AnimatorSet animatorSet = (AnimatorSet) obj;
        return this.f810a.equals(animatorSet.f810a) && this.b == animatorSet.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f810a.hashCode() * 31);
    }

    public final String toString() {
        return "AnimatorSet(animators=" + this.f810a + ", ordering=" + this.b + ')';
    }
}
