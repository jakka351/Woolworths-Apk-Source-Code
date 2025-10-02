package com.woolworths.scanlibrary.models.product;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÆ\u0003J>\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0004HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\nR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\n¨\u0006\u001c"}, d2 = {"Lcom/woolworths/scanlibrary/models/product/Offers;", "", "enddate", "threshold", "", TextBundle.TEXT_ENTRY, "startdate", "<init>", "(Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/Object;Ljava/lang/Object;)V", "getEnddate", "()Ljava/lang/Object;", "getThreshold", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getText", "getStartdate", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/Object;Ljava/lang/Object;)Lcom/woolworths/scanlibrary/models/product/Offers;", "equals", "", "other", "hashCode", "toString", "", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class Offers {
    public static final int $stable = 8;

    @SerializedName("enddate")
    @Nullable
    private final Object enddate;

    @SerializedName("startdate")
    @Nullable
    private final Object startdate;

    @SerializedName(TextBundle.TEXT_ENTRY)
    @Nullable
    private final Object text;

    @SerializedName("threshold")
    @Nullable
    private final Integer threshold;

    public Offers() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ Offers copy$default(Offers offers, Object obj, Integer num, Object obj2, Object obj3, int i, Object obj4) {
        if ((i & 1) != 0) {
            obj = offers.enddate;
        }
        if ((i & 2) != 0) {
            num = offers.threshold;
        }
        if ((i & 4) != 0) {
            obj2 = offers.text;
        }
        if ((i & 8) != 0) {
            obj3 = offers.startdate;
        }
        return offers.copy(obj, num, obj2, obj3);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Object getEnddate() {
        return this.enddate;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Integer getThreshold() {
        return this.threshold;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Object getText() {
        return this.text;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Object getStartdate() {
        return this.startdate;
    }

    @NotNull
    public final Offers copy(@Nullable Object enddate, @Nullable Integer threshold, @Nullable Object text, @Nullable Object startdate) {
        return new Offers(enddate, threshold, text, startdate);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Offers)) {
            return false;
        }
        Offers offers = (Offers) other;
        return Intrinsics.c(this.enddate, offers.enddate) && Intrinsics.c(this.threshold, offers.threshold) && Intrinsics.c(this.text, offers.text) && Intrinsics.c(this.startdate, offers.startdate);
    }

    @Nullable
    public final Object getEnddate() {
        return this.enddate;
    }

    @Nullable
    public final Object getStartdate() {
        return this.startdate;
    }

    @Nullable
    public final Object getText() {
        return this.text;
    }

    @Nullable
    public final Integer getThreshold() {
        return this.threshold;
    }

    public int hashCode() {
        Object obj = this.enddate;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Integer num = this.threshold;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Object obj2 = this.text;
        int iHashCode3 = (iHashCode2 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.startdate;
        return iHashCode3 + (obj3 != null ? obj3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "Offers(enddate=" + this.enddate + ", threshold=" + this.threshold + ", text=" + this.text + ", startdate=" + this.startdate + ")";
    }

    public Offers(@Nullable Object obj, @Nullable Integer num, @Nullable Object obj2, @Nullable Object obj3) {
        this.enddate = obj;
        this.threshold = num;
        this.text = obj2;
        this.startdate = obj3;
    }

    public /* synthetic */ Offers(Object obj, Integer num, Object obj2, Object obj3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : obj, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : obj2, (i & 8) != 0 ? null : obj3);
    }
}
