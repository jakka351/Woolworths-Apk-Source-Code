package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class MouseWheelScrollableKt {

    /* renamed from: a, reason: collision with root package name */
    public static final float f894a = 6;
    public static final float b = 1;

    public static final boolean a(float f) {
        return Float.isNaN(f) || Math.abs(f) < 0.5f;
    }
}
