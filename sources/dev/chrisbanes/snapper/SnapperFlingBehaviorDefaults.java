package dev.chrisbanes.snapper;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

@StabilityInferred
@ExperimentalSnapperApi
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ldev/chrisbanes/snapper/SnapperFlingBehaviorDefaults;", "", "lib_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SnapperFlingBehaviorDefaults {

    /* renamed from: a, reason: collision with root package name */
    public static final SpringSpec f23784a = AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, 400.0f, null, 5);
    public static final Function1 b = SnapperFlingBehaviorDefaults$MaximumFlingDistance$1.h;
    public static final Function3 c = SnapperFlingBehaviorDefaults$SnapIndex$1.h;
}
