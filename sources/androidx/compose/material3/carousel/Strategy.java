package androidx.compose.material3.carousel;

import android.support.v4.media.session.a;
import androidx.collection.MutableFloatList;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/material3/carousel/Strategy;", "", "Companion", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class Strategy {

    /* renamed from: a, reason: collision with root package name */
    public final KeylineList f1541a;
    public final Object b;
    public final Object c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final float i;
    public final MutableFloatList j;
    public final MutableFloatList k;
    public final boolean l;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material3/carousel/Strategy$Companion;", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        KeylineList keylineList = KeylineList.j;
        EmptyList emptyList = EmptyList.d;
        new Strategy(keylineList, emptyList, emptyList, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.List] */
    public Strategy(KeylineList keylineList, List list, List list2, float f, float f2, float f3, float f4) {
        this.f1541a = keylineList;
        this.b = list;
        this.c = list2;
        this.d = f;
        this.e = f2;
        this.f = f3;
        this.g = f4;
        float fMax = list.isEmpty() ? 0.0f : Math.max(((Keyline) CollectionsKt.D((List) CollectionsKt.O(list))).c - ((Keyline) CollectionsKt.D((List) CollectionsKt.D(list))).c, f3);
        this.h = fMax;
        float fMax2 = list2.isEmpty() ? 0.0f : Math.max(((Keyline) CollectionsKt.O((List) CollectionsKt.D(list2))).c - ((Keyline) CollectionsKt.O((List) CollectionsKt.O(list2))).c, f4);
        this.i = fMax2;
        this.j = StrategyKt.a(fMax, list, true);
        this.k = StrategyKt.a(fMax2, list2, false);
        this.l = (keylineList.d.isEmpty() || f == BitmapDescriptorFactory.HUE_RED || a() == BitmapDescriptorFactory.HUE_RED) ? false : true;
    }

    public final float a() {
        KeylineList keylineList = this.f1541a;
        Keyline keyline = (Keyline) CollectionsKt.J(keylineList.h, keylineList);
        if (keyline != null) {
            return keyline.f1538a;
        }
        throw new NoSuchElementException("All KeylineLists must have at least one focal keyline");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Strategy)) {
            return false;
        }
        boolean z = this.l;
        if (!z && !((Strategy) obj).l) {
            return true;
        }
        Strategy strategy = (Strategy) obj;
        return z == strategy.l && this.d == strategy.d && this.e == strategy.e && this.f == strategy.f && this.g == strategy.g && a() == strategy.a() && this.h == strategy.h && this.i == strategy.i && Intrinsics.c(this.j, strategy.j) && Intrinsics.c(this.k, strategy.k) && Intrinsics.c(this.f1541a, strategy.f1541a);
    }

    public final int hashCode() {
        boolean z = this.l;
        if (!z) {
            return Boolean.hashCode(z);
        }
        return this.f1541a.hashCode() + ((this.k.hashCode() + ((this.j.hashCode() + a.b(this.i, a.b(this.h, (Float.hashCode(a()) + a.b(this.g, a.b(this.f, a.b(this.e, a.b(this.d, Boolean.hashCode(z) * 31, 31), 31), 31), 31)) * 31, 31), 31)) * 31)) * 31);
    }
}
