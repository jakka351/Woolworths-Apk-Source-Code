package au.com.woolworths.feature.shop.ask.olive.ui.link;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lau/com/woolworths/feature/shop/ask/olive/ui/link/LinkAction;", "", "OpenInTab", "OpenAsIntent", "OpenUserLogin", "NoOverride", "Lau/com/woolworths/feature/shop/ask/olive/ui/link/LinkAction$NoOverride;", "Lau/com/woolworths/feature/shop/ask/olive/ui/link/LinkAction$OpenAsIntent;", "Lau/com/woolworths/feature/shop/ask/olive/ui/link/LinkAction$OpenInTab;", "Lau/com/woolworths/feature/shop/ask/olive/ui/link/LinkAction$OpenUserLogin;", "ask-olive_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class LinkAction {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/ask/olive/ui/link/LinkAction$NoOverride;", "Lau/com/woolworths/feature/shop/ask/olive/ui/link/LinkAction;", "ask-olive_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class NoOverride extends LinkAction {

        /* renamed from: a, reason: collision with root package name */
        public final String f6630a;

        public NoOverride(String info) {
            Intrinsics.h(info, "info");
            this.f6630a = info;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NoOverride) && Intrinsics.c(this.f6630a, ((NoOverride) obj).f6630a);
        }

        public final int hashCode() {
            return this.f6630a.hashCode();
        }

        public final String toString() {
            return a.h("NoOverride(info=", this.f6630a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/ask/olive/ui/link/LinkAction$OpenAsIntent;", "Lau/com/woolworths/feature/shop/ask/olive/ui/link/LinkAction;", "ask-olive_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OpenAsIntent extends LinkAction {

        /* renamed from: a, reason: collision with root package name */
        public final String f6631a;

        public OpenAsIntent(String url) {
            Intrinsics.h(url, "url");
            this.f6631a = url;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenAsIntent) && Intrinsics.c(this.f6631a, ((OpenAsIntent) obj).f6631a);
        }

        public final int hashCode() {
            return this.f6631a.hashCode();
        }

        public final String toString() {
            return a.h("OpenAsIntent(url=", this.f6631a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/ask/olive/ui/link/LinkAction$OpenInTab;", "Lau/com/woolworths/feature/shop/ask/olive/ui/link/LinkAction;", "ask-olive_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OpenInTab extends LinkAction {

        /* renamed from: a, reason: collision with root package name */
        public final String f6632a;

        public OpenInTab(String url) {
            Intrinsics.h(url, "url");
            this.f6632a = url;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenInTab) && Intrinsics.c(this.f6632a, ((OpenInTab) obj).f6632a);
        }

        public final int hashCode() {
            return this.f6632a.hashCode();
        }

        public final String toString() {
            return a.h("OpenInTab(url=", this.f6632a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/ask/olive/ui/link/LinkAction$OpenUserLogin;", "Lau/com/woolworths/feature/shop/ask/olive/ui/link/LinkAction;", "ask-olive_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OpenUserLogin extends LinkAction {
    }
}
