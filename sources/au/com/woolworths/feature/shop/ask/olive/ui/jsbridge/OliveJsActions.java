package au.com.woolworths.feature.shop.ask.olive.ui.jsbridge;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.shop.ask.olive.ui.model.EndChatStateUpdate;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lau/com/woolworths/feature/shop/ask/olive/ui/jsbridge/OliveJsActions;", "", "ShowSurvey", "RefreshCartBadge", "UpdateEndChatState", "Lau/com/woolworths/feature/shop/ask/olive/ui/jsbridge/OliveJsActions$RefreshCartBadge;", "Lau/com/woolworths/feature/shop/ask/olive/ui/jsbridge/OliveJsActions$ShowSurvey;", "Lau/com/woolworths/feature/shop/ask/olive/ui/jsbridge/OliveJsActions$UpdateEndChatState;", "ask-olive_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class OliveJsActions {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/ask/olive/ui/jsbridge/OliveJsActions$RefreshCartBadge;", "Lau/com/woolworths/feature/shop/ask/olive/ui/jsbridge/OliveJsActions;", "ask-olive_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class RefreshCartBadge extends OliveJsActions {

        /* renamed from: a, reason: collision with root package name */
        public static final RefreshCartBadge f6627a = new RefreshCartBadge();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof RefreshCartBadge);
        }

        public final int hashCode() {
            return 1176354208;
        }

        public final String toString() {
            return "RefreshCartBadge";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/ask/olive/ui/jsbridge/OliveJsActions$ShowSurvey;", "Lau/com/woolworths/feature/shop/ask/olive/ui/jsbridge/OliveJsActions;", "ask-olive_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ShowSurvey extends OliveJsActions {

        /* renamed from: a, reason: collision with root package name */
        public final String f6628a;

        public ShowSurvey(String str) {
            this.f6628a = str;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/ask/olive/ui/jsbridge/OliveJsActions$UpdateEndChatState;", "Lau/com/woolworths/feature/shop/ask/olive/ui/jsbridge/OliveJsActions;", "ask-olive_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class UpdateEndChatState extends OliveJsActions {

        /* renamed from: a, reason: collision with root package name */
        public final EndChatStateUpdate f6629a;

        public UpdateEndChatState(EndChatStateUpdate endChatStateUpdate) {
            this.f6629a = endChatStateUpdate;
        }
    }
}
