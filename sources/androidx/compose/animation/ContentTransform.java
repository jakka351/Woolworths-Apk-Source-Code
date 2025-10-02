package androidx.compose.animation;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/animation/ContentTransform;", "", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class ContentTransform {

    /* renamed from: a, reason: collision with root package name */
    public final EnterTransition f720a;
    public final ExitTransition b;
    public final MutableFloatState c;
    public SizeTransform d;

    public ContentTransform(EnterTransition enterTransition, ExitTransition exitTransition, float f, SizeTransform sizeTransform) {
        this.f720a = enterTransition;
        this.b = exitTransition;
        this.c = PrimitiveSnapshotStateKt.a(f);
        this.d = sizeTransform;
    }
}
