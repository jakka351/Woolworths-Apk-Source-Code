package androidx.window.layout;

import androidx.window.sidecar.SidecarDisplayFeature;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Landroidx/window/sidecar/SidecarDisplayFeature;", "invoke", "(Landroidx/window/sidecar/SidecarDisplayFeature;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes2.dex */
final class SidecarAdapter$translate$checkedFeature$1 extends Lambda implements Function1<SidecarDisplayFeature, Boolean> {
    public static final SidecarAdapter$translate$checkedFeature$1 h = new SidecarAdapter$translate$checkedFeature$1(1);

    @Override // kotlin.jvm.functions.Function1
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Boolean invoke(SidecarDisplayFeature require) {
        Intrinsics.h(require, "$this$require");
        boolean z = true;
        if (require.getType() != 1 && require.getType() != 2) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
