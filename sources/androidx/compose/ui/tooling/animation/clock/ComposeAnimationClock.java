package androidx.compose.ui.tooling.animation.clock;

import androidx.compose.animation.tooling.ComposeAnimation;
import androidx.compose.ui.tooling.animation.states.ComposeAnimationState;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b`\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u00020\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/tooling/animation/clock/ComposeAnimationClock;", "Landroidx/compose/animation/tooling/ComposeAnimation;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/ui/tooling/animation/states/ComposeAnimationState;", "TState", "", "ui-tooling_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface ComposeAnimationClock<T extends ComposeAnimation, TState extends ComposeAnimationState> {
    long a();
}
