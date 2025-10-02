package com.braintreepayments.api;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/braintreepayments/api/PostalAddress;", "Landroid/os/Parcelable;", "Companion", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes4.dex */
public class PostalAddress implements Parcelable {

    @JvmField
    @NotNull
    public static final Parcelable.Creator<PostalAddress> CREATOR = new PostalAddress$Companion$CREATOR$1();
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/braintreepayments/api/PostalAddress$Companion;", "", "Landroid/os/Parcelable$Creator;", "Lcom/braintreepayments/api/PostalAddress;", "CREATOR", "Landroid/os/Parcelable$Creator;", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return this.d + '\n' + this.f + '\n' + this.g + '\n' + this.h + ", " + this.i + '\n' + this.j + ' ' + this.l;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.f);
        dest.writeString(this.g);
        dest.writeString(this.h);
        dest.writeString(this.i);
        dest.writeString(this.j);
        dest.writeString(this.l);
        dest.writeString(this.d);
        dest.writeString(this.e);
        dest.writeString(this.k);
    }
}
