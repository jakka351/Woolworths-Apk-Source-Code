package au.com.woolworths.feature.shop.modeselector.model;

import au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode;
import au.com.woolworths.android.onesite.modules.collectionmode.common.DeliveryModeVariant;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"mode-selector_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ShoppingModeSelectorMutationContentKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[ShoppingModeVariant.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ShoppingModeVariant shoppingModeVariant = ShoppingModeVariant.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ShoppingModeVariant shoppingModeVariant2 = ShoppingModeVariant.d;
                iArr[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                ShoppingModeVariant shoppingModeVariant3 = ShoppingModeVariant.d;
                iArr[2] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                ShoppingModeVariant shoppingModeVariant4 = ShoppingModeVariant.d;
                iArr[5] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                ShoppingModeVariant shoppingModeVariant5 = ShoppingModeVariant.d;
                iArr[4] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr2 = new int[ShoppingModeButtonType.values().length];
            try {
                iArr2[1] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                ShoppingModeButtonType shoppingModeButtonType = ShoppingModeButtonType.d;
                iArr2[2] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                ShoppingModeButtonType shoppingModeButtonType2 = ShoppingModeButtonType.d;
                iArr2[3] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                ShoppingModeButtonType shoppingModeButtonType3 = ShoppingModeButtonType.d;
                iArr2[0] = 4;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public static final CollectionMode a(ShoppingModeVariant shoppingModeVariant) {
        int iOrdinal = shoppingModeVariant.ordinal();
        if (iOrdinal == 0) {
            return null;
        }
        if (iOrdinal == 1) {
            return new CollectionMode.Delivery(DeliveryModeVariant.DeliveryStandard);
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return new CollectionMode.Delivery(DeliveryModeVariant.DeliveryNow);
            }
            if (iOrdinal == 4) {
                return CollectionMode.InStore.d;
            }
            if (iOrdinal != 5) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return CollectionMode.PickUp.d;
    }
}
