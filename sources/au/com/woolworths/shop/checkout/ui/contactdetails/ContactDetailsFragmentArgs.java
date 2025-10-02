package au.com.woolworths.shop.checkout.ui.contactdetails;

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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/contactdetails/ContactDetailsFragmentArgs;", "Landroidx/navigation/NavArgs;", "Companion", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ContactDetailsFragmentArgs implements NavArgs {

    /* renamed from: a, reason: collision with root package name */
    public final ContactDetailsExtras f10728a;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/contactdetails/ContactDetailsFragmentArgs$Companion;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public ContactDetailsFragmentArgs(ContactDetailsExtras contactDetailsExtras) {
        this.f10728a = contactDetailsExtras;
    }

    @JvmStatic
    @NotNull
    public static final ContactDetailsFragmentArgs fromBundle(@NotNull Bundle bundle) {
        Intrinsics.h(bundle, "bundle");
        bundle.setClassLoader(ContactDetailsFragmentArgs.class.getClassLoader());
        if (!bundle.containsKey("extras")) {
            throw new IllegalArgumentException("Required argument \"extras\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(ContactDetailsExtras.class) && !Serializable.class.isAssignableFrom(ContactDetailsExtras.class)) {
            throw new UnsupportedOperationException(ContactDetailsExtras.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        ContactDetailsExtras contactDetailsExtras = (ContactDetailsExtras) bundle.get("extras");
        if (contactDetailsExtras != null) {
            return new ContactDetailsFragmentArgs(contactDetailsExtras);
        }
        throw new IllegalArgumentException("Argument \"extras\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ContactDetailsFragmentArgs) && Intrinsics.c(this.f10728a, ((ContactDetailsFragmentArgs) obj).f10728a);
    }

    public final int hashCode() {
        return this.f10728a.hashCode();
    }

    public final String toString() {
        return "ContactDetailsFragmentArgs(extras=" + this.f10728a + ")";
    }
}
