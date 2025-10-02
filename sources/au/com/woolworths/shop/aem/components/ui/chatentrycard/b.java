package au.com.woolworths.shop.aem.components.ui.chatentrycard;

import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import au.com.woolworths.sdui.model.action.ActionData;
import au.com.woolworths.shop.aem.components.model.contentcard.FullWidthContentCardData;
import au.com.woolworths.shop.aem.components.model.contentcard.NavRoundelCardData;
import au.com.woolworths.shop.aem.components.model.herobanner.HeroBanner;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Function1 {
    public final /* synthetic */ int d;

    public /* synthetic */ b(int i) {
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                String it = (String) obj;
                Intrinsics.h(it, "it");
                break;
            case 1:
                AnimatedContentTransitionScope AnimatedContent = (AnimatedContentTransitionScope) obj;
                Intrinsics.h(AnimatedContent, "$this$AnimatedContent");
                break;
            case 2:
                break;
            case 3:
                GraphicsLayerScope graphicsLayer = (GraphicsLayerScope) obj;
                Intrinsics.h(graphicsLayer, "$this$graphicsLayer");
                graphicsLayer.g(-2.44f);
                break;
            case 4:
                FullWidthContentCardData it2 = (FullWidthContentCardData) obj;
                Intrinsics.h(it2, "it");
                break;
            case 5:
                FullWidthContentCardData it3 = (FullWidthContentCardData) obj;
                Intrinsics.h(it3, "it");
                break;
            case 6:
                NavRoundelCardData it4 = (NavRoundelCardData) obj;
                Intrinsics.h(it4, "it");
                break;
            case 7:
                SemanticsPropertyReceiver semantics = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics, "$this$semantics");
                SemanticsPropertiesKt.g(semantics);
                break;
            case 8:
                SemanticsPropertyReceiver semantics2 = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics2, "$this$semantics");
                SemanticsPropertiesKt.g(semantics2);
                break;
            case 9:
                SemanticsPropertyReceiver semantics3 = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics3, "$this$semantics");
                SemanticsPropertiesKt.g(semantics3);
                break;
            case 10:
                SemanticsPropertyReceiver semantics4 = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics4, "$this$semantics");
                SemanticsPropertiesKt.g(semantics4);
                break;
            case 11:
                SemanticsPropertyReceiver semantics5 = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics5, "$this$semantics");
                SemanticsPropertiesKt.g(semantics5);
                break;
            case 12:
                Intrinsics.h((SemanticsPropertyReceiver) obj, "$this$semantics");
                break;
            case 13:
                SemanticsPropertyReceiver semantics6 = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics6, "$this$semantics");
                SemanticsPropertiesKt.g(semantics6);
                break;
            case 14:
                Intrinsics.h((SemanticsPropertyReceiver) obj, "$this$semantics");
                break;
            case 15:
                Intrinsics.h((SemanticsPropertyReceiver) obj, "$this$semantics");
                break;
            case 16:
                Intrinsics.h((SemanticsPropertyReceiver) obj, "$this$semantics");
                break;
            case 17:
                Intrinsics.h((SemanticsPropertyReceiver) obj, "$this$semantics");
                break;
            case 18:
                Modifier conditional = (Modifier) obj;
                Intrinsics.h(conditional, "$this$conditional");
                break;
            case 19:
                Modifier conditional2 = (Modifier) obj;
                Intrinsics.h(conditional2, "$this$conditional");
                break;
            case 20:
                Modifier conditional3 = (Modifier) obj;
                Intrinsics.h(conditional3, "$this$conditional");
                break;
            case 21:
                Modifier conditional4 = (Modifier) obj;
                Intrinsics.h(conditional4, "$this$conditional");
                break;
            case 22:
                HeroBanner it5 = (HeroBanner) obj;
                Intrinsics.h(it5, "it");
                break;
            case 23:
                HeroBanner it6 = (HeroBanner) obj;
                Intrinsics.h(it6, "it");
                break;
            case 24:
                HeroBanner it7 = (HeroBanner) obj;
                Intrinsics.h(it7, "it");
                break;
            case 25:
                HeroBanner it8 = (HeroBanner) obj;
                Intrinsics.h(it8, "it");
                break;
            case 26:
                HeroBanner it9 = (HeroBanner) obj;
                Intrinsics.h(it9, "it");
                break;
            case 27:
                HeroBanner it10 = (HeroBanner) obj;
                Intrinsics.h(it10, "it");
                break;
            case 28:
                Intrinsics.h((SemanticsPropertyReceiver) obj, "$this$semantics");
                break;
            default:
                ActionData it11 = (ActionData) obj;
                Intrinsics.h(it11, "it");
                break;
        }
        return Unit.f24250a;
    }
}
