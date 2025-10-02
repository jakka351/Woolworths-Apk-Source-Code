package au.com.woolworths.android.onesite.modules.insetbanner;

import au.com.woolworths.android.onesite.models.text.PlainText;
import au.com.woolworths.android.onesite.modules.common.InlineErrorAction;
import au.com.woolworths.android.onesite.modules.common.InlineErrorCause;
import au.com.woolworths.android.onesite.modules.inlinemessage.InlineMessage;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\f\u0010\u0003\u001a\u00020\u0004*\u0004\u0018\u00010\u0005\u001a\n\u0010\u0006\u001a\u00020\u0007*\u00020\b\u001a\n\u0010\t\u001a\u00020\n*\u00020\u0002\u001a\u000e\u0010\u000b\u001a\u00020\f*\u0004\u0018\u00010\rH\u0002¨\u0006\u000e"}, d2 = {"toUiModel", "Lau/com/woolworths/android/onesite/modules/insetbanner/InsetBannerData;", "Lau/com/woolworths/android/onesite/modules/insetbanner/InsetBannerApiData;", "toInlineErrorAction", "Lau/com/woolworths/android/onesite/modules/common/InlineErrorAction;", "Lau/com/woolworths/android/onesite/modules/insetbanner/InsetBannerActionApiData;", "toInsetBannerActionPlacement", "Lau/com/woolworths/android/onesite/modules/insetbanner/ActionPlacement;", "Lau/com/woolworths/android/onesite/modules/insetbanner/InsetBannerActionPlacementTypeApiData;", "toInlineMessage", "Lau/com/woolworths/android/onesite/modules/inlinemessage/InlineMessage;", "toIconConfig", "Lau/com/woolworths/android/onesite/modules/common/InlineErrorCause$IconConfig;", "", "base_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class InsetBannerApiDataExtKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[InsetBannerActionTypeApiData.values().length];
            try {
                iArr[InsetBannerActionTypeApiData.APPLOCAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InsetBannerActionTypeApiData.LINK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InsetBannerActionTypeApiData.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[InsetBannerActionPlacementTypeApiData.values().length];
            try {
                iArr2[InsetBannerActionPlacementTypeApiData.BOTTOM.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[InsetBannerActionPlacementTypeApiData.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    private static final InlineErrorCause.IconConfig toIconConfig(String str) {
        return (str == null || str.length() == 0) ? InlineErrorCause.IconConfig.Default.d : new InlineErrorCause.IconConfig.CustomIcon(str);
    }

    @NotNull
    public static final InlineErrorAction toInlineErrorAction(@Nullable InsetBannerActionApiData insetBannerActionApiData) {
        InlineErrorAction.None none = InlineErrorAction.None.d;
        if (insetBannerActionApiData == null) {
            return none;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[insetBannerActionApiData.getActionType().ordinal()];
        if (i == 1) {
            return new InlineErrorAction.AppLocal(new PlainText(insetBannerActionApiData.getLabel()));
        }
        if (i == 2) {
            String url = insetBannerActionApiData.getUrl();
            return (url == null || url.length() == 0) ? none : new InlineErrorAction.Link(new PlainText(insetBannerActionApiData.getLabel()), insetBannerActionApiData.getUrl());
        }
        if (i == 3) {
            return none;
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    public static final InlineMessage toInlineMessage(@NotNull InsetBannerApiData insetBannerApiData) {
        Intrinsics.h(insetBannerApiData, "<this>");
        return new InlineMessage(InsetBannerTypeApiDataExtKt.toInlineErrorType(insetBannerApiData.getDisplayType()), new PlainText(insetBannerApiData.getMessage()), null);
    }

    @NotNull
    public static final ActionPlacement toInsetBannerActionPlacement(@NotNull InsetBannerActionPlacementTypeApiData insetBannerActionPlacementTypeApiData) {
        Intrinsics.h(insetBannerActionPlacementTypeApiData, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$1[insetBannerActionPlacementTypeApiData.ordinal()];
        if (i == 1) {
            return ActionPlacement.BOTTOM;
        }
        if (i == 2) {
            return ActionPlacement.RIGHT;
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    public static final InsetBannerData toUiModel(@NotNull InsetBannerApiData insetBannerApiData) {
        InsetBannerActionPlacementTypeApiData placement;
        Intrinsics.h(insetBannerApiData, "<this>");
        String titleString = insetBannerApiData.getTitleString();
        ActionPlacement insetBannerActionPlacement = null;
        PlainText plainText = titleString != null ? new PlainText(titleString) : null;
        InsetBannerActionApiData action = insetBannerApiData.getAction();
        if (action != null && (placement = action.getPlacement()) != null) {
            insetBannerActionPlacement = toInsetBannerActionPlacement(placement);
        }
        return new InsetBannerData(plainText, insetBannerActionPlacement, new PlainText(insetBannerApiData.getMessage()), toInlineErrorAction(insetBannerApiData.getAction()), InsetBannerTypeApiDataExtKt.toInlineErrorType(insetBannerApiData.getDisplayType()), toIconConfig(insetBannerApiData.getIconUrl()));
    }
}
