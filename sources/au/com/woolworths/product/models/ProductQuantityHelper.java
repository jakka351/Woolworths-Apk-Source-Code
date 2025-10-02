package au.com.woolworths.product.models;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import java.text.DecimalFormat;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0007H\u0007J(\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0007J\u001c\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007H\u0007J\u0018\u0010\u0011\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bH\u0007J\u001e\u0010\u0011\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bJ\u0018\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000bH\u0007J\u001e\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lau/com/woolworths/product/models/ProductQuantityHelper;", "", "<init>", "()V", "decimalFormat", "Ljava/text/DecimalFormat;", "getQuantityLabel", "", "quantityIndex", "", "quantityIncrement", "", "unitLabel", "minimum", "increment", "quantity", "", "getIndexFromQuantity", "getQuantityFromIndex", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProductQuantityHelper {

    @NotNull
    public static final ProductQuantityHelper INSTANCE = new ProductQuantityHelper();

    @NotNull
    private static final DecimalFormat decimalFormat = new DecimalFormat("0.##");
    public static final int $stable = 8;

    private ProductQuantityHelper() {
    }

    @JvmStatic
    @JvmOverloads
    @NotNull
    public static final String getQuantityLabel(float f) {
        return getQuantityLabel$default(f, null, 2, null);
    }

    public static /* synthetic */ String getQuantityLabel$default(float f, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        return getQuantityLabel(f, str);
    }

    @Deprecated
    public final int getIndexFromQuantity(double quantity, double increment) {
        return MathKt.a(quantity / increment) - 1;
    }

    @Deprecated
    public final double getQuantityFromIndex(int quantityIndex, double increment) {
        return (quantityIndex + 1) * increment;
    }

    public final int getIndexFromQuantity(double quantity, double minimum, double increment) {
        return MathKt.a((quantity - minimum) / increment);
    }

    public final double getQuantityFromIndex(int quantityIndex, double minimum, double increment) {
        return (increment * quantityIndex) + minimum;
    }

    @Deprecated
    @NotNull
    public final String getQuantityLabel(int quantityIndex, double quantityIncrement, @Nullable String unitLabel) {
        return getQuantityLabel((float) getQuantityFromIndex(quantityIndex, quantityIncrement), unitLabel);
    }

    @NotNull
    public final String getQuantityLabel(int quantityIndex, double minimum, double increment, @Nullable String unitLabel) {
        return getQuantityLabel((float) getQuantityFromIndex(quantityIndex, minimum, increment), unitLabel);
    }

    @JvmStatic
    @JvmOverloads
    @NotNull
    public static final String getQuantityLabel(float quantity, @Nullable String unitLabel) {
        String str = decimalFormat.format(Float.valueOf(quantity));
        if (unitLabel != null && !StringsKt.D(unitLabel)) {
            return b.o(str, " ", unitLabel);
        }
        Intrinsics.e(str);
        return str;
    }
}
