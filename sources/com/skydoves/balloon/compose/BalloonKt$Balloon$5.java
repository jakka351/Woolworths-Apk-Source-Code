package com.skydoves.balloon.compose;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.os.ViewTreeSavedStateRegistryOwner;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
final class BalloonKt$Balloon$5 extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        DisposableEffectScope DisposableEffect = (DisposableEffectScope) obj;
        Intrinsics.h(DisposableEffect, "$this$DisposableEffect");
        final BalloonComposeView balloonComposeView = null;
        final ComposeView composeView = null;
        return new DisposableEffectResult() { // from class: com.skydoves.balloon.compose.BalloonKt$Balloon$5$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public final void dispose() {
                BalloonComposeView balloonComposeView2 = balloonComposeView;
                balloonComposeView2.getBalloon().c();
                ViewTreeLifecycleOwner.b(balloonComposeView2, null);
                ViewTreeViewModelStoreOwner.b(balloonComposeView2, null);
                ViewTreeSavedStateRegistryOwner.b(balloonComposeView2, null);
                ComposeView composeView2 = composeView;
                ViewTreeSavedStateRegistryOwner.b(composeView2, null);
                ViewTreeLifecycleOwner.b(composeView2, null);
                ViewTreeViewModelStoreOwner.b(composeView2, null);
            }
        };
    }
}
