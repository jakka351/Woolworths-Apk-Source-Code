package au.com.woolworths.shop.product.details.navigation;

import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/shop/product/details/navigation/AboutEverydayMarket;", "", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes4.dex */
final class AboutEverydayMarket {

    @NotNull
    public static final AboutEverydayMarket INSTANCE = new AboutEverydayMarket();

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ Object f12620a = LazyKt.a(LazyThreadSafetyMode.d, new a(0));

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @NotNull
    public final KSerializer<AboutEverydayMarket> serializer() {
        return (KSerializer) f12620a.getD();
    }
}
