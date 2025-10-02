package androidx.compose.animation.graphics.vector;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002\u0082\u0001\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/animation/graphics/vector/PropertyValues;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Landroidx/compose/animation/graphics/vector/ColorPropertyValues;", "Landroidx/compose/animation/graphics/vector/FloatPropertyValues;", "Landroidx/compose/animation/graphics/vector/PathPropertyValues;", "animation-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class PropertyValues<T> {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f814a = new ArrayList();

    public abstract State a(Transition transition, String str, int i, Composer composer, int i2);
}
