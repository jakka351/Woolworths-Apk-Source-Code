package au.com.woolworths.product.models;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fBK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u000fJV\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u00032\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\nHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\rR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\rR\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006 "}, d2 = {"Lau/com/woolworths/product/models/ProductCardConfig;", "", "isInstoreMode", "", "isInlineLabelEnabled", "isListsAllowed", "isWatchlistEnabled", "isCheckOtherStoresButtonAllowed", "isInMappedStore", "maxLinesForUnitPriceText", "", "<init>", "(ZZZZZZLjava/lang/Integer;)V", "()Z", "getMaxLinesForUnitPriceText", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(ZZZZZZLjava/lang/Integer;)Lau/com/woolworths/product/models/ProductCardConfig;", "equals", "other", "hashCode", "toString", "", "Companion", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ProductCardConfig {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final ProductCardConfig Default = new ProductCardConfig(false, false, true, false, false, false, null);
    private final boolean isCheckOtherStoresButtonAllowed;
    private final boolean isInMappedStore;
    private final boolean isInlineLabelEnabled;
    private final boolean isInstoreMode;
    private final boolean isListsAllowed;
    private final boolean isWatchlistEnabled;

    @Nullable
    private final Integer maxLinesForUnitPriceText;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lau/com/woolworths/product/models/ProductCardConfig$Companion;", "", "<init>", "()V", "Default", "Lau/com/woolworths/product/models/ProductCardConfig;", "getDefault", "()Lau/com/woolworths/product/models/ProductCardConfig;", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ProductCardConfig getDefault() {
            return ProductCardConfig.Default;
        }

        private Companion() {
        }
    }

    public ProductCardConfig(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, @Nullable Integer num) {
        this.isInstoreMode = z;
        this.isInlineLabelEnabled = z2;
        this.isListsAllowed = z3;
        this.isWatchlistEnabled = z4;
        this.isCheckOtherStoresButtonAllowed = z5;
        this.isInMappedStore = z6;
        this.maxLinesForUnitPriceText = num;
    }

    public static /* synthetic */ ProductCardConfig copy$default(ProductCardConfig productCardConfig, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            z = productCardConfig.isInstoreMode;
        }
        if ((i & 2) != 0) {
            z2 = productCardConfig.isInlineLabelEnabled;
        }
        if ((i & 4) != 0) {
            z3 = productCardConfig.isListsAllowed;
        }
        if ((i & 8) != 0) {
            z4 = productCardConfig.isWatchlistEnabled;
        }
        if ((i & 16) != 0) {
            z5 = productCardConfig.isCheckOtherStoresButtonAllowed;
        }
        if ((i & 32) != 0) {
            z6 = productCardConfig.isInMappedStore;
        }
        if ((i & 64) != 0) {
            num = productCardConfig.maxLinesForUnitPriceText;
        }
        boolean z7 = z6;
        Integer num2 = num;
        boolean z8 = z5;
        boolean z9 = z3;
        return productCardConfig.copy(z, z2, z9, z4, z8, z7, num2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsInstoreMode() {
        return this.isInstoreMode;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsInlineLabelEnabled() {
        return this.isInlineLabelEnabled;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsListsAllowed() {
        return this.isListsAllowed;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsWatchlistEnabled() {
        return this.isWatchlistEnabled;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsCheckOtherStoresButtonAllowed() {
        return this.isCheckOtherStoresButtonAllowed;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsInMappedStore() {
        return this.isInMappedStore;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final Integer getMaxLinesForUnitPriceText() {
        return this.maxLinesForUnitPriceText;
    }

    @NotNull
    public final ProductCardConfig copy(boolean isInstoreMode, boolean isInlineLabelEnabled, boolean isListsAllowed, boolean isWatchlistEnabled, boolean isCheckOtherStoresButtonAllowed, boolean isInMappedStore, @Nullable Integer maxLinesForUnitPriceText) {
        return new ProductCardConfig(isInstoreMode, isInlineLabelEnabled, isListsAllowed, isWatchlistEnabled, isCheckOtherStoresButtonAllowed, isInMappedStore, maxLinesForUnitPriceText);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductCardConfig)) {
            return false;
        }
        ProductCardConfig productCardConfig = (ProductCardConfig) other;
        return this.isInstoreMode == productCardConfig.isInstoreMode && this.isInlineLabelEnabled == productCardConfig.isInlineLabelEnabled && this.isListsAllowed == productCardConfig.isListsAllowed && this.isWatchlistEnabled == productCardConfig.isWatchlistEnabled && this.isCheckOtherStoresButtonAllowed == productCardConfig.isCheckOtherStoresButtonAllowed && this.isInMappedStore == productCardConfig.isInMappedStore && Intrinsics.c(this.maxLinesForUnitPriceText, productCardConfig.maxLinesForUnitPriceText);
    }

    @Nullable
    public final Integer getMaxLinesForUnitPriceText() {
        return this.maxLinesForUnitPriceText;
    }

    public int hashCode() {
        int iE = b.e(b.e(b.e(b.e(b.e(Boolean.hashCode(this.isInstoreMode) * 31, 31, this.isInlineLabelEnabled), 31, this.isListsAllowed), 31, this.isWatchlistEnabled), 31, this.isCheckOtherStoresButtonAllowed), 31, this.isInMappedStore);
        Integer num = this.maxLinesForUnitPriceText;
        return iE + (num == null ? 0 : num.hashCode());
    }

    public final boolean isCheckOtherStoresButtonAllowed() {
        return this.isCheckOtherStoresButtonAllowed;
    }

    public final boolean isInMappedStore() {
        return this.isInMappedStore;
    }

    public final boolean isInlineLabelEnabled() {
        return this.isInlineLabelEnabled;
    }

    public final boolean isInstoreMode() {
        return this.isInstoreMode;
    }

    public final boolean isListsAllowed() {
        return this.isListsAllowed;
    }

    public final boolean isWatchlistEnabled() {
        return this.isWatchlistEnabled;
    }

    @NotNull
    public String toString() {
        boolean z = this.isInstoreMode;
        boolean z2 = this.isInlineLabelEnabled;
        boolean z3 = this.isListsAllowed;
        boolean z4 = this.isWatchlistEnabled;
        boolean z5 = this.isCheckOtherStoresButtonAllowed;
        boolean z6 = this.isInMappedStore;
        Integer num = this.maxLinesForUnitPriceText;
        StringBuilder sbV = b.v("ProductCardConfig(isInstoreMode=", ", isInlineLabelEnabled=", ", isListsAllowed=", z, z2);
        a.D(sbV, z3, ", isWatchlistEnabled=", z4, ", isCheckOtherStoresButtonAllowed=");
        a.D(sbV, z5, ", isInMappedStore=", z6, ", maxLinesForUnitPriceText=");
        return a.p(sbV, num, ")");
    }

    public /* synthetic */ ProductCardConfig(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, z2, (i & 4) != 0 ? true : z3, (i & 8) != 0 ? false : z4, (i & 16) != 0 ? false : z5, (i & 32) != 0 ? false : z6, (i & 64) != 0 ? null : num);
    }
}
