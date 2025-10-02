package me.oriient.ui.contentview.models;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087@\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0000H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u00020\u000e2\b\u0010\n\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0019"}, d2 = {"Lme/oriient/ui/contentview/models/PixelsInViewWidth;", "", "value", "", "constructor-impl", "(F)F", "getValue", "()F", "compareTo", "", "other", "compareTo-qAQk9oQ", "(FF)I", "equals", "", "", "equals-impl", "(FLjava/lang/Object;)Z", "hashCode", "hashCode-impl", "(F)I", "toString", "", "toString-impl", "(F)Ljava/lang/String;", "ui-content-view_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
/* loaded from: classes8.dex */
public final class PixelsInViewWidth implements Comparable<PixelsInViewWidth> {
    private final float value;

    private /* synthetic */ PixelsInViewWidth(float f) {
        this.value = f;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ PixelsInViewWidth m589boximpl(float f) {
        return new PixelsInViewWidth(f);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static float m591constructorimpl(float f) {
        return f;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m592equalsimpl(float f, Object obj) {
        return (obj instanceof PixelsInViewWidth) && Float.compare(f, ((PixelsInViewWidth) obj).m597unboximpl()) == 0;
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m593equalsimpl0(float f, float f2) {
        return Float.compare(f, f2) == 0;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m594hashCodeimpl(float f) {
        return Float.hashCode(f);
    }

    @NotNull
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m595toStringimpl(float f) {
        return "PixelsInViewWidth(value=" + f + ')';
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(PixelsInViewWidth pixelsInViewWidth) {
        return m596compareToqAQk9oQ(pixelsInViewWidth.m597unboximpl());
    }

    /* renamed from: compareTo-qAQk9oQ, reason: not valid java name */
    public int m596compareToqAQk9oQ(float f) {
        return m590compareToqAQk9oQ(this.value, f);
    }

    public boolean equals(Object obj) {
        return m592equalsimpl(this.value, obj);
    }

    public final float getValue() {
        return this.value;
    }

    public int hashCode() {
        return m594hashCodeimpl(this.value);
    }

    @NotNull
    public String toString() {
        return m595toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ float m597unboximpl() {
        return this.value;
    }

    /* renamed from: compareTo-qAQk9oQ, reason: not valid java name */
    public static int m590compareToqAQk9oQ(float f, float f2) {
        return Float.compare(f, f2);
    }
}
