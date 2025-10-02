package au.com.woolworths.foundation.rewards.common.ui.collapinsgtoolbarextras;

import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import au.com.woolworths.android.onesite.data.ContentCta;
import au.com.woolworths.android.onesite.events.ApiErrorEvent;
import au.com.woolworths.android.onesite.modules.collectionmode.api.FulfilmentResponse;
import au.com.woolworths.android.onesite.rxutils.Result;
import au.com.woolworths.android.onesite.rxutils.RxBus;
import au.com.woolworths.foundation.rewards.onboarding.ProgressiveCoachMarkContent;
import au.com.woolworths.foundation.shop.nhp.model.edr.EdrOfferBannerData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonBuilder;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Function1 {
    public final /* synthetic */ int d;

    public /* synthetic */ a(int i) {
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                AnimatedContentTransitionScope AnimatedContent = (AnimatedContentTransitionScope) obj;
                Intrinsics.h(AnimatedContent, "$this$AnimatedContent");
                return AnimatedContentKt.d(EnterExitTransitionKt.e(AnimationSpecKt.e(90, 0, null, 6), 2), EnterExitTransitionKt.f(AnimationSpecKt.e(90, 0, null, 6), 2));
            case 1:
                Intrinsics.h((SemanticsPropertyReceiver) obj, "$this$clearAndSetSemantics");
                return Unit.f24250a;
            case 2:
                SemanticsPropertyReceiver clearAndSetSemantics = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(clearAndSetSemantics, "$this$clearAndSetSemantics");
                SemanticsPropertiesKt.k(clearAndSetSemantics, null);
                return Unit.f24250a;
            case 3:
                Modifier conditional = (Modifier) obj;
                Intrinsics.h(conditional, "$this$conditional");
                return BackgroundKt.b(conditional, Color.c, RectangleShapeKt.f1779a);
            case 4:
                LazyListScope LazyColumn = (LazyListScope) obj;
                Intrinsics.h(LazyColumn, "$this$LazyColumn");
                throw null;
            case 5:
                LazyListScope LazyColumn2 = (LazyListScope) obj;
                Intrinsics.h(LazyColumn2, "$this$LazyColumn");
                throw null;
            case 6:
                Intrinsics.h((SemanticsPropertyReceiver) obj, "$this$clearAndSetSemantics");
                return Unit.f24250a;
            case 7:
                Intrinsics.h((SemanticsPropertyReceiver) obj, "$this$semantics");
                return Unit.f24250a;
            case 8:
                Intrinsics.h((SemanticsPropertyReceiver) obj, "$this$clearAndSetSemantics");
                return Unit.f24250a;
            case 9:
                SemanticsPropertyReceiver semantics = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics, "$this$semantics");
                SemanticsPropertiesKt.r(semantics, 0);
                return Unit.f24250a;
            case 10:
                Intrinsics.h((SemanticsPropertyReceiver) obj, "$this$clearAndSetSemantics");
                return Unit.f24250a;
            case 11:
                Intrinsics.h((SemanticsPropertyReceiver) obj, "$this$clearAndSetSemantics");
                return Unit.f24250a;
            case 12:
                Intrinsics.h((SemanticsPropertyReceiver) obj, "$this$clearAndSetSemantics");
                return Unit.f24250a;
            case 13:
                Intrinsics.h((SemanticsPropertyReceiver) obj, "$this$clearAndSetSemantics");
                return Unit.f24250a;
            case 14:
                Intrinsics.h((SemanticsPropertyReceiver) obj, "$this$clearAndSetSemantics");
                return Unit.f24250a;
            case 15:
                JsonBuilder Json = (JsonBuilder) obj;
                Intrinsics.h(Json, "$this$Json");
                Json.b = true;
                Json.f24839a = false;
                return Unit.f24250a;
            case 16:
                ProgressiveCoachMarkContent it = (ProgressiveCoachMarkContent) obj;
                Intrinsics.h(it, "it");
                return Unit.f24250a;
            case 17:
                ContentCta it2 = (ContentCta) obj;
                Intrinsics.h(it2, "it");
                return Unit.f24250a;
            case 18:
                JsonBuilder Json2 = (JsonBuilder) obj;
                Intrinsics.h(Json2, "$this$Json");
                Json2.b = true;
                return Unit.f24250a;
            case 19:
                String it3 = (String) obj;
                Intrinsics.h(it3, "it");
                return Unit.f24250a;
            case 20:
                Modifier conditional2 = (Modifier) obj;
                Intrinsics.h(conditional2, "$this$conditional");
                return WindowInsetsPadding_androidKt.b(conditional2);
            case 21:
                return Result.Companion.b((FulfilmentResponse) obj);
            case 22:
                RxBus rxBusA = RxBus.a();
                Intrinsics.e((Throwable) obj);
                rxBusA.f4592a.onNext(new ApiErrorEvent());
                return Unit.f24250a;
            case 23:
                return Result.Companion.b((FulfilmentResponse) obj);
            case 24:
                RxBus rxBusA2 = RxBus.a();
                Intrinsics.e((Throwable) obj);
                rxBusA2.f4592a.onNext(new ApiErrorEvent());
                return Unit.f24250a;
            case 25:
                Intrinsics.h((SemanticsPropertyReceiver) obj, "$this$semantics");
                return Unit.f24250a;
            case 26:
                EdrOfferBannerData it4 = (EdrOfferBannerData) obj;
                Intrinsics.h(it4, "it");
                return Unit.f24250a;
            case 27:
                EdrOfferBannerData it5 = (EdrOfferBannerData) obj;
                Intrinsics.h(it5, "it");
                return Unit.f24250a;
            case 28:
                EdrOfferBannerData it6 = (EdrOfferBannerData) obj;
                Intrinsics.h(it6, "it");
                return Unit.f24250a;
            default:
                Intrinsics.h((SemanticsPropertyReceiver) obj, "$this$clearAndSetSemantics");
                return Unit.f24250a;
        }
    }
}
