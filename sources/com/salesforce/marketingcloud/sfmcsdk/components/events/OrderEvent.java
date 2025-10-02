package com.salesforce.marketingcloud.sfmcsdk.components.events;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0017\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0007\n\u000b\f\r\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lcom/salesforce/marketingcloud/sfmcsdk/components/events/OrderEvent;", "Lcom/salesforce/marketingcloud/sfmcsdk/components/events/EngagementEvent;", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "order", "Lcom/salesforce/marketingcloud/sfmcsdk/components/events/Order;", "(Ljava/lang/String;Lcom/salesforce/marketingcloud/sfmcsdk/components/events/Order;)V", "getOrder", "()Lcom/salesforce/marketingcloud/sfmcsdk/components/events/Order;", "Companion", "Lcom/salesforce/marketingcloud/sfmcsdk/components/events/PurchaseOrderEvent;", "Lcom/salesforce/marketingcloud/sfmcsdk/components/events/PreorderEvent;", "Lcom/salesforce/marketingcloud/sfmcsdk/components/events/CancelOrderEvent;", "Lcom/salesforce/marketingcloud/sfmcsdk/components/events/ShipOrderEvent;", "Lcom/salesforce/marketingcloud/sfmcsdk/components/events/DeliverOrderEvent;", "Lcom/salesforce/marketingcloud/sfmcsdk/components/events/ReturnOrderEvent;", "Lcom/salesforce/marketingcloud/sfmcsdk/components/events/ExchangeOrderEvent;", "sfmcsdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class OrderEvent extends EngagementEvent {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final Order order;

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0013"}, d2 = {"Lcom/salesforce/marketingcloud/sfmcsdk/components/events/OrderEvent$Companion;", "", "()V", "cancel", "Lcom/salesforce/marketingcloud/sfmcsdk/components/events/CancelOrderEvent;", "order", "Lcom/salesforce/marketingcloud/sfmcsdk/components/events/Order;", "deliver", "Lcom/salesforce/marketingcloud/sfmcsdk/components/events/DeliverOrderEvent;", "exchange", "Lcom/salesforce/marketingcloud/sfmcsdk/components/events/ExchangeOrderEvent;", "preorder", "Lcom/salesforce/marketingcloud/sfmcsdk/components/events/PreorderEvent;", "purchase", "Lcom/salesforce/marketingcloud/sfmcsdk/components/events/PurchaseOrderEvent;", "returnOrder", "Lcom/salesforce/marketingcloud/sfmcsdk/components/events/ReturnOrderEvent;", "ship", "Lcom/salesforce/marketingcloud/sfmcsdk/components/events/ShipOrderEvent;", "sfmcsdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @Nullable
        public final CancelOrderEvent cancel(@NotNull Order order) {
            Intrinsics.h(order, "order");
            try {
                return new CancelOrderEvent(order);
            } catch (Exception unused) {
                return null;
            }
        }

        @JvmStatic
        @Nullable
        public final DeliverOrderEvent deliver(@NotNull Order order) {
            Intrinsics.h(order, "order");
            try {
                return new DeliverOrderEvent(order);
            } catch (Exception unused) {
                return null;
            }
        }

        @JvmStatic
        @Nullable
        public final ExchangeOrderEvent exchange(@NotNull Order order) {
            Intrinsics.h(order, "order");
            try {
                return new ExchangeOrderEvent(order);
            } catch (Exception unused) {
                return null;
            }
        }

        @JvmStatic
        @Nullable
        public final PreorderEvent preorder(@NotNull Order order) {
            Intrinsics.h(order, "order");
            try {
                return new PreorderEvent(order);
            } catch (Exception unused) {
                return null;
            }
        }

        @JvmStatic
        @Nullable
        public final PurchaseOrderEvent purchase(@NotNull Order order) {
            Intrinsics.h(order, "order");
            try {
                return new PurchaseOrderEvent(order);
            } catch (Exception unused) {
                return null;
            }
        }

        @JvmStatic
        @Nullable
        public final ReturnOrderEvent returnOrder(@NotNull Order order) {
            Intrinsics.h(order, "order");
            try {
                return new ReturnOrderEvent(order);
            } catch (Exception unused) {
                return null;
            }
        }

        @JvmStatic
        @Nullable
        public final ShipOrderEvent ship(@NotNull Order order) {
            Intrinsics.h(order, "order");
            try {
                return new ShipOrderEvent(order);
            } catch (Exception unused) {
                return null;
            }
        }

        private Companion() {
        }
    }

    public /* synthetic */ OrderEvent(String str, Order order, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, order);
    }

    @JvmStatic
    @Nullable
    public static final CancelOrderEvent cancel(@NotNull Order order) {
        return INSTANCE.cancel(order);
    }

    @JvmStatic
    @Nullable
    public static final DeliverOrderEvent deliver(@NotNull Order order) {
        return INSTANCE.deliver(order);
    }

    @JvmStatic
    @Nullable
    public static final ExchangeOrderEvent exchange(@NotNull Order order) {
        return INSTANCE.exchange(order);
    }

    @JvmStatic
    @Nullable
    public static final PreorderEvent preorder(@NotNull Order order) {
        return INSTANCE.preorder(order);
    }

    @JvmStatic
    @Nullable
    public static final PurchaseOrderEvent purchase(@NotNull Order order) {
        return INSTANCE.purchase(order);
    }

    @JvmStatic
    @Nullable
    public static final ReturnOrderEvent returnOrder(@NotNull Order order) {
        return INSTANCE.returnOrder(order);
    }

    @JvmStatic
    @Nullable
    public static final ShipOrderEvent ship(@NotNull Order order) {
        return INSTANCE.ship(order);
    }

    @NotNull
    public final Order getOrder() {
        return this.order;
    }

    private OrderEvent(String str, Order order) {
        super(str, null);
        this.order = order;
    }
}
