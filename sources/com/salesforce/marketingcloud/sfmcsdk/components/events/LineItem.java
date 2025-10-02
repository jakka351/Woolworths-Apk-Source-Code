package com.salesforce.marketingcloud.sfmcsdk.components.events;

import android.support.v4.media.session.a;
import androidx.camera.core.impl.b;
import com.salesforce.marketingcloud.storage.db.k;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.EmptyMap;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BM\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0006HÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0018J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u000bHÆ\u0003JZ\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010%J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020\u0006HÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001R&\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0012\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006+"}, d2 = {"Lcom/salesforce/marketingcloud/sfmcsdk/components/events/LineItem;", "", "catalogObjectType", "", "catalogObjectId", "quantity", "", "price", "", "currency", k.a.h, "", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Double;Ljava/lang/String;Ljava/util/Map;)V", "getAttributes", "()Ljava/util/Map;", "setAttributes", "(Ljava/util/Map;)V", "getCatalogObjectId", "()Ljava/lang/String;", "getCatalogObjectType", "getCurrency", "setCurrency", "(Ljava/lang/String;)V", "getPrice", "()Ljava/lang/Double;", "setPrice", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "getQuantity", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Double;Ljava/lang/String;Ljava/util/Map;)Lcom/salesforce/marketingcloud/sfmcsdk/components/events/LineItem;", "equals", "", "other", "hashCode", "toString", "sfmcsdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class LineItem {

    @NotNull
    private Map<String, ? extends Object> attributes;

    @NotNull
    private final String catalogObjectId;

    @NotNull
    private final String catalogObjectType;

    @Nullable
    private String currency;

    @Nullable
    private Double price;
    private final int quantity;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LineItem(@NotNull String catalogObjectType, @NotNull String catalogObjectId, int i) {
        this(catalogObjectType, catalogObjectId, i, null, null, null, 56, null);
        Intrinsics.h(catalogObjectType, "catalogObjectType");
        Intrinsics.h(catalogObjectId, "catalogObjectId");
    }

    public static /* synthetic */ LineItem copy$default(LineItem lineItem, String str, String str2, int i, Double d, String str3, Map map, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = lineItem.catalogObjectType;
        }
        if ((i2 & 2) != 0) {
            str2 = lineItem.catalogObjectId;
        }
        if ((i2 & 4) != 0) {
            i = lineItem.quantity;
        }
        if ((i2 & 8) != 0) {
            d = lineItem.price;
        }
        if ((i2 & 16) != 0) {
            str3 = lineItem.currency;
        }
        if ((i2 & 32) != 0) {
            map = lineItem.attributes;
        }
        String str4 = str3;
        Map map2 = map;
        return lineItem.copy(str, str2, i, d, str4, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getCatalogObjectType() {
        return this.catalogObjectType;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getCatalogObjectId() {
        return this.catalogObjectId;
    }

    /* renamed from: component3, reason: from getter */
    public final int getQuantity() {
        return this.quantity;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Double getPrice() {
        return this.price;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @NotNull
    public final Map<String, Object> component6() {
        return this.attributes;
    }

    @NotNull
    public final LineItem copy(@NotNull String catalogObjectType, @NotNull String catalogObjectId, int quantity, @Nullable Double price, @Nullable String currency, @NotNull Map<String, ? extends Object> attributes) {
        Intrinsics.h(catalogObjectType, "catalogObjectType");
        Intrinsics.h(catalogObjectId, "catalogObjectId");
        Intrinsics.h(attributes, "attributes");
        return new LineItem(catalogObjectType, catalogObjectId, quantity, price, currency, attributes);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LineItem)) {
            return false;
        }
        LineItem lineItem = (LineItem) other;
        return Intrinsics.c(this.catalogObjectType, lineItem.catalogObjectType) && Intrinsics.c(this.catalogObjectId, lineItem.catalogObjectId) && this.quantity == lineItem.quantity && Intrinsics.c(this.price, lineItem.price) && Intrinsics.c(this.currency, lineItem.currency) && Intrinsics.c(this.attributes, lineItem.attributes);
    }

    @NotNull
    public final Map<String, Object> getAttributes() {
        return this.attributes;
    }

    @NotNull
    public final String getCatalogObjectId() {
        return this.catalogObjectId;
    }

    @NotNull
    public final String getCatalogObjectType() {
        return this.catalogObjectType;
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final Double getPrice() {
        return this.price;
    }

    public final int getQuantity() {
        return this.quantity;
    }

    public int hashCode() {
        int iA = b.a(this.quantity, b.c(this.catalogObjectType.hashCode() * 31, 31, this.catalogObjectId), 31);
        Double d = this.price;
        int iHashCode = (iA + (d == null ? 0 : d.hashCode())) * 31;
        String str = this.currency;
        return this.attributes.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final void setAttributes(@NotNull Map<String, ? extends Object> map) {
        Intrinsics.h(map, "<set-?>");
        this.attributes = map;
    }

    public final void setCurrency(@Nullable String str) {
        this.currency = str;
    }

    public final void setPrice(@Nullable Double d) {
        this.price = d;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("LineItem(catalogObjectType=");
        sb.append(this.catalogObjectType);
        sb.append(", catalogObjectId=");
        sb.append(this.catalogObjectId);
        sb.append(", quantity=");
        sb.append(this.quantity);
        sb.append(", price=");
        sb.append(this.price);
        sb.append(", currency=");
        sb.append(this.currency);
        sb.append(", attributes=");
        return a.u(sb, this.attributes, ')');
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LineItem(@NotNull String catalogObjectType, @NotNull String catalogObjectId, int i, @Nullable Double d) {
        this(catalogObjectType, catalogObjectId, i, d, null, null, 48, null);
        Intrinsics.h(catalogObjectType, "catalogObjectType");
        Intrinsics.h(catalogObjectId, "catalogObjectId");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LineItem(@NotNull String catalogObjectType, @NotNull String catalogObjectId, int i, @Nullable Double d, @Nullable String str) {
        this(catalogObjectType, catalogObjectId, i, d, str, null, 32, null);
        Intrinsics.h(catalogObjectType, "catalogObjectType");
        Intrinsics.h(catalogObjectId, "catalogObjectId");
    }

    @JvmOverloads
    public LineItem(@NotNull String catalogObjectType, @NotNull String catalogObjectId, int i, @Nullable Double d, @Nullable String str, @NotNull Map<String, ? extends Object> attributes) {
        Intrinsics.h(catalogObjectType, "catalogObjectType");
        Intrinsics.h(catalogObjectId, "catalogObjectId");
        Intrinsics.h(attributes, "attributes");
        this.catalogObjectType = catalogObjectType;
        this.catalogObjectId = catalogObjectId;
        this.quantity = i;
        this.price = d;
        this.currency = str;
        this.attributes = attributes;
    }

    public /* synthetic */ LineItem(String str, String str2, int i, Double d, String str3, Map map, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, i, (i2 & 8) != 0 ? null : d, (i2 & 16) != 0 ? null : str3, (i2 & 32) != 0 ? EmptyMap.d : map);
    }
}
