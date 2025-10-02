package au.com.woolworths.foundation.shop.bottomsheet;

import au.com.woolworths.android.onesite.epoxy.ItemSpacerEpoxyModel;
import au.com.woolworths.android.onesite.handlers.LinkHandler;
import au.com.woolworths.android.onesite.ui.HtmlTextListener;
import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import au.com.woolworths.foundation.shop.bottomsheet.BaseBottomSheetContract;
import com.airbnb.epoxy.TypedEpoxyController;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lau/com/woolworths/foundation/shop/bottomsheet/BottomSheetEpoxyController;", "Lcom/airbnb/epoxy/TypedEpoxyController;", "Lau/com/woolworths/foundation/shop/bottomsheet/BottomSheetContent;", "isPopup", "", "ctaClickListener", "Lau/com/woolworths/foundation/shop/bottomsheet/BaseBottomSheetContract$CtaClickListener;", "htmlListener", "Lau/com/woolworths/android/onesite/ui/HtmlTextListener;", "linkHandler", "Lau/com/woolworths/android/onesite/handlers/LinkHandler;", "<init>", "(ZLau/com/woolworths/foundation/shop/bottomsheet/BaseBottomSheetContract$CtaClickListener;Lau/com/woolworths/android/onesite/ui/HtmlTextListener;Lau/com/woolworths/android/onesite/handlers/LinkHandler;)V", "buildModels", "", "data", "bottomsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class BottomSheetEpoxyController extends TypedEpoxyController<BottomSheetContent> {

    @NotNull
    private final BaseBottomSheetContract.CtaClickListener ctaClickListener;

    @NotNull
    private final HtmlTextListener htmlListener;
    private final boolean isPopup;

    @NotNull
    private final LinkHandler linkHandler;

    public BottomSheetEpoxyController(boolean z, @NotNull BaseBottomSheetContract.CtaClickListener ctaClickListener, @NotNull HtmlTextListener htmlListener, @NotNull LinkHandler linkHandler) {
        Intrinsics.h(ctaClickListener, "ctaClickListener");
        Intrinsics.h(htmlListener, "htmlListener");
        Intrinsics.h(linkHandler, "linkHandler");
        this.isPopup = z;
        this.ctaClickListener = ctaClickListener;
        this.htmlListener = htmlListener;
        this.linkHandler = linkHandler;
    }

    private static final Unit buildModels$lambda$0(ItemSpacerEpoxyModel itemSpacerEpoxyModel) {
        a.w(itemSpacerEpoxyModel, "$this$itemSpacer", "banner-asset-top-spacer", com.woolworths.R.dimen.default_margin);
        return Unit.f24250a;
    }

    private static final Unit buildModels$lambda$1(ItemSpacerEpoxyModel itemSpacerEpoxyModel) {
        a.w(itemSpacerEpoxyModel, "$this$itemSpacer", "banner-asset-top-spacer", com.woolworths.R.dimen.double_default_margin);
        return Unit.f24250a;
    }

    private static final Unit buildModels$lambda$17(ItemSpacerEpoxyModel itemSpacerEpoxyModel) {
        a.w(itemSpacerEpoxyModel, "$this$itemSpacer", "bottom-sheet-bottom-spacer", com.woolworths.R.dimen.double_default_margin);
        return Unit.f24250a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0027  */
    @Override // com.airbnb.epoxy.TypedEpoxyController
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void buildModels(@org.jetbrains.annotations.Nullable au.com.woolworths.foundation.shop.bottomsheet.BottomSheetContent r9) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.foundation.shop.bottomsheet.BottomSheetEpoxyController.buildModels(au.com.woolworths.foundation.shop.bottomsheet.BottomSheetContent):void");
    }
}
