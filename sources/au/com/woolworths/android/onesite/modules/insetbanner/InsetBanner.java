package au.com.woolworths.android.onesite.modules.insetbanner;

import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.android.onesite.modules.common.InlineErrorAction;
import au.com.woolworths.android.onesite.modules.common.InlineErrorCause;
import au.com.woolworths.android.onesite.modules.common.InlineErrorType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lau/com/woolworths/android/onesite/modules/insetbanner/InsetBanner;", "Lau/com/woolworths/android/onesite/modules/common/InlineErrorCause;", "title", "Lau/com/woolworths/android/onesite/models/text/Text;", "getTitle", "()Lau/com/woolworths/android/onesite/models/text/Text;", "placement", "Lau/com/woolworths/android/onesite/modules/insetbanner/ActionPlacement;", "getPlacement", "()Lau/com/woolworths/android/onesite/modules/insetbanner/ActionPlacement;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface InsetBanner extends InlineErrorCause {
    @Override // au.com.woolworths.android.onesite.modules.common.InlineErrorCause
    @NotNull
    /* bridge */ /* synthetic */ default InlineErrorAction getAction() {
        return InlineErrorAction.None.d;
    }

    @Override // au.com.woolworths.android.onesite.modules.common.InlineErrorCause
    @NotNull
    /* synthetic */ InlineErrorType getErrorType();

    @Override // au.com.woolworths.android.onesite.modules.common.InlineErrorCause
    @NotNull
    /* bridge */ /* synthetic */ default InlineErrorCause.IconConfig getIconConfig() {
        return InlineErrorCause.IconConfig.Default.d;
    }

    @Override // au.com.woolworths.android.onesite.modules.common.InlineErrorCause
    @Nullable
    /* synthetic */ Text getMessageText();

    @Nullable
    default ActionPlacement getPlacement() {
        return ActionPlacement.BOTTOM;
    }

    @Override // au.com.woolworths.android.onesite.modules.common.InlineErrorCause
    /* bridge */ /* synthetic */ default boolean getShowAction() {
        return super.getShowAction();
    }

    @Override // au.com.woolworths.android.onesite.modules.common.InlineErrorCause
    /* bridge */ /* synthetic */ default boolean getShowBorder() {
        return true;
    }

    @Nullable
    default Text getTitle() {
        return null;
    }
}
