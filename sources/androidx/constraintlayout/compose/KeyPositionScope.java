package androidx.constraintlayout.compose;

import androidx.camera.core.impl.b;
import androidx.compose.foundation.layout.LayoutScopeMarker;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KProperty;

@LayoutScopeMarker
@StabilityInferred
@ExperimentalMotionApi
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/constraintlayout/compose/KeyPositionScope;", "Landroidx/constraintlayout/compose/BaseKeyFrameScope;", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class KeyPositionScope extends BaseKeyFrameScope {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f2246a;

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(KeyPositionScope.class, "percentX", "getPercentX()F", 0);
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        f2246a = new KProperty[]{reflectionFactory.e(mutablePropertyReference1Impl), b.y(KeyPositionScope.class, "percentY", "getPercentY()F", 0, reflectionFactory), b.y(KeyPositionScope.class, "percentWidth", "getPercentWidth()F", 0, reflectionFactory), b.y(KeyPositionScope.class, "percentHeight", "getPercentHeight()F", 0, reflectionFactory), b.y(KeyPositionScope.class, "curveFit", "getCurveFit()Landroidx/constraintlayout/compose/CurveFit;", 0, reflectionFactory)};
    }
}
