package au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui;

import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import au.com.woolworths.android.onesite.data.DownloadableAsset;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class i implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ DownloadableAsset e;

    public /* synthetic */ i(DownloadableAsset downloadableAsset, int i) {
        this.d = i;
        this.e = downloadableAsset;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.d;
        Unit unit = Unit.f24250a;
        DownloadableAsset downloadableAsset = this.e;
        SemanticsPropertyReceiver clearAndSetSemantics = (SemanticsPropertyReceiver) obj;
        switch (i) {
            case 0:
                float f = LandingScreenHeaderItemKt.f6108a;
                Intrinsics.h(clearAndSetSemantics, "$this$clearAndSetSemantics");
                String altText = downloadableAsset.getAltText();
                if (altText == null) {
                    altText = "";
                }
                SemanticsPropertiesKt.k(clearAndSetSemantics, altText);
                break;
            default:
                Intrinsics.h(clearAndSetSemantics, "$this$clearAndSetSemantics");
                String altText2 = downloadableAsset.getAltText();
                if (altText2 != null) {
                    SemanticsPropertiesKt.k(clearAndSetSemantics, altText2);
                    break;
                }
                break;
        }
        return unit;
    }
}
