package ovh.plrapps.mapcompose.ui.paths.model;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Dp;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lovh/plrapps/mapcompose/ui/paths/model/PatternItem;", "", "Dash", "Dot", "Gap", "Lovh/plrapps/mapcompose/ui/paths/model/PatternItem$Dash;", "Lovh/plrapps/mapcompose/ui/paths/model/PatternItem$Dot;", "Lovh/plrapps/mapcompose/ui/paths/model/PatternItem$Gap;", "mapcompose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface PatternItem {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lovh/plrapps/mapcompose/ui/paths/model/PatternItem$Dash;", "Lovh/plrapps/mapcompose/ui/paths/model/PatternItem;", "mapcompose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Dash implements PatternItem {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Dash) && Dp.a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        }

        public final int hashCode() {
            return Float.hashCode(BitmapDescriptorFactory.HUE_RED);
        }

        public final String toString() {
            return a.h("Dash(length=", Dp.b(BitmapDescriptorFactory.HUE_RED), ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lovh/plrapps/mapcompose/ui/paths/model/PatternItem$Dot;", "Lovh/plrapps/mapcompose/ui/paths/model/PatternItem;", "mapcompose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Dot implements PatternItem {

        /* renamed from: a, reason: collision with root package name */
        public static final Dot f26951a = new Dot();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Dot);
        }

        public final int hashCode() {
            return 1357819684;
        }

        public final String toString() {
            return "Dot";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lovh/plrapps/mapcompose/ui/paths/model/PatternItem$Gap;", "Lovh/plrapps/mapcompose/ui/paths/model/PatternItem;", "mapcompose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Gap implements PatternItem {

        /* renamed from: a, reason: collision with root package name */
        public final float f26952a;

        public Gap(float f) {
            this.f26952a = f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Gap) && Dp.a(this.f26952a, ((Gap) obj).f26952a);
        }

        public final int hashCode() {
            return Float.hashCode(this.f26952a);
        }

        public final String toString() {
            return a.h("Gap(length=", Dp.b(this.f26952a), ")");
        }
    }
}
