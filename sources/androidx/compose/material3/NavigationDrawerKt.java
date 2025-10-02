package androidx.compose.material3;

import androidx.compose.animation.core.Easing;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002¨\u0006\u0004²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0003\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"", "anchorsInitialized", "", "minValue", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class NavigationDrawerKt {

    /* renamed from: a, reason: collision with root package name */
    public static final float f1464a = 400;
    public static final float b = 240;
    public static final TweenSpec c = new TweenSpec(256, (Easing) null, 6);

    public static final float a(GraphicsLayerScope graphicsLayerScope, DrawerPredictiveBackState drawerPredictiveBackState) {
        float fD = Size.d(graphicsLayerScope.h());
        if (Float.isNaN(fD) || fD == BitmapDescriptorFactory.HUE_RED) {
            return 1.0f;
        }
        drawerPredictiveBackState.getClass();
        throw null;
    }

    public static final float b(GraphicsLayerScope graphicsLayerScope, DrawerPredictiveBackState drawerPredictiveBackState) {
        float fB = Size.b(graphicsLayerScope.h());
        if (Float.isNaN(fB) || fB == BitmapDescriptorFactory.HUE_RED) {
            return 1.0f;
        }
        drawerPredictiveBackState.getClass();
        throw null;
    }
}
