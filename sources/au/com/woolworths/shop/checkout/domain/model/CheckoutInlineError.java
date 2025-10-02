package au.com.woolworths.shop.checkout.domain.model;

import androidx.compose.runtime.Immutable;
import au.com.woolworths.android.onesite.models.text.PlainText;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.android.onesite.modules.common.InlineErrorAction;
import au.com.woolworths.android.onesite.modules.common.InlineErrorCause;
import au.com.woolworths.android.onesite.modules.common.InlineErrorType;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

@Immutable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/CheckoutInlineError;", "Lau/com/woolworths/android/onesite/modules/common/InlineErrorCause;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CheckoutInlineError implements InlineErrorCause {
    public final PlainText d;
    public final InlineErrorAction e;
    public final InlineErrorType f;
    public final InlineErrorCause.IconConfig g;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[InlineErrorType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                InlineErrorType inlineErrorType = InlineErrorType.f;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                InlineErrorType inlineErrorType2 = InlineErrorType.f;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                InlineErrorType inlineErrorType3 = InlineErrorType.f;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                InlineErrorType inlineErrorType4 = InlineErrorType.f;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public CheckoutInlineError(PlainText plainText, InlineErrorAction action, InlineErrorType errorType, InlineErrorCause.IconConfig iconConfig) {
        Intrinsics.h(action, "action");
        Intrinsics.h(errorType, "errorType");
        this.d = plainText;
        this.e = action;
        this.f = errorType;
        this.g = iconConfig;
        int iOrdinal = errorType.ordinal();
        if (iOrdinal != 0 && iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3 && iOrdinal != 4) {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckoutInlineError)) {
            return false;
        }
        CheckoutInlineError checkoutInlineError = (CheckoutInlineError) obj;
        return this.d.equals(checkoutInlineError.d) && Intrinsics.c(this.e, checkoutInlineError.e) && this.f == checkoutInlineError.f && this.g.equals(checkoutInlineError.g);
    }

    @Override // au.com.woolworths.android.onesite.modules.common.InlineErrorCause
    /* renamed from: getAction, reason: from getter */
    public final InlineErrorAction getE() {
        return this.e;
    }

    @Override // au.com.woolworths.android.onesite.modules.common.InlineErrorCause
    /* renamed from: getErrorType, reason: from getter */
    public final InlineErrorType getF() {
        return this.f;
    }

    @Override // au.com.woolworths.android.onesite.modules.common.InlineErrorCause
    /* renamed from: getIconConfig, reason: from getter */
    public final InlineErrorCause.IconConfig getG() {
        return this.g;
    }

    @Override // au.com.woolworths.android.onesite.modules.common.InlineErrorCause
    /* renamed from: getMessageText */
    public final Text getF() {
        return this.d;
    }

    @Override // au.com.woolworths.android.onesite.modules.common.InlineErrorCause
    public final boolean getShowBorder() {
        return false;
    }

    public final int hashCode() {
        return this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + (this.d.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "CheckoutInlineError(messageText=" + this.d + ", action=" + this.e + ", errorType=" + this.f + ", iconConfig=" + this.g + ")";
    }
}
