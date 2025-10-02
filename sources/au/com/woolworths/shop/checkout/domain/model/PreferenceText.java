package au.com.woolworths.shop.checkout.domain.model;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.android.onesite.modules.inlinemessage.InlineMessage;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/PreferenceText;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class PreferenceText {

    /* renamed from: a, reason: collision with root package name */
    public final PreferenceId f10630a;
    public final boolean b;
    public final String c;
    public final InputTextLimit d;
    public final String e;
    public final String f;
    public final String g;
    public final Text h;
    public final Text i;
    public final InlineMessage j;

    public PreferenceText(PreferenceId preferenceId, boolean z, String str, InputTextLimit inputTextLimit, String str2, String str3, String str4, Text text, Text text2, InlineMessage inlineMessage) {
        this.f10630a = preferenceId;
        this.b = z;
        this.c = str;
        this.d = inputTextLimit;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = text;
        this.i = text2;
        this.j = inlineMessage;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v3, types: [au.com.woolworths.android.onesite.models.text.Text] */
    public static PreferenceText a(PreferenceText preferenceText, String str, ResText resText, Text text, int i) {
        PreferenceId preferenceId = preferenceText.f10630a;
        boolean z = preferenceText.b;
        String str2 = preferenceText.c;
        InputTextLimit inputTextLimit = preferenceText.d;
        String str3 = preferenceText.e;
        String str4 = preferenceText.f;
        ResText resText2 = resText;
        if ((i & 128) != 0) {
            resText2 = preferenceText.h;
        }
        ResText resText3 = resText2;
        if ((i & 256) != 0) {
            text = preferenceText.i;
        }
        InlineMessage inlineMessage = preferenceText.j;
        preferenceText.getClass();
        return new PreferenceText(preferenceId, z, str2, inputTextLimit, str3, str4, str, resText3, text, inlineMessage);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PreferenceText)) {
            return false;
        }
        PreferenceText preferenceText = (PreferenceText) obj;
        return this.f10630a == preferenceText.f10630a && this.b == preferenceText.b && Intrinsics.c(this.c, preferenceText.c) && Intrinsics.c(this.d, preferenceText.d) && Intrinsics.c(this.e, preferenceText.e) && Intrinsics.c(this.f, preferenceText.f) && Intrinsics.c(this.g, preferenceText.g) && Intrinsics.c(this.h, preferenceText.h) && Intrinsics.c(this.i, preferenceText.i) && Intrinsics.c(this.j, preferenceText.j);
    }

    public final int hashCode() {
        int iC = b.c(b.e(this.f10630a.hashCode() * 31, 31, this.b), 31, this.c);
        InputTextLimit inputTextLimit = this.d;
        int iHashCode = (iC + (inputTextLimit == null ? 0 : inputTextLimit.hashCode())) * 31;
        String str = this.e;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.g;
        int iHashCode4 = (this.h.hashCode() + ((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31;
        Text text = this.i;
        int iHashCode5 = (iHashCode4 + (text == null ? 0 : text.hashCode())) * 31;
        InlineMessage inlineMessage = this.j;
        return iHashCode5 + (inlineMessage != null ? inlineMessage.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PreferenceText(preferenceId=");
        sb.append(this.f10630a);
        sb.append(", isEnabled=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", inputLimit=");
        sb.append(this.d);
        sb.append(", descriptionText=");
        a.B(sb, this.e, ", placeholderText=", this.f, ", text=");
        sb.append(this.g);
        sb.append(", buttonTitle=");
        sb.append(this.h);
        sb.append(", errorLabel=");
        sb.append(this.i);
        sb.append(", inlineMessage=");
        sb.append(this.j);
        sb.append(")");
        return sb.toString();
    }
}
