package com.salesforce.marketingcloud.sfmcsdk.components.events;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u001d\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/salesforce/marketingcloud/sfmcsdk/components/events/CartEvent;", "Lcom/salesforce/marketingcloud/sfmcsdk/components/events/EngagementEvent;", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "lineItems", "", "Lcom/salesforce/marketingcloud/sfmcsdk/components/events/LineItem;", "(Ljava/lang/String;Ljava/util/List;)V", "getLineItems", "()Ljava/util/List;", "Companion", "Lcom/salesforce/marketingcloud/sfmcsdk/components/events/AddToCartEvent;", "Lcom/salesforce/marketingcloud/sfmcsdk/components/events/RemoveFromCartEvent;", "Lcom/salesforce/marketingcloud/sfmcsdk/components/events/ReplaceCartEvent;", "sfmcsdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class CartEvent extends EngagementEvent {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final List<LineItem> lineItems;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0018\u0010\t\u001a\u0004\u0018\u00010\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\fH\u0007¨\u0006\r"}, d2 = {"Lcom/salesforce/marketingcloud/sfmcsdk/components/events/CartEvent$Companion;", "", "()V", "add", "Lcom/salesforce/marketingcloud/sfmcsdk/components/events/AddToCartEvent;", "lineItem", "Lcom/salesforce/marketingcloud/sfmcsdk/components/events/LineItem;", "remove", "Lcom/salesforce/marketingcloud/sfmcsdk/components/events/RemoveFromCartEvent;", "replace", "Lcom/salesforce/marketingcloud/sfmcsdk/components/events/ReplaceCartEvent;", "lineItems", "", "sfmcsdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @Nullable
        public final AddToCartEvent add(@NotNull LineItem lineItem) {
            Intrinsics.h(lineItem, "lineItem");
            try {
                return new AddToCartEvent(lineItem);
            } catch (Exception unused) {
                return null;
            }
        }

        @JvmStatic
        @Nullable
        public final RemoveFromCartEvent remove(@NotNull LineItem lineItem) {
            Intrinsics.h(lineItem, "lineItem");
            try {
                return new RemoveFromCartEvent(lineItem);
            } catch (Exception unused) {
                return null;
            }
        }

        @JvmStatic
        @Nullable
        public final ReplaceCartEvent replace(@NotNull List<LineItem> lineItems) {
            Intrinsics.h(lineItems, "lineItems");
            try {
                return new ReplaceCartEvent(lineItems);
            } catch (Exception unused) {
                return null;
            }
        }

        private Companion() {
        }
    }

    public /* synthetic */ CartEvent(String str, List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list);
    }

    @JvmStatic
    @Nullable
    public static final AddToCartEvent add(@NotNull LineItem lineItem) {
        return INSTANCE.add(lineItem);
    }

    @JvmStatic
    @Nullable
    public static final RemoveFromCartEvent remove(@NotNull LineItem lineItem) {
        return INSTANCE.remove(lineItem);
    }

    @JvmStatic
    @Nullable
    public static final ReplaceCartEvent replace(@NotNull List<LineItem> list) {
        return INSTANCE.replace(list);
    }

    @NotNull
    public final List<LineItem> getLineItems() {
        return this.lineItems;
    }

    private CartEvent(String str, List<LineItem> list) {
        super(str, null);
        this.lineItems = list;
    }
}
