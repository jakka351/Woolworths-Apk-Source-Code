package au.com.woolworths.feature.shop.contentpage.data;

import au.com.woolworths.sdui.common.IconAsset;
import au.com.woolworths.sdui.common.button.model.CoreButtonModel;
import au.com.woolworths.sdui.common.button.model.CoreButtonStyle;
import au.com.woolworths.shop.aem.components.model.buttonsection.ButtonSectionData;
import com.woolworths.feature.shop.contentpage.fragment.ContentPage;
import com.woolworths.feature.shop.contentpage.fragment.CoreButtonFields;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"content-page_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ContentPageOnButtonSectionExtKt {
    public static final ButtonSectionData a(ContentPage.OnButtonSection onButtonSection) {
        Intrinsics.h(onButtonSection, "<this>");
        CoreButtonFields coreButtonFields = onButtonSection.f19586a.b;
        int iOrdinal = coreButtonFields.f19746a.ordinal();
        CoreButtonStyle coreButtonStyle = iOrdinal != 0 ? iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? CoreButtonStyle.d : CoreButtonStyle.g : CoreButtonStyle.f : CoreButtonStyle.e : CoreButtonStyle.d;
        String str = coreButtonFields.b;
        CoreButtonFields.CoreButtonLeadingIcon coreButtonLeadingIcon = coreButtonFields.c;
        IconAsset.CoreIcon coreIcon = coreButtonLeadingIcon != null ? new IconAsset.CoreIcon(coreButtonLeadingIcon.b.f19754a) : null;
        CoreButtonFields.CoreButtonTrailingIcon coreButtonTrailingIcon = coreButtonFields.d;
        return new ButtonSectionData(new CoreButtonModel(coreButtonStyle, str, coreIcon, coreButtonTrailingIcon != null ? new IconAsset.CoreIcon(coreButtonTrailingIcon.b.f19754a) : null, ContentPageMapperUtilKt.a(coreButtonFields.e.b), coreButtonFields.f));
    }
}
