package com.adobe.marketing.mobile.services.ui.message.mapping;

import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.core.AnimationSpecKt;
import com.adobe.marketing.mobile.services.ui.message.InAppMessageSettings;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nlnlnnn;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/adobe/marketing/mobile/services/ui/message/mapping/MessageAnimationMapper;", "", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class MessageAnimationMapper {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f13253a;
    public static final Object b;
    public static final Object c;

    static {
        EnterTransition enterTransitionM = EnterExitTransitionKt.m(AnimationSpecKt.e(nlnlnnn.xxx00780078x0078, 0, null, 6), MessageAnimationMapper$enterAnimationMap$1.h);
        InAppMessageSettings.MessageAnimation messageAnimation = InAppMessageSettings.MessageAnimation.d;
        Pair pair = new Pair(messageAnimation, enterTransitionM);
        EnterTransition enterTransitionM2 = EnterExitTransitionKt.m(AnimationSpecKt.e(nlnlnnn.xxx00780078x0078, 0, null, 6), MessageAnimationMapper$enterAnimationMap$2.h);
        InAppMessageSettings.MessageAnimation messageAnimation2 = InAppMessageSettings.MessageAnimation.e;
        Pair pair2 = new Pair(messageAnimation2, enterTransitionM2);
        EnterTransition enterTransitionN = EnterExitTransitionKt.n(AnimationSpecKt.e(nlnlnnn.xxx00780078x0078, 0, null, 6), MessageAnimationMapper$enterAnimationMap$3.h);
        InAppMessageSettings.MessageAnimation messageAnimation3 = InAppMessageSettings.MessageAnimation.f;
        Pair pair3 = new Pair(messageAnimation3, enterTransitionN);
        EnterTransition enterTransitionN2 = EnterExitTransitionKt.n(AnimationSpecKt.e(nlnlnnn.xxx00780078x0078, 0, null, 6), MessageAnimationMapper$enterAnimationMap$4.h);
        InAppMessageSettings.MessageAnimation messageAnimation4 = InAppMessageSettings.MessageAnimation.g;
        Pair pair4 = new Pair(messageAnimation4, enterTransitionN2);
        EnterTransition enterTransitionE = EnterExitTransitionKt.e(AnimationSpecKt.e(nlnlnnn.xxx00780078x0078, 0, null, 6), 2);
        InAppMessageSettings.MessageAnimation messageAnimation5 = InAppMessageSettings.MessageAnimation.h;
        f13253a = MapsKt.j(pair, pair2, pair3, pair4, new Pair(messageAnimation5, enterTransitionE));
        b = MapsKt.j(new Pair(messageAnimation, EnterExitTransitionKt.p(AnimationSpecKt.e(nlnlnnn.xxx00780078x0078, 0, null, 6), MessageAnimationMapper$exitAnimationMap$1.h)), new Pair(messageAnimation2, EnterExitTransitionKt.p(AnimationSpecKt.e(nlnlnnn.xxx00780078x0078, 0, null, 6), MessageAnimationMapper$exitAnimationMap$2.h)), new Pair(messageAnimation3, EnterExitTransitionKt.q(AnimationSpecKt.e(nlnlnnn.xxx00780078x0078, 0, null, 6), MessageAnimationMapper$exitAnimationMap$3.h)), new Pair(messageAnimation4, EnterExitTransitionKt.q(AnimationSpecKt.e(nlnlnnn.xxx00780078x0078, 0, null, 6), MessageAnimationMapper$exitAnimationMap$4.h)), new Pair(messageAnimation5, EnterExitTransitionKt.f(AnimationSpecKt.e(nlnlnnn.xxx00780078x0078, 0, null, 6), 2)));
        c = MapsKt.j(new Pair(InAppMessageSettings.MessageGesture.SWIPE_UP, EnterExitTransitionKt.q(AnimationSpecKt.e(nlnlnnn.xxx00780078x0078, 0, null, 6), MessageAnimationMapper$gestureAnimationMap$1.h)), new Pair(InAppMessageSettings.MessageGesture.SWIPE_DOWN, EnterExitTransitionKt.q(AnimationSpecKt.e(nlnlnnn.xxx00780078x0078, 0, null, 6), MessageAnimationMapper$gestureAnimationMap$2.h)), new Pair(InAppMessageSettings.MessageGesture.SWIPE_LEFT, EnterExitTransitionKt.p(AnimationSpecKt.e(nlnlnnn.xxx00780078x0078, 0, null, 6), MessageAnimationMapper$gestureAnimationMap$3.h)), new Pair(InAppMessageSettings.MessageGesture.SWIPE_RIGHT, EnterExitTransitionKt.p(AnimationSpecKt.e(nlnlnnn.xxx00780078x0078, 0, null, 6), MessageAnimationMapper$gestureAnimationMap$4.h)), new Pair(InAppMessageSettings.MessageGesture.TAP_BACKGROUND, EnterExitTransitionKt.f(AnimationSpecKt.e(nlnlnnn.xxx00780078x0078, 0, null, 6), 2)));
    }
}
