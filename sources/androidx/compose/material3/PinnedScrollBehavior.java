package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material3/PinnedScrollBehavior;", "Landroidx/compose/material3/TopAppBarScrollBehavior;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
final class PinnedScrollBehavior implements TopAppBarScrollBehavior {

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material3.PinnedScrollBehavior$1, reason: invalid class name */
    final class AnonymousClass1 extends Lambda implements Function0<Boolean> {
        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Object invoke() {
            return Boolean.TRUE;
        }
    }

    @Override // androidx.compose.material3.TopAppBarScrollBehavior
    public final NestedScrollConnection a() {
        return null;
    }

    @Override // androidx.compose.material3.TopAppBarScrollBehavior
    public final AnimationSpec b() {
        return null;
    }

    @Override // androidx.compose.material3.TopAppBarScrollBehavior
    /* renamed from: c */
    public final DecayAnimationSpec getC() {
        return null;
    }

    @Override // androidx.compose.material3.TopAppBarScrollBehavior
    /* renamed from: getState */
    public final TopAppBarState getF1443a() {
        return null;
    }
}
