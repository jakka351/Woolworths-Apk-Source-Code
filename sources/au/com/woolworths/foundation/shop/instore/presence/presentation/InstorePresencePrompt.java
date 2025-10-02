package au.com.woolworths.foundation.shop.instore.presence.presentation;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.models.storelocator.StoreLocatorResult;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/foundation/shop/instore/presence/presentation/InstorePresencePrompt;", "", "PromptSwitchToInstoreMode", "PromptSwitchStore", "Lau/com/woolworths/foundation/shop/instore/presence/presentation/InstorePresencePrompt$PromptSwitchStore;", "Lau/com/woolworths/foundation/shop/instore/presence/presentation/InstorePresencePrompt$PromptSwitchToInstoreMode;", "instore-presence_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class InstorePresencePrompt {

    /* renamed from: a, reason: collision with root package name */
    public final StoreLocatorResult.Store f8750a;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/instore/presence/presentation/InstorePresencePrompt$PromptSwitchStore;", "Lau/com/woolworths/foundation/shop/instore/presence/presentation/InstorePresencePrompt;", "instore-presence_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PromptSwitchStore extends InstorePresencePrompt {
        public final StoreLocatorResult.Store b;

        public PromptSwitchStore(StoreLocatorResult.Store store) {
            super(store);
            this.b = store;
        }

        @Override // au.com.woolworths.foundation.shop.instore.presence.presentation.InstorePresencePrompt
        /* renamed from: a, reason: from getter */
        public final StoreLocatorResult.Store getF8750a() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PromptSwitchStore) && Intrinsics.c(this.b, ((PromptSwitchStore) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "PromptSwitchStore(store=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/instore/presence/presentation/InstorePresencePrompt$PromptSwitchToInstoreMode;", "Lau/com/woolworths/foundation/shop/instore/presence/presentation/InstorePresencePrompt;", "instore-presence_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PromptSwitchToInstoreMode extends InstorePresencePrompt {
        public final StoreLocatorResult.Store b;

        public PromptSwitchToInstoreMode(StoreLocatorResult.Store store) {
            super(store);
            this.b = store;
        }

        @Override // au.com.woolworths.foundation.shop.instore.presence.presentation.InstorePresencePrompt
        /* renamed from: a, reason: from getter */
        public final StoreLocatorResult.Store getF8750a() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PromptSwitchToInstoreMode) && Intrinsics.c(this.b, ((PromptSwitchToInstoreMode) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "PromptSwitchToInstoreMode(store=" + this.b + ")";
        }
    }

    public InstorePresencePrompt(StoreLocatorResult.Store store) {
        this.f8750a = store;
    }

    /* renamed from: a, reason: from getter */
    public StoreLocatorResult.Store getF8750a() {
        return this.f8750a;
    }
}
