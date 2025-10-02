package com.salesforce.marketingcloud.analytics;

import android.os.Parcel;
import android.os.Parcelable;
import com.salesforce.marketingcloud.MCKeep;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;

@MCKeep
@Parcelize
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001fB\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\n\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003J\u0019\u0010\f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0015\u001a\u00020\u000fHÖ\u0001J\u0019\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000fHÖ\u0001R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u0006\u0010\u0005¨\u0006 "}, d2 = {"Lcom/salesforce/marketingcloud/analytics/PiCart;", "Landroid/os/Parcelable;", "", "Lcom/salesforce/marketingcloud/analytics/PiCartItem;", "-deprecated_cartItems", "()Ljava/util/List;", "cartItems", "Lorg/json/JSONArray;", "-toJson", "()Lorg/json/JSONArray;", "toJson", "component1", "copy", "", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "Ljava/util/List;", "<init>", "(Ljava/util/List;)V", "Companion", "a", "sdk_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension
/* loaded from: classes6.dex */
public final /* data */ class PiCart implements Parcelable {

    @NotNull
    private final List<PiCartItem> cartItems;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<PiCart> CREATOR = new b();

    /* renamed from: com.salesforce.marketingcloud.analytics.PiCart$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @Deprecated
        @JvmStatic
        @NotNull
        public final PiCart a(@NotNull List<PiCartItem> cartItems) {
            Intrinsics.h(cartItems, "cartItems");
            return new PiCart(cartItems);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final class c extends Lambda implements Function0<String> {

        /* renamed from: a, reason: collision with root package name */
        public static final c f16839a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to convert List<PiCartItem> into JSONArray for PiCart payload.";
        }
    }

    public PiCart(@NotNull List<PiCartItem> cartItems) {
        Intrinsics.h(cartItems, "cartItems");
        this.cartItems = cartItems;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PiCart copy$default(PiCart piCart, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = piCart.cartItems;
        }
        return piCart.copy(list);
    }

    @Deprecated
    @JvmStatic
    @NotNull
    public static final PiCart create(@NotNull List<PiCartItem> list) {
        return INSTANCE.a(list);
    }

    @Deprecated
    @JvmName
    @NotNull
    /* renamed from: -deprecated_cartItems, reason: not valid java name */
    public final List<PiCartItem> m84deprecated_cartItems() {
        return this.cartItems;
    }

    @JvmName
    @NotNull
    /* renamed from: -toJson, reason: not valid java name */
    public final JSONArray m85toJson() {
        JSONArray jSONArray = new JSONArray();
        try {
            Iterator<T> it = this.cartItems.iterator();
            while (it.hasNext()) {
                jSONArray.put(((PiCartItem) it.next()).m90toJson());
            }
            return jSONArray;
        } catch (JSONException e) {
            com.salesforce.marketingcloud.g gVar = com.salesforce.marketingcloud.g.f16896a;
            String TAG = AnalyticsManager.TAG;
            Intrinsics.g(TAG, "TAG");
            gVar.b(TAG, e, c.f16839a);
            return jSONArray;
        }
    }

    @JvmName
    @NotNull
    public final List<PiCartItem> cartItems() {
        return this.cartItems;
    }

    @NotNull
    public final List<PiCartItem> component1() {
        return this.cartItems;
    }

    @NotNull
    public final PiCart copy(@NotNull List<PiCartItem> cartItems) {
        Intrinsics.h(cartItems, "cartItems");
        return new PiCart(cartItems);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PiCart) && Intrinsics.c(this.cartItems, ((PiCart) other).cartItems);
    }

    public int hashCode() {
        return this.cartItems.hashCode();
    }

    @NotNull
    public String toString() {
        return au.com.woolworths.android.onesite.a.l("PiCart(cartItems=", ")", this.cartItems);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.h(parcel, "out");
        Iterator itU = au.com.woolworths.android.onesite.a.u(this.cartItems, parcel);
        while (itU.hasNext()) {
            ((PiCartItem) itU.next()).writeToParcel(parcel, flags);
        }
    }

    public static final class b implements Parcelable.Creator<PiCart> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PiCart createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = androidx.compose.ui.input.pointer.a.e(PiCartItem.CREATOR, parcel, arrayList, iE, 1);
            }
            return new PiCart(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PiCart[] newArray(int i) {
            return new PiCart[i];
        }
    }
}
