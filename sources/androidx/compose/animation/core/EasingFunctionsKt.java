package androidx.compose.animation.core;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"animation-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class EasingFunctionsKt {

    /* renamed from: a, reason: collision with root package name */
    public static final CubicBezierEasing f755a;
    public static final CubicBezierEasing b;
    public static final CubicBezierEasing c;

    static {
        new CubicBezierEasing(0.25f, 0.1f, 0.25f, 1.0f);
        new CubicBezierEasing(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0.58f, 1.0f);
        f755a = new CubicBezierEasing(0.42f, BitmapDescriptorFactory.HUE_RED, 1.0f, 1.0f);
        b = new CubicBezierEasing(0.42f, BitmapDescriptorFactory.HUE_RED, 0.58f, 1.0f);
        new CubicBezierEasing(0.12f, BitmapDescriptorFactory.HUE_RED, 0.39f, BitmapDescriptorFactory.HUE_RED);
        new CubicBezierEasing(0.61f, 1.0f, 0.88f, 1.0f);
        new CubicBezierEasing(0.37f, BitmapDescriptorFactory.HUE_RED, 0.63f, 1.0f);
        new CubicBezierEasing(0.32f, BitmapDescriptorFactory.HUE_RED, 0.67f, BitmapDescriptorFactory.HUE_RED);
        new CubicBezierEasing(0.33f, 1.0f, 0.68f, 1.0f);
        new CubicBezierEasing(0.65f, BitmapDescriptorFactory.HUE_RED, 0.35f, 1.0f);
        new CubicBezierEasing(0.64f, BitmapDescriptorFactory.HUE_RED, 0.78f, BitmapDescriptorFactory.HUE_RED);
        new CubicBezierEasing(0.22f, 1.0f, 0.36f, 1.0f);
        new CubicBezierEasing(0.83f, BitmapDescriptorFactory.HUE_RED, 0.17f, 1.0f);
        new CubicBezierEasing(0.55f, BitmapDescriptorFactory.HUE_RED, 1.0f, 0.45f);
        new CubicBezierEasing(BitmapDescriptorFactory.HUE_RED, 0.55f, 0.45f, 1.0f);
        new CubicBezierEasing(0.85f, BitmapDescriptorFactory.HUE_RED, 0.15f, 1.0f);
        new CubicBezierEasing(0.11f, BitmapDescriptorFactory.HUE_RED, 0.5f, BitmapDescriptorFactory.HUE_RED);
        new CubicBezierEasing(0.5f, 1.0f, 0.89f, 1.0f);
        new CubicBezierEasing(0.45f, BitmapDescriptorFactory.HUE_RED, 0.55f, 1.0f);
        new CubicBezierEasing(0.5f, BitmapDescriptorFactory.HUE_RED, 0.75f, BitmapDescriptorFactory.HUE_RED);
        c = new CubicBezierEasing(0.25f, 1.0f, 0.5f, 1.0f);
        new CubicBezierEasing(0.76f, BitmapDescriptorFactory.HUE_RED, 0.24f, 1.0f);
        new CubicBezierEasing(0.7f, BitmapDescriptorFactory.HUE_RED, 0.84f, BitmapDescriptorFactory.HUE_RED);
        new CubicBezierEasing(0.16f, 1.0f, 0.3f, 1.0f);
        new CubicBezierEasing(0.87f, BitmapDescriptorFactory.HUE_RED, 0.13f, 1.0f);
        new CubicBezierEasing(0.36f, BitmapDescriptorFactory.HUE_RED, 0.66f, -0.56f);
        new CubicBezierEasing(0.34f, 1.56f, 0.64f, 1.0f);
        new CubicBezierEasing(0.68f, -0.6f, 0.32f, 1.6f);
    }
}
