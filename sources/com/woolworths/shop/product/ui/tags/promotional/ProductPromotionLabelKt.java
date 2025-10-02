package com.woolworths.shop.product.ui.tags.promotional;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import au.com.woolworths.android.onesite.products.models.ProductPromotionTypes;
import au.com.woolworths.design.core.ui.component.experimental.tag.TagKt;
import au.com.woolworths.design.core.ui.component.experimental.tag.TagSpec;
import au.com.woolworths.shop.checkout.ui.timeselector.compose.a;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"product-ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ProductPromotionLabelKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f23630a;

        static {
            int[] iArr = new int[ProductPromotionTypes.values().length];
            try {
                iArr[ProductPromotionTypes.CONTAINER_CREDITS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProductPromotionTypes.SPECIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ProductPromotionTypes.PRICE_DROPPED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ProductPromotionTypes.LOW_PRICE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ProductPromotionTypes.LOWER_SHELF_PRICE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ProductPromotionTypes.LOWER_PRICE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f23630a = iArr;
        }
    }

    public static final void a(String label, TagSpec.Style tagStyle, Modifier modifier, Composer composer, int i, int i2) {
        ComposerImpl composerImpl;
        Modifier modifier2;
        Intrinsics.h(label, "label");
        Intrinsics.h(tagStyle, "tagStyle");
        ComposerImpl composerImplV = composer.v(1018698256);
        int i3 = (composerImplV.n(label) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i3 |= composerImplV.r(tagStyle.ordinal()) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= KyberEngine.KyberPolyBytes;
        } else if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i3 |= composerImplV.n(modifier) ? 256 : 128;
        }
        int i5 = i3 | 3072;
        if ((i5 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
            composerImpl = composerImplV;
        } else {
            int i6 = (i5 & 1022) | 24576;
            Modifier modifier3 = i4 != 0 ? Modifier.Companion.d : modifier;
            composerImpl = composerImplV;
            TagKt.b(label, tagStyle, modifier3, null, null, null, composerImpl, i6, 104);
            modifier2 = modifier3;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new a(i, i2, 8, modifier2, label, tagStyle);
        }
    }

    public static final TagSpec.Style b(ProductPromotionTypes productPromotionTypes, boolean z) {
        Intrinsics.h(productPromotionTypes, "<this>");
        switch (WhenMappings.f23630a[productPromotionTypes.ordinal()]) {
            case 1:
                return TagSpec.Style.h;
            case 2:
                return TagSpec.Style.e;
            case 3:
                return TagSpec.Style.i;
            case 4:
                return TagSpec.Style.f;
            case 5:
                return TagSpec.Style.i;
            case 6:
                return z ? TagSpec.Style.e : TagSpec.Style.i;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
