package androidx.compose.ui.graphics;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002*\n\u0010\u0001\"\u00020\u00002\u00020\u0000¨\u0006\u0002"}, d2 = {"Landroid/graphics/Canvas;", "NativeCanvas", "ui-graphics_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class AndroidCanvas_androidKt {

    /* renamed from: a, reason: collision with root package name */
    public static final android.graphics.Canvas f1756a = new android.graphics.Canvas();

    public static final android.graphics.Canvas a(Canvas canvas) {
        Intrinsics.f(canvas, "null cannot be cast to non-null type androidx.compose.ui.graphics.AndroidCanvas");
        return ((AndroidCanvas) canvas).f1755a;
    }
}
