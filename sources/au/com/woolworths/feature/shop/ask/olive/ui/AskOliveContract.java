package au.com.woolworths.feature.shop.ask.olive.ui;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.shop.ask.olive.ui.model.ChatWebLink;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/ask/olive/ui/AskOliveContract;", "", "Actions", "ViewState", "ask-olive_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface AskOliveContract {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lau/com/woolworths/feature/shop/ask/olive/ui/AskOliveContract$Actions;", "", "RetryChatbotSessionId", "ForwardAccessTokenToWebview", "EndChat", "Lau/com/woolworths/feature/shop/ask/olive/ui/AskOliveContract$Actions$EndChat;", "Lau/com/woolworths/feature/shop/ask/olive/ui/AskOliveContract$Actions$ForwardAccessTokenToWebview;", "Lau/com/woolworths/feature/shop/ask/olive/ui/AskOliveContract$Actions$RetryChatbotSessionId;", "ask-olive_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Actions {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/ask/olive/ui/AskOliveContract$Actions$EndChat;", "Lau/com/woolworths/feature/shop/ask/olive/ui/AskOliveContract$Actions;", "ask-olive_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class EndChat extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final EndChat f6616a = new EndChat();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof EndChat);
            }

            public final int hashCode() {
                return 371913255;
            }

            public final String toString() {
                return "EndChat";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/ask/olive/ui/AskOliveContract$Actions$ForwardAccessTokenToWebview;", "Lau/com/woolworths/feature/shop/ask/olive/ui/AskOliveContract$Actions;", "ask-olive_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ForwardAccessTokenToWebview extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f6617a;

            public ForwardAccessTokenToWebview(String str) {
                this.f6617a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ForwardAccessTokenToWebview) && Intrinsics.c(this.f6617a, ((ForwardAccessTokenToWebview) obj).f6617a);
            }

            public final int hashCode() {
                return this.f6617a.hashCode();
            }

            public final String toString() {
                return YU.a.h("ForwardAccessTokenToWebview(accessToken=", this.f6617a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/ask/olive/ui/AskOliveContract$Actions$RetryChatbotSessionId;", "Lau/com/woolworths/feature/shop/ask/olive/ui/AskOliveContract$Actions;", "ask-olive_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class RetryChatbotSessionId extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final RetryChatbotSessionId f6618a = new RetryChatbotSessionId();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof RetryChatbotSessionId);
            }

            public final int hashCode() {
                return -1132938562;
            }

            public final String toString() {
                return "RetryChatbotSessionId";
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/ask/olive/ui/AskOliveContract$ViewState;", "", "ask-olive_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name */
        public final ChatWebLink f6619a;
        public final boolean b;
        public final AskOliveErrorState c;

        public ViewState(ChatWebLink chatWebLink, boolean z, AskOliveErrorState askOliveErrorState) {
            this.f6619a = chatWebLink;
            this.b = z;
            this.c = askOliveErrorState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return Intrinsics.c(this.f6619a, viewState.f6619a) && this.b == viewState.b && this.c == viewState.c;
        }

        public final int hashCode() {
            ChatWebLink chatWebLink = this.f6619a;
            int iE = androidx.camera.core.impl.b.e((chatWebLink == null ? 0 : chatWebLink.hashCode()) * 31, 31, this.b);
            AskOliveErrorState askOliveErrorState = this.c;
            return iE + (askOliveErrorState != null ? askOliveErrorState.hashCode() : 0);
        }

        public final String toString() {
            return "ViewState(chatLink=" + this.f6619a + ", isLoading=" + this.b + ", errorState=" + this.c + ")";
        }
    }
}
