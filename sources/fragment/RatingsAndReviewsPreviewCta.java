package fragment;

import YU.a;
import androidx.camera.core.impl.b;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.shop.graphql.type.ActionType;
import com.apollographql.apollo.api.Fragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lfragment/RatingsAndReviewsPreviewCta;", "Lcom/apollographql/apollo/api/Fragment$Data;", "Button", "ButtonAction", "ratingsandreviews-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class RatingsAndReviewsPreviewCta implements Fragment.Data {

    /* renamed from: a, reason: collision with root package name */
    public final Button f23785a;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lfragment/RatingsAndReviewsPreviewCta$Button;", "", "ratingsandreviews-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Button {

        /* renamed from: a, reason: collision with root package name */
        public final String f23786a;
        public final String b;
        public final boolean c;
        public final ButtonAction d;
        public final String e;
        public final String f;

        public Button(String str, String str2, boolean z, ButtonAction buttonAction, String str3, String str4) {
            this.f23786a = str;
            this.b = str2;
            this.c = z;
            this.d = buttonAction;
            this.e = str3;
            this.f = str4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Button)) {
                return false;
            }
            Button button = (Button) obj;
            return Intrinsics.c(this.f23786a, button.f23786a) && Intrinsics.c(this.b, button.b) && this.c == button.c && Intrinsics.c(this.d, button.d) && Intrinsics.c(this.e, button.e) && Intrinsics.c(this.f, button.f);
        }

        public final int hashCode() {
            String str = this.f23786a;
            int iE = b.e(b.c((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31, this.c);
            ButtonAction buttonAction = this.d;
            int iHashCode = (iE + (buttonAction == null ? 0 : buttonAction.hashCode())) * 31;
            String str2 = this.e;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = a.v("Button(buttonId=", this.f23786a, ", label=", this.b, ", enabled=");
            sbV.append(this.c);
            sbV.append(", buttonAction=");
            sbV.append(this.d);
            sbV.append(", iconUrl=");
            return androidx.constraintlayout.core.state.a.l(sbV, this.e, ", altText=", this.f, ")");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lfragment/RatingsAndReviewsPreviewCta$ButtonAction;", "", "ratingsandreviews-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ButtonAction {

        /* renamed from: a, reason: collision with root package name */
        public final ActionType f23787a;
        public final String b;
        public final String c;

        public ButtonAction(ActionType actionType, String str, String str2) {
            this.f23787a = actionType;
            this.b = str;
            this.c = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ButtonAction)) {
                return false;
            }
            ButtonAction buttonAction = (ButtonAction) obj;
            return this.f23787a == buttonAction.f23787a && Intrinsics.c(this.b, buttonAction.b) && Intrinsics.c(this.c, buttonAction.c);
        }

        public final int hashCode() {
            int iC = b.c(this.f23787a.hashCode() * 31, 31, this.b);
            String str = this.c;
            return iC + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return a.o(d.s("ButtonAction(type=", this.f23787a, ", action=", this.b, ", id="), this.c, ")");
        }
    }

    public RatingsAndReviewsPreviewCta(Button button) {
        this.f23785a = button;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RatingsAndReviewsPreviewCta) && Intrinsics.c(this.f23785a, ((RatingsAndReviewsPreviewCta) obj).f23785a);
    }

    public final int hashCode() {
        return this.f23785a.hashCode();
    }

    public final String toString() {
        return "RatingsAndReviewsPreviewCta(button=" + this.f23785a + ")";
    }
}
