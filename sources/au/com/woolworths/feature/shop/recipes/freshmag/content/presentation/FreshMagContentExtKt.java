package au.com.woolworths.feature.shop.recipes.freshmag.content.presentation;

import au.com.woolworths.android.onesite.models.text.ResWithArgText;
import au.com.woolworths.feature.shop.recipes.freshmag.content.presentation.FreshMagContentContract;
import com.woolworths.R;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"recipes_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FreshMagContentExtKt {
    public static final ResWithArgText a(FreshMagContentContract.FreshMagContent freshMagContent) {
        if (freshMagContent == null) {
            return null;
        }
        return new ResWithArgText(R.string.freshmag_content_seekbar_label, Integer.valueOf(freshMagContent.b + 1), Integer.valueOf(freshMagContent.f8040a.size()));
    }
}
