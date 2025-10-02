package androidx.compose.animation.core;

import androidx.compose.ui.geometry.Rect;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"animation-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class VisibilityThresholdsKt {

    /* renamed from: a, reason: collision with root package name */
    public static final Rect f802a;
    public static final Object b;

    static {
        Float fValueOf = Float.valueOf(0.5f);
        f802a = new Rect(0.5f, 0.5f, 0.5f, 0.5f);
        TwoWayConverter twoWayConverter = VectorConvertersKt.b;
        Float fValueOf2 = Float.valueOf(1.0f);
        Pair pair = new Pair(twoWayConverter, fValueOf2);
        Pair pair2 = new Pair(VectorConvertersKt.h, fValueOf2);
        Pair pair3 = new Pair(VectorConvertersKt.g, fValueOf2);
        Pair pair4 = new Pair(VectorConvertersKt.f788a, Float.valueOf(0.01f));
        Pair pair5 = new Pair(VectorConvertersKt.i, fValueOf);
        Pair pair6 = new Pair(VectorConvertersKt.e, fValueOf);
        Pair pair7 = new Pair(VectorConvertersKt.f, fValueOf);
        TwoWayConverter twoWayConverter2 = VectorConvertersKt.c;
        Float fValueOf3 = Float.valueOf(0.1f);
        b = MapsKt.j(pair, pair2, pair3, pair4, pair5, pair6, pair7, new Pair(twoWayConverter2, fValueOf3), new Pair(VectorConvertersKt.d, fValueOf3));
    }

    public static final long a() {
        long j = 1;
        return (j & 4294967295L) | (j << 32);
    }

    public static final long b() {
        long j = 1;
        return (j & 4294967295L) | (j << 32);
    }
}
