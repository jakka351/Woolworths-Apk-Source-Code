package au.com.woolworths.feature.shop.wpay.ui.addgiftcard;

import androidx.compose.ui.text.input.OffsetMapping;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/feature/shop/wpay/ui/addgiftcard/AddGiftCardContentKt$formatGiftCardNumber$giftCardOffsetTranslator$1", "Landroidx/compose/ui/text/input/OffsetMapping;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AddGiftCardContentKt$formatGiftCardNumber$giftCardOffsetTranslator$1 implements OffsetMapping {
    @Override // androidx.compose.ui.text.input.OffsetMapping
    public final int a(int i) {
        if (i <= 4) {
            return i;
        }
        if (i <= 9) {
            return i - 1;
        }
        if (i <= 14) {
            return i - 2;
        }
        if (i <= 19) {
            return i - 3;
        }
        if (i <= 23) {
            return i - 4;
        }
        return 19;
    }

    @Override // androidx.compose.ui.text.input.OffsetMapping
    public final int b(int i) {
        if (i <= 3) {
            return i;
        }
        if (i <= 7) {
            return i + 1;
        }
        if (i <= 11) {
            return i + 2;
        }
        if (i <= 16) {
            return i + 3;
        }
        if (i <= 20) {
            return i + 4;
        }
        return 23;
    }
}
