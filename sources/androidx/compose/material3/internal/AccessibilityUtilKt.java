package androidx.compose.material3.internal;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class AccessibilityUtilKt {

    /* renamed from: a, reason: collision with root package name */
    public static final float f1543a;
    public static final Modifier b;

    static {
        float f = 10;
        f1543a = f;
        b = PaddingKt.h(SemanticsModifierKt.b(LayoutModifierKt.a(Modifier.Companion.d, AccessibilityUtilKt$IncreaseHorizontalSemanticsBounds$1.h), true, AccessibilityUtilKt$IncreaseHorizontalSemanticsBounds$2.h), f, BitmapDescriptorFactory.HUE_RED, 2);
    }
}
