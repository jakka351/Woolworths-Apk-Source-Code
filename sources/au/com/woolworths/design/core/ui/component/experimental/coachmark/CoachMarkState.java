package au.com.woolworths.design.core.ui.component.experimental.coachmark;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/design/core/ui/component/experimental/coachmark/CoachMarkState;", "", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class CoachMarkState {

    /* renamed from: a, reason: collision with root package name */
    public final MutableState f4721a;
    public final MutableState b;
    public final MutableState c;
    public final MutableState d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CoachMarkState(boolean z, Rect rect) {
        this(z, rect, true);
        CoachMarkPopupDirection coachMarkPopupDirection = CoachMarkPopupDirection.d;
    }

    public CoachMarkState(boolean z, Rect rect, boolean z2) {
        CoachMarkPopupDirection coachMarkPopupDirection = CoachMarkPopupDirection.e;
        this.f4721a = SnapshotStateKt.f(Boolean.valueOf(z));
        this.b = SnapshotStateKt.f(coachMarkPopupDirection);
        this.c = SnapshotStateKt.f(rect);
        this.d = SnapshotStateKt.f(Boolean.valueOf(z2));
    }
}
