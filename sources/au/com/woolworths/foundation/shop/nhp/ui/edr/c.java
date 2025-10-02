package au.com.woolworths.foundation.shop.nhp.ui.edr;

import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.datastore.core.CorruptionException;
import au.com.woolworths.foundation.shop.nhp.model.personalisedproducts.PersonalisedProductsBannerData;
import au.com.woolworths.foundation.shop.nhp.model.personalisedproducts.ProductInBannerData;
import au.com.woolworths.foundation.shop.nhp.ui.pp.ProductCarouselSessionDataStoreKt;
import au.com.woolworths.foundation.shop.olive.voice.data.VoiceSearchError;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* loaded from: classes4.dex */
public final /* synthetic */ class c implements Function1 {
    public final /* synthetic */ int d;

    public /* synthetic */ c(int i) {
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.d;
        Unit unit = Unit.f24250a;
        switch (i) {
            case 0:
                SemanticsPropertyReceiver clearAndSetSemantics = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(clearAndSetSemantics, "$this$clearAndSetSemantics");
                break;
            case 1:
                PersonalisedProductsBannerData it = (PersonalisedProductsBannerData) obj;
                Intrinsics.h(it, "it");
                break;
            case 2:
                PersonalisedProductsBannerData it2 = (PersonalisedProductsBannerData) obj;
                Intrinsics.h(it2, "it");
                break;
            case 3:
                ProductInBannerData it3 = (ProductInBannerData) obj;
                Intrinsics.h(it3, "it");
                break;
            case 4:
                CorruptionException it4 = (CorruptionException) obj;
                KProperty[] kPropertyArr = ProductCarouselSessionDataStoreKt.f8791a;
                Intrinsics.h(it4, "it");
                break;
            case 5:
                SemanticsPropertyReceiver semantics = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics, "$this$semantics");
                SemanticsPropertiesKt.u(semantics);
                SemanticsPropertiesKt.v(semantics, -1.0f);
                break;
            case 6:
                Intrinsics.h((SemanticsPropertyReceiver) obj, "$this$semantics");
                break;
            case 7:
                SemanticsPropertyReceiver semantics2 = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics2, "$this$semantics");
                SemanticsPropertiesKt.v(semantics2, 1.0f);
                break;
            case 8:
                String it5 = (String) obj;
                Intrinsics.h(it5, "it");
                break;
            case 9:
                SemanticsPropertyReceiver semantics3 = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics3, "$this$semantics");
                SemanticsPropertiesKt.v(semantics3, 1.0f);
                break;
            case 10:
                String it6 = (String) obj;
                Intrinsics.h(it6, "it");
                break;
            case 11:
                SemanticsPropertyReceiver semantics4 = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics4, "$this$semantics");
                SemanticsPropertiesKt.u(semantics4);
                SemanticsPropertiesKt.v(semantics4, -1.0f);
                break;
            case 12:
                SemanticsPropertyReceiver semantics5 = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics5, "$this$semantics");
                SemanticsPropertiesKt.v(semantics5, 1.0f);
                break;
            case 13:
                Intrinsics.h((SemanticsPropertyReceiver) obj, "$this$semantics");
                break;
            case 14:
                SemanticsPropertyReceiver semantics6 = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics6, "$this$semantics");
                SemanticsPropertiesKt.u(semantics6);
                SemanticsPropertiesKt.v(semantics6, -1.0f);
                break;
            case 15:
                Intrinsics.h((SemanticsPropertyReceiver) obj, "$this$semantics");
                break;
            case 16:
                VoiceSearchError it7 = (VoiceSearchError) obj;
                Intrinsics.h(it7, "it");
                break;
            case 17:
                VoiceSearchError it8 = (VoiceSearchError) obj;
                Intrinsics.h(it8, "it");
                break;
            case 18:
                VoiceSearchError it9 = (VoiceSearchError) obj;
                Intrinsics.h(it9, "it");
                break;
            case 19:
                VoiceSearchError it10 = (VoiceSearchError) obj;
                Intrinsics.h(it10, "it");
                break;
            case 20:
                VoiceSearchError it11 = (VoiceSearchError) obj;
                Intrinsics.h(it11, "it");
                break;
            case 21:
                VoiceSearchError it12 = (VoiceSearchError) obj;
                Intrinsics.h(it12, "it");
                break;
            case 22:
                VoiceSearchError it13 = (VoiceSearchError) obj;
                Intrinsics.h(it13, "it");
                break;
            case 23:
                VoiceSearchError it14 = (VoiceSearchError) obj;
                Intrinsics.h(it14, "it");
                break;
            case 24:
                VoiceSearchError it15 = (VoiceSearchError) obj;
                Intrinsics.h(it15, "it");
                break;
            case 25:
                VoiceSearchError it16 = (VoiceSearchError) obj;
                Intrinsics.h(it16, "it");
                break;
            case 26:
                VoiceSearchError it17 = (VoiceSearchError) obj;
                Intrinsics.h(it17, "it");
                break;
            case 27:
                VoiceSearchError it18 = (VoiceSearchError) obj;
                Intrinsics.h(it18, "it");
                break;
            case 28:
                VoiceSearchError it19 = (VoiceSearchError) obj;
                Intrinsics.h(it19, "it");
                break;
            default:
                VoiceSearchError it20 = (VoiceSearchError) obj;
                Intrinsics.h(it20, "it");
                break;
        }
        return unit;
    }
}
