package nl.dionsegijn.konfetti.core;

import android.support.v4.media.session.a;
import androidx.camera.core.impl.b;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import nl.dionsegijn.konfetti.core.emitter.EmitterConfig;
import nl.dionsegijn.konfetti.core.models.Shape;
import nl.dionsegijn.konfetti.core.models.Size;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lnl/dionsegijn/konfetti/core/Party;", "", "core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class Party {

    /* renamed from: a, reason: collision with root package name */
    public final int f26635a;
    public final int b;
    public final float c;
    public final float d;
    public final List e;
    public final List f;
    public final List g;
    public final long h;
    public final boolean i;
    public final Position j;
    public final Rotation k;
    public final EmitterConfig l;

    public Party(float f, List list, ArrayList arrayList, List list2, Position position, EmitterConfig emitterConfig, int i) {
        int i2 = (i & 1) != 0 ? 0 : SubsamplingScaleImageView.ORIENTATION_270;
        list = (i & 32) != 0 ? CollectionsKt.R(Size.c, Size.d, Size.e) : list;
        list2 = (i & 128) != 0 ? CollectionsKt.R(Shape.Square.f26646a, Shape.Circle.f26644a) : list2;
        Rotation rotation = new Rotation();
        this.f26635a = i2;
        this.b = 360;
        this.c = f;
        this.d = 0.9f;
        this.e = list;
        this.f = arrayList;
        this.g = list2;
        this.h = 1500L;
        this.i = true;
        this.j = position;
        this.k = rotation;
        this.l = emitterConfig;
    }

    public final boolean equals(Object obj) {
        Object objValueOf = Float.valueOf(BitmapDescriptorFactory.HUE_RED);
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Party)) {
            return false;
        }
        Party party = (Party) obj;
        return this.f26635a == party.f26635a && this.b == party.b && Float.valueOf(this.c).equals(Float.valueOf(party.c)) && objValueOf.equals(objValueOf) && Float.valueOf(this.d).equals(Float.valueOf(party.d)) && Intrinsics.c(this.e, party.e) && Intrinsics.c(this.f, party.f) && Intrinsics.c(this.g, party.g) && this.h == party.h && this.i == party.i && Intrinsics.c(this.j, party.j) && Intrinsics.c(this.k, party.k) && Intrinsics.c(this.l, party.l);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int iB = b.b(b.d(b.d(b.d(a.b(this.d, a.b(BitmapDescriptorFactory.HUE_RED, a.b(this.c, b.a(this.b, Integer.hashCode(this.f26635a) * 31, 31), 31), 31), 31), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
        boolean z = this.i;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return this.l.hashCode() + ((this.k.hashCode() + b.a(0, (this.j.hashCode() + ((iB + i) * 31)) * 31, 31)) * 31);
    }

    public final String toString() {
        return "Party(angle=" + this.f26635a + ", spread=" + this.b + ", speed=" + this.c + ", maxSpeed=0.0, damping=" + this.d + ", size=" + this.e + ", colors=" + this.f + ", shapes=" + this.g + ", timeToLive=" + this.h + ", fadeOutEnabled=" + this.i + ", position=" + this.j + ", delay=0, rotation=" + this.k + ", emitter=" + this.l + ')';
    }
}
