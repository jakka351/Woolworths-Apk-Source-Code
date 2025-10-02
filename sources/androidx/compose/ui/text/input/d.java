package androidx.compose.ui.text.input;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.input.OffsetMapping;
import au.com.woolworths.feature.shop.wpay.ui.addgiftcard.AddGiftCardContentKt$formatGiftCardNumber$giftCardOffsetTranslator$1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final /* synthetic */ class d implements VisualTransformation {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2134a;

    public /* synthetic */ d(int i) {
        this.f2134a = i;
    }

    @Override // androidx.compose.ui.text.input.VisualTransformation
    public final TransformedText a(AnnotatedString number) {
        switch (this.f2134a) {
            case 0:
                return new TransformedText(number, OffsetMapping.Companion.f2121a);
            default:
                Intrinsics.h(number, "number");
                String str = number.e;
                int length = str.length();
                String strG = "";
                for (int i = 0; i < length; i++) {
                    strG = strG + str.charAt(i);
                    if (i % 4 == 3) {
                        strG = YU.a.g(strG, " ");
                    }
                }
                return new TransformedText(new AnnotatedString(strG), new AddGiftCardContentKt$formatGiftCardNumber$giftCardOffsetTranslator$1());
        }
    }
}
