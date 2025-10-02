package au.com.woolworths.feature.rewards.offers.data;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/data/BoostersHeaderAddOn;", "", "Text", "Cta", "Lau/com/woolworths/feature/rewards/offers/data/BoostersHeaderAddOn$Cta;", "Lau/com/woolworths/feature/rewards/offers/data/BoostersHeaderAddOn$Text;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface BoostersHeaderAddOn {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/data/BoostersHeaderAddOn$Cta;", "Lau/com/woolworths/feature/rewards/offers/data/BoostersHeaderAddOn;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Cta implements BoostersHeaderAddOn {

        /* renamed from: a, reason: collision with root package name */
        public final String f6270a;
        public final String b;

        public Cta(String text, String str) {
            Intrinsics.h(text, "text");
            this.f6270a = text;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Cta)) {
                return false;
            }
            Cta cta = (Cta) obj;
            return Intrinsics.c(this.f6270a, cta.f6270a) && Intrinsics.c(this.b, cta.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f6270a.hashCode() * 31);
        }

        public final String toString() {
            return a.j("Cta(text=", this.f6270a, ", actionUrl=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/data/BoostersHeaderAddOn$Text;", "Lau/com/woolworths/feature/rewards/offers/data/BoostersHeaderAddOn;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Text implements BoostersHeaderAddOn {

        /* renamed from: a, reason: collision with root package name */
        public final String f6271a;

        public Text(String str) {
            this.f6271a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Text) && Intrinsics.c(this.f6271a, ((Text) obj).f6271a);
        }

        public final int hashCode() {
            return this.f6271a.hashCode();
        }

        public final String toString() {
            return a.h("Text(text=", this.f6271a, ")");
        }
    }
}
