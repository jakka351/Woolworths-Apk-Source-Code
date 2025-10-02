package com.skydoves.balloon.vectortext;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/skydoves/balloon/vectortext/VectorTextViewParams;", "", "balloon_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final /* data */ class VectorTextViewParams {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f19025a;
    public final Integer b;
    public final Integer c;
    public final Integer d;
    public boolean e;
    public final CharSequence f;
    public final Integer g;
    public final Integer h;
    public final Integer i;
    public final Integer j;
    public final Integer k;
    public final Integer l;
    public final Integer m;
    public final Integer n;

    public VectorTextViewParams(Integer num, Integer num2, Integer num3, Integer num4, String str, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, int i) {
        num = (i & 1) != 0 ? null : num;
        Integer num13 = (i & 2) != 0 ? null : num2;
        Integer num14 = (i & 4) != 0 ? null : num3;
        Integer num15 = (i & 8) != 0 ? null : num4;
        String contentDescription = (i & 512) != 0 ? "" : str;
        Integer num16 = (i & 1024) != 0 ? null : num5;
        Integer num17 = (i & 2048) != 0 ? null : num6;
        Integer num18 = (i & 4096) != 0 ? null : num7;
        Integer num19 = (i & 8192) != 0 ? null : num8;
        Integer num20 = (32768 & i) != 0 ? null : num10;
        Integer num21 = (65536 & i) != 0 ? null : num11;
        Integer num22 = (i & 131072) == 0 ? num12 : null;
        Intrinsics.h(contentDescription, "contentDescription");
        this.f19025a = num;
        this.b = num13;
        this.c = num14;
        this.d = num15;
        this.e = false;
        this.f = contentDescription;
        this.g = num16;
        this.h = num17;
        this.i = num18;
        this.j = num19;
        this.k = num9;
        this.l = num20;
        this.m = num21;
        this.n = num22;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VectorTextViewParams)) {
            return false;
        }
        VectorTextViewParams vectorTextViewParams = (VectorTextViewParams) obj;
        return Intrinsics.c(this.f19025a, vectorTextViewParams.f19025a) && Intrinsics.c(this.b, vectorTextViewParams.b) && Intrinsics.c(this.c, vectorTextViewParams.c) && Intrinsics.c(this.d, vectorTextViewParams.d) && this.e == vectorTextViewParams.e && this.f.equals(vectorTextViewParams.f) && Intrinsics.c(this.g, vectorTextViewParams.g) && Intrinsics.c(this.h, vectorTextViewParams.h) && Intrinsics.c(this.i, vectorTextViewParams.i) && Intrinsics.c(this.j, vectorTextViewParams.j) && Intrinsics.c(this.k, vectorTextViewParams.k) && Intrinsics.c(this.l, vectorTextViewParams.l) && Intrinsics.c(this.m, vectorTextViewParams.m) && Intrinsics.c(this.n, vectorTextViewParams.n);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        Integer num = this.f19025a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.c;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.d;
        int iHashCode4 = (iHashCode3 + (num4 == null ? 0 : num4.hashCode())) * 28629151;
        boolean z = this.e;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int iHashCode5 = (this.f.hashCode() + ((iHashCode4 + i) * 31)) * 31;
        Integer num5 = this.g;
        int iHashCode6 = (iHashCode5 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.h;
        int iHashCode7 = (iHashCode6 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.i;
        int iHashCode8 = (iHashCode7 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.j;
        int iHashCode9 = (iHashCode8 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.k;
        int iHashCode10 = (iHashCode9 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Integer num10 = this.l;
        int iHashCode11 = (iHashCode10 + (num10 == null ? 0 : num10.hashCode())) * 31;
        Integer num11 = this.m;
        int iHashCode12 = (iHashCode11 + (num11 == null ? 0 : num11.hashCode())) * 31;
        Integer num12 = this.n;
        return iHashCode12 + (num12 != null ? num12.hashCode() : 0);
    }

    public final String toString() {
        return "VectorTextViewParams(drawableStartRes=" + this.f19025a + ", drawableEndRes=" + this.b + ", drawableBottomRes=" + this.c + ", drawableTopRes=" + this.d + ", drawableStart=null, drawableEnd=null, drawableBottom=null, drawableTop=null, isRtlLayout=" + this.e + ", contentDescription=" + ((Object) this.f) + ", compoundDrawablePadding=" + this.g + ", iconWidth=" + this.h + ", iconHeight=" + this.i + ", compoundDrawablePaddingRes=" + this.j + ", tintColor=" + this.k + ", widthRes=" + this.l + ", heightRes=" + this.m + ", squareSizeRes=" + this.n + ')';
    }
}
