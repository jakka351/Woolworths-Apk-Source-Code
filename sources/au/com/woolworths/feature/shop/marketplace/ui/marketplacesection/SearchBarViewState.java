package au.com.woolworths.feature.shop.marketplace.ui.marketplacesection;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lau/com/woolworths/feature/shop/marketplace/ui/marketplacesection/SearchBarViewState;", "", "Active", "Inactive", "Hidden", "Lau/com/woolworths/feature/shop/marketplace/ui/marketplacesection/SearchBarViewState$Active;", "Lau/com/woolworths/feature/shop/marketplace/ui/marketplacesection/SearchBarViewState$Hidden;", "Lau/com/woolworths/feature/shop/marketplace/ui/marketplacesection/SearchBarViewState$Inactive;", "marketplace_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class SearchBarViewState {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7499a;
    public final Boolean b;
    public final boolean c;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/marketplace/ui/marketplacesection/SearchBarViewState$Active;", "Lau/com/woolworths/feature/shop/marketplace/ui/marketplacesection/SearchBarViewState;", "marketplace_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Active extends SearchBarViewState {
        public static final Active d = new Active(true, Boolean.FALSE, false);
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/marketplace/ui/marketplacesection/SearchBarViewState$Hidden;", "Lau/com/woolworths/feature/shop/marketplace/ui/marketplacesection/SearchBarViewState;", "marketplace_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Hidden extends SearchBarViewState {
        public static final Hidden d = new Hidden(false, null, false);
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/marketplace/ui/marketplacesection/SearchBarViewState$Inactive;", "Lau/com/woolworths/feature/shop/marketplace/ui/marketplacesection/SearchBarViewState;", "marketplace_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Inactive extends SearchBarViewState {
        public static final Inactive d = new Inactive(true, Boolean.TRUE, true);
    }

    public SearchBarViewState(boolean z, Boolean bool, boolean z2) {
        this.f7499a = z;
        this.b = bool;
        this.c = z2;
    }
}
