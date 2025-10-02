package au.com.woolworths.shop.checkout.ui.fulfilmentwindows;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.navigation.NavArgs;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/fulfilmentwindows/FulfilmentWindowsFragmentArgs;", "Landroidx/navigation/NavArgs;", "Companion", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class FulfilmentWindowsFragmentArgs implements NavArgs {

    /* renamed from: a, reason: collision with root package name */
    public final FulfilmentWindowSource f10790a;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/fulfilmentwindows/FulfilmentWindowsFragmentArgs$Companion;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public FulfilmentWindowsFragmentArgs(FulfilmentWindowSource fulfilmentWindowSource) {
        this.f10790a = fulfilmentWindowSource;
    }

    @JvmStatic
    @NotNull
    public static final FulfilmentWindowsFragmentArgs fromBundle(@NotNull Bundle bundle) {
        FulfilmentWindowSource fulfilmentWindowSource;
        Intrinsics.h(bundle, "bundle");
        bundle.setClassLoader(FulfilmentWindowsFragmentArgs.class.getClassLoader());
        if (!bundle.containsKey("fulfilmentWindowSource")) {
            fulfilmentWindowSource = FulfilmentWindowSource.f;
        } else {
            if (!Parcelable.class.isAssignableFrom(FulfilmentWindowSource.class) && !Serializable.class.isAssignableFrom(FulfilmentWindowSource.class)) {
                throw new UnsupportedOperationException(FulfilmentWindowSource.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            fulfilmentWindowSource = (FulfilmentWindowSource) bundle.get("fulfilmentWindowSource");
            if (fulfilmentWindowSource == null) {
                throw new IllegalArgumentException("Argument \"fulfilmentWindowSource\" is marked as non-null but was passed a null value.");
            }
        }
        return new FulfilmentWindowsFragmentArgs(fulfilmentWindowSource);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FulfilmentWindowsFragmentArgs) && this.f10790a == ((FulfilmentWindowsFragmentArgs) obj).f10790a;
    }

    public final int hashCode() {
        return this.f10790a.hashCode();
    }

    public final String toString() {
        return "FulfilmentWindowsFragmentArgs(fulfilmentWindowSource=" + this.f10790a + ")";
    }
}
