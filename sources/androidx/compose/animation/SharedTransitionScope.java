package androidx.compose.animation;

import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.LookaheadScope;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@ExperimentalSharedTransitionApi
@Stable
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Landroidx/compose/animation/SharedTransitionScope;", "Landroidx/compose/ui/layout/LookaheadScope;", "OverlayClip", "PlaceHolderSize", "ResizeMode", "SharedContentState", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface SharedTransitionScope extends LookaheadScope {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Landroidx/compose/animation/SharedTransitionScope$OverlayClip;", "", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface OverlayClip {
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Landroidx/compose/animation/SharedTransitionScope$PlaceHolderSize;", "", "Companion", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface PlaceHolderSize {

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/animation/SharedTransitionScope$PlaceHolderSize$Companion;", "", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0002\u0003\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Landroidx/compose/animation/SharedTransitionScope$ResizeMode;", "", "Companion", "Landroidx/compose/animation/RemeasureImpl;", "Landroidx/compose/animation/ScaleToBoundsImpl;", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface ResizeMode {

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/animation/SharedTransitionScope$ResizeMode$Companion;", "", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/animation/SharedTransitionScope$SharedContentState;", "", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    public static final class SharedContentState {
    }
}
