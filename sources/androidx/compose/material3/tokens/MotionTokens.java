package androidx.compose.material3.tokens;

import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material3/tokens/MotionTokens;", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MotionTokens {

    /* renamed from: a, reason: collision with root package name */
    public static final CubicBezierEasing f1590a = new CubicBezierEasing(0.2f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f);
    public static final CubicBezierEasing b;
    public static final CubicBezierEasing c;

    static {
        new CubicBezierEasing(0.3f, BitmapDescriptorFactory.HUE_RED, 0.8f, 0.15f);
        b = new CubicBezierEasing(0.05f, 0.7f, 0.1f, 1.0f);
        new CubicBezierEasing(0.4f, BitmapDescriptorFactory.HUE_RED, 0.2f, 1.0f);
        new CubicBezierEasing(0.4f, BitmapDescriptorFactory.HUE_RED, 1.0f, 1.0f);
        new CubicBezierEasing(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0.2f, 1.0f);
        c = new CubicBezierEasing(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, 1.0f);
        new CubicBezierEasing(0.2f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f);
        new CubicBezierEasing(0.3f, BitmapDescriptorFactory.HUE_RED, 1.0f, 1.0f);
        new CubicBezierEasing(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f);
    }
}
