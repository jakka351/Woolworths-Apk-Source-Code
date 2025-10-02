package com.woolworths.scanlibrary.util.beacon;

import android.support.v4.media.session.a;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/util/beacon/Beacon;", "", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class Beacon {

    /* renamed from: a, reason: collision with root package name */
    public final String f21361a;
    public final int b;

    public Beacon(String str, int i) {
        this.f21361a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Beacon)) {
            return false;
        }
        Beacon beacon = (Beacon) obj;
        return Intrinsics.c(this.f21361a, beacon.f21361a) && this.b == beacon.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.f21361a.hashCode() * 31);
    }

    public final String toString() {
        return a.p("Beacon(address=", this.b, this.f21361a, ", rssi=", ")");
    }
}
