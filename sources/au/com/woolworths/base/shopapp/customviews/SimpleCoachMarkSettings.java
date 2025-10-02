package au.com.woolworths.base.shopapp.customviews;

import androidx.camera.core.impl.b;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.android.onesite.modules.customviews.coachmark.CoachMarkSettings;
import com.skydoves.balloon.ArrowOrientation;
import com.skydoves.balloon.ArrowOrientationRules;
import com.skydoves.balloon.overlay.BalloonOverlayRect;
import com.skydoves.balloon.overlay.BalloonOverlayShape;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/base/shopapp/customviews/SimpleCoachMarkSettings;", "Lau/com/woolworths/android/onesite/modules/customviews/coachmark/CoachMarkSettings;", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SimpleCoachMarkSettings implements CoachMarkSettings {

    /* renamed from: a, reason: collision with root package name */
    public final Text f4615a;
    public final ResText b;
    public final Text c;
    public final Integer d;
    public final int e;
    public final ArrowOrientationRules f;
    public final ArrowOrientation g;
    public final float h;
    public final boolean i;
    public final BalloonOverlayShape j;

    public SimpleCoachMarkSettings(Text text, ResText resText, ResText resText2, Integer num, int i, ArrowOrientationRules arrowOrientationRules, ArrowOrientation arrowOrientation, float f, boolean z, BalloonOverlayShape overlayShape) {
        Intrinsics.h(arrowOrientationRules, "arrowOrientationRules");
        Intrinsics.h(arrowOrientation, "arrowOrientation");
        Intrinsics.h(overlayShape, "overlayShape");
        this.f4615a = text;
        this.b = resText;
        this.c = resText2;
        this.d = num;
        this.e = i;
        this.f = arrowOrientationRules;
        this.g = arrowOrientation;
        this.h = f;
        this.i = z;
        this.j = overlayShape;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SimpleCoachMarkSettings)) {
            return false;
        }
        SimpleCoachMarkSettings simpleCoachMarkSettings = (SimpleCoachMarkSettings) obj;
        return Intrinsics.c(this.f4615a, simpleCoachMarkSettings.f4615a) && Intrinsics.c(this.b, simpleCoachMarkSettings.b) && Intrinsics.c(this.c, simpleCoachMarkSettings.c) && Intrinsics.c(this.d, simpleCoachMarkSettings.d) && this.e == simpleCoachMarkSettings.e && this.f == simpleCoachMarkSettings.f && this.g == simpleCoachMarkSettings.g && Float.compare(this.h, simpleCoachMarkSettings.h) == 0 && this.i == simpleCoachMarkSettings.i && Intrinsics.c(this.j, simpleCoachMarkSettings.j);
    }

    public final int hashCode() {
        Text text = this.f4615a;
        int iHashCode = (this.b.hashCode() + ((text == null ? 0 : text.hashCode()) * 31)) * 31;
        Text text2 = this.c;
        int iHashCode2 = (iHashCode + (text2 == null ? 0 : text2.hashCode())) * 31;
        Integer num = this.d;
        return this.j.hashCode() + b.e(android.support.v4.media.session.a.b(this.h, (this.g.hashCode() + ((this.f.hashCode() + b.a(this.e, (iHashCode2 + (num != null ? num.hashCode() : 0)) * 31, 31)) * 31)) * 31, 31), 31, this.i);
    }

    public final String toString() {
        return "SimpleCoachMarkSettings(titleText=" + this.f4615a + ", bodyText=" + this.b + ", ctaText=" + this.c + ", bodyTextColor=" + this.d + ", backgroundColorRes=" + this.e + ", arrowOrientationRules=" + this.f + ", arrowOrientation=" + this.g + ", arrowPosition=" + this.h + ", overlayEnabled=" + this.i + ", overlayShape=" + this.j + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SimpleCoachMarkSettings(ResText resText, ResText resText2, ResText resText3, Integer num, float f, BalloonOverlayShape balloonOverlayShape, int i) {
        ArrowOrientation arrowOrientation;
        Integer num2 = (i & 8) != 0 ? null : num;
        if ((i & 64) != 0) {
            arrowOrientation = ArrowOrientation.d;
        } else {
            arrowOrientation = ArrowOrientation.e;
        }
        this(resText, resText2, resText3, num2, 0, ArrowOrientationRules.d, arrowOrientation, (i & 128) != 0 ? 0.5f : f, true, (i & 512) != 0 ? BalloonOverlayRect.f19023a : balloonOverlayShape);
    }
}
