package androidx.compose.ui.node;

import androidx.camera.core.impl.b;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class LayoutNodeKt {

    /* renamed from: a, reason: collision with root package name */
    public static final Density f1920a = DensityKt.b();

    public static final Owner a(LayoutNode layoutNode) {
        Owner owner = layoutNode.s;
        if (owner != null) {
            return owner;
        }
        throw b.w("LayoutNode should be attached to an owner");
    }
}
