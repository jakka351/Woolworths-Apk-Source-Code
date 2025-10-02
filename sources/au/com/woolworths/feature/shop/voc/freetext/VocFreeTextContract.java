package au.com.woolworths.feature.shop.voc.freetext;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.modules.customviews.statefulbutton.StatefulButtonState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/shop/voc/freetext/VocFreeTextContract;", "", "Actions", "ViewState", "Companion", "voc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class VocFreeTextContract {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/shop/voc/freetext/VocFreeTextContract$Actions;", "", "DismissUi", "Lau/com/woolworths/feature/shop/voc/freetext/VocFreeTextContract$Actions$DismissUi;", "voc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Actions {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/voc/freetext/VocFreeTextContract$Actions$DismissUi;", "Lau/com/woolworths/feature/shop/voc/freetext/VocFreeTextContract$Actions;", "voc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class DismissUi extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final DismissUi f8226a = new DismissUi();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/shop/voc/freetext/VocFreeTextContract$Companion;", "", "", "CHARACTER_MAX_COUNT", "I", "voc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/voc/freetext/VocFreeTextContract$ViewState;", "", "voc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name */
        public final String f8227a;
        public final int b;
        public final StatefulButtonState c;

        public ViewState(String str, int i, StatefulButtonState buttonState) {
            Intrinsics.h(buttonState, "buttonState");
            this.f8227a = str;
            this.b = i;
            this.c = buttonState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return Intrinsics.c(this.f8227a, viewState.f8227a) && this.b == viewState.b && this.c == viewState.c;
        }

        public final int hashCode() {
            String str = this.f8227a;
            return this.c.hashCode() + androidx.camera.core.impl.b.a(this.b, (str == null ? 0 : str.hashCode()) * 31, 31);
        }

        public final String toString() {
            StringBuilder sbU = androidx.camera.core.impl.b.u("ViewState(comment=", this.b, this.f8227a, ", charactersLeft=", ", buttonState=");
            sbU.append(this.c);
            sbU.append(")");
            return sbU.toString();
        }

        public /* synthetic */ ViewState(int i, StatefulButtonState statefulButtonState) {
            this(null, 500, (i & 4) != 0 ? StatefulButtonState.f : statefulButtonState);
        }
    }
}
