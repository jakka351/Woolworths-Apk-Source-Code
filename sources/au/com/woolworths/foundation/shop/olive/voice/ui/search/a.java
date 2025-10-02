package au.com.woolworths.foundation.shop.olive.voice.ui.search;

import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBanner;
import au.com.woolworths.android.onesite.network.Component;
import au.com.woolworths.foundation.shop.olive.voice.data.VoiceSearchError;
import au.com.woolworths.foundation.shop.video.advertising.data.VideoAdBottomSheet;
import au.com.woolworths.foundation.swrve.embedded.campaign.JsonDecoderKt;
import au.com.woolworths.foundation.ui.shimmers.ComposableSingletons$ProductsSkeletonKt;
import au.com.woolworths.rewards.base.RewardsPageScrollManager;
import au.com.woolworths.rewards.base.analytics.TealiumEventKeyPropertyKt;
import au.com.woolworths.sdui.model.action.ActionData;
import au.com.woolworths.sdui.shop.dynamicsizecard.DynamicSizeCardData;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Function1 {
    public final /* synthetic */ int d;

    public /* synthetic */ a(int i) {
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.d;
        Unit unit = Unit.f24250a;
        switch (i) {
            case 0:
                VoiceSearchError it = (VoiceSearchError) obj;
                Intrinsics.h(it, "it");
                break;
            case 1:
                VoiceSearchError it2 = (VoiceSearchError) obj;
                Intrinsics.h(it2, "it");
                break;
            case 2:
                VoiceSearchError it3 = (VoiceSearchError) obj;
                Intrinsics.h(it3, "it");
                break;
            case 3:
                VoiceSearchError it4 = (VoiceSearchError) obj;
                Intrinsics.h(it4, "it");
                break;
            case 4:
                VoiceSearchError it5 = (VoiceSearchError) obj;
                Intrinsics.h(it5, "it");
                break;
            case 5:
                SemanticsPropertyReceiver semantics = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics, "$this$semantics");
                SemanticsPropertiesKt.u(semantics);
                break;
            case 6:
                SemanticsPropertyReceiver semantics2 = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics2, "$this$semantics");
                SemanticsPropertiesKt.v(semantics2, -1.0f);
                break;
            case 7:
                ActionData it6 = (ActionData) obj;
                Intrinsics.h(it6, "it");
                break;
            case 8:
                VideoAdBottomSheet it7 = (VideoAdBottomSheet) obj;
                Intrinsics.h(it7, "it");
                break;
            case 9:
                SemanticsPropertyReceiver semantics3 = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics3, "$this$semantics");
                SemanticsPropertiesKt.g(semantics3);
                break;
            case 10:
                JsonBuilder Json = (JsonBuilder) obj;
                Json json = JsonDecoderKt.f8896a;
                Intrinsics.h(Json, "$this$Json");
                Json.b = true;
                Json.d = true;
                Json.f24839a = false;
                break;
            case 11:
                String it8 = (String) obj;
                Intrinsics.h(it8, "it");
                break;
            case 12:
                Intrinsics.h((SemanticsPropertyReceiver) obj, "$this$semantics");
                break;
            case 13:
                Intrinsics.h((SemanticsPropertyReceiver) obj, "$this$semantics");
                break;
            case 14:
                SemanticsPropertyReceiver semantics4 = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics4, "$this$semantics");
                SemanticsPropertiesKt.c(semantics4);
                break;
            case 15:
                LazyListScope LazyRow = (LazyListScope) obj;
                Intrinsics.h(LazyRow, "$this$LazyRow");
                LazyListScope.g(LazyRow, 4, null, ComposableSingletons$ProductsSkeletonKt.f8927a, 6);
                break;
            case 16:
                Modifier conditional = (Modifier) obj;
                Intrinsics.h(conditional, "$this$conditional");
                break;
            case 17:
                Modifier conditional2 = (Modifier) obj;
                Intrinsics.h(conditional2, "$this$conditional");
                break;
            case 18:
                Intrinsics.h((SemanticsPropertyReceiver) obj, "$this$semantics");
                break;
            case 19:
                Modifier conditional3 = (Modifier) obj;
                Intrinsics.h(conditional3, "$this$conditional");
                break;
            case 20:
                DynamicSizeCardData it9 = (DynamicSizeCardData) obj;
                Intrinsics.h(it9, "it");
                break;
            case 21:
                String it10 = (String) obj;
                Intrinsics.h(it10, "it");
                if (StringsKt.D(it10) || it10.equals("-")) {
                }
                break;
            case 22:
                Intrinsics.h((SemanticsPropertyReceiver) obj, "$this$semantics");
                break;
            case 23:
                SemanticsPropertyReceiver clearAndSetSemantics = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(clearAndSetSemantics, "$this$clearAndSetSemantics");
                break;
            case 24:
                ((Integer) obj).getClass();
                RewardsPageScrollManager.Status status = RewardsPageScrollManager.c;
                break;
            case 25:
                List list = TealiumEventKeyPropertyKt.f9361a;
                if (obj != null && (r8 = obj.toString()) != null) {
                    break;
                }
                break;
            case 26:
                break;
            case 27:
                Component component = (Component) obj;
                Intrinsics.h(component, "<destruct>");
                break;
            case 28:
                InsetBanner it11 = (InsetBanner) obj;
                Intrinsics.h(it11, "it");
                break;
            default:
                InsetBanner it12 = (InsetBanner) obj;
                Intrinsics.h(it12, "it");
                break;
        }
        return unit;
    }
}
