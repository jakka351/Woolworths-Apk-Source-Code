package com.skydoves.balloon.extensions;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 8, 0}, xi = 176)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class ViewExtensionKt$circularUnRevealed$1 implements Runnable {

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/skydoves/balloon/extensions/ViewExtensionKt$circularUnRevealed$1$2", "Landroid/animation/AnimatorListenerAdapter;", "balloon_release"}, k = 1, mv = {1, 8, 0}, xi = 176)
    @SourceDebugExtension
    /* renamed from: com.skydoves.balloon.extensions.ViewExtensionKt$circularUnRevealed$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AnimatorListenerAdapter {
        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animation) {
            Intrinsics.h(animation, "animation");
            super.onAnimationEnd(animation);
            throw null;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        throw null;
    }
}
