package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material3/ExitUntilCollapsedScrollBehavior;", "Landroidx/compose/material3/TopAppBarScrollBehavior;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ExitUntilCollapsedScrollBehavior implements TopAppBarScrollBehavior {

    /* renamed from: a, reason: collision with root package name */
    public final TopAppBarState f1443a;
    public final SpringSpec b;
    public final DecayAnimationSpec c;
    public final Function0 d = TopAppBarDefaults$exitUntilCollapsedScrollBehavior$1.h;
    public final ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1 e = new ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1(this);

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material3.ExitUntilCollapsedScrollBehavior$1, reason: invalid class name */
    final class AnonymousClass1 extends Lambda implements Function0<Boolean> {
        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Object invoke() {
            return Boolean.TRUE;
        }
    }

    public ExitUntilCollapsedScrollBehavior(TopAppBarState topAppBarState, SpringSpec springSpec, DecayAnimationSpec decayAnimationSpec) {
        this.f1443a = topAppBarState;
        this.b = springSpec;
        this.c = decayAnimationSpec;
    }

    @Override // androidx.compose.material3.TopAppBarScrollBehavior
    public final NestedScrollConnection a() {
        return this.e;
    }

    @Override // androidx.compose.material3.TopAppBarScrollBehavior
    public final AnimationSpec b() {
        return this.b;
    }

    @Override // androidx.compose.material3.TopAppBarScrollBehavior
    /* renamed from: c, reason: from getter */
    public final DecayAnimationSpec getC() {
        return this.c;
    }

    @Override // androidx.compose.material3.TopAppBarScrollBehavior
    /* renamed from: getState, reason: from getter */
    public final TopAppBarState getF1443a() {
        return this.f1443a;
    }
}
