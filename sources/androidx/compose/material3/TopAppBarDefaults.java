package androidx.compose.material3;

import androidx.compose.animation.SplineBasedFloatDecayAnimationSpec_androidKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.material3.tokens.TopAppBarLargeTokens;
import androidx.compose.material3.tokens.TopAppBarMediumTokens;
import androidx.compose.material3.tokens.TopAppBarSmallTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@ExperimentalMaterial3Api
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material3/TopAppBarDefaults;", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class TopAppBarDefaults {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f1526a = 0;

    static {
        int i = TopAppBarSmallTokens.f1612a;
        int i2 = TopAppBarMediumTokens.f1611a;
        int i3 = TopAppBarLargeTokens.f1610a;
    }

    public static TopAppBarScrollBehavior a(Composer composer) {
        return new EnterAlwaysScrollBehavior(AppBarKt.c(composer), AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, 400.0f, null, 5), SplineBasedFloatDecayAnimationSpec_androidKt.a(composer));
    }

    public static TopAppBarScrollBehavior b(Composer composer) {
        return new ExitUntilCollapsedScrollBehavior(AppBarKt.c(composer), AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, 400.0f, null, 5), SplineBasedFloatDecayAnimationSpec_androidKt.a(composer));
    }
}
