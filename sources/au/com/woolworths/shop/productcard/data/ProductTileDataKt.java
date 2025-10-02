package au.com.woolworths.shop.productcard.data;

import au.com.woolworths.base.shopapp.modules.button.ButtonStyleApiData;
import au.com.woolworths.shop.graphql.type.ActionType;
import au.com.woolworths.shop.graphql.type.ButtonStyle;
import au.com.woolworths.shop.graphql.type.PurchaseRestriction;
import au.com.woolworths.shop.graphql.type.RoundelImagePriority;
import com.woolworths.shop.productcard.data.fragment.ProductTile;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"productcard-data_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProductTileDataKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[PurchaseRestriction.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                PurchaseRestriction.Companion companion = PurchaseRestriction.e;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[ActionType.values().length];
            try {
                iArr2[1] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                ActionType.Companion companion2 = ActionType.e;
                iArr2[0] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr3 = new int[ButtonStyle.values().length];
            try {
                iArr3[0] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                ButtonStyle.Companion companion3 = ButtonStyle.e;
                iArr3[1] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                ButtonStyle.Companion companion4 = ButtonStyle.e;
                iArr3[2] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                ButtonStyle.Companion companion5 = ButtonStyle.e;
                iArr3[3] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                ButtonStyle.Companion companion6 = ButtonStyle.e;
                iArr3[5] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                ButtonStyle.Companion companion7 = ButtonStyle.e;
                iArr3[4] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            int[] iArr4 = new int[au.com.woolworths.shop.graphql.type.RoundelImagePriority.values().length];
            try {
                iArr4[0] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                RoundelImagePriority.Companion companion8 = au.com.woolworths.shop.graphql.type.RoundelImagePriority.e;
                iArr4[1] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                RoundelImagePriority.Companion companion9 = au.com.woolworths.shop.graphql.type.RoundelImagePriority.e;
                iArr4[2] = 3;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    public static final ButtonStyleApiData a(ButtonStyle buttonStyle) {
        Intrinsics.h(buttonStyle, "<this>");
        int iOrdinal = buttonStyle.ordinal();
        return iOrdinal != 0 ? iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? iOrdinal != 4 ? iOrdinal != 5 ? ButtonStyleApiData.d : ButtonStyleApiData.INSTOCK : ButtonStyleApiData.INFO : ButtonStyleApiData.DESTRUCTIVE : ButtonStyleApiData.TERTIARY : ButtonStyleApiData.SECONDARY : ButtonStyleApiData.PRIMARY;
    }

    public static final RoundelImage b(ProductTile.RoundelImage roundelImage) {
        Intrinsics.h(roundelImage, "<this>");
        String str = roundelImage.f23660a;
        String str2 = roundelImage.b;
        au.com.woolworths.shop.graphql.type.RoundelImagePriority roundelImagePriority = roundelImage.c;
        Intrinsics.h(roundelImagePriority, "<this>");
        int iOrdinal = roundelImagePriority.ordinal();
        return new RoundelImage(str, str2, iOrdinal != 0 ? iOrdinal != 1 ? iOrdinal != 2 ? RoundelImagePriority.d : RoundelImagePriority.f : RoundelImagePriority.e : RoundelImagePriority.d);
    }
}
