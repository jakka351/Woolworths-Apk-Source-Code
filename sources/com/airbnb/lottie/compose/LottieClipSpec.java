package com.airbnb.lottie.compose;

import androidx.compose.runtime.internal.StabilityInferred;
import com.airbnb.lottie.LottieComposition;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/airbnb/lottie/compose/LottieClipSpec;", "", "Frame", "Marker", "Markers", "Progress", "Lcom/airbnb/lottie/compose/LottieClipSpec$Frame;", "Lcom/airbnb/lottie/compose/LottieClipSpec$Marker;", "Lcom/airbnb/lottie/compose/LottieClipSpec$Markers;", "Lcom/airbnb/lottie/compose/LottieClipSpec$Progress;", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class LottieClipSpec {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/airbnb/lottie/compose/LottieClipSpec$Frame;", "Lcom/airbnb/lottie/compose/LottieClipSpec;", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Frame extends LottieClipSpec {

        /* renamed from: a, reason: collision with root package name */
        public final Integer f13376a;
        public final Integer b;
        public final Integer c;

        public Frame(Integer num, Integer num2) {
            this.f13376a = num;
            this.b = num2;
            this.c = num2;
        }

        @Override // com.airbnb.lottie.compose.LottieClipSpec
        public final float a(LottieComposition composition) {
            Intrinsics.h(composition, "composition");
            if (this.c == null) {
                return 1.0f;
            }
            return RangesKt.b(r1.intValue() / composition.m, BitmapDescriptorFactory.HUE_RED, 1.0f);
        }

        @Override // com.airbnb.lottie.compose.LottieClipSpec
        public final float b(LottieComposition composition) {
            Intrinsics.h(composition, "composition");
            return this.f13376a == null ? BitmapDescriptorFactory.HUE_RED : RangesKt.b(r1.intValue() / composition.m, BitmapDescriptorFactory.HUE_RED, 1.0f);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Frame)) {
                return false;
            }
            Frame frame = (Frame) obj;
            return this.f13376a.equals(frame.f13376a) && this.b.equals(frame.b);
        }

        public final int hashCode() {
            return Boolean.hashCode(true) + ((this.b.hashCode() + (this.f13376a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "Frame(min=" + this.f13376a + ", max=" + this.b + ", maxInclusive=true)";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/airbnb/lottie/compose/LottieClipSpec$Marker;", "Lcom/airbnb/lottie/compose/LottieClipSpec;", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Marker extends LottieClipSpec {
        @Override // com.airbnb.lottie.compose.LottieClipSpec
        public final float a(LottieComposition composition) {
            Intrinsics.h(composition, "composition");
            com.airbnb.lottie.model.Marker markerD = composition.d(null);
            if (markerD == null) {
                return 1.0f;
            }
            return RangesKt.b((markerD.b + markerD.c) / composition.m, BitmapDescriptorFactory.HUE_RED, 1.0f);
        }

        @Override // com.airbnb.lottie.compose.LottieClipSpec
        public final float b(LottieComposition composition) {
            Intrinsics.h(composition, "composition");
            com.airbnb.lottie.model.Marker markerD = composition.d(null);
            return RangesKt.b((markerD != null ? markerD.b : 0.0f) / composition.m, BitmapDescriptorFactory.HUE_RED, 1.0f);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Marker);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "Marker(marker=null)";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/airbnb/lottie/compose/LottieClipSpec$Markers;", "Lcom/airbnb/lottie/compose/LottieClipSpec;", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Markers extends LottieClipSpec {
        @Override // com.airbnb.lottie.compose.LottieClipSpec
        public final float a(LottieComposition composition) {
            Intrinsics.h(composition, "composition");
            return 1.0f;
        }

        @Override // com.airbnb.lottie.compose.LottieClipSpec
        public final float b(LottieComposition composition) {
            Intrinsics.h(composition, "composition");
            return BitmapDescriptorFactory.HUE_RED;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Markers);
        }

        public final int hashCode() {
            return Boolean.hashCode(false);
        }

        public final String toString() {
            return "Markers(min=null, max=null, maxInclusive=false)";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/airbnb/lottie/compose/LottieClipSpec$Progress;", "Lcom/airbnb/lottie/compose/LottieClipSpec;", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Progress extends LottieClipSpec {
        @Override // com.airbnb.lottie.compose.LottieClipSpec
        public final float a(LottieComposition composition) {
            Intrinsics.h(composition, "composition");
            return BitmapDescriptorFactory.HUE_RED;
        }

        @Override // com.airbnb.lottie.compose.LottieClipSpec
        public final float b(LottieComposition composition) {
            Intrinsics.h(composition, "composition");
            return BitmapDescriptorFactory.HUE_RED;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Progress) && Float.compare(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == 0 && Float.compare(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(BitmapDescriptorFactory.HUE_RED) + (Float.hashCode(BitmapDescriptorFactory.HUE_RED) * 31);
        }

        public final String toString() {
            return "Progress(min=0.0, max=0.0)";
        }
    }

    public abstract float a(LottieComposition lottieComposition);

    public abstract float b(LottieComposition lottieComposition);
}
