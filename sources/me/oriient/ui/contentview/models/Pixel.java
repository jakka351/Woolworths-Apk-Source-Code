package me.oriient.ui.contentview.models;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.ui.contentview.utils.ExtensionsKt;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0000H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\r\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0086\u0002ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0086\u0002ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\fJ\u001b\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0000H\u0086\u0002ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\fJ\u001e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007H\u0086\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0014H\u0080\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u001e\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007H\u0086\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0013J\u001e\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0002H\u0086\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\fJ\u001e\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0014H\u0080\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u0016J\u001b\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0086\u0002ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\fJ\u0016\u0010\u001c\u001a\u00020\u0000H\u0086\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u0005J\u000f\u0010 \u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010#\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010(\u001a\u00020%2\b\u0010\u0006\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010+\u0088\u0001\u0003\u0092\u0001\u00020\u0002\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006,"}, d2 = {"Lme/oriient/ui/contentview/models/Pixel;", "", "", "value", "constructor-impl", "(F)F", "other", "", "compareTo-K-UIv1s", "(FF)I", "compareTo", "plus-e-6v528", "(FF)F", "plus", "minus-e-6v528", "minus", "div-K-UIv1s", "div", "div-RDCH-ks", "(FI)F", "Lme/oriient/ui/contentview/models/a;", "div-RDCH-ks$ui_content_view_publishRelease", "(FLme/oriient/ui/contentview/models/a;)F", "times-RDCH-ks", "times", "times-RDCH-ks$ui_content_view_publishRelease", "times-e-6v528", "unaryMinus-XFKo8e8", "unaryMinus", "", "toString-impl", "(F)Ljava/lang/String;", "toString", "hashCode-impl", "(F)I", "hashCode", "", "", "equals-impl", "(FLjava/lang/Object;)Z", "equals", "F", "getValue", "()F", "ui-content-view_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
/* loaded from: classes8.dex */
public final class Pixel implements Comparable<Pixel> {
    private final float value;

    private /* synthetic */ Pixel(float f) {
        this.value = f;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Pixel m533boximpl(float f) {
        return new Pixel(f);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static float m535constructorimpl(float f) {
        return f;
    }

    /* renamed from: div-K-UIv1s, reason: not valid java name */
    public static final float m536divKUIv1s(float f, float f2) {
        return f / f2;
    }

    /* renamed from: div-RDCH-ks, reason: not valid java name */
    public static final float m537divRDCHks(float f, int i) {
        return ExtensionsKt.getPx(f / i);
    }

    /* renamed from: div-RDCH-ks$ui_content_view_publishRelease, reason: not valid java name */
    public static final float m538divRDCHks$ui_content_view_publishRelease(float f, @NotNull a other) {
        Intrinsics.h(other, "other");
        return ExtensionsKt.getPx(f / other.a());
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m539equalsimpl(float f, Object obj) {
        return (obj instanceof Pixel) && Float.compare(f, ((Pixel) obj).m551unboximpl()) == 0;
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m540equalsimpl0(float f, float f2) {
        return Float.compare(f, f2) == 0;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m541hashCodeimpl(float f) {
        return Float.hashCode(f);
    }

    /* renamed from: minus-e-6v528, reason: not valid java name */
    public static final float m542minuse6v528(float f, float f2) {
        return ExtensionsKt.getPx(f - f2);
    }

    /* renamed from: plus-e-6v528, reason: not valid java name */
    public static final float m543pluse6v528(float f, float f2) {
        return ExtensionsKt.getPx(f + f2);
    }

    /* renamed from: times-RDCH-ks, reason: not valid java name */
    public static final float m545timesRDCHks(float f, int i) {
        return ExtensionsKt.getPx(f * i);
    }

    /* renamed from: times-RDCH-ks$ui_content_view_publishRelease, reason: not valid java name */
    public static final float m546timesRDCHks$ui_content_view_publishRelease(float f, @NotNull a other) {
        Intrinsics.h(other, "other");
        return ExtensionsKt.getPx(other.a() * f);
    }

    /* renamed from: times-e-6v528, reason: not valid java name */
    public static final float m547timese6v528(float f, float f2) {
        return ExtensionsKt.getPx(f * f2);
    }

    @NotNull
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m548toStringimpl(float f) {
        return "Pixel(value=" + f + ')';
    }

    /* renamed from: unaryMinus-XFKo8e8, reason: not valid java name */
    public static final float m549unaryMinusXFKo8e8(float f) {
        return ExtensionsKt.getPx(-f);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Pixel pixel) {
        return m550compareToKUIv1s(pixel.m551unboximpl());
    }

    /* renamed from: compareTo-K-UIv1s, reason: not valid java name */
    public int m550compareToKUIv1s(float f) {
        return m534compareToKUIv1s(this.value, f);
    }

    public boolean equals(Object obj) {
        return m539equalsimpl(this.value, obj);
    }

    public final float getValue() {
        return this.value;
    }

    public int hashCode() {
        return m541hashCodeimpl(this.value);
    }

    @NotNull
    public String toString() {
        return m548toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ float m551unboximpl() {
        return this.value;
    }

    /* renamed from: compareTo-K-UIv1s, reason: not valid java name */
    public static int m534compareToKUIv1s(float f, float f2) {
        return Float.compare(f, f2);
    }

    /* renamed from: times-RDCH-ks, reason: not valid java name */
    public static final float m544timesRDCHks(float f, float f2) {
        return ExtensionsKt.getPx(f * f2);
    }
}
