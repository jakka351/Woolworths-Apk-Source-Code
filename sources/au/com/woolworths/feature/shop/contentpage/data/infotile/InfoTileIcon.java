package au.com.woolworths.feature.shop.contentpage.data.infotile;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/contentpage/data/infotile/InfoTileIcon;", "", "HostedIcon", "InfoTileBadge", "Lau/com/woolworths/feature/shop/contentpage/data/infotile/InfoTileIcon$HostedIcon;", "Lau/com/woolworths/feature/shop/contentpage/data/infotile/InfoTileIcon$InfoTileBadge;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface InfoTileIcon {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/contentpage/data/infotile/InfoTileIcon$HostedIcon;", "Lau/com/woolworths/feature/shop/contentpage/data/infotile/InfoTileIcon;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class HostedIcon implements InfoTileIcon {

        /* renamed from: a, reason: collision with root package name */
        public final String f7027a;

        public HostedIcon(String str) {
            this.f7027a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HostedIcon) && Intrinsics.c(this.f7027a, ((HostedIcon) obj).f7027a);
        }

        public final int hashCode() {
            return this.f7027a.hashCode();
        }

        public final String toString() {
            return a.h("HostedIcon(url=", this.f7027a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/contentpage/data/infotile/InfoTileIcon$InfoTileBadge;", "Lau/com/woolworths/feature/shop/contentpage/data/infotile/InfoTileIcon;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class InfoTileBadge implements InfoTileIcon {

        /* renamed from: a, reason: collision with root package name */
        public final String f7028a;

        public InfoTileBadge(String str) {
            this.f7028a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InfoTileBadge) && Intrinsics.c(this.f7028a, ((InfoTileBadge) obj).f7028a);
        }

        public final int hashCode() {
            return this.f7028a.hashCode();
        }

        public final String toString() {
            return a.h("InfoTileBadge(number=", this.f7028a, ")");
        }
    }
}
