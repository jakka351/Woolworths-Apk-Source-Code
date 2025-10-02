package androidx.compose.animation.graphics.vector;

import androidx.compose.animation.core.RepeatMode;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/animation/graphics/vector/Timestamp;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "animation-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class Timestamp<T> {

    /* renamed from: a, reason: collision with root package name */
    public final int f819a;
    public final int b;
    public final int c;
    public final RepeatMode d;
    public final PropertyValuesHolder1D e;

    public Timestamp(int i, int i2, int i3, RepeatMode repeatMode, PropertyValuesHolder1D propertyValuesHolder1D) {
        this.f819a = i;
        this.b = i2;
        this.c = i3;
        this.d = repeatMode;
        this.e = propertyValuesHolder1D;
    }
}
